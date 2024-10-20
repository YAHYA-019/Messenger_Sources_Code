package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: N7n.class */
public final class N7n implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ MailboxFutureImpl A06;
    public final /* synthetic */ 22C A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;

    public N7n(MailboxFutureImpl mailboxFutureImpl, 22C r303, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, long j, long j2, long j3) {
        this.A07 = r303;
        this.A01 = i;
        this.A06 = mailboxFutureImpl;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = j;
        this.A04 = j2;
        this.A03 = j3;
        this.A09 = str;
        this.A0E = str2;
        this.A0D = str3;
        this.A0C = str4;
        this.A0A = str5;
        this.A08 = str6;
        this.A0B = str7;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4uZ.A06("MailboxTam", GOm.A00(339), this.A01);
        MailboxFutureImpl mailboxFutureImpl = this.A06;
        N27 n27 = new N27(null, null);
        N85 A00 = N85.A00(this, ActionId.RTMP_CONNECTION_FAILED);
        C1qL c1qL = 22C.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, n27, 0, 1, "MCAMailboxTam", "TamClientNoteStickerReply", A00);
    }
}
