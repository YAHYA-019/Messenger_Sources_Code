package com.facebook.messaging.montage.composer.art.circularpicker;

import X.11T;
import X.1Bn;
import X.C09s;
import X.C2rp;
import X.C62j;
import X.DKF;
import X.DKG;
import X.HQt;
import X.I5M;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.FbImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CircularArtPickerResetButton.class */
public final class CircularArtPickerResetButton extends CustomFrameLayout implements CallerContextable {
    public int A00;
    public I5M A01;
    public I5M A02;
    public FbImageView A03;
    public boolean A04;
    public HQt A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerResetButton(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerResetButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerResetButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A05 = (HQt) 1Bn.A0A(115802);
        A0U(2132541710);
        View A01 = C09s.A01(this, 2131366923);
        FbImageView fbImageView = (FbImageView) C09s.A01(this, 2131366922);
        this.A03 = fbImageView;
        C2rp.A01(fbImageView);
        C62j c62j = this.A05.A00;
        this.A02 = new I5M(A01, c62j);
        I5M i5m = new I5M(this, c62j);
        i5m.A06 = true;
        this.A01 = i5m;
        this.A00 = -context.getResources().getDimensionPixelSize(2132279378);
    }

    public /* synthetic */ CircularArtPickerResetButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
