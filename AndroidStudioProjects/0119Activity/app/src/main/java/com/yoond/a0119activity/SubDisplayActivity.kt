package com.yoond.a0119activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_sub_display.*
import kotlinx.android.synthetic.main.sub.view.*

class SubDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_display)

        button.setOnClickListener{
            // 뷰 전개를 위한 개체 생성
            val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE)
            as LayoutInflater

            // 뷰를 전개함 - 뷰를 출력
            inflater.inflate(R.layout.sub, container, true)
            // 체크 박스의 내용 수정
            container.checkBox.text = "loaded"
        }
    }
}