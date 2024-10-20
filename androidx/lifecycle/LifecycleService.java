package androidx.lifecycle;

import X.0FI;
import X.C01w;
import X.C08o;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: LifecycleService.class */
public abstract class LifecycleService extends Service implements LifecycleOwner {
    public final ServiceLifecycleDispatcher dispatcher = new ServiceLifecycleDispatcher(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.dispatcher.getLifecycle();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.dispatcher.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 786295562);
        int A04 = 0FI.A04(619807071);
        this.dispatcher.onServicePreSuperOnCreate();
        super.onCreate();
        0FI.A0A(883873377, A04);
        C08o.A02(1996044759, A00);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(1661363161);
        this.dispatcher.onServicePreSuperOnDestroy();
        super.onDestroy();
        0FI.A0A(-1692196149, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.dispatcher.onServicePreSuperOnStart();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, -1616539017);
        int A04 = 0FI.A04(-35702725);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        0FI.A0A(2113204911, A04);
        C08o.A03(-66011791, A01);
        return onStartCommand;
    }
}
