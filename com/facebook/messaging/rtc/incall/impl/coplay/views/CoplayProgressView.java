package com.facebook.messaging.rtc.incall.impl.coplay.views;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.7zL;
import X.C1rs;
import X.DKF;
import X.DKG;
import X.QEO;
import X.QLY;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.facebook.litho.LithoView;
import java.util.BitSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CoplayProgressView.class */
public final class CoplayProgressView extends RelativeLayout {
    public LithoView A00;
    public LithoView A01;
    public String A02;
    public String A03;
    public String A04;
    public float A05;
    public final 1Br A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayProgressView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoplayProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A06 = 1Bu.A00(98401);
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(2132541780, this);
        this.A01 = 7zL.A0b(this, 2131366722);
        this.A00 = 7zL.A0b(this, 2131365313);
        setBackground(context2.getDrawable(2132410614));
    }

    public /* synthetic */ CoplayProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final void A00(CoplayProgressView coplayProgressView) {
        LithoView lithoView;
        if (coplayProgressView.A02 == null || coplayProgressView.A04 == null || (lithoView = coplayProgressView.A01) == null) {
            return;
        }
        if (1Br.A0B(coplayProgressView.A06) == null) {
            throw 1BK.A0h();
        }
        Context context = coplayProgressView.getContext();
        1Iw A0W = 7zL.A0W(context);
        String str = coplayProgressView.A02;
        float f = coplayProgressView.A05;
        float f2 = f / 100.0f;
        String A0v = 1BK.A0v(context, Integer.valueOf((int) f), 2131964881);
        String str2 = coplayProgressView.A04;
        QEO qeo = new QEO(A0W, new QLY());
        QLY qly = qeo.A01;
        qly.A01 = str;
        BitSet bitSet = qeo.A02;
        bitSet.set(0);
        qly.A00 = f2;
        bitSet.set(1);
        qly.A02 = A0v;
        bitSet.set(2);
        qly.A03 = str2;
        bitSet.set(3);
        qly.A04 = true;
        C1rs.A02(bitSet, qeo.A03);
        qeo.A0J();
        lithoView.A0x(qly);
    }

    public final float getProgress() {
        return this.A05;
    }

    public final void setProgress(float f) {
        this.A05 = f;
        A00(this);
    }
}
