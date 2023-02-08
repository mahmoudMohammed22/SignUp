package com.example.taskapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.taskapp.databinding.FragmentDetailsBinding
import com.example.taskapp.databinding.FragmentLoginBinding

class DetailsFragment : Fragment() {

    private lateinit var binding : FragmentDetailsBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_details,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Back.setOnClickListener {
            val action = DetailsFragmentDirections.actionDetailsFragmentToLoginFragment()
            findNavController().navigate(action)
        }
    }


}