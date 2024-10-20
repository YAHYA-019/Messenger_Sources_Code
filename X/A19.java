package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.sdk.mca.MailboxSDK$MentionsParams;
import com.facebook.sdk.mca.MailboxSDK$ProductMetadata;
import com.facebook.sdk.mca.MailboxSDKJNI;
import java.util.List;

/* loaded from: A19.class */
public final class A19 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ MailboxSDK$MentionsParams A04;
    public final /* synthetic */ MailboxSDK$ProductMetadata A05;
    public final /* synthetic */ 5P8 A06;
    public final /* synthetic */ Number A07;
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
    public final /* synthetic */ List A0K;
    public final /* synthetic */ boolean A0L;
    public final /* synthetic */ boolean A0M;
    public final /* synthetic */ boolean A0N;
    public final /* synthetic */ boolean A0O;

    public A19(MailboxFutureImpl mailboxFutureImpl, MailboxSDK$MentionsParams mailboxSDK$MentionsParams, MailboxSDK$ProductMetadata mailboxSDK$ProductMetadata, 5P8 r305, Number number, Number number2, Number number3, Number number4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = r305;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A02 = j;
        this.A0K = list;
        this.A0H = str;
        this.A0I = str2;
        this.A0G = str3;
        this.A0F = str4;
        this.A09 = number;
        this.A0D = str5;
        this.A0J = str6;
        this.A07 = number2;
        this.A0A = number3;
        this.A0C = str7;
        this.A08 = number4;
        this.A05 = mailboxSDK$ProductMetadata;
        this.A04 = mailboxSDK$MentionsParams;
        this.A0B = str8;
        this.A0E = str9;
        this.A0O = z;
        this.A0N = z2;
        this.A0M = z3;
        this.A0L = z4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxSDK", 4YT.A00(1470), this.A00);
        String A1D = 7zM.A1D(5P8.A00, 26);
        NotificationScope A00 = A1k.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 34);
        this.A03.setNotification(A1D, A00);
        MailboxSDKJNI.dispatchVIJOOOOOOOOOOOOOOOOOOZZZZZ(64, this.A01, this.A02, mailbox, this.A0K, this.A0H, this.A0I, this.A0G, this.A0F, this.A09, this.A0D, this.A0J, this.A07, this.A0A, this.A0C, this.A08, this.A05, this.A04, this.A0B, this.A0E, A00, true, this.A0O, this.A0N, this.A0M, this.A0L);
    }
}
