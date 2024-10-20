package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Ibm.class */
public final class Ibm implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ MailboxCallback A04;
    public final /* synthetic */ MailboxCallback A05;
    public final /* synthetic */ GsM A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public Ibm(MailboxCallback mailboxCallback, MailboxCallback mailboxCallback2, GsM gsM, String str, String str2, long j, long j2, long j3, long j4, boolean z) {
        this.A09 = z;
        this.A06 = gsM;
        this.A03 = j;
        this.A07 = str;
        this.A02 = j2;
        this.A08 = str2;
        this.A01 = j3;
        this.A00 = j4;
        this.A04 = mailboxCallback;
        this.A05 = mailboxCallback2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1qX r0 = (1qX) ((MailboxNullable) obj).value;
        long j = (r0 == null || 1qX.A00(r0) <= 0) ? 0L : r0.mResultSet.getLong(0, 0);
        if (!this.A09) {
            GsM gsM = this.A06;
            long j2 = this.A00;
            long j3 = this.A03;
            gsM.A01(this.A04, this.A05, (Number) null, this.A07, this.A08, 1, j2, j3, this.A01, this.A02, j, true);
            return;
        }
        GsM gsM2 = this.A06;
        long j4 = this.A03;
        String str = this.A07;
        long j5 = this.A02;
        String str2 = this.A08;
        long j6 = this.A01;
        long j7 = this.A00;
        MailboxCallback mailboxCallback = this.A04;
        1Um AQV = gsM2.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, mailboxCallback);
        1Um.A02(AQV, new Ibh(A0Q, gsM2, str, str2, 1, j4, j5, j6, j7), A0Q, false);
    }
}
