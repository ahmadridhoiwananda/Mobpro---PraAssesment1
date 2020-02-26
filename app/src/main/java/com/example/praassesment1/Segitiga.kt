package com.example.praassesment1


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.praassesment1.databinding.FragmentPersegiPanjangBinding
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_segitiga.*
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * A simple [Fragment] subclass.
 */
class Segitiga : Fragment() {
    private var alas:Int = 0
    private var tinggi:Int = 0
    private var luas : Double = 0.0
    private var keliling : Double = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPersegiPanjangBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_persegi_panjang, container, false)
        binding.apply {
            btnHitung.setOnClickListener {
                alas = txt_panjang.text.toString().toInt()
                tinggi = txt_lebar.text.toString().toInt()
                luas = 0.5 * alas * tinggi
                keliling = alas + tinggi + (sqrt(alas.toDouble().pow(2)+tinggi.toDouble().pow(2)))
                tvHasilLuas.text = " $luas"
                tvHasilKeliling.text = " $keliling"
            }
            btnShare.setOnClickListener {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.setType("text/plain").putExtra(Intent.EXTRA_TEXT, "${tv_hasilLuasSegitiga.text},${tv_hasilKelilingSegitiga}")
                startActivity(shareIntent)
            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }


}
