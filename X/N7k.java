package X;

import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;

/* loaded from: N7k.class */
public final class N7k implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ 5oV A05;
    public final /* synthetic */ MailboxFutureImpl A06;
    public final /* synthetic */ 22C A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ byte[] A0C;

    public N7k(5oV r302, MailboxFutureImpl mailboxFutureImpl, 22C r304, String str, String str2, String str3, String str4, byte[] bArr, int i, int i2, int i3, long j, long j2) {
        this.A07 = r304;
        this.A01 = i;
        this.A06 = mailboxFutureImpl;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = j;
        this.A03 = j2;
        this.A0B = str;
        this.A0A = str2;
        this.A09 = str3;
        this.A0C = bArr;
        this.A08 = str4;
        this.A05 = r302;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxTam", 1BJ.A00(1531), this.A01);
        String A1D = 7zM.A1D(22C.A00, 36);
        NotificationScope A00 = N89.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 31);
        this.A06.setNotification(A1D, A00);
        MailboxTamJNI.dispatchVIIJJOOOOOOOOOOOOOOOO(13, this.A00, this.A02, this.A04, this.A03, mailbox, "fb_sticker", this.A0B, this.A0A, this.A09, this.A0C, this.A08, null, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject(this.A05), null, null, null, null, null, null, A00);
    }
}
