package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.303, reason: invalid class name */
/* loaded from: 303.class */
public final class AnonymousClass303 implements MailboxCallback {
    public final int A00;

    public AnonymousClass303(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (2 - this.A00 != 0 || AnonymousClass001.A1V(obj)) {
            return;
        }
        0fH.A0k("PageNotificationsGlobalMuteManagerImpl", "Failed to UpdateGlobalMuteCallUntil");
    }
}
