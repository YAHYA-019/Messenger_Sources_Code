package com.facebook.messaging.montage.composer.art.circularpicker;

import X.GOo;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: CircularArtPickerItemDescriptionView.class */
public class CircularArtPickerItemDescriptionView extends CustomFrameLayout {
    public FbTextView A00;
    public FbTextView A01;

    public CircularArtPickerItemDescriptionView(Context context) {
        this(context, null);
    }

    public CircularArtPickerItemDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularArtPickerItemDescriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0U(2132541709);
        this.A01 = GOo.A0X(this, 2131368067);
        this.A00 = GOo.A0X(this, 2131367726);
    }
}
