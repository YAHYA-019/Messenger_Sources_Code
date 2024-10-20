package com.facebook.common.dextricks.stats;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: ClassLoadingStatsNative.class */
public final class ClassLoadingStatsNative extends ClassLoadingStats {
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("dextricks");
    }

    public static native HybridData initHybrid();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native void decrementDexFileQueries();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native int getClassLoadsAttempted();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native int getClassLoadsFailed();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native int getDexFileQueries();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native int getIncorrectDfaGuesses();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native int getLocatorAssistedClassLoads();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native void incrementClassLoadsAttempted();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native void incrementClassLoadsFailed();

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native void incrementDexFileQueries(int i);

    @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
    public native void incrementIncorrectDfaGuesses();

    public native void incrementLocatorAssistedClassLoads();
}
