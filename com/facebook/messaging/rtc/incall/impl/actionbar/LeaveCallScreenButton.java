package com.facebook.messaging.rtc.incall.impl.actionbar;

import X.0FI;
import X.0NA;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.7zP;
import X.AbI;
import X.C00i;
import X.C01i;
import X.C1u2;
import X.C1u3;
import X.C2cn;
import X.C2rY;
import X.GOo;
import X.IKE;
import X.IKO;
import X.IZY;
import X.J9u;
import X.JDB;
import X.JPJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbui.widget.glyph.GlyphButton;

/* loaded from: LeaveCallScreenButton.class */
public final class LeaveCallScreenButton extends GlyphButton implements JPJ {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final C01i A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaveCallScreenButton(Context context) {
        super(context, null);
        11T.A0F(context, 1);
        this.A03 = J9u.A01(this, 19);
        this.A02 = 1BK.A0C();
        this.A01 = 7zM.A0U();
        this.A00 = 1Bu.A01(getContext(), 16980);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaveCallScreenButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A03 = J9u.A01(this, 19);
        this.A02 = 1BK.A0C();
        this.A01 = 7zM.A0U();
        this.A00 = 1Bu.A01(getContext(), 16980);
        A00();
    }

    private final void A00() {
        A02(-1);
        if (1Br.A07(this.A02).AZk(36320073111059475L)) {
            setOnLongClickListener(new IKO(this, 4));
        }
        setOnClickListener(IKE.A00(this, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES));
    }

    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        int i;
        C1u2 A0S;
        C1u3 c1u3;
        IZY izy = (IZY) jdb;
        11T.A0F(izy, 0);
        int i2 = izy.A00;
        if (i2 == 0) {
            setVisibility(8);
            return;
        }
        if (i2 != 1) {
            i = 2131964779;
            if (i2 == 2) {
                i = 2131964982;
                A0S = 7zP.A0S(this.A01);
                c1u3 = C1u3.A1X;
                C00i c00i = this.A00.A00;
                Drawable A0C = GOo.A0C(c1u3, A0S, 7zM.A11(c00i));
                setVisibility(0);
                GOo.A16(getContext(), this, i);
                setImageDrawable(A0C);
                setBackground(C2cn.A00(0NA.A02(r0, 2130970633, 0) / 2.0f, 0, 7zM.A11(c00i).B4f()));
            }
        } else {
            i = 2131965340;
        }
        boolean A00 = C2rY.A00(getContext());
        A0S = 7zP.A0S(this.A01);
        c1u3 = A00 ? C1u3.A0V : C1u3.A0U;
        C00i c00i2 = this.A00.A00;
        Drawable A0C2 = GOo.A0C(c1u3, A0S, 7zM.A11(c00i2));
        setVisibility(0);
        GOo.A16(getContext(), this, i);
        setImageDrawable(A0C2);
        setBackground(C2cn.A00(0NA.A02(r0, 2130970633, 0) / 2.0f, 0, 7zM.A11(c00i2).B4f()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(2066057537);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A03);
        0FI.A0C(-417831827, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-2083717908);
        AbI.A1X(this.A03);
        super.onDetachedFromWindow();
        0FI.A0C(1123322343, A06);
    }
}
