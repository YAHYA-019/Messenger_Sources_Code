package X;

import java.lang.Thread;

/* loaded from: J4a.class */
public final class J4a implements Thread.UncaughtExceptionHandler {
    public final JGu A00;

    public J4a(JGu jGu) {
        this.A00 = jGu;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        HLc.A00(this.A00, new IllegalStateException(th), "videolite-video-upload", 0Pz.A0W("UncaughtException in ", thread.getName()));
    }
}
