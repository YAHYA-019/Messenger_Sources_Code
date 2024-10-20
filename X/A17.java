package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.Attachment;
import com.facebook.msys.mci.VideoEdits;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$ProductMetadata;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: A17.class */
public final class A17 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Attachment A04;
    public final /* synthetic */ VideoEdits A05;
    public final /* synthetic */ MailboxSDK$ProductMetadata A06;
    public final /* synthetic */ 5P8 A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;

    public A17(MailboxFutureImpl mailboxFutureImpl, Attachment attachment, VideoEdits videoEdits, MailboxSDK$ProductMetadata mailboxSDK$ProductMetadata, 5P8 r306, Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        this.A07 = r306;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A02 = j;
        this.A04 = attachment;
        this.A0E = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A0C = str4;
        this.A09 = number;
        this.A0B = str5;
        this.A05 = videoEdits;
        this.A0G = str6;
        this.A08 = number2;
        this.A0A = str7;
        this.A06 = mailboxSDK$ProductMetadata;
        this.A0J = z;
        this.A0I = z2;
        this.A0H = z3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1476), this.A00);
        String A1D = 7zM.A1D(5P8.A00, 26);
        NotificationScope A00 = A1k.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 35);
        this.A03.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVIJOOOOOOOOOOOOOOOOOZZZZZ(68, this.A01, this.A02, mailbox, this.A04, this.A0E, this.A0F, this.A0D, this.A0C, this.A09, null, this.A0B, this.A05, this.A0G, this.A08, this.A0A, this.A06, null, null, A00, true, this.A0J, true, this.A0I, this.A0H);
    }
}
