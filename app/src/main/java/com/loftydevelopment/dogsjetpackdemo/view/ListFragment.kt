package com.loftydevelopment.dogsjetpackdemo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.loftydevelopment.dogsjetpackdemo.R
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab_goto_detail.setOnClickListener {
            val action = ListFragmentDirections.actionListToDetail()
            action.dogUuid = 5
            Navigation.findNavController(it).navigate(action)
        }
    }

}