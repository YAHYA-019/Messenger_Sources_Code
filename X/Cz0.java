package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.facebook.search.mca.MailboxSearchJNI;
import java.util.List;

/* loaded from: Cz0.class */
public final class Cz0 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ PrivacyContext A01;
    public final /* synthetic */ C00683ob A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;
    public final /* synthetic */ boolean A0K;
    public final /* synthetic */ boolean A0L;

    public Cz0(MailboxFutureImpl mailboxFutureImpl, PrivacyContext privacyContext, C00683ob c00683ob, Number number, Number number2, Number number3, Number number4, String str, String str2, String str3, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A02 = c00683ob;
        this.A00 = mailboxFutureImpl;
        this.A07 = str;
        this.A0A = list;
        this.A09 = str2;
        this.A08 = str3;
        this.A05 = number;
        this.A04 = number2;
        this.A06 = number3;
        this.A03 = number4;
        this.A0B = list2;
        this.A01 = privacyContext;
        this.A0G = z;
        this.A0H = z2;
        this.A0L = z3;
        this.A0I = z4;
        this.A0E = z5;
        this.A0J = z6;
        this.A0F = z7;
        this.A0D = z8;
        this.A0K = z9;
        this.A0C = z10;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(C00683ob.A00, 0);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 52);
        this.A00.setNotification(A1D, A00);
        MailboxSearchJNI.dispatchVOOOOOOOOOOOOOZZZZZZZZZZZZ(0, mailbox, this.A07, this.A0A, this.A09, this.A08, this.A05, null, this.A04, this.A06, this.A03, this.A0B, this.A01, A00, this.A0G, this.A0H, this.A0L, this.A0I, false, false, this.A0E, this.A0J, this.A0F, this.A0D, this.A0K, this.A0C);
    }
}
