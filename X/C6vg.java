package X;

import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function2;

/* renamed from: X.6vg, reason: invalid class name */
/* loaded from: 6vg.class */
public final class C6vg {
    public int A00;
    public int A01;
    public C5fv A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final 1Br A07;
    public final ThreadKey A08;
    public final C15t A09;
    public final LifecycleOwner A0A;
    public final C6vf A0B;
    public final 0Xs A0C;

    public C6vg(LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, ThreadKey threadKey, C6vf c6vf, boolean z) {
        this.A08 = threadKey;
        this.A0B = c6vf;
        this.A0A = lifecycleOwner;
        this.A07 = 1Lm.A01(fbUserSession, 68739);
        0Ro A00 = 0Du.A00(C6vh.A0D);
        this.A0C = A00;
        this.A09 = A00;
        if (z) {
            0N2.A03(2Zy.A00(lifecycleOwner, 2Zo.A01()), new C0oe((Function2) new AJX(this, (0DR) null, 41), (0zV) ((9Q1) 1Br.A0B(this.A07)).A01, 3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.C6vg r301) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6vg.A00(X.6vg):void");
    }
}
