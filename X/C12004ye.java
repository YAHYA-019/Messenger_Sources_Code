package X;

import java.io.IOException;

/* renamed from: X.4ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ye.class */
public final class C12004ye {
    public final C01s A00;
    public final AnonymousClass243 A01;

    public C12004ye() {
        AnonymousClass243 anonymousClass243 = (AnonymousClass243) 1Bn.A0A(68334);
        C01s c01s = (C01s) 1Bi.A03(16511);
        this.A01 = anonymousClass243;
        this.A00 = c01s;
    }

    public final 60H A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (60H) this.A01.A0V(str, 60H.class);
        } catch (5DK e) {
            throw new IllegalArgumentException((Throwable) e);
        } catch (C2cb e2) {
            throw new IllegalArgumentException((Throwable) e2);
        } catch (IOException unused) {
            this.A00.D0v("XMA", "IO Exception when reading XMA from JSON string.");
            return null;
        }
    }

    public final String A01(5Pm r302) {
        if (r302 == null) {
            return null;
        }
        try {
            return this.A01.A0W(60H.A01(r302));
        } catch (2LD e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }
}
