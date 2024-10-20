package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.AnonymousClass001;
import X.C0bs;
import X.C0bu;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.facebook.common.dextricks.DexStore;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: DexLibLoader.class */
public final class DexLibLoader {
    public static final int LOAD_ALL_ASYNC_OPTIMIZATION = 4;
    public static final int LOAD_ALL_BETA_BUILD = 1;
    public static final int LOAD_ALL_INSTRUMENTATION_TEST = 16;
    public static final int LOAD_ALL_OPEN_ONLY = 2;
    public static final int LOAD_SECONDARY = 8;
    public static DexStore sMainDexStore;

    /* loaded from: DexLibLoader$ApkResProvider.class */
    public final class ApkResProvider extends ResProvider {
        public static final String SECONDARY_PROGRAM_DEX_JARS = "secondary-program-dex-jars";
        public ZipFile mApkZip;
        public final Context mContext;

        public ApkResProvider(Context context) {
            this.mContext = context;
        }

        @Override // com.facebook.common.dextricks.ResProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Fs.safeClose(this.mApkZip);
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public void markRootRelative() {
            if (this.mApkZip == null) {
                this.mApkZip = new ZipFile(C0bu.A00(this.mContext).getApplicationInfo().sourceDir);
            }
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public InputStream open(String str) {
            ZipFile zipFile = this.mApkZip;
            if (zipFile == null || DexStoreUtils.SECONDARY_DEX_MANIFEST.equals(str)) {
                return this.mContext.getAssets().open(0Pz.A0W("secondary-program-dex-jars/", str));
            }
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return this.mApkZip.getInputStream(entry);
            }
            throw new FileNotFoundException(0Pz.A0W("cannot find root-relative resource: ", str));
        }
    }

