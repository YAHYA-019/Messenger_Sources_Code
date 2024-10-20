package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DexErrorRecoveryInfo;
import com.facebook.common.dextricks.DexErrorRecoveryInfoAsync;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.common.dextricks.verifier.Verifier;

/* renamed from: X.3xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xz.class */
public final class C03413xz implements InterfaceC03403xy {
    @Override // X.InterfaceC03403xy
    public String AMN() {
        return "dex_info";
    }

    @Override // X.InterfaceC03403xy
    public long BeG() {
        return OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
    }

    @Override // X.InterfaceC03403xy
    public void CDW(C03b c03b) {
        boolean z;
        boolean z2;
        0Gn AxQ = c03b.AxQ();
        if (DexErrorRecoveryInfo.sDeoptTaint) {
            AxQ.A06("dex_unopt", AnonymousClass001.A0K());
        }
        DexErrorRecoveryInfo mainDexStoreLoadInformation = DexErrorRecoveryInfo.getMainDexStoreLoadInformation();
        AxQ.A06("odex_scheme_name", mainDexStoreLoadInformation.odexSchemeName);
        int i = mainDexStoreLoadInformation.loadResult;
        if ((i & 512) != 0) {
            AxQ.A06("dex2oat_quick", AnonymousClass001.A0K());
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            AxQ.A06("pgo", AnonymousClass001.A0K());
        }
        if (mainDexStoreLoadInformation.dexoptDuringColdStart) {
            AxQ.A06("dexopt_during_cold_start", AnonymousClass001.A0K());
        }
        long j = mainDexStoreLoadInformation.odexSize;
        AxQ.A03("odex_size", j);
        if (j != 0) {
            long j2 = mainDexStoreLoadInformation.odexLastModified;
            AxQ.A03("odex_last_modified", j2);
            AxQ.A03("time_since_odex_last_modified", System.currentTimeMillis() - j2);
        }
        long j3 = mainDexStoreLoadInformation.vdexSize;
        AxQ.A03("vdex_size", j3);
        if (j3 != 0) {
            AxQ.A03("vdex_last_modified", mainDexStoreLoadInformation.vdexLastModified);
        }
        int i2 = mainDexStoreLoadInformation.hacksDesired;
        if (i2 != 0) {
            AxQ.A02("hacks_desired", i2);
            AxQ.A02("hacks_installed", mainDexStoreLoadInformation.hacksInstalled);
        }
        DexStore mainDexStore = DexLibLoader.getMainDexStore();
        if (mainDexStore != null) {
            AxQ.A03("apk_last_modified", mainDexStore.mApk.lastModified());
        } else {
            AxQ.A02("apk_last_modified", 0);
        }
        AxQ.A06("longtail_installed", Boolean.valueOf(00Y.A00().A09("longtail")));
        AxQ.A02("storage_kind", mainDexStoreLoadInformation.storageKind);
        synchronized (Verifier.class) {
            z = Verifier.sTriedDisableRuntimeVerification;
        }
        if (z) {
            synchronized (Verifier.class) {
                z2 = Verifier.sDisabledRuntimeVerification;
            }
            AxQ.A06(z2 ? "disabled_rt_verifier" : "failed_disable_rt_verifier", true);
        }
        ClassLoader classLoader = MultiDexClassLoader.sInstalledClassLoader;
        String simpleName = classLoader != null ? classLoader.getClass().getSimpleName() : "mdcl_none";
        if (simpleName.isEmpty()) {
            simpleName = "mdcl_anonymous";
        }
        AxQ.A06(DKB.A00(9), simpleName);
        DexErrorRecoveryInfoAsync mainDexStoreLoadInformation2 = DexErrorRecoveryInfoAsync.getMainDexStoreLoadInformation();
        if (mainDexStoreLoadInformation2 == null) {
            AxQ.A06("no_async_info", AnonymousClass001.A0K());
            return;
        }
        Boolean bool = mainDexStoreLoadInformation2.usingBaseAppImage;
        if (bool != null) {
            AxQ.A04("using_base_app_image", bool);
        }
        Long l = mainDexStoreLoadInformation2.baseAppImageSize;
        if (l != null) {
            AxQ.A05("base_app_image_size", l);
        }
        Boolean bool2 = mainDexStoreLoadInformation2.usingBaseOdex;
        if (bool2 != null) {
            AxQ.A04("using_base_odex", bool2);
        }
        Long l2 = mainDexStoreLoadInformation2.baseOdexSize;
        if (l2 != null) {
            AxQ.A05("base_odex_size", l2);
        }
        Boolean bool3 = mainDexStoreLoadInformation2.usingBaseVdex;
        if (bool3 != null) {
            AxQ.A04("using_base_vdex", bool3);
        }
        Long l3 = mainDexStoreLoadInformation2.baseVdexSize;
        if (l3 != null) {
            AxQ.A05("base_vdex_size", l3);
        }
        Long l4 = mainDexStoreLoadInformation2.vdexFileInDMSize;
        if (l4 != null) {
            AxQ.A05("dm_vdex_size", l4);
        }
    }
}
