package com.facebook.mqtt.service;

import X.05P;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1X6;
import X.1nK;
import X.1nY;
import X.5qN;
import X.AnonymousClass001;
import X.C05O;
import X.C0ty;
import X.C1lh;
import X.C1li;
import X.C1lj;
import X.C1lk;
import X.C1lq;
import X.C1u9;
import X.C3fs;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.XplatServiceDelegate;
import com.facebook.push.mqtt.service.xplat.MqttXplatServiceDelegate;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: XplatServiceDelegate.class */
public abstract class XplatServiceDelegate extends C05O {
    public static final C1lh A01;
    public static final C1lj A02;
    public static final C1lk A03;
    public static final C1li A04;
    public static final Object A05 = new Object();
    public static final Condition A06;
    public static final ReentrantLock A07;
    public static volatile 1nK A08;
    public static volatile XplatServiceDelegate A09;
    public final XplatServiceDelegate$remoteBinder$1 A00;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.1li, java.lang.Object] */
    static {
        C1lh c1lh = new C1lh();
        A01 = c1lh;
        ReentrantLock reentrantLock = new ReentrantLock();
        A07 = reentrantLock;
        A06 = reentrantLock.newCondition();
        A04 = new Object();
        A02 = new C1lj(c1lh);
        A03 = new C1lk(c1lh);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XplatServiceDelegate(05P r302) {
        super(r302);
        11T.A0F(r302, 1);
        this.A00 = new XplatServiceDelegate$remoteBinder$1();
    }

    public static final void A00(final XplatServiceDelegate xplatServiceDelegate) {
        final C1lh c1lh = A01;
        final Runnable runnable = new Runnable() { // from class: X.4tv
            public static final String __redex_internal_original_name = "XplatServiceDelegate$stopClient$result$1";

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (XplatServiceDelegate.A05) {
                    0fH.A0j(1BJ.A00(812), "Disconnecting native xplat client");
                    XplatServiceDelegate.A02.A01();
                    XplatServiceDelegate.A03.A00();
                    1nK r0 = XplatServiceDelegate.A08;
                    XplatServiceDelegate.A08 = null;
                    if (r0 != null) {
                        r0.stop();
                    }
                }
                ConnectionConfig connectionConfig = XplatServiceDelegate.A04.A00;
                if (connectionConfig == null || !connectionConfig.improvedStateReportEnabled) {
                    return;
                }
                XplatServiceDelegate.this.A0R(1nY.A05);
            }
        };
        c1lh.A03.incrementAndGet();
        Handler A00 = C1lh.A00(c1lh);
        if (A00 == null || !A00.postAtFrontOfQueue(new Runnable() { // from class: X.4tw
            public static final String __redex_internal_original_name = "GatewayClientHandler$postAtFront$1";

            @Override // java.lang.Runnable
            public final void run() {
                C1lh.this.A00++;
                runnable.run();
            }
        })) {
            0fH.A0k("MqttXplatService", "Unable to stop mqtt client. No handler available");
        }
    }

    @Override // X.C05O
    public int A0C(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("service/onStartCommand; intent=");
        sb.append(intent);
        0fH.A0l("MqttXplatService", sb.toString());
        A01.A01(new C1lq(null, this));
        return 2;
    }

    @Override // X.C05O
    public void A0D() {
        0fH.A0l("MqttXplatService", "service/onDestroy;");
        A01.A01(new 5qN(this));
        if (A09 == this) {
            A09 = null;
            A00(this);
        }
        super.A0D();
    }

    @Override // X.C05O
    public IBinder A0H(Intent intent) {
        0fH.A0h(intent, "MqttXplatService", "service/onBind; intent=%s");
        A01.A01(new C1lq(null, this));
        return this.A00;
    }

    @Override // X.C05O
    public void A0I() {
        0fH.A0l("MqttXplatService", "service/onCreate;");
        super.A0I();
        A09 = this;
        C1lh c1lh = A01;
        C1lh.A00(c1lh);
        c1lh.A01(new C1lq(null, this));
        c1lh.A01(new Runnable() { // from class: X.1lt
            public static final String __redex_internal_original_name = "XplatServiceDelegate$onCreate$1";

            @Override // java.lang.Runnable
            public final void run() {
                XplatServiceDelegate.this.A0P();
            }
        });
    }

    @Override // X.C05O
    public boolean A0K(Intent intent) {
        0fH.A0h(intent, "MqttXplatService", "service/unBind; intent=%s");
        return super.A0K(intent);
    }

    public ConnectionConfig A0L(boolean z) {
        return null;
    }

    public MqttSubscribeListener A0M(C1li c1li) {
        return new MqttSubscribeListener() { // from class: X.3ad
            @Override // com.facebook.mqtt.service.MqttSubscribeListener
            public void onData(String str, byte[] bArr, long j) {
            }

            @Override // com.facebook.mqtt.service.MqttSubscribeListener
            public void onSubscriptionResponse(String str, boolean z, int i) {
            }
        };
    }

    public String A0N() {
        return null;
    }

    public List A0O() {
        return C0ty.A00;
    }

    public void A0P() {
    }

    public void A0Q() {
        if (this instanceof MqttXplatServiceDelegate) {
            MqttXplatServiceDelegate mqttXplatServiceDelegate = (MqttXplatServiceDelegate) this;
            try {
                Context applicationContext = ((C05O) mqttXplatServiceDelegate).A01.getApplicationContext();
                11T.A0A(applicationContext);
                applicationContext.unregisterReceiver(mqttXplatServiceDelegate.A04);
                if (mqttXplatServiceDelegate.A00 != null) {
                    ((1X6) 1Bi.A03(67984)).A05(mqttXplatServiceDelegate.A00);
                    mqttXplatServiceDelegate.A00 = null;
                }
            } catch (IllegalArgumentException e) {
                0fH.A0s("MqttXplatServiceDelegate", "Illegal argument passed to unregister", e);
            } catch (RuntimeException e2) {
                if (!AnonymousClass001.A1Y(e2)) {
                    throw e2;
                }
                0fH.A0s("MqttXplatServiceDelegate", "Error removing connection config listener. System is dead", e2);
            }
            C1u9 c1u9 = (C1u9) 1Bi.A03(16840);
            c1u9.A02.execute(new C3fs(c1u9));
        }
    }

    public void A0R(1nY r302) {
    }
}
