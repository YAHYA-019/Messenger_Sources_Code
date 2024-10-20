package com.facebook.messaging.reactions;

import X.1Bn;
import X.7Wd;
import X.C69f;
import X.DKC;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.facebook.drawee.fbpipeline.FbDraweeView;

/* loaded from: ReactorProfileWithBadgeView.class */
public class ReactorProfileWithBadgeView extends FbDraweeView {
    public 7Wd A00;
    public final Paint A01;

    public ReactorProfileWithBadgeView(Context context) {
        super(context);
        this.A01 = DKC.A09();
        A00();
    }

    public ReactorProfileWithBadgeView(Context context, C69f c69f) {
        super(context, c69f);
        this.A01 = DKC.A09();
        A00();
    }

    public ReactorProfileWithBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = DKC.A09();
        A00();
    }

    public ReactorProfileWithBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = DKC.A09();
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        this.A00 = (7Wd) 1Bn.A0A(50212);
        Resources resources = getResources();
        resources.getDimensionPixelSize(2132279314);
        resources.getDimensionPixelOffset(2132279309);
        this.A01.setColor(-1);
    }

    @Override // com.facebook.drawee.fbpipeline.FbDraweeView
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
