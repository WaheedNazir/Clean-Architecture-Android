package com.example.jhordan.euro_cleanarchitecture.view.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class CustomFontTextView extends AppCompatTextView {

    final static String EURO_FONT = "euro.ttf";

    public CustomFontTextView(Context context) {
        super(context);
        if (!isInEditMode()) {
            init(context);
        }
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            init(context);
        }
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            init(context);
        }
    }

    private void init(Context context) {
        this.setTypeface(getRobotoBlackTypeFace(context));
    }

    private Typeface getRobotoBlackTypeFace(Context context) {
        return Typeface.createFromAsset(context.getAssets(), EURO_FONT);
    }
}
