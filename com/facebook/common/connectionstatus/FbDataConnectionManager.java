package com.facebook.common.connectionstatus;

import X.0fH;
import X.1BQ;
import X.1G2;
import X.1GU;
import X.1HH;
import X.1I7;
import X.1Od;
import X.1P9;
import X.1Ql;
import X.2yD;
import X.40G;
import X.40H;
import X.43Q;
import X.4WH;
import X.AbstractC09674qv;
import X.C00i;
import X.C02l;
import X.C09664qu;
import X.C43R;
import X.C43h;
import X.C43i;
import X.C43k;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.common.connectionstatus.FbDataConnectionManager;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: FbDataConnectionManager.class */
public final class FbDataConnectionManager implements C43h, C43i {
    public long A00;
    public Context A01;
    public final C43k A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07 = new 1BQ(16687);
    public final C00i A08;
    public final C00i A09;
    public final C02l A0A;
    public final AtomicReference A0B;
    public final AtomicReference A0C;
    public final C00i A0D;
    public final C00i A0E;
    public volatile NetworkInfo A0F;
    public volatile boolean A0G;

    /* JADX WARN: Type inference failed for: r0v30, types: [X.43k] */
    public FbDataConnectionManager() {
        Context A00 = FbInjector.A00();
        this.A01 = A00;
        this.A04 = new 1HH(A00, 65728);
        this.A08 = new 1BQ(16464);
        this.A05 = new 1BQ(32854);
        this.A09 = new 1BQ(32884);
        this.A0E = new 1BQ(49295);
        this.A06 = new 1BQ(16385);
        this.A0D = new 1BQ(16458);
        this.A03 = new 1BQ(16616);
        this.A02 = new Runnable() { // from class: X.43k
            public static final String __redex_internal_original_name = "FbDataConnectionManager$ConnectionQualityResetRunnable";

            @Override // java.lang.Runnable
            public void run() {
                FbDataConnectionManager fbDataConnectionManager = FbDataConnectionManager.this;
                if (((1Od) fbDataConnectionManager.A03.get()).A0E()) {
                    AtomicReference atomicReference = fbDataConnectionManager.A0B;
                    40H r0 = 40H.A07;
                    atomicReference.set(r0);
                    fbDataConnectionManager.A0C.set(r0);
                    C43R c43r = (C43R) fbDataConnectionManager.A09.get();
                    synchronized (c43r) {
                        43Q r02 = c43r.A00;
                        if (r02 != null) {
                            r02.reset();
                        }
                        c43r.A01.set(r0);
                    }
                    40G r03 = (40G) fbDataConnectionManager.A05.get();
                    43Q r04 = r03.A00;
                    if (r04 != null) {
                        r04.reset();
                    }
                    r03.A01.set(r0);
                    FbDataConnectionManager.A00(fbDataConnectionManager);
                }
            }
        };
        40H r0 = 40H.A07;
        this.A0B = new AtomicReference(r0);
        this.A0C = new AtomicReference(r0);
        this.A0G = false;
        this.A0F = null;
        this.A00 = -1;
        this.A0A = new 4WH(this, 1);
    }

    public static void A00(FbDataConnectionManager fbDataConnectionManager) {
        C00i c00i = fbDataConnectionManager.A04;
        if (c00i.get() != null) {
            Intent intent = new Intent();
            intent.setAction("com.facebook.common.connectionstatus.FbDataConnectionManager.DATA_CONNECTION_STATE_CHANGE").putExtra("com.facebook.common.connectionstatus.FbDataConnectionManager.BANDWIDTH_STATE", (Serializable) fbDataConnectionManager.A0B.get()).putExtra("com.facebook.common.connectionstatus.FbDataConnectionManager.LATENCY_STATE", (Serializable) fbDataConnectionManager.A0C.get()).putExtra("com.facebook.common.connectionstatus.FbDataConnectionManager.CONNECTION_STATE", ((FbNetworkManager) fbDataConnectionManager.A07.get()).A0M());
            ((1I7) c00i.get()).CkS(intent);
        }
        C09664qu c09664qu = (C09664qu) fbDataConnectionManager.A0E.get();
        String A06 = fbDataConnectionManager.A06();
        Object obj = fbDataConnectionManager.A0B.get();
        Object obj2 = fbDataConnectionManager.A0C.get();
        boolean A0M = ((FbNetworkManager) fbDataConnectionManager.A07.get()).A0M();
        boolean z = !((1Od) fbDataConnectionManager.A03.get()).A0E();
        String obj3 = obj.toString();
        0fH.A13("HistoricalConnectionQuality", "Update: connection %s, bandwidth %s, latency %s, connected %b, background %b", new Object[]{A06, obj3, obj2.toString(), Boolean.valueOf(A0M), Boolean.valueOf(!z)});
        if (obj.equals(40H.A07)) {
            return;
        }
        ConcurrentMap concurrentMap = c09664qu.A01;
        if (obj.equals(concurrentMap.get(A06))) {
            return;
        }
        concurrentMap.put(A06, obj);
        1G2 A0D = C09664qu.A02.A0D(A06);
        1Ql edit = ((FbSharedPreferences) c09664qu.A00.get()).edit();
        edit.CaL(A0D, obj3);
        edit.commit();
    }

