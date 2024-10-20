package com.facebook.fixie.fixes.signal;

import X.0FI;
import X.C01w;
import X.C08o;
import X.C0ft;
import X.FdN;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.fixie.fixes.signal.AppDeathSignalService;

/* loaded from: AppDeathSignalService.class */
public class AppDeathSignalService extends Service {
    public static FdN A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(-1199731635);
        A01 = false;
        final FdN fdN = A00;
        if (fdN != null && !A03 && C0ft.A09()) {
            fdN.A01.post(new Runnable() { // from class: X.G01
                public static final String __redex_internal_original_name = "AppDeathSignalService$AppDeathSignalServiceTrigger$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Context context = fdN.A00;
                        context.startService(C3o5.A0D(context, AppDeathSignalService.class));
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        0FI.A0A(1941407366, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A012 = C08o.A01(this, 1719603893);
        int A04 = 0FI.A04(230026797);
        A01 = true;
        A03 = false;
        0FI.A0A(204371237, A04);
        C08o.A03(-963760644, A012);
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        A03 = true;
        stopSelf();
    }
}
