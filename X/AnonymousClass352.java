package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.352, reason: invalid class name */
/* loaded from: 352.class */
public final class AnonymousClass352 extends D4w {
    public final CallerContext A00;
    public final String A01;
    public final /* synthetic */ 1UC A02;

    public AnonymousClass352(CallerContext callerContext, 1UC r303, String str) {
        this.A02 = r303;
        this.A01 = str;
        this.A00 = callerContext;
    }

    @Override // X.D4w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        0fH.A0d(this.A01, this.A00, "MessagingLock", "Unlock with close, %s, %s");
        try {
            this.A02.A00.unlock();
        } catch (IllegalMonitorStateException e) {
            0fH.A0r("MessagingLock", "Failed to unlock", e);
        }
    }
}
