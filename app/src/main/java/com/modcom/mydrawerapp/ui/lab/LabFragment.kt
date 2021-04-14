package com.modcom.mydrawerapp.ui.lab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.modcom.mydrawerapp.R

class LabFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //this is a fragment to display our lab tests
        // we can use database/
        return inflater.inflate(R.layout.fragment_lab, container, false)
    }
}