package com.facebook.sync;

import X.09X;
import X.0CM;
import X.0Pz;
import X.0fH;
import X.1Bi;
import X.1Bn;
import X.1Du;
import X.1Hv;
import X.1I6;
import X.1I7;
import X.1JU;
import X.1Mu;
import X.1NS;
import X.1P9;
import X.2JT;
import X.4hV;
import X.4hX;
import X.A37;
import X.C06644hi;
import X.C08j;
import X.C1Gu;
import X.EnumC06914ib;
import X.InterfaceC06564ha;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.sync.SyncInitializer;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: SyncInitializer.class */
public final class SyncInitializer {
    public C06644hi A00;
    public boolean A01;
    public final Context A02;
    public final 1I7 A03;
    public final C1Gu A04;
    public final FbSharedPreferences A05;
    public final 2JT A06;
    public final 4hV A07;
    public final 4hX A08;
    public final Set A0C;
    public final 1Mu A0A = new ArrayListMultimap();
    public final 1Mu A09 = new ArrayListMultimap();
    public final Map A0B = new HashMap();

    public SyncInitializer() {
        Context A00 = FbInjector.A00();
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        C1Gu c1Gu = (C1Gu) 1Bn.A0A(65844);
        2JT r0 = (2JT) 1Bi.A03(16962);
        1I7 r02 = (1I7) 1Hv.A02(A00, 65728);
        4hV r03 = (4hV) 1Bn.A0A(68364);
        4hX r04 = (4hX) 1Bn.A0A(131347);
        this.A02 = A00;
        this.A05 = fbSharedPreferences;
        this.A04 = c1Gu;
        this.A06 = r0;
        this.A03 = r02;
        this.A0C = 1Bi.A06(185);
        this.A07 = r03;
        this.A00 = null;
        this.A08 = r04;
    }

    public static void A00(final EnumC06914ib enumC06914ib, final SyncInitializer syncInitializer, final String str, final Collection collection) {
        syncInitializer.A07.A00.BTx().addListener(new Runnable() { // from class: X.4id
            public static final String __redex_internal_original_name = "SyncInitializer$4";

            @Override // java.lang.Runnable
            public void run() {
                0fH.A0A(SyncInitializer.class, "ensureSyncIfEnabled: hasValidLoggedInUserForSyncFuture callback");
                SyncInitializer syncInitializer2 = syncInitializer;
                4hX r0 = syncInitializer2.A08;
                String str2 = str;
                String A0W = 0Pz.A0W("ensure_sync_start_from_", str2);
                MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) r0.A00.A00.get();
                11T.A0F(A0W, 0);
                MessagingStateChangePerformanceLogger.A04(messagingStateChangePerformanceLogger, A0W);
                Collection<InterfaceC06564ha> collection2 = collection;
                EnumC06914ib enumC06914ib2 = enumC06914ib;
                0fH.A0V(enumC06914ib2, SyncInitializer.class, "ensureSyncIfEnabled trigger: %s, analyticsTag: %s", str2);
                if (syncInitializer2.A07.A00()) {
                    for (InterfaceC06564ha interfaceC06564ha : collection2) {
                        if (interfaceC06564ha.isEnabled()) {
                            0fH.A07(SyncInitializer.class, interfaceC06564ha, "handler: %s");
                            interfaceC06564ha.AQb(enumC06914ib2, str2);
                        }
                    }
                }
            }
        }, 1JU.A01);
    }

    public void A01() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                0fH.A0E(SyncInitializer.class, "Start regular sync initialization");
                Set<InterfaceC06564ha> set = this.A0C;
                for (InterfaceC06564ha interfaceC06564ha : set) {
                    1Du it = ImmutableList.of().iterator();
                    while (it.hasNext()) {
                        this.A0A.CZw(it.next(), interfaceC06564ha);
                    }
                    1Du it2 = interfaceC06564ha.BE3().iterator();
                    while (it2.hasNext()) {
                        this.A09.CZw(it2.next(), interfaceC06564ha);
                    }
                }
                this.A00 = new C06644hi(this);
                this.A05.CcW(this.A00, this.A0A.keySet());
                this.A04.A01(this.A00, 1NS.A03(this.A09.keySet()));
                0CM r0 = new 0CM(new C08j[]{new C08j() { // from class: X.4i3
                    @Override // X.C08j
                    public ArrayList Ara() {
                        return new ArrayList(Arrays.asList(new IntentFilter(1BJ.A00(77))));
                    }

                    @Override // X.C08j
                    public void CFb(Context context, Intent intent, C01q c01q) {
                        0fH.A0A(SyncInitializer.class, "Device's locale changed.");
                        SyncInitializer syncInitializer = SyncInitializer.this;
                        C06644hi c06644hi = syncInitializer.A00;
                        Set set2 = syncInitializer.A0C;
                        EnumC06914ib enumC06914ib = EnumC06914ib.NORMAL;
                        SyncInitializer syncInitializer2 = c06644hi.A00;
                        syncInitializer2.A06.A00.A01();
                        SyncInitializer.A00(enumC06914ib, syncInitializer2, "onLocaleChange", set2);
                    }
                }});
                09X.A00();
                09X.A03(this.A02, r0);
                1I6 r02 = this.A03;
                1P9 r03 = new 1P9(r02);
                r03.A05(new A37(this, 11), "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
                r03.A02().A00();
                for (InterfaceC06564ha interfaceC06564ha2 : set) {
                    String B6W = interfaceC06564ha2.B6W();
                    if (B6W != null) {
                        Map map = this.A0B;
                        if (map.containsKey(B6W)) {
                            throw 0Pz.A08("Multiple handlers for the same refresh action: ", B6W);
                        }
                        map.put(B6W, interfaceC06564ha2);
                    }
                }
                1P9 r04 = new 1P9(r02);
                A37 a37 = new A37(this, 12);
                Map map2 = this.A0B;
                if (!map2.isEmpty()) {
                    Iterator it3 = map2.keySet().iterator();
                    while (it3.hasNext()) {
                        r04.A05(a37, (String) it3.next());
                    }
                    r04.A02().A00();
                }
                A00(EnumC06914ib.NORMAL, this, "init", set);
            }
        }
    }
}
