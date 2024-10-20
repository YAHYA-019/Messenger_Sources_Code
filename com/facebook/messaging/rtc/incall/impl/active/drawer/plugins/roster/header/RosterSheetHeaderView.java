package com.facebook.messaging.rtc.incall.impl.active.drawer.plugins.roster.header;

import X.0FI;
import X.11T;
import X.1BL;
import X.1Bn;
import X.AbL;
import X.AwR;
import X.B12;
import X.GrK;
import X.I6F;
import X.IDw;
import X.IKE;
import X.IZR;
import X.JDB;
import X.JPO;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;

/* loaded from: RosterSheetHeaderView.class */
public final class RosterSheetHeaderView extends LithoView implements JPO {
    public GrK A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RosterSheetHeaderView(Context context) {
        super(context, (AttributeSet) null);
        11T.A0F(context, 1);
        AbL.A11(((LithoView) this).A09, this);
        1Bn.A0A(147711);
        this.A00 = new GrK(getContext(), IDw.A01(this, "RosterSheetHeaderView"), I6F.A01(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RosterSheetHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        1BL.A1F(context, attributeSet);
        AbL.A11(((LithoView) this).A09, this);
        1Bn.A0A(147711);
        this.A00 = new GrK(getContext(), IDw.A01(this, "RosterSheetHeaderView"), I6F.A01(this));
    }

    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        IZR izr = (IZR) jdb;
        11T.A0F(izr, 0);
        AwR A00 = B12.A00(((LithoView) this).A09);
        A00.A2X(izr.A00);
        A00.A2Y(izr.A01);
        if (izr.A02) {
            String string = getContext().getString(2131965222);
            B12 b12 = A00.A01;
            b12.A04 = string;
            b12.A01 = IKE.A00(this, ActionId.APP_DID_BECOME_ACTIVE);
        }
        A0x(A00.A2W());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.litho.BaseMountingView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-266064755);
        super.onAttachedToWindow();
        this.A00.A0Y(this);
        0FI.A0C(-2055235223, A06);
    }

    @Override // com.facebook.litho.BaseMountingView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-625810722);
        this.A00.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-2041471307, A06);
    }
}
