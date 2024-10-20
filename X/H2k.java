package X;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.cowatch.player.plugins.controlbuttonsplugin.CoWatchPlayerControlButtonsPlugin;

/* loaded from: H2k.class */
public final class H2k extends H2l {
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final HGB A06;
    public final FbUserSession A07;
    public final CoWatchPlayerControlButtonsPlugin A08;
    public final HFY A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H2k(Context context, FbUserSession fbUserSession) {
        super(context, false);
        1BK.A1K(context, 1, fbUserSession);
        this.A07 = fbUserSession;
        this.A01 = GOn.A0X(context, fbUserSession);
        this.A05 = 1Lm.A00(context, fbUserSession, 115519);
        this.A02 = GOn.A0Y(context, fbUserSession);
        this.A03 = 1Bq.A00(115528);
        this.A04 = 1Lm.A00(context, fbUserSession, 99500);
        this.A09 = new Gps(this, 1);
        this.A06 = new Gpl(this, 0);
        GPl.A02(this, 12);
        this.A08 = C09s.A01(this, 2131366595);
    }

    public String A0H() {
        return "CoWatchVideoControlPlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0J() {
        super.A0J();
        6U2 r0 = this.A06;
        if (r0 != null) {
            r0.A06(new 6dQ());
        }
    }

    @Override // X.H2l
    public void A0M() {
        super.A0M();
        C00i c00i = this.A01.A00;
        ((IMK) c00i.get()).A0A(this.A06);
        c00i.get();
        GOp.A0V(this.A05).A07(this.A09);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.H2l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2k.A0e(X.6TI, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.H2l
    public void A0l() {
        6cT r0 = this.A07;
        if (r0 == null || !r0.BWa()) {
            return;
        }
        super.A0l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.6U5] */
    @Override // X.H2l
    public void A0n(long j) {
        if (this.A0D) {
            return;
        }
        C00i c00i = this.A02.A00;
        if (GOq.A1O(c00i)) {
            return;
        }
        this.A08.A0o();
        if (GOp.A0V(this.A05).A06 && !GOq.A1O(c00i)) {
            GOp.A0R(this.A01).A0B(0S2.A01);
        }
        super.A0n(j);
        bringToFront();
        6U2 r0 = this.A06;
        if (r0 != null) {
            r0.A06((6U5) new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.6U5] */
    @Override // X.H2l
    public void A0o(long j, boolean z) {
        super.A0o(j, z);
        6U2 r0 = this.A06;
        if (r0 != null) {
            r0.A06((6U5) new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.H2l
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = 0FI.A05(-14835425);
        boolean z = false;
        11T.A0F(motionEvent, 0);
        if (this.A0D) {
            i = 2132756825;
        } else {
            I99.A00(this.A04);
            z = this.A00 ? true : super.onTouchEvent(motionEvent);
            i = -880866438;
        }
        0FI.A0B(i, A05);
        return z;
    }
}
