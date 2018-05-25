package com.smartherd.msgshareapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.smartherd.msgshareapp.Constants
import com.smartherd.msgshareapp.R
import com.smartherd.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

	companion object {
		val TAG: String = SecondActivity::class.java.simpleName
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_second)

		// Safe Call   ?.
		// Safe Call with let  ?.let {  }

		val bundle: Bundle? = intent.extras

		bundle?.let {
			val msg = bundle.getString(Constants.USER_MSG_KEY)
			showToast(msg)
			txvUserMessage.text = msg
		}
	}
}
