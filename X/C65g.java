package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.65g, reason: invalid class name */
/* loaded from: 65g.class */
public final class C65g implements C64o {
    public final 1Br A00 = 1Bq.A00(33013);

    @Override // X.C64o
    public 1LI AKU(06Z r302, FbUserSession fbUserSession, 1Iw r304, 5zD r305, 64W r306, AnonymousClass622 anonymousClass622) {
        1BL.A1H(fbUserSession, anonymousClass622, r305);
        return new 8bA(fbUserSession, r305, r306, anonymousClass622, anonymousClass622.A0Z);
    }

    @Override // X.C64o
    public void Bac(AnonymousClass622 anonymousClass622) {
    }

    @Override // X.C64o
    public boolean Cyg(AnonymousClass622 anonymousClass622) {
        ThreadSummary threadSummary;
        boolean z = false;
        if (anonymousClass622 != null && (threadSummary = anonymousClass622.A05) != null) {
            C65h c65h = C65h.A04;
            11T.A0A(threadSummary.A0n);
            if (C65h.A01(c65h, threadSummary, anonymousClass622, false) && !((2yD) C65h.A02.A00.get()).AZr(1GD.A07, 36322001552884739L)) {
                String A0r = 4YV.A0r(1Br.A09(this.A00), 1NK.A4f);
                if (!c65h.A09() && A0r.length() > 0) {
                    z = 4YV.A1a(anonymousClass622.A0L, A0r, false);
                }
            }
        }
        return z;
    }
}
