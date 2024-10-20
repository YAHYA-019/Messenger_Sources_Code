package com.facebook.widget;

import X.0FI;
import X.C1oo;
import X.DNb;
import X.ECJ;
import X.RkX;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextSwitcher;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: NotificationTextSwitcher.class */
public class NotificationTextSwitcher extends TextSwitcher {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Handler A04;
    public Animation.AnimationListener A05;
    public CharSequence A06;
    public AtomicBoolean A07;
    public AtomicBoolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public NotificationTextSwitcher(Context context) {
        super(context);
        A00(null);
        this.A04 = new DNb(this, 2);
        this.A05 = new ECJ(this, 3);
        this.A08 = new AtomicBoolean(false);
        this.A07 = new AtomicBoolean(false);
    }

    public NotificationTextSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
        this.A04 = new DNb(this, 2);
        this.A05 = new ECJ(this, 3);
        this.A08 = new AtomicBoolean(false);
        this.A07 = new AtomicBoolean(false);
    }

    private void A00(AttributeSet attributeSet) {
        if (getInAnimation() == null) {
            setInAnimation(getContext(), 2130772005);
        }
        if (getOutAnimation() == null) {
            setOutAnimation(getContext(), 2130772006);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1oo.A0b);
            this.A0A = obtainStyledAttributes.hasValue(1);
            this.A02 = obtainStyledAttributes.getColor(1, 0);
            this.A0B = obtainStyledAttributes.hasValue(2);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.A0C = obtainStyledAttributes.hasValue(3);
            this.A03 = obtainStyledAttributes.getInt(3, 0);
            this.A09 = obtainStyledAttributes.hasValue(0);
            float f = 0.0f / 0.0f;
            this.A01 = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }
        super.setFactory(new RkX(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(75915469);
        Handler handler = this.A04;
        handler.removeMessages(0);
        handler.removeMessages(1);
        this.A08.set(false);
        this.A07.set(false);
        super.onDetachedFromWindow();
        0FI.A0C(-1436451383, A06);
    }

    @Override // android.widget.TextSwitcher
    public void setText(CharSequence charSequence) {
        if (!this.A08.get()) {
            this.A06 = charSequence;
        }
        super.setText(charSequence);
    }
}
