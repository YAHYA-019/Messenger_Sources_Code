package X;

import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: Iuc.class */
public final class Iuc implements Runnable {
    public static final String __redex_internal_original_name = "AsyncAudioDemuxDecodeWrapper$flushAndRestart$1";
    public final /* synthetic */ IkA A00;

    public Iuc(IkA ikA) {
        this.A00 = ikA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IkA ikA = this.A00;
        ByteBuffer byteBuffer = IkA.A0I;
        ReentrantLock reentrantLock = ikA.A0D;
        reentrantLock.lock();
        try {
            long j = ikA.A00 - 1;
            ikA.A00 = j;
            if (j <= 0) {
                if (j < 0) {
                    throw AnonymousClass001.A0N("pendingDisableCallbacksCount is negative");
                }
                ikA.A07 = false;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
