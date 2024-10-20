package com.facebook.messaging.montage.viewer.progressindicator;

import X.0FI;
import X.0K6;
import X.0fH;
import X.1BL;
import X.1BV;
import X.7zK;
import X.AnonymousClass001;
import X.C00i;
import X.C62j;
import X.C66h;
import X.C66i;
import X.DKC;
import X.DKD;
import X.GOo;
import X.GOq;
import X.GSD;
import X.H0C;
import X.IG6;
import X.JFO;
import X.JFP;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.base.Preconditions;

/* loaded from: MontageProgressIndicatorView.class */
public class MontageProgressIndicatorView extends View {
    public float A00;
    public long A01;
    public ValueAnimator A02;
    public JFO A03;
    public JFP A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public C00i A09;
    public boolean A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final C66i A0E;
    public final AnimatorListenerAdapter A0F;

    public MontageProgressIndicatorView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MontageProgressIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, false);
    }

    public MontageProgressIndicatorView(Context context, AttributeSet attributeSet, int i, boolean z, boolean z2) {
        super(context, attributeSet, i);
        Context context2;
        int i2;
        this.A0F = new GSD(this, 2);
        1BV A00 = 1BV.A00(49939);
        this.A09 = A00;
        C66i c66i = new C66i((C62j) A00.get());
        c66i.A09(C66h.A01());
        c66i.A06 = true;
        GOq.A1I(c66i);
        c66i.A0A(new H0C(this, 3));
        this.A0E = c66i;
        this.A0A = z2;
        Paint A0A = DKC.A0A(5);
        this.A0B = A0A;
        DKC.A1L(A0A);
        A0A.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = getResources();
        Paint paint = new Paint(A0A);
        this.A0C = paint;
        Paint paint2 = new Paint(A0A);
        this.A0D = paint2;
        GOo.A18(resources, paint2, 2132213868);
        if (z) {
            A0A.setColor(-16777216);
            context2 = getContext();
            i2 = 2132214517;
        } else {
            A0A.setColor(-1);
            context2 = getContext();
            i2 = 2132214253;
        }
        paint.setColor(context2.getColor(i2));
        this.A06 = resources.getDimensionPixelSize(2132279309);
    }

    public MontageProgressIndicatorView(Context context, boolean z) {
        this(context, null, 0, z, false);
    }

    public MontageProgressIndicatorView(Context context, boolean z, boolean z2) {
        this(context, null, 0, z, z2);
    }

    public static void A00(MontageProgressIndicatorView montageProgressIndicatorView, long j) {
        GOo.A1H(montageProgressIndicatorView);
        long j2 = montageProgressIndicatorView.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(j2 == 0 ? 0.0f : 1.0f - (((float) j) / ((float) j2)), 1.0f);
        montageProgressIndicatorView.A02 = ofFloat;
        ofFloat.setDuration(j);
        DKD.A17(montageProgressIndicatorView.A02);
        IG6.A00(montageProgressIndicatorView.A02, montageProgressIndicatorView, 7);
        montageProgressIndicatorView.A02.addListener(montageProgressIndicatorView.A0F);
        0K6.A00(montageProgressIndicatorView.A02);
    }

    public void A01() {
        GOo.A1H(this);
        this.A00 = 0.0f;
        invalidate();
    }

    public void A02() {
        if (this.A01 < 0) {
            throw AnonymousClass001.A0N("setTotalDuration is not called yet");
        }
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A02 = ofFloat;
            ofFloat.setDuration(this.A01);
            DKD.A17(this.A02);
            IG6.A00(this.A02, this, 8);
            this.A02.addListener(this.A0F);
        } else if (valueAnimator.isStarted()) {
            return;
        } else {
            this.A02.setCurrentPlayTime(((float) this.A01) * this.A00);
        }
        0K6.A00(this.A02);
    }

    public void A03(float f) {
        GOo.A1H(this);
        if (this.A00 != f) {
            this.A00 = f;
            JFO jfo = this.A03;
            if (jfo != null) {
                jfo.CQa(f * ((float) r0), this.A01);
            }
            invalidate();
        }
    }

    public void A04(long j) {
        Preconditions.checkArgument(1BL.A1S((j > 0L ? 1 : (j == 0L ? 0 : -1))), "Cant have a negative duration");
        GOo.A1H(this);
        this.A01 = j;
    }

    public void A05(long j) {
        Preconditions.checkState(1BL.A1S((this.A01 > 0L ? 1 : (this.A01 == 0L ? 0 : -1))), 7zK.A00(210));
        Preconditions.checkArgument(1BL.A1S((j > 0L ? 1 : (j == 0L ? 0 : -1))), "Cant have a negative duration");
        long j2 = this.A01;
        if (j > j2) {
            0fH.A14("MontageProgressIndicatorView", "Attempted to start indicator at time (%d) greater than total duration (%d)", GOo.A1b(Long.valueOf(j), j2));
            j = this.A01;
        }
        A00(this, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0090, code lost:
    
        if (X.C2rY.A00(r0) == false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1556248443);
        float f = i2;
        this.A0D.setStrokeWidth(f);
        this.A0C.setStrokeWidth(f);
        this.A0B.setStrokeWidth(f);
        0FI.A0C(1866224299, A06);
    }

    public void setPosition(int i, int i2) {
        if (this.A08 == i && this.A07 == i2) {
            return;
        }
        Preconditions.checkArgument(AnonymousClass001.A1P(i2));
        Preconditions.checkElementIndex(i, i2);
        GOo.A1H(this);
        this.A08 = i;
        this.A07 = i2;
        invalidate();
        this.A0E.A07(i / i2);
    }
}
