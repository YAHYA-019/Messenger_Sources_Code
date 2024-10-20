package com.facebook.common.dextricks;

import X.0G8;
import X.0Pz;
import X.0Ug;
import X.0Z9;
import X.0dF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0cm;
import X.C0d4;
import X.C0k1;
import X.C0k2;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.SystemClock;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.OptimizationConfiguration;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: DexStore.class */
public final class DexStore {
    public static final String CONFIG_FILENAME = "config";
    public static final String CONFIG_TMP_FILENAME = "config.tmp";
    public static final long CS_DEX0OPT = 16;
    public static final long CS_STATE_MASK = 15;
    public static final byte CS_STATE_SHIFT = 4;
    public static final int DAYS_TO_MS_FACTOR = 86400000;
    public static final byte DEFAULT_MULTIDEX_COMPILATION_STRATEGY = 0;
    public static final byte DEFAULT_PGO_COMPILER_FILTER = 0;
    public static final String DEPS_FILENAME = "deps";
    public static final int DS_ASYNC = 4;
    public static final int DS_DO_NOT_OPTIMIZE = 1;
    public static final int DS_FORCE_SYNC = 8;
    public static final int DS_ISOLATED_SPLIT = 64;
    public static final int DS_LOAD_SECONDARY = 16;
    public static final int DS_NO_RETRY = 2;
    public static final int DS_UNPACK_ONLY = 32;
    public static final int LA_LOAD_EXISTING = 0;
    public static final int LA_REGEN_ALL = 2;
    public static final int LA_REGEN_MISSING = 1;
    public static final String MDEX_LOCK_FILENAME = "mdex_lock";
    public static final String MDEX_STATUS_FILENAME = "mdex_status2";
    public static final long MDEX_STATUS_XOR = -374168170706063353L;
    public static final int MS_IN_NS = 1000000;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_COLDSTART_DEX = 2;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_DEX = 1;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_FIRST_COLDSTART_DEX = 0;
    public static final long NO_TIMESTAMP = 0;
    public static final String ODEX_LOCK_FILENAME = "odex_lock";
    public static final String OPTIMIZATION_HISTORY_LOG_FILENAME = "optimization_history_log";
    public static final String OPTIMIZATION_LOG_FILENAME = "optimization_log";
    public static final byte PGO_COMPILER_FILTER_EVERYTHING_PROFILE = 2;
    public static final byte PGO_COMPILER_FILTER_SPACE_PROFILE = 1;
    public static final byte PGO_COMPILER_FILTER_SPEED_PROFILE = 0;
    public static final byte PGO_COMPILER_FILTER_VERIFY_PROFILE = 3;
    public static final String REGEN_STAMP_FILENAME = "regen_stamp";
    public static final byte STATE_ART_TURBO = 7;
    public static final byte STATE_ART_XDEX = 8;
    public static final byte STATE_BAD_GEN = 5;
    public static final byte STATE_FALLBACK = 2;
    public static final byte STATE_INVALID = 0;
    public static final byte STATE_NOOP = 9;
    public static final byte STATE_REGEN_FORCED = 6;
    public static final byte STATE_RESERVED1 = 10;
    public static final byte STATE_TURBO = 4;
    public static final byte STATE_TX_FAILED = 1;
    public static final byte STATE_XDEX = 3;
    public static final String TMPDIR_LOCK_SUFFIX = ".tmpdir_lock";
    public static final String TMPDIR_SUFFIX = ".tmpdir";
    public static boolean logDexAddPageFaults;
    public static long majPageFaultsDelta;
    public static long pageInBytesDelta;
    public static boolean sAttemptedCrossDexHookInstallation;
    public static long sCachedLastAppUpdateTime;
    public static Throwable sCrossDexHookInstallationError;
    public static DexStoreClock sDexStoreClock = new Object();
    public static DexStoreTestHooks sDexStoreTestHooks;
    public static DexStore sListHead;
    public static boolean sLoadedCompressedOreo;
    public static ClassLoaderConfiguration sMergedDexConfig;
    public final ArrayList auxiliaryDexes;
    public String id;
    public final File mApk;
    public OptimizationHistoryLog mCachedOptimizationHistoryLog;
    public DexIteratorFactory mDexIteratorFactory;
    public DexErrorRecoveryInfo mLastDeri;
    public ArrayList mLoadedDexFiles;
    public DexManifest mLoadedManifest;
    public final ReentrantLockFile mLockFile;
    public DexManifest mManifest;
    public ResProvider mResProvider;
    public final ArrayList primaryDexes;
    public final File root;
    public String mMegaZipPath = null;
    public boolean mUseBgDexOpt = false;
    public boolean mUseEagerDexOpt = false;
    public final List mParentStores = AnonymousClass001.A0s();
    public final List mChildStores = AnonymousClass001.A0s();
    public boolean mDisableVerifier = false;
    public boolean mIsArtMainStore = false;
    public final DexStore next = sListHead;

    /* loaded from: DexStore$Config.class */
    public final class Config {
        public static final byte ART_FILTER_BALANCED = 4;
        public static final byte ART_FILTER_DEFAULT = 0;
        public static final byte ART_FILTER_EVERYTHING = 6;
        public static final byte ART_FILTER_INTERPRET_ONLY = 2;
        public static final byte ART_FILTER_SPACE = 3;
        public static final byte ART_FILTER_SPEED = 5;
        public static final byte ART_FILTER_TIME = 7;
        public static final byte ART_FILTER_VERIFY_NONE = 1;
        public static final byte DALVIK_OPT_ALL = 3;
        public static final byte DALVIK_OPT_DEFAULT = 0;
        public static final byte DALVIK_OPT_FULL = 4;
        public static final byte DALVIK_OPT_NONE = 1;
        public static final byte DALVIK_OPT_VERIFIED = 2;
        public static final byte DALVIK_REGISTER_MAPS_DEFAULT = 0;
        public static final byte DALVIK_REGISTER_MAPS_NO = 1;
        public static final byte DALVIK_REGISTER_MAPS_YES = 2;
        public static final byte DALVIK_VERIFY_ALL = 3;
        public static final byte DALVIK_VERIFY_DEFAULT = 0;
        public static final byte DALVIK_VERIFY_NONE = 1;
        public static final byte DALVIK_VERIFY_REMOTE = 2;
        public static final int FLAGS_CONTROL_UNPACK = 31;
        public static final byte MODE_DEFAULT = 0;
        public static final byte MODE_FORCE_FALLBACK = 1;
        public static final byte MODE_FORCE_TURBO = 2;
        public static final byte MODE_FORCE_XDEX = 3;
        public static final byte SYNC_CONTROL_ASYNC = 1;
        public static final byte SYNC_CONTROL_DEFAULT = 0;
        public static final byte SYNC_CONTROL_SYNC = 2;
        public static final byte VERSION = 9;
        public final byte artFilter;
        public final int artHugeMethodMax;
        public final int artLargeMethodMax;
        public final int artSmallMethodMax;
        public final int artTinyMethodMax;
        public final int artTruncatedDexSize;
        public final byte dalvikOptimize;
        public final byte dalvikRegisterMaps;
        public final byte dalvikVerify;
        public final boolean enableArtVerifyNone;
        public final boolean enableDex2OatQuickening;
        public final boolean enableMixedMode;
        public final boolean enableMixedModeClassPath;
        public final boolean enableMixedModePgo;
        public final boolean enableQuickening;
        public final int henosisFlags;
        public final int legacyFlags;
        public final long minTimeBetweenPgoCompilationMs;
        public final byte mode;
        public final byte multidexCompilationStrategy;
        public final byte pgoCompilerFilter;
        public final byte sync;
        public final boolean tryPeriodicPgoCompilation;

        /* loaded from: DexStore$Config$Builder.class */
        public final class Builder {
            public byte mArtFilter;
            public int mArtHugeMethodMax;
            public int mArtLargeMethodMax;
            public int mArtSmallMethodMax;
            public int mArtTinyMethodMax;
            public int mArtTruncatedDexSize;
            public byte mDalvikOptimize;
            public byte mDalvikRegisterMaps;
            public byte mDalvikVerify;
            public boolean mDoPeriodicPgoCompilation;
            public boolean mEnableArtVerifyNone;
            public boolean mEnableDex2OatQuickening;
            public boolean mEnableMixedMode;
            public boolean mEnableMixedModeClassPath;
            public boolean mEnableMixedModePgo;
            public boolean mEnableQuickening;
            public int mHenosisFlags;
            public int mLegacyFlags;
            public long mMinTimeBetweenPgoCompilationMs;
            public byte mMode;
            public byte mMultidexCompilationStrategy;
            public byte mPgoCompilerFilter;
            public byte mSync;

            public Builder() {
                AnonymousClass002.A0R(this);
            }

            public Builder(Config config) {
                AnonymousClass002.A0R(this);
                this.mMode = config.mode;
                this.mSync = config.sync;
                this.mDalvikVerify = config.dalvikVerify;
                this.mDalvikOptimize = config.dalvikOptimize;
                this.mDalvikRegisterMaps = config.dalvikRegisterMaps;
                this.mArtFilter = config.artFilter;
                this.mArtHugeMethodMax = config.artHugeMethodMax;
                this.mArtLargeMethodMax = config.artLargeMethodMax;
                this.mArtSmallMethodMax = config.artSmallMethodMax;
                this.mArtTinyMethodMax = config.artTinyMethodMax;
                this.mArtTruncatedDexSize = config.artTruncatedDexSize;
                this.mEnableArtVerifyNone = config.enableArtVerifyNone;
                this.mEnableDex2OatQuickening = config.enableDex2OatQuickening;
                this.mEnableQuickening = config.enableQuickening;
                this.mEnableMixedMode = config.enableMixedMode;
                this.mEnableMixedModeClassPath = config.enableMixedModeClassPath;
                this.mEnableMixedModePgo = config.enableMixedModePgo;
                this.mPgoCompilerFilter = config.pgoCompilerFilter;
                this.mDoPeriodicPgoCompilation = config.tryPeriodicPgoCompilation;
                this.mMinTimeBetweenPgoCompilationMs = config.minTimeBetweenPgoCompilationMs;
                this.mMultidexCompilationStrategy = config.multidexCompilationStrategy;
                this.mLegacyFlags = config.legacyFlags;
                this.mHenosisFlags = config.henosisFlags;
            }

            private long convertDaysToMs(double d) {
                return Math.round(d * 8.64E7d);
            }

            public Config build() {
                return new Config(this.mMode, this.mSync, this.mDalvikVerify, this.mDalvikOptimize, this.mDalvikRegisterMaps, this.mArtFilter, this.mArtHugeMethodMax, this.mArtLargeMethodMax, this.mArtSmallMethodMax, this.mArtTinyMethodMax, this.mArtTruncatedDexSize, this.mEnableArtVerifyNone, this.mEnableDex2OatQuickening, this.mEnableQuickening, this.mEnableMixedMode, this.mEnableMixedModeClassPath, this.mEnableMixedModePgo, this.mPgoCompilerFilter, this.mDoPeriodicPgoCompilation, this.mMinTimeBetweenPgoCompilationMs, this.mMultidexCompilationStrategy, this.mLegacyFlags, this.mHenosisFlags);
            }

            public Builder setArtFilter(byte b) {
                this.mArtFilter = b;
                return this;
            }

            public Builder setArtHugeMethodMax(int i) {
                this.mArtHugeMethodMax = i;
                return this;
            }

            public Builder setArtLargeMethodMax(int i) {
                this.mArtLargeMethodMax = i;
                return this;
            }

            public Builder setArtSmallMethodMax(int i) {
                this.mArtSmallMethodMax = i;
                return this;
            }

            public Builder setArtTinyMethodMax(int i) {
                this.mArtTinyMethodMax = i;
                return this;
            }

            public Builder setArtTruncatedDexSize(int i) {
                this.mArtTruncatedDexSize = i;
                return this;
            }

            public Builder setDalvikOptimize(byte b) {
                this.mDalvikOptimize = b;
                return this;
            }

            public Builder setDalvikRegisterMaps(byte b) {
                this.mDalvikRegisterMaps = b;
                return this;
            }

            public Builder setDalvikVerify(byte b) {
                this.mDalvikVerify = b;
                return this;
            }

            public Builder setDoPeriodicPgoCompilation(boolean z) {
                this.mDoPeriodicPgoCompilation = z;
                return this;
            }

            public Builder setEnableArtVerifyNone(boolean z) {
                this.mEnableArtVerifyNone = z;
                return this;
            }

            public Builder setEnableDex2OatQuickening(boolean z) {
                this.mEnableDex2OatQuickening = z;
                return this;
            }

            public Builder setEnableMixedMode(boolean z) {
                this.mEnableMixedMode = z;
                return this;
            }

            public Builder setEnableMixedModeClassPath(boolean z) {
                this.mEnableMixedModeClassPath = z;
                return this;
            }

            public Builder setEnableMixedModePgo(boolean z) {
                this.mEnableMixedModePgo = z;
                return this;
            }

            public Builder setEnableQuickening(boolean z) {
                this.mEnableQuickening = z;
                return this;
            }

            public Builder setHenosisFlags(int i) {
                this.mHenosisFlags = i;
                return this;
            }

            public Builder setLegacyFlags(int i) {
                this.mLegacyFlags = i;
                return this;
            }

            public Builder setMinTimeBetweenPgoCompilationDays(double d) {
                this.mMinTimeBetweenPgoCompilationMs = convertDaysToMs(d);
                return this;
            }

            public Builder setMinTimeBetweenPgoCompilationMs(long j) {
                this.mMinTimeBetweenPgoCompilationMs = j;
                return this;
            }

            public Builder setMode(byte b) {
                this.mMode = b;
                return this;
            }

            public Builder setMultidexCompilationStrategy(byte b) {
                this.mMultidexCompilationStrategy = b;
                return this;
            }

            public Builder setPgoCompilerFilter(byte b) {
                this.mPgoCompilerFilter = b;
                return this;
            }

            public Builder setSync(byte b) {
                this.mSync = b;
                return this;
            }
        }

        public Config(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, byte b7, boolean z7, long j, byte b8, int i6, int i7) {
            this.mode = b;
            this.sync = b2;
            this.dalvikVerify = b3;
            this.dalvikOptimize = b4;
            this.dalvikRegisterMaps = b5;
            this.artFilter = b6;
            this.artHugeMethodMax = i;
            this.artLargeMethodMax = i2;
            this.artSmallMethodMax = i3;
            this.artTinyMethodMax = i4;
            this.artTruncatedDexSize = i5;
            this.enableArtVerifyNone = z;
            this.enableDex2OatQuickening = z2;
            this.enableQuickening = z3;
            this.enableMixedMode = z4;
            this.enableMixedModeClassPath = z5;
            this.enableMixedModePgo = z6;
            this.pgoCompilerFilter = b7;
            this.tryPeriodicPgoCompilation = z7;
            this.minTimeBetweenPgoCompilationMs = j;
            this.multidexCompilationStrategy = b8;
            this.legacyFlags = i6;
            this.henosisFlags = i7;
        }

