package com.vit.demonative

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.androidyuan.aesjni.AESEncrypt
import com.androidyuan.aesjni.SignatureTool

class MainActivity : AppCompatActivity() {

    private val str = "https://api.splayer.dev/settings/"
    private val ecode = "Kp8RTw0AKsk0Xr71VvGdzQ=="
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //String code = AESEncrypt.encode(this, str);

        //下面的密文对应的原文：123abcABC&*(@#@#@)+_/中文测试
//        val code = AESEncrypt.encode(this, str);
//        val code = AESEncrypt.decode(this, AESEncrypt.adMobId())

//        Log.e("code", code + "")
        Log.e("code", "${SignatureTool.getSignature(applicationContext)}")


        findViewById<EditText>(R.id.sample_text).setText("${AESEncrypt.getMD5(applicationContext)}")
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

}