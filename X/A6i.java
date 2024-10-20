package X;

import android.text.TextWatcher;
import android.view.KeyEvent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Set;

/* loaded from: A6i.class */
public final class A6i implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final FbUserSession A02;
    public final 9UT A03;
    public final 72W A04;
    public final C6xN A05 = new C6xN();
    public final 6wV A06;

    public A6i(9T6 r302) {
        9UT r0 = r302.A01;
        r0.getClass();
        this.A03 = r0;
        this.A04 = r302.A02;
        6wV r02 = r302.A03;
        r02.getClass();
        this.A06 = r02;
        FbUserSession fbUserSession = r302.A00;
        fbUserSession.getClass();
        this.A02 = fbUserSession;
        this.A00 = null;
    }

    public A6i(FbUserSession fbUserSession, 9UT r303, 72W r304, 6wV r305) {
        this.A03 = r303;
        this.A04 = r304;
        r305.getClass();
        this.A06 = r305;
        this.A02 = fbUserSession;
        this.A00 = null;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{6Sv.class, A5o.class, 7Rv.class, 7Af.class, 6Sw.class, 6Sg.class, C7Ah.class, 6qK.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AutoCompleteTextPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        6wV r313;
        ThreadKey BF7;
        if (r305 instanceof 6qK) {
            FbUserSession fbUserSession = this.A02;
            C9n0 c9n0 = (C9n0) this.A05.A00;
            1BL.A1F(c9n0, r305);
            6wV r0 = c9n0.A08;
            int i = r0.B9o().A01;
            int i2 = r0.B9o().A00;
            72W r02 = c9n0.A06;
            if (r02 == null || (BF7 = r02.BF7()) == null) {
                return;
            }
            if ((BF7.A1K() || BF7.A1F()) && ((6kG) 1Br.A0B(c9n0.A01)).A01(fbUserSession) && !c9n0.A09.get() && !r0.BV8()) {
                boolean andSet = c9n0.A04.A00.getAndSet(false);
                int spanStart = r0.getSpanStart(c9n0.A0A.getValue());
                if (spanStart == -1) {
                    spanStart = 7zN.A04(r0);
                }
                if (i == spanStart && i2 == spanStart && C9n0.A05(c9n0)) {
                    C9n0.A03(c9n0);
                    return;
                }
                if (i < spanStart || i2 < spanStart || !C9n0.A05(c9n0)) {
                    C9n0.A02(c9n0);
                    return;
                }
                if (i > spanStart || i2 > spanStart) {
                    if (andSet) {
                        C9n0.A00(fbUserSession, c9n0);
                        return;
                    } else {
                        c9n0.A00.postDelayed(new AEC(c9n0.A0B), 100);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (r305 instanceof 7Rv) {
            C9n0 c9n02 = (C9n0) this.A05.A00;
            11T.A0F(c9n02, 0);
            c9n02.A04.A00.set(true);
            return;
        }
        if (r305 instanceof A5o) {
            C9n0 c9n03 = (C9n0) this.A05.A00;
            A5o a5o = (A5o) r305;
            boolean A1W = 1BL.A1W(c9n03, a5o);
            RHa rHa = c9n03.A04;
            KeyEvent keyEvent = a5o.A00;
            if (keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21 || keyEvent.getKeyCode() == 22 || keyEvent.getKeyCode() == 19 || keyEvent.getKeyCode() == 20) {
                    rHa.A00.set(A1W);
                    return;
                }
                return;
            }
            return;
        }
        if ((r305 instanceof 7Af) || (r305 instanceof 6Sv) || (r305 instanceof 6Sw)) {
            C9n0 c9n04 = (C9n0) this.A05.A00;
            11T.A0F(c9n04, 0);
            7zO.A1X(c9n04.A05.A02);
            C9n0.A02(c9n04);
            return;
        }
        if (r305 instanceof 6Sg) {
            C9n0 c9n05 = (C9n0) this.A05.A00;
            11T.A0F(c9n05, 0);
            7zO.A1X(c9n05.A05.A02);
            r313 = c9n05.A08;
            if (7zN.A04(r313) <= 0) {
                return;
            }
        } else {
            if (!(r305 instanceof C7Ah)) {
                return;
            }
            C7Ah c7Ah = (C7Ah) r305;
            C9n0 c9n06 = (C9n0) this.A05.A00;
            boolean A1W2 = 1BL.A1W(c7Ah, c9n06);
            if (!c7Ah.A01) {
                ListenableFuture listenableFuture = c9n06.A05.A02;
                if (listenableFuture != null) {
                    listenableFuture.cancel(A1W2);
                }
                C9n0.A02(c9n06);
                return;
            }
            r313 = c9n06.A08;
            if (7zN.A04(r313) <= 0) {
                return;
            }
        }
        r313.Cgu();
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (this.A01) {
            return;
        }
        72W r0 = this.A04;
        C77v c77v = (C77v) c77n.AUP(C77v.class);
        9UT r02 = this.A03;
        6wV r03 = this.A06;
        FbUserSession fbUserSession = this.A02;
        C6xN c6xN = this.A05;
        11T.A0F(r303, 0);
        4YV.A1M(c77v, 3, c6xN);
        C9n0 c9n0 = new C9n0(fbUserSession, r02, r0, r303, r03);
        C79q c79q = c77v.A00;
        if (c79q == null) {
            c79q = new C79q(new TextWatcher[0]);
            C79s c79s = new C79s(c77v);
            c79s.A00 = c79q;
            c77n.ClL(new C77v(c79s));
        }
        c79q.A00(new Rj9(fbUserSession, c9n0));
        c6xN.A00 = c9n0;
        this.A01 = true;
    }
}
