package com.facebook.messaging.media.picker;

import X.C00i;
import X.C1uu;
import X.DKD;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.fbui.widget.text.ImageWithTextView;

/* loaded from: MediaPickerTitleView.class */
public class MediaPickerTitleView extends ImageWithTextView {
    public final C00i A00;

    public MediaPickerTitleView(Context context) {
        super(context);
        this.A00 = DKD.A0Q();
        A07(-1);
    }

    public MediaPickerTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = DKD.A0Q();
        A07(-1);
    }

    public MediaPickerTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = DKD.A0Q();
        A07(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A07(int i) {
        ImageWithTextView.A03(((C1uu) this.A00.get()).A01(2132411067, i), this);
        requestLayout();
        invalidate();
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(2132279313));
        if (((ImageWithTextView) this).A04 != 2) {
            ((ImageWithTextView) this).A04 = 2;
            ImageWithTextView.A04(this);
            requestLayout();
            invalidate();
        }
    }
}
