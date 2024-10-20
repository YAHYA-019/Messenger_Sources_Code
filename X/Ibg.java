package X;

import android.net.Uri;
import com.facebook.memmediautils.mca.MailboxMEMMediaUtilsJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Ibg.class */
public final class Ibg implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ GsK A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;
    public final /* synthetic */ byte[] A07;
    public final /* synthetic */ byte[] A08;

    public Ibg(Uri uri, GsK gsK, MailboxFutureImpl mailboxFutureImpl, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, long j) {
        this.A03 = gsK;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A07 = bArr;
        this.A06 = bArr2;
        this.A08 = bArr3;
        this.A05 = str;
        this.A02 = uri;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A1D = 7zM.A1D(GsK.A00, 4);
        NotificationScope A00 = Ic4.A00(accountSession.getSessionedNotificationCenterCallbackManager(), this, A1D, 5);
        this.A04.setNotification(A1D, A00);
        MailboxMEMMediaUtilsJNI.dispatchVIJOOOOOOO(0, this.A00, this.A01, accountSession, this.A07, this.A06, this.A08, this.A05, this.A02, A00);
    }
}
