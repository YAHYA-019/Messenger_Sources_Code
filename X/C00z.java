package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.00z, reason: invalid class name */
/* loaded from: 00z.class */
public abstract class C00z implements AnonymousClass010 {
    public Handler A00;
    public final Context A01;

    public C00z(Context context) {
        this.A01 = context.getApplicationContext();
    }

    @Override // X.AnonymousClass010
    public final Handler AYc() {
        Handler handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("Fixie-background-pri", 10);
            C0T8.A00(handlerThread);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        return handler;
    }
}
