package com.example.praassesment1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.praassesment1.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*

/**
 * A simple [Fragment] subclass.
 */
class mainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentMainBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container, false)
        binding.apply {
            btnPersegiPanjang.setOnClickListener { v: View ->
                v.findNavController().navigate(R.id.action_mainFragment2_to_persegiPanjang)
            }
            btnSegitiga.setOnClickListener { v: View ->
                v.findNavController().navigate(R.id.action_mainFragment2_to_segitiga)
            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }


}
