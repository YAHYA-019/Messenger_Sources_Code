package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: Cyz.class */
public final class Cyz implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ MailboxFutureImpl A06;
    public final /* synthetic */ 5P8 A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;
    public final /* synthetic */ String A0K;
    public final /* synthetic */ String A0L;

    public Cyz(MailboxFutureImpl mailboxFutureImpl, 5P8 r303, Number number, Number number2, Number number3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, int i3, int i4, long j, long j2) {
        this.A07 = r303;
        this.A00 = i;
        this.A06 = mailboxFutureImpl;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A05 = j;
        this.A04 = j2;
        this.A0B = str;
        this.A0F = str2;
        this.A0G = str3;
        this.A0H = str4;
        this.A0I = str5;
        this.A0E = str6;
        this.A0K = str7;
        this.A0J = str8;
        this.A09 = number;
        this.A0L = str9;
        this.A0A = number2;
        this.A08 = number3;
        this.A0D = str10;
        this.A0C = str11;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        String A1D = 7zM.A1D(AbF.A0r(4YT.A00(1465), this.A00), 26);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 41);
        this.A06.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVIIIJJOOOOOOOOOOOOOOOOOOOOOOOO(62, this.A03, this.A02, this.A01, this.A05, this.A04, mailbox, this.A0B, this.A0F, this.A0G, this.A0H, this.A0I, null, this.A0E, null, null, null, null, this.A0K, this.A0J, this.A09, null, this.A0L, this.A0A, this.A08, null, this.A0D, this.A0C, A00, null);
    }
}
