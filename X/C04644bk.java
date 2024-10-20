package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bk.class */
public final class C04644bk {
    public final C00i A00 = new 1BQ(16967);
    public final 1Zj A01;

    public C04644bk(FbUserSession fbUserSession) {
        1G1 r0 = (1G1) fbUserSession;
        this.A01 = new 1Zj(r0.A05, r0.A04);
    }

    public static 2Jv A00(C04644bk c04644bk, int i) {
        2Jh r0 = (2Jh) c04644bk.A00.get();
        2Ji r02 = new 2Ji();
        r02.A05 = "<override-ignore>";
        r02.A00 = c04644bk.A01;
        return 2Jh.A01(r0, 2Jh.A02(new 2Jj(r02), i), i);
    }
}
