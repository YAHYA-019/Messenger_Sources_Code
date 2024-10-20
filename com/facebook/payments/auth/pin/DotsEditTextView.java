package com.facebook.payments.auth.pin;

import X.1BY;
import X.1Bi;
import X.1Bn;
import X.48A;
import X.6P9;
import X.AbL;
import X.AbR;
import X.C09s;
import X.ECs;
import X.Exg;
import X.FHl;
import X.FXq;
import X.FYa;
import X.RjB;
import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.inject.FbInjector;
import com.facebook.resources.ui.FbEditText;
import java.util.concurrent.ExecutorService;

/* loaded from: DotsEditTextView.class */
public class DotsEditTextView extends 48A {
    public ImageView A00;
    public Exg A01;
    public FbEditText A02;
    public ExecutorService A03;
    public AbR A04;
    public FHl A05;

    public DotsEditTextView(Context context) {
        super(context);
        A00();
    }

    public DotsEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public DotsEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        this.A04 = (AbR) 1Bn.A0E(getContext(), (1BY) null, 716);
        this.A05 = (FHl) 1Bn.A0A(99027);
        this.A03 = (ExecutorService) 1Bi.A03(16456);
        setContentView(2132541866);
        this.A02 = (FbEditText) C09s.A01(this, 2131366531);
        this.A00 = (ImageView) C09s.A01(this, 2131366536);
        6P9 r0 = this.A02;
        AbR abR = this.A04;
        abR.getClass();
        ImageView imageView = this.A00;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            TextWatcher rjB = new RjB(imageView, abR);
            1Bn.A0K();
            FbInjector.A04(A01);
            r0.addTextChangedListener(rjB);
            this.A02.setEnabled(true);
            this.A02.setFocusableInTouchMode(true);
            this.A02.setClickable(true);
            FHl fHl = this.A05;
            fHl.getClass();
            fHl.A04(this.A02);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void A01(Exg exg) {
        this.A01 = exg;
        this.A02.addTextChangedListener(new ECs(this, 2));
        FYa.A00(this.A02, this, 8);
        FXq.A01(this.A00, this, 13);
    }
}
