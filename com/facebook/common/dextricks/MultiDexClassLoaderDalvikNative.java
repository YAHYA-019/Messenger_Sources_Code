package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0il;
import android.content.Context;
import android.util.Log;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.common.dextricks.stats.ClassLoadingStatsNative;
import dalvik.system.DexFile;
import java.util.ArrayList;

/* loaded from: MultiDexClassLoaderDalvikNative.class */
public final class MultiDexClassLoaderDalvikNative extends MultiDexClassLoader {
    public static final int AVG_DEX_SIZE = 7340032;
    public static final int DEFAULT_LOCK_DEX_NUM = 255;
    public static final int MAX_COLDSTART_OAT_SIZE = 31457280;
    public static final int MB = 1048576;
    public static final int OAT_HEADER_SIZE = 1048576;
    public static final boolean USE_LOW_LEVEL_DALVIK_HOOKS = true;
    public static final boolean USE_O1_DALVIK_LOCATOR_HACK = true;
    public static final int WANT_PROC_EXEC = 1;
    public static boolean sIsIntialized;
    public final DexFile[] mAuxDexes;
    public final DexFile[] mPrimaryDexes;
    public DexFile[] mSecondaryDexes;
    public boolean mDirectLookupsEnabled = false;
    public boolean mO1HackEnabled = false;
    public boolean mHacksAttempted = false;

    static {
        C0il.A0B("dextricks");
    }

    public MultiDexClassLoaderDalvikNative(Context context, ArrayList arrayList, ArrayList arrayList2) {
        DexFile[] A0a;
        Log.i(MultiDexClassLoader.TAG, "using Dalvik-native MDCL");
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            Log.w(MultiDexClassLoader.TAG, "cannot enable dex hooks: failure to locate primary/aux dexes");
            A0a = null;
            this.mPrimaryDexes = null;
        } else {
            this.mPrimaryDexes = AnonymousClass002.A0a(arrayList);
            A0a = AnonymousClass002.A0a(arrayList2);
        }
        this.mAuxDexes = A0a;
        ClassLoadingStatsNative classLoadingStatsNative = new ClassLoadingStatsNative();
        ClassLoadingStats.A00.getAndSet(classLoadingStatsNative);
        nativeInitialize(this.mPutativeLoader, classLoadingStatsNative, this.mAuxDexes);
        setReplacementDvmDescriptorToName();
        sIsIntialized = true;
        Log.i(MultiDexClassLoader.TAG, "using native MDCL");
    }

    public static native void nativeConfigure(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, int i5);

    private native void nativeEnableDirectLookupHooks();

    public static native void nativeEnableO1Hack();

    private native void nativeInitialize(Object obj, ClassLoadingStatsNative classLoadingStatsNative, Object[] objArr);

    public static native void setReplacementDvmDescriptorToName();

    public static native void unlockAllMemory();

    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public void configure(ClassLoaderConfiguration classLoaderConfiguration) {
        String str;
        synchronized (this) {
            DexFile[] A0a = AnonymousClass002.A0a(classLoaderConfiguration.mDexFiles);
            int i = DalvikConstants.FB_REDEX_COLD_START_SET_DEX_COUNT;
            nativeConfigure(this.mPrimaryDexes, A0a, classLoaderConfiguration.configFlags, i, i, -1, 1);
            this.mSecondaryDexes = A0a;
            if (!this.mHacksAttempted) {
                this.mHacksAttempted = true;
                try {
                    enableDirectLookupHooks();
                    this.mDirectLookupsEnabled = true;
                    str = MultiDexClassLoader.TAG;
                    Log.i(str, "installed direct Dalvik class-lookup hooks");
                } catch (Exception e) {
                    str = MultiDexClassLoader.TAG;
                    Log.w(str, "unable to install direct Dalvik class-lookup hooks; continuing with classloader API", e);
                }
                try {
                    enableO1Hack();
                    this.mO1HackEnabled = true;
                    Log.i(str, "installed Dalvik O1 class-lookup hack");
                } catch (Exception e2) {
                    Log.w(str, "unable to enable O1 Dalvik hack", e2);
                }
            }
        }
    }

    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public DexFile[] doGetConfiguredDexFiles() {
        return this.mSecondaryDexes;
    }

    public void enableDirectLookupHooks() {
        DexFile[] dexFileArr = this.mPrimaryDexes;
        if (dexFileArr == null || this.mAuxDexes == null) {
            throw AnonymousClass001.A0q("cannot enable direct hooks: we could not locate primary and aux dexes");
        }
        if (dexFileArr.length != 1) {
            throw AnonymousClass001.A0q("cannot enable direct hooks: must have found exactly one primary dex");
        }
        nativeEnableDirectLookupHooks();
    }

    public void enableO1Hack() {
        int length;
        DexFile[] dexFileArr = this.mPrimaryDexes;
        if (dexFileArr == null) {
            length = 0;
        } else {
            length = dexFileArr.length;
            if (length == 1) {
                nativeEnableO1Hack();
                return;
            }
        }
        throw AnonymousClass001.A0q(0Pz.A0T("To use the O(1) class lookup hack, must have exactly one primary dex: have ", length));
    }

    @Override // java.lang.ClassLoader
    public native Class findClass(String str);

    @Override // java.lang.ClassLoader
    public native Class loadClass(String str, boolean z);

    @Override // com.facebook.common.dextricks.MultiDexClassLoader, com.facebook.common.dextricks.ColdStartAwareClassLoader
    public void onColdstartDone() {
        Log.v(MultiDexClassLoader.TAG, "Unlock memory on coldstart done");
        unlockAllMemory();
    }

    public String toString() {
        return String.format("MultiDexClassLoaderDalvikNative(lookups=%s,o1=%s)", Boolean.valueOf(this.mDirectLookupsEnabled), Boolean.valueOf(this.mO1HackEnabled));
    }
}
