package com.facebook.messaging.rtc.incall.impl.widgets.gradientbackground;

import X.0FI;
import X.11T;
import X.AKW;
import X.AbI;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C2642Gjw;
import X.DKF;
import X.DKG;
import X.I6p;
import X.JDB;
import X.JFq;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: GradientCallBackgroundViewV2.class */
public final class GradientCallBackgroundViewV2 extends View implements JFq {
    public final C01i A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientCallBackgroundViewV2(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientCallBackgroundViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientCallBackgroundViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A00 = C01g.A00(C03i.A02, new AKW(context, this, 8));
    }

    public /* synthetic */ GradientCallBackgroundViewV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        C2642Gjw c2642Gjw = (C2642Gjw) jdb;
        11T.A0F(c2642Gjw, 0);
        int[] iArr = (int[]) c2642Gjw.A01;
        int width = getWidth();
        int height = getHeight();
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (iArr == null) {
            iArr = I6p.A00();
        }
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(width, height);
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1552245624);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A00);
        0FI.A0C(-22593524, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(439412569);
        AbI.A1X(this.A00);
        super.onDetachedFromWindow();
        0FI.A0C(1591981138, A06);
    }
}
