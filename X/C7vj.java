package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.7vj, reason: invalid class name */
/* loaded from: 7vj.class */
public final class C7vj implements MailboxCallback {
    public static final C7vj A00 = new C7vj();

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (AnonymousClass001.A1V(obj)) {
            return;
        }
        0fH.A0k("ThreadPresenceManager", "Failed to truncate thread co presence");
    }
}
