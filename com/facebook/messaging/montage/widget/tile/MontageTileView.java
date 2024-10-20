package com.facebook.messaging.montage.widget.tile;

import X.0FI;
import X.1BY;
import X.1Bn;
import X.69V;
import X.82O;
import X.C09s;
import X.C69b;
import X.C69d;
import X.DKC;
import X.FYJ;
import X.Fjg;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.FbImageView;

/* loaded from: MontageTileView.class */
public class MontageTileView extends CustomFrameLayout implements 69V {
    public 82O A00;
    public C69d A01;
    public final C69b A02;
    public final FbImageView A03;
    public final FbDraweeView A04;

    public MontageTileView(Context context) {
        this(context, null, 0);
    }

    public MontageTileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageTileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = (82O) 1Bn.A0E(context, (1BY) null, 357);
        A0U(2132542716);
        FbDraweeView A0M = DKC.A0M(this, 2131363734);
        this.A04 = A0M;
        this.A03 = (FbImageView) C09s.A01(this, 2131364532);
        C69b A0E = this.A00.A0E(new Fjg(A0M));
        this.A02 = A0E;
        A0E.A04 = this;
        this.A01 = new C69d(context);
    }

    public void A0V(MontageCard montageCard, boolean z, boolean z2) {
        if (getWidth() == 0 || getHeight() == 0) {
            getViewTreeObserver().addOnPreDrawListener(new FYJ(montageCard, this, z, z2));
        } else {
            this.A02.A0D(montageCard, z, z2);
        }
    }

    public void CLI() {
        invalidate();
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A01.A00(canvas, this.A02.A07);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(726161115);
        super.onAttachedToWindow();
        0FI.A0C(-1656119132, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1658434573);
        super.onDetachedFromWindow();
        0FI.A0C(-910854435, A06);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1843208775);
        super.onSizeChanged(i, i2, i3, i4);
        C69b c69b = this.A02;
        c69b.A01 = i;
        c69b.A00 = i2;
        0FI.A0C(-418132997, A06);
    }
}
