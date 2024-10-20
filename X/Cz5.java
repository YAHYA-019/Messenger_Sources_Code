package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Cz5.class */
public final class Cz5 implements MailboxCallback {
    public static final Cz5 A00 = new Cz5();

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (AnonymousClass001.A1V(obj)) {
            return;
        }
        0fH.A0k("AdminActionsMsysApi", "Bulk delete not successfully submitted");
    }
}
