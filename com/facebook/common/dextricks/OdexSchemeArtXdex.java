package com.facebook.common.dextricks;

import X.0GT;
import X.0Pz;
import X.0Ug;
import X.0Zd;
import X.0cV;
import X.AnonymousClass001;
import X.C0d4;
import X.C0il;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.facebook.common.dextricks.Dex2oatLogcatParser;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.DexUnpacker;
import com.facebook.common.dextricks.ExpectedFileInfo;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.Prio;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: OdexSchemeArtXdex.class */
public final class OdexSchemeArtXdex extends OdexSchemeArtTurbo {
    public static final boolean APPLY_MIRANDA_HACK = true;
    public static final String DEX_MANIFEST_RESOURCE_PATH = "dex_manifest.txt";
    public static final String ENV_LD_PRELOAD = "LD_PRELOAD";
    public static final long MIN_DISK_FREE_FOR_MIXED_MODE = 419430400;
    public static final String MISSING_PGO_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_MissingPGO";
    public static final String MIXED_MODE_DATA_RESOURCE_PATH = "mixed_mode.txt";
    public static final String REGENERATE_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_REGEN";
    public static final long STATE_DEX2OAT_CLASSPATH_SET = 2048;
    public static final long STATE_DEX2OAT_QUICKENING_NEEDED = 64;
    public static final long STATE_DEX2OAT_QUICK_ATTEMPTED = 512;
    public static final long STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED = 32768;
    public static final long STATE_DO_PERIODIC_PGO_COMP_FINISHED = 65536;
    public static final long STATE_DO_PERIODIC_PGO_COMP_NEEDED = 16384;
    public static final long STATE_MASK = 20720;
    public static final long STATE_MIXED_ATTEMPTED = 1024;
    public static final long STATE_MIXED_NEEDED = 128;
    public static final long STATE_OATMEAL_QUICKENING_NEEDED = 32;
    public static final long STATE_OATMEAL_QUICK_ATTEMPTED = 256;
    public static final long STATE_OPT_COMPLETED = 16;
    public static final long STATE_PGO_ATTEMPTED = 8192;
    public static final long STATE_PGO_NEEDED = 4096;
    public static final String TMP_DEX_MANIFEST_FILE = "art_dex_manifest";
    public static final String TMP_MIXED_MODE_DATA_FILE = "art_mixed_mode_data_input";
    public final DexUnpacker mDexUnpacker;
    public final DexManifest.Dex[] mDexes;
    public final boolean mIsLoadable;
    public final C0d4 mPGOProfileUtil;
    public final ResProvider mResProvider;

    /* loaded from: OdexSchemeArtXdex$CriticalCannotTruncateDexesSection.class */
    public class CriticalCannotTruncateDexesSection implements Closeable {
        public final boolean mHasMarked;
        public final File mRoot;

        public CriticalCannotTruncateDexesSection(OdexSchemeArtXdex odexSchemeArtXdex, File file) {
            this(file, true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
        
            if (com.facebook.common.dextricks.OdexSchemeArtXdex.markCannotTruncateDexesFlag(r303) == false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public CriticalCannotTruncateDexesSection(java.io.File r303, boolean r304) {
            /*
                r301 = this;
                r0 = r301
                r1 = r302
                com.facebook.common.dextricks.OdexSchemeArtXdex.this = r1
                r0 = r301
                r0.<init>()
                r0 = r301
                r1 = r303
                r0.mRoot = r1
                r0 = r304
                if (r0 == 0) goto L20
                r0 = r303
                boolean r0 = com.facebook.common.dextricks.OdexSchemeArtXdex.markCannotTruncateDexesFlag(r0)
                r305 = r0
                r0 = 1
                r306 = r0
                r0 = r305
                if (r0 != 0) goto L23
            L20:
                r0 = 0
                r306 = r0
            L23:
                r0 = r301
                r1 = r306
                r0.mHasMarked = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.CriticalCannotTruncateDexesSection.<init>(com.facebook.common.dextricks.OdexSchemeArtXdex, java.io.File, boolean):void");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.mHasMarked) {
                OdexSchemeArtXdex.clearCannotTruncateDexesFlag(this.mRoot);
            }
        }
    }

    /* loaded from: OdexSchemeArtXdex$Dex2OatHookInfo.class */
    public final class Dex2OatHookInfo {
        public final String envFlag;
        public final String libName;

        public Dex2OatHookInfo(String str, String str2) {
            this.libName = str;
            this.envFlag = str2;
        }
    }

    /* loaded from: OdexSchemeArtXdex$Dex2OatProgressListener.class */
    public class Dex2OatProgressListener implements DexStore.ExternalProcessProgressListener {
        public static final long CHECKPOINT_PERIOD = TimeUnit.MINUTES.toMillis(5);
        public static final String EVENT_NAME = "OptsvcEvent";
        public final Context mAppContext;
        public final int mAttemptNumber;
        public Integer mExitStatus;
        public final String mJobName;
        public long mLastCheckpointMs;
        public final long mStartTimeMs;

        public Dex2OatProgressListener(Context context, String str, int i) {
            Context applicationContext = context.getApplicationContext();
            this.mAppContext = applicationContext != null ? applicationContext : context;
            this.mJobName = str;
            this.mAttemptNumber = i;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.mStartTimeMs = uptimeMillis;
            this.mLastCheckpointMs = uptimeMillis;
        }

        private void addDex2OatStatToEventMap(Map map, String str, String str2, Object obj) {
            String makeKeyNameFromDex2OatStatInfo = makeKeyNameFromDex2OatStatInfo(str, str2);
            Mlog.d("Adding dex2oat stat key %s with %s", makeKeyNameFromDex2OatStatInfo, obj);
            map.put(makeKeyNameFromDex2OatStatInfo, obj);
        }

        private void convertDex2OatStatInfoToEventMap(Map map, Dex2oatLogcatParser.Dex2OatStatInfo dex2OatStatInfo) {
            String replace = dex2OatStatInfo.statType.replace(' ', '_');
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_TOTAL_CASES, Integer.valueOf(dex2OatStatInfo.totalCases));
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, Integer.valueOf(dex2OatStatInfo.success));
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, Integer.valueOf(dex2OatStatInfo.failure));
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_PERCENT, Double.valueOf(dex2OatStatInfo.percent));
        }

        private String makeKeyNameFromDex2OatStatInfo(String str, String str2) {
            return 0Pz.A0v("dex2oat_stat_", str, "_", str2);
        }

        private String normalizeDex2OatStatType(String str) {
            return str.replace(' ', '_');
        }

        public void logEvent(String str, Dex2oatLogcatParser dex2oatLogcatParser) {
            if (this.mExitStatus == null) {
                Mlog.w("Bad call to logEvent, exit status not set", AnonymousClass001.A1Z());
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.mStartTimeMs;
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, this.mJobName);
            A0u.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "finish");
            A0u.put("duration", Long.valueOf(uptimeMillis));
            A0u.put(OptSvcAnalyticsStore.LOGGING_KEY_EXIT_CODE, this.mExitStatus);
            if (!TextUtils.isEmpty(str)) {
                A0u.put(OptSvcAnalyticsStore.LOGGING_KEY_DETAIL_MSG, str);
            }
            A0u.put(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(this.mAttemptNumber));
            Iterator it = (dex2oatLogcatParser != null ? dex2oatLogcatParser.mDex2OatStatInfos : Collections.emptySet()).iterator();
            while (it.hasNext()) {
                convertDex2OatStatInfoToEventMap(A0u, (Dex2oatLogcatParser.Dex2OatStatInfo) it.next());
            }
            OptSvcAnalyticsStore.logEvent(this.mAppContext, EVENT_NAME, A0u);
        }

