package X;

import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$MediaSendOptions;
import com.facebook.sdk.mca.MailboxSDK$MentionsParams;
import com.facebook.sdk.mca.MailboxSDK$ProductMetadata;
import com.facebook.sdk.mca.MailboxSDK$Reply;
import com.facebook.sdk.mca.MailboxSDKJNI;
import java.util.List;

/* loaded from: A18.class */
public final class A18 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 5oV A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ LoggingOption A04;
    public final /* synthetic */ MailboxSDK$MediaSendOptions A05;
    public final /* synthetic */ MailboxSDK$MentionsParams A06;
    public final /* synthetic */ MailboxSDK$ProductMetadata A07;
    public final /* synthetic */ MailboxSDK$Reply A08;
    public final /* synthetic */ 5P8 A09;
    public final /* synthetic */ Number A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ List A0E;
    public final /* synthetic */ List A0F;
    public final /* synthetic */ List A0G;
    public final /* synthetic */ List A0H;
    public final /* synthetic */ List A0I;
    public final /* synthetic */ List A0J;
    public final /* synthetic */ List A0K;
    public final /* synthetic */ List A0L;
    public final /* synthetic */ List A0M;

    public A18(5oV r302, MailboxFutureImpl mailboxFutureImpl, MailboxFutureImpl mailboxFutureImpl2, LoggingOption loggingOption, MailboxSDK$MediaSendOptions mailboxSDK$MediaSendOptions, MailboxSDK$MentionsParams mailboxSDK$MentionsParams, MailboxSDK$ProductMetadata mailboxSDK$ProductMetadata, MailboxSDK$Reply mailboxSDK$Reply, 5P8 r310, Number number, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, int i) {
        this.A09 = r310;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A02 = mailboxFutureImpl2;
        this.A0D = str;
        this.A0C = str2;
        this.A0G = list;
        this.A0H = list2;
        this.A0F = list3;
        this.A0M = list4;
        this.A0E = list5;
        this.A0J = list6;
        this.A0K = list7;
        this.A0I = list8;
        this.A0L = list9;
        this.A05 = mailboxSDK$MediaSendOptions;
        this.A08 = mailboxSDK$Reply;
        this.A04 = loggingOption;
        this.A01 = r302;
        this.A07 = mailboxSDK$ProductMetadata;
        this.A0A = number;
        this.A06 = mailboxSDK$MentionsParams;
        this.A0B = str3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1469), this.A00);
        C1qL c1qL = 5P8.A00;
        NotificationScope listenForTaskCompletion = MailboxFeature.listenForTaskCompletion(c1qL, this.A03, mailbox);
        String A1D = 7zM.A1D(c1qL, 25);
        NotificationScope CcE = mailbox.getSessionedNotificationCenterCallbackManager().CcE(new A1k(A1D, this, 27), A1D, 1);
        this.A02.setNotification(A1D, CcE);
        MailboxSDKJNI.dispatchVOOOOOOOOOOOOOOOOOOOOOOO(1, mailbox, this.A0D, this.A0C, this.A0G, null, this.A0H, this.A0F, this.A0M, this.A0E, this.A0J, this.A0K, this.A0I, this.A0L, this.A05, this.A08, this.A04, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject(this.A01), this.A07, this.A0A, this.A06, this.A0B, CcE, listenForTaskCompletion);
    }
}
