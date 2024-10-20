package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.3az, reason: invalid class name */
/* loaded from: 3az.class */
public final class C3az implements MailboxCallback {
    public final /* synthetic */ 1xA A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ java.util.Map A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C3az(1xA r302, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, List list, List list2, java.util.Map map, boolean z, boolean z2, boolean z3) {
        this.A00 = r302;
        this.A01 = mailboxFutureImpl;
        this.A02 = number;
        this.A05 = list;
        this.A04 = list2;
        this.A06 = map;
        this.A03 = number2;
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) 1xA.A00.A00(357);
        NotificationScope A00 = ((C1y2) accountSession.getNotificationCenterCallbackManager()).A00(new A1k(str, this, 23), str);
        this.A01.setNotification(str, A00);
        MailboxEncryptedBackupsJNI.dispatchVOOOOOOOZZZ(55, accountSession, this.A02, this.A05, this.A04, this.A06, this.A03, A00, this.A08, this.A07, this.A09);
    }
}
