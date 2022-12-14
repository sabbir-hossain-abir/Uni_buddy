package com.example.homepage.homeTab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.homepage.R
import com.example.homepage.superClass.ReplaceFragment


class RequestFragment : ReplaceFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        container?.removeAllViews()
        val v = inflater.inflate(R.layout.fragment_request, container, false)

        val sendBTn = v.findViewById<Button>(R.id.sendBtn)

        //TODO validate message box , subject box , email box make a toast

        sendBTn.setOnClickListener{

            val email = "unibuddy890@gmail.com"
            val message = v.findViewById<TextView>(R.id.message)
            val addresses = email.split(",".toRegex()).toTypedArray()
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, addresses)
                putExtra(Intent.EXTRA_SUBJECT, "REQUESTING FOR NEW MATERIALS")
                putExtra(Intent.EXTRA_TEXT, message.text.toString())
            }
            startActivity(intent)
        }

        return v
    }

}