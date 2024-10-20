package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import java.util.Iterator;

/* loaded from: H19.class */
public final class H19 extends GU5 implements SurfaceHolder.Callback {
    /* JADX WARN: Multi-variable type inference failed */
    public H19(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IDH.A01.A03(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Iterator it = IDH.A02.iterator();
        while (it.hasNext()) {
            I24 i24 = (I24) it.next();
            if (i24.A01 == this) {
                i24.A00 = SystemClock.elapsedRealtime();
            }
        }
    }
}