        public static File getConfigFileName(File file) {
            return AnonymousClass001.A0D(file, DexStore.CONFIG_FILENAME);
        }

        public static Config read(File file) {
            RandomAccessFile A0H = AnonymousClass001.A0H(file);
            try {
                if (A0H.readByte() != 9) {
                    throw AnonymousClass001.A0q("unexpected version");
                }
                Config config = new Config(A0H.readByte(), A0H.readByte(), A0H.readByte(), A0H.readByte(), A0H.readByte(), A0H.readByte(), A0H.readInt(), A0H.readInt(), A0H.readInt(), A0H.readInt(), A0H.readInt(), A0H.readBoolean(), A0H.readBoolean(), A0H.readBoolean(), A0H.readBoolean(), A0H.readBoolean(), A0H.readBoolean(), A0H.readByte(), A0H.readBoolean(), A0H.readLong(), A0H.readByte(), A0H.readInt(), A0H.readInt());
                A0H.close();
                return config;
            } catch (Throwable th) {
                try {
                    A0H.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }

        public static Config readFromRoot(File file) {
            return read(AnonymousClass001.A0D(file, DexStore.CONFIG_FILENAME));
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Config config = (Config) obj;
                if (this.mode != config.mode || this.sync != config.sync || this.dalvikVerify != config.dalvikVerify || this.dalvikOptimize != config.dalvikOptimize || this.dalvikRegisterMaps != config.dalvikRegisterMaps || this.artFilter != config.artFilter || this.artHugeMethodMax != config.artHugeMethodMax || this.artLargeMethodMax != config.artLargeMethodMax || this.artSmallMethodMax != config.artSmallMethodMax || this.artTinyMethodMax != config.artTinyMethodMax || this.artTruncatedDexSize != config.artTruncatedDexSize || this.enableArtVerifyNone != config.enableArtVerifyNone || this.enableDex2OatQuickening != config.enableDex2OatQuickening || this.enableQuickening != config.enableQuickening || this.enableMixedMode != config.enableMixedMode || this.enableMixedModeClassPath != config.enableMixedModeClassPath || this.enableMixedModePgo != config.enableMixedModePgo || this.pgoCompilerFilter != config.pgoCompilerFilter || this.multidexCompilationStrategy != config.multidexCompilationStrategy || this.tryPeriodicPgoCompilation != config.tryPeriodicPgoCompilation || this.minTimeBetweenPgoCompilationMs != config.minTimeBetweenPgoCompilationMs || this.legacyFlags != config.legacyFlags || this.henosisFlags != config.henosisFlags) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
        
            if (r302.henosisFlags != r301.henosisFlags) goto L30;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equalsForBootstrapPurposes(com.facebook.common.dextricks.DexStore.Config r302) {
            /*
                Method dump skipped, instructions count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.Config.equalsForBootstrapPurposes(com.facebook.common.dextricks.DexStore$Config):boolean");
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((((((((((((10571 + this.mode) * 31) + this.sync) * 31) + this.dalvikVerify) * 31) + this.dalvikOptimize) * 31) + this.dalvikRegisterMaps) * 31) + this.artFilter) * 31) + this.artHugeMethodMax) * 31) + this.artLargeMethodMax) * 31) + this.artSmallMethodMax) * 31) + this.artTinyMethodMax) * 31) + this.artTruncatedDexSize) * 31) + (this.enableArtVerifyNone ? 1 : 0)) * 31) + (this.enableDex2OatQuickening ? 1 : 0)) * 31) + (this.enableQuickening ? 1 : 0)) * 31) + (this.enableMixedMode ? 1 : 0)) * 31) + (this.enableMixedModeClassPath ? 1 : 0)) * 31) + (this.enableMixedModePgo ? 1 : 0)) * 31) + this.pgoCompilerFilter) * 31) + this.multidexCompilationStrategy) * 31) + (this.tryPeriodicPgoCompilation ? 1 : 0)) * 31) + ((int) this.minTimeBetweenPgoCompilationMs)) * 31) + this.legacyFlags) * 31) + this.henosisFlags;
        }

        public boolean isDefault() {
            return equals(new Builder().build());
        }

        public byte[] readDepBlock() {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeByte(this.mode);
                obtain.writeByte(this.sync);
                obtain.writeByte(this.dalvikVerify);
                obtain.writeByte(this.dalvikOptimize);
                obtain.writeByte(this.dalvikRegisterMaps);
                obtain.writeByte(this.artFilter);
                obtain.writeInt(this.artHugeMethodMax);
                obtain.writeInt(this.artLargeMethodMax);
                obtain.writeInt(this.artSmallMethodMax);
                obtain.writeInt(this.artTinyMethodMax);
                boolean[] zArr = new boolean[6];
                int i = 0;
                zArr[0] = this.enableArtVerifyNone;
                zArr[1] = this.enableDex2OatQuickening;
                zArr[2] = this.enableQuickening;
                zArr[3] = this.enableMixedMode;
                zArr[4] = this.enableMixedModeClassPath;
                zArr[5] = this.enableMixedModePgo;
                obtain.writeBooleanArray(zArr);
                obtain.writeByte(this.pgoCompilerFilter);
                if (this.tryPeriodicPgoCompilation) {
                    i = 1;
                }
                obtain.writeByte((byte) i);
                obtain.writeLong(this.minTimeBetweenPgoCompilationMs);
                obtain.writeByte(this.multidexCompilationStrategy);
                obtain.writeInt(this.legacyFlags);
                obtain.writeInt(this.henosisFlags);
                return obtain.marshall();
            } finally {
                obtain.recycle();
            }
        }

        public void writeAndSync(File file) {
            RandomAccessFile A0I = AnonymousClass001.A0I(file);
            try {
                A0I.writeByte(9);
                A0I.writeByte(this.mode);
                A0I.writeByte(this.sync);
                A0I.writeByte(this.dalvikVerify);
                A0I.writeByte(this.dalvikOptimize);
                A0I.writeByte(this.dalvikRegisterMaps);
                A0I.writeByte(this.artFilter);
                A0I.writeInt(this.artHugeMethodMax);
                A0I.writeInt(this.artLargeMethodMax);
                A0I.writeInt(this.artSmallMethodMax);
                A0I.writeInt(this.artTinyMethodMax);
                A0I.writeInt(this.artTruncatedDexSize);
                A0I.writeBoolean(this.enableArtVerifyNone);
                A0I.writeBoolean(this.enableDex2OatQuickening);
                A0I.writeBoolean(this.enableQuickening);
                A0I.writeBoolean(this.enableMixedMode);
                A0I.writeBoolean(this.enableMixedModeClassPath);
                A0I.writeBoolean(this.enableMixedModePgo);
                A0I.writeByte(this.pgoCompilerFilter);
                A0I.writeBoolean(this.tryPeriodicPgoCompilation);
                A0I.writeLong(this.minTimeBetweenPgoCompilationMs);
                A0I.writeByte(this.multidexCompilationStrategy);
                A0I.writeInt(this.legacyFlags);
                A0I.writeInt(this.henosisFlags);
                A0I.setLength(A0I.getFilePointer());
                A0I.getFD().sync();
                A0I.close();
            } catch (Throwable th) {
                try {
                    A0I.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }
    }

    /* loaded from: DexStore$DexStoreClock.class */
    public interface DexStoreClock {
        long now();
    }

    /* loaded from: DexStore$DexStoreTestHooks.class */
    public interface DexStoreTestHooks {
        void onSecondaryDexesUnpackedForRecompilation();
    }

    /* loaded from: DexStore$ExternalProcessProgressListener.class */
    public interface ExternalProcessProgressListener {
        void onCheckpoint();

        void onComplete(int i);
    }

    /* loaded from: DexStore$FinishRegenerationThread.class */
    public final class FinishRegenerationThread extends Thread {
        public final ReentrantLockFile.Lock mHeldLock;
        public final long mNewStatus;
        public final OdexScheme mOdexScheme;

        public FinishRegenerationThread(OdexScheme odexScheme, ReentrantLockFile.Lock lock, long j) {
            super(0Pz.A0W("TxFlush-", DexStore.this.root.getName()));
            this.mHeldLock = lock;
            this.mNewStatus = j;
            this.mOdexScheme = odexScheme;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                AnonymousClass001.A1C("running syncer thread");
                try {
                    for (String str : this.mOdexScheme.expectedFiles) {
                        File A0C = AnonymousClass001.A0C(DexStore.this, str);
                        if (A0C.exists()) {
                            DalvikInternals.fsyncNamed(A0C.getCanonicalPath(), -1);
                        }
                    }
                    DexStore.this.writeStatusLocked(this.mNewStatus);
                    this.mHeldLock.close();
                    Mlog.i("finished syncer thread: initial regeneration of dex store %s complete", DexStore.this.root);
                } catch (IOException e) {
                    throw AnonymousClass001.A0U(e);
                }
            } catch (Throwable th) {
                this.mHeldLock.close();
                throw th;
            }
        }
    }

    /* loaded from: DexStore$NormalDexStoreClock.class */
    public class NormalDexStoreClock implements DexStoreClock {
        public NormalDexStoreClock() {
        }

        public /* synthetic */ NormalDexStoreClock(AnonymousClass1 anonymousClass1) {
        }

        @Override // com.facebook.common.dextricks.DexStore.DexStoreClock
        public long now() {
            return System.currentTimeMillis();
        }
    }

    /* loaded from: DexStore$OptimizationCanceledException.class */
    public final class OptimizationCanceledException extends InterruptedException {
        public OptimizationCanceledException(String str) {
            super(str);
        }
    }

    /* loaded from: DexStore$OptimizationHistoryLog.class */
    public final class OptimizationHistoryLog {
        public static long NO_TIME_DELTA = 255;
        public static final int SUCCESS = 2;
        public final File file;
        public final long lastFileModifiedTime;
        public final long lastOptedAppUpgradeTimestamp;
        public final long lastSuccessfulOptimizationTimestampMs;
        public final long optStatus;
        public final long schemeStatus;

        public OptimizationHistoryLog() {
            this(0L, 0L, 0L, 0L, 0L, null);
        }

        public OptimizationHistoryLog(long j, long j2, long j3, long j4, long j5, File file) {
            this.lastSuccessfulOptimizationTimestampMs = j;
            this.optStatus = j2;
            this.schemeStatus = j3;
            this.lastOptedAppUpgradeTimestamp = j4;
            this.lastFileModifiedTime = j5;
            this.file = file;
        }

        public static boolean canUseHistoryLogForThisApp(Context context, OptimizationHistoryLog optimizationHistoryLog) {
            long appUpgradeTimestamp = DexStore.getAppUpgradeTimestamp(context);
            if (appUpgradeTimestamp == 0) {
                Mlog.w("Found not app version", new Object[0]);
                return false;
            }
            Mlog.w("Comparing new %d to old %s", Long.valueOf(appUpgradeTimestamp), Long.valueOf(optimizationHistoryLog.lastOptedAppUpgradeTimestamp));
            return appUpgradeTimestamp == optimizationHistoryLog.lastOptedAppUpgradeTimestamp;
        }

        public static void clearHistoryLog(File file) {
            AnonymousClass001.A0D(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME).delete();
        }

        public static File getDefaultFile(File file) {
            return new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME);
        }

        public static OptimizationHistoryLog read(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                OptimizationHistoryLog optimizationHistoryLog = new OptimizationHistoryLog(DexStore.sanityCheckTimestamp(randomAccessFile.readLong()), randomAccessFile.readLong(), randomAccessFile.readLong(), randomAccessFile.readLong(), DexStore.lastModifiedTime(file), file);
                Mlog.d("Read opt history log %s", optimizationHistoryLog);
                randomAccessFile.close();
                return optimizationHistoryLog;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }

        public static OptimizationHistoryLog readOrMakeDefault(Context context, File file) {
            try {
                OptimizationHistoryLog read = read(file);
                if (canUseHistoryLogForThisApp(context, read)) {
                    return read;
                }
                Mlog.d("Could not use previous history log since it was for a different version or corrupted. optHistoryLog: %s", read);
                return new OptimizationHistoryLog();
            } catch (IOException unused) {
                return new OptimizationHistoryLog();
            }
        }

        public static OptimizationHistoryLog readOrMakeDefaultFromRoot(Context context, File file) {
            return readOrMakeDefault(context, new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME));
        }

        public static void writeNewStatus(Context context, File file, boolean z, long j) {
            File file2 = new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME);
            long j2 = z ? 2 : 0L;
            long now = DexStore.sDexStoreClock.now();
            long appUpgradeTimestamp = DexStore.getAppUpgradeTimestamp(context);
            Mlog.i("Writing optimization history log %s [opt status: %d scheme status: %d] (app last update time %d) at %d ms for %s", z ? OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS : "error", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(appUpgradeTimestamp), Long.valueOf(now), file2.getAbsolutePath());
            OptimizationHistoryLog optimizationHistoryLog = new OptimizationHistoryLog(now, j2, j, appUpgradeTimestamp, 0L, file2);
            optimizationHistoryLog.writeToDisk(file2);
            Mlog.i("Wrote optimization history log %s", optimizationHistoryLog);
        }

        public boolean isLogFileAsFromRoot(File file) {
            return file == null ? AnonymousClass001.A1U(this.file) : new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME).equals(this.file);
        }

        public boolean isNotDefault() {
            return AnonymousClass001.A1T(this.file);
        }

        public boolean isOutOfDate() {
            boolean z = false;
            if (DexStore.lastModifiedTime(this.file) != this.lastFileModifiedTime) {
                z = true;
            }
            return z;
        }

        public boolean lastCompilationSessionWasASuccess() {
            return AnonymousClass001.A1N(((this.optStatus & 2) > 0L ? 1 : ((this.optStatus & 2) == 0L ? 0 : -1)));
        }

        public long timeDeltaFromLastCompilationSessionMs() {
            if (this.lastSuccessfulOptimizationTimestampMs != 0) {
                long now = DexStore.sDexStoreClock.now();
                long j = this.lastSuccessfulOptimizationTimestampMs;
                if (j <= now) {
                    return now - j;
                }
            }
            return NO_TIME_DELTA;
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("[ Opt History Log: ");
            A0k.append("Default: ");
            A0k.append(!AnonymousClass001.A1T(this.file));
            A0k.append(", ");
            A0k.append("Last Compile time: ");
            A0k.append(this.lastSuccessfulOptimizationTimestampMs);
            A0k.append(" ms, ");
            A0k.append("Delta: ");
            A0k.append(timeDeltaFromLastCompilationSessionMs());
            A0k.append(" ms, ");
            A0k.append("Opt Status: ");
            A0k.append(this.optStatus);
            A0k.append(" (");
            A0k.append(lastCompilationSessionWasASuccess() ? OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS : OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
            A0k.append("), ");
            A0k.append("Scheme Status: ");
            A0k.append(this.schemeStatus);
            A0k.append(", ");
            A0k.append("Last app update time: ");
            A0k.append(this.lastOptedAppUpgradeTimestamp);
            A0k.append(" ms, ");
            A0k.append("File: ");
            File file = this.file;
            A0k.append(file != null ? file.getAbsolutePath() : "None");
            return AnonymousClass001.A0g(A0k, ']');
        }

        public void writeToDisk(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.writeLong(this.lastSuccessfulOptimizationTimestampMs);
                randomAccessFile.writeLong(this.optStatus);
                randomAccessFile.writeLong(this.schemeStatus);
                randomAccessFile.writeLong(this.lastOptedAppUpgradeTimestamp);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }
    }

