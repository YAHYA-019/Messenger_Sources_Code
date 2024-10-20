package X;

import android.view.Choreographer;
import java.util.List;

/* loaded from: Lrd.class */
public final class Lrd implements Runnable, Choreographer.FrameCallback {
    public static final String __redex_internal_original_name = "AndroidUiDispatcher$dispatchCallback$1";
    public final /* synthetic */ M9U A00;

    public Lrd(M9U m9u) {
        this.A00 = m9u;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        M9U m9u = this.A00;
        m9u.A04.removeCallbacks(this);
        M9U.A00(m9u);
        synchronized (m9u.A08) {
            if (m9u.A02) {
                m9u.A02 = false;
                List list = m9u.A01;
                m9u.A01 = m9u.A00;
                m9u.A00 = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        M9U m9u = this.A00;
        M9U.A00(m9u);
        synchronized (m9u.A08) {
            if (m9u.A01.isEmpty()) {
                m9u.A05.removeFrameCallback(this);
                m9u.A02 = false;
            }
        }
    }
}
