package com.facebook.rti.mqtt.manager;

import X.05P;
import X.0EL;
import X.0Go;
import X.0Gp;
import X.0MY;
import X.0Mi;
import X.0Pz;
import X.0fH;
import X.0wZ;
import X.11T;
import X.16Q;
import X.17I;
import X.17K;
import X.17S;
import X.17U;
import X.17W;
import X.18Q;
import X.AnonymousClass001;
import X.AnonymousClass094;
import X.AnonymousClass177;
import X.AnonymousClass185;
import X.C03L;
import X.C05O;
import X.C08t;
import X.C0d8;
import X.C0jG;
import X.C0lo;
import X.C16h;
import X.C16m;
import X.C16q;
import X.C16r;
import X.C16t;
import X.C16u;
import X.C16v;
import X.C16x;
import X.C17l;
import X.C17n;
import X.C17q;
import X.C18d;
import X.C18e;
import X.C18z;
import X.C1Ao;
import X.C1Ap;
import X.C1Aq;
import X.C1As;
import X.C1At;
import X.C1Au;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.acra.util.JavaProcFileReader;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: MqttPushServiceDelegate.class */
public abstract class MqttPushServiceDelegate extends MqttBackgroundServiceDelegate {
    public long A00;
    public C03L A01;
    public AnonymousClass094 A02;
    public RealtimeSinceBootClock A03;
    public C16r A04;
    public C16v A05;
    public 17I A06;
    public 17K A07;
    public 17S A08;
    public C17n A09;
    public C08t A0A;
    public AtomicBoolean A0B;
    public C17q A0C;
    public final C17l A0D;
    public volatile C16q A0E;

    public MqttPushServiceDelegate(05P r302) {
        super(r302);
        this.A0B = new AtomicBoolean(false);
        this.A0A = C08t.DISCONNECTED;
        this.A0D = new C17l() { // from class: X.0jh
            @Override // X.C17l
            public void AQv(String str, String str2, Throwable th) {
                MqttPushServiceDelegate.this.A0k(str, str2, th);
            }

            @Override // X.C17l
            public void BpF(Throwable th) {
            }

            @Override // X.C17l
            public void Bqm() {
                MqttPushServiceDelegate mqttPushServiceDelegate = MqttPushServiceDelegate.this;
                0fH.A0l("MqttPushService", "connection/connecting");
                MqttPushServiceDelegate.A01(mqttPushServiceDelegate);
            }

            @Override // X.C17l
            public void Bqp() {
                MqttPushServiceDelegate mqttPushServiceDelegate = MqttPushServiceDelegate.this;
                0fH.A0l("MqttPushService", "connection/established");
                mqttPushServiceDelegate.A00 = SystemClock.elapsedRealtime();
                MqttPushServiceDelegate.A01(mqttPushServiceDelegate);
            }

            @Override // X.C17l
            public void Bqt(0Gp r3022) {
                MqttPushServiceDelegate mqttPushServiceDelegate = MqttPushServiceDelegate.this;
                0fH.A0h(mqttPushServiceDelegate.A0A, "MqttPushService", "connection/lost; lastState=%s.");
                if (r3022.A06()) {
                    mqttPushServiceDelegate.A0h((C18d) r3022.A05());
                }
                MqttPushServiceDelegate.A01(mqttPushServiceDelegate);
            }

            @Override // X.C17l
            public void Bs8() {
                MqttPushServiceDelegate.this.A0W();
            }

            @Override // X.C17l
            public void C6y(C18z c18z) {
                MqttPushServiceDelegate.this.A0i(c18z);
            }

            @Override // X.C17l
            public void CEe(C16h c16h, Long l, String str, byte[] bArr, int i, long j) {
                MqttPushServiceDelegate.this.A0e(c16h, l, str, bArr, i, j);
            }

            @Override // X.C17l
            public void CgA(String str, long j, boolean z) {
                MqttPushServiceDelegate.this.A0j(str, j, z);
            }

            @Override // X.C17l
            public boolean CxA() {
                return MqttPushServiceDelegate.this.A0l();
            }

            @Override // X.C17l
            public void onConnectSent() {
                MqttPushServiceDelegate mqttPushServiceDelegate = MqttPushServiceDelegate.this;
                0fH.A0l("MqttPushService", "connection/connect_sent");
                MqttPushServiceDelegate.A01(mqttPushServiceDelegate);
            }
        };
    }

