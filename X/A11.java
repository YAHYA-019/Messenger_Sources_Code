package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: A11.class */
public final class A11 implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C9eP A03;
    public final /* synthetic */ 9hK A04;
    public final /* synthetic */ MailboxCallback A05;
    public final /* synthetic */ GsM A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public A11(C9eP c9eP, 9hK r303, MailboxCallback mailboxCallback, GsM gsM, Integer num, Integer num2, String str, String str2, long j, long j2, long j3) {
        this.A0A = str;
        this.A03 = c9eP;
        this.A04 = r303;
        this.A09 = str2;
        this.A08 = num;
        this.A06 = gsM;
        this.A00 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A07 = num2;
        this.A05 = mailboxCallback;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1qX A14 = 7zM.A14((MailboxNullable) obj);
        if (A14 != null) {
            if (1qX.A00(A14) < 1) {
                0fH.A0k("HTReactions", 0Pz.A0W("Unable to fetch FBId for reaction ", this.A0A));
                0fH.A0j("HTReactions", 0Pz.A1C("Reaction upsert status: ", false));
                return;
            }
            long A07 = 7zM.A07(A14);
            9hK r0 = this.A04;
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(r0.A00, r0.A01, 67248);
            String str = this.A09;
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            1Um.A02(A0O, new A0R(mailboxFeature, A0P, str, 1, A07), A0P, false);
            Integer num = this.A08;
            GsM gsM = this.A06;
            long j = this.A00;
            long j2 = this.A02;
            long j3 = this.A01;
            A0P.addResultCallback(new A10(r0, this.A05, gsM, num, str, this.A0A, j, j2, A07, j3));
        }
    }
}
