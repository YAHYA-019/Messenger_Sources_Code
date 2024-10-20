package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.AnonymousClass001;
import X.C0d4;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import dalvik.system.VMRuntime;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: DexStoreUtils.class */
public final class DexStoreUtils {
    public static Long ART_VERSION_CODE;
    public static final String BASELINE_PROFILE_NAME = "primary.prof";
    public static int CANARY_IDX = 2;
    public static Long DM_BASELINE_PROFILE_SIZE;
    public static Long DM_VDEX_FILE_SIZE;
    public static int HASH_IDX = 1;
    public static final String IGNORE_DIRTY_CHECK_PREFIX = "IGNORE_DIRTY_";
    public static String INSTALLER_NAME;
    public static Long LAST_APP_INSTALL_OR_UPDATE_TIME;
    public static final String MAIN_DEX_STORE_ID = "dex";
    public static final boolean OREO_OR_NEWER = true;
    public static final String SECONDARY_DEX_MANIFEST = "metadata.txt";
    public static final int STORAGE_KIND_ASEC = 3;
    public static final int STORAGE_KIND_EXPAND = 2;
    public static final int STORAGE_KIND_INTERNAL = 1;
    public static final int STORAGE_KIND_OTHER = 0;
    public static final String VDEX_FILE_NAME_IN_BASE_DM = "primary.vdex";

    public static File createNewMainDexStoreReferencePgoProfile(Context context) {
        return C0d4.A00(context).A08(getMainDexStoreLocation(context));
    }

