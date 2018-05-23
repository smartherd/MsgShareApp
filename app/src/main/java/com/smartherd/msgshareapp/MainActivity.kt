package com.smartherd.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		btnShowToast.setOnClickListener {
			Log.i("MainActivity", "Button was clicked !")
			Toast.makeText(this, "Button was clicked !", Toast.LENGTH_SHORT).show()
		}

		btnSendMsgToNextActivity.setOnClickListener {
			val message: String = etUserMessage.text.toString()
			val intent = Intent(this, SecondActivity::class.java)

			intent.putExtra("user_message", message)

			startActivity(intent)
		}

		btnShareToOtherApps.setOnClickListener {

			val message: String = etUserMessage.text.toString()

			val intent = Intent()
			intent.action = Intent.ACTION_SEND
			intent.putExtra(Intent.EXTRA_TEXT, message)
			intent.type = "text/plain"

			startActivity(Intent.createChooser(intent, "Please select app: "))
		}

	}
}