        @Override // com.facebook.common.dextricks.DexStore.ExternalProcessProgressListener
        public void onCheckpoint() {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.mLastCheckpointMs >= CHECKPOINT_PERIOD) {
                this.mLastCheckpointMs = uptimeMillis;
                long j = uptimeMillis - this.mStartTimeMs;
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, this.mJobName);
                A0u.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "checkpoint");
                A0u.put("duration", Long.valueOf(j));
                A0u.put(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(this.mAttemptNumber));
                OptSvcAnalyticsStore.logEvent(this.mAppContext, EVENT_NAME, A0u);
            }
        }

        @Override // com.facebook.common.dextricks.DexStore.ExternalProcessProgressListener
        public void onComplete(int i) {
            this.mExitStatus = Integer.valueOf(i);
        }
    }

    /* loaded from: OdexSchemeArtXdex$DexSelector.class */
    public interface DexSelector {
        boolean select(DexManifest.Dex dex);
    }

    /* loaded from: OdexSchemeArtXdex$ManifestEntry.class */
    public class ManifestEntry {
        public final boolean background;
        public final String canary;
        public final boolean coldstart;
        public final boolean extended;
        public final int ordinal;
        public final boolean primary;
        public final boolean scroll;

        public ManifestEntry(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.canary = str;
            this.ordinal = i;
            this.primary = z;
            this.coldstart = z2;
            this.extended = z3;
            this.scroll = z4;
            this.background = z5;
        }

        public static ManifestEntry fromCSV(String str) {
            String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            int length = split.length;
            ManifestEntry manifestEntry = null;
            if (length >= 1) {
                String convertClassToDotForm = OdexSchemeArtXdex.convertClassToDotForm(split[0]);
                int i = 1;
                int i2 = -1;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    if (i >= length) {
                        manifestEntry = new ManifestEntry(convertClassToDotForm, i2, z, z2, z3, z4, z5);
                        break;
                    }
                    String[] split2 = split[i].split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                    if (split2.length != 2) {
                        break;
                    }
                    if (split2[0].equals("primary")) {
                        z = AnonymousClass001.A1Q(Integer.valueOf(split2[1]).intValue(), 1);
                    } else if (split2[0].equals("extended")) {
                        z3 = AnonymousClass001.A1Q(Integer.valueOf(split2[1]).intValue(), 1);
                    } else if (split2[0].equals("scroll")) {
                        z4 = AnonymousClass001.A1Q(Integer.valueOf(split2[1]).intValue(), 1);
                    } else if (split2[0].equals("coldstart")) {
                        z2 = AnonymousClass001.A1Q(Integer.valueOf(split2[1]).intValue(), 1);
                    } else if (split2[0].equals("background")) {
                        z5 = AnonymousClass001.A1Q(Integer.valueOf(split2[1]).intValue(), 1);
                    } else if (split2[0].equals("ordinal")) {
                        i2 = Integer.valueOf(split2[1]).intValue();
                    }
                    i++;
                }
            }
            return manifestEntry;
        }
    }

    /* loaded from: OdexSchemeArtXdex$Renamer.class */
    public class Renamer {
        public final DexStore.TmpDir mTmpDir;
        public ArrayList mSourceFiles = AnonymousClass001.A0s();
        public ArrayList mDestFiles = AnonymousClass001.A0s();

        public Renamer(DexStore.TmpDir tmpDir) {
            this.mTmpDir = tmpDir;
        }

        public void addFile(File file, File file2) {
            Mlog.i("Queueing Rename of src %s to dest %s", file.getAbsolutePath(), file2.getAbsolutePath());
            this.mSourceFiles.add(file);
            this.mDestFiles.add(file2);
        }

        public void renameOrThrow() {
            int i = 0;
            while (true) {
                int i2 = i;
                ArrayList arrayList = this.mSourceFiles;
                if (i2 >= arrayList.size()) {
                    return;
                }
                File file = (File) arrayList.get(i2);
                File file2 = (File) this.mDestFiles.get(i2);
                Mlog.d("Renaming %s to %s", file, file2);
                Fs.renameOrThrow(file, file2);
                i = i2 + 1;
            }
        }

        public void reset() {
            Mlog.i("Resetting Renamer", AnonymousClass001.A1Z());
            this.mSourceFiles.clear();
            this.mDestFiles.clear();
        }
    }

    public OdexSchemeArtXdex(Context context, DexManifest.Dex[] dexArr, ResProvider resProvider, long j) {
        super(1, OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j)));
        this.mDexes = dexArr;
        this.mResProvider = resProvider;
        this.mIsLoadable = AnonymousClass001.A1N(((j & STATE_MASK) > 0L ? 1 : ((j & STATE_MASK) == 0L ? 0 : -1)));
        this.mPGOProfileUtil = C0d4.A00(context);
        this.mDexUnpacker = new DexUnpacker(context, resProvider);
    }

    public static /* synthetic */ Context access$100(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static void addOldPgoDex2OatParams(ProcessBuilder processBuilder) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301.tryPeriodicPgoCompilation != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean anyCompilationNeeded(com.facebook.common.dextricks.DexStore.Config r301) {
        /*
            r0 = r301
            boolean r0 = r0.enableMixedMode
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1d
            r0 = r301
            boolean r0 = r0.enableMixedModePgo
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1d
            r0 = r301
            boolean r0 = r0.tryPeriodicPgoCompilation
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1f
        L1d:
            r0 = 1
            r302 = r0
        L1f:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.anyCompilationNeeded(com.facebook.common.dextricks.DexStore$Config):boolean");
    }

    public static boolean anyOptimizationDone(long j) {
        return AnonymousClass001.A1N(((j & STATE_MASK) > 0L ? 1 : ((j & STATE_MASK) == 0L ? 0 : -1)));
    }

    private boolean areDexesTruncated(DexStore dexStore, File file, DexManifest.Dex[] dexArr) {
        int i = dexStore.readConfig().artTruncatedDexSize;
        if (i <= 0) {
            return false;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= dexArr.length) {
                Mlog.d("All dexes appear truncated", new Object[0]);
                return true;
            }
            DexManifest.Dex dex = dexArr[i3];
            if (!dexAppearsTruncated(dex, file, i)) {
                Mlog.w("Dex %s is not truncated", dex.assetName);
                return false;
            }
            i2 = i3 + 1;
        }
    }

    private void checkTmpOatFileLength(File file) {
        if (file.exists() && file.length() == 0) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(file);
            throw AnonymousClass001.A0T(AnonymousClass001.A0d(" is an impossibly short oat file", A0k));
        }
    }

    public static void clearCannotTruncateDexesFlag(File file) {
        Mlog.d("Clearing flag to not truncate dex files at root: %s", file.getAbsolutePath());
        File A02 = 0Pz.A02(DexStoreUtils.IGNORE_DIRTY_CHECK_PREFIX, "cannot_trunc_dex.flg", file);
        if (!A02.exists()) {
            Mlog.w("Dex truncation file does not exist. This is likely an error", new Object[0]);
        }
        if (A02.delete() || !A02.exists()) {
            return;
        }
        Mlog.w("Was not able to delete cannot truncate dexes file", new Object[0]);
    }

    public static String convertClassToDotForm(String str) {
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    public static List convertCopiedDexInfoToExpectedDexInfo(List list) {
        ArrayList A0t;
        if (list == null) {
            A0t = null;
        } else {
            A0t = AnonymousClass001.A0t(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0t.add(new ExpectedFileInfo((DexUnpacker.CopiedDexInfo) it.next()));
            }
        }
        return A0t;
    }

    public static boolean dexAppearsTruncated(DexManifest.Dex dex, File file, int i) {
        String makeDexName = dex.makeDexName();
        File A0D = AnonymousClass001.A0D(file, makeDexName);
        if (!A0D.exists()) {
            Mlog.w("Dex [asset: %s] %s seems not to exist", dex.assetName, makeDexName);
        }
        return dexAppearsTruncated(A0D, i);
    }

    public static boolean dexAppearsTruncated(File file, int i) {
        boolean z = false;
        if (file.length() <= i) {
            z = true;
        }
        return z;
    }

    private File extractResourceFile(String str, File file, String str2) {
        try {
            File createTempFile = File.createTempFile(str2, "txt", file);
            createTempFile.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                InputStream open = this.mResProvider.open(str);
                try {
                    0cV.A05(open, fileOutputStream, (-1) >>> 1);
                    if (open != null) {
                        open.close();
                    }
                    fileOutputStream.close();
                    return createTempFile;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            Mlog.e(0Pz.A0V("[opt][res] io exception ", e), AnonymousClass001.A1Z());
            return null;
        }
    }

    public static boolean forceUseOriginalMixedModePGOProfile(Context context) {
        return C0d4.A00(context).A09();
    }

    public static Context getAppContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private String getArtImageLocation() {
        String artImageLocation = DalvikInternals.getArtImageLocation();
        return (artImageLocation == null || "".equals(artImageLocation)) ? 0Pz.A0j("/data/dalvik-cache/", OdexSchemeArtTurbo.getArch(), "/system@framework@boot.art") : artImageLocation;
    }

    public static String getBootClassPathValue(DexStore dexStore, boolean z) {
        String str = System.getenv("BOOTCLASSPATH");
        if (z) {
            StringBuilder A0o = AnonymousClass001.A0o(str);
            File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= dependencyOdexFiles.length) {
                    break;
                }
                if (A0o.length() > 0) {
                    A0o.append(":");
                }
                A0o.append(dependencyOdexFiles[i2].getAbsoluteFile());
                i = i2 + 2;
            }
            str = A0o.toString();
        }
        return str;
    }

    public static File getCannotTruncateDexFlagFile(File file) {
        return 0Pz.A02(DexStoreUtils.IGNORE_DIRTY_CHECK_PREFIX, "cannot_trunc_dex.flg", file);
    }

    public static boolean getCannotTruncateDexesFlag(File file) {
        return 0Pz.A02(DexStoreUtils.IGNORE_DIRTY_CHECK_PREFIX, "cannot_trunc_dex.flg", file).exists();
    }

    public static String getClassPathValue(DexStore dexStore, File file, List list) {
        StringBuilder A0k = AnonymousClass001.A0k();
        File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
        for (int i = 0; i < dependencyOdexFiles.length; i += 2) {
            if (A0k.length() > 0) {
                A0k.append(":");
            }
            A0k.append(dependencyOdexFiles[i].getAbsoluteFile());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = ((ExpectedFileInfo) it.next()).getFile(file);
            if (A0k.length() > 0) {
                A0k.append(":");
            }
            A0k.append(file2.getAbsolutePath());
        }
        return A0k.toString();
    }

    public static long getCompilationStatusFlags(DexStore.Config config) {
        long j = config.enableMixedMode ? 128L : 0L;
        if (config.tryPeriodicPgoCompilation) {
            j |= STATE_DO_PERIODIC_PGO_COMP_NEEDED;
        }
        if (config.enableMixedModePgo) {
            j |= STATE_PGO_NEEDED;
        }
        return j;
    }

    private Dex2OatHookInfo getDex2OatLibHooks(Context context, DexStore.OptimizationSession optimizationSession) {
        if (0Zd.A00.booleanValue()) {
            Mlog.d("Not installing Dex2OatLibHooks on 64 bit device", new Object[0]);
            return null;
        }
        Object[] objArr = new Object[0];
        if (optimizationSession.config.installDex2OatHooks) {
            Mlog.i("Going to try installing Dex2OatLibHooks", objArr);
            return new Dex2OatHookInfo("dex2oathooks", "FB_ENABLE_DEX2OAT_HOOKS");
        }
        Mlog.i("Not installing Dex2OatLibHooks", objArr);
        return null;
    }

    private List getDexInfos(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, List list, boolean z, boolean z2, byte b, File file, DexManifest.Dex[] dexArr, AtomicReference atomicReference) {
        List list2 = list;
        Mlog.d("[opt] dex2oat - get dex infos for mm: %s pgo comp: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        try {
            if (areDexesTruncated(dexStore, file, dexArr)) {
                Mlog.d("Dexes appear truncated. Re-unpacking secondary dexes", new Object[0]);
                if (file != dexStore.root) {
                    throw AnonymousClass001.A0N("Can only copy temp secondary dexes from the root");
                }
                if (list != null) {
                    AnonymousClass001.A1C("Ignoring given expected dex file infos since dexes are truncated");
                }
                list2 = getNewInitialOptimizedSecondaryDexes(context, dexStore, optimizationSession, config, tmpDir, renamer, atomicReference);
            }
            if (z2) {
                ExpectedFileInfo.setCompTypeToPgoIfUnknown(list2);
            }
            return z ? getMixedModeDexInfos(list2, tmpDir, z2, b, dexArr) : list2;
        } catch (IOException e) {
            Mlog.w(e, "Could not get dex infos due to IO error. Bailing...", new Object[0]);
            return null;
        }
    }

    public static Dex2OatHookInfo getMirandaFixLibHook() {
        return null;
    }

    private List getMixedModeDexInfos(List list, DexStore.TmpDir tmpDir, boolean z, byte b, DexManifest.Dex[] dexArr) {
        File extractResourceFile = extractResourceFile(DEX_MANIFEST_RESOURCE_PATH, tmpDir.directory, TMP_DEX_MANIFEST_FILE);
        Object[] objArr = new Object[0];
        if (extractResourceFile == null) {
            Mlog.i("[opt][mixed_mode] Getting mixed mode dex infos in legacy mode", objArr);
            return getMixedModeDexInfosLegacy(list, tmpDir, z, dexArr);
        }
        Mlog.i("[opt][mixed_mode] Getting mixed mode dex infos in manifest mode", objArr);
        return getMixedModeDexInfosManifest(extractResourceFile, list, tmpDir, z, dexSelectorForMultidexCompilationStrategy(extractResourceFile, b), dexArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r310.isEmpty() != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List getMixedModeDexInfosLegacy(java.util.List r302, com.facebook.common.dextricks.DexStore.TmpDir r303, boolean r304, com.facebook.common.dextricks.DexManifest.Dex[] r305) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.getMixedModeDexInfosLegacy(java.util.List, com.facebook.common.dextricks.DexStore$TmpDir, boolean, com.facebook.common.dextricks.DexManifest$Dex[]):java.util.List");
    }

    private List getMixedModeDexInfosManifest(File file, List list, DexStore.TmpDir tmpDir, boolean z, DexSelector dexSelector, DexManifest.Dex[] dexArr) {
        List list2;
        if (z) {
            Mlog.d("[opt][mixed_mode] mixed mode must also take into account pgo compilation: %s", list.toString());
            list2 = ExpectedFileInfo.setCompTypeIfUnknown(list, ExpectedFileInfo.CompilationType.PGO);
        } else {
            list2 = null;
        }
        return makeMixedModeFileList(dexArr, dexSelector, list2);
    }

    private List getNewInitialOptimizedSecondaryDexes(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, AtomicReference atomicReference) {
        File makeTmpSubDirectory = makeTmpSubDirectory(tmpDir, "tmp-unpack-dexes");
        List newSecondaryDexes = getNewSecondaryDexes(makeTmpSubDirectory, dexStore.root);
        atomicReference.set(makeTmpSubDirectory);
        if (newSecondaryDexes == null) {
            return null;
        }
        Mlog.d("Starting to do initial optimizations for temp secondary dexes", AnonymousClass001.A1Z());
        DexStore.DexStoreTestHooks dexStoreTestHooks = DexStore.sDexStoreTestHooks;
        if (dexStoreTestHooks != null) {
            dexStoreTestHooks.onSecondaryDexesUnpackedForRecompilation();
        }
        Mlog.d("Optimizing temp secondary dexes got result status: %d", Long.valueOf(initialDexOptimizations(context, dexStore, optimizationSession, config, tmpDir, renamer, makeTmpSubDirectory, newSecondaryDexes)));
        renamer.renameOrThrow();
        renamer.reset();
        return newSecondaryDexes;
    }

    private List getNewSecondaryDexes(File file, File file2) {
        return convertCopiedDexInfoToExpectedDexInfo(this.mDexUnpacker.copySecondaryDexes(file, file2));
    }

    private String getOatVersion() {
        String oatFormatVersion = DalvikInternals.getOatFormatVersion();
        if (oatFormatVersion != null && !oatFormatVersion.isEmpty()) {
            return oatFormatVersion;
        }
        int i = Build.VERSION.SDK_INT;
        Mlog.e(AnonymousClass001.A0e(i != 10000 ? "unknown api version: VERSION.SDK_INT = " : "oatmeal should be used on Dalvik. VERSION.SDK_INT = ", AnonymousClass001.A0k(), i), new Object[0]);
        return "039";
    }

    public static int getOdexFlags() {
        return 1;
    }

    private int getTruncatedSize(DexStore dexStore) {
        return dexStore.readConfig().artTruncatedDexSize;
    }

    public static void initAllDex2OatHooks(ProcessBuilder processBuilder, Dex2OatHookInfo... dex2OatHookInfoArr) {
        int length;
        boolean z;
        if (dex2OatHookInfoArr == null || (length = dex2OatHookInfoArr.length) == 0) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        String str = System.getenv(ENV_LD_PRELOAD);
        if (str != null) {
            A0k.append(str);
            z = true;
        } else {
            z = false;
        }
        int i = 0;
        boolean z2 = false;
        do {
            Dex2OatHookInfo dex2OatHookInfo = dex2OatHookInfoArr[i];
            if (dex2OatHookInfo != null) {
                Mlog.i("Installing hook for %s", dex2OatHookInfo.libName);
                File A01 = C0il.A01(dex2OatHookInfo.libName);
                if (z) {
                    A0k.append(File.pathSeparatorChar);
                }
                A0k.append(A01.getAbsolutePath());
                if (dex2OatHookInfo.envFlag != null) {
                    processBuilder.setenv(dex2OatHookInfo.envFlag, ConstantsKt.CAMERA_ID_BACK);
                }
                z = true;
                z2 = true;
            }
            i++;
        } while (i < length);
        if (z2) {
            Mlog.d("Setting %s to %s", ENV_LD_PRELOAD, A0k.toString());
            processBuilder.setenv(ENV_LD_PRELOAD, A0k.toString());
            processBuilder.setenv("LD_LIBRARY_PATH", C0il.A02());
        }
    }

    private long initialDexOptimizations(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, File file, List list) {
        Mlog.v("[opt] first dex2oat run", new Object[0]);
        optimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, config.enableArtVerifyNone, false, false, false, (byte) 0, (byte) 0, false, file, list);
        return 16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (mixedNeeded(r301) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean initialMixedNeeded(long r301) {
        /*
            r0 = r301
            boolean r0 = optimizationCompleted(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = mixedNeeded(r0)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.initialMixedNeeded(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x068f, code lost:
    
        if (r0.isEmpty() != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0054, code lost:
    
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r314 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean innerOptimizeDex2Oat(android.content.Context r302, com.facebook.common.dextricks.DexStore r303, com.facebook.common.dextricks.OdexSchemeArtXdex.Renamer r304, com.facebook.common.dextricks.DexStore.OptimizationSession r305, com.facebook.common.dextricks.DexStore.Config r306, com.facebook.common.dextricks.DexStore.TmpDir r307, boolean r308, boolean r309, boolean r310, boolean r311, byte r312, byte r313, boolean r314, java.io.File r315, java.util.List r316) {
        /*
            Method dump skipped, instructions count: 1956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.innerOptimizeDex2Oat(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.OdexSchemeArtXdex$Renamer, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$Config, com.facebook.common.dextricks.DexStore$TmpDir, boolean, boolean, boolean, boolean, byte, byte, boolean, java.io.File, java.util.List):boolean");
    }

    public static boolean isOatFileStillValid(File file, long j, long j2) {
        return true;
    }

    public static List makeExpectedFileInfoList(DexManifest.Dex[] dexArr, long j) {
        boolean anyOptimizationDone = anyOptimizationDone(j);
        List makeExpectedFileInfoList = OdexSchemeArtTurbo.makeExpectedFileInfoList(dexArr, null);
        Mlog.i("makeExpectedFile: are oat around: %s expected files: %s", Boolean.valueOf(anyOptimizationDone), makeExpectedFileInfoList.toString());
        if (anyOptimizationDone) {
            makeExpectedFileInfoList.add(new ExpectedFileInfo(OdexSchemeArtTurbo.OREO_ODEX_DIR));
        }
        Mlog.i("makeExpectedFile: RETURN expected files: %s", makeExpectedFileInfoList.toString());
        return makeExpectedFileInfoList;
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, long j) {
        return OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j));
    }

    public static List makeMixedModeFileList(DexManifest.Dex[] dexArr, DexSelector dexSelector, List list) {
        int length;
        if (list != null && (length = dexArr.length) != list.size()) {
            throw AnonymousClass001.A0N(String.format("Dexes array [size: %d] needs to be the same size as replaceDexNames array [size: %d]", AnonymousClass001.A1b(Integer.valueOf(length), list.size())));
        }
        int length2 = dexArr.length;
        ArrayList A0t = AnonymousClass001.A0t(length2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length2) {
                break;
            }
            DexManifest.Dex dex = dexArr[i2];
            if (dex != null && dexSelector.select(dex)) {
                Mlog.i("[mixed_mode] selected dex = { %s, %s, %s }", dex.canaryClass, dex.hash, dex.assetName);
                ExpectedFileInfo expectedFileInfo = new ExpectedFileInfo(dex, ExpectedFileInfo.CompilationType.ALL);
                if (list == null) {
                    A0t.add(expectedFileInfo);
                } else if (i2 < list.size()) {
                    list.set(i2, expectedFileInfo);
                }
            }
            i = i2 + 1;
        }
        return list != null ? list : A0t;
    }

    public static List makeMixedModeFileList(DexManifest.Dex[] dexArr, String str, List list) {
        final String convertClassToDotForm = convertClassToDotForm(str);
        return makeMixedModeFileList(dexArr, new DexSelector() { // from class: com.facebook.common.dextricks.OdexSchemeArtXdex.1
            @Override // com.facebook.common.dextricks.OdexSchemeArtXdex.DexSelector
            public boolean select(DexManifest.Dex dex) {
                Mlog.w("[mixed_mode] comparing %s and %s", dex.canaryClass, convertClassToDotForm);
                return dex.canaryClass.equals(convertClassToDotForm);
            }
        }, list);
    }

    public static File makeTmpSubDirectory(DexStore.TmpDir tmpDir, String str) {
        File A0D = AnonymousClass001.A0D(tmpDir.directory, 0Pz.A0j(str, "-", UUID.randomUUID().toString().replace("-", "")));
        Fs.mkdirOrThrow(A0D);
        return A0D;
    }

    public static boolean markCannotTruncateDexesFlag(File file) {
        Mlog.d("Marking cannot truncate dex files at root: %s", file.getAbsolutePath());
        File A02 = 0Pz.A02(DexStoreUtils.IGNORE_DIRTY_CHECK_PREFIX, "cannot_trunc_dex.flg", file);
        if (A02.exists()) {
            Mlog.w("Dex truncation file already exists. This is likely an error", new Object[0]);
        }
        try {
            boolean createNewFile = A02.createNewFile();
            if (!createNewFile) {
                AnonymousClass001.A1B("Was not successful creating cannot truncate dexes file");
            }
            return createNewFile;
        } catch (IOException e) {
            Mlog.w(e, "Was not able to create cannot truncate dexes file", new Object[0]);
            return false;
        }
    }

    public static boolean markedToTryPgoProfileRecompilation(long j) {
        return AnonymousClass001.A1N(((j & STATE_DO_PERIODIC_PGO_COMP_NEEDED) > 0L ? 1 : ((j & STATE_DO_PERIODIC_PGO_COMP_NEEDED) == 0L ? 0 : -1)));
    }

    public static boolean mixedNeeded(long j) {
        return AnonymousClass001.A1N(((j & 128) > 0L ? 1 : ((j & 128) == 0L ? 0 : -1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (dexAppearsTruncated(r302, r303) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean needsTruncation(java.io.File r302, int r303) {
        /*
            r301 = this;
            r0 = r303
            if (r0 < 0) goto L11
            r0 = r302
            r1 = r303
            boolean r0 = dexAppearsTruncated(r0, r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L14
        L11:
            r0 = 0
            r305 = r0
        L14:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.needsTruncation(java.io.File, int):boolean");
    }

    public static String oatNameFromDexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        return 0Pz.A0W(str, DexManifest.ODEX_EXT);
    }

    public static String oatNameFromExpectedFileInfo(ExpectedFileInfo expectedFileInfo) {
        return oatNameFromDexName(AnonymousClass001.A1T(expectedFileInfo.dex) ? expectedFileInfo.dex.makeDexName() : expectedFileInfo.rawFile);
    }

    public static boolean optimizationCompleted(long j) {
        return AnonymousClass001.A1N(((j & 16) > 0L ? 1 : ((j & 16) == 0L ? 0 : -1)));
    }

    private boolean optimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, byte b, byte b2, boolean z5) {
        return optimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, z, z2, z3, z4, b, b2, z5, null, null);
    }

    private boolean optimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, byte b, byte b2, boolean z5, File file, List list) {
        File file2 = file;
        if (file == null) {
            file2 = dexStore.root;
        }
        CriticalCannotTruncateDexesSection criticalCannotTruncateDexesSection = new CriticalCannotTruncateDexesSection(this, file2, z5);
        try {
            boolean innerOptimizeDex2Oat = innerOptimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, z, z2, z3, z4, b, b2, z5, file2, list);
            criticalCannotTruncateDexesSection.close();
            return innerOptimizeDex2Oat;
        } catch (Throwable th) {
            try {
                criticalCannotTruncateDexesSection.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (markedToTryPgoProfileRecompilation(r302) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean pgoProfileRecompilationNeeded(com.facebook.common.dextricks.DexStore.OptimizationHistoryLog r301, long r302) {
        /*
            r0 = r301
            long r0 = r0.schemeStatus
            r304 = r0
            r0 = r304
            boolean r0 = optimizationCompleted(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L1e
            r0 = r302
            boolean r0 = markedToTryPgoProfileRecompilation(r0)
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L21
        L1e:
            r0 = 0
            r306 = r0
        L21:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.pgoProfileRecompilationNeeded(com.facebook.common.dextricks.DexStore$OptimizationHistoryLog, long):boolean");
    }

    public static String readProgramOutputFileSafely(RandomAccessFile randomAccessFile) {
        try {
            return Fs.readProgramOutputFile(randomAccessFile);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    private void setCompilerFilter(DexStore.Config config, ProcessBuilder processBuilder) {
        String str;
        String str2;
        byte b = config.artFilter;
        if (b != 0) {
            switch (b) {
                case 1:
                    str = "verify-none";
                    str2 = 0Pz.A0W("--compiler-filter=", str);
                    break;
                case 2:
                    str = "interpret-only";
                    str2 = 0Pz.A0W("--compiler-filter=", str);
                    break;
                case 3:
                    str = "space";
                    str2 = 0Pz.A0W("--compiler-filter=", str);
                    break;
                case 4:
                    str = "balanced";
                    str2 = 0Pz.A0W("--compiler-filter=", str);
                    break;
                case 5:
                    str = Location.SPEED;
                    str2 = 0Pz.A0W("--compiler-filter=", str);
                    break;
                case 6:
                    str = "everything";
                    str2 = 0Pz.A0W("--compiler-filter=", str);
                    break;
                case 7:
                    str = "time";
                    str2 = 0Pz.A0W("--compiler-filter=", str);
                    break;
                default:
                    Mlog.w("ignoring unknown configured ART filter %s", Byte.valueOf(b));
                    break;
            }
            processBuilder.addArgument(str2);
        }
        str = SystemProperties.get("dalvik.vm.dex2oat-filter");
        if (str.isEmpty()) {
            Mlog.i("[opt] no compile-filter set or pgo data, compiling with verify-none", new Object[0]);
            str2 = "--compiler-filter=verify-none";
            processBuilder.addArgument(str2);
        } else {
            Mlog.i("Setting dex2oatFilter to system prop: %s", str);
            str2 = 0Pz.A0W("--compiler-filter=", str);
            processBuilder.addArgument(str2);
        }
    }

    private boolean shouldTruncateDexesNow(File file, File file2, long j, int i) {
        boolean z = false;
        if (needsTruncation(file2, i) && optimizationCompleted(j)) {
            z = !getCannotTruncateDexesFlag(file);
        }
        return z;
    }

    public static boolean shouldUseMixedModeDex2Oat(Context context, boolean z) {
        if (z) {
            return !0GT.A00(C0d4.A00(context).A02).A15;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void startOptimizerProcess(ProcessBuilder processBuilder, Context context, String str, DexStore.OptimizationSession optimizationSession, Dex2oatLogcatParser dex2oatLogcatParser, DexStore.TmpDir tmpDir) {
        Process process;
        RandomAccessFile openUnlinkedTemporaryFile;
        String str2;
        Dex2OatProgressListener dex2OatProgressListener = new Dex2OatProgressListener(context, str, optimizationSession.optimizationAttemptNumber);
        Process process2 = null;
        try {
            openUnlinkedTemporaryFile = Fs.openUnlinkedTemporaryFile(tmpDir.directory);
        } catch (Throwable th) {
            th = th;
            process = null;
        }
        try {
            int fileno = Fd.fileno(openUnlinkedTemporaryFile.getFD());
            int[] iArr = processBuilder.mStreamDispositions;
            iArr[1] = fileno;
            iArr[2] = -5;
            Mlog.v("starting job %s", str);
            Prio.With with = new Prio.With();
            try {
                process2 = processBuilder.create();
                with.close();
                int i = process2.mPid;
                int waitForAndManageProcess = optimizationSession.waitForAndManageProcess(process2, dex2OatProgressListener);
                if (dex2oatLogcatParser != null) {
                    Mlog.d("Success getting logcat dex2oat data: %s in %d ms", Boolean.valueOf(dex2oatLogcatParser.readAndParseProcess(i, LogcatReader.DEFAULT_WAIT_TIME)), AnonymousClass001.A0O(System.currentTimeMillis()));
                }
                try {
                    str2 = Fs.readProgramOutputFile(openUnlinkedTemporaryFile);
                } catch (IOException unused) {
                    str2 = null;
                }
                Integer valueOf = Integer.valueOf(waitForAndManageProcess);
                Mlog.i("Got result from dex2oat [exit status: %d]: %s", valueOf, str2);
                Fs.safeClose(openUnlinkedTemporaryFile);
                process2.destroy();
                dex2OatProgressListener.logEvent(str2, dex2oatLogcatParser);
                Mlog.v("%s exited with status %s", str, valueOf);
                if (waitForAndManageProcess != 0) {
                    throw AnonymousClass001.A0T(String.format("%s failed: %s: %s", str, Process.describeStatus(waitForAndManageProcess), str2));
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            process = process2;
            process2 = openUnlinkedTemporaryFile;
            Fs.safeClose(process2);
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    private void truncateWithBackup(File file, File file2, int i) {
        if (i >= 0) {
            Fs.renameOrThrow(file, file2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                FileInputStream A0F = AnonymousClass001.A0F(file2);
                try {
                    0cV.A04(A0F, fileOutputStream, i);
                    A0F.close();
                    fileOutputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    throw th;
                } finally {
                    0Ug.A00(th, th);
                }
            }
        }
    }

    public static String vdexNameFromOdexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        return 0Pz.A0W(str, ".vdex");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d1  */
    @Override // com.facebook.common.dextricks.OdexSchemeArtTurbo, com.facebook.common.dextricks.OdexScheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void configureClassLoader(java.io.File r302, com.facebook.common.dextricks.ClassLoaderConfiguration r303) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.configureClassLoader(java.io.File, com.facebook.common.dextricks.ClassLoaderConfiguration):void");
    }

    public DexSelector dexSelectorForMultidexCompilationStrategy(File file, final byte b) {
        final AtomicInteger atomicInteger = new AtomicInteger((-1) >>> 1);
        final HashMap A0u = AnonymousClass001.A0u();
        try {
            BufferedReader A0A = AnonymousClass001.A0A(file);
            while (true) {
                try {
                    String readLine = A0A.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String trim = readLine.trim();
                    ManifestEntry fromCSV = ManifestEntry.fromCSV(trim);
                    if (fromCSV == null) {
                        Mlog.i(0Pz.A0W("[opt][mixed_mode] could not parse manifest entry for : ", trim), new Object[0]);
                    } else {
                        Mlog.i(0Pz.A0v("[opt][mixed_mode] read manifest entry for ", fromCSV.canary, " : ", trim), new Object[0]);
                        A0u.put(fromCSV.canary, fromCSV);
                        if (fromCSV.coldstart) {
                            atomicInteger.set(Math.min(atomicInteger.get(), fromCSV.ordinal));
                        }
                    }
                } finally {
                }
            }
            A0A.close();
        } catch (IOException e) {
            Mlog.w(e, "[opt][mixed_mode] problem reading manifest file", new Object[0]);
        }
        return new DexSelector() { // from class: com.facebook.common.dextricks.OdexSchemeArtXdex.2
            @Override // com.facebook.common.dextricks.OdexSchemeArtXdex.DexSelector
            public boolean select(DexManifest.Dex dex) {
                Object[] objArr;
                String str;
                ManifestEntry manifestEntry = (ManifestEntry) A0u.get(dex.canaryClass);
                boolean z = false;
                if (manifestEntry == null) {
                    objArr = new Object[]{dex.canaryClass};
                    str = "[opt][mixed_mode] could not find manifest entry for canary class %s";
                } else {
                    byte b2 = b;
                    if (b2 != 1) {
                        z = manifestEntry.coldstart;
                        if (b2 != 2) {
                            if (!z || manifestEntry.ordinal != atomicInteger.get()) {
                                z = false;
                            }
                        }
                        objArr = new Object[]{dex.canaryClass, Integer.valueOf(manifestEntry.ordinal), Boolean.valueOf(manifestEntry.coldstart), Byte.valueOf(b), Boolean.valueOf(z)};
                        str = "[opt][mixed_mode] considering canary class=%s ordinal=%d coldstart=%s using strategy=%d => selected=%s";
                    }
                    z = true;
                    objArr = new Object[]{dex.canaryClass, Integer.valueOf(manifestEntry.ordinal), Boolean.valueOf(manifestEntry.coldstart), Byte.valueOf(b), Boolean.valueOf(z)};
                    str = "[opt][mixed_mode] considering canary class=%s ordinal=%d coldstart=%s using strategy=%d => selected=%s";
                }
                Mlog.w(str, objArr);
                return z;
            }
        };
    }

    @Override // com.facebook.common.dextricks.OdexSchemeArtTurbo, com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeArtXdex";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public int loadInformationalStatus(File file, long j) {
        FileInputStream A0F;
        String[] makeExpectedFileListFrom = OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(this.mDexes, 0L));
        int i = 0;
        String oreoOdexOutputDirectory = OdexSchemeArtTurbo.getOreoOdexOutputDirectory(file, false);
        int i2 = 0;
        while (true) {
            if (i2 >= makeExpectedFileListFrom.length) {
                break;
            }
            File A0E = AnonymousClass001.A0E(0Pz.A0W(oreoOdexOutputDirectory, oatNameFromDexName(makeExpectedFileListFrom[i2])));
            if (!A0E.exists()) {
                Mlog.i(0Pz.A0W("loadInformationalStatus didn't find: ", A0E.getAbsolutePath()), new Object[0]);
                break;
            }
            Mlog.i(0Pz.A0W("loadInformationalStatus DID find: ", A0E.getAbsolutePath()), new Object[0]);
            try {
                A0F = AnonymousClass001.A0F(A0E);
            } catch (IOException unused) {
                AnonymousClass001.A1B(0Pz.A0W("loadInformationalStatus couldn't open ", A0E.getAbsolutePath()));
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                try {
                    if (Fs.discardFromInputStream(A0F, STATE_PGO_NEEDED) != STATE_PGO_NEEDED) {
                        AnonymousClass001.A1B(0Pz.A0W("loadInformationalStatus couldn't read more than 4k of the beginning of ", A0E.getAbsolutePath()));
                    } else {
                        0cV.A05(A0F, byteArrayOutputStream, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
                        byteArrayOutputStream.flush();
                    }
                    byteArrayOutputStream.close();
                    A0F.close();
                    i2++;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                    break;
                }
            } catch (Throwable th3) {
                try {
                    A0F.close();
                } catch (Throwable th4) {
                    0Ug.A00(th3, th4);
                }
                throw th3;
                break;
            }
        }
        if ((j & 128) == 0 && (j & 1024) != 0) {
            i = 1024;
        }
        if ((j & STATE_PGO_NEEDED) == 0 && (j & STATE_PGO_ATTEMPTED) != 0) {
            i |= Constants.LOAD_RESULT_PGO;
        }
        if ((j & 1024) != 0) {
            i |= 8192;
        }
        if ((j & STATE_PGO_ATTEMPTED) != 0) {
            i |= 65536;
        }
        if ((j & STATE_DEX2OAT_CLASSPATH_SET) != 0) {
            i |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        if ((j & STATE_DO_PERIODIC_PGO_COMP_NEEDED) != 0) {
            if ((j & STATE_DO_PERIODIC_PGO_COMP_FINISHED) != 0 && (j & STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                i = 131072 | i;
            }
            if ((j & STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                i |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
            }
        }
        return i;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public boolean loadNotOptimized(long j) {
        return !anyOptimizationDone(j);
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        boolean optimizationCompleted = optimizationCompleted(j);
        Mlog.i("NeedOptimization: opt complete: %s last scheme: %s pgo: %s opt history: %s", Boolean.valueOf(optimizationCompleted), Boolean.valueOf(optimizationCompleted(optimizationHistoryLog.schemeStatus)), Boolean.valueOf(config.tryPeriodicPgoCompilation), optimizationHistoryLog);
        if (!config.tryPeriodicPgoCompilation || !optimizationHistoryLog.lastCompilationSessionWasASuccess()) {
            return OdexScheme.NeedOptimizationState.shouldOptimize(!optimizationCompleted);
        }
        if (!optimizationCompleted(optimizationHistoryLog.schemeStatus)) {
            return OdexScheme.NeedOptimizationState.NEED_OPTIMIZATION;
        }
        long timeDeltaFromLastCompilationSessionMs = optimizationHistoryLog.timeDeltaFromLastCompilationSessionMs();
        Mlog.i("NeedOptimization: timeDelta %d ms min interval: %d ms", Long.valueOf(timeDeltaFromLastCompilationSessionMs), Long.valueOf(config.minTimeBetweenPgoCompilationMs));
        if (timeDeltaFromLastCompilationSessionMs == DexStore.OptimizationHistoryLog.NO_TIME_DELTA || timeDeltaFromLastCompilationSessionMs < config.minTimeBetweenPgoCompilationMs) {
            return OdexScheme.NeedOptimizationState.NO_OPTIMIZATION_NEEDED;
        }
        Mlog.i("NeedOptimization: Time to run additional pgo optimizations", new Object[0]);
        return OdexScheme.NeedOptimizationState.NEED_REOPTIMIZATION;
    }
}
