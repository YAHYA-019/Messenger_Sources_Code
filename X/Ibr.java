package X;

import android.net.Uri;
import com.facebook.memmediautils.mca.MailboxMEMMediaUtils$BytesAvailableHandlerCallback;
import com.facebook.memmediautils.mca.MailboxMEMMediaUtils$StreamingDownloadCompletionHandlerCallback;
import com.facebook.memmediautils.mca.MailboxMEMMediaUtils$StreamingDownloadTokenCallback;
import com.facebook.memmediautils.mca.MailboxMEMMediaUtilsJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: Ibr.class */
public final class Ibr implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Uri A04;
    public final /* synthetic */ MailboxMEMMediaUtils$BytesAvailableHandlerCallback A05;
    public final /* synthetic */ MailboxMEMMediaUtils$StreamingDownloadCompletionHandlerCallback A06;
    public final /* synthetic */ MailboxMEMMediaUtils$StreamingDownloadTokenCallback A07;
    public final /* synthetic */ GsK A08;
    public final /* synthetic */ MailboxFutureImpl A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ byte[] A0C;
    public final /* synthetic */ byte[] A0D;
    public final /* synthetic */ byte[] A0E;
    public final /* synthetic */ byte[] A0F;

    public Ibr(Uri uri, MailboxMEMMediaUtils$BytesAvailableHandlerCallback mailboxMEMMediaUtils$BytesAvailableHandlerCallback, MailboxMEMMediaUtils$StreamingDownloadCompletionHandlerCallback mailboxMEMMediaUtils$StreamingDownloadCompletionHandlerCallback, MailboxMEMMediaUtils$StreamingDownloadTokenCallback mailboxMEMMediaUtils$StreamingDownloadTokenCallback, GsK gsK, MailboxFutureImpl mailboxFutureImpl, String str, List list, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2, int i3, long j) {
        this.A08 = gsK;
        this.A09 = mailboxFutureImpl;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = j;
        this.A0D = bArr;
        this.A0C = bArr2;
        this.A0E = bArr3;
        this.A0A = str;
        this.A04 = uri;
        this.A0F = bArr4;
        this.A0B = list;
        this.A07 = mailboxMEMMediaUtils$StreamingDownloadTokenCallback;
        this.A05 = mailboxMEMMediaUtils$BytesAvailableHandlerCallback;
        this.A06 = mailboxMEMMediaUtils$StreamingDownloadCompletionHandlerCallback;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A1D = 7zM.A1D(GsK.A00, 9);
        NotificationScope CcE = accountSession.getSessionedNotificationCenterCallbackManager().CcE(new Ic3(this, 2), A1D, 1);
        this.A09.setNotification(A1D, CcE);
        MailboxMEMMediaUtilsJNI.dispatchVIIIJOOOOOOOOOOOO(1, this.A01, this.A02, this.A00, this.A03, accountSession, this.A0D, this.A0C, this.A0E, this.A0A, this.A04, this.A0F, this.A0B, this.A07, this.A05, this.A06, CcE);
    }
}
