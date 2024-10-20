package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Ibk.class */
public final class Ibk implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxCallback A03;
    public final /* synthetic */ MailboxCallback A04;
    public final /* synthetic */ GsM A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public Ibk(MailboxCallback mailboxCallback, MailboxCallback mailboxCallback2, GsM gsM, String str, String str2, long j, long j2, long j3, boolean z) {
        this.A05 = gsM;
        this.A06 = str;
        this.A08 = z;
        this.A02 = j;
        this.A07 = str2;
        this.A01 = j2;
        this.A00 = j3;
        this.A03 = mailboxCallback;
        this.A04 = mailboxCallback2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1qX A14 = 7zM.A14((MailboxNullable) obj);
        if (A14 == null || 1qX.A00(A14) < 1) {
            return;
        }
        long j = A14.mResultSet.getLong(0, 0);
        GsM gsM = this.A05;
        String str = this.A06;
        boolean z = this.A08;
        long j2 = this.A02;
        Ibm ibm = new Ibm(this.A03, this.A04, gsM, str, this.A07, j2, j, this.A01, this.A00, z);
        1Um A0O = 1BK.A0O(gsM, 0);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, ibm);
        1Um.A02(A0O, new Ib5(gsM, A0Q, str, 1, j), A0Q, false);
    }
}
