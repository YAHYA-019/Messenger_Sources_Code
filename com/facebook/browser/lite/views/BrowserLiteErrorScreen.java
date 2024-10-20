package com.facebook.browser.lite.views;

import X.0S2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: BrowserLiteErrorScreen.class */
public class BrowserLiteErrorScreen extends LinearLayout {
    public Context A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public BrowserLiteErrorScreen(Context context) {
        this(context, null);
    }

    public BrowserLiteErrorScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = false;
        this.A01 = 0S2.A0N;
        this.A00 = context;
    }

    public void A00() {
        if (this.A04) {
            setVisibility(8);
            this.A04 = false;
            this.A01 = 0S2.A0N;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
