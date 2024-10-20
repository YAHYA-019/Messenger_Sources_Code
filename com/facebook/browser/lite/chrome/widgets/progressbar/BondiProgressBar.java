package com.facebook.browser.lite.chrome.widgets.progressbar;

import X.0K6;
import X.LEw;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

/* loaded from: BondiProgressBar.class */
public class BondiProgressBar extends ProgressBar {
    public int A00;
    public ObjectAnimator A01;
    public boolean A02;

    public BondiProgressBar(Context context) {
        this(context, null);
    }

    public BondiProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new ObjectAnimator();
    }

    public void A00(int i) {
        int progress = getProgress() == 10000 ? 0 : getProgress();
        long j = 300;
        int i2 = i * 100;
        if (i < 80) {
            if (this.A02 && i >= this.A00) {
                this.A00 = i;
                return;
            }
            j = 8000;
            i2 = 8000;
            this.A00 = i;
            progress = 0;
        }
        if (getAlpha() == 0.0f) {
            setAlpha(1.0f);
        }
        this.A01.cancel();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", progress, i2);
        this.A01 = ofInt;
        ofInt.setDuration(j);
        this.A01.setInterpolator(new DecelerateInterpolator());
        if (i == 100) {
            this.A01.addListener(new LEw(this, 0));
        }
        this.A02 = true;
        0K6.A00(this.A01);
    }
}
