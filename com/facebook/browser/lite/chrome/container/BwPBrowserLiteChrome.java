package com.facebook.browser.lite.chrome.container;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.browser.lite.chrome.widgets.progressbar.BondiProgressBar;
import com.facebook.fbui.widget.glyph.GlyphButton;

/* loaded from: BwPBrowserLiteChrome.class */
public class BwPBrowserLiteChrome extends LinearLayout {
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public BondiProgressBar A03;
    public GlyphButton A04;

    public BwPBrowserLiteChrome(Context context) {
        super(context);
    }

    public BwPBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BwPBrowserLiteChrome(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setProgress(int i) {
        BondiProgressBar bondiProgressBar = this.A03;
        if (bondiProgressBar != null) {
            bondiProgressBar.A00(i);
        }
    }
}
