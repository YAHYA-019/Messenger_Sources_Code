package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.List;

/* loaded from: N7v.class */
public final class N7v implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ PrivacyContext A05;
    public final /* synthetic */ 2Tk A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ Number A0B;
    public final /* synthetic */ Number A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ List A0K;
    public final /* synthetic */ boolean A0L;
    public final /* synthetic */ boolean A0M;

    public N7v(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, PrivacyContext privacyContext, 2Tk r305, Boolean bool, Number number, Number number2, Number number3, Number number4, Number number5, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, int i2, long j, boolean z, boolean z2) {
        this.A06 = r305;
        this.A04 = mailboxFutureImpl;
        this.A03 = mailboxFutureImpl2;
        this.A05 = privacyContext;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A0E = str;
        this.A0J = str2;
        this.A0G = str3;
        this.A07 = bool;
        this.A0C = number;
        this.A09 = number2;
        this.A0I = str4;
        this.A0H = str5;
        this.A0B = number3;
        this.A0F = str6;
        this.A0D = str7;
        this.A08 = number4;
        this.A0K = list;
        this.A0A = number5;
        this.A0M = z;
        this.A0L = z2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, this.A03, false, 0, 1, MailboxFeature.listenForTaskCompletion(2Tk.A00, this.A04, mailbox), this.A05, "MCAMailboxStatus", "RichStatusOptimisticCreate", N85.A00(this, ActionId.VIDEO_PLAYING));
    }
}
