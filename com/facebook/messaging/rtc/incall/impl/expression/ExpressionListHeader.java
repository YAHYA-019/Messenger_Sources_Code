package com.facebook.messaging.rtc.incall.impl.expression;

import X.0FI;
import X.11T;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.7zP;
import X.7zQ;
import X.AKX;
import X.AbI;
import X.C01g;
import X.C01i;
import X.C1u3;
import X.CH4;
import X.DKF;
import X.DKG;
import X.GOn;
import X.GOo;
import X.IKB;
import X.JFq;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.resources.ui.FbTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ExpressionListHeader.class */
public final class ExpressionListHeader extends LinearLayout implements JFq {
    public Drawable A00;
    public final View.OnClickListener A01;
    public final 1Br A02;
    public final 1Br A03;
    public final FbTextView A04;
    public final FbTextView A05;
    public final C01i A06;
    public final View A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressionListHeader(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressionListHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.widget.TextView, com.facebook.resources.ui.FbTextView] */
    public ExpressionListHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A06 = C01g.A01(new AKX(context, this, 39));
        this.A03 = 1Bu.A01(context, 85039);
        this.A02 = GOn.A0R(context);
        this.A01 = new IKB(this, 8);
        View A0G = 7zM.A0G(LayoutInflater.from(context), this, 2132541948, false);
        this.A07 = A0G;
        A00(2132279342);
        addView(A0G);
        ?? r0 = (FbTextView) DKG.A0B(this, 2131363817);
        this.A04 = r0;
        this.A05 = (FbTextView) DKG.A0B(this, 2131367265);
        r0.setTextColor(7zQ.A0m(this.A02).BKg());
        CH4 ch4 = (CH4) 1Br.A0B(this.A03);
        Drawable A0C = GOo.A0C(C1u3.A3r, 7zP.A0S(ch4.A02), 7zQ.A0m(ch4.A01));
        this.A00 = A0C;
        Resources resources = getResources();
        A0C.setBounds(0, 0, resources.getDimensionPixelSize(2132279320), resources.getDimensionPixelSize(2132279320));
        r0.setCompoundDrawables(null, null, this.A00, null);
        r0.setCompoundDrawablePadding(resources.getDimensionPixelSize(2132279305));
    }

    public /* synthetic */ ExpressionListHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final void A00(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        ViewGroup.LayoutParams layoutParams = this.A07.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = dimensionPixelSize;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r0.length() <= 0) goto L10;
     */
    @Override // X.JFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.expression.ExpressionListHeader.CfQ(X.JDB):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1266077374);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A06);
        0FI.A0C(-1071401646, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1762408263);
        AbI.A1X(this.A06);
        super.onDetachedFromWindow();
        0FI.A0C(889373857, A06);
    }
}
