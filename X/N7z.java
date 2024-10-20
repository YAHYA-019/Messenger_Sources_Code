package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7z.class */
public final class N7z implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ 5oV A08;
    public final /* synthetic */ MailboxFutureImpl A09;
    public final /* synthetic */ 22C A0A;
    public final /* synthetic */ Number A0B;
    public final /* synthetic */ Number A0C;
    public final /* synthetic */ Number A0D;
    public final /* synthetic */ Number A0E;
    public final /* synthetic */ Number A0F;
    public final /* synthetic */ Number A0G;
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
    public final /* synthetic */ String A0R;
    public final /* synthetic */ String A0S;
    public final /* synthetic */ String A0T;
    public final /* synthetic */ String A0U;
    public final /* synthetic */ String A0V;
    public final /* synthetic */ String A0W;
    public final /* synthetic */ String A0X;
    public final /* synthetic */ String A0Y;

    public N7z(5oV r302, MailboxFutureImpl mailboxFutureImpl, 22C r304, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3) {
        this.A0A = r304;
        this.A00 = i;
        this.A09 = mailboxFutureImpl;
        this.A04 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A02 = i5;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A0V = str;
        this.A0U = str2;
        this.A0E = number;
        this.A0H = str3;
        this.A0I = str4;
        this.A0W = str5;
        this.A0T = str6;
        this.A0D = number2;
        this.A0C = number3;
        this.A0X = str7;
        this.A0Y = str8;
        this.A0F = number4;
        this.A0G = number5;
        this.A0S = str9;
        this.A0P = str10;
        this.A0O = str11;
        this.A0N = str12;
        this.A0R = str13;
        this.A0Q = str14;
        this.A08 = r302;
        this.A0J = str15;
        this.A0M = str16;
        this.A0L = str17;
        this.A0K = str18;
        this.A0B = number6;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", 1BJ.A00(2005), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A09;
        N2B n2b = new N2B();
        N85 A00 = N85.A00(this, ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, n2b, 0, 1, "MCAMailboxTam", "TamClientXmaReplyWithSticker", A00);
    }
}