    public static long getARTVersion(Context context) {
        long j;
        String str;
        Object[] objArr;
        synchronized (DexStoreUtils.class) {
            Long l = ART_VERSION_CODE;
            if (l != null) {
                j = l.longValue();
            } else {
                PackageManager packageManager = context.getPackageManager();
                j = -1;
                if (packageManager == null) {
                    str = "Could not get package manager";
                    objArr = new Object[0];
                } else {
                    try {
                        int i = 0;
                        if (Build.VERSION.SDK_INT >= 29) {
                            i = 1073741824;
                        }
                        PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.art", i);
                        if (packageInfo != null) {
                            long longVersionCode = packageInfo.getLongVersionCode();
                            Long valueOf = Long.valueOf(longVersionCode);
                            ART_VERSION_CODE = valueOf;
                            if (valueOf != null) {
                                j = longVersionCode;
                            }
                        } else {
                            Mlog.e("Could not get pacakge info for com.google.android.art", new Object[0]);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        str = "could not find package com.google.android.art %s";
                        objArr = new Object[]{e};
                    }
                }
                Mlog.e(str, objArr);
            }
        }
        return j;
    }

    public static File getApkDir(Context context) {
        return new File(context.getApplicationInfo().publicSourceDir).getParentFile();
    }

    public static int getBaseApkStorageKind(Context context) {
        return getStorageKind(context.getApplicationInfo().publicSourceDir);
    }

    public static File getBaseAppImage(Context context) {
        return AnonymousClass001.A0D(getBaseIsaDir(context), "base.art");
    }

    public static long getBaseAppImageLastModifield(Context context) {
        return getBaseAppImage(context).lastModified();
    }

    public static long getBaseAppImageSize(Context context) {
        return getBaseAppImage(context).length();
    }

    public static File getBaseDM(Context context) {
        return AnonymousClass001.A0D(getApkDir(context), "base.dm");
    }

    public static Long getBaseDMSize(Context context) {
        return AnonymousClass001.A0P(getBaseDM(context));
    }

    public static File getBaseIsaDir(Context context) {
        File apkDir = getApkDir(context);
        if (apkDir == null) {
            return null;
        }
        return AnonymousClass001.A0D(apkDir, "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static File getBaseOdex(Context context) {
        return AnonymousClass001.A0D(getBaseIsaDir(context), "base.odex");
    }

    public static long getBaseOdexLastModifield(Context context) {
        return getBaseOdex(context).lastModified();
    }

    public static long getBaseOdexSize(Context context) {
        return getBaseOdex(context).length();
    }

    public static File getBaseVdex(Context context) {
        return AnonymousClass001.A0D(getBaseIsaDir(context), "base.vdex");
    }

    public static long getBaseVdexLastModifield(Context context) {
        return getBaseVdex(context).lastModified();
    }

    public static long getBaseVdexSize(Context context) {
        return getBaseVdex(context).length();
    }

    public static Long getBaselineProfileInDMSize(Context context) {
        Long l;
        synchronized (DexStoreUtils.class) {
            l = DM_BASELINE_PROFILE_SIZE;
            if (l == null) {
                File baseDM = getBaseDM(context);
                if (baseDM.length() > 0) {
                    obtainInfoFromDMFile(baseDM);
                }
                l = DM_BASELINE_PROFILE_SIZE;
            }
        }
        return l;
    }

    public static File getCurrentMainDexStorePgoProfile(Context context) {
        File mainDexStoreReferencePgoProfile = getMainDexStoreReferencePgoProfile(context);
        return !mainDexStoreReferencePgoProfile.exists() ? C0d4.A00(context).A07() : mainDexStoreReferencePgoProfile;
    }

    public static List getDexInfoFromManifest(Context context) {
        ArrayList A0s = AnonymousClass001.A0s();
        InputStream open = context.getAssets().open("secondary-program-dex-jars/metadata.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return A0s;
                    }
                    if (!readLine.startsWith(".")) {
                        String[] split = readLine.split(" ");
                        if (split.length == 3) {
                            A0s.add(split);
                        }
                    }
                } finally {
                }
            }
        } finally {
            open.close();
        }
    }

    public static String getInstallerName(Context context) {
        String str;
        Object[] objArr;
        String installerPackageName;
        synchronized (DexStoreUtils.class) {
            String str2 = INSTALLER_NAME;
            if (str2 == null) {
                PackageManager packageManager = context.getPackageManager();
                str2 = null;
                if (packageManager == null) {
                    str = "Could not get package manager";
                    objArr = new Object[0];
                } else {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            installerPackageName = packageManager.getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
                            INSTALLER_NAME = installerPackageName;
                        } else {
                            installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                            INSTALLER_NAME = installerPackageName;
                        }
                        return installerPackageName;
                    } catch (PackageManager.NameNotFoundException e) {
                        str = "Could not find package name %s";
                        objArr = new Object[]{e};
                    }
                }
                Mlog.e(str, objArr);
            }
            return str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r303 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long getLastAppInstallOrUpdateTime(android.content.Context r301) {
        /*
            java.lang.Class<com.facebook.common.dextricks.DexStoreUtils> r0 = com.facebook.common.dextricks.DexStoreUtils.class
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            java.lang.Long r0 = com.facebook.common.dextricks.DexStoreUtils.LAST_APP_INSTALL_OR_UPDATE_TIME     // Catch: java.lang.Throwable -> L74
            r303 = r0
            r0 = -1
            long r0 = (long) r0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L64
            r0 = r301
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L74
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L2f
            java.lang.String r0 = "Could not get package manager"
            r306 = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L74
            r303 = r0
        L26:
            r0 = r306
            r1 = r303
            com.facebook.common.dextricks.Mlog.e(r0, r1)     // Catch: java.lang.Throwable -> L74
            goto L70
        L2f:
            r0 = r301
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L74
            r307 = r0
            r0 = r306
            r1 = r307
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51 java.lang.Throwable -> L74
            r303 = r0
            r0 = r303
            long r0 = r0.lastUpdateTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51 java.lang.Throwable -> L74
            r308 = r0
            r0 = r308
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51 java.lang.Throwable -> L74
            r303 = r0
            r0 = r303
            com.facebook.common.dextricks.DexStoreUtils.LAST_APP_INSTALL_OR_UPDATE_TIME = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L51 java.lang.Throwable -> L74
            goto L6c
        L51:
            java.lang.String r0 = "Could not get package info for %s"
            r306 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L74
            r1 = r0
            r2 = 0
            r3 = r307
            r1[r2] = r3     // Catch: java.lang.Throwable -> L74
            r303 = r0
            goto L26
        L64:
            r0 = r303
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L74
            r304 = r0
            goto L70
        L6c:
            r0 = r303
            if (r0 != 0) goto L64
        L70:
            r0 = r302
            monitor-exit(r0)
            r0 = r304
            return r0
        L74:
            r303 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStoreUtils.getLastAppInstallOrUpdateTime(android.content.Context):long");
    }

    public static String getMainDexStoreId() {
        return MAIN_DEX_STORE_ID;
    }

    public static File getMainDexStoreLocation(Context context) {
        String str = context.getApplicationInfo().dataDir;
        String realpath = OREO_OR_NEWER ? str : DalvikInternals.realpath(str);
        if (!str.equals(realpath)) {
            Mlog.v("resolved non-canonical data directory %s to %s", str, realpath);
        }
        return new File(realpath, MAIN_DEX_STORE_ID);
    }

    public static File getMainDexStoreReferencePgoProfile(Context context) {
        File mainDexStoreLocation = getMainDexStoreLocation(context);
        C0d4.A00(context);
        return AnonymousClass001.A0D(mainDexStoreLocation, "art_pgo_ref_profile.prof");
    }

    public static DexManifest getSecondaryDexManifest(ResProvider resProvider, boolean z) {
        return DexManifest.loadManifestFrom(resProvider, SECONDARY_DEX_MANIFEST, z);
    }

    public static int getStorageKind(String str) {
        int i;
        if (str.startsWith("/data/app/")) {
            i = 1;
        } else {
            if (str.startsWith("/mnt/expand/")) {
                return 2;
            }
            i = 0;
            if (str.startsWith("/mnt/asec/")) {
                return 3;
            }
        }
        return i;
    }

    public static Long getVDexFileInDMSize(Context context) {
        Long l;
        synchronized (DexStoreUtils.class) {
            l = DM_VDEX_FILE_SIZE;
            if (l == null) {
                File baseDM = getBaseDM(context);
                if (baseDM.length() > 0) {
                    obtainInfoFromDMFile(baseDM);
                }
                l = DM_VDEX_FILE_SIZE;
            }
        }
        return l;
    }

    public static boolean isIgnoreDirtyFile(File file) {
        if (file == null) {
            return false;
        }
        return isIgnoreDirtyFileName(file.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r301.startsWith(com.facebook.common.dextricks.DexStoreUtils.IGNORE_DIRTY_CHECK_PREFIX) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isIgnoreDirtyFileName(java.lang.String r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L13
            java.lang.String r0 = "IGNORE_DIRTY_"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.startsWith(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L17
        L13:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L17:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStoreUtils.isIgnoreDirtyFileName(java.lang.String):boolean");
    }

    public static boolean isMainDexStoreId(String str) {
        return MAIN_DEX_STORE_ID.equals(str);
    }

    public static boolean isSecondaryDexManifest(String str) {
        return SECONDARY_DEX_MANIFEST.equals(str);
    }

    public static File makeIgnoreDirtyCheckFile(File file, String str) {
        return 0Pz.A02(IGNORE_DIRTY_CHECK_PREFIX, str, file);
    }

    public static void obtainInfoFromDMFile(File file) {
        synchronized (DexStoreUtils.class) {
            try {
                ZipFile zipFile = new ZipFile(file);
                ZipEntry entry = zipFile.getEntry(VDEX_FILE_NAME_IN_BASE_DM);
                if (entry != null) {
                    DM_VDEX_FILE_SIZE = Long.valueOf(entry.getSize());
                }
                ZipEntry entry2 = zipFile.getEntry(BASELINE_PROFILE_NAME);
                if (entry2 != null) {
                    DM_BASELINE_PROFILE_SIZE = Long.valueOf(entry2.getSize());
                }
            } catch (IOException e) {
                Mlog.w("error reading DM file as zip %s", e);
            }
        }
    }

    public static InputStream openSecondaryDexManifest(ResProvider resProvider) {
        return resProvider.open(SECONDARY_DEX_MANIFEST);
    }

    public static String sha1ForFile(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    fileInputStream.close();
                    return toHex(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                throw th;
            } catch (Throwable th2) {
                0Ug.A00(th, th2);
                throw th;
            }
        }
    }

    public static String toHex(byte[] bArr) {
        StringBuilder A0k = AnonymousClass001.A0k();
        char[] charArray = "0123456789abcdef".toCharArray();
        int length = bArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0k.toString();
            }
            byte b = bArr[i2];
            A0k.append(charArray[(b >> 4) & 15]);
            A0k.append(charArray[b & 15]);
            i = i2 + 1;
        }
    }
}
