package com.example.taskapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.taskapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding : FragmentLoginBinding

    private val viewModel : ItemViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = viewModel

        binding.signUp.setOnClickListener {
            if (entryVaild()){


                val action = LoginFragmentDirections.actionLoginFragmentToDetailsFragment()
                findNavController().navigate(action)
            }

        }
    }


    fun entryVaild():Boolean{
        return viewModel.isVaildEntry(
            binding.editFirstName.text.toString(),binding.editLastName.text.toString(),
            binding.editEmail.text.toString(),binding.editPhoneNumber.text.toString()
        )
    }


}