    /* loaded from: DexLibLoader$CanaryLoaderImpl.class */
    public class CanaryLoaderImpl implements Runnable {
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, com.facebook.common.dextricks.DexManifest] */
        @Override // java.lang.Runnable
        public void run() {
            DexStore dexStoreListHead = DexStore.dexStoreListHead();
            while (true) {
                DexStore dexStore = dexStoreListHead;
                if (dexStore == null) {
                    return;
                }
                ?? r0 = dexStore.mLoadedManifest;
                if (r0 != 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < r0.dexes.length) {
                            Class.forName(r0.dexes[i2].canaryClass);
                            i = i2 + 1;
                        }
                    }
                }
                dexStoreListHead = dexStore.next;
            }
        }
    }

    /* loaded from: DexLibLoader$ExoPackageResProvider.class */
    public final class ExoPackageResProvider extends ResProvider {
        public static final String EXOPACKAGE_DIR = "/data/local/tmp/exopackage";
        public final File mDirectory;

        public ExoPackageResProvider(Context context) {
            this.mDirectory = AnonymousClass001.A0E(0Pz.A0j("/data/local/tmp/exopackage/", context.getPackageName(), "/secondary-dex"));
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public InputStream open(String str) {
            return AnonymousClass001.A0F(AnonymousClass001.A0D(this.mDirectory, str));
        }
    }

    /* loaded from: DexLibLoader$ResProviderShim.class */
    public interface ResProviderShim {
        ResProvider install(ResProvider resProvider);
    }

    public static void ensureConfig(Context context, DexStore.Config config, boolean z) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            File A0D = AnonymousClass001.A0D(mainDexStoreLocation, DexStore.CONFIG_FILENAME);
            if (!A0D.exists() || z) {
                config.writeAndSync(A0D);
            }
        }
    }

    public static DexStore getMainDexStore() {
        DexStore dexStore;
        synchronized (DexLibLoader.class) {
            dexStore = sMainDexStore;
        }
        return dexStore;
    }

    public static DexErrorRecoveryInfo getMainDexStoreLoadInformation() {
        return DexErrorRecoveryInfo.getMainDexStoreLoadInformation();
    }

    public static void handleUnoptimizedCodeForPerftest(Context context) {
        if (EndToEnd.A03()) {
            throw AnonymousClass001.A0N(0Pz.A0W("In ct-scan mode, but not running optimized code. Out of disk space? Bad config? Load result: 0x", Integer.toHexString(DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult)));
        }
    }

    public static int loadAll(Context context) {
        return loadAll(context, 1, (LightweightQuickPerformanceLogger) null);
    }

    public static int loadAll(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int loadAll;
        synchronized (DexLibLoader.class) {
            loadAll = loadAll(context, i, lightweightQuickPerformanceLogger, null, null);
        }
        return loadAll;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.lang.Runnable] */
    public static int loadAll(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProviderShim resProviderShim, DexStore.Config config) {
        Throwable A0J;
        int loadAllImpl;
        synchronized (DexLibLoader.class) {
            if (DexErrorRecoveryInfo.getMainDexStoreLoadInformationNoThrow() == null) {
                try {
                    loadAllImpl = loadAllImpl(context, i, lightweightQuickPerformanceLogger, resProviderShim, config);
                    CanaryLoader.setInstance(new Object());
                    if (DexErrorRecoveryInfo.sDeoptTaint) {
                        handleUnoptimizedCodeForPerftest(context);
                    }
                } catch (IOException e) {
                    A0J = AnonymousClass001.A0U(e);
                }
            } else {
                A0J = AnonymousClass001.A0J("loadAll already loaded dex files");
            }
            throw A0J;
        }
        return loadAllImpl;
    }

    public static int loadAll(Context context, boolean z) {
        return loadAll(context, 1, (LightweightQuickPerformanceLogger) null);
    }

    public static int loadAll(Context context, boolean z, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return loadAll(context, 1, lightweightQuickPerformanceLogger);
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, com.facebook.common.dextricks.DexErrorRecoveryInfo] */
    public static int loadAllImpl(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProviderShim resProviderShim, DexStore.Config config) {
        IllegalArgumentException th;
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        int i2 = i & 1;
        boolean A1N = AnonymousClass001.A1N(i2);
        Mlog.v("DLL.loadAll betaBuild:%s flags:0x%08x", AnonymousClass001.A1b(Boolean.valueOf(A1N), i));
        if ((i & 16) != 0) {
            Mlog.v("DLL.loadAll instrumentation test mode", new Object[0]);
            setupMainDexStoreConfigForInstrumentationTests(context, config);
        } else if (config != null) {
            th = AnonymousClass001.A0L("Do not specify a config outside of test mode.");
            throw th;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Context A00 = C0bu.A00(context);
        try {
            C0bu.A01(A00.getApplicationInfo(), DexLibLoader.class.getClassLoader(), A0s, A0s2);
        } catch (C0bs e) {
            Mlog.w(e, "failure to locate primary/auxiliary dexes: perf loss", new Object[0]);
            A0s.clear();
            A0s2.clear();
        }
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        File A0B = AnonymousClass001.A0B(A00);
        if (!A0B.exists()) {
            if (A0s.isEmpty()) {
                throw AnonymousClass001.A0T("Cannot determine base.apk");
            }
            A0B = AnonymousClass001.A0E(((DexFile) A0s.get(0)).getName());
            Mlog.w("Main store will use %s as apk file.", A0B.getPath());
        }
        ResProvider obtainResProvider = obtainResProvider(context, resProviderShim, A1N);
        try {
            if (obtainResProvider == null) {
                AnonymousClass001.A1C("Nothing to do in DexLibLoader.loadAll: no resProvider");
                DexErrorRecoveryInfo.setMainDexStoreLoadInformation(new Object());
                return 0;
            }
            Mlog.v("opening dex store %s", mainDexStoreLocation);
            DexStore open = DexStore.open(mainDexStoreLocation, A0B, obtainResProvider, A0s, A0s2);
            sMainDexStore = open;
            if (Build.VERSION.SDK_INT >= 30) {
                open.markArtMainStore(context);
            }
            if ((i & 2) == 0) {
                int i3 = AnonymousClass001.A1N(i2) ? 1 : 0;
                if ((i & 8) != 0) {
                    i3 |= 16;
                }
                if ((i & 4) != 0) {
                    i3 |= 4;
                }
                EndToEnd.A03();
                AnonymousClass001.A1B("disabling background optimization");
                dexErrorRecoveryInfo = open.loadAll((i3 & (-5)) | 1 | 8, lightweightQuickPerformanceLogger, context);
                if ((dexErrorRecoveryInfo.loadResult & 8) != 0) {
                    AnonymousClass001.A1C("running deoptimized code");
                    DexErrorRecoveryInfo.sDeoptTaint = true;
                }
                dexErrorRecoveryInfo.storeRegenFilename = open.getRegenFile().getAbsolutePath();
            } else {
                AnonymousClass001.A1C("skipping actual loadAll as requested");
                dexErrorRecoveryInfo = null;
            }
            DexErrorRecoveryInfo.setMainDexStoreLoadInformation(dexErrorRecoveryInfo);
            obtainResProvider.close();
            return 0;
        } catch (Throwable th2) {
            th = th2;
            if (obtainResProvider != null) {
                try {
                    obtainResProvider.close();
                    throw th;
                } catch (Throwable th3) {
                    0Ug.A00(th, th3);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.common.dextricks.ResProvider] */
    public static ResProvider obtainResProvider(Context context, ResProviderShim resProviderShim, boolean z) {
        ?? r0 = context;
        try {
            ResProvider obtainResProviderInternal = obtainResProviderInternal(r0, z);
            if (resProviderShim != null) {
                r0 = resProviderShim.install(obtainResProviderInternal);
                obtainResProviderInternal = r0;
            }
            return obtainResProviderInternal;
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public static ResProvider obtainResProvider(Context context, boolean z) {
        return obtainResProvider(context, null, z);
    }

    public static ResProvider obtainResProviderInternal(Context context, boolean z) {
        ApkResProvider apkResProvider = new ApkResProvider(context);
        try {
            apkResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
            return apkResProvider;
        } catch (Resources.NotFoundException | FileNotFoundException unused) {
            if (!z) {
                return null;
            }
            ExoPackageResProvider exoPackageResProvider = new ExoPackageResProvider(context);
            try {
                exoPackageResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
                Mlog.i("using exopackage", new Object[0]);
                return exoPackageResProvider;
            } catch (FileNotFoundException e) {
                Mlog.v(e, "using exo res provider failed", new Object[0]);
                return null;
            }
        }
    }

    public static void setupMainDexStoreConfigForInstrumentationTests(Context context, DexStore.Config config) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        Fs.deleteRecursive(mainDexStoreLocation);
        Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            config.writeAndSync(AnonymousClass001.A0D(mainDexStoreLocation, DexStore.CONFIG_FILENAME));
        }
    }

    public static boolean shouldSynchronouslyGenerateOatFiles() {
        EndToEnd.A03();
        return true;
    }

    public static boolean wasMainDexStoreRegenerated() {
        boolean z = true;
        if ((DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult & 1) == 0) {
            z = false;
        }
        return z;
    }
}
