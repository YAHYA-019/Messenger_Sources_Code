package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7x.class */
public final class N7x implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ MailboxFutureImpl A06;
    public final /* synthetic */ 22C A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ Number A0B;
    public final /* synthetic */ Number A0C;
    public final /* synthetic */ Number A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;
    public final /* synthetic */ String A0M;
    public final /* synthetic */ String A0N;
    public final /* synthetic */ String A0O;
    public final /* synthetic */ String A0P;
    public final /* synthetic */ String A0Q;

    public N7x(MailboxFutureImpl mailboxFutureImpl, 22C r303, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2, int i3, long j, long j2, long j3) {
        this.A07 = r303;
        this.A00 = i;
        this.A06 = mailboxFutureImpl;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = j;
        this.A05 = j2;
        this.A03 = j3;
        this.A0P = str;
        this.A0O = str2;
        this.A0N = str3;
        this.A0D = number;
        this.A0E = str4;
        this.A0F = str5;
        this.A0Q = str6;
        this.A0M = str7;
        this.A0A = number2;
        this.A09 = number3;
        this.A0J = str8;
        this.A0K = str9;
        this.A0B = number4;
        this.A0C = number5;
        this.A0G = str10;
        this.A0L = str11;
        this.A0I = str12;
        this.A0H = str13;
        this.A08 = number6;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", 1BJ.A00(2006), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A06;
        N28 n28 = new N28();
        N85 A00 = N85.A00(this, ActionId.VIEW_WILL_APPEAR_BEGIN);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, n28, 0, 1, "MCAMailboxTam", "TamClientXmaReplyWithText", A00);
    }
}
