package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.content.Context;
import com.facebook.common.dextricks.DexStore;
import java.io.Closeable;
import java.io.File;

/* loaded from: OdexScheme.class */
public abstract class OdexScheme {
    public static final int ODEX_SCHEME_BATCH_ONLY = 1;
    public static final int ODEX_SCHEME_INVALID = 2;
    public static final int ODEX_SCHEME_LOW_SPACE = 32;
    public static final int ODEX_SCHEME_NOT_OPTIMAL = 8;
    public static final int ODEX_SCHEME_OPTIMIZATION_IS_CRAZY_EXPENSIVE = 4;
    public static final int ODEX_SCHEME_SKIP_COMPILER = 16;
    public final ExpectedFileInfo[] expectedFileInfos;
    public final String[] expectedFiles;
    public final int flags;

    /* loaded from: OdexScheme$Compiler.class */
    public abstract class Compiler implements Closeable {
        public static final int COMPILE_INCREMENTAL = 1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract void compile(InputDex inputDex);

        public void performFinishActions() {
        }
    }

    /* loaded from: OdexScheme$NeedOptimizationState.class */
    public enum NeedOptimizationState {
        NO_OPTIMIZATION_NEEDED(false),
        NEED_OPTIMIZATION(true),
        NEED_REOPTIMIZATION(true);

        public final boolean mShouldOptimize;

        NeedOptimizationState(boolean z) {
            this.mShouldOptimize = z;
        }

        public static NeedOptimizationState shouldOptimize(boolean z) {
            return z ? NEED_OPTIMIZATION : NO_OPTIMIZATION_NEEDED;
        }

        public boolean needsOptimization() {
            return this.mShouldOptimize;
        }
    }

    public OdexScheme(int i, ExpectedFileInfo[] expectedFileInfoArr) {
        this.flags = i;
        this.expectedFiles = ExpectedFileInfo.convertTo(expectedFileInfoArr);
        this.expectedFileInfos = expectedFileInfoArr;
    }

    public OdexScheme(int i, String[] strArr) {
        this.flags = i;
        this.expectedFiles = strArr;
        this.expectedFileInfos = ExpectedFileInfo.convertTo(strArr);
    }

    public abstract void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration);

    public abstract String getSchemeName();

    public int loadInformationalStatus(File file, long j) {
        return 0;
    }

    public boolean loadNotOptimized(long j) {
        return true;
    }

    public abstract Compiler makeCompiler(DexStore dexStore, int i);

    public NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        return NeedOptimizationState.NO_OPTIMIZATION_NEEDED;
    }

    public void optimize(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession) {
    }

    public final String toString() {
        return AnonymousClass001.A0Y(this);
    }
}
