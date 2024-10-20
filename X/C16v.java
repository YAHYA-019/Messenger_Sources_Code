package X;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.16v, reason: invalid class name */
/* loaded from: 16v.class */
public final class C16v {
    public final C16x A00;
    public final Context A03;
    public final AnonymousClass094 A04;
    public final RealtimeSinceBootClock A05;
    public final AnonymousClass097 A06;
    public final C16f A07;
    public final C16k A08;
    public final 17I A09;
    public final 17K A0A;
    public final String A0B;
    public final boolean A0E;
    public volatile C16m A0F;
    public final ConcurrentMap A02 = new ConcurrentHashMap();
    public final C04O A01 = C04N.A00();
    public volatile String A0G = "";
    public volatile String A0I = "";
    public volatile String A0K = "";
    public volatile String A0H = "";
    public volatile String A0J = "";
    public final HashMap A0C = AnonymousClass001.A0u();
    public final HashMap A0D = AnonymousClass001.A0u();

    public C16v(Context context, AnonymousClass094 anonymousClass094, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass097 anonymousClass097, C16f c16f, C16k c16k, 17I r308, 17K r309, String str, boolean z) {
        this.A03 = context;
        this.A08 = c16k;
        this.A0B = str;
        this.A09 = r308;
        this.A0A = r309;
        this.A00 = new C16x(context, realtimeSinceBootClock);
        this.A06 = anonymousClass097;
        this.A05 = realtimeSinceBootClock;
        this.A07 = c16f;
        this.A0E = z;
        this.A04 = anonymousClass094;
    }

    public static C1As A00(C16v c16v) {
        String str;
        String upperCase;
        NetworkInfo A02;
        String str2;
        String upperCase2;
        C1As c1As = (C1As) c16v.A05(C1As.class);
        c1As.A03(16G.A0F, c16v.A0B);
        c1As.A03(16G.A02, c16v.A0G);
        c1As.A03(16G.A0C, c16v.A0I);
        AnonymousClass094 anonymousClass094 = c16v.A04;
        Context context = c16v.A03;
        C09D A01 = 0Pz.A01(context, anonymousClass094, "analytics");
        c1As.A03(16G.A0H, String.valueOf(A01.getInt("year_class", 0)));
        c1As.A03(16G.A08, A03(0Pz.A01(context, anonymousClass094, "gk").getAll()));
        c1As.A03(16G.A07, A03(0Pz.A01(context, anonymousClass094, "flags").getAll()));
        C16f c16f = c16v.A07;
        if (c16f != null) {
            c1As.A03(16G.A01, C16f.A00(c16f) ? "fg" : "bg");
        }
        c1As.A03(16G.A0E, c16v.A0A.A00() ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
        0Gp A00 = c16v.A08.A00(TelephonyManager.class, "phone");
        16G r0 = 16G.A04;
        if (A00.A06()) {
            str = ((TelephonyManager) A00.A05()).getNetworkCountryIso();
            if (str == null) {
                upperCase = null;
                c1As.A03(r0, upperCase);
                16G r02 = 16G.A0B;
                17I r03 = c16v.A09;
                c1As.A03(r02, 16T.A00(r03.A03().A02).toUpperCase());
                16G r04 = 16G.A0A;
                A02 = r03.A02();
                if (A02 != null || TextUtils.isEmpty(A02.getSubtypeName())) {
                    str2 = "none";
                } else {
                    str2 = A02.getSubtypeName();
                    if (str2 == null) {
                        upperCase2 = null;
                        c1As.A03(r04, upperCase2);
                        c1As.A03(16G.A06, Boolean.valueOf(A01.getBoolean("is_employee", false)));
                        c1As.A03(16G.A0G, c16v.A0K);
                        c1As.A03(16G.A05, c16v.A0H);
                        c1As.A03(16G.A0D, c16v.A0J);
                        return c1As;
                    }
                }
                upperCase2 = str2.toUpperCase();
                c1As.A03(r04, upperCase2);
                c1As.A03(16G.A06, Boolean.valueOf(A01.getBoolean("is_employee", false)));
                c1As.A03(16G.A0G, c16v.A0K);
                c1As.A03(16G.A05, c16v.A0H);
                c1As.A03(16G.A0D, c16v.A0J);
                return c1As;
            }
        } else {
            str = "";
        }
        upperCase = str.toUpperCase();
        c1As.A03(r0, upperCase);
        16G r022 = 16G.A0B;
        17I r032 = c16v.A09;
        c1As.A03(r022, 16T.A00(r032.A03().A02).toUpperCase());
        16G r042 = 16G.A0A;
        A02 = r032.A02();
        if (A02 != null) {
        }
        str2 = "none";
        upperCase2 = str2.toUpperCase();
        c1As.A03(r042, upperCase2);
        c1As.A03(16G.A06, Boolean.valueOf(A01.getBoolean("is_employee", false)));
        c1As.A03(16G.A0G, c16v.A0K);
        c1As.A03(16G.A05, c16v.A0H);
        c1As.A03(16G.A0D, c16v.A0J);
        return c1As;
    }

    public static C1Aq A01(C16v c16v, long j) {
        C1Aq c1Aq = (C1Aq) c16v.A05(C1Aq.class);
        ((AtomicLong) c1Aq.A01(16D.A09)).set(j);
        AtomicLong atomicLong = (AtomicLong) c1Aq.A01(16D.A0B);
        17I r0 = c16v.A09;
        AtomicLong atomicLong2 = r0.A05;
        long j2 = atomicLong2.get();
        long j3 = 0;
        if (j2 != 0) {
            j3 = SystemClock.elapsedRealtime() - j2;
        }
        atomicLong.set(j3);
        AtomicLong atomicLong3 = (AtomicLong) c1Aq.A01(16D.A0C);
        long j4 = r0.A04.get();
        long j5 = atomicLong2.get();
        long j6 = 0;
        if (j5 != 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        atomicLong3.set(j4 + j6);
        ((AtomicLong) c1Aq.A01(16D.A0E)).set(SystemClock.elapsedRealtime() - A04(C16u.A01, c16v).get());
        return c1Aq;
    }

    public static String A02(List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            java.util.Map map = ((AnonymousClass096) C08r.A00).A06;
            if (map.containsKey(next)) {
                listIterator.set(String.valueOf(map.get(next)));
            } else {
                0fH.A17("MqttHealthStatsHelper", "appPkgName %s not found in encoding map", new Object[]{next});
            }
        }
        return TextUtils.join(";", list);
    }

    public static String A03(java.util.Map map) {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator A0y = AnonymousClass001.A0y(map);
        boolean z = true;
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (z) {
                z = false;
            } else {
                A0k.append(";");
            }
            A0k.append(AnonymousClass001.A0j(A0z));
            A0k.append("|");
            A0k.append(A0z.getValue());
        }
        return A0k.toString();
    }

