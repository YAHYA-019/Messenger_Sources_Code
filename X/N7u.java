package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7u.class */
public final class N7u implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ MailboxFutureImpl A08;
    public final /* synthetic */ 22C A09;
    public final /* synthetic */ Boolean A0A;
    public final /* synthetic */ Number A0B;
    public final /* synthetic */ Number A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;

    public N7u(MailboxFutureImpl mailboxFutureImpl, 22C r303, Boolean bool, Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3) {
        this.A09 = r303;
        this.A01 = i;
        this.A08 = mailboxFutureImpl;
        this.A00 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A07 = j;
        this.A06 = j2;
        this.A05 = j3;
        this.A0H = str;
        this.A0G = str2;
        this.A0B = number;
        this.A0E = str3;
        this.A0D = str4;
        this.A0J = str5;
        this.A0A = bool;
        this.A0I = str6;
        this.A0C = number2;
        this.A0F = str7;
        this.A0K = str8;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", AbE.A00(706), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A08;
        N26 n26 = new N26(null, null);
        N85 A00 = N85.A00(this, ActionId.RTMP_CONNECTION_INTERCEPTED);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, n26, 0, 1, "MCAMailboxTam", "TamClientNoteGifReply", A00);
    }
}