    /* loaded from: DexStore$OptimizationLog.class */
    public final class OptimizationLog {
        public static final int COMPLETE = 1;
        public static final int COUNTER_AWAKE_MS = 0;
        public static final int COUNTER_AWAKE_RUN_MS = 3;
        public static final int COUNTER_AWAKE_YIELD_MS = 2;
        public static final int COUNTER_REAL_TIME_MS = 1;
        public static final int NR_COUNTERS = 4;
        public static final int SUCCESS = 2;
        public int flags = 0;
        public int nrOptimizationsAttempted = 0;
        public int nrOptimizationsFailed = 0;
        public long[] counters = new long[4];
        public long[] lastAttemptCounters = new long[4];
        public String lastFailureExceptionJson = "";
        public boolean isNotDefault = false;

        public static String getCounterName(int i) {
            if (i == 0) {
                return "COUNTER_AWAKE_MS";
            }
            if (i == 1) {
                return "COUNTER_AWAKE_REAL_TIME_MS";
            }
            if (i == 2) {
                return "COUNTER_AWAKE_YIELD_MS";
            }
            if (i == 3) {
                return "COUNTER_AWAKE_RUN_MS";
            }
            throw AnonymousClass001.A0J(0Pz.A0T("unknown counter ", i));
        }

        public static File getDefaultFile(File file) {
            return AnonymousClass001.A0D(file, DexStore.OPTIMIZATION_LOG_FILENAME);
        }

