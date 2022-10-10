package com.example.firstapplication.ui.align

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.firstapplication.R

class AlignTextFragment : Fragment() {

    companion object {
        fun newInstance() = AlignTextFragment()
        private const val TAG = "AlignTextFragment"
    }

    private lateinit var viewModel: AlignTextViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_aligntext, container, false)

        val inputText = view.findViewById<EditText>(R.id.inputTextToAlign)
        val text = view.findViewById<TextView>(R.id.textToAlign)

        val btnLeft = view.findViewById<Button>(R.id.btnLeft)
        val btnRight = view.findViewById<Button>(R.id.btnRight)
        btnLeft.setOnClickListener { onClickAlignChange(text, btnLeft, inputText) }
        btnRight.setOnClickListener { onClickAlignChange(text, btnRight, inputText) }


        inputText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) { }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) { }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                text.text = s
            }
        })

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AlignTextViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun onClickAlignChange(text: TextView, btn: Button, input: EditText) {
        if(btn.id == R.id.btnLeft) text.textAlignment = 2
        else if(btn.id == R.id.btnRight) text.textAlignment = 3
        text.text = input.text
    }

}