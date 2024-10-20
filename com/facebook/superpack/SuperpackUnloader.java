package com.facebook.superpack;

import X.AnonymousClass001;
import X.C0M5;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: SuperpackUnloader.class */
public class SuperpackUnloader implements C0M5 {
    public static final Set COLD_START_LIBS;
    public static final Set HOLDOUT_LIBRARIES;
    public static final List sInMemoryLibraries;

    static {
        String[] strArr = new String[34];
        System.arraycopy(new String[]{"libbreakpad.so", "libliger.so", DalvikInternals.LIBCOLDSTART_BASE_NAME, "libdexload.so", "libreliabilitymerged.so", "libsigquit.so", "libappstatelogger2.so", "libnative_allocation_hooks_installer_jni.so", "libforker.so", "libgrimsey.so", "libfb_mboost.so", "libplthooks.so", "libfbandroid_native_cppdistract_cppdistract.so", "libbreakpad_extra.so", "libfbandroid_native_sigmuxutils_sigmuxutils.so", "libxplat_pvd_segmentation_model_holder_plc_pytorch_model_holdersAndroid.so", "libdistractutil.so", "libchipsetmerged.so", "libvmasaver.so", "libdalvikdistract.so", "libfbandroid_native_museum_museum.so", "libglog.so", "libpando-core.so", "libpando-engine.so", "libxplat_third-party_jsoncpp_jsoncppAndroid.so", "libxplat_mobilenetwork_fbdomainsAndroid.so", "libfmt.so"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"libthird-party_boost_boost_contextAndroid.so", "libthird-party_boost_boostAndroid.so", "liblinkerutils.so", "libmem_alloc_marker.so", "libfbunwindstack.so", "liblive-query-jni.so", "libaospbugfixmerged.so"}, 0, strArr, 27, 7);
        HOLDOUT_LIBRARIES = AnonymousClass001.A0w(strArr);
        String[] strArr2 = new String[35];
        System.arraycopy(new String[]{"libfbandroid_native_cppdistract_cppdistract.so", "libfbandroid_native_museum_museum.so", "libglog.so", "libfbandroid_native_sigmuxutils_sigmuxutils.so", "libbreakpad.so", "libdexload.so", "libxplat_third-party_jsoncpp_jsoncppAndroid.so", "libappstatelogger2.so", "libpreconnector.so", "libxplat_mobilenetwork_fbdomainsAndroid.so", "libfmt.so", "libthird-party_boost_boost_contextAndroid.so", "libthird-party_boost_boostAndroid.so", "liblinkerutils.so", "libplthooks.so", "libmem_alloc_marker.so", "libfbunwindstack.so", "liblive-query-jni.so", DalvikInternals.LIBCOLDSTART_BASE_NAME, "libaospbugfixmerged.so", "libsigquit.so", "libreliabilitymerged.so", "libfb_mboost.so", "libtigonnativeauthedservice.so", "libimagepipeline.so", "libxplat_arfx_versioning_sdk_version_constants_constantsAndroid.so", "libard-upload.so"}, 0, strArr2, 0, 27);
        System.arraycopy(new String[]{"libIGL.so", "libimagesmerged.so", "libthreadutils-jni.so", "libclasstracing.so", "libunwindstack_stream.so", "libbreakpad_extra.so", "libfbnightwatch.so", "libreliablemediamonitor.so"}, 0, strArr2, 27, 8);
        COLD_START_LIBS = AnonymousClass001.A0w(strArr2);
        sInMemoryLibraries = Collections.synchronizedList(AnonymousClass001.A0s());
    }

    public static native long getProcessMappings(String str);

    public static native void releaseProcessMappings(long j);

    public static native void unload(long j, String str);

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r311v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r311v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 311, insn: 0x00e7: MOVE (r0 I:??[long, double]) = (r311 I:??[long, double]), block:B:52:0x00e7 */
    @Override // X.C0M5
    public void onTrim(X.0IZ r302) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.superpack.SuperpackUnloader.onTrim(X.0IZ):void");
    }
}
