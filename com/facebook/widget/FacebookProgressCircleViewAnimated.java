package com.facebook.widget;

import X.AbH;
import X.AbI;
import X.AnonymousClass001;
import X.C00i;
import X.Iuk;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;

/* loaded from: FacebookProgressCircleViewAnimated.class */
public class FacebookProgressCircleViewAnimated extends FacebookProgressCircleView {
    public float A00;
    public long A01;
    public C00i A02;
    public boolean A03;
    public final Handler A04;
    public final Runnable A05;

    public FacebookProgressCircleViewAnimated(Context context) {
        super(context);
        this.A00 = 0.0f;
        this.A04 = AnonymousClass001.A07();
        this.A03 = false;
        this.A05 = new Iuk(this);
        this.A02 = AbH.A0K();
    }

    public FacebookProgressCircleViewAnimated(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0.0f;
        this.A04 = AnonymousClass001.A07();
        this.A03 = false;
        this.A05 = new Iuk(this);
        this.A02 = AbH.A0K();
    }

    public FacebookProgressCircleViewAnimated(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.A00 = 0.0f;
        this.A04 = AnonymousClass001.A07();
        this.A03 = false;
        this.A05 = new Iuk(this);
        this.A02 = AbH.A0K();
    }

    @Override // com.facebook.widget.FacebookProgressCircleView
    public void setProgress(double d) {
        setProgress((long) d);
    }

    @Override // com.facebook.widget.FacebookProgressCircleView
    public void setProgress(long j) {
        C00i c00i = this.A02;
        c00i.getClass();
        AbI.A1N(c00i);
        this.A01 = j;
        if (j > 99) {
            super.A00 = 0.0d;
            this.A01 = 0L;
        } else {
            if (this.A03) {
                return;
            }
            this.A04.postDelayed(this.A05, 20);
        }
    }
}
