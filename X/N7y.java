package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: N7y.class */
public final class N7y implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ 6AO A06;
    public final /* synthetic */ MailboxFutureImpl A07;
    public final /* synthetic */ 22C A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ Number A0B;
    public final /* synthetic */ Number A0C;
    public final /* synthetic */ Number A0D;
    public final /* synthetic */ Number A0E;
    public final /* synthetic */ Number A0F;
    public final /* synthetic */ Number A0G;
    public final /* synthetic */ Number A0H;
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
    public final /* synthetic */ List A0Y;

    public N7y(6AO r302, MailboxFutureImpl mailboxFutureImpl, 22C r304, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, Number number8, Number number9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, int i, int i2, int i3, int i4, long j, long j2) {
        this.A08 = r304;
        this.A01 = i;
        this.A07 = mailboxFutureImpl;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A05 = j;
        this.A04 = j2;
        this.A0V = str;
        this.A0U = str2;
        this.A0H = number;
        this.A0J = str3;
        this.A0K = str4;
        this.A0W = str5;
        this.A0X = str6;
        this.A0T = str7;
        this.A0D = number2;
        this.A0C = number3;
        this.A0L = str8;
        this.A0Q = str9;
        this.A0R = str10;
        this.A0E = number4;
        this.A0F = number5;
        this.A0M = str11;
        this.A0N = str12;
        this.A09 = number6;
        this.A0A = number7;
        this.A0O = str13;
        this.A0S = str14;
        this.A0P = str15;
        this.A0G = number8;
        this.A06 = r302;
        this.A0B = number9;
        this.A0I = str16;
        this.A0Y = list;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", 1BJ.A00(2007), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A07;
        N29 n29 = new N29();
        N85 A00 = N85.A00(this, 125);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, n29, 0, 1, "MCAMailboxTam", "TamClientXmaSendStandalone", A00);
    }
}
