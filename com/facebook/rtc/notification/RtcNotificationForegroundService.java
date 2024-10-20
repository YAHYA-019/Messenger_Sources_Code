package com.facebook.rtc.notification;

import X.0FI;
import X.1BK;
import X.4aS;
import X.C00m;
import X.C01w;
import X.C05804f0;
import X.C08o;
import X.GT8;
import X.IDO;
import X.JEV;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: RtcNotificationForegroundService.class */
public final class RtcNotificationForegroundService extends Service {
    public JEV A00;
    public C05804f0 A01;
    public Integer A02;
    public Integer A03;
    public C00m A04;
    public String A05;

    private final void A00(int i) {
        Integer num;
        if (this.A01 == null || (num = this.A03) == null || num.intValue() == i || num.equals(this.A02)) {
            return;
        }
        new 4aS(this).A00.cancel(null, num.intValue());
    }

    public static final boolean A01(Context context) {
        Object systemService = context.getSystemService("notification");
        if (systemService == null) {
            throw 1BK.A0h();
        }
        int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
        if (currentInterruptionFilter == 0 || currentInterruptionFilter == 1) {
            return false;
        }
        return currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4;
    }

    public static final boolean A02(String str, int i) {
        int i2;
        int i3;
        if (str.equals("android.permission.CAMERA")) {
            i2 = 64;
            i3 = i & 64;
        } else {
            if (!str.equals("android.permission.RECORD_AUDIO")) {
                return false;
            }
            i2 = 128;
            i3 = i & 128;
        }
        return i3 == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0908, code lost:
    
        if (r326 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010c, code lost:
    
        if (X.GOp.A1b(r306.A05) != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r335v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(android.content.Context r302, com.facebook.foa.session.FbMetaSessionImpl r303, X.2JS r304, X.I8J r305, X.GjS r306, java.lang.Integer r307, java.lang.String r308, int r309, boolean r310, boolean r311) {
        /*
            Method dump skipped, instructions count: 2413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.notification.RtcNotificationForegroundService.A03(android.content.Context, com.facebook.foa.session.FbMetaSessionImpl, X.2JS, X.I8J, X.GjS, java.lang.Integer, java.lang.String, int, boolean, boolean):void");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Binder binder = new Binder();
        ((GT8) binder).A00 = this;
        return binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 1158380320);
        int A04 = 0FI.A04(1995320425);
        super.onCreate();
        0FI.A0A(8164195, A04);
        C08o.A02(179050083, A00);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Integer num;
        int A04 = 0FI.A04(1081384214);
        IDO.A00.A03("RtcNotificationForegroundService", "onDestroy", (Throwable) null);
        super.onDestroy();
        if (this.A01 != null && (num = this.A03) != null) {
            new 4aS(this).A00.cancel(null, num.intValue());
        }
        JEV jev = this.A00;
        if (jev != null) {
            jev.cancel();
        }
        0FI.A0A(-302414855, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IDO.A00.A03("RtcNotificationForegroundService", "onUnbind", (Throwable) null);
        return super.onUnbind(intent);
    }
}
