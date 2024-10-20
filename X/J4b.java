package X;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: J4b.class */
public final class J4b implements Thread.UncaughtExceptionHandler {
    public final AtomicReference A00;

    public J4b(IkH ikH) {
        this.A00 = GOn.A1L(ikH);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        11T.A0F(th, 1);
        IkH ikH = (IkH) this.A00.get();
        if (ikH != null) {
            HLc.A00(ikH.A0N.A0N, new Exception(th), "videolite-video-upload", "UncaughtException in MediaUploader");
            IkH.A02(ikH, new Exception(th));
        }
    }
}
