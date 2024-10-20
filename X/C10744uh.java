package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.PlatformLogger;

/* renamed from: X.4uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4uh.class */
public final class C10744uh implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1X9 A01;

    public C10744uh(1X9 r302, int i) {
        this.A00 = i;
        this.A01 = r302;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public void onCompletion(Object obj) {
        int i = this.A00;
        PlatformLogger.platformEventLog(254, i);
        if (this.A01 == null) {
            4uZ.A03(i);
        }
    }
}
