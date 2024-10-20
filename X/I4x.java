package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.raisehands.gen.RaiseHandModel;
import com.facebook.rsys.raisehands.gen.RaiseHandsApi;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: I4x.class */
public final class I4x {
    public RaiseHandModel A00;
    public List A01;
    public boolean A02;
    public final 1De A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final CopyOnWriteArraySet A0A;
    public final 2JM A0B;
    public final 2QY A0C;

    public I4x(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        this.A0A = GOn.A1J();
        this.A01 = C0ty.A00;
        1BY r0 = r303.A00;
        this.A06 = 1Bu.A03(r0, 115703);
        this.A07 = 1Lm.A03(fbUserSession, r0, 114845);
        this.A09 = GOn.A0g(fbUserSession, r0);
        this.A08 = 1Bq.A00(115044);
        this.A05 = 1Bq.A00(115043);
        this.A04 = GOn.A0k(fbUserSession, r0);
        this.A0C = Gys.A00(this, 22);
        this.A0B = IY8.A01(this, 40);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x02e6, code lost:
    
        if (r0.lowerHandReminderState == 1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.I4x r301, X.2JS r302) {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4x.A00(X.I4x, X.2JS):void");
    }

    public void A01(HFb hFb) {
        11T.A0F(hFb, 0);
        CopyOnWriteArraySet copyOnWriteArraySet = this.A0A;
        if (copyOnWriteArraySet.isEmpty()) {
            C00i c00i = this.A09.A00;
            GOq.A1H(this.A0B, GOo.A0R(c00i), HAp.A0J);
            A00(this, GOq.A0o(c00i));
            GOp.A0u(this.A04).A67(this.A0C);
        }
        copyOnWriteArraySet.add(hFb);
    }

    public void A02(HFb hFb) {
        11T.A0F(hFb, 0);
        CopyOnWriteArraySet copyOnWriteArraySet = this.A0A;
        copyOnWriteArraySet.remove(hFb);
        if (copyOnWriteArraySet.isEmpty()) {
            GOp.A0u(this.A04).CeZ(this.A0C);
            GOp.A0O(this.A09).A02(this.A0B);
        }
    }

    public void A03(boolean z) {
        ((RaiseHandsApi) 1De.A00(this.A03, 115732)).setIsRaised(z);
    }
}
