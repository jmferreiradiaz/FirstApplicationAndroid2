package com.example.firstapplication.ui.changecolor

import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.firstapplication.R

class ChangeColorFragment : Fragment() {

    companion object {
        fun newInstance() = ChangeColorFragment()
        private const val TAG = "ChangeColorFragment"
    }

    private lateinit var viewModel: ChangeColorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_changecolor, container, false)

        val btnBlue = view.findViewById<Button>(R.id.btnAzul)
        val btnRed = view.findViewById<Button>(R.id.btnRojo)
        val btnGreen = view.findViewById<Button>(R.id.btnVerde)

        btnBlue.setOnClickListener { onClickChangeColor(btnBlue, view) }
        btnRed.setOnClickListener {onClickChangeColor(btnRed, view) }
        btnGreen.setOnClickListener {onClickChangeColor(btnGreen, view) }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChangeColorViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun onClickChangeColor(btn: Button, view: View) {
        val text = view.findViewById<EditText>(R.id.editTextTexto)
        if(btn.text.equals("AZUL")) text.setTextColor(Color.BLUE);
        if(btn.text.equals("ROJO")) text.setTextColor(Color.RED);
        if(btn.text.equals("VERDE")) text.setTextColor(Color.GREEN);
    }
}