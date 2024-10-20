package X;

import android.os.SystemClock;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: I24.class */
public final class I24 {
    public static final long A03 = TimeUnit.SECONDS.toMillis(3);
    public long A00 = -1;
    public final SurfaceView A01;
    public final List A02;

    public I24(SurfaceView surfaceView, List list) {
        this.A02 = list;
        this.A01 = surfaceView;
    }

    public final boolean A00() {
        long j = this.A00;
        if (j != -1 && SystemClock.elapsedRealtime() > j + A03) {
            return false;
        }
        List list = this.A02;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((SurfaceControl) it.next()).isValid()) {
                return true;
            }
        }
        return false;
    }
}
