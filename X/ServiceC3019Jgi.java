package X;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import androidx.lifecycle.LifecycleService;

/* renamed from: X.Jgi, reason: case insensitive filesystem */
/* loaded from: Jgi.class */
public final class ServiceC3019Jgi extends LifecycleService implements MC1 {
    public static ServiceC3019Jgi A04;
    public static final String A05 = 4IS.A01("SystemFgService");
    public NotificationManager A00;
    public Handler A01;
    public LRn A02;
    public boolean A03;

    private void A00() {
        this.A01 = AnonymousClass001.A07();
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        LRn lRn = new LRn(getApplicationContext());
        this.A02 = lRn;
        if (lRn.A01 == null) {
            lRn.A01 = this;
        } else {
            4IS.A00();
            android.util.Log.e(LRn.A0A, "A callback already exists.");
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 542854367);
        int A042 = 0FI.A04(-633789508);
        super.onCreate();
        A04 = this;
        A00();
        0FI.A0A(-1726086435, A042);
        C08o.A02(-1718432584, A00);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        int A042 = 0FI.A04(-566810271);
        super.onDestroy();
        this.A02.A00();
        0FI.A0A(1202368101, A042);
        C01w.A00(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, 657847458);
        int A042 = 0FI.A04(-2096868043);
        super.onStartCommand(intent, i, i2);
        if (this.A03) {
            4IS.A00();
            android.util.Log.i(A05, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.A02.A00();
            A00();
            this.A03 = false;
        }
        if (intent != null) {
            this.A02.A01(intent);
        }
        0FI.A0A(-7134153, A042);
        C08o.A03(-709340129, A01);
        return 3;
    }
}
