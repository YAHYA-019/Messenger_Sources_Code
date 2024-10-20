package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: A10.class */
public final class A10 implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ 9hK A04;
    public final /* synthetic */ MailboxCallback A05;
    public final /* synthetic */ GsM A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public A10(9hK r302, MailboxCallback mailboxCallback, GsM gsM, Integer num, String str, String str2, long j, long j2, long j3, long j4) {
        this.A07 = num;
        this.A04 = r302;
        this.A06 = gsM;
        this.A00 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A08 = str;
        this.A01 = j4;
        this.A09 = str2;
        this.A05 = mailboxCallback;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1qX A14 = 7zM.A14((MailboxNullable) obj);
        long A07 = (A14 == null || 1qX.A00(A14) <= 0) ? 0L : 7zM.A07(A14);
        if (this.A07 == 0S2.A00) {
            GsM gsM = this.A06;
            long j = this.A00;
            long j2 = this.A03;
            long j3 = this.A02;
            String str = this.A08;
            long j4 = this.A01;
            String str2 = this.A09;
            MailboxCallback mailboxCallback = this.A05;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Incrementing reaction count for ");
            A0k.append(str2);
            A0k.append(" with current count=");
            A0k.append(A07);
            A0k.append(". ");
            A0k.append(j2);
            A0k.append(':');
            0fH.A0j("HTReactions", AnonymousClass001.A0d(str, A0k));
            gsM.A01(mailboxCallback, (MailboxCallback) null, 2, str, str2, 1, j, j2, j4, j3, A07, true);
            return;
        }
        if (A14 == null || !A14.mResultSet.getBoolean(0, 1) || A07 <= 0) {
            0fH.A0k("HTReactions", 0Pz.A0W("Unable to fetch FBId for reaction ", this.A09));
            return;
        }
        GsM gsM2 = this.A06;
        long j5 = this.A00;
        long j6 = this.A03;
        long j7 = this.A02;
        String str3 = this.A08;
        long j8 = this.A01;
        String str4 = this.A09;
        MailboxCallback mailboxCallback2 = this.A05;
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("Removing self-react for ");
        A0k2.append(str4);
        A0k2.append(". Current count=");
        A0k2.append(A07);
        A0k2.append(". ");
        A0k2.append(j6);
        A0k2.append(':');
        0fH.A0j("HTReactions", AnonymousClass001.A0d(str3, A0k2));
        gsM2.A01(mailboxCallback2, (MailboxCallback) null, 2, str3, str4, 3, j5, j6, j8, j7, A07, false);
    }
}
