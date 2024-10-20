package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7p.class */
public final class N7p implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ 1yC A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ Number A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;

    public N7p(MailboxFutureImpl mailboxFutureImpl, 1yC r303, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3) {
        this.A04 = r303;
        this.A03 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A0G = str;
        this.A0A = number;
        this.A0F = str2;
        this.A0B = number2;
        this.A05 = number3;
        this.A0C = str3;
        this.A0D = str4;
        this.A07 = number4;
        this.A06 = number5;
        this.A0E = str5;
        this.A09 = number6;
        this.A08 = number7;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        N85 A00 = N85.A00(this, ActionId.RTMP_CONNECTION_CONNECTED);
        String A002 = 1BJ.A00(784);
        C1qL c1qL = 1yC.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, A002, "StoryOptimisticCreate", A00);
    }
}
