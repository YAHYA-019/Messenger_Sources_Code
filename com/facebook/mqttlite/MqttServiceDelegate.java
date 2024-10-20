package com.facebook.mqttlite;

import X.05L;
import X.05P;
import X.09L;
import X.09V;
import X.0Ep;
import X.0FI;
import X.0Go;
import X.0Mb;
import X.0Mj;
import X.0Pz;
import X.0S2;
import X.0fH;
import X.11T;
import X.16D;
import X.17K;
import X.18Y;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1CQ;
import X.1HH;
import X.1I7;
import X.1P8;
import X.1PB;
import X.1X6;
import X.1uD;
import X.3bP;
import X.3bZ;
import X.3cB;
import X.3jE;
import X.5qO;
import X.AbR;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass025;
import X.AnonymousClass074;
import X.AnonymousClass185;
import X.C00i;
import X.C00y;
import X.C01s;
import X.C03L;
import X.C05O;
import X.C08t;
import X.C0et;
import X.C15h;
import X.C16d;
import X.C16h;
import X.C16q;
import X.C16v;
import X.C17q;
import X.C17v;
import X.C18d;
import X.C18z;
import X.C1Aq;
import X.C1cd;
import X.C1cx;
import X.C1ly;
import X.C1m1;
import X.C1ns;
import X.C1o0;
import X.C1u9;
import X.C3fs;
import X.I5r;
import X.JvI;
import X.KmF;
import X.L8F;
import X.LrA;
import X.RwZ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mqtt.debug.MqttStats;
import com.facebook.push.mqtt.ipc.MqttPubAckCallback;
import com.facebook.push.mqtt.ipc.MqttPublishListener;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: MqttServiceDelegate.class */
public class MqttServiceDelegate extends MqttPushServiceDelegate implements AnonymousClass025 {
    public static MqttServiceDelegate A0Y;
    public static Boolean A0Z = false;
    public static final HashSet A0a = new HashSet(Arrays.asList("/t_rtc", "/t_rtc_multi"));
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public KmF A04;
    public JvI A05;
    public L8F A06;
    public MqttServiceStub A07;
    public 1PB A08;
    public Looper A09;
    public C0et A0A;
    public C00i A0B;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public C00i A0F;
    public C00i A0G;
    public C00i A0H;
    public C00i A0I;
    public 3bP A0J;
    public Set A0K;
    public Set A0L;
    public C15h A0M;
    public final C00i A0N;
    public final C00i A0O;
    public final C00i A0P;
    public final AnonymousClass074 A0Q;
    public final C00i A0R;
    public final C00i A0S;
    public final C00i A0T;
    public final C00i A0U;
    public final C00i A0V;
    public final C00i A0W;
    public final C00i A0X;

    /* loaded from: MqttServiceDelegate$MqttServiceStub.class */
    public final class MqttServiceStub extends Binder implements IInterface {
        public MqttServiceStub() {
            int A03 = 0FI.A03(865785400);
            attachInterface(this, "com.facebook.push.mqtt.ipc.IMqttPushService");
            0FI.A09(1835247252, A03);
        }

