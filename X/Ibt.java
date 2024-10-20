package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Ibt.class */
public final class Ibt implements MailboxCallback {
    public static final Ibt A00 = new Ibt();

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (((Mailbox) obj).isValid()) {
            0fH.A0j("MessengerInitializerImpl", "msys messenger mailbox is loaded and is valid.");
        }
    }
}
