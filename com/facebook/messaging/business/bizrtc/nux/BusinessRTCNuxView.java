package com.facebook.messaging.business.bizrtc.nux;

import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.7zO;
import X.C15h;
import X.CZD;
import X.DBU;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.businessrtc.NeueNuxBusinessRTCNuxFragment;
import com.facebook.widget.CustomLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: BusinessRTCNuxView.class */
public final class BusinessRTCNuxView extends CustomLinearLayout implements CallerContextable {
    public NeueNuxBusinessRTCNuxFragment A00;
    public final View.OnClickListener A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final LithoView A06;
    public final C15h A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BusinessRTCNuxView(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessRTCNuxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A03 = 1BK.A0E();
        this.A05 = 1Bu.A01(context, 84855);
        this.A07 = DBU.A00;
        this.A04 = 1Bu.A00(68140);
        this.A02 = 1Bu.A00(68141);
        LithoView A0V = 7zO.A0V(context);
        this.A06 = A0V;
        this.A01 = CZD.A00(this, 35);
        addView(A0V, new ViewGroup.LayoutParams(-1, -1));
    }

    public /* synthetic */ BusinessRTCNuxView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
