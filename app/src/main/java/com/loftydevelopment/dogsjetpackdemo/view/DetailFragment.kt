package com.loftydevelopment.dogsjetpackdemo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.loftydevelopment.dogsjetpackdemo.R
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {

    private var dogUuid = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            dogUuid = DetailFragmentArgs.fromBundle(it).dogUuid
            tv_detail_frag.text = dogUuid.toString()
        }

        fab_goto_list.setOnClickListener {
            val action = DetailFragmentDirections.actionDetailToList()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
