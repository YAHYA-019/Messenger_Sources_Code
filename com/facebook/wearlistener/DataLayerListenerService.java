package com.facebook.wearlistener;

import X.0FI;
import X.0fH;
import X.1BK;
import X.1Kd;
import X.4YU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C01w;
import X.C08o;
import X.JQx;
import X.JWg;
import X.KzI;
import X.LeF;
import X.MKD;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.zzag;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: DataLayerListenerService.class */
public class DataLayerListenerService extends Service implements MKD {
    public ComponentName A00;
    public Intent A01;
    public Looper A02;
    public JWg A03;
    public Set A04;
    public Set A05;
    public Set A06;
    public boolean A07;
    public IBinder A08;
    public final LeF A09;
    public final Object A0A;

    public DataLayerListenerService() {
        this(0);
    }

    public DataLayerListenerService(int i) {
        this.A0A = AnonymousClass001.A0R();
        this.A09 = new LeF(new KzI(this));
    }

    public static void A00(Iterable iterable) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            try {
                1Kd.A01(iterable).get();
            } catch (InterruptedException e) {
                0fH.A0N(DataLayerListenerService.class, "Operation interrupted", e, new Object[0]);
            } catch (ExecutionException e2) {
                0fH.A0N(DataLayerListenerService.class, "Operation failed", e2, new Object[0]);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public void Bnl(Channel channel, int i, int i2) {
    }

    public void Bnm(Channel channel) {
    }

    public void C1u(Channel channel, int i, int i2) {
    }

    public void CAQ(Channel channel, int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.IBinder onBind(android.content.Intent r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L83
            r0 = r302
            java.lang.String r0 = r0.getAction()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L83
            r0 = r303
            int r0 = r0.hashCode()
            r304 = r0
            r0 = 3
            r305 = r0
            r0 = r304
            switch(r0) {
                case -1487371046: goto Laf;
                case -1140095138: goto La8;
                case -786751258: goto La1;
                case 705066793: goto L9a;
                case 915816236: goto L93;
                case 1003809169: goto L8c;
                case 1460975593: goto L85;
                default: goto L58;
            }
        L58:
            java.lang.String r0 = "WearableLS"
            r306 = r0
            r0 = r306
            r1 = r305
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L83
            r0 = r302
            java.lang.String r0 = r0.toString()
            r303 = r0
            java.lang.String r0 = "onBind: Provided bind intent ("
            r307 = r0
            r0 = r307
            r1 = r303
            java.lang.String r2 = ") is not allowed"
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r308 = r0
            r0 = r306
            r1 = r308
            int r0 = android.util.Log.d(r0, r1)
        L83:
            r0 = 0
            return r0
        L85:
            java.lang.String r0 = "com.google.android.gms.wearable.BIND_LISTENER"
            r308 = r0
            goto Lb3
        L8c:
            java.lang.String r0 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            r308 = r0
            goto Lb3
        L93:
            java.lang.String r0 = "com.google.android.gms.wearable.DATA_CHANGED"
            r308 = r0
            goto Lb3
        L9a:
            java.lang.String r0 = "com.google.android.gms.wearable.NODE_MIGRATED"
            r308 = r0
            goto Lb3
        La1:
            java.lang.String r0 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            r308 = r0
            goto Lb3
        La8:
            java.lang.String r0 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            r308 = r0
            goto Lb3
        Laf:
            java.lang.String r0 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            r308 = r0
        Lb3:
            r0 = r303
            r1 = r308
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L58
            r0 = r301
            android.os.IBinder r0 = r0.A08
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearlistener.DataLayerListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 1963209525);
        int A04 = 0FI.A04(1946592112);
        super.onCreate();
        this.A00 = new ComponentName(this, AnonymousClass001.A0Y(this));
        if (JQx.A1W("WearableLS")) {
            Log.d("WearableLS", "onCreate: ".concat(JQx.A0w(this.A00)));
        }
        Looper looper = this.A02;
        if (looper == null) {
            looper = AnonymousClass002.A09("WearableListenerService");
            this.A02 = looper;
        }
        this.A03 = new JWg(looper, this);
        Intent A0A = 4YU.A0A("com.google.android.gms.wearable.BIND_LISTENER");
        this.A01 = A0A;
        A0A.setComponent(this.A00);
        this.A08 = new zzag(this);
        0FI.A0A(597937547, A04);
        C08o.A02(-1915984480, A00);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(989356841);
        if (JQx.A1W("WearableLS")) {
            Log.d("WearableLS", "onDestroy: ".concat(JQx.A0w(this.A00)));
        }
        synchronized (this.A0A) {
            try {
                this.A07 = true;
                JWg jWg = this.A03;
                if (jWg == null) {
                    IllegalStateException A0i = 1BK.A0i("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=", String.valueOf(this.A00));
                    0FI.A0A(970833916, A04);
                    C01w.A00(this);
                    throw A0i;
                }
                jWg.getLooper().quit();
                JWg.A00(jWg, "quit");
            } catch (Throwable th) {
                0FI.A0A(-1024766215, A04);
                C01w.A00(this);
                throw th;
            }
        }
        super.onDestroy();
        0FI.A0A(1832989202, A04);
        C01w.A00(this);
    }
}
