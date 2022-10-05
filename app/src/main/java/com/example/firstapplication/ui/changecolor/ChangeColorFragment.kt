package com.example.firstapplication.ui.changecolor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBindings
import com.example.firstapplication.R
import com.example.firstapplication.databinding.FragmentChangecolorBinding
import com.example.firstapplication.ui.home.ChangeColorViewModel

class ChangeColorFragment : Fragment() {

    private var _binding: FragmentChangecolorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(ChangeColorViewModel::class.java)

        _binding = FragmentChangecolorBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        // Página changecolor
        /*val btnBlue = getView().findViewById<Button>(R.id.btnAzul)
        btnBlue.setOnClickListener {onClickChangeColor(btnBlue) }

        val btnRed = findViewById<Button>(R.id.btnAzul)
        btnRed.setOnClickListener {onClickChangeColor(btnRed) }

        val btnGreen = findViewById<Button>(R.id.btnAzul)
        btnBlue.setOnClickListener {onClickChangeColor(btnGreen) }*/

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    //  Eventos en la página Changecolor
    /*private fun onClickChangeColor(btn: Button) {
        val text = findViewById<EditText>(R.id.editTextTexto)
        text.setTextColor(btn.textColors);
    }*/

}