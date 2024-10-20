package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.7vg, reason: invalid class name */
/* loaded from: 7vg.class */
public final class C7vg implements MailboxCallback {
    public static final C7vg A00 = new C7vg();

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (AnonymousClass001.A1V(obj)) {
            return;
        }
        0fH.A0j("DisappearingMessageScreenshotNotifier", "failed to send screenshot notification");
    }
}
