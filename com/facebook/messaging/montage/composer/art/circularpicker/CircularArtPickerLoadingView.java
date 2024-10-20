package com.facebook.messaging.montage.composer.art.circularpicker;

import X.0S2;
import X.11T;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CircularArtPickerLoadingView.class */
public final class CircularArtPickerLoadingView extends View {
    public Integer A00;
    public int A01;
    public int A02;
    public int A03;
    public LinearGradient A04;
    public Paint A05;
    public int[] A06;
    public final Paint A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerLoadingView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        Integer num = 0S2.A0C;
        this.A00 = num;
        this.A05 = DKC.A0A(1);
        this.A07 = DKC.A0A(1);
        Resources resources = getResources();
        this.A02 = resources.getDimensionPixelSize(2132279328);
        this.A01 = resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp);
        this.A00 = num;
        DKD.A19(this.A05, PorterDuff.Mode.SRC_IN);
        int color = context.getColor(2132213943);
        int color2 = context.getColor(2132213870);
        this.A06 = new int[]{color, color2, color2, color};
    }

    public /* synthetic */ CircularArtPickerLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r0 == X.0S2.A0N) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.art.circularpicker.CircularArtPickerLoadingView.onDraw(android.graphics.Canvas):void");
    }
}
