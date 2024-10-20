package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$EncryptedStickerParams;
import com.facebook.sdk.mca.MailboxSDK$Reply;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: A13.class */
public final class A13 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ LoggingOption A03;
    public final /* synthetic */ MailboxSDK$EncryptedStickerParams A04;
    public final /* synthetic */ MailboxSDK$Reply A05;
    public final /* synthetic */ 5P8 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ byte[] A0B;

    public A13(MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$EncryptedStickerParams mailboxSDK$EncryptedStickerParams, MailboxSDK$Reply mailboxSDK$Reply, 5P8 r307, String str, String str2, String str3, String str4, byte[] bArr, int i) {
        this.A06 = r307;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A01 = mailboxFutureImpl2;
        this.A0A = str;
        this.A04 = mailboxSDK$EncryptedStickerParams;
        this.A08 = str2;
        this.A0B = bArr;
        this.A09 = str3;
        this.A05 = mailboxSDK$Reply;
        this.A03 = loggingOption;
        this.A07 = str4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", "sendStickerPackAttachmentMessageWithThreadIdentifier", this.A00);
        C1qL c1qL = 5P8.A00;
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(c1qL, this.A02, mailbox);
        String A1D = 7zM.A1D(c1qL, 25);
        NotificationScope A00 = A1k.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 32);
        this.A01.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOOOOOO(13, mailbox, this.A0A, this.A04, this.A08, this.A0B, this.A09, this.A05, this.A03, null, this.A07, A00, listenForTaskCompletion);
    }
}
