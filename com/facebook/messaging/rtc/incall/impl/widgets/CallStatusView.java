package com.facebook.messaging.rtc.incall.impl.widgets;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.2Wo;
import X.4YU;
import X.7zM;
import X.C01i;
import X.C03i;
import X.DKF;
import X.GOq;
import X.GS2;
import X.GrR;
import X.HkW;
import X.IZl;
import X.J9t;
import X.JPS;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.messaging.ui.name.ThreadNameView;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.FbImageView;

/* loaded from: CallStatusView.class */
public final class CallStatusView extends FbFrameLayout implements JPS, CallerContextable {
    public int A00;
    public Chronometer A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public ViewSwitcher A05;
    public 1Iw A06;
    public LithoView A07;
    public ThreadNameView A08;
    public FbTextView A09;
    public FbImageView A0A;
    public 2Wo A0B;
    public boolean A0C;
    public LinearLayout A0D;
    public final 1Br A0E;
    public final C01i A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallStatusView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0E = 1Bu.A01(4YU.A08(this), 16980);
        this.A0F = J9t.A00(this, C03i.A02, 22);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0E = 1Bu.A01(4YU.A08(this), 16980);
        this.A0F = J9t.A00(this, C03i.A02, 22);
        A00();
    }

    private final void A00() {
        Context context;
        LayoutInflater from;
        int i;
        removeAllViewsInLayout();
        int A0A = GOq.A0A(this);
        this.A00 = A0A;
        if (A0A != 2 || this.A0C) {
            context = getContext();
            from = LayoutInflater.from(context);
            i = 2132541656;
        } else {
            context = getContext();
            from = LayoutInflater.from(context);
            i = 2132541657;
        }
        from.inflate(i, this);
        this.A06 = new 1Iw(context);
        LinearLayout linearLayout = (LinearLayout) requireViewById(2131367573);
        this.A0D = linearLayout;
        if (linearLayout == null) {
            throw 1BK.A0h();
        }
        this.A02 = (LinearLayout) linearLayout.findViewById(2131364521);
        this.A0A = (FbImageView) requireViewById(2131368367);
        this.A08 = (ThreadNameView) requireViewById(2131368012);
        this.A09 = (FbTextView) requireViewById(2131368015);
        this.A01 = (Chronometer) requireViewById(2131362799);
        this.A03 = DKF.A0F(this, 2131362800);
        this.A04 = DKF.A0F(this, 2131362803);
        this.A05 = (ViewSwitcher) requireViewById(2131362805);
        this.A07 = (LithoView) requireViewById(2131368017);
        View requireViewById = requireViewById(2131368499);
        11T.A0I(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        this.A0B = 2Wo.A00((ViewStub) requireViewById);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0163, code lost:
    
        if (r0.A0G != false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0625  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 1663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.widgets.CallStatusView.CfQ(X.JDB):void");
    }

    public void Cup(String str) {
        GrR grR = (GrR) 7zM.A1B(this.A0F);
        if (11T.A0O(grR.A03, str)) {
            return;
        }
        grR.A03 = str;
        GrR.A08(grR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1439481850);
        super.onAttachedToWindow();
        ((GS2) 7zM.A1B(this.A0F)).A0Y(this);
        0FI.A0C(376930666, A06);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A00 != configuration.orientation) {
            GrR grR = (GrR) 7zM.A1B(this.A0F);
            int i = configuration.orientation;
            HkW A00 = GrR.A00(grR);
            A00.A00 = i;
            grR.A0Z(new IZl(A00));
            GrR.A03(grR);
            GrR.A02(grR);
            GrR.A08(grR);
            GrR.A09(grR);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1201835579);
        ((GS2) 7zM.A1B(this.A0F)).A0X();
        super.onDetachedFromWindow();
        0FI.A0C(1025164247, A06);
    }
}
