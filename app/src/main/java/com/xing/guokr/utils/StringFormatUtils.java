package com.xing.guokr.utils;


import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;

public class StringFormatUtils {

    /**
     * 高亮关键字
     *
     * @param text
     * @param keyword
     * @return
     */
    public static Spannable highlightKeyWord(String text, String keyword, int color) {
        SpannableStringBuilder builder = new SpannableStringBuilder(text);
        if(TextUtils.isEmpty(keyword)) return builder;

        for (int i = 0; i < text.length(); ++i) {
            CharSequence cs = text.subSequence(i, i + 1);
            if (keyword.contains(cs)) { // 关键字里包含这个字符
                builder.setSpan(new ForegroundColorSpan(color), i, i + 1,
                        SpannableStringBuilder.SPAN_INCLUSIVE_EXCLUSIVE);
            }
        }

        return builder;
    }

}
