package com.example.iconfontdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isIvPlay: Boolean = true
    private var isDrawPen: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iv_play.setOnClickListener {
            if (isIvPlay) {
                iv_play_icon.setText(R.string.icon_play_stop)
                iv_play.setBackgroundColor(resources.getColor(R.color.color_ff8080))
                iv_play_text.text = "直播中"
                isIvPlay = false
            } else {
                iv_play_icon.setText(R.string.icon_play_start)
                iv_play.setBackgroundColor(resources.getColor(R.color.color_6471FB))
                iv_play_text.text = "开始直播"
                isIvPlay = true
            }
        }
        view_brush.setOnClickListener {
            if (isDrawPen) {
                draw_pen.setTextColor(resources.getColor(R.color.color_ff8080))
                isDrawPen = false
            } else {
                draw_pen.setTextColor(resources.getColor(R.color.camera_white))
                isDrawPen = true
            }
        }
    }
}
