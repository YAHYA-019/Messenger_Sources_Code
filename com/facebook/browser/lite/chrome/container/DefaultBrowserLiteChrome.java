package com.facebook.browser.lite.chrome.container;

import X.2MR;
import X.AnonymousClass001;
import X.JR1;
import X.JZN;
import X.JgX;
import X.LDi;
import X.MF6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteLEProgressBar;
import com.facebook.widget.FbImageView;
import java.util.HashSet;

/* loaded from: DefaultBrowserLiteChrome.class */
public class DefaultBrowserLiteChrome extends RelativeLayout implements MF6 {
    public Context A00;
    public Intent A01;
    public Bundle A02;
    public View A03;
    public JgX A04;
    public JgX A05;
    public ChromeUrlBar A06;
    public JZN A07;
    public BrowserLiteLEProgressBar A08;
    public FbImageView A09;
    public FbImageView A0A;
    public final HashSet A0B;

    public DefaultBrowserLiteChrome(Context context) {
        this(context, null);
    }

    public DefaultBrowserLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = context;
        Intent intent = ((Activity) context).getIntent();
        this.A01 = intent;
        this.A02 = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        this.A0B = AnonymousClass001.A0v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        View findViewById;
        super.onConfigurationChanged(configuration);
        JZN jzn = this.A07;
        if (jzn != null && jzn.isShowing()) {
            this.A07.dismiss();
        }
        Context context = this.A00;
        if (!LDi.A08(context) || (findViewById = findViewById(2131363008)) == null) {
            return;
        }
        JR1.A1C(findViewById, 2MR.A2J, LDi.A02(context));
    }

    @Override // X.MF6
    public void setProgress(int i) {
        BrowserLiteLEProgressBar browserLiteLEProgressBar = this.A08;
        if (browserLiteLEProgressBar != null) {
            browserLiteLEProgressBar.A00(i);
        }
    }
}
