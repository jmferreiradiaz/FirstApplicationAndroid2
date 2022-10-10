package com.example.firstapplication.ui.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.helper.widget.Carousel
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.firstapplication.R
import com.example.firstapplication.databinding.FragmentGalleryBinding
import com.example.firstapplication.ui.changecolor.ChangeColorFragment

class GalleryFragment : Fragment() {

    companion object {
        private const val TAG = "GalleryFragment"
    }

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        val carousel = view.findViewById<Carousel>(R.id.carousel)
        val btnPrevious = view.findViewById<Button>(R.id.btnPrevious)
        val btnNext = view.findViewById<Button>(R.id.btnNext)

        btnPrevious.setOnClickListener { onClickChangeImage(btnPrevious, view, carousel) }
        btnNext.setOnClickListener { onClickChangeImage(btnNext, view, carousel) }

        carousel.setAdapter(object : Carousel.Adapter {
            override fun count(): Int {
                return 5
            }

            override fun populate(view: View, index: Int) {
                // need to implement this to populate the view at the given index
            }

            override fun onNewItem(index: Int) {
                // called when an item is set
            }
        })

        return view
    }

    private fun onClickChangeImage(btn: Button, view: View, carousel: Carousel) {
        Log.d(TAG, "Entra")
        if(btn.id == R.id.btnNext) carousel
        else if(btn.id == R.id.btnPrevious) carousel.nextFocusDownId
    }
}