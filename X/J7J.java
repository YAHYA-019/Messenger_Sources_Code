package X;

import android.os.Message;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: J7J.class */
public final class J7J extends Thread {
    public static final J7J A02;
    public static final String __redex_internal_original_name = "AsyncLayoutInflater$InflateThread";
    public final C03v A00;
    public final ArrayBlockingQueue A01;

    static {
        J7J j7j = new J7J();
        A02 = j7j;
        j7j.start();
    }

    public J7J() {
        super("InflateThread");
        this.A01 = new ArrayBlockingQueue(15);
        this.A00 = new C03v(15);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HgW hgW;
        int i;
        Hhn hhn;
        while (true) {
            try {
                Object take = this.A01.take();
                11T.A0D(take);
                hgW = (HgW) take;
                try {
                    try {
                        C00j.A05("InflateThread.AsyncViewInflation", -712720283);
                        hhn = hgW.A02;
                    } catch (Throwable th) {
                        C00j.A01(-61524326);
                        throw th;
                    }
                } catch (RuntimeException e) {
                    0fH.A0u("AsyncLayoutInflater", "Failed to inflate resource in the background! View not added to cache.", e);
                    i = 1137373529;
                }
            } catch (InterruptedException e2) {
                0fH.A0v("AsyncLayoutInflater", "Unexpected exception while blocking on queue.take(), thread interrupted.", e2);
            }
            if (hhn == null) {
                throw AnonymousClass001.A0N("Required value was null.");
                break;
            }
            hgW.A01 = hhn.A01.inflate(hgW.A00, (ViewGroup) null, false);
            i = 1176344543;
            C00j.A01(i);
            Hhn hhn2 = hgW.A02;
            if (hhn2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            Message.obtain(hhn2.A00, 0, hgW).sendToTarget();
        }
    }
}