    public double A01() {
        double AYQ;
        40G r0 = (40G) this.A05.get();
        synchronized (r0) {
            43Q r02 = r0.A00;
            AYQ = r02 == null ? -1.0d : r02.AYQ();
        }
        return AYQ;
    }

    public double A02() {
        43Q r0 = ((C43R) this.A09.get()).A00;
        if (r0 == null) {
            return -1.0d;
        }
        return r0.AYQ();
    }

    public 40H A03() {
        A07();
        return (40H) this.A0B.get();
    }

    public 40H A04() {
        A07();
        return (40H) this.A0C.get();
    }

    public 40H A05() {
        40H A03;
        40H r310;
        A07();
        if (SystemClock.elapsedRealtime() - this.A00 <= 10000) {
            if (((2yD) this.A06.get()).AZk(36310340716462262L)) {
                if (this.A0F == null) {
                    this.A0F = ((FbNetworkManager) this.A07.get()).A0A();
                }
                NetworkInfo networkInfo = this.A0F;
                if (networkInfo != null) {
                    networkInfo.getType();
                }
            }
            A03 = 40H.A03;
        } else {
            A03 = A03();
            40H r0 = 40H.A07;
            if (A03.equals(r0)) {
                if (this.A0F == null) {
                    this.A0F = ((FbNetworkManager) this.A07.get()).A0A();
                }
                NetworkInfo networkInfo2 = this.A0F;
                if (networkInfo2 == null) {
                    return r0;
                }
                C09664qu c09664qu = (C09664qu) this.A0E.get();
                String A06 = A06();
                ConcurrentMap concurrentMap = c09664qu.A01;
                if (concurrentMap.containsKey(A06)) {
                    r310 = (40H) concurrentMap.get(A06);
                } else {
                    String A3a = ((FbSharedPreferences) c09664qu.A00.get()).A3a(C09664qu.A02.A0D(A06), "");
                    r310 = r0;
                    if (!TextUtils.isEmpty(A3a)) {
                        try {
                            r310 = 40H.valueOf(A3a);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    concurrentMap.put(A06, r310);
                }
                if (!r310.equals(r0)) {
                    return r310;
                }
                int type = networkInfo2.getType();
                int subtype = networkInfo2.getSubtype();
                return (type != 1 && type == 0 && (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11)) ? 40H.A06 : 40H.A04;
            }
        }
        return A03;
    }

    public String A06() {
        if (this.A0F == null) {
            this.A0F = ((FbNetworkManager) this.A07.get()).A0A();
        }
        NetworkInfo networkInfo = this.A0F;
        String str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        if (networkInfo != null) {
            int type = networkInfo.getType();
            if (type == 0) {
                return AbstractC09674qv.A00(networkInfo.getSubtype());
            }
            if (type == 1) {
                if (!((FbNetworkManager) this.A07.get()).A0L()) {
                    return "WIFI";
                }
                str = "HOTSPOT";
            }
        }
        return str;
    }

    public void A07() {
        if (this.A0G || ((1GU) this.A0D.get()).BWu()) {
            return;
        }
        synchronized (this) {
            if (!this.A0G) {
                AtomicReference atomicReference = this.A0B;
                40G r0 = (40G) this.A05.get();
                List list = r0.A05;
                synchronized (list) {
                    list.add(this);
                }
                atomicReference.set((40H) r0.A01.get());
                AtomicReference atomicReference2 = this.A0C;
                C43R c43r = (C43R) this.A09.get();
                c43r.A06.add(this);
                atomicReference2.set((40H) c43r.A01.get());
                C00i c00i = this.A04;
                if (c00i.get() != null) {
                    this.A00 = SystemClock.elapsedRealtime();
                    1P9 r02 = new 1P9((1I7) c00i.get());
                    r02.A05(this.A0A, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
                    r02.A02().A00();
                }
                this.A0G = true;
            }
        }
    }

    @Override // X.C43i
    public void Bko(40H r302) {
        this.A0B.set(r302);
        A00(this);
    }

    @Override // X.C43h
    public void C3M(40H r302) {
        this.A0C.set(r302);
        A00(this);
    }
}
