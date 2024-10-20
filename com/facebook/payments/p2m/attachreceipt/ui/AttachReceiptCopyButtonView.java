package com.facebook.payments.p2m.attachreceipt.ui;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.3Eh;
import X.7zR;
import X.8Au;
import X.8Av;
import X.DKE;
import X.DKF;
import X.DKG;
import X.ERC;
import X.ERE;
import X.Fcg;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AttachReceiptCopyButtonView.class */
public final class AttachReceiptCopyButtonView extends CustomFrameLayout {
    public View.OnClickListener A00;
    public LinearLayout A01;
    public LithoView A02;
    public final 1Br A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttachReceiptCopyButtonView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttachReceiptCopyButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachReceiptCopyButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A03 = 1Bq.A00(99773);
        A0U(2132541782);
        this.A01 = (LinearLayout) DKG.A0B(this, 2131363400);
        this.A02 = (LithoView) DKG.A0B(this, 2131363399);
        A0V(context, false);
    }

    public /* synthetic */ AttachReceiptCopyButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public final void A0V(Context context, boolean z) {
        MigColorScheme A0c = 7zR.A0c(context);
        LithoView lithoView = this.A02;
        1Iw r0 = lithoView.A09;
        8Au A00 = 8Av.A00(r0);
        A00.A2Z(A0c);
        int i = 2131955129;
        if (z) {
            i = 2131955030;
        }
        A00.A2a(context.getText(i));
        Drawable A06 = ((Fcg) 1Br.A0B(this.A03)).A06(context, z ? 3Eh.A4o : 3Eh.A5y, ERC.A03, ERE.A02);
        11T.A0D(A06);
        A00.A01.A01 = A06;
        A00.A2b(true);
        A00.A2Y(this.A00);
        lithoView.A10(DKE.A0b(A00.A2W(), r0), true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        super.setOnClickListener(onClickListener);
    }
}
