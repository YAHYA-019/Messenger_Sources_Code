package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.9gz, reason: invalid class name */
/* loaded from: 9gz.class */
public final class C9gz {
    public final 1xA A00;
    public final 8yZ A01;

    public C9gz(1Uj r302) {
        11T.A0F(r302, 1);
        MailboxFeature mailboxFeature = new MailboxFeature(r302);
        MailboxFeature mailboxFeature2 = new MailboxFeature(r302);
        this.A01 = mailboxFeature;
        this.A00 = mailboxFeature2;
    }

    public static final 1xH A00(96N r301, C9gz c9gz, String str) {
        1xH r0 = new 1xH();
        8yZ r02 = c9gz.A01;
        Integer valueOf = Integer.valueOf(r301.id);
        1Um A0R = 1BL.A0R(r02);
        MailboxFutureImpl A0P = 1BK.A0P(A0R);
        1Um.A02(A0R, new A1Y(A0P, r02, valueOf, str, 9), A0P, false);
        A1d.A01(A0P, r0, 8);
        return r0;
    }

    public final 1xH A01(96N r302, String str, String str2) {
        11T.A0F(str, 0);
        1xH r0 = new 1xH();
        8yZ r02 = this.A01;
        Integer valueOf = Integer.valueOf(r302.id);
        1Um A0R = 1BL.A0R(r02);
        MailboxFutureImpl A0P = 1BK.A0P(A0R);
        1Um.A02(A0R, new IbO(r02, A0P, valueOf, str, str2, 1), A0P, false);
        A1d.A01(A0P, r0, 6);
        return r0;
    }
}
