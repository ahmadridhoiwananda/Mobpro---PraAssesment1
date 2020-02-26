package com.example.praassesment1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.praassesment1.databinding.FragmentPersegiPanjangBinding
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_segitiga.*

/**
 * A simple [Fragment] subclass.
 */
class PersegiPanjang : Fragment() {

    private var panjang = 0
    private var lebar = 0
    private var luas = 0
    private var keliling = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPersegiPanjangBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_persegi_panjang, container, false)
        binding.apply {
            btnHitung.setOnClickListener {
                panjang = txt_panjang.text.toString().toInt()
                lebar = txt_lebar.text.toString().toInt()
                luas = panjang * lebar
                keliling = 2 * panjang * lebar
                tvHasilLuas.text = " $luas"
                tvHasilKeliling.text = " $keliling"
            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }


}
