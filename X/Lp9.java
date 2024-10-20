package X;

import android.app.Notification;

/* loaded from: Lp9.class */
public final class Lp9 implements Runnable {
    public static final String __redex_internal_original_name = "SystemForegroundService$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Notification A01;
    public final /* synthetic */ ServiceC3019Jgi A02;

    public Lp9(Notification notification, ServiceC3019Jgi serviceC3019Jgi, int i) {
        this.A02 = serviceC3019Jgi;
        this.A00 = i;
        this.A01 = notification;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A02.A00.notify(this.A00, this.A01);
    }
}