        public /* synthetic */ MqttServiceStub() {
            this();
            0FI.A09(-1695710334, 0FI.A03(-1909732836));
            0FI.A09(315583213, 0FI.A03(1531147230));
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.facebook.push.mqtt.ipc.MqttPubAckCallback$Stub$Proxy, com.facebook.push.mqtt.ipc.MqttPubAckCallback] */
        public static MqttPubAckCallback A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.push.mqtt.ipc.MqttPubAckCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof MqttPubAckCallback)) {
                return (MqttPubAckCallback) queryLocalInterface;
            }
            ?? obj = new Object();
            int A03 = 0FI.A03(-1433610503);
            obj.A00 = iBinder;
            0FI.A09(1738047632, A03);
            return obj;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.push.mqtt.ipc.MqttPublishListener$Stub$Proxy, java.lang.Object, com.facebook.push.mqtt.ipc.MqttPublishListener] */
        public static MqttPublishListener A01(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.push.mqtt.ipc.MqttPublishListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof MqttPublishListener)) {
                return (MqttPublishListener) queryLocalInterface;
            }
            ?? obj = new Object();
            int A03 = 0FI.A03(902240915);
            obj.A00 = iBinder;
            0FI.A09(-801116874, A03);
            return obj;
        }

        private boolean A02(MqttPublishListener mqttPublishListener, String str, String str2, byte[] bArr, long j, long j2) {
            18Y r320;
            int A03 = 0FI.A03(-1178593842);
            MqttServiceDelegate mqttServiceDelegate = MqttServiceDelegate.this;
            mqttServiceDelegate.A0M();
            try {
                if (C03L.A00.contains(str)) {
                    String A0L = AnonymousClass002.A0L("publishAndWaitForAckWithRefCode/topic:%s/startTime:%d", new Object[]{str, Long.valueOf(j2)});
                    0fH.A0g(A0L, "MqttService", "flytrap: %s");
                    mqttServiceDelegate.A08.BZQ(A0L);
                }
                JvI jvI = mqttServiceDelegate.A05;
                if (mqttPublishListener != null) {
                    new RwZ(mqttPublishListener);
                } else {
                    r320 = null;
                }
                boolean A0a = jvI.A0a(r320, str, str2, bArr, j, j2);
                0FI.A09(1403026246, A03);
                return A0a;
            } catch (InterruptedException | 0Mb | ExecutionException | TimeoutException e) {
                0fH.A0z("MqttService", "send/publish/exception; topic=%s", e, new Object[]{str});
                RemoteException remoteException = new RemoteException(e.toString());
                0FI.A09(79939074, A03);
                throw remoteException;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(-83868798, 0FI.A03(1162142793));
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00d9, code lost:
        
            if (r0.A05() == false) goto L17;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0035. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v106, types: [int] */
        /* JADX WARN: Type inference failed for: r0v135, types: [int] */
        /* JADX WARN: Type inference failed for: r0v206, types: [int] */
        /* JADX WARN: Type inference failed for: r0v240, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v241, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v248, types: [X.JvI, X.17n] */
        /* JADX WARN: Type inference failed for: r0v253, types: [int] */
        /* JADX WARN: Type inference failed for: r0v339, types: [X.170] */
        /* JADX WARN: Type inference failed for: r0v344, types: [X.170] */
        /* JADX WARN: Type inference failed for: r0v349, types: [X.170] */
        /* JADX WARN: Type inference failed for: r0v59, types: [X.0gd] */
        /* JADX WARN: Type inference failed for: r0v64, types: [X.18Y, X.0g2, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v77, types: [int] */
        /* JADX WARN: Type inference failed for: r1v53, types: [int] */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTransact(int r302, android.os.Parcel r303, android.os.Parcel r304, int r305) {
            /*
                Method dump skipped, instructions count: 1977
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqttlite.MqttServiceDelegate.MqttServiceStub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.074] */
    public MqttServiceDelegate(05P r302) {
        super(r302);
        this.A0V = 1BQ.A02(98420);
        this.A0X = 1BQ.A02(16804);
        this.A0P = 1BQ.A02(67984);
        this.A0T = 1BQ.A01();
        this.A0U = 1BQ.A02(32797);
        this.A0R = 1BQ.A02(16782);
        this.A0S = 1BQ.A02(16840);
        this.A0W = 1BQ.A02(16626);
        this.A0O = 1BQ.A02(115564);
        this.A0N = 1BQ.A02(131324);
        this.A05 = new JvI();
        this.A0Q = new Object();
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate, X.C05O
    public int A0C(Intent intent, int i, int i2) {
        super.A0C(intent, i, i2);
        Context applicationContext = ((C05O) this).A01.getApplicationContext();
        11T.A0A(applicationContext);
        if (0Mj.A01(applicationContext)) {
            0fH.A0j("MqttService", "onStartCommand: START_NOT_STICKY");
            return 2;
        }
        0fH.A0j("MqttService", "onStartCommand: START_STICKY");
        return 1;
    }

    @Override // X.C05O
    public IBinder A0H(Intent intent) {
        0fH.A0h(intent, "MqttService", "service/onBind; intent=%s");
        MqttServiceStub mqttServiceStub = this.A07;
        if (mqttServiceStub == null) {
            mqttServiceStub = new MqttServiceStub();
            this.A07 = mqttServiceStub;
        }
        return mqttServiceStub;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate, com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Looper A0L() {
        /*
            r301 = this;
            r0 = r301
            android.os.Looper r0 = r0.A09
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2b
            r0 = r301
            X.05P r0 = r0.A01
            android.content.Context r0 = r0.getApplicationContext()
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            r0 = 32828(0x803c, float:4.6002E-41)
            r303 = r0
            r0 = r303
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L20
            r302 = r0
            goto L21
        L20:
            throw r0
        L21:
            r0 = r302
            android.os.Looper r0 = (android.os.Looper) r0
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A09 = r1
        L2b:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqttlite.MqttServiceDelegate.A0L():android.os.Looper");
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate, com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0N() {
        C1u9 c1u9 = (C1u9) this.A0S.get();
        c1u9.A02.execute(new C3fs(c1u9));
        super.A0N();
        if (A0Z != null) {
            A0Z = 1BK.A0d();
        }
        if (A0Y == this) {
            A0Y = null;
        }
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate, com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0O() {
        05P r0 = ((C05O) this).A01;
        Context applicationContext = r0.getApplicationContext();
        11T.A0A(applicationContext);
        C1cx.A00(applicationContext);
        this.A0F = 1BV.A00(32829);
        Context applicationContext2 = r0.getApplicationContext();
        11T.A0A(applicationContext2);
        this.A0G = new 1BV(applicationContext2, 310);
        this.A0K = 1Bi.A06(ActionId.RTMP_CONNECTION_REQUESTED);
        this.A0L = 1Bn.A0I(311);
        this.A00 = 1BQ.A02(84488);
        this.A0C = 1BQ.A02(33013);
        Context applicationContext3 = r0.getApplicationContext();
        11T.A0A(applicationContext3);
        this.A0B = new 1HH(applicationContext3, 65731);
        Context applicationContext4 = r0.getApplicationContext();
        11T.A0A(applicationContext4);
        this.A0E = new 1HH(applicationContext4, 65728);
        this.A0H = 1BV.A00(16455);
        this.A0I = 1BV.A00(16466);
        this.A0D = 1BQ.A02(131252);
        this.A0M = new 3jE(this, 2);
        this.A0A = (C0et) 1Bi.A03(83604);
        this.A01 = 1BQ.A02(32826);
        this.A03 = 1BV.A00(115658);
        this.A02 = 1BQ.A02(65815);
        this.A06 = ((AbR) this.A0G.get()).A10((09L) this.A0F.get());
        this.A08 = ((1P8) this.A0W.get()).A00("mqtt_instance");
        Context applicationContext5 = r0.getApplicationContext();
        11T.A0A(applicationContext5);
        0Mj.A00(applicationContext5);
        super.A0O();
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate, com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0Q(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            printWriter.println("[ MqttService ]");
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("notificationCounter=");
            printWriter.println(AnonymousClass001.A0a(((C1Aq) super.A05.A05(C1Aq.class)).A01(16D.A05), A0k));
            if (((1CQ) this.A0D.get()).A09(7, false)) {
                printWriter.println(0Pz.A0W("appId=", "256002347743983"));
                printWriter.println(0Pz.A0W("userId=", (String) ((Pair) this.A06.A0B.Asq()).first));
                String A3a = 1BK.A0R(this.A0C).A3a(C1ly.A02, "");
                if (!TextUtils.isEmpty(A3a)) {
                    printWriter.println(0Pz.A0j("fbnsToken=\"", A3a, "\""));
                }
                try {
                    printWriter.println(0Pz.A0j("fbnsliteToken=\"", new JSONObject(1BK.A0R(this.A0C).A3a(C1ly.A01, "")).getString("k"), "\""));
                } catch (JSONException unused) {
                }
                printWriter.println(0Pz.A0W("deviceId=", this.A06.A0A.getDeviceId()));
            }
        } catch (Exception unused2) {
        }
        super.A0Q(fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public C17q A0R() {
        MqttServiceDelegate mqttServiceDelegate = A0Y;
        if (mqttServiceDelegate != null) {
            mqttServiceDelegate.A0X();
            ((1I7) this.A0E.get()).CkT("ACTION_MQTT_FORCE_REBIND");
        }
        A0Y = this;
        C1m1 c1m1 = (C1m1) this.A0R.get();
        C08t c08t = C08t.DISCONNECTED;
        long A09 = 1BL.A09(this.A00);
        JvI jvI = this.A05;
        c1m1.A02(new C1ns(c08t, A09, jvI.A01, jvI.A02, jvI.A0e));
        C17q c17q = new C17q();
        FbUserSession A0F = 1BL.A0F();
        this.A06.A02(((C05O) this).A01, A0F, jvI, super.A0D, c17q, 0S2.A00);
        return c17q;
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public Integer A0T() {
        return 0S2.A00;
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public String A0U() {
        return ((C1cd) this.A0M.get()).name();
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0Y() {
        super.A0Y();
        C1u9 c1u9 = (C1u9) this.A0S.get();
        c1u9.A02.execute(new 5qO(c1u9, new 3bZ(this)));
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0Z() {
        super.A0Z();
        HashSet hashSet = new HashSet(this.A0K);
        hashSet.addAll(this.A0L);
        JvI jvI = this.A05;
        C1o0 c1o0 = (C1o0) this.A0X.get();
        C16v c16v = super.A05;
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        this.A04 = new KmF((C01s) this.A0T.get(), new C00y(new 3jE(this, 1)), jvI, c1o0, super.A03, super.A0E, c16v, immutableMap, hashSet);
        Boolean bool = A0Z;
        if (bool != null) {
            if (!bool.booleanValue()) {
                A0Z = true;
                return;
            }
            A0Z = null;
            C16q c16q = super.A0E;
            String A0W = 0Pz.A0W(AnonymousClass185.A00(A0T()), ".SERVICE_DOUBLE_BOOTSTRAP");
            String A0U = A0U();
            0Go r0 = 0Go.A00;
            c16q.A06(null, r0, r0, A0W, A0U, null, 0L, super.A0B.get());
        }
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0a() {
        if (this.A0A == C0et.A0P) {
            3cB r0 = new 3cB(this);
            17K r02 = super.A07;
            synchronized (r02) {
                boolean equals = r02.A03.getLooper().equals(Looper.myLooper());
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("ScreenStateListener registration should be called on MqttThread. Current Looper:");
                String A0a2 = AnonymousClass001.A0a(Looper.myLooper(), A0k);
                if (!equals) {
                    Log.w(C16d.class.getName(), A0a2);
                    if (!C16d.A00) {
                        throw AnonymousClass001.A0J(A0a2);
                    }
                }
                r02.A00 = r0;
            }
        }
        this.A0J = new 3bP(this);
        ((1X6) this.A0P.get()).A04(this.A0J);
        ((0Ep) this.A0U.get()).A04((Handler) this.A01.get());
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0b() {
        ((1X6) this.A0P.get()).A05(this.A0J);
        this.A0J = null;
        0Ep r0 = (0Ep) this.A0U.get();
        BroadcastReceiver broadcastReceiver = r0.A00;
        if (broadcastReceiver != null) {
            05L.A02.A07(broadcastReceiver, r0.A04);
            r0.A00 = null;
        }
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0e(C16h c16h, Long l, String str, byte[] bArr, int i, long j) {
        if (l != null) {
            ((I5r) this.A03.get()).A02(l.longValue(), "scheduleMqttMessageProcessing");
        }
        1BK.A1E(A0a.contains(str) ? this.A0I : this.A0H).execute(new LrA(this, c16h, l, str, bArr, i, j));
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0g(C08t c08t) {
        long A09 = 1BL.A09(this.A00);
        JvI jvI = this.A05;
        ((C1m1) this.A0R.get()).A02(new C1ns(c08t, A09, jvI.A01, jvI.A02, jvI.A0e));
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0h(C18d c18d) {
        if (c18d == C18d.FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED) {
            ((1I7) this.A0B.get()).CkS(new Intent("ACTION_MQTT_NO_AUTH"));
        }
        1uD.A01();
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0i(C18z c18z) {
        ((AtomicLong) ((C17v) super.A05.A05(C1Aq.class)).A01(16D.A04)).addAndGet(((0Ep) this.A0U.get()).A02());
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0j(String str, long j, boolean z) {
        if (str.startsWith(AnonymousClass000.A00(ActionId.FUTURE_LISTENERS_COMPLETE))) {
            str = 09V.A01(str.substring(8));
        }
        ((MqttStats) this.A0V.get()).A00(str, j, z);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0k(String str, String str2, Throwable th) {
        1BK.A09(this.A0T).softReport(str, str2, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r301.A06.A0B.Asq() == X.09N.A00) goto L6;
     */
    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0l() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = super.A0l()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L25
            r0 = r301
            X.L8F r0 = r0.A06
            X.09L r0 = r0.A0B
            r303 = r0
            r0 = r303
            X.09N r0 = r0.Asq()
            r304 = r0
            X.09N r0 = X.09N.A00
            r305 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L29
        L25:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L29:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqttlite.MqttServiceDelegate.A0l():boolean");
    }

    @Override // X.C05O, X.AnonymousClass025
    public Object B5M(Object obj) {
        return this.A0Q.A00(obj);
    }

    @Override // X.C05O, X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        this.A0Q.A01(obj, obj2);
    }
}
