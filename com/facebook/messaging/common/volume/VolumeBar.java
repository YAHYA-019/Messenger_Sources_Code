package com.facebook.messaging.common.volume;

import X.G0A;
import X.JEn;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: VolumeBar.class */
public final class VolumeBar extends ProgressBar implements JEn {
    public int A00;
    public final Runnable A01;

    public VolumeBar(Context context) {
        super(context);
        this.A01 = new G0A(this);
        A00();
    }

    public VolumeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new G0A(this);
        A00();
    }

    public VolumeBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = new G0A(this);
        A00();
    }

    private final void A00() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2132279455);
        this.A00 = dimensionPixelSize;
        setTranslationY(-dimensionPixelSize);
    }

    @Override // X.JEn
    public void CUx(int i, int i2) {
        setProgress(i);
        setMax(i2);
        animate().setDuration(200L).translationY(0.0f);
        Runnable runnable = this.A01;
        removeCallbacks(runnable);
        postDelayed(runnable, 1500L);
    }
}
