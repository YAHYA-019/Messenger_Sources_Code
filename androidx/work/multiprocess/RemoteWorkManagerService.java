package androidx.work.multiprocess;

import X.0FI;
import X.4IS;
import X.C08o;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/* loaded from: RemoteWorkManagerService.class */
public class RemoteWorkManagerService extends Service {
    public static final String A01 = 4IS.A01("RemoteWorkManagerService");
    public IBinder A00;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        4IS.A00();
        Log.i(A01, "Binding to RemoteWorkManager");
        return this.A00;
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 1738493411);
        int A04 = 0FI.A04(-636072557);
        super.onCreate();
        this.A00 = new RemoteWorkManagerImpl(this);
        0FI.A0A(-4323567, A04);
        C08o.A02(-1764873184, A00);
    }
}
