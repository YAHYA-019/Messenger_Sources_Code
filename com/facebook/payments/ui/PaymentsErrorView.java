package com.facebook.payments.ui;

import X.2MR;
import X.4YU;
import X.C00i;
import X.C09s;
import X.C1uu;
import X.DKC;
import X.DKD;
import X.DKH;
import X.EBe;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.widget.text.BetterTextView;
import com.mapbox.mapboxsdk.R;

/* loaded from: PaymentsErrorView.class */
public class PaymentsErrorView extends EBe implements CallerContextable {
    public BetterTextView A00;
    public ImageView A01;
    public C00i A02;

    public PaymentsErrorView(Context context) {
        super(context);
        A00();
    }

    public PaymentsErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PaymentsErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        this.A02 = DKD.A0Q();
        A0D(2132543063);
        setOrientation(0);
        this.A00 = DKC.A0g(this, 2131363604);
        ImageView imageView = (ImageView) C09s.A01(this, R.id.image);
        this.A01 = imageView;
        DKH.A0u(this.A01.getContext(), imageView, (C1uu) 4YU.A0p(this.A02), 2MR.A1v, 2132410701);
    }
}
