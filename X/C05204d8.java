package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.inject.FbInjector;
import com.facebook.mobileconfig.MobileConfigDependenciesInFBApps;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigManagerParamsHolder;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.BuildConfig;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4d8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4d8.class */
public final class C05204d8 implements 1UN {
    public final 1Br A00 = 1Bq.A00(67570);
    public final ConcurrentHashMap A01 = new ConcurrentHashMap(10, 0.75f, 4);

    public C05204d8() {
        ((1UP) 1Bi.A03(66348)).A00(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, X.1CZ] */
    public final 1Cd A00(final String str) {
        11T.A0F(str, 0);
        ConcurrentHashMap concurrentHashMap = this.A01;
        1Cd r305 = (1Cd) concurrentHashMap.get(str);
        if (r305 == null) {
            1Cd r3052 = concurrentHashMap.get(str);
            if (r3052 == null) {
                final 4dD r0 = (4dD) this.A00.A00.get();
                final 1Br A00 = 1Bu.A00(68741);
                final Context A002 = FbInjector.A00();
                11T.A0A(A002);
                final 1Br A003 = 1Bu.A00(16396);
                r0.A02.A00.get();
                C0di A004 = C0di.A00();
                11T.A0A(A004);
                final boolean z = !A004.A05();
                final MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder = new MobileConfigManagerParamsHolder();
                mobileConfigManagerParamsHolder.setConsistencyLoggingEnabled(true);
                mobileConfigManagerParamsHolder.setConsistencyLoggingEveryNSec(2592000L);
                mobileConfigManagerParamsHolder.setUniverseType(4dN.A06.value);
                mobileConfigManagerParamsHolder.setQueryHashOptimization(false);
                1CW r02 = new 1CW() { // from class: X.4df
                    public final MobileConfigManagerHolderImpl AIb(File file, String str2) {
                        MobileConfigDependenciesInFBApps mobileConfigDependenciesInFBApps = MobileConfigDependenciesInFBApps.$redex_init_class;
                        MobileConfigDependenciesInFBApps mobileConfigDependenciesInFBApps2 = new MobileConfigDependenciesInFBApps(null, ((C05334di) A003.A00.get()).A00(), true, ((1gT) A00.A00.get()).BL6());
                        4dD r03 = r0;
                        r03.A00.A00.get();
                        String A02 = ((1H2) r03.A01.A00.get()).A02();
                        String str3 = str;
                        AssetManager assets = A002.getAssets();
                        boolean z2 = z;
                        MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder2 = mobileConfigManagerParamsHolder;
                        1GS r04 = (1GS) 1Bi.A03(16504);
                        String str4 = (String) 1Bn.A0A(99409);
                        HashMap A05 = 04R.A05(new 03Y[]{new 03Y("group_id", str3)});
                        ImmutableMap A005 = AbstractC05454dv.A00(r04, null, str4);
                        11T.A0A(A005);
                        A05.putAll(A005);
                        return mobileConfigDependenciesInFBApps2.createManager(file, BuildConfig.VERSION_NAME, A02, str3, 6, "", assets, z2, mobileConfigManagerParamsHolder2, A05, null);
                    }
                };
                1CJ r03 = new 1CJ();
                HashSet hashSet = new HashSet();
                File filesDir = 0Xe.A00().getFilesDir();
                AssetManager assets = A002.getAssets();
                1CH r04 = new 1CH() { // from class: X.4dg
                    public final String BIY() {
                        return str;
                    }
                };
                0fH.A0h(6, "MobileConfigFactoryImpl", "Created MobileConfigFactoryImpl, unitType:%s");
                r3052 = new 1Cd(assets, r04, r02, (1CZ) new Object(), r03, (1Cb) null, (1CA) null, filesDir, "", hashSet, (C15h) null, (C15h) null, (C15h) null, (C15h) null, (int[][]) null, 6, false, false, false);
                r3052.A0I();
                Object putIfAbsent = concurrentHashMap.putIfAbsent(str, r3052);
                if (putIfAbsent != 0) {
                    r3052 = putIfAbsent;
                }
            }
            r305 = r3052;
        }
        return r305;
    }

    public void AFz() {
        synchronized (this) {
            0fH.A0j("GroupIdMCRegistry", "Started clearing user data");
            this.A01.clear();
            0fH.A0j("GroupIdMCRegistry", "Finished clearing user data");
        }
    }
}
