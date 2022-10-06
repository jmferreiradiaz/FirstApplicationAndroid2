package com.example.firstapplication.ui.align

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstapplication.R

class AlignTextFragment : Fragment() {

    companion object {
        fun newInstance() = AlignTextFragment()
    }

    private lateinit var viewModel: AlignTextViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_aligntext, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AlignTextViewModel::class.java)
        // TODO: Use the ViewModel
    }

}