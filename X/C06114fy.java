package X;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import java.util.List;

/* renamed from: X.4fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fy.class */
public final class C06114fy extends AnonymousClass013 {
    public static final IntentFilter A03;
    public final Handler A00;
    public final List A01;
    public final boolean A02;

    static {
        IntentFilter intentFilter = new IntentFilter();
        A03 = intentFilter;
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.intent.action.HDMI_PLUGGED");
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a7, code lost:
    
        if (((X.2yD) r0.get()).AZk(36317642166054499L) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C06114fy(X.AnonymousClass010 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r302
            android.os.Handler r0 = r0.AYc()
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r301
            java.lang.Class<X.1Dn> r1 = X.1Dn.class
            X.010 r0 = r0.A05(r1)
            X.1Dn r0 = (X.1Dn) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Laa
            r0 = r304
            X.00i r0 = r0.A02
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r306 = r0
            r0 = 36317642165923425(0x8106b400612e61, double:3.030761372912429E-306)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L5c
            java.lang.String r0 = "setTaskDescription"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.add(r1)
        L5c:
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r306 = r0
            r0 = 36317642163891789(0x8106b400422e4d, double:3.0307613716276144E-306)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L86
            java.lang.String r0 = "unregisterReceiver"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.add(r1)
        L86:
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r306 = r0
            r0 = 36317642166054499(0x8106b400632e63, double:3.030761372995321E-306)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r310 = r0
            r0 = 1
            r309 = r0
            r0 = r310
            if (r0 != 0) goto Laf
        Laa:
            r0 = 0
            r309 = r0
            r0 = 0
            r304 = r0
        Laf:
            r0 = r301
            r1 = r309
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06114fy.<init>(X.010):void");
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "AsyncActivityOperation";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (!this.A01.isEmpty() || this.A02) {
            01Q.A01(new C3277Jol(this, 1));
            if (Build.VERSION.SDK_INT >= 31) {
                01Q.A03("activity_client_controller");
            }
            01Q.A03("activity_task");
            01Q.A03("activity");
        }
    }
}
