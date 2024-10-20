package X;

import android.os.HandlerThread;

/* loaded from: Fwo.class */
public final class Fwo implements GH4 {
    public static final Fwo A00 = new Fwo();

    @Override // X.GH4
    public /* bridge */ /* synthetic */ Object get() {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_ReadWriteThread", 10);
        C0T8.A00(handlerThread);
        handlerThread.start();
        return handlerThread;
    }
}
