package com.facebook.messaging.rtc.incall.impl.incoming;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2QN;
import X.2QO;
import X.4YU;
import X.4YV;
import X.AnonymousClass001;
import X.Bmb;
import X.C1u2;
import X.C1u3;
import X.C34;
import X.CPw;
import X.CZF;
import X.IDw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.resources.ui.FbButton;

/* loaded from: IncomingCallButtonsView.class */
public final class IncomingCallButtonsView extends LinearLayout {
    public Bmb A00;
    public FbButton A01;
    public FbButton A02;
    public FbButton A03;
    public final 1Br A04;
    public final 2QO A05;
    public final FbUserSession A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncomingCallButtonsView(Context context) {
        super(context);
        11T.A0F(context, 1);
        Context A08 = 4YU.A08(this);
        this.A04 = 1Bu.A01(A08, 85075);
        FbUserSession A01 = IDw.A01(this, "IncomingCallButtonsView");
        this.A06 = A01;
        this.A05 = (2QO) 1Lm.A05(A08, A01, 99977);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncomingCallButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        Context A08 = 4YU.A08(this);
        this.A04 = 1Bu.A01(A08, 85075);
        FbUserSession A01 = IDw.A01(this, "IncomingCallButtonsView");
        this.A06 = A01;
        this.A05 = (2QO) 1Lm.A05(A08, A01, 99977);
        A00(context);
    }

    private final void A00(Context context) {
        String string;
        LayoutInflater.from(context).inflate(2132542171, this);
        this.A01 = (FbButton) requireViewById(2131362057);
        this.A02 = (FbButton) requireViewById(2131363577);
        FbButton fbButton = (FbButton) requireViewById(2131366783);
        this.A03 = fbButton;
        if (fbButton == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        fbButton.setVisibility(8);
        2QN r0 = this.A05;
        if (r0.A0V && (string = context.getString(2131957875)) != null) {
            FbButton fbButton2 = this.A01;
            if (fbButton2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            fbButton2.setText(string);
        }
        C1u2 A0I = 4YV.A0I();
        int i = 2132410965;
        if (r0.A0V) {
            i = 2132411021;
        }
        C1u3 c1u3 = ((C34) 1Br.A0B(this.A04)).A00() ? C1u3.A1C : C1u3.A4n;
        Resources resources = getResources();
        11T.A0A(resources);
        Drawable A00 = CPw.A00(resources, 2132410964, A0I.A03(c1u3));
        Drawable A002 = CPw.A00(resources, i, A0I.A00());
        Drawable A003 = CPw.A00(resources, 2132411020, A0I.A03(C1u3.A4K));
        FbButton fbButton3 = this.A01;
        if (fbButton3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        fbButton3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, A00, (Drawable) null, (Drawable) null);
        FbButton fbButton4 = this.A02;
        if (fbButton4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        fbButton4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, A002, (Drawable) null, (Drawable) null);
        FbButton fbButton5 = this.A03;
        if (fbButton5 != null) {
            fbButton5.setCompoundDrawablesWithIntrinsicBounds(A003, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        FbButton fbButton6 = this.A01;
        if (fbButton6 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        CZF.A01(fbButton6, this, 56);
        FbButton fbButton7 = this.A02;
        if (fbButton7 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        CZF.A01(fbButton7, this, 57);
        FbButton fbButton8 = this.A03;
        if (fbButton8 != null) {
            CZF.A01(fbButton8, this, 58);
        }
    }
}