    public static String A00(MqttPushServiceDelegate mqttPushServiceDelegate) {
        long j;
        18Q r0 = mqttPushServiceDelegate.A09.A14;
        if (r0 == null || !AnonymousClass001.A1W(r0.A0d, C08t.CONNECTED)) {
            j = 0;
        } else {
            j = SystemClock.elapsedRealtime() - r0.A0a;
        }
        C16v c16v = mqttPushServiceDelegate.A05;
        C1As A00 = C16v.A00(c16v);
        C1Aq A01 = C16v.A01(c16v, j);
        try {
            return C16t.A00(c16v.A00.A00(false), (C1Au) c16v.A05(C1Au.class), (C1At) c16v.A05(C1At.class), A00, null, A01, (C1Ap) c16v.A05(C1Ap.class), (C1Ao) c16v.A05(C1Ao.class), true, false).toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    public static void A01(MqttPushServiceDelegate mqttPushServiceDelegate) {
        C08t c08t;
        18Q r0 = mqttPushServiceDelegate.A09.A14;
        C08t c08t2 = r0 == null ? C08t.DISCONNECTED : r0.A0d;
        if (c08t2 == null || c08t2 == (c08t = mqttPushServiceDelegate.A0A)) {
            0fH.A0h(c08t2, "MqttPushService", "[state_machine] state = %s");
            return;
        }
        String A0v = 0Pz.A0v("[state_machine] ", c08t.toString(), JavaProcFileReader.LS_SYMLINK_ARROW, c08t2.toString());
        0fH.A0l("MqttPushService", A0v);
        mqttPushServiceDelegate.A01.BZQ(A0v);
        mqttPushServiceDelegate.A0A = c08t2;
        mqttPushServiceDelegate.A04.A01(c08t2.name());
        mqttPushServiceDelegate.A0g(c08t2);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate, X.C05O
    public void A0D() {
        if (this.A0E != null) {
            C16q c16q = this.A0E;
            String A0W = 0Pz.A0W(AnonymousClass185.A00(A0T()), ".SERVICE_ON_DESTROY");
            String A0U = A0U();
            0Go r0 = 0Go.A00;
            c16q.A06(null, r0, r0, A0W, A0U, null, 0L, this.A0B.get());
        }
        super.A0D();
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public Looper A0L() {
        return null;
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0N() {
        AtomicBoolean atomicBoolean = this.A0B;
        0fH.A0g(atomicBoolean, "MqttPushService", "service/destroyed; started=%s");
        C16q c16q = this.A0E;
        String A0W = 0Pz.A0W(AnonymousClass185.A00(A0T()), ".SERVICE_DESTROY");
        String A0U = A0U();
        0Go r0 = 0Go.A00;
        boolean z = atomicBoolean.get();
        c16q.A06(this.A06.A02(), r0, r0, A0W, A0U, null, this.A06.A05.get(), z);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("event", "doDestroy");
        A0u.put("pid", String.valueOf(Process.myPid()));
        this.A01.BZT("life_cycle", A0u);
        this.A01.Cv6(null);
        A0X();
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0O() {
        16Q.A01(AnonymousClass001.A1U(this.A0C));
        this.A0C = A0R();
        A0Z();
        A0Y();
        this.A01.Cv6(new 0EL(this));
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("event", "doCreate");
        A0u.put("pid", String.valueOf(Process.myPid()));
        this.A01.BZT("life_cycle", A0u);
        C16q c16q = this.A0E;
        String A0W = 0Pz.A0W(AnonymousClass185.A00(A0T()), ".SERVICE_CREATE");
        String A0U = A0U();
        0Go r0 = 0Go.A00;
        boolean z = this.A0B.get();
        c16q.A06(this.A06.A02(), r0, r0, A0W, A0U, null, this.A06.A05.get(), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x023d, code lost:
    
        if (r307 != null) goto L5;
     */
    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0P(int r302, int r303, android.content.Intent r304) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.manager.MqttPushServiceDelegate.A0P(int, int, android.content.Intent):void");
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0Q(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            printWriter.println("[ MqttPushService ]");
            0Pz.A1E(printWriter, "persistence=", A0U());
            long j = this.A09.A04;
            0Pz.A1E(printWriter, "networkChangedTime=", j > 0 ? new Date(j).toString() : String.valueOf(j));
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("subscribedTopics=");
            printWriter.println(AnonymousClass001.A0a(this.A09.A0D(), A0k));
            if (!this.A0C.A06.A02) {
                return;
            }
            this.A09.A0P(printWriter);
            printWriter.println("[ MqttHealthStats ]");
            printWriter.println(A00(this));
        } catch (Exception unused) {
        }
    }

    public abstract C17q A0R();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.17z, java.lang.Object] */
    public 0MY A0S(Intent intent, int i, int i2) {
        String str;
        ?? obj = new Object();
        05P r0 = ((C05O) this).A01;
        Context applicationContext = r0.getApplicationContext();
        11T.A0A(applicationContext);
        0MY A00 = obj.A00(applicationContext, this.A02);
        if (intent != null) {
            if (intent.hasExtra("caller")) {
                A00.A03 = intent.getStringExtra("caller");
            }
            if (intent.hasExtra("EXPIRED_SESSION")) {
                A00.A00 = intent.getLongExtra("EXPIRED_SESSION", 0L);
            }
            if (intent.hasExtra("DELIVERY_RETRY_INTERVAL")) {
                Integer valueOf = Integer.valueOf(intent.getIntExtra("DELIVERY_RETRY_INTERVAL", 300));
                if (!valueOf.equals(A00.A02)) {
                    A00.A02 = valueOf;
                    Context applicationContext2 = r0.getApplicationContext();
                    11T.A0A(applicationContext2);
                    0Mi AP6 = 0Pz.A01(applicationContext2, this.A02, "runtime_params").AP6();
                    Integer num = A00.A02;
                    if (num != null) {
                        AP6.CaF("DELIVERY_RETRY_INTERVAL", num.intValue());
                        AP6.AGm();
                    }
                }
            }
            str = intent.getAction();
        } else {
            str = "NULL";
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i2);
        String str2 = A00.A03;
        if (C0d8.A01()) {
            0fH.A0l("MqttPushService", StringFormatUtil.formatStrLocaleSafe("service/onStart; flag=%d, id=%d, intent=%s, caller=%s", valueOf2, valueOf3, str, str2));
        }
        C16q c16q = this.A0E;
        String A0Y = 0Pz.A0Y(AnonymousClass185.A00(A0T()), str, '.');
        String A0U = A0U();
        String str3 = A00.A03;
        0wZ A02 = 0Gp.A02(valueOf2);
        0wZ A022 = 0Gp.A02(valueOf3);
        boolean z = this.A0B.get();
        c16q.A06(this.A06.A02(), A02, A022, A0Y, A0U, str3, this.A06.A05.get(), z);
        return A00;
    }

    public abstract Integer A0T();

    public abstract String A0U();

    public Future A0V(C18e c18e) {
        0fH.A0h(c18e, "MqttPushService", "service/stop; reason=%s'");
        AnonymousClass177 anonymousClass177 = AnonymousClass177.A01;
        if (!this.A0B.getAndSet(false)) {
            0fH.A0n("MqttPushService", "service/stop/inactive_connection");
            return anonymousClass177;
        }
        A0b();
        this.A09.A0J();
        Future A0G = this.A09.A0G(c18e);
        A01(this);
        return A0G;
    }

    public void A0W() {
    }

    public void A0X() {
        if (this.A0B.get()) {
            A0V(C18e.A0L);
        }
        C17n c17n = this.A09;
        if (c17n != null) {
            c17n.A0G(C18e.A0L);
        }
        C17q c17q = this.A0C;
        if (c17q == null || c17q.A0V) {
            return;
        }
        c17q.A0V = true;
        17K r306 = c17q.A0L;
        if (r306 != null) {
            synchronized (r306) {
                try {
                    r306.A00();
                    if (((17W) r306).A01) {
                        ((17W) r306).A01 = AnonymousClass001.A1O(((17W) r306).A07.A07(((17W) r306).A04, ((17W) r306).A05) ? 1 : 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        r306 = c17q.A0H;
        if (r306 != null) {
            synchronized (r306) {
                try {
                    ((17I) r306).A01.unregisterReceiver(((17I) r306).A00);
                } catch (IllegalArgumentException e) {
                    0fH.A0v("MqttNetworkManager", "Failed to unregister broadcast receiver", e);
                }
            }
        }
        C0jG c0jG = c17q.A0F;
        if (c0jG != null) {
            c0jG.shutdown();
        }
        17U r0 = c17q.A0K;
        if (r0 != null) {
            r0.A04();
        }
        r306 = c17q.A0I;
        if (r306 != null) {
            synchronized (r306) {
                try {
                    r306.A02.unregisterReceiver(r306.A01);
                } catch (IllegalArgumentException e2) {
                    0fH.A0v("ScreenPowerState", "Failed to unregister broadcast receiver", e2);
                }
                r306.A05.set(null);
            }
        }
    }

    public void A0Y() {
        C16v c16v = this.A05;
        C16u c16u = C16u.A01;
        C16v.A04(c16u, c16v).set(SystemClock.elapsedRealtime());
    }

    public void A0Z() {
        C17q c17q = this.A0C;
        C17n c17n = c17q.A0N;
        17I r0 = c17q.A0H;
        C0lo c0lo = c17q.A0J;
        RealtimeSinceBootClock realtimeSinceBootClock = c17q.A04;
        C16q c16q = c17q.A0A;
        C16v c16v = c17q.A0C;
        17K r02 = c17q.A0I;
        C16r c16r = c17q.A0B;
        C03L c03l = c17q.A02;
        AnonymousClass094 anonymousClass094 = c17q.A03;
        this.A09 = c17n;
        this.A06 = r0;
        this.A08 = c0lo;
        this.A03 = realtimeSinceBootClock;
        this.A0E = c16q;
        this.A05 = c16v;
        this.A07 = r02;
        this.A04 = c16r;
        this.A01 = c03l;
        this.A02 = anonymousClass094;
    }

    public abstract void A0a();

    public abstract void A0b();

    public void A0c(int i) {
    }

    public void A0d(Intent intent, 0MY r303) {
    }

    public abstract void A0e(C16h c16h, Long l, String str, byte[] bArr, int i, long j);

    public void A0f(C16m c16m, 0MY r303) {
        0fH.A0g(c16m, "MqttPushService", "service/start; reason=%s");
        if (!this.A0B.getAndSet(true)) {
            Integer num = r303.A02;
            if (num != null) {
                A0c(num.intValue());
            }
            C16v c16v = this.A05;
            String name = c16m.name();
            C16x c16x = c16v.A00;
            if (c16x.A07 == null) {
                c16x.A07 = name;
                c16x.A04.set(SystemClock.elapsedRealtime());
                c16x.A02.set(SystemClock.elapsedRealtime());
            }
            A0a();
            this.A09.A0I();
        }
        String str = r303.A03;
        C17n c17n = this.A09;
        if (str == null) {
            str = "MqttPushService";
        }
        c17n.A0O(c16m, str);
    }

    public abstract void A0g(C08t c08t);

    public abstract void A0h(C18d c18d);

    public abstract void A0i(C18z c18z);

    public void A0j(String str, long j, boolean z) {
    }

    public void A0k(String str, String str2, Throwable th) {
    }

    public boolean A0l() {
        if (!this.A0B.get()) {
            0fH.A0m("MqttPushService", "connection/service_not_started");
            this.A01.BZQ("MqttPushService/not_started");
            return false;
        }
        HashMap A0u = AnonymousClass001.A0u();
        if (this.A08.CxB(A0u)) {
            return true;
        }
        0fH.A0i(A0u, "MqttPushService", "connection/should_not_connect; reason=%s");
        this.A01.BZT("MqttPushService/should_not_connect", A0u);
        return false;
    }

    public boolean A0m(Intent intent) {
        return true;
    }
}
