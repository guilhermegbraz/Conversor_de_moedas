package br.edu.ufabc.conversordemoedas

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import br.edu.ufabc.conversordemoedas.databinding.FragmentConverterBinding

class ConverterFragment : Fragment() {
    private lateinit var binding: FragmentConverterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentConverterBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("ResourceType")
    override fun onStart() {
        super.onStart()
        val curricies = listOf("joao", "maria")
        context?.let{
            val adapter = ArrayAdapter(it, android.R.layout.simple_spinner_item, curricies)
            binding.converterFragmentSpinnerCurrencies.adapter = adapter
        }

    }


}