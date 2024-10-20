package X;

import android.content.Intent;

/* renamed from: X.18k, reason: invalid class name */
/* loaded from: 18k.class */
public final class C18k implements 09F {
    public final Intent A00;
    public final 05S A01;
    public final String A02;

    public C18k(Intent intent, 05S r303, String str) {
        this.A01 = r303;
        this.A00 = intent;
        this.A02 = str == null ? "FBNS_DEFAULT_DOMAIN" : str;
    }

    public boolean BXE() {
        try {
            D8y();
            return true;
        } catch (0Mc e) {
            0fH.A0u("FBNS_DEFAULT_DOMAIN", "Error verifying signature", e);
            return false;
        }
    }

    public boolean BXF() {
        0EV r0 = new 0EV();
        r0.A01 = 02P.A03(((AnonymousClass096) C08r.A00).A07);
        r0.A04(this.A02);
        r0.A01();
        return r0.A00().A02(this.A01.A00, this.A00, (C0w6) null);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0w6, X.15e, java.lang.Object] */
    public void D8y() {
        0Mc r0;
        0EV r02 = new 0EV();
        r02.A01 = 02P.A03(((AnonymousClass096) C08r.A00).A07);
        r02.A04(this.A02);
        r02.A01();
        0EW A00 = r02.A00();
        ?? obj = new Object();
        if (!A00.A02(this.A01.A00, this.A00, (C0w6) obj) && (r0 = obj.A00) != null) {
            throw r0;
        }
    }
}
