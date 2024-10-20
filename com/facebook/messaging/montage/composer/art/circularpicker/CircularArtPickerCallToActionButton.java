package com.facebook.messaging.montage.composer.art.circularpicker;

import X.11T;
import X.1Br;
import X.1Bu;
import X.DKF;
import X.DKG;
import X.GOo;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CircularArtPickerCallToActionButton.class */
public final class CircularArtPickerCallToActionButton extends CustomFrameLayout {
    public final 1Br A00;
    public final FbTextView A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerCallToActionButton(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerCallToActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularArtPickerCallToActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A00 = 1Bu.A01(context, 100011);
        A0U(2132541708);
        this.A01 = GOo.A0X(this, 2131366460);
    }

    public /* synthetic */ CircularArtPickerCallToActionButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
