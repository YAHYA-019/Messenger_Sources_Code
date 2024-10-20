package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Cz9.class */
public final class Cz9 implements MailboxCallback {
    public static final Cz9 A00 = new Cz9();

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (7zP.A1W(obj)) {
            0fH.A0j("BackgroundAccountNotificationController", "Background Account Notification Setting update was successful");
        } else {
            0fH.A0k("BackgroundAccountNotificationController", "Background Account Notification Setting update failed");
        }
    }
}
