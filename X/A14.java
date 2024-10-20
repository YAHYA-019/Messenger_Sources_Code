package X;

import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxSDKVideoAttachment;
import com.facebook.msys.mca.MailboxSDKVideoAttachmentMessageOptionalParams;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$MediaSendOptions;
import com.facebook.sdk.mca.MailboxSDK$ProductMetadata;
import com.facebook.sdk.mca.MailboxSDK$Reply;
import com.facebook.sdk.mca.MailboxSDKJNI;

/* loaded from: A14.class */
public final class A14 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 5oV A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ MailboxSDKVideoAttachment A04;
    public final /* synthetic */ MailboxSDKVideoAttachmentMessageOptionalParams A05;
    public final /* synthetic */ LoggingOption A06;
    public final /* synthetic */ MailboxSDK$MediaSendOptions A07;
    public final /* synthetic */ MailboxSDK$ProductMetadata A08;
    public final /* synthetic */ MailboxSDK$Reply A09;
    public final /* synthetic */ 5P8 A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public A14(5oV r302, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, MailboxSDKVideoAttachment mailboxSDKVideoAttachment, MailboxSDKVideoAttachmentMessageOptionalParams mailboxSDKVideoAttachmentMessageOptionalParams, LoggingOption loggingOption, MailboxSDK$MediaSendOptions mailboxSDK$MediaSendOptions, MailboxSDK$ProductMetadata mailboxSDK$ProductMetadata, MailboxSDK$Reply mailboxSDK$Reply, 5P8 r311, String str, String str2, int i) {
        this.A0A = r311;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A02 = mailboxFutureImpl2;
        this.A0C = str;
        this.A04 = mailboxSDKVideoAttachment;
        this.A05 = mailboxSDKVideoAttachmentMessageOptionalParams;
        this.A07 = mailboxSDK$MediaSendOptions;
        this.A09 = mailboxSDK$Reply;
        this.A06 = loggingOption;
        this.A01 = r302;
        this.A08 = mailboxSDK$ProductMetadata;
        this.A0B = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1475), this.A00);
        C1qL c1qL = 5P8.A00;
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(c1qL, this.A03, mailbox);
        String A1D = 7zM.A1D(c1qL, 25);
        NotificationScope A00 = A1k.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 28);
        this.A02.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVOOOOOOOOOOOO(3, mailbox, this.A0C, this.A04, this.A05, this.A07, this.A09, this.A06, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject(this.A01), this.A08, this.A0B, A00, listenForTaskCompletion);
    }
}
