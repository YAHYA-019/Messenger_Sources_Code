package X;

import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;
import java.util.List;

/* loaded from: Cyw.class */
public final class Cyw implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ 5oV A04;
    public final /* synthetic */ MailboxFutureImpl A05;
    public final /* synthetic */ 22C A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ List A0D;
    public final /* synthetic */ boolean A0E;

    public Cyw(5oV r302, MailboxFutureImpl mailboxFutureImpl, 22C r304, Number number, Number number2, String str, String str2, String str3, String str4, List list, int i, int i2, long j, long j2, boolean z) {
        this.A06 = r304;
        this.A00 = i;
        this.A05 = mailboxFutureImpl;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = j2;
        this.A0C = str;
        this.A04 = r302;
        this.A09 = str2;
        this.A0B = str3;
        this.A0A = str4;
        this.A08 = number;
        this.A0D = list;
        this.A07 = number2;
        this.A0E = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        4uZ.A06("MailboxTam", "sendTextMessage", this.A00);
        String A1D = 7zM.A1D(22C.A00, 21);
        NotificationScope A00 = Czo.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 59);
        this.A05.setNotification(A1D, A00);
        MailboxTamJNI.dispatchVIJJOOOOOOOOOOOZZ(3, this.A01, this.A03, this.A02, mailbox, this.A0C, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject(this.A04), null, this.A09, this.A0B, this.A0A, this.A08, this.A0D, this.A07, A00, this.A0E, false);
    }
}
