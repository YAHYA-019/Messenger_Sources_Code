package X;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.Lock;

/* loaded from: K5l.class */
public final class K5l extends C28w {
    public final /* synthetic */ K2P A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K5l(Looper looper, K2P k2p) {
        super(looper);
        this.A00 = k2p;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.w("GoogleApiClientImpl", 0Pz.A0T("Unknown message id: ", i));
                return;
            } else {
                K2P.A01(this.A00);
                return;
            }
        }
        K2P k2p = this.A00;
        Lock lock = k2p.A0G;
        lock.lock();
        try {
            if (k2p.A0G()) {
                K2P.A00(k2p);
            }
        } finally {
            lock.unlock();
        }
    }
}
