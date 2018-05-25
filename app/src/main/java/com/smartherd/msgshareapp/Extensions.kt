package com.smartherd.msgshareapp

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
	Toast.makeText(this, message, duration).show()
}
