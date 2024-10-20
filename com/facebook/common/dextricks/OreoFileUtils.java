package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import X.C0il;
import android.content.Context;
import dalvik.system.VMRuntime;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: OreoFileUtils.class */
public class OreoFileUtils {
    public static final OreoFileUtils $redex_init_class = null;

    static {
        C0il.A0B("oreofileutils-jni");
    }

    public static boolean alreadyExtractedForCloudPgo(File file) {
        return AnonymousClass001.A1S(file.getParentFile(), "oat/cloud_pgo_extracted");
    }

    public static boolean alreadyPostColdStartSpeedProfile(File file) {
        return AnonymousClass001.A1S(file.getParentFile(), "oat/speed_profile");
    }

    public static boolean alreadyUnpackedForCloudPgo(File file) {
        return AnonymousClass001.A1S(file.getParentFile(), "oat/cloud_pgo_unpacked");
    }

    public static List areFilesMapped(List list) {
        return areFilesMapped(list, "/proc/self/maps");
    }

    public static List areFilesMapped(List list, String str) {
        ArrayList arrayList = new ArrayList(Collections.nCopies(list.size(), false));
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str), 128);
            int i = 0;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || i == list.size()) {
                        break;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (!((Boolean) arrayList.get(i2)).booleanValue() && readLine.contains((CharSequence) list.get(i2))) {
                            arrayList.set(i2, true);
                            i++;
                        }
                    }
                } finally {
                }
            }
            bufferedReader.close();
            return arrayList;
        } catch (IOException unused) {
            return arrayList;
        }
    }

    public static DexErrorRecoveryInfoAsync collectAsyncInfoWithSecondary(Context context, File file) {
        List usingOptimizedBaseAndMegazipFiles = usingOptimizedBaseAndMegazipFiles(context, file);
        Boolean bool = (Boolean) usingOptimizedBaseAndMegazipFiles.get(0);
        Boolean bool2 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(1);
        Boolean bool3 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(2);
        Boolean bool4 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(3);
        Boolean bool5 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(4);
        DexErrorRecoveryInfoAsync.setAppMetaInfo(DexStoreUtils.getARTVersion(context), DexStoreUtils.getLastAppInstallOrUpdateTime(context), DexStoreUtils.getInstallerName(context));
        Boolean bool6 = Boolean.TRUE;
        Long l = null;
        Long A0P = bool6.equals(bool) ? AnonymousClass001.A0P(DexStoreUtils.getBaseOdex(context)) : null;
        Long A0P2 = bool6.equals(bool2) ? AnonymousClass001.A0P(DexStoreUtils.getBaseVdex(context)) : null;
        Long valueOf = bool6.equals(bool) ? Long.valueOf(DexStoreUtils.getBaseOdex(context).lastModified()) : null;
        Long valueOf2 = bool6.equals(bool2) ? Long.valueOf(DexStoreUtils.getBaseVdex(context).lastModified()) : null;
        String baseOdexKeyValue = bool6.equals(bool) ? getBaseOdexKeyValue(context, "dex2oat-cmdline") : null;
        Long A0P3 = bool6.equals(bool3) ? AnonymousClass001.A0P(DexStoreUtils.getBaseAppImage(context)) : null;
        Long valueOf3 = bool6.equals(bool3) ? Long.valueOf(DexStoreUtils.getBaseAppImage(context).lastModified()) : null;
        Long A0P4 = AnonymousClass001.A0P(DexStoreUtils.getBaseDM(context));
        Long baselineProfileInDMSize = DexStoreUtils.getBaselineProfileInDMSize(context);
        Long vDexFileInDMSize = DexStoreUtils.getVDexFileInDMSize(context);
        String apkDirStr = getApkDirStr(context);
        if (bool6.equals(bool5)) {
            l = Long.valueOf(getImageSize(file));
        }
        return new DexErrorRecoveryInfoAsync(bool, bool2, bool3, bool4, bool5, A0P, A0P2, valueOf, valueOf2, baseOdexKeyValue, A0P3, valueOf3, A0P4, baselineProfileInDMSize, vDexFileInDMSize, apkDirStr, l);
    }

    public static DexErrorRecoveryInfoAsync collectBaseAsyncInfo(Context context) {
        List usingOptimizedBaseFiles = usingOptimizedBaseFiles(context);
        Boolean bool = (Boolean) usingOptimizedBaseFiles.get(0);
        Boolean bool2 = (Boolean) usingOptimizedBaseFiles.get(1);
        Boolean bool3 = (Boolean) usingOptimizedBaseFiles.get(2);
        DexErrorRecoveryInfoAsync.setAppMetaInfo(DexStoreUtils.getARTVersion(context), DexStoreUtils.getLastAppInstallOrUpdateTime(context), DexStoreUtils.getInstallerName(context));
        Boolean bool4 = Boolean.TRUE;
        Long l = null;
        Long A0P = bool4.equals(bool) ? AnonymousClass001.A0P(DexStoreUtils.getBaseOdex(context)) : null;
        Long A0P2 = bool4.equals(bool2) ? AnonymousClass001.A0P(DexStoreUtils.getBaseVdex(context)) : null;
        Long valueOf = bool4.equals(bool) ? Long.valueOf(DexStoreUtils.getBaseOdex(context).lastModified()) : null;
        Long valueOf2 = bool4.equals(bool2) ? Long.valueOf(DexStoreUtils.getBaseVdex(context).lastModified()) : null;
        String baseOdexKeyValue = bool4.equals(bool) ? getBaseOdexKeyValue(context, "dex2oat-cmdline") : null;
        Long A0P3 = bool4.equals(bool3) ? AnonymousClass001.A0P(DexStoreUtils.getBaseAppImage(context)) : null;
        if (bool4.equals(bool3)) {
            l = Long.valueOf(DexStoreUtils.getBaseAppImage(context).lastModified());
        }
        return new DexErrorRecoveryInfoAsync(bool, bool2, bool3, A0P, A0P2, valueOf, valueOf2, baseOdexKeyValue, A0P3, l, AnonymousClass001.A0P(DexStoreUtils.getBaseDM(context)), DexStoreUtils.getBaselineProfileInDMSize(context), DexStoreUtils.getVDexFileInDMSize(context), getApkDirStr(context));
    }

    public static long currentProfileSize(File file) {
        return AnonymousClass001.A0D(file.getParentFile(), 0Pz.A0j("oat/", file.getName(), ".cur.prof")).length();
    }

    public static String getApkDirStr(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        try {
            return apkDir.getCanonicalPath();
        } catch (IOException unused) {
            return "";
        }
    }

    public static String getBaseAppImageName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.art");
    }

    public static String getBaseOdexDex2OatCmdLine(Context context) {
        return getBaseOdexKeyValue(context, "dex2oat-cmdline");
    }

    public static String getBaseOdexKeyValue(Context context, String str) {
        File baseOdex = DexStoreUtils.getBaseOdex(context);
        if (!baseOdex.exists()) {
            return "";
        }
        try {
            return getOdexKeyValueNative(baseOdex.getCanonicalPath(), str);
        } catch (IOException | RuntimeException unused) {
            return "";
        }
    }

    public static String getBaseOdexName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.odex");
    }

    public static String getBaseVdexName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.vdex");
    }

    public static String getFileContents(File file) {
        if (file == null || !file.exists()) {
            return "";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        try {
            BufferedReader A0A = AnonymousClass001.A0A(file);
            while (true) {
                try {
                    String readLine = A0A.readLine();
                    if (readLine == null) {
                        break;
                    }
                    A0k.append(readLine);
                    A0k.append('\n');
                } finally {
                }
            }
            A0A.close();
        } catch (IOException unused) {
        }
        return A0k.toString();
    }

    public static long getImageSize(File file) {
        return AnonymousClass001.A0D(getIsaDir(file), getZipNameNoSuffix(file).concat(".art")).length();
    }

    public static File getIsaDir(File file) {
        return AnonymousClass001.A0D(file.getParentFile(), "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static String getMegazipAppImageName(File file) {
        return getZipNameNoSuffix(file).concat(".art");
    }

    public static String getMegazipOdexDex2OatCmdLine(File file) {
        return getMegazipOdexKeyValue(file, "dex2oat-cmdline");
    }

    public static String getMegazipOdexKeyValue(File file, String str) {
        File odex = getOdex(file);
        if (!odex.exists()) {
            return "";
        }
        try {
            return getOdexKeyValueNative(odex.getCanonicalPath(), str);
        } catch (IOException | RuntimeException unused) {
            return "";
        }
    }

    public static File getOdex(File file) {
        return AnonymousClass001.A0D(getIsaDir(file), getOdexName(file));
    }

    public static native String getOdexKeyValueNative(String str, String str2);

    public static long getOdexLastModified(File file) {
        return getOdex(file).lastModified();
    }

    public static String getOdexName(File file) {
        return getZipNameNoSuffix(file).concat(DexManifest.ODEX_EXT);
    }

    public static long getOdexSize(File file) {
        return getOdex(file).length();
    }

    public static File getOptLogFile(File file) {
        File file2 = new File(file.getParent(), "oat/opt_log.txt");
        try {
            Files.deleteIfExists(file2.toPath());
            file2.createNewFile();
            return file2;
        } catch (IOException unused) {
            return null;
        }
    }

    public static File getReferenceProfile(File file) {
        return AnonymousClass001.A0D(file.getParentFile(), "oat/".concat(file.getName()).concat(".prof"));
    }

    public static File getVdex(File file) {
        return AnonymousClass001.A0D(getIsaDir(file), getVdexName(file));
    }

    public static long getVdexLastModified(File file) {
        return getVdex(file).lastModified();
    }

    public static String getVdexName(File file) {
        return getZipNameNoSuffix(file).concat(".vdex");
    }

    public static long getVdexSize(File file) {
        return getVdex(file).length();
    }

    public static String getZipNameNoSuffix(File file) {
        String name = file.getName();
        return AnonymousClass001.A0c(name, name.lastIndexOf(46));
    }

    public static boolean hasOdex(File file) {
        return AnonymousClass001.A1P((getOdex(file).length() > 0L ? 1 : (getOdex(file).length() == 0L ? 0 : -1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (getOdex(r301).length() <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean hasVdexOdex(java.io.File r301) {
        /*
            r0 = r301
            java.io.File r0 = getVdex(r0)
            r302 = r0
            r0 = r302
            long r0 = r0.length()
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 <= 0) goto L32
            r0 = r301
            java.io.File r0 = getOdex(r0)
            r302 = r0
            r0 = r302
            long r0 = r0.length()
            r308 = r0
            r0 = r308
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = 1
            r307 = r0
            r0 = r310
            if (r0 > 0) goto L37
        L32:
            r0 = 0
            r307 = r0
            r0 = 0
            r302 = r0
        L37:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OreoFileUtils.hasVdexOdex(java.io.File):boolean");
    }

    public static boolean isTruncated(File file) {
        boolean z = true;
        if (file.exists() && file.length() >= 102400) {
            z = false;
        }
        return z;
    }

    public static void markExtractedForCloudPgo(File file) {
        try {
            AnonymousClass001.A0D(file.getParentFile(), "oat/cloud_pgo_extracted").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void markPostColdStartSpeedProfile(File file) {
        try {
            AnonymousClass001.A0D(file.getParentFile(), "oat/speed_profile").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void markUnpackedForCloudPgo(File file) {
        try {
            AnonymousClass001.A0D(file.getParentFile(), "oat/cloud_pgo_unpacked").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static long referenceProfileSize(File file) {
        return getReferenceProfile(file).length();
    }

    public static List usingOptimizedBaseAndMegazipFiles(Context context, File file) {
        String baseOdexName = getBaseOdexName(context);
        String baseVdexName = getBaseVdexName(context);
        String baseAppImageName = getBaseAppImageName(context);
        if (baseOdexName.isEmpty()) {
            return Collections.nCopies(5, false);
        }
        return areFilesMapped(new ArrayList(Arrays.asList(baseOdexName, baseVdexName, baseAppImageName, getOdexName(file), getMegazipAppImageName(file))), "/proc/self/maps");
    }

    public static List usingOptimizedBaseFiles(Context context) {
        String baseOdexName = getBaseOdexName(context);
        return baseOdexName.isEmpty() ? Collections.nCopies(3, false) : areFilesMapped(new ArrayList(Arrays.asList(baseOdexName, getBaseVdexName(context), getBaseAppImageName(context))), "/proc/self/maps");
    }
}