        public static OptimizationLog read(File file) {
            RandomAccessFile A0H = AnonymousClass001.A0H(file);
            try {
                OptimizationLog optimizationLog = new OptimizationLog();
                optimizationLog.flags = A0H.readInt();
                optimizationLog.nrOptimizationsAttempted = A0H.readInt();
                optimizationLog.nrOptimizationsFailed = A0H.readInt();
                int i = 0;
                do {
                    optimizationLog.counters[i] = A0H.readLong();
                    optimizationLog.lastAttemptCounters[i] = A0H.readLong();
                    i++;
                } while (i < 4);
                optimizationLog.lastFailureExceptionJson = A0H.readUTF();
                optimizationLog.isNotDefault = true;
                A0H.close();
                return optimizationLog;
            } catch (Throwable th) {
                try {
                    A0H.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }

        public static OptimizationLog readFromRoot(File file) {
            return read(AnonymousClass001.A0D(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }

        public static OptimizationLog readOrMakeDefault(File file) {
            try {
                return read(file);
            } catch (FileNotFoundException unused) {
                return new OptimizationLog();
            }
        }

        public static OptimizationLog readOrMakeDefaultFromRoot(File file) {
            return readOrMakeDefault(AnonymousClass001.A0D(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }

        public boolean isNotDefault() {
            return this.isNotDefault;
        }

        public void write(File file) {
            RandomAccessFile A0I = AnonymousClass001.A0I(file);
            try {
                A0I.writeInt(this.flags);
                A0I.writeInt(this.nrOptimizationsAttempted);
                A0I.writeInt(this.nrOptimizationsFailed);
                int i = 0;
                do {
                    A0I.writeLong(this.counters[i]);
                    A0I.writeLong(this.lastAttemptCounters[i]);
                    i++;
                } while (i < 4);
                A0I.writeUTF(this.lastFailureExceptionJson);
                A0I.getFD().sync();
                A0I.close();
            } catch (Throwable th) {
                try {
                    A0I.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }

        public void writeFromRoot(File file) {
            write(AnonymousClass001.A0D(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }
    }

    /* loaded from: DexStore$OptimizationSession.class */
    public final class OptimizationSession implements Closeable {
        public static final int PHASE_RUNNING = 0;
        public static final int PHASE_YIELDING = 1;
        public long accumulatedRunNs;
        public long accumulatedYieldNs;
        public final OptimizationConfiguration config;
        public final OptimizationConfiguration.Provider configProvider;
        public final Config dexStoreConfig;
        public final boolean inForeground;
        public final Context mContext;
        public final ReentrantLockFile mOptLockFile;
        public final FileInputStream mRegenStampFile;
        public final int optimizationAttemptNumber;
        public final long startRealtimeMs;
        public final long startUptimeMs;

        /* loaded from: DexStore$OptimizationSession$Job.class */
        public final class Job implements Closeable {
            public static final int PHASE_COMMITTING = 2;
            public static final int PHASE_DONE = 3;
            public static final int PHASE_OPTIMIZING = 1;
            public static final int PHASE_PREPARING = 0;
            public final long initialStatus;
            public ReentrantLockFile.Lock mCommitLock;
            public ReentrantLockFile.Lock mOptLock;
            public int mPhase;

            public Job() {
                try {
                    this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                    long readStatusLocked = DexStore.this.readStatusLocked();
                    this.initialStatus = readStatusLocked;
                    checkBadStatus(readStatusLocked);
                } catch (Throwable th) {
                    close();
                    throw th;
                }
            }

            private void checkBadStatus(long j) {
                byte b = (byte) (15 & j);
                if (b == 0 || b == 1 || b == 5 || b >= 10) {
                    throw new InterruptedException(String.format("bad status %x for dex store %s starting tx", Long.valueOf(j), DexStore.this.root));
                }
                OptimizationSession.this.checkShouldStop();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLockFile.Lock lock = this.mCommitLock;
                if (lock != null) {
                    lock.close();
                    this.mCommitLock = null;
                }
                ReentrantLockFile.Lock lock2 = this.mOptLock;
                if (lock2 != null) {
                    lock2.close();
                    this.mOptLock = null;
                }
            }

            public void finishCommit(long j) {
                Mlog.assertThat(AnonymousClass001.A1Q(this.mPhase, 2), "wrong phase", new Object[0]);
                DexStore.this.writeStatusLocked(j);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 3;
            }

            public long startCommitting() {
                return startCommitting(0L);
            }

            public long startCommitting(long j) {
                int i = this.mPhase;
                Mlog.assertThat(AnonymousClass001.A1Q(i, 1), "wrong phase: %s", AnonymousClass001.A1a(i));
                this.mOptLock.close();
                this.mOptLock = null;
                this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                long readStatusLocked = DexStore.this.readStatusLocked();
                checkBadStatus(readStatusLocked);
                long j2 = j | readStatusLocked;
                DexStore.this.writeStatusLocked(1 | (j2 << 4));
                this.mPhase = 2;
                return j2;
            }

            public void startOptimizing() {
                Mlog.assertThat(AnonymousClass001.A1O(this.mPhase), "wrong phase", new Object[0]);
                this.mOptLock = OptimizationSession.this.mOptLockFile.acquireInterruptubly(1);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 1;
            }
        }

        public OptimizationSession(Context context, OptimizationConfiguration.Provider provider, boolean z) {
            ReentrantLockFile reentrantLockFile;
            FileInputStream A0F;
            this.mContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            int i = readOrMakeDefaultFromRoot.nrOptimizationsAttempted;
            int i2 = i >= 1 ? 1 + i : 1;
            readOrMakeDefaultFromRoot.nrOptimizationsAttempted = i2;
            this.optimizationAttemptNumber = i2;
            writeCurrentStateWithCurrentStatusFromRoot(readOrMakeDefaultFromRoot, false);
            this.dexStoreConfig = DexStore.this.readConfig();
            this.inForeground = z;
            this.startUptimeMs = SystemClock.uptimeMillis();
            this.startRealtimeMs = SystemClock.elapsedRealtime();
            FileInputStream fileInputStream = null;
            try {
                this.configProvider = provider;
                this.config = provider.baseline;
                A0F = AnonymousClass001.A0F(DexStore.this.getRegenFile());
                try {
                    reentrantLockFile = ReentrantLockFile.open(AnonymousClass001.A0D(DexStore.this.root, DexStore.ODEX_LOCK_FILENAME));
                } catch (Throwable th) {
                    th = th;
                    reentrantLockFile = null;
                }
            } catch (Throwable th2) {
                th = th2;
                reentrantLockFile = null;
            }
            try {
                this.mRegenStampFile = A0F;
                try {
                    this.mOptLockFile = reentrantLockFile;
                } catch (Throwable th3) {
                    th = th3;
                    Fs.safeClose(fileInputStream);
                    Fs.safeClose(reentrantLockFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = A0F;
                Fs.safeClose(fileInputStream);
                Fs.safeClose(reentrantLockFile);
                throw th;
            }
        }

        private byte determineOptimizationFailureState(byte b) {
            byte b2;
            if (b == 8) {
                b2 = 7;
            } else {
                b2 = 5;
                if (b == 3) {
                    return (byte) 4;
                }
            }
            return b2;
        }

        private int incrementOptimizationAttempts(OptimizationLog optimizationLog) {
            int i = optimizationLog.nrOptimizationsAttempted;
            int i2 = 1;
            if (i >= 1) {
                i2 = 1 + i;
            }
            return i2;
        }

        private int resumeProcess(Process process) {
            process.kill(18);
            return process.waitFor(-1, 5);
        }

        private boolean shouldWriteOptimizationHistoryLog(OptimizationLog optimizationLog) {
            boolean z = true;
            if ((optimizationLog.flags & 1) == 0) {
                z = false;
            }
            return z;
        }

        private int stopProcess(Process process) {
            process.kill(20);
            return process.waitFor(-1, 6);
        }

        private void updateOptimizationLogCounters(OptimizationLog optimizationLog) {
            long[] jArr = optimizationLog.lastAttemptCounters;
            int i = 0;
            jArr[0] = SystemClock.uptimeMillis() - this.startUptimeMs;
            jArr[1] = SystemClock.elapsedRealtime() - this.startRealtimeMs;
            jArr[3] = this.accumulatedRunNs / 1000000;
            jArr[2] = this.accumulatedYieldNs / 1000000;
            do {
                long[] jArr2 = optimizationLog.counters;
                jArr2[i] = jArr2[i] + jArr[i];
                i++;
            } while (i < 4);
        }

        private void writeCurrentStateFromRoot(OptimizationLog optimizationLog, long j) {
            writeCurrentStateFromRoot(optimizationLog, j, shouldWriteOptimizationHistoryLog(optimizationLog));
        }

        private void writeCurrentStateFromRoot(OptimizationLog optimizationLog, long j, boolean z) {
            DexStore.this.writeTxFailedStatusLocked(j);
            boolean A1N = AnonymousClass001.A1N(optimizationLog.flags & 2);
            optimizationLog.writeFromRoot(DexStore.this.root);
            if (z) {
                OptimizationHistoryLog.writeNewStatus(this.mContext, DexStore.this.root, A1N, j);
            }
            DexStore.this.writeStatusLocked(j);
        }

        private void writeCurrentStateWithCurrentStatusFromRoot(OptimizationLog optimizationLog) {
            writeCurrentStateWithCurrentStatusFromRoot(optimizationLog, shouldWriteOptimizationHistoryLog(optimizationLog));
        }

        private void writeCurrentStateWithCurrentStatusFromRoot(OptimizationLog optimizationLog, boolean z) {
            writeCurrentStateFromRoot(optimizationLog, DexStore.this.readStatusLocked(), z);
        }

        public void checkShouldStop() {
            if (DalvikInternals.getOpenFileLinkCount(Fd.fileno(this.mRegenStampFile.getFD())) == 0) {
                throw new InterruptedException("obsolete optimization: regeneration pending");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Fs.safeClose(this.mOptLockFile);
            Fs.safeClose(this.mRegenStampFile);
        }

        public void copeWithOptimizationFailure(Throwable th) {
            try {
                ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
                try {
                    checkShouldStop();
                    copeWithOptimizationFailureImpl(th);
                    if (acquire != null) {
                        acquire.close();
                    }
                } finally {
                }
            } catch (Throwable th2) {
                Mlog.w(th2, "recording optimization failure itself failed", new Object[0]);
            }
        }

        public void copeWithOptimizationFailureImpl(Throwable th) {
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            Mlog.w(th, "optimization failed (%s failures already)", AnonymousClass001.A1a(readOrMakeDefaultFromRoot.nrOptimizationsFailed));
            long readStatusLocked = DexStore.this.readStatusLocked();
            byte b = (byte) (15 & readStatusLocked);
            updateOptimizationLogCounters(readOrMakeDefaultFromRoot);
            readOrMakeDefaultFromRoot.nrOptimizationsFailed++;
            readOrMakeDefaultFromRoot.lastFailureExceptionJson = 0G8.A00(th);
            int i = readOrMakeDefaultFromRoot.nrOptimizationsFailed;
            int i2 = this.config.maximumOptimizationAttempts;
            if (i >= i2) {
                Mlog.w("too many optimization failures (threshold is %s): will not keep trying", AnonymousClass001.A1a(i2));
                readStatusLocked = determineOptimizationFailureState(b);
                readOrMakeDefaultFromRoot.flags |= 1;
            }
            writeCurrentStateFromRoot(readOrMakeDefaultFromRoot, readStatusLocked);
        }

        public OptimizationHistoryLog getOptimizationHistoryLog() {
            DexStore dexStore = DexStore.this;
            return dexStore.getCurrentOptHistoryLogFromRoot(this.mContext, dexStore.root);
        }

        public int maxOptimizationAttempts() {
            return this.config.maximumOptimizationAttempts;
        }

        public void noteOptimizationSuccess() {
            ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
            try {
                if (!this.inForeground) {
                    checkShouldStop();
                }
                OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
                readOrMakeDefaultFromRoot.flags |= 3;
                updateOptimizationLogCounters(readOrMakeDefaultFromRoot);
                writeCurrentStateWithCurrentStatusFromRoot(readOrMakeDefaultFromRoot);
                if (acquire != null) {
                    acquire.close();
                }
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                        throw th;
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
        
            if (r313 != ((-1) << (-1))) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int waitForAndManageProcess(com.facebook.forker.Process r302, com.facebook.common.dextricks.DexStore.ExternalProcessProgressListener r303) {
            /*
                Method dump skipped, instructions count: 429
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationSession.waitForAndManageProcess(com.facebook.forker.Process, com.facebook.common.dextricks.DexStore$ExternalProcessProgressListener):int");
        }
    }

    /* loaded from: DexStore$PreviewSdkHelper.class */
    public class PreviewSdkHelper {
        public static boolean isPreviewSdk() {
            return AnonymousClass001.A1N(Build.VERSION.PREVIEW_SDK_INT);
        }
    }

    /* loaded from: DexStore$ProgressListener.class */
    public class ProgressListener {
        public void onProgress(int i, int i2, boolean z) {
        }
    }

    /* loaded from: DexStore$RecoverableDexException.class */
    public final class RecoverableDexException extends Exception {
        public RecoverableDexException(Throwable th) {
            super(th);
        }
    }

    /* loaded from: DexStore$TmpDir.class */
    public final class TmpDir implements Closeable {
        public File directory;
        public ReentrantLockFile.Lock mTmpDirLock;

        public TmpDir(ReentrantLockFile.Lock lock, File file) {
            this.mTmpDirLock = lock;
            this.directory = file;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.mTmpDirLock != null) {
                ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
                try {
                    ReentrantLockFile.Lock lock = this.mTmpDirLock;
                    File file = ReentrantLockFile.this.lockFileName;
                    lock.close();
                    this.mTmpDirLock = null;
                    Fs.deleteRecursiveNoThrow(file);
                    Fs.deleteRecursiveNoThrow(this.directory);
                    this.directory = null;
                    if (acquire != null) {
                        acquire.close();
                    }
                } catch (Throwable th) {
                    if (acquire != null) {
                        try {
                            acquire.close();
                            throw th;
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public DexStore(File file, File file2, ResProvider resProvider, ArrayList arrayList, ArrayList arrayList2) {
        this.mApk = file2;
        this.root = file;
        Fs.mkdirOrThrow(file);
        this.mLockFile = ReentrantLockFile.open(AnonymousClass001.A0D(file, MDEX_LOCK_FILENAME));
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
        this.primaryDexes = arrayList;
        this.auxiliaryDexes = arrayList2;
    }

    private byte adjustDesiredStateForConfig(byte b, Config config) {
        Object[] objArr;
        String str;
        Object[] objArr2;
        String str2;
        byte b2 = config.mode;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 == 2) {
                    if (b == 2) {
                        objArr2 = new Object[0];
                        str2 = "ignoring configured turbo mode: already forced to fallback mode";
                    } else {
                        if (b == 3) {
                            Mlog.i("using Dalvik turbo as requested in config file", new Object[0]);
                            return (byte) 4;
                        }
                        if (b == 4 || b == 7) {
                            objArr2 = new Object[0];
                            str2 = "config file wants turbo mode: already using it";
                        } else {
                            if (b == 8) {
                                Mlog.i("using ART turbo as requested in config file", new Object[0]);
                                return (byte) 7;
                            }
                            if (b != 9) {
                                objArr = new Object[]{Byte.valueOf(b)};
                                str = "ignoring configured turbo mode: state not whitelisted: %s";
                                Mlog.w(str, objArr);
                                return b;
                            }
                            objArr2 = new Object[0];
                            str2 = "ignoring configured turbo mode: no dex loading to do";
                        }
                    }
                    Mlog.i(str2, objArr2);
                    return b;
                }
                if (b2 == 3) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 4) {
                                Mlog.i("using Dalvik xdex as requested in config", new Object[0]);
                                return (byte) 3;
                            }
                            if (b == 7) {
                                Mlog.i("using ART xdex as requested in config file", new Object[0]);
                                return (byte) 8;
                            }
                            if (b != 8) {
                                if (b != 9) {
                                    objArr = new Object[]{Byte.valueOf(b)};
                                    str = "ignoring configured xdex mode: state not whitelisted: %s";
                                } else {
                                    objArr2 = new Object[0];
                                    str2 = "ignoring configured xdex mode: no dex loading to do";
                                }
                            }
                        }
                        objArr2 = new Object[0];
                        str2 = "config file wants xdex mode: already using it";
                    } else {
                        objArr2 = new Object[0];
                        str2 = "ignoring configured xdex mode: already forced to fallback";
                    }
                    Mlog.i(str2, objArr2);
                    return b;
                }
                objArr = new Object[]{Byte.valueOf(b2)};
                str = "ignoring unknown configured dex mode %s";
                Mlog.w(str, objArr);
                return b;
            }
            Mlog.i("using fallback mode due to request in config file", new Object[0]);
            b = 2;
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.security.MessageDigest] */
    private void appendDexHashForMegaZip(Context context, StringBuilder sb, DexManifest dexManifest) {
        ?? r0 = "SHA";
        try {
            r0 = MessageDigest.getInstance("SHA");
            r0.update(OdexSchemeOreo.getPrimaryDexIdentifierString(context).getBytes());
            int i = 0;
            while (true) {
                int i2 = i;
                DexManifest.Dex[] dexArr = dexManifest.dexes;
                if (i2 >= dexArr.length) {
                    r0.update(readCurrentDepBlock());
                    sb.append(DexStoreUtils.toHex(r0.digest()));
                    return;
                } else {
                    r0.update(dexArr[i2].hash.getBytes());
                    i = i2 + 1;
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    private void assertLockHeld() {
        Mlog.assertThat(AnonymousClass001.A1W(this.mLockFile.mLockOwner, Thread.currentThread()), "lock req", new Object[0]);
    }

    public static boolean checkAndClearGk(Context context, String str) {
        try {
            return C0k1.A03(context, str);
        } finally {
            C0k1.A02(context, str, false);
        }
    }

    private boolean checkAnyOptimizerRunningCurrently() {
        File A0D = AnonymousClass001.A0D(this.root, ODEX_LOCK_FILENAME);
        boolean z = false;
        try {
            if (A0D.exists()) {
                ReentrantLockFile open = ReentrantLockFile.open(A0D);
                try {
                    ReentrantLockFile.Lock tryAcquire = open.tryAcquire(0);
                    if (tryAcquire == null) {
                        z = true;
                    } else {
                        Fs.safeClose(tryAcquire);
                    }
                    open.close();
                    return z;
                } finally {
                }
            }
        } catch (IOException unused) {
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (java.util.Arrays.equals(r0, r0) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean checkDeps() {
        /*
            r301 = this;
            r0 = r301
            byte[] r0 = r0.readCurrentDepBlock()
            r302 = r0
            r0 = r301
            byte[] r0 = r0.readSavedDepBlock()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r302
            r1 = r303
            boolean r0 = java.util.Arrays.equals(r0, r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L20
        L1b:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L20:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.checkDeps():boolean");
    }

    private int checkDirty(OdexScheme odexScheme, String[] strArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        int checkDirty = checkDirty(odexScheme, strArr, A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Fs.deleteRecursive((File) it.next());
        }
        return checkDirty;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x018d, code lost:
    
        if (r0.mIsOptional == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int checkDirty(com.facebook.common.dextricks.OdexScheme r302, java.lang.String[] r303, java.util.List r304) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.checkDirty(com.facebook.common.dextricks.OdexScheme, java.lang.String[], java.util.List):int");
    }

    private void deleteFiles(String[] strArr) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] != null) {
                Mlog.v("deleting existing file %s/%s", this.root, strArr[i2]);
                Fs.deleteRecursive(new File(this.root, strArr[i2]));
            }
            i = i2 + 1;
        }
    }

    private byte determineDesiredState(byte b, DexManifest dexManifest, boolean z) {
        Object[] objArr;
        String str;
        if (dexManifest.dexes.length == 0) {
            Mlog.i("no secondary dexes listed: using noop configuration", new Object[0]);
            return (byte) 9;
        }
        if (b == 5) {
            objArr = new Object[0];
            str = "recovering from bad class gen: using fallback";
        } else {
            if (!"Amazon".equals(Build.BRAND) || C0cm.A00) {
                if (C0cm.A00) {
                    return (z || !dexManifest.canLoadCanaryClass()) ? (byte) 8 : (byte) 9;
                }
                return (byte) 3;
            }
            objArr = new Object[0];
            str = "avoiding optimizations on non-standard VM";
        }
        Mlog.i(str, objArr);
        return (byte) 2;
    }

    public static File determineOdexCacheName(File file) {
        if (C0cm.A00) {
            return null;
        }
        String path = file.getPath();
        if (path.endsWith(".apk")) {
            File A0E = AnonymousClass001.A0E(0Pz.A0W(path.substring(0, path.length() - 4), DexManifest.ODEX_EXT));
            if (A0E.exists()) {
                return A0E;
            }
        }
        return Fs.dexOptGenerateCacheFileName(Fs.findSystemDalvikCache(), file, "classes.dex");
    }

    public static DexStore dexStoreListHead() {
        DexStore dexStore;
        synchronized (DexStore.class) {
            dexStore = sListHead;
        }
        return dexStore;
    }

    private int findInArray(String[] strArr, String str) {
        int i;
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= strArr.length) {
                i = -1;
                break;
            }
            if (str.equals(strArr[i])) {
                break;
            }
            i2 = i + 1;
        }
        return i;
    }

    public static DexStore findOpened(File file) {
        DexStore dexStore;
        synchronized (DexStore.class) {
            File absoluteFile = file.getAbsoluteFile();
            DexStore dexStoreListHead = dexStoreListHead();
            while (true) {
                dexStore = dexStoreListHead;
                if (dexStore == null) {
                    dexStore = null;
                    break;
                }
                if (dexStore.root.equals(absoluteFile)) {
                    break;
                }
                dexStoreListHead = dexStore.next;
            }
        }
        return dexStore;
    }

    public static DexStore findOpened(String str) {
        DexStore dexStore;
        synchronized (DexStore.class) {
            DexStore dexStoreListHead = dexStoreListHead();
            while (true) {
                dexStore = dexStoreListHead;
                if (dexStore == null) {
                    dexStore = null;
                    break;
                }
                String str2 = dexStore.id;
                if (str2 == null) {
                    if (str == null) {
                        break;
                    }
                    dexStoreListHead = dexStore.next;
                } else {
                    if (str2.equals(str)) {
                        break;
                    }
                    dexStoreListHead = dexStore.next;
                }
            }
        }
        return dexStore;
    }

    public static long genAppUpgradeTimestamp(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Mlog.w(e, "Cannot get our app last update time", AnonymousClass001.A1Z());
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v32, types: [long] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.zip.ZipFile] */
    public static long getApkIdentifier(File file, boolean z) {
        int A01 = BuildConstants.A01();
        ?? r0 = A01;
        if (r0 > 1) {
            Mlog.w("Build id used for apk identification", new Object[0]);
            return A01;
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            r0 = zipFile;
            try {
                ZipEntry entry = r0.getEntry("classes.dex");
                if (entry != null) {
                    AnonymousClass001.A1B("CRC used for apk identification");
                    r0 = entry.getCrc();
                    zipFile.close();
                    return r0;
                }
                zipFile.close();
                if (z) {
                    long lastModified = file.lastModified();
                    if (lastModified > 0) {
                        return lastModified;
                    }
                }
                throw 0Pz.A08("No usable identifier for apk ", file.getPath());
            } finally {
            }
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public static long getAppUpgradeTimestamp(Context context) {
        long j = sCachedLastAppUpdateTime;
        if (j == 0) {
            j = genAppUpgradeTimestamp(context);
            sCachedLastAppUpdateTime = j;
        }
        return j;
    }

    public static long getBaseApkIdentifier(File file) {
        return getApkIdentifier(file, false);
    }

    public static DexStoreClock getClock(Class cls) {
        DexStoreClock dexStoreClock = sDexStoreClock;
        if (dexStoreClock == null) {
            dexStoreClock = null;
        }
        return dexStoreClock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OptimizationHistoryLog getCurrentOptHistoryLogFromRoot(Context context, File file) {
        OptimizationHistoryLog optimizationHistoryLog = this.mCachedOptimizationHistoryLog;
        if (optimizationHistoryLog == null || !optimizationHistoryLog.isLogFileAsFromRoot(file) || this.mCachedOptimizationHistoryLog.isOutOfDate()) {
            OptimizationHistoryLog optimizationHistoryLog2 = this.mCachedOptimizationHistoryLog;
            OptimizationHistoryLog readOrMakeDefaultFromRoot = OptimizationHistoryLog.readOrMakeDefaultFromRoot(context, file);
            this.mCachedOptimizationHistoryLog = readOrMakeDefaultFromRoot;
            Mlog.i("Reading new history log for (same root: %s out of date: %s) root: %s \n old: %s \n new: %s", Boolean.valueOf(readOrMakeDefaultFromRoot.isLogFileAsFromRoot(file)), Boolean.valueOf(this.mCachedOptimizationHistoryLog.isOutOfDate()), file.getAbsolutePath(), optimizationHistoryLog2, this.mCachedOptimizationHistoryLog);
        }
        return this.mCachedOptimizationHistoryLog;
    }

    public static DexStoreTestHooks getDexStoreTestHooks() {
        return sDexStoreTestHooks;
    }

    public static String getIdForTracing(File file) {
        String path = file.getPath();
        int length = path.length();
        if (length > 64) {
            int i = 0;
            if (path.startsWith("/data/data/")) {
                i = path.indexOf(47, 11) + 1;
                if (length <= i + 64) {
                    path = path.substring(i);
                }
            }
            return path.substring(i, i + 64);
        }
        return path;
    }

    private String getMegaZipName(Context context, DexManifest dexManifest) {
        StringBuilder A0l = AnonymousClass001.A0l(46);
        A0l.append("z-");
        appendDexHashForMegaZip(context, A0l, dexManifest);
        return AnonymousClass001.A0d(".zip", A0l);
    }

    public static File getOatFileFromDexHash(File file, String str) {
        if (str == null) {
            return null;
        }
        return AnonymousClass001.A0D(file, 0Pz.A0j("prog-", str, ".oat"));
    }

    private DexStore[] getParents() {
        DexStore[] dexStoreArr;
        synchronized (this) {
            DexManifest loadManifest = loadManifest();
            if (this.mParentStores.isEmpty() && !DexStoreUtils.MAIN_DEX_STORE_ID.equals(loadManifest.id)) {
                String[] strArr = loadManifest.requires;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    String str = strArr[i2];
                    if (!DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
                        DexStore dexStoreListHead = dexStoreListHead();
                        while (true) {
                            DexStore dexStore = dexStoreListHead;
                            if (dexStore == null) {
                                Mlog.d(0Pz.A0v("unable to find required store ", str, " of store ", loadManifest.id), new Object[0]);
                                break;
                            }
                            String str2 = dexStore.id;
                            if (str2 != null && str2.equals(str)) {
                                this.mParentStores.add(dexStore);
                                dexStore.addChild(this);
                                break;
                            }
                            dexStoreListHead = dexStore.next;
                        }
                    }
                    i = i2 + 1;
                }
            }
            List list = this.mParentStores;
            dexStoreArr = (DexStore[]) list.toArray(new DexStore[list.size()]);
        }
        return dexStoreArr;
    }

    public static String getStatusDescription(long j) {
        String str;
        int i = (int) (j & 15);
        switch (i) {
            case 0:
                str = "STATE_INVALID";
                break;
            case 1:
                str = "STATE_TX_FAILED";
                break;
            case 2:
                str = "STATE_FALLBACK";
                break;
            case 3:
                str = "STATE_XDEX";
                break;
            case 4:
                str = "STATE_TURBO";
                break;
            case 5:
                str = "STATE_BAD_GEN";
                break;
            case 6:
                str = "STATE_REGEN_FORCED";
                break;
            case 7:
                str = "STATE_ART_TURBO";
                break;
            case 8:
                str = "STATE_ART_XDEX";
                break;
            case 9:
                str = "STATE_NOOP";
                break;
            default:
                str = 0Pz.A0T("BAD STATE ", i);
                break;
        }
        return AnonymousClass001.A0n(str).toString();
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [X.0dF, java.lang.Object] */
    private void installArtHacks(Context context, DexErrorRecoveryInfo dexErrorRecoveryInfo) {
        context.getPackageName();
        int i = 256;
        boolean checkAndClearGk = checkAndClearGk(context, Experiments.DISABLE_DEX_VERIFIER);
        this.mDisableVerifier = checkAndClearGk;
        if (checkAndClearGk) {
            i = 260;
        }
        if (checkAndClearGk(context, Experiments.DISABLE_DEX_COLLISION_CHECK)) {
            i |= 32;
        }
        if (!sLoadedCompressedOreo) {
            if (checkAndClearGk(context, Experiments.DISABLE_DEX_ISUPTODATE_CHECK)) {
                i |= 64;
            }
            ?? obj = new Object();
            ((0dF) obj).A00 = context;
            if (C0k2.A00(obj, Experiments.DISABLE_MONITOR_VISITLOCKS, 0) == 1) {
                i |= 128;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        int installArtHacks = DalvikInternals.installArtHacks(i, i2);
        if (i2 <= 31) {
            if ((i & 4) != 0 && (installArtHacks & 4) == 0) {
                DexTricksErrorReporter.reportSampledSoftError("dex_tricks::art_disable_verifier::failed_install", DalvikInternals.getLastInstallFailures(), null);
            }
            if ((i & 256) != 0 && (installArtHacks & 256) == 0) {
                DexTricksErrorReporter.reportSampledSoftError("dex_tricks::pc_line_num::failed_install", DalvikInternals.getLastInstallFailures(), null);
            }
        }
        DalvikInternals.setEnabledThreadArtHacks(i);
        dexErrorRecoveryInfo.hacksDesired = i;
        dexErrorRecoveryInfo.hacksInstalled = installArtHacks;
    }

    public static void installCrossDexHooks() {
        synchronized (DexStore.class) {
            if (sAttemptedCrossDexHookInstallation) {
                Throwable th = sCrossDexHookInstallationError;
                if (th != null) {
                    th = Fs.runtimeExFrom(th);
                    throw th;
                }
            } else {
                sAttemptedCrossDexHookInstallation = true;
                try {
                    DalvikInternals.fixDvmForCrossDexHack();
                    Mlog.d("cross-dex hook installation succeeded", AnonymousClass001.A1Z());
                } catch (Throwable th2) {
                    th = th2;
                    sCrossDexHookInstallationError = th;
                }
            }
        }
    }

    public static boolean isDoppelDexBuild() {
        return false;
    }

    public static long lastModifiedTime(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        return file.lastModified();
    }

    private String[] listAndPruneRootFiles(Context context) {
        ArrayList A0s = AnonymousClass001.A0s();
        String[] listRootFilesForPruningLocked = listRootFilesForPruningLocked(context, A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Fs.deleteRecursive((File) it.next());
        }
        return listRootFilesForPruningLocked;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        if (("art_pgo_ref_profile.prof".equals(r0) || (r0.endsWith(".prof") && r0.startsWith("TmpPgoProfile_"))) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String[] listRootFilesForPruningLocked(android.content.Context r302, java.util.List r303) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.listRootFilesForPruningLocked(android.content.Context, java.util.List):java.lang.String[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(1:271)(1:36)|37|38|39|(1:270)(1:49)|50|51|52|53|54|(4:56|57|58|(27:60|61|62|63|64|65|(4:67|68|69|(15:71|72|(9:75|76|77|78|79|(3:115|116|117)|113|114|73)|118|119|120|121|122|123|(2:130|131)|132|133|134|135|136)(10:137|138|139|140|141|142|143|144|145|146))|148|(3:150|151|152)|153|154|155|156|157|158|(1:160)|162|163|164|165|166|(11:168|169|170|171|172|173|174|175|(10:179|180|181|182|183|184|(5:192|193|194|195|196)(1:190)|191|177|176)|197|198)|251|200|201|202|(16:204|(2:206|207)|208|(1:210)(1:221)|211|212|213|214|215|216|217|218|219|220|145|146)(21:222|(2:224|225)|226|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244)))|269|63|64|65|(0)|148|(0)|153|154|155|156|157|158|(0)|162|163|164|165|166|(0)|251|200|201|202|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x040d, code lost:
    
        if (r311 == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02f2, code lost:
    
        r324 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02f4, code lost:
    
        r0 = X.AnonymousClass001.A1N(r0 & 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0333, code lost:
    
        com.facebook.common.dextricks.Mlog.e(r324, "Failed to teach app classloader about secondary dex files (%s); fatal: %b, regenerated: %b", r301.root, java.lang.Boolean.valueOf(r0), java.lang.Boolean.valueOf(r322));
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x033a, code lost:
    
        if (r0 != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0340, code lost:
    
        r0.requestDexUnpack();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x034c, code lost:
    
        new java.lang.Exception(r324);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0491, code lost:
    
        new java.lang.Error(r324);
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c6 A[Catch: all -> 0x0525, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0525, blocks: (B:3:0x0021, B:5:0x0031, B:7:0x0039, B:8:0x0040, B:10:0x0048, B:12:0x004e, B:13:0x0053, B:15:0x0064, B:16:0x0069, B:22:0x0086, B:23:0x008b, B:26:0x0097, B:27:0x009e, B:30:0x00ac, B:33:0x00b8, B:38:0x00d3, B:43:0x00ea, B:44:0x00ef, B:51:0x0114, B:52:0x0119, B:57:0x0127, B:60:0x0136, B:62:0x0140, B:64:0x0147, B:67:0x0151, B:68:0x0158, B:71:0x0164, B:76:0x0184, B:78:0x0190, B:82:0x01a3, B:86:0x01b6, B:90:0x01c9, B:94:0x01dc, B:98:0x01ef, B:102:0x0202, B:106:0x0215, B:110:0x0227, B:116:0x0235, B:117:0x023c, B:120:0x0253, B:122:0x025a, B:125:0x0264, B:127:0x0272, B:131:0x0280, B:133:0x0287, B:135:0x028c, B:137:0x0292, B:139:0x029e, B:141:0x02a6, B:143:0x02ad, B:144:0x02b4, B:146:0x0498, B:150:0x02c6, B:152:0x02d0, B:155:0x02dc, B:163:0x0358, B:165:0x035f, B:169:0x036e, B:172:0x037f, B:174:0x038e, B:176:0x039e, B:180:0x03ac, B:181:0x03b1, B:183:0x03bf, B:187:0x03d7, B:192:0x03e5, B:194:0x03f4, B:201:0x042f, B:207:0x0443, B:212:0x0465, B:214:0x046c, B:216:0x0477, B:217:0x047b, B:220:0x0482, B:225:0x04ac, B:227:0x04b3, B:229:0x04ba, B:231:0x04c3, B:233:0x04ce, B:234:0x04d5, B:236:0x04e4, B:237:0x04eb, B:238:0x04f2, B:239:0x04f9, B:240:0x0500, B:242:0x0516, B:248:0x041b, B:250:0x0428, B:254:0x0306, B:255:0x030d, B:256:0x0314, B:257:0x031b, B:259:0x0333, B:261:0x0340, B:262:0x0345, B:265:0x034c, B:266:0x048a, B:268:0x0491, B:158:0x02e2, B:160:0x02ea), top: B:2:0x0021, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ea A[Catch: all -> 0x02f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x02f2, blocks: (B:158:0x02e2, B:160:0x02ea), top: B:157:0x02e2, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151 A[Catch: all -> 0x0525, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0525, blocks: (B:3:0x0021, B:5:0x0031, B:7:0x0039, B:8:0x0040, B:10:0x0048, B:12:0x004e, B:13:0x0053, B:15:0x0064, B:16:0x0069, B:22:0x0086, B:23:0x008b, B:26:0x0097, B:27:0x009e, B:30:0x00ac, B:33:0x00b8, B:38:0x00d3, B:43:0x00ea, B:44:0x00ef, B:51:0x0114, B:52:0x0119, B:57:0x0127, B:60:0x0136, B:62:0x0140, B:64:0x0147, B:67:0x0151, B:68:0x0158, B:71:0x0164, B:76:0x0184, B:78:0x0190, B:82:0x01a3, B:86:0x01b6, B:90:0x01c9, B:94:0x01dc, B:98:0x01ef, B:102:0x0202, B:106:0x0215, B:110:0x0227, B:116:0x0235, B:117:0x023c, B:120:0x0253, B:122:0x025a, B:125:0x0264, B:127:0x0272, B:131:0x0280, B:133:0x0287, B:135:0x028c, B:137:0x0292, B:139:0x029e, B:141:0x02a6, B:143:0x02ad, B:144:0x02b4, B:146:0x0498, B:150:0x02c6, B:152:0x02d0, B:155:0x02dc, B:163:0x0358, B:165:0x035f, B:169:0x036e, B:172:0x037f, B:174:0x038e, B:176:0x039e, B:180:0x03ac, B:181:0x03b1, B:183:0x03bf, B:187:0x03d7, B:192:0x03e5, B:194:0x03f4, B:201:0x042f, B:207:0x0443, B:212:0x0465, B:214:0x046c, B:216:0x0477, B:217:0x047b, B:220:0x0482, B:225:0x04ac, B:227:0x04b3, B:229:0x04ba, B:231:0x04c3, B:233:0x04ce, B:234:0x04d5, B:236:0x04e4, B:237:0x04eb, B:238:0x04f2, B:239:0x04f9, B:240:0x0500, B:242:0x0516, B:248:0x041b, B:250:0x0428, B:254:0x0306, B:255:0x030d, B:256:0x0314, B:257:0x031b, B:259:0x0333, B:261:0x0340, B:262:0x0345, B:265:0x034c, B:266:0x048a, B:268:0x0491, B:158:0x02e2, B:160:0x02ea), top: B:2:0x0021, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllCompressedOreoImpl(com.facebook.common.dextricks.DexErrorRecoveryInfo r302, com.facebook.common.dextricks.DexManifest r303, int r304, com.facebook.quicklog.LightweightQuickPerformanceLogger r305, android.content.Context r306) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllCompressedOreoImpl(com.facebook.common.dextricks.DexErrorRecoveryInfo, com.facebook.common.dextricks.DexManifest, int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(114:10|(4:13|(2:15|16)(1:18)|17|11)|19|20|(1:22)(5:478|479|480|481|(11:483|484|485|486|487|488|489|355|(1:357)|358|359))|23|24|(6:26|27|28|29|30|31)(2:468|(112:470|471|472|473|474|475|476|477|37|38|39|40|41|42|43|(1:45)(2:459|(1:461)(1:462))|46|47|48|49|50|(3:52|53|(6:55|56|57|58|59|60))(2:440|(71:442|(2:450|451)|444|445|446|(2:448|449)|129|130|131|132|133|134|(21:136|137|138|139|(2:141|(2:143|(5:145|146|147|148|149))(5:150|151|152|153|154))|155|156|(2:158|(2:160|(5:167|168|169|170|171)(5:162|163|164|165|166))(3:172|173|174))|175|176|177|178|(2:229|230)|180|181|182|183|184|(25:185|186|(1:188)|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|208|(4:210|211|212|213)(2:215|216)|214)|102|103)|239|(2:241|(2:243|244))|245|(2:247|(69:249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|(2:271|272)|273|274|275|276|277|278|279|280|281|282|283|284|285|286|(1:288)|289|290|(1:292)|293|294|295|296|297|298|299|300|301|302|303|304|(18:306|307|308|309|310|(5:312|313|314|315|316)|317|318|319|(1:321)|322|323|324|325|326|327|328|(3:330|331|332))(2:360|361)|333|334|335|336|337|338|339|340|341|342|343|344|345|(8:347|348|349|350|351|352|353|354)|355|(0)|358|359)(22:386|387|388|389|390|391|392|393|394|395|396|397|398|399|400|401|402|(2:404|405)(2:421|(2:423|424)(4:425|426|419|420))|406|407|408|(11:410|411|412|413|414|415|416|417|418|419|420)))|427|428|266|267|(3:269|271|272)|273|274|275|276|277|278|279|280|281|282|283|284|285|286|(0)|289|290|(0)|293|294|295|296|297|298|299|300|301|302|303|304|(0)(0)|333|334|335|336|337|338|339|340|341|342|343|344|345|(0)|355|(0)|358|359))|61|62|63|64|(7:66|67|68|69|70|71|72)|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|(7:91|92|93|94|95|96|97)|115|(4:117|118|119|120)|129|130|131|132|133|134|(0)|239|(0)|245|(0)|427|428|266|267|(0)|273|274|275|276|277|278|279|280|281|282|283|284|285|286|(0)|289|290|(0)|293|294|295|296|297|298|299|300|301|302|303|304|(0)(0)|333|334|335|336|337|338|339|340|341|342|343|344|345|(0)|355|(0)|358|359))|32|(3:34|35|36)(2:463|(3:465|466|467))|37|38|39|40|41|42|43|(0)(0)|46|47|48|49|50|(0)(0)|61|62|63|64|(0)|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|(0)|115|(0)|129|130|131|132|133|134|(0)|239|(0)|245|(0)|427|428|266|267|(0)|273|274|275|276|277|278|279|280|281|282|283|284|285|286|(0)|289|290|(0)|293|294|295|296|297|298|299|300|301|302|303|304|(0)(0)|333|334|335|336|337|338|339|340|341|342|343|344|345|(0)|355|(0)|358|359) */
    /* JADX WARN: Can't wrap try/catch for region: R(68:10|(4:13|(2:15|16)(1:18)|17|11)|19|20|(47:(1:22)(5:478|479|480|481|(11:483|484|485|486|487|488|489|355|(1:357)|358|359))|(6:26|27|28|29|30|31)(2:468|(112:470|471|472|473|474|475|476|477|37|38|39|40|41|42|43|(1:45)(2:459|(1:461)(1:462))|46|47|48|49|50|(3:52|53|(6:55|56|57|58|59|60))(2:440|(71:442|(2:450|451)|444|445|446|(2:448|449)|129|130|131|132|133|134|(21:136|137|138|139|(2:141|(2:143|(5:145|146|147|148|149))(5:150|151|152|153|154))|155|156|(2:158|(2:160|(5:167|168|169|170|171)(5:162|163|164|165|166))(3:172|173|174))|175|176|177|178|(2:229|230)|180|181|182|183|184|(25:185|186|(1:188)|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|208|(4:210|211|212|213)(2:215|216)|214)|102|103)|239|(2:241|(2:243|244))|245|(2:247|(69:249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|(2:271|272)|273|274|275|276|277|278|279|280|281|282|283|284|285|286|(1:288)|289|290|(1:292)|293|294|295|296|297|298|299|300|301|302|303|304|(18:306|307|308|309|310|(5:312|313|314|315|316)|317|318|319|(1:321)|322|323|324|325|326|327|328|(3:330|331|332))(2:360|361)|333|334|335|336|337|338|339|340|341|342|343|344|345|(8:347|348|349|350|351|352|353|354)|355|(0)|358|359)(22:386|387|388|389|390|391|392|393|394|395|396|397|398|399|400|401|402|(2:404|405)(2:421|(2:423|424)(4:425|426|419|420))|406|407|408|(11:410|411|412|413|414|415|416|417|418|419|420)))|427|428|266|267|(3:269|271|272)|273|274|275|276|277|278|279|280|281|282|283|284|285|286|(0)|289|290|(0)|293|294|295|296|297|298|299|300|301|302|303|304|(0)(0)|333|334|335|336|337|338|339|340|341|342|343|344|345|(0)|355|(0)|358|359))|61|62|63|64|(7:66|67|68|69|70|71|72)|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|(7:91|92|93|94|95|96|97)|115|(4:117|118|119|120)|129|130|131|132|133|134|(0)|239|(0)|245|(0)|427|428|266|267|(0)|273|274|275|276|277|278|279|280|281|282|283|284|285|286|(0)|289|290|(0)|293|294|295|296|297|298|299|300|301|302|303|304|(0)(0)|333|334|335|336|337|338|339|340|341|342|343|344|345|(0)|355|(0)|358|359))|277|278|279|280|281|282|283|284|285|286|(0)|289|290|(0)|293|294|295|296|297|298|299|300|301|302|303|304|(0)(0)|333|334|335|336|337|338|339|340|341|342|343|344|345|(0)|355|(0)|358|359)|23|24|32|(3:34|35|36)(2:463|(3:465|466|467))|37|38|39|40|41|42|43|(0)(0)|46|47|48|49|50|(0)(0)|61|62|63|64|(0)|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|(0)|115|(0)|129|130|131|132|133|134|(0)|239|(0)|245|(0)|427|428|266|267|(0)|273|274|275|276) */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0885, code lost:
    
        r313 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0896, code lost:
    
        com.facebook.common.dextricks.Mlog.e(r313, "Failure while checking oat file provenance.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0464, code lost:
    
        com.facebook.common.dextricks.Mlog.d("no config file for repository %s found: using all-default configuration", r301.root);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0475, code lost:
    
        r334 = new com.facebook.common.dextricks.DexStore.Config.Builder().build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0483 A[Catch: all -> 0x0a2a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0a2a, blocks: (B:23:0x014a, B:27:0x0177, B:28:0x017e, B:29:0x0185, B:31:0x0197, B:35:0x0208, B:38:0x023d, B:40:0x0246, B:42:0x0255, B:47:0x026b, B:49:0x027d, B:52:0x02a3, B:56:0x02b6, B:58:0x02c3, B:62:0x0325, B:63:0x032c, B:67:0x0341, B:68:0x0348, B:69:0x034f, B:71:0x0365, B:74:0x0371, B:76:0x0378, B:77:0x037d, B:78:0x0382, B:81:0x0389, B:83:0x0390, B:85:0x0395, B:87:0x03a0, B:88:0x03a7, B:91:0x03b3, B:97:0x03c9, B:103:0x072f, B:107:0x03dd, B:119:0x03f9, B:124:0x0408, B:125:0x040f, B:127:0x041e, B:130:0x042f, B:131:0x0436, B:133:0x0442, B:136:0x0483, B:138:0x048e, B:146:0x04b6, B:148:0x04be, B:151:0x04cf, B:153:0x04d7, B:155:0x04df, B:163:0x0505, B:165:0x050d, B:168:0x053b, B:169:0x0542, B:171:0x054f, B:173:0x0528, B:177:0x0558, B:230:0x0569, B:181:0x0594, B:182:0x059b, B:184:0x05a8, B:190:0x05c6, B:192:0x05d0, B:194:0x05e2, B:197:0x05ef, B:199:0x05f6, B:201:0x05ff, B:203:0x0608, B:205:0x060f, B:207:0x0615, B:211:0x0627, B:213:0x062f, B:216:0x0640, B:221:0x065a, B:222:0x0661, B:224:0x0670, B:225:0x0677, B:226:0x067e, B:234:0x0576, B:236:0x0580, B:237:0x0587, B:244:0x06c1, B:250:0x06d5, B:251:0x06da, B:254:0x06e7, B:256:0x06ee, B:258:0x06f5, B:267:0x0815, B:272:0x083b, B:284:0x089d, B:286:0x08a4, B:289:0x08b4, B:293:0x08ca, B:295:0x08d5, B:297:0x08e1, B:298:0x08e8, B:300:0x08f5, B:302:0x0900, B:303:0x0907, B:307:0x0919, B:309:0x0920, B:313:0x0931, B:315:0x093e, B:318:0x0951, B:323:0x0969, B:325:0x0976, B:327:0x097d, B:331:0x098e, B:334:0x09a8, B:335:0x09ad, B:338:0x09b9, B:340:0x09c2, B:342:0x09c9, B:344:0x09d0, B:345:0x09d7, B:348:0x09e6, B:349:0x09ed, B:350:0x09f4, B:351:0x09fb, B:352:0x0a02, B:354:0x0a18, B:361:0x09a1, B:374:0x088c, B:376:0x0896, B:382:0x071c, B:384:0x0723, B:385:0x0728, B:388:0x0735, B:389:0x073c, B:391:0x0749, B:393:0x0750, B:394:0x0755, B:396:0x075c, B:397:0x0763, B:399:0x076d, B:401:0x0774, B:405:0x0785, B:407:0x078c, B:411:0x07c9, B:413:0x07d0, B:415:0x07e1, B:417:0x07ed, B:418:0x07f4, B:420:0x0806, B:424:0x07a5, B:426:0x07ba, B:431:0x0450, B:432:0x0457, B:434:0x0464, B:435:0x0469, B:437:0x046e, B:439:0x0475, B:451:0x02da, B:445:0x030b, B:449:0x0319, B:455:0x02e7, B:456:0x02ee, B:458:0x02fd, B:466:0x0224, B:471:0x01bc, B:472:0x01c3, B:473:0x01ca, B:474:0x01d1, B:476:0x01e7, B:480:0x00f9, B:484:0x010a, B:485:0x0111, B:487:0x011e, B:489:0x0142, B:276:0x0847, B:282:0x0867, B:367:0x0884, B:371:0x087d, B:278:0x084e, B:280:0x0859, B:365:0x0871, B:94:0x03bc, B:95:0x03c2, B:261:0x06fc, B:101:0x03d1), top: B:479:0x00f9, inners: #0, #1, #4, #5, #6, #7, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0a22 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a3 A[Catch: all -> 0x0a2a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0a2a, blocks: (B:23:0x014a, B:27:0x0177, B:28:0x017e, B:29:0x0185, B:31:0x0197, B:35:0x0208, B:38:0x023d, B:40:0x0246, B:42:0x0255, B:47:0x026b, B:49:0x027d, B:52:0x02a3, B:56:0x02b6, B:58:0x02c3, B:62:0x0325, B:63:0x032c, B:67:0x0341, B:68:0x0348, B:69:0x034f, B:71:0x0365, B:74:0x0371, B:76:0x0378, B:77:0x037d, B:78:0x0382, B:81:0x0389, B:83:0x0390, B:85:0x0395, B:87:0x03a0, B:88:0x03a7, B:91:0x03b3, B:97:0x03c9, B:103:0x072f, B:107:0x03dd, B:119:0x03f9, B:124:0x0408, B:125:0x040f, B:127:0x041e, B:130:0x042f, B:131:0x0436, B:133:0x0442, B:136:0x0483, B:138:0x048e, B:146:0x04b6, B:148:0x04be, B:151:0x04cf, B:153:0x04d7, B:155:0x04df, B:163:0x0505, B:165:0x050d, B:168:0x053b, B:169:0x0542, B:171:0x054f, B:173:0x0528, B:177:0x0558, B:230:0x0569, B:181:0x0594, B:182:0x059b, B:184:0x05a8, B:190:0x05c6, B:192:0x05d0, B:194:0x05e2, B:197:0x05ef, B:199:0x05f6, B:201:0x05ff, B:203:0x0608, B:205:0x060f, B:207:0x0615, B:211:0x0627, B:213:0x062f, B:216:0x0640, B:221:0x065a, B:222:0x0661, B:224:0x0670, B:225:0x0677, B:226:0x067e, B:234:0x0576, B:236:0x0580, B:237:0x0587, B:244:0x06c1, B:250:0x06d5, B:251:0x06da, B:254:0x06e7, B:256:0x06ee, B:258:0x06f5, B:267:0x0815, B:272:0x083b, B:284:0x089d, B:286:0x08a4, B:289:0x08b4, B:293:0x08ca, B:295:0x08d5, B:297:0x08e1, B:298:0x08e8, B:300:0x08f5, B:302:0x0900, B:303:0x0907, B:307:0x0919, B:309:0x0920, B:313:0x0931, B:315:0x093e, B:318:0x0951, B:323:0x0969, B:325:0x0976, B:327:0x097d, B:331:0x098e, B:334:0x09a8, B:335:0x09ad, B:338:0x09b9, B:340:0x09c2, B:342:0x09c9, B:344:0x09d0, B:345:0x09d7, B:348:0x09e6, B:349:0x09ed, B:350:0x09f4, B:351:0x09fb, B:352:0x0a02, B:354:0x0a18, B:361:0x09a1, B:374:0x088c, B:376:0x0896, B:382:0x071c, B:384:0x0723, B:385:0x0728, B:388:0x0735, B:389:0x073c, B:391:0x0749, B:393:0x0750, B:394:0x0755, B:396:0x075c, B:397:0x0763, B:399:0x076d, B:401:0x0774, B:405:0x0785, B:407:0x078c, B:411:0x07c9, B:413:0x07d0, B:415:0x07e1, B:417:0x07ed, B:418:0x07f4, B:420:0x0806, B:424:0x07a5, B:426:0x07ba, B:431:0x0450, B:432:0x0457, B:434:0x0464, B:435:0x0469, B:437:0x046e, B:439:0x0475, B:451:0x02da, B:445:0x030b, B:449:0x0319, B:455:0x02e7, B:456:0x02ee, B:458:0x02fd, B:466:0x0224, B:471:0x01bc, B:472:0x01c3, B:473:0x01ca, B:474:0x01d1, B:476:0x01e7, B:480:0x00f9, B:484:0x010a, B:485:0x0111, B:487:0x011e, B:489:0x0142, B:276:0x0847, B:282:0x0867, B:367:0x0884, B:371:0x087d, B:278:0x084e, B:280:0x0859, B:365:0x0871, B:94:0x03bc, B:95:0x03c2, B:261:0x06fc, B:101:0x03d1), top: B:479:0x00f9, inners: #0, #1, #4, #5, #6, #7, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b3 A[Catch: all -> 0x0a2a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0a2a, blocks: (B:23:0x014a, B:27:0x0177, B:28:0x017e, B:29:0x0185, B:31:0x0197, B:35:0x0208, B:38:0x023d, B:40:0x0246, B:42:0x0255, B:47:0x026b, B:49:0x027d, B:52:0x02a3, B:56:0x02b6, B:58:0x02c3, B:62:0x0325, B:63:0x032c, B:67:0x0341, B:68:0x0348, B:69:0x034f, B:71:0x0365, B:74:0x0371, B:76:0x0378, B:77:0x037d, B:78:0x0382, B:81:0x0389, B:83:0x0390, B:85:0x0395, B:87:0x03a0, B:88:0x03a7, B:91:0x03b3, B:97:0x03c9, B:103:0x072f, B:107:0x03dd, B:119:0x03f9, B:124:0x0408, B:125:0x040f, B:127:0x041e, B:130:0x042f, B:131:0x0436, B:133:0x0442, B:136:0x0483, B:138:0x048e, B:146:0x04b6, B:148:0x04be, B:151:0x04cf, B:153:0x04d7, B:155:0x04df, B:163:0x0505, B:165:0x050d, B:168:0x053b, B:169:0x0542, B:171:0x054f, B:173:0x0528, B:177:0x0558, B:230:0x0569, B:181:0x0594, B:182:0x059b, B:184:0x05a8, B:190:0x05c6, B:192:0x05d0, B:194:0x05e2, B:197:0x05ef, B:199:0x05f6, B:201:0x05ff, B:203:0x0608, B:205:0x060f, B:207:0x0615, B:211:0x0627, B:213:0x062f, B:216:0x0640, B:221:0x065a, B:222:0x0661, B:224:0x0670, B:225:0x0677, B:226:0x067e, B:234:0x0576, B:236:0x0580, B:237:0x0587, B:244:0x06c1, B:250:0x06d5, B:251:0x06da, B:254:0x06e7, B:256:0x06ee, B:258:0x06f5, B:267:0x0815, B:272:0x083b, B:284:0x089d, B:286:0x08a4, B:289:0x08b4, B:293:0x08ca, B:295:0x08d5, B:297:0x08e1, B:298:0x08e8, B:300:0x08f5, B:302:0x0900, B:303:0x0907, B:307:0x0919, B:309:0x0920, B:313:0x0931, B:315:0x093e, B:318:0x0951, B:323:0x0969, B:325:0x0976, B:327:0x097d, B:331:0x098e, B:334:0x09a8, B:335:0x09ad, B:338:0x09b9, B:340:0x09c2, B:342:0x09c9, B:344:0x09d0, B:345:0x09d7, B:348:0x09e6, B:349:0x09ed, B:350:0x09f4, B:351:0x09fb, B:352:0x0a02, B:354:0x0a18, B:361:0x09a1, B:374:0x088c, B:376:0x0896, B:382:0x071c, B:384:0x0723, B:385:0x0728, B:388:0x0735, B:389:0x073c, B:391:0x0749, B:393:0x0750, B:394:0x0755, B:396:0x075c, B:397:0x0763, B:399:0x076d, B:401:0x0774, B:405:0x0785, B:407:0x078c, B:411:0x07c9, B:413:0x07d0, B:415:0x07e1, B:417:0x07ed, B:418:0x07f4, B:420:0x0806, B:424:0x07a5, B:426:0x07ba, B:431:0x0450, B:432:0x0457, B:434:0x0464, B:435:0x0469, B:437:0x046e, B:439:0x0475, B:451:0x02da, B:445:0x030b, B:449:0x0319, B:455:0x02e7, B:456:0x02ee, B:458:0x02fd, B:466:0x0224, B:471:0x01bc, B:472:0x01c3, B:473:0x01ca, B:474:0x01d1, B:476:0x01e7, B:480:0x00f9, B:484:0x010a, B:485:0x0111, B:487:0x011e, B:489:0x0142, B:276:0x0847, B:282:0x0867, B:367:0x0884, B:371:0x087d, B:278:0x084e, B:280:0x0859, B:365:0x0871, B:94:0x03bc, B:95:0x03c2, B:261:0x06fc, B:101:0x03d1), top: B:479:0x00f9, inners: #0, #1, #4, #5, #6, #7, #10, #11, #12 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.facebook.common.dextricks.DexErrorRecoveryInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllImpl(int r302, com.facebook.quicklog.LightweightQuickPerformanceLogger r303, android.content.Context r304) {
        /*
            Method dump skipped, instructions count: 2622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllImpl(int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0231, code lost:
    
        if (com.facebook.common.dextricks.DexStore.sMergedDexConfig.mDexFiles.size() != r0) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void loadDexFiles(com.facebook.common.dextricks.DexErrorRecoveryInfo r302, boolean r303, com.facebook.common.dextricks.OdexScheme r304, com.facebook.common.dextricks.DexManifest r305, android.content.Context r306, int r307) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadDexFiles(com.facebook.common.dextricks.DexErrorRecoveryInfo, boolean, com.facebook.common.dextricks.OdexScheme, com.facebook.common.dextricks.DexManifest, android.content.Context, int):void");
    }

    public static void mergeConfiguration(ClassLoaderConfiguration classLoaderConfiguration) {
        sMergedDexConfig.configFlags |= classLoaderConfiguration.configFlags;
        Iterator it = classLoaderConfiguration.mDexFiles.iterator();
        while (it.hasNext()) {
            sMergedDexConfig.addDex((DexFile) it.next());
        }
        classLoaderConfiguration.mDexFiles.clear();
    }

    public static long nowTimestamp() {
        return sDexStoreClock.now();
    }

    public static DexStore open(File file, File file2, ResProvider resProvider) {
        return open(file, file2, resProvider, AnonymousClass001.A0s(), AnonymousClass001.A0s());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v1 ??, still in use, count: 2, list:
          (r311v1 ??) from 0x0080: PHI (r311v2 ??) = (r311v1 ??), (r311v0 ??) binds: [B:35:0x007e, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]
          (r311v1 ?? I:com.facebook.common.dextricks.DexStore) from 0x0078: SPUT (r311v1 ?? I:com.facebook.common.dextricks.DexStore) A[Catch: all -> 0x008b] com.facebook.common.dextricks.DexStore.sListHead com.facebook.common.dextricks.DexStore
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static com.facebook.common.dextricks.DexStore open(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v1 ??, still in use, count: 2, list:
          (r311v1 ??) from 0x0080: PHI (r311v2 ??) = (r311v1 ??), (r311v0 ??) binds: [B:35:0x007e, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]
          (r311v1 ?? I:com.facebook.common.dextricks.DexStore) from 0x0078: SPUT (r311v1 ?? I:com.facebook.common.dextricks.DexStore) A[Catch: all -> 0x008b] com.facebook.common.dextricks.DexStore.sListHead com.facebook.common.dextricks.DexStore
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.facebook.common.dextricks.DexStore$OptimizationSession] */
    private void optimizeInForegroundLocked(Context context, DexManifest dexManifest, long j) {
        assertLockHeld();
        OdexScheme schemeForState = schemeForState(context, dexManifest, j);
        OptimizationConfiguration build = new OptimizationConfiguration.Builder().build();
        OptimizationConfiguration.Provider provider = new OptimizationConfiguration.Provider(build);
        if (sDexStoreClock.now() < getNextRecommendedOptimizationAttemptTime(build)) {
            Mlog.v("... actually, not optimizing in foreground, since we failed optimization too recently", new Object[0]);
            return;
        }
        Object obj = 1;
        try {
            OptimizationSession optimizationSession = new OptimizationSession(context, provider, true);
            try {
                try {
                    schemeForState.optimize(context, this, optimizationSession);
                    optimizationSession.noteOptimizationSuccess();
                    optimizationSession.close();
                } finally {
                }
            } catch (Throwable th) {
                optimizationSession.copeWithOptimizationFailure(th);
                throw th;
            }
        } catch (InterruptedException unused) {
            throw AnonymousClass001.A0J(obj);
        } catch (Throwable th2) {
            Mlog.w(th2, "foreground optimization failed; proceeding", new Object[0]);
        }
    }

    public static String printRelativeTime(long j, long j2) {
        return String.format("%d (%d ms ago)", Long.valueOf(j2), Long.valueOf(j - j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7 A[Catch: all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0133, blocks: (B:52:0x0032, B:56:0x003d, B:57:0x0043, B:62:0x0057, B:63:0x005b, B:65:0x0062, B:68:0x006f, B:69:0x0074, B:71:0x007b, B:11:0x00a7, B:13:0x00ad, B:16:0x00c2, B:17:0x00c7, B:19:0x00ce, B:20:0x00d4, B:21:0x00d9, B:24:0x00df, B:25:0x0110, B:27:0x011b, B:29:0x0121, B:31:0x0126, B:32:0x012c, B:34:0x0132, B:36:0x00e3, B:41:0x00ef, B:43:0x00f4, B:44:0x00f8, B:46:0x00ff, B:48:0x0105, B:76:0x0088, B:78:0x0093), top: B:51:0x0032, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] readCurrentDepBlock() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.readCurrentDepBlock():byte[]");
    }

    private byte[] readSavedDepBlock() {
        String str;
        Object[] objArr;
        File A0D = AnonymousClass001.A0D(this.root, DEPS_FILENAME);
        if (!A0D.exists()) {
            return null;
        }
        try {
            RandomAccessFile A0H = AnonymousClass001.A0H(A0D);
            try {
                long length = A0H.length();
                if (length > 16777216) {
                    str = "saved dep block file is way too big (%s bytes): considering invalid";
                    objArr = new Object[]{Long.valueOf(length)};
                } else {
                    byte[] bArr = new byte[(int) length];
                    int read = A0H.read(bArr);
                    if (read >= length) {
                        Mlog.v("read saved dep file %s (%s bytes)", A0D, Long.valueOf(length));
                        return bArr;
                    }
                    str = "short read of dep block %s: wanted %s bytes; got %s: considering invalid";
                    objArr = new Object[]{A0D, Long.valueOf(length), Integer.valueOf(read)};
                }
                Mlog.i(str, objArr);
                Fs.safeClose(A0H);
                return null;
            } finally {
                Fs.safeClose(A0H);
            }
        } catch (FileNotFoundException e) {
            Mlog.w(e, "unable to open deps file %s", A0D);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long readStatusLocked() {
        assertLockHeld();
        File A0D = AnonymousClass001.A0D(this.root, MDEX_STATUS_FILENAME);
        try {
            FileInputStream A0F = AnonymousClass001.A0F(A0D);
            try {
                byte[] bArr = new byte[16];
                if (A0F.read(bArr, 0, 16) < 16) {
                    Mlog.d("status file %s too short: treating as zero", A0D);
                } else {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    long j = wrap.getLong();
                    long j2 = wrap.getLong();
                    Long valueOf = Long.valueOf(j);
                    Long valueOf2 = Long.valueOf(j2);
                    Mlog.v("read status:%x check:%x str:%s", valueOf, valueOf2, getStatusDescription(j));
                    long j3 = MDEX_STATUS_XOR ^ j;
                    if (j3 == j2) {
                        return j;
                    }
                    Mlog.e("check mismatch: status:%x expected-check:%x actual-check:%x", valueOf, Long.valueOf(j3), valueOf2);
                }
                Fs.deleteRecursiveNoThrow(A0D);
                return 0L;
            } finally {
                Fs.safeClose(A0F);
            }
        } catch (FileNotFoundException unused) {
            Mlog.d("status file %s not found: treating as zero", A0D);
            return 0L;
        }
    }

    private void runCompiler(DexManifest dexManifest, OdexScheme odexScheme, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) {
        OdexScheme.Compiler makeCompiler = odexScheme.makeCompiler(this, i);
        try {
            InputDexIterator openDexIterator = this.mDexIteratorFactory.openDexIterator(this.id, dexManifest, lightweightQuickPerformanceLogger, context);
            while (openDexIterator.hasNext()) {
                try {
                    InputDex next = openDexIterator.next();
                    try {
                        Mlog.v("compiling %d/%d %s", Integer.valueOf(openDexIterator.mDexPos), Integer.valueOf(openDexIterator.mDexes.length), next);
                        makeCompiler.compile(next);
                        next.close();
                    } finally {
                    }
                } finally {
                }
            }
            makeCompiler.performFinishActions();
            openDexIterator.close();
            makeCompiler.close();
        } catch (Throwable th) {
            if (makeCompiler != null) {
                try {
                    makeCompiler.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static long sanityCheckTimestamp(long j) {
        if (j > sDexStoreClock.now()) {
            j = 0;
        }
        return j;
    }

    private void saveDeps() {
        byte[] readCurrentDepBlock = readCurrentDepBlock();
        File A0D = AnonymousClass001.A0D(this.root, DEPS_FILENAME);
        RandomAccessFile A0I = AnonymousClass001.A0I(A0D);
        try {
            A0I.write(readCurrentDepBlock);
            A0I.setLength(A0I.getFilePointer());
            A0I.close();
            Mlog.v("saved deps file %s", A0D);
        } catch (Throwable th) {
            try {
                A0I.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    private OdexScheme schemeForState(Context context, DexManifest dexManifest, long j) {
        if (dexManifest.isArtMainStore) {
            Mlog.w("This is the main store for art builds, using noop scheme", AnonymousClass001.A1Z());
        } else {
            DexManifest.Dex[] dexArr = dexManifest.dexes;
            byte b = (byte) (15 & j);
            if (b == 2) {
                return new OdexSchemeBoring(dexArr);
            }
            if (b == 3) {
                return new OdexSchemeXdex(dexArr);
            }
            if (b == 4) {
                return new OdexSchemeTurbo(dexArr);
            }
            if (b == 7) {
                return new OdexSchemeArtTurbo(dexArr);
            }
            if (b == 8) {
                return new OdexSchemeArtXdex(context, dexArr, this.mResProvider, j);
            }
            if (b != 9) {
                return new OdexSchemeInvalid(j);
            }
        }
        return new OdexSchemeNoop();
    }

    private OdexScheme schemeForState(Context context, DexManifest dexManifest, long j, int i) {
        return (i & 64) != 0 ? new OdexSchemeIsolatedSplit(this.mApk, context) : schemeForState(context, dexManifest, j);
    }

    public static void setClock(DexStoreClock dexStoreClock) {
        Mlog.d("Setting dexstore clock override", AnonymousClass001.A1Z());
        sDexStoreClock = dexStoreClock;
    }

    private void setCompressedOreoDexErrorRecoveryInfo(DexErrorRecoveryInfo dexErrorRecoveryInfo, OdexSchemeOreo odexSchemeOreo, int i) {
        File file = odexSchemeOreo.mZipFile;
        int markLoadResult = odexSchemeOreo.markLoadResult(i, this.mUseEagerDexOpt);
        dexErrorRecoveryInfo.loadResult = markLoadResult;
        dexErrorRecoveryInfo.odexSize = OreoFileUtils.getOdex(file).length();
        dexErrorRecoveryInfo.odexLastModified = OreoFileUtils.getOdex(file).lastModified();
        dexErrorRecoveryInfo.odexSchemeName = "OdexSchemeOreo";
        boolean z = true;
        if ((markLoadResult & 1) == 0) {
            z = false;
        }
        dexErrorRecoveryInfo.dexoptDuringColdStart = z;
        dexErrorRecoveryInfo.dex2oatCmdLine = OreoFileUtils.getMegazipOdexKeyValue(file, "dex2oat-cmdline");
        dexErrorRecoveryInfo.vdexSize = OreoFileUtils.getVdex(file).length();
        dexErrorRecoveryInfo.vdexLastModified = OreoFileUtils.getVdex(file).lastModified();
    }

    public static void setDexStoreTestHooks(DexStoreTestHooks dexStoreTestHooks) {
        Mlog.d("Setting dexstore test hooks", AnonymousClass001.A1Z());
        sDexStoreTestHooks = dexStoreTestHooks;
    }

    private void setDifference(String[] strArr, String[] strArr2) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr.length) {
                return;
            }
            String str = strArr[i2];
            if (str != null) {
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < strArr2.length) {
                        String str2 = strArr2[i4];
                        if (str2 != null && str.equals(str2)) {
                            strArr[i2] = null;
                            break;
                        }
                        i3 = i4 + 1;
                    } else {
                        break;
                    }
                }
            }
            i = i2 + 1;
        }
    }

    private void setUsingAppImageForMainDexStore(final Context context, final File file) {
        String str = this.id;
        if (str == null || !DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
            return;
        }
        new Thread(file != null ? new Runnable() { // from class: com.facebook.common.dextricks.DexStore.1
            @Override // java.lang.Runnable
            public void run() {
                DexErrorRecoveryInfoAsync.setMainDexStoreLoadInformation(OreoFileUtils.collectAsyncInfoWithSecondary(context, file));
            }
        } : new Runnable() { // from class: com.facebook.common.dextricks.DexStore.2
            @Override // java.lang.Runnable
            public void run() {
                DexErrorRecoveryInfoAsync.setMainDexStoreLoadInformation(OreoFileUtils.collectBaseAsyncInfo(context));
            }
        }).start();
    }

    private boolean shouldLoadCompressedOreoImpl(Context context, DexManifest dexManifest) {
        boolean z = true;
        if (!sLoadedCompressedOreo) {
            context.getApplicationInfo();
            z = false;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0dF, java.lang.Object] */
    private boolean shouldUnpackForCloudPgo(Context context, OdexSchemeOreo odexSchemeOreo) {
        if (!C0d4.A06 || !DexStoreUtils.MAIN_DEX_STORE_ID.equals(this.id) || OreoFileUtils.alreadyUnpackedForCloudPgo(odexSchemeOreo.mZipFile)) {
            return false;
        }
        ?? obj = new Object();
        ((0dF) obj).A00 = context;
        boolean z = true;
        if (C0k2.A00(obj, Experiments.HENOSIS_IN_CLOUD_PGO_QE, 0) != 1) {
            z = false;
        }
        return z;
    }

    private void touchRegenStamp() {
        File regenFile = getRegenFile();
        regenFile.createNewFile();
        if (!regenFile.setLastModified(sDexStoreClock.now())) {
            throw AnonymousClass001.A0G(AnonymousClass001.A0Z(regenFile, "could not set modtime of ", AnonymousClass001.A0k()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeTxFailedStatusLocked(long j) {
        writeStatusLocked((j << 4) | 1);
    }

    public void addChild(DexStore dexStore) {
        if (this.mChildStores.contains(dexStore)) {
            return;
        }
        this.mChildStores.add(dexStore);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (attemptedOptimizationSinceRegeneration() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r302.isDefault() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean atomicReplaceConfig(com.facebook.common.dextricks.DexStore.Config r302) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.atomicReplaceConfig(com.facebook.common.dextricks.DexStore$Config):boolean");
    }

    public boolean attemptedOptimizationSinceRegeneration() {
        return AnonymousClass001.A1S(this.root, OPTIMIZATION_LOG_FILENAME);
    }

    public String findDexHashForCanaryClass(String str) {
        DexManifest dexManifest = this.mLoadedManifest;
        String str2 = null;
        if (dexManifest != null) {
            DexManifest.Dex[] dexArr = dexManifest.dexes;
            int length = dexArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                DexManifest.Dex dex = dexArr[i2];
                if (dex.canaryClass.equals(str)) {
                    str2 = dex.hash;
                    break;
                }
                i = i2 + 1;
            }
        }
        return str2;
    }

    public File findOatFileForCanaryClass(File file, String str) {
        return getOatFileFromDexHash(file, findDexHashForCanaryClass(str));
    }

    public void forceRegenerateOnNextLoad() {
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            writeStatusLocked(6);
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public List getAllOatFiles(File file) {
        DexManifest.Dex[] dexArr = this.mLoadedManifest.dexes;
        int length = dexArr.length;
        ArrayList A0t = AnonymousClass001.A0t(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0t;
            }
            File oatFileFromDexHash = getOatFileFromDexHash(file, dexArr[i2].hash);
            if (oatFileFromDexHash != null && oatFileFromDexHash.exists()) {
                A0t.add(oatFileFromDexHash);
            }
            i = i2 + 1;
        }
    }

    public OptimizationLog getAndClearCompletedOptimizationLog() {
        File A0D = AnonymousClass001.A0D(this.root, OPTIMIZATION_LOG_FILENAME);
        if (!A0D.exists()) {
            return null;
        }
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            OptimizationLog readOrMakeDefault = OptimizationLog.readOrMakeDefault(A0D);
            if ((readOrMakeDefault.flags & 1) == 0) {
                if (acquire == null) {
                    return null;
                }
                acquire.close();
                return null;
            }
            A0D.delete();
            if (acquire != null) {
                acquire.close();
            }
            return readOrMakeDefault;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public long getApkLastModified() {
        return this.mApk.lastModified();
    }

    public File[] getDependencyOdexFiles() {
        ArrayList A0s = AnonymousClass001.A0s();
        File file = this.mApk;
        A0s.add(file);
        A0s.add(determineOdexCacheName(file));
        DexStore[] parents = getParents();
        int length = parents.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                File[] fileArr = new File[A0s.size()];
                A0s.toArray(fileArr);
                return fileArr;
            }
            File[] dependencyOdexFiles = parents[i2].getDependencyOdexFiles();
            int length2 = dependencyOdexFiles.length;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < length2) {
                    A0s.add(dependencyOdexFiles[i4]);
                    i3 = i4 + 1;
                }
            }
            i = i2 + 1;
        }
    }

    public Map getDiagnostics(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long reportStatus = reportStatus();
        OptimizationHistoryLog currentOptHistoryLogFromRoot = getCurrentOptHistoryLogFromRoot(context, this.root);
        Config readConfig = readConfig();
        OdexScheme schemeForState = schemeForState(context, loadManifest(), reportStatus);
        linkedHashMap.put("loadNotOptimized", Boolean.toString(schemeForState.loadNotOptimized(reportStatus)));
        linkedHashMap.put("needOptimization", schemeForState.needOptimization(reportStatus, readConfig, currentOptHistoryLogFromRoot).name());
        linkedHashMap.put("scheme", getStatusDescription(reportStatus));
        linkedHashMap.put("status", Long.toHexString(reportStatus));
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            long now = sDexStoreClock.now();
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(this.root);
            if (readOrMakeDefaultFromRoot.isNotDefault) {
                linkedHashMap.put("optlog.flags", Integer.toString(readOrMakeDefaultFromRoot.flags));
                linkedHashMap.put("optlog.nrOptimizationsAttempted", Integer.toString(readOrMakeDefaultFromRoot.nrOptimizationsAttempted));
                linkedHashMap.put("optlog.nrOptimizationsFailed", Integer.toString(readOrMakeDefaultFromRoot.nrOptimizationsFailed));
                linkedHashMap.put("optlog.lastFailureExceptionJson", readOrMakeDefaultFromRoot.lastFailureExceptionJson);
            }
            linkedHashMap.put("config.enablePgoCompile", Boolean.toString(readConfig.tryPeriodicPgoCompilation));
            if (readConfig.tryPeriodicPgoCompilation) {
                linkedHashMap.put("config.minPgoDuration", Long.toString(readConfig.minTimeBetweenPgoCompilationMs));
                linkedHashMap.put("config.timeleft", (currentOptHistoryLogFromRoot == null || !AnonymousClass001.A1T(currentOptHistoryLogFromRoot.file)) ? "<no info>" : printRelativeTime(now, currentOptHistoryLogFromRoot.lastSuccessfulOptimizationTimestampMs + readConfig.minTimeBetweenPgoCompilationMs));
            }
            if (currentOptHistoryLogFromRoot != null && AnonymousClass001.A1T(currentOptHistoryLogFromRoot.file)) {
                linkedHashMap.put("opthistlog.lastSuccess", Boolean.toString(currentOptHistoryLogFromRoot.lastCompilationSessionWasASuccess()));
                linkedHashMap.put("opthistlog.lastCompilationTimestamp", printRelativeTime(now, currentOptHistoryLogFromRoot.lastSuccessfulOptimizationTimestampMs));
            }
            if (acquire != null) {
                acquire.close();
            }
            return linkedHashMap;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public List getLoadedDexFiles() {
        return this.mLoadedDexFiles;
    }

    public DexManifest getLoadedManifest() {
        return this.mLoadedManifest;
    }

    public String getMegaZipPath() {
        return this.mMegaZipPath;
    }

    public long getNextRecommendedOptimizationAttemptTime(OptimizationConfiguration optimizationConfiguration) {
        long lastModified = AnonymousClass001.A0D(this.root, OPTIMIZATION_LOG_FILENAME).lastModified();
        if (lastModified > sDexStoreClock.now()) {
            Mlog.w("ignoring optimization log file from the future", AnonymousClass001.A1Z());
        } else if (lastModified > 0) {
            return optimizationConfiguration.timeBetweenOptimizationAttemptsMs + lastModified;
        }
        return 0L;
    }

    public String getOdexCachePath() {
        if (determineOdexCacheName(this.mApk) != null) {
            return determineOdexCacheName(this.mApk).getAbsolutePath();
        }
        return null;
    }

    public String[] getParentNames() {
        return loadManifest().requires;
    }

    public File getRegenFile() {
        return AnonymousClass001.A0D(this.root, REGEN_STAMP_FILENAME);
    }

    public ResProvider getResProvider() {
        return this.mResProvider;
    }

    public boolean hasChildren() {
        return this.mChildStores.isEmpty();
    }

    public boolean isArtMainStore() {
        return this.mIsArtMainStore;
    }

    public boolean isLoaded() {
        boolean A1T;
        synchronized (this) {
            A1T = AnonymousClass001.A1T(this.mLoadedManifest);
        }
        return A1T;
    }

    public boolean isReoptimization(Context context) {
        boolean z = false;
        try {
            OptimizationHistoryLog currentOptHistoryLogFromRoot = getCurrentOptHistoryLogFromRoot(context, this.root);
            if (readConfig().tryPeriodicPgoCompilation) {
                if (currentOptHistoryLogFromRoot.lastCompilationSessionWasASuccess()) {
                    z = true;
                }
            }
            return z;
        } catch (IOException e) {
            Mlog.e(e, "failed to check if reoptimization. Failing back to not a reoptimization.", new Object[0]);
            return false;
        }
    }

    public DexErrorRecoveryInfo loadAll(int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) {
        DexErrorRecoveryInfo loadAllImpl;
        int i2;
        synchronized (this) {
            0Z9.A01(0Pz.A0j("DexStore.loadAll[", getIdForTracing(this.root), "]"), -1978926528);
            try {
                try {
                    loadAllImpl = loadAllImpl(i, lightweightQuickPerformanceLogger, context);
                    i2 = 1014126979;
                } catch (RecoverableDexException e) {
                    try {
                        loadAllImpl = loadAllImpl(i | 2, lightweightQuickPerformanceLogger, context);
                        loadAllImpl.regenRetryCause = e;
                        i2 = -1618922394;
                    } catch (RecoverableDexException e2) {
                        throw AnonymousClass001.A0J(e2);
                    }
                }
                0Z9.A00(i2);
                loadAllImpl.loadAllTime = sDexStoreClock.now();
            } catch (Throwable th) {
                0Z9.A00(1430984941);
                throw th;
            }
        }
        return loadAllImpl;
    }

    public DexManifest loadManifest() {
        DexManifest loadManifestFrom;
        0Z9.A01("DexStore.loadManifest", -1473556854);
        if (this.mManifest == null) {
            synchronized (this) {
                if (this.mManifest == null) {
                    if (this.mIsArtMainStore) {
                        new DexManifest();
                    } else {
                        loadManifestFrom = DexManifest.loadManifestFrom(this.mResProvider, DexStoreUtils.SECONDARY_DEX_MANIFEST, true);
                    }
                    this.id = loadManifestFrom.id;
                    this.mManifest = loadManifestFrom;
                }
            }
        }
        0Z9.A00(-235082202);
        return this.mManifest;
    }

    public TmpDir makeTemporaryDirectory(String str) {
        File file;
        File file2;
        ReentrantLockFile reentrantLockFile;
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            file = File.createTempFile(str, TMPDIR_LOCK_SUFFIX, this.root);
            try {
                file2 = 0Pz.A02(Fs.stripLastExtension(file.getName()), TMPDIR_SUFFIX, this.root);
                Fs.mkdirOrThrow(file2);
                try {
                    reentrantLockFile = ReentrantLockFile.open(file);
                } catch (Throwable th) {
                    th = th;
                    reentrantLockFile = null;
                }
            } catch (Throwable th2) {
                th = th2;
                file2 = null;
                reentrantLockFile = null;
                try {
                    Fs.safeClose((Closeable) null);
                    Fs.safeClose(reentrantLockFile);
                    Fs.deleteRecursiveNoThrow(file);
                    Fs.deleteRecursiveNoThrow(file2);
                    throw th;
                } catch (Throwable th3) {
                    if (acquire != null) {
                        try {
                            acquire.close();
                            throw th3;
                        } catch (Throwable th4) {
                            0Ug.A00(th3, th4);
                            throw th3;
                        }
                    }
                    throw th3;
                }
            }
            try {
                ReentrantLockFile.Lock tryAcquire = reentrantLockFile.tryAcquire(1);
                if (tryAcquire == null) {
                    throw AnonymousClass001.A0T("should have been able to acquire tmpdir lock");
                }
                TmpDir tmpDir = new TmpDir(tryAcquire, file2);
                Mlog.v("created tmpdir %s (lock file %s)", tmpDir.directory, reentrantLockFile.lockFileName);
                if (acquire != null) {
                    acquire.close();
                }
                return tmpDir;
            } catch (Throwable th5) {
                th = th5;
                Fs.safeClose((Closeable) null);
                Fs.safeClose(reentrantLockFile);
                Fs.deleteRecursiveNoThrow(file);
                Fs.deleteRecursiveNoThrow(file2);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            file = null;
            file2 = null;
        }
    }

    public void markArtMainStore(Context context) {
        if (C0k1.A03(context, Experiments.SKIP_MANIFEST)) {
            Mlog.w("Marking ArtMainStore true!", AnonymousClass001.A1Z());
            this.mIsArtMainStore = true;
        }
    }

    public void optimize(Context context, OptimizationConfiguration.Provider provider) {
        Throwable th;
        DexManifest dexManifest = this.mLoadedManifest;
        if (dexManifest == null) {
            dexManifest = loadManifest();
        }
        Mlog.v("[opt] loaded manifets", new Object[0]);
        ReentrantLockFile.Lock acquireInterruptubly = this.mLockFile.acquireInterruptubly(0);
        Mlog.v("[opt] locked dex store %s", this.root);
        try {
            try {
                try {
                    OdexScheme schemeForState = schemeForState(context, dexManifest, readStatusLocked());
                    Mlog.v("[opt] found scheme %s", schemeForState);
                    if (checkDeps()) {
                        OptimizationSession optimizationSession = new OptimizationSession(context, provider, false);
                        try {
                            AnonymousClass001.A1C("[opt] opened optimization session");
                            acquireInterruptubly.close();
                            try {
                                schemeForState.optimize(context, this, optimizationSession);
                                optimizationSession.noteOptimizationSuccess();
                                AnonymousClass001.A1C("[opt] finished optimization session");
                                optimizationSession.close();
                                return;
                            } catch (Throwable th2) {
                                optimizationSession.copeWithOptimizationFailure(th2);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                optimizationSession.close();
                            } catch (Throwable th4) {
                                0Ug.A00(th, th4);
                            }
                        }
                    } else {
                        new InterruptedException("attempt to optimize stale repository");
                    }
                    throw th;
                } catch (InterruptedException e) {
                    throw e;
                }
            } catch (Throwable th5) {
                Mlog.w("[opt] optimization failed!", th5);
                throw th5;
            }
        } catch (Throwable th6) {
            if (acquireInterruptubly != null) {
                acquireInterruptubly.close();
            }
            throw th6;
        }
    }

    public Config readConfig() {
        Config build;
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            File A0D = AnonymousClass001.A0D(this.root, CONFIG_FILENAME);
            try {
                try {
                    build = Config.read(A0D);
                } catch (FileNotFoundException unused) {
                    build = new Config.Builder().build();
                } catch (Exception e) {
                    Mlog.w(e, "error reading dex store config file %s: deleting and proceeding", new Object[0]);
                    Fs.deleteRecursive(A0D);
                    build = new Config.Builder().build();
                }
            } catch (UnsupportedOperationException unused2) {
                Mlog.i("unsupported dex store config file %s: ignoring and deleting", new Object[0]);
                Fs.deleteRecursive(A0D);
                build = new Config.Builder().build();
            }
            if (acquire != null) {
                acquire.close();
            }
            return build;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public long reportStatus() {
        Mlog.v("DexStore::reportStatus()", new Object[0]);
        long j = 0;
        try {
            ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
            try {
                j = readStatusLocked();
                if (acquire != null) {
                    acquire.close();
                    return j;
                }
            } finally {
            }
        } catch (Throwable th) {
            Mlog.v("DexStore::reportStatus caught Throwable ", th);
        }
        return j;
    }

    public void setResProvider(ResProvider resProvider) {
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
    }

    public boolean useBgDexOpt() {
        return this.mUseBgDexOpt;
    }

    public boolean useEagerDexOpt() {
        return this.mUseEagerDexOpt;
    }

    public void writeStatusLocked(long j) {
        assertLockHeld();
        if (((byte) (15 & j)) != 1) {
            DalvikInternals.fsyncNamed(this.root.getAbsolutePath(), -1);
        }
        File file = new File(this.root, MDEX_STATUS_FILENAME);
        long j2 = MDEX_STATUS_XOR ^ j;
        Mlog.v("writing status:%x check:%x str:%s", Long.valueOf(j), Long.valueOf(j2), getStatusDescription(j));
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(j);
        wrap.putLong(j2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr, 0, 16);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }
}
