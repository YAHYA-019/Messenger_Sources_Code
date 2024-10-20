package com.facebook.browser.lite.chrome.container.messenger;

import X.AbstractC3252Jnp;
import X.DKB;
import X.DKD;
import X.DKF;
import X.GOo;
import X.JVj;
import X.JZY;
import X.JgX;
import X.LCd;
import X.LDF;
import X.LKF;
import X.LKO;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: MessengerLiteChrome.class */
public class MessengerLiteChrome extends JZY {
    public Context A00;
    public Intent A01;
    public Bundle A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public JgX A08;
    public LDF A09;
    public AbstractC3252Jnp A0A;

    public MessengerLiteChrome(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessengerLiteChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = context;
        Intent intent = ((Activity) context).getIntent();
        this.A01 = intent;
        this.A02 = intent.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        DKD.A0A(this).inflate(2132542583, (ViewGroup) this);
        ImageView imageView = (ImageView) requireViewById(2131363049);
        this.A03 = imageView;
        GOo.A16(context, imageView, 2131951690);
        this.A04 = (ImageView) requireViewById(2131366692);
        this.A07 = DKF.A0F(this, 2131367971);
        this.A06 = DKF.A0F(this, 2131367969);
        this.A03.setClickable(true);
        this.A03.setBackground(getResources().getDrawable(2132410597));
        this.A03.setImageDrawable(this.A00.getResources().getDrawable(2132345301, null));
        LKO.A01(this.A03, this, 26);
        Bundle bundleExtra = this.A01.getBundleExtra(DKB.A00(200));
        if (bundleExtra != null) {
            String string = bundleExtra.getString(DKB.A00(202));
            String string2 = bundleExtra.getString("action");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                try {
                    ImageView imageView2 = this.A04;
                    AsyncTask asyncTask = new AsyncTask();
                    ((JVj) asyncTask).A00 = imageView2;
                    asyncTask.execute(string);
                } catch (Exception e) {
                    this.A04.setVisibility(8);
                    LCd.A01("MessengerLiteChrome", "Failed downloading page icon", e);
                }
                this.A04.setOnClickListener(new LKF(string2, this, 1));
            }
        }
        if (!this.A01.getBooleanExtra(DKB.A00(201), false)) {
            ImageView imageView3 = (ImageView) requireViewById(2131367333);
            this.A05 = imageView3;
            imageView3.setVisibility(0);
            this.A05.setImageDrawable(this.A00.getResources().getDrawable(2132410944, null));
            LKO.A01(this.A05, this, 27);
        }
        this.A09 = LDF.A00();
    }
}
