package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;

/* loaded from: Iba.class */
public final class Iba implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ C00i A03;
    public final /* synthetic */ C00i A04;
    public final /* synthetic */ JFR A05;
    public final /* synthetic */ C10264sx A06;
    public final /* synthetic */ String A07;

    public Iba(FbUserSession fbUserSession, C00i c00i, C00i c00i2, JFR jfr, C10264sx c10264sx, String str, long j, long j2) {
        this.A04 = c00i;
        this.A01 = j;
        this.A00 = j2;
        this.A05 = jfr;
        this.A06 = c10264sx;
        this.A03 = c00i2;
        this.A07 = str;
        this.A02 = fbUserSession;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        11T.A0F(mailboxNullable, 0);
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "AdvancedCrypto", 4YT.A00(209));
        11T.A0A(newPrivacyContextNative);
        1qX r0 = (1qX) mailboxNullable.value;
        if (r0 != null && 1qX.A00(r0) > 0 && r0.mResultSet.getNullableLong(0, 0) != null) {
            C00683ob c00683ob = (C00683ob) this.A04.get();
            long j = this.A01;
            long j2 = this.A00;
            1Um A0O = 1BK.A0O(c00683ob, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            1Um.A02(A0O, new A1Z(A0P, newPrivacyContextNative, c00683ob, 5, j, j2), A0P, false);
            JFR jfr = this.A05;
            Long nullableLong = r0.mResultSet.getNullableLong(0, 0);
            if (nullableLong == null) {
                throw 1BK.A0h();
            }
            jfr.Bq2(nullableLong.longValue());
            return;
        }
        C10264sx c10264sx = this.A06;
        if (C1gb.A02((C1gb) 1Br.A0B(c10264sx.A04)).AZk(36322280724645136L)) {
            C00683ob c00683ob2 = (C00683ob) this.A04.get();
            long j3 = this.A01;
            long j4 = this.A00;
            1Um A0O2 = 1BK.A0O(c00683ob2, 0);
            MailboxFutureImpl A0P2 = 1BK.A0P(A0O2);
            1Um.A02(A0O2, new A1Z(A0P2, newPrivacyContextNative, c00683ob2, 6, j3, j4), A0P2, false);
            C00i c00i = this.A03;
            String str = this.A07;
            A0P2.addResultCallback(new Ibb(this.A02, c00i, this.A05, c10264sx, newPrivacyContextNative, str, 1, j3));
        }
    }
}
