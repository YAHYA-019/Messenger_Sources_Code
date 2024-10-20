package com.facebook.messaging.rtc.incall.impl.expression;

import X.0FI;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1CO;
import X.1Du;
import X.1Fj;
import X.1Iw;
import X.4YU;
import X.4YV;
import X.7zL;
import X.7zQ;
import X.8TH;
import X.8oP;
import X.95M;
import X.AbI;
import X.AbstractC2326GOr;
import X.C01i;
import X.C09s;
import X.C81q;
import X.DKF;
import X.DKG;
import X.GOn;
import X.GOo;
import X.HAU;
import X.HCR;
import X.Hps;
import X.IML;
import X.IZo;
import X.IaZ;
import X.Irg;
import X.J4P;
import X.J9s;
import X.JDB;
import X.JFq;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ExpressionListControl.class */
public final class ExpressionListControl extends LinearLayout implements JFq {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Iw A03;
    public final LithoView A04;
    public final C01i A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressionListControl(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressionListControl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressionListControl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A00 = context;
        this.A05 = J9s.A01(this, 42);
        this.A02 = 1Bu.A01(context, 114892);
        this.A01 = GOn.A0R(context);
        LayoutInflater.from(context).inflate(2132541947, (ViewGroup) this, true);
        setClipChildren(false);
        this.A03 = new 1Iw(context);
        this.A04 = (LithoView) C09s.A01(this, 2131368346);
    }

    public /* synthetic */ ExpressionListControl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0127. Please report as an issue. */
    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        String str;
        1CO A06;
        long j;
        int i;
        Context A09;
        int i2;
        IZo iZo = (IZo) jdb;
        11T.A0F(iZo, 0);
        ImmutableList A00 = iZo.A00();
        11T.A0A(A00);
        int i3 = iZo.A00;
        Context context = this.A00;
        FbUserSession A0F = 4YV.A0F(context);
        boolean z = iZo.A03;
        if (z && i3 >= 0 && !A00.isEmpty()) {
            HCR hcr = (HCR) 4YU.A0q(A00, i3);
            IML A0L = AbstractC2326GOr.A0L(context, A0F);
            A0L.A0J(hcr, true, true);
            if (A0L.A02 == HAU.A06) {
                A0L.A0H(HAU.A05);
            }
        }
        if (z) {
            LithoView lithoView = this.A04;
            C81q.A00(lithoView);
            lithoView.setVisibility(0);
            GOo.A1C(lithoView);
            lithoView.animate().setDuration(200L).alpha(1.0f).withEndAction(J4P.A00);
            8TH A01 = 8oP.A01(this.A03);
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = A00.iterator();
            while (it.hasNext()) {
                HCR hcr2 = (HCR) it.next();
                Hps hps = (Hps) 1Br.A0B(this.A02);
                Resources A0E = GOn.A0E(this);
                if (hcr2 != null) {
                    switch (hcr2.ordinal()) {
                        case 1:
                            A09 = 7zL.A09();
                            i2 = 2131965336;
                            str = A09.getString(i2);
                            11T.A0A(str);
                            break;
                        case 3:
                            A09 = 7zL.A09();
                            i2 = 2131965334;
                            str = A09.getString(i2);
                            11T.A0A(str);
                            break;
                        case 4:
                            A09 = 7zL.A09();
                            i2 = 2131965337;
                            str = A09.getString(i2);
                            11T.A0A(str);
                            break;
                        case 5:
                            A09 = 7zL.A09();
                            i2 = 2131965333;
                            str = A09.getString(i2);
                            11T.A0A(str);
                            break;
                        case 7:
                            A06 = 1Br.A06(hps.A01);
                            j = 1189796324285088167L;
                            i = 2131965331;
                            str = A06.BD2(A0E, i, j);
                            11T.A0A(str);
                            break;
                        case 8:
                            A06 = 1Br.A06(hps.A01);
                            j = 1189796324285874602L;
                            i = 2131965332;
                            str = A06.BD2(A0E, i, j);
                            11T.A0A(str);
                            break;
                        case 11:
                            A09 = 7zL.A09();
                            i2 = 2131965335;
                            str = A09.getString(i2);
                            11T.A0A(str);
                            break;
                        case 12:
                            A09 = 7zL.A09();
                            i2 = 2131965339;
                            str = A09.getString(i2);
                            11T.A0A(str);
                            break;
                        case 13:
                            A09 = 7zL.A09();
                            i2 = 2131965338;
                            str = A09.getString(i2);
                            11T.A0A(str);
                            break;
                    }
                    builder.m11011add((Object) str);
                }
                str = "";
                builder.m11011add((Object) str);
            }
            A01.A2Y(1Fj.A01(builder));
            95M r0 = 95M.A03;
            8oP r02 = A01.A01;
            r02.A04 = r0;
            A01.A2X(7zQ.A0m(this.A01));
            r02.A02 = i3;
            r02.A0A = true;
            r02.A03 = new IaZ(A0F, this, iZo);
            lithoView.A0x(A01.A2W());
        } else {
            boolean isEmpty = A00.isEmpty();
            LithoView lithoView2 = this.A04;
            if (isEmpty) {
                GOo.A1C(lithoView2);
                lithoView2.animate().setDuration(200L).alpha(0.0f).withEndAction(new Irg(this));
            } else {
                lithoView2.setVisibility(4);
            }
        }
        IML A0L2 = AbstractC2326GOr.A0L(context, A0F);
        A0L2.A0A = z;
        Iterator it2 = A0L2.A0q.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-604578522);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A05);
        0FI.A0C(-1199991246, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1089976189);
        AbI.A1X(this.A05);
        super.onDetachedFromWindow();
        0FI.A0C(-1135866005, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        if (getParent() != null) {
            if (motionEvent.getAction() == 0) {
                GOn.A1O(this, true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                GOn.A1O(this, false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
