package com.facebook.breakpad;

import X.0eB;
import X.0fH;
import X.AnonymousClass001;
import X.C0il;
import android.content.Context;
import android.os.Build;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.mapbox.mapboxsdk.BuildConfig;
import java.io.File;
import java.util.Formatter;
import java.util.TreeMap;

/* loaded from: BreakpadManager.class */
public class BreakpadManager {
    public static volatile boolean initialized;
    public static volatile File mCrashDirectory;

    public static native void addMappingInfo(String str, byte[] bArr, int i, long j, long j2, long j3);

    public static boolean containsKey(String str) {
        boolean nativeContainsKey;
        if (!isActive()) {
            0fH.A0n("BreakpadManager", "Breakpad is not active (containsKey).");
            return false;
        }
        ensureLoadLibrary();
        if (!AnonymousClass001.A1N(((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) > OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 1 : ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 0 : -1)))) {
            0fH.A0j("BreakpadManager", "Breakpad customData disabled.");
            return false;
        }
        synchronized (BreakpadManager.class) {
            nativeContainsKey = nativeContainsKey(str);
        }
        return nativeContainsKey;
    }

    public static native void crashProcessByAssert(String str);

    public static native void crashThisProcess();

    public static native void crashThisProcessAsan();

    public static native void crashThisProcessGWPAsan();

    public static native boolean disableCoreDumpingImpl();

    public static boolean enableCoreDumping(Context context) {
        ensureLoadLibrary();
        if (isCoreResourceHardUnlimited()) {
            return enableCoreDumpingImpl(context.getApplicationInfo().dataDir);
        }
        return false;
    }

    public static native boolean enableCoreDumpingImpl(String str);

    public static void ensureLoadLibrary() {
        synchronized (BreakpadManager.class) {
            if (!initialized) {
                C0il.A0B("breakpad");
                initialized = true;
            }
        }
    }

    public static File getCrashDirectory() {
        if (mCrashDirectory != null) {
            return mCrashDirectory;
        }
        throw AnonymousClass001.A0T("Breakpad not installed");
    }

    public static String getCustomData(String str) {
        String nativeGetCustomData;
        if (!isActive()) {
            0fH.A0n("BreakpadManager", "Breakpad is not active (getCustomData).");
            return "";
        }
        ensureLoadLibrary();
        if (!AnonymousClass001.A1N(((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) > OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 1 : ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 0 : -1)))) {
            0fH.A0j("BreakpadManager", "Breakpad customData disabled.");
            return "";
        }
        synchronized (BreakpadManager.class) {
            nativeGetCustomData = nativeGetCustomData(str);
        }
        return nativeGetCustomData;
    }

    public static native void install(String str, String str2, String str3, int i, int i2, boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (com.facebook.breakpad.BreakpadManager.mCrashDirectory == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isActive() {
        /*
            boolean r0 = com.facebook.breakpad.BreakpadManager.initialized
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L12
            java.io.File r0 = com.facebook.breakpad.BreakpadManager.mCrashDirectory
            r302 = r0
            r0 = 1
            r301 = r0
            r0 = r302
            if (r0 != 0) goto L14
        L12:
            r0 = 0
            r301 = r0
        L14:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.breakpad.BreakpadManager.isActive():boolean");
    }

    public static native boolean isCoreResourceHardUnlimited();

    public static native boolean isPrivacyModeEnabled();

    public static native boolean nativeContainsKey(String str);

    public static native String nativeGetCustomData(String str);

    public static native void nativeGetCustomDataSnapshot(TreeMap treeMap);

    public static native long nativeGetMinidumpFlags();

    public static native void nativeRemoveCustomData(String str);

    public static native void nativeSetCustomData(String str, String str2);

    public static native boolean nativeSetJvmStreamEnabled(boolean z, boolean z2);

    public static native void nativeSetMinidumpFlags(long j);

    public static void removeCustomData(String str) {
        if (!isActive()) {
            0fH.A0n("BreakpadManager", "Breakpad is not active (removeCustomData).");
            return;
        }
        ensureLoadLibrary();
        if (!AnonymousClass001.A1N(((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) > OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 1 : ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 0 : -1)))) {
            0fH.A0j("BreakpadManager", "Breakpad customData disabled.");
        } else {
            synchronized (BreakpadManager.class) {
                nativeRemoveCustomData(str);
            }
        }
    }

    public static void setCustomData(String str, String str2, Object... objArr) {
        if (!isActive()) {
            0fH.A0n("BreakpadManager", "Breakpad is not active (setCustomData).");
            return;
        }
        ensureLoadLibrary();
        if (!AnonymousClass001.A1N(((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) > OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 1 : ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED ? 0 : -1)))) {
            0fH.A0j("BreakpadManager", "Breakpad customData disabled.");
            return;
        }
        synchronized (BreakpadManager.class) {
            if (objArr.length > 0 && str2 != null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                Formatter formatter = new Formatter(A0k);
                formatter.format(str2, objArr);
                formatter.close();
                str2 = A0k.toString();
            }
            nativeSetCustomData(str, str2);
        }
    }

    public static void setJvmStreamEnabled(boolean z) {
        boolean z2;
        synchronized (BreakpadManager.class) {
            String property = System.getProperty("java.vm.version");
            if (property == null || property.startsWith("1.") || property.startsWith("0.")) {
                z2 = false;
            } else {
                z2 = true;
                if (z) {
                    C0il.A0B("breakpad_cpp_helper");
                }
            }
            nativeSetJvmStreamEnabled(z2, z);
        }
    }

    public static native void setVersionInfo(int i, String str, String str2);

    public static native boolean simulateSignalDelivery(int i, String str);

    public static void start(Context context) {
        start(context, 0L, 1536000, null, null, false);
    }

    public static void start(Context context, long j, int i, String str, String str2, boolean z) {
        String str3 = str;
        synchronized (BreakpadManager.class) {
            ensureLoadLibrary();
            if (mCrashDirectory == null) {
                File A00 = 0eB.A00(context, 1874789883);
                A00.mkdirs();
                String absolutePath = A00.getAbsolutePath();
                if (str == null) {
                    str3 = "";
                }
                install(absolutePath, str3, str2, 1536000, Build.VERSION.SDK_INT, z);
                mCrashDirectory = A00;
                ensureLoadLibrary();
                long nativeGetMinidumpFlags = j | nativeGetMinidumpFlags() | 2 | 4;
                ensureLoadLibrary();
                nativeSetMinidumpFlags(nativeGetMinidumpFlags);
                int A01 = BuildConstants.A01();
                String str4 = Build.FINGERPRINT;
                setVersionInfo(A01, BuildConfig.VERSION_NAME, str4);
                setCustomData("Fingerprint", str4, AnonymousClass001.A1Z());
            }
        }
    }

    public static native void uninstall();
}
