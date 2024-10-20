package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7s.class */
public final class N7s implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ 6AO A05;
    public final /* synthetic */ MailboxFutureImpl A06;
    public final /* synthetic */ 22C A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;

    public N7s(6AO r302, MailboxFutureImpl mailboxFutureImpl, 22C r304, Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, long j, long j2) {
        this.A07 = r304;
        this.A00 = i;
        this.A06 = mailboxFutureImpl;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = j;
        this.A03 = j2;
        this.A0G = str;
        this.A05 = r302;
        this.A0F = str2;
        this.A0A = str3;
        this.A0H = str4;
        this.A0E = str5;
        this.A0B = str6;
        this.A0C = str7;
        this.A08 = number;
        this.A09 = number2;
        this.A0D = str8;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", 1BJ.A00(2008), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A06;
        N2A n2a = new N2A();
        N85 A00 = N85.A00(this, ActionId.VIEW_DID_LOAD_BEGIN);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, n2a, 0, 1, "MCAMailboxTam", "TamClientXmaShareWithText", A00);
    }
}