    public static AtomicLong A04(C16u c16u, C16v c16v) {
        AtomicLong atomicLong;
        synchronized (c16v) {
            HashMap hashMap = c16v.A0C;
            if (!hashMap.containsKey(c16u)) {
                hashMap.put(c16u, new AtomicLong());
            }
            atomicLong = (AtomicLong) hashMap.get(c16u);
        }
        return atomicLong;
    }

    public AnonymousClass170 A05(Class cls) {
        AnonymousClass170 anonymousClass170;
        AnonymousClass170 anonymousClass1702;
        synchronized (this) {
            try {
                String name = cls.getName();
                HashMap hashMap = this.A0D;
                if (!hashMap.containsKey(name)) {
                    if (cls == C1At.class) {
                        Context context = this.A03;
                        String str = this.A0B;
                        new 16H(context, this.A05, this.A06, str, "du", this.A0E);
                    } else if (cls == C1Ao.class) {
                        Context context2 = this.A03;
                        String str2 = this.A0B;
                        new 16H(context2, this.A05, this.A06, str2, PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, this.A0E);
                    } else if (cls == C1Ap.class) {
                        Context context3 = this.A03;
                        String str3 = this.A0B;
                        new 16H(context3, this.A05, this.A06, str3, "tp", this.A0E);
                    } else {
                        anonymousClass1702 = (AnonymousClass170) cls.newInstance();
                    }
                    hashMap.put(name, anonymousClass1702);
                }
                anonymousClass170 = (AnonymousClass170) hashMap.get(name);
            } catch (Exception e) {
                throw new RuntimeException("Incorrect stat category used:", e);
            }
        }
        return anonymousClass170;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        if (r308 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(java.lang.String r302, java.lang.String r303, java.lang.String r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16v.A06(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
