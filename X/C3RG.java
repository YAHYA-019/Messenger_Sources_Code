package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* renamed from: X.3RG, reason: invalid class name */
/* loaded from: 3RG.class */
public final class C3RG {
    public C3lt A00;
    public final C3NU A01;
    public final 3IU A02;
    public final C28z A03;
    public final LockBoxStorageManager A04;
    public final 3lS A05 = new 3ZT(this);
    public final boolean A06;

    public C3RG(C3NU c3nu, 3IU r303, C28z c28z, LockBoxStorageManager lockBoxStorageManager, boolean z) {
        this.A03 = c28z;
        this.A04 = lockBoxStorageManager;
        this.A01 = c3nu;
        this.A02 = r303;
        this.A06 = z;
    }

    public static final void A00(AnonymousClass999 anonymousClass999, 1xH r302, String str) {
        8EF r0;
        Exception exc = null;
        if ((anonymousClass999 instanceof 8EF) && (r0 = (8EF) anonymousClass999) != null) {
            exc = r0.A00;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("when ");
        A0k.append(str);
        0fH.A0n("LocalStorageManager", AnonymousClass001.A0Z(exc, " got Fetch TPID Error: ", A0k));
        r302.A04(new C19d(exc));
    }

    public final 1xH A01() {
        1xH r0 = new 1xH();
        C3lt c3lt = this.A00;
        if (c3lt != null) {
            c3lt.ATN("FETCH_TPID_API_START");
        }
        1xH.A00(this, r0, this.A01.A00(), 1);
        return r0;
    }

    public final 1xH A02() {
        1xH r0 = new 1xH();
        C3lt c3lt = this.A00;
        if (c3lt != null) {
            c3lt.ATN("FETCH_TPID_API_START");
        }
        1xH.A00(this, r0, this.A01.A00(), 5);
        return r0;
    }

    public final 1xH A03(String str) {
        11T.A0F(str, 0);
        1xH r0 = new 1xH();
        C3lt c3lt = this.A00;
        if (c3lt != null) {
            c3lt.ATN("FETCH_TPID_API_START");
        }
        this.A01.A00().A03(new C3Vs(r0, this, str, 0));
        return r0;
    }
}
