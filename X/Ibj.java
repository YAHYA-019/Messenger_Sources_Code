package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: Ibj.class */
public final class Ibj implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ GsD A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public Ibj(MailboxFutureImpl mailboxFutureImpl, GsD gsD, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = gsD;
        this.A01 = mailboxFutureImpl;
        this.A00 = i;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A07 = z;
        this.A06 = z2;
        this.A08 = z3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, false, 0, 1, "MCAMailboxSticker", "IssueNewStickerSearchQuery", Ic0.A00(this, ActionId.MQTT_CONNECTING));
    }
}
