package com.facebook.messaging.rtc.incall.impl.coplay.views;

import X.11T;
import X.1BK;
import X.1BL;
import X.1BV;
import X.2JX;
import X.2JY;
import X.4YU;
import X.7zL;
import X.7zP;
import X.7zR;
import X.AbstractC02343uw;
import X.AvQ;
import X.B0w;
import X.C06974ih;
import X.C07004ik;
import X.C07014il;
import X.C09964s0;
import X.C0A2;
import X.C1706Aqc;
import X.C7uL;
import X.E1r;
import X.FFo;
import X.RrM;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import java.util.BitSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CoplayNonJoinerView.class */
public final class CoplayNonJoinerView extends RelativeLayout {
    public final CallerContext A00;
    public final LithoView A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayNonJoinerView(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoplayNonJoinerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A00 = CallerContext.A0B("CoplayNonJoinerView");
        LayoutInflater.from(context).inflate(2132541776, this);
        this.A01 = (LithoView) findViewById(2131365983);
        setBackground(getContext().getDrawable(2132410614));
    }

    public /* synthetic */ CoplayNonJoinerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void A00(FbUserSession fbUserSession, RrM rrM, E1r e1r) {
        boolean A1X = 1BL.A1X(fbUserSession, e1r);
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            boolean z = false;
            setVisibility(0);
            Context A08 = 4YU.A08(this);
            1BV A0R = 7zL.A0R(A08, 67677);
            AvQ avQ = new AvQ(7zL.A0W(A08), new B0w());
            B0w b0w = avQ.A01;
            b0w.A00 = fbUserSession;
            BitSet bitSet = avQ.A02;
            bitSet.set(2);
            b0w.A04 = e1r;
            bitSet.set(6);
            b0w.A05 = this;
            bitSet.set(5);
            b0w.A03 = rrM.A06;
            bitSet.set(A1X ? 1 : 0);
            b0w.A08 = rrM.A0B;
            bitSet.set(8);
            if (rrM.A0C && ((FFo) A0R.get()).A0H) {
                z = true;
            }
            b0w.A07 = z;
            bitSet.set(7);
            b0w.A02 = rrM.A05;
            bitSet.set(0);
            b0w.A01 = rrM.A04;
            bitSet.set(3);
            b0w.A06 = rrM.A07;
            bitSet.set(4);
            7zP.A18(avQ, bitSet, avQ.A03);
            lithoView.A0x(b0w);
        }
    }

    public final void A01(C09964s0 c09964s0, C1706Aqc c1706Aqc) {
        View findViewById;
        int i;
        String A0l;
        11T.A0F(c09964s0, 1);
        2JX A0u = c1706Aqc.A0u();
        if (A0u == null || (findViewById = findViewById(2131362341)) == null) {
            return;
        }
        View findViewById2 = findViewById(2131364362);
        11T.A0A(findViewById2);
        2JY A0B = 1BK.A0B(A0u, 2JX.class, -291760, -1172877190);
        if (A0B == null || (A0l = A0B.A0l()) == null) {
            i = 4;
        } else {
            Uri uri = null;
            try {
                uri = C0A2.A03(A0l);
            } catch (SecurityException unused) {
            }
            C07004ik A0H = 7zR.A0H();
            ((C07014il) A0H).A06 = AbstractC02343uw.A01(c09964s0.A08(), c09964s0.A06());
            C7uL.A00(uri, findViewById, new C06974ih(A0H), this.A00);
            i = 0;
        }
        findViewById.setVisibility(i);
        findViewById2.setVisibility(i);
    }
}
