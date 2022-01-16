package com.begumyolcu.sayacfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.begumyolcu.sayacfragment.databinding.FragmentSayacBinding


class SayacFragment : Fragment() {
    private var _binding: FragmentSayacBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSayacBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val defaultVal = 0

        binding.textViewSayac.text = defaultVal.toString()

        binding.buttonSayac.setOnClickListener {
            binding.apply {
                val currentVal = textViewSayac.text.toString().toInt()
                textViewSayac.text = (currentVal+1).toString()
            }

        }
    }

}