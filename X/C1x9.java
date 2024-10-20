package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.1x9, reason: invalid class name */
/* loaded from: 1x9.class */
public final class C1x9 {
    public C1qM A00;
    public C1qM A01;
    public final C1x5 A02;
    public final C1x4 A03;
    public final 1xA A04;

    public C1x9(C1x5 c1x5, C1x4 c1x4, 1Uj r304) {
        this.A04 = new MailboxFeature(r304);
        this.A03 = c1x4;
        this.A02 = c1x5;
    }

    public static final 1xH A00(C1x9 c1x9, int i) {
        1xH r0 = new 1xH();
        if (!c1x9.A03.A00()) {
            A02(r0);
            return r0;
        }
        1xA r02 = c1x9.A04;
        Integer valueOf = Integer.valueOf(i);
        C3b7 c3b7 = new C3b7(r0, 0);
        1Um A0R = 1BL.A0R(r02);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0R, c3b7);
        1Um.A02(A0R, new LXK(r02, A0Q, valueOf, 4), A0Q, false);
        return r0;
    }

    public static final 1xH A01(C1x9 c1x9, KNf kNf, EnumC3487Mf6 enumC3487Mf6, C96p c96p) {
        1xH r0 = new 1xH();
        if (!c1x9.A03.A00()) {
            A02(r0);
            return r0;
        }
        Number number = null;
        Number number2 = kNf == KNf.A04 ? null : kNf.status;
        1xA r02 = c1x9.A04;
        Number number3 = c96p.type;
        if (enumC3487Mf6 != null) {
            number = enumC3487Mf6.type;
        }
        C3b5 c3b5 = new C3b5(c96p, r0, 4);
        1Um AQV = r02.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, c3b5);
        1Um.A00(AQV, new C3aw(2, r02, number2, number, A0Q, number3), A0Q);
        return r0;
    }

    public static final void A02(1xH r301) {
        1xH.A01(r301, new Exception("api disabled by GK"));
        0fH.A0k("EncryptedBackupsManagerApi", "api disabled by GK");
    }

    public final 1xH A03(Integer num) {
        1xH r0 = new 1xH();
        if (!this.A03.A00()) {
            A02(r0);
            return r0;
        }
        1xA r02 = this.A04;
        C3b5 c3b5 = new C3b5(this, r0, 1);
        1Um AQV = r02.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, c3b5);
        1Um.A00(AQV, new LXK(r02, A0Q, num, 2), A0Q);
        return r0;
    }
}
