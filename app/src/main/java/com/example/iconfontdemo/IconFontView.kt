package com.example.iconfontdemo

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

class IconFontView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : TextView(context, attrs, defStyleAttr) {
    init {
        setIconViewFace()
    }

    private inline fun setIconViewFace() {
        val iconFont = Typeface.createFromAsset(context?.assets?:return, "iconfont/iconfont.ttf")
        typeface = iconFont
    }

    constructor(context: Context?):this(context,null,0)
    constructor(context: Context?,attrs: AttributeSet?):this(context,attrs,0)
}