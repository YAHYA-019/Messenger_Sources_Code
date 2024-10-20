package com.facebook.analytics2.logger.legacy.uploader;

import X.0FI;
import X.49O;
import X.C08o;
import X.C0k4;
import X.C5ej;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;

/* loaded from: AlarmBasedUploadService.class */
public class AlarmBasedUploadService extends Service {
    public 49O A00;

    static {
        TimeUnit.MINUTES.toMillis(5);
        TimeUnit.HOURS.toMillis(6);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, -267131111);
        int A04 = 0FI.A04(-108753737);
        this.A00 = 49O.A00(this);
        0FI.A0A(-1964130807, A04);
        C08o.A02(-91410830, A00);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, 1734182304);
        int A04 = 0FI.A04(-1167643827);
        if (intent != null && intent.getAction().startsWith("com.facebook.analytics2.logger.UPLOAD_NOW")) {
            intent.setAction("com.facebook.analytics2.logger.UPLOAD_NOW");
        }
        49O r0 = this.A00;
        C0k4.A00(r0);
        int A03 = r0.A03(intent, new C5ej(this, i2), 2);
        0FI.A0A(972277338, A04);
        C08o.A03(1582221124, A01);
        return A03;
    }
}
