package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import X.C0cx;
import X.C0d4;
import android.content.Context;
import android.util.Log;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.jit.profile.PGOUtilsNative;
import dalvik.system.DexFile;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: DexStorePgoUtils.class */
public final class DexStorePgoUtils {
    public static final String UNKNOWN_DEX_ID = "NO_DEX_ID";

    public static List A00(String str, DexFile[] dexFileArr) {
        String str2;
        if (str == null) {
            str2 = "Cannot get pgo methods since no profile was given";
        } else {
            if (dexFileArr != null && dexFileArr.length != 0) {
                File A0E = AnonymousClass001.A0E(str);
                if (!A0E.exists() || A0E.length() <= 0) {
                    AnonymousClass001.A1G("Cannot get pgo methods since the given profile doesn't exist yet. Profile Path: %s", "PgoUtils", new Object[]{str});
                } else {
                    Log.d("PgoUtils", 0Pz.A0W("Getting pgo method infos from: ", str));
                    PGOUtilsNative pGOUtilsNative = PGOUtilsNative.$redex_init_class;
                }
                return Collections.emptyList();
            }
            str2 = "Cannot get pgo methods since no dex files were given";
        }
        Log.e("PgoUtils", str2);
        return Collections.emptyList();
    }

    public static void addCurrentMultidexCodePaths() {
        String[] strArr;
        DexFile[] configuredDexFiles = MultiDexClassLoader.getConfiguredDexFiles();
        if (configuredDexFiles == null) {
            strArr = new String[0];
        } else {
            int length = configuredDexFiles.length;
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = configuredDexFiles[i].getName();
            }
        }
        Log.d("PgoUtils", String.format("Adding the dex code paths to the jit: %s", Arrays.toString(strArr)));
    }

    public static File createNewMainDexStoreReferencePgoProfile(Context context) {
        return C0d4.A00(context).A08(DexStoreUtils.getMainDexStoreLocation(context));
    }

    public static void forceCleanMainDexStoreProfiles(Context context) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        C0d4 A00 = C0d4.A00(context);
        File fileStreamPath = A00.A02.getFileStreamPath(C0d4.A02(A00));
        fileStreamPath.delete();
        C0d4.A03("current", fileStreamPath);
        File A0D = AnonymousClass001.A0D(mainDexStoreLocation, "art_pgo_ref_profile.prof");
        A0D.delete();
        C0d4.A03("reference", A0D);
    }

    public static File getCurrentMainDexStorePgoProfile(Context context) {
        File mainDexStoreReferencePgoProfile = getMainDexStoreReferencePgoProfile(context);
        return !mainDexStoreReferencePgoProfile.exists() ? C0d4.A00(context).A07() : mainDexStoreReferencePgoProfile;
    }

    public static String getDefaultPgoMixedModeProfileFilePathFromApkForDex(Context context, ExpectedFileInfo expectedFileInfo, DexStore.TmpDir tmpDir) {
        return getDefaultPgoMixedModeProfileFromApkForDex(context, expectedFileInfo, tmpDir).getAbsolutePath();
    }

    public static File getDefaultPgoMixedModeProfileFromApkForDex(Context context, ExpectedFileInfo expectedFileInfo, DexStore.TmpDir tmpDir) {
        String str;
        Object[] objArr;
        String str2;
        DexManifest.Dex dex = expectedFileInfo.dex;
        if (dex != null) {
            str = dex.hash;
        } else {
            Mlog.w("Cannot find dex file to use as an id", AnonymousClass001.A1Z());
            str = UNKNOWN_DEX_ID;
        }
        C0d4 A00 = C0d4.A00(context);
        File file = tmpDir.directory;
        String format = String.format("TmpPgoProfile_%s_%s", str, C0d4.A02(A00));
        File A0D = AnonymousClass001.A0D(file, format);
        if (A0D.exists()) {
            objArr = new Object[]{str, A0D.getAbsolutePath()};
            str2 = "Temp PGO profile for %s from APK already exists. Temp File: %s";
        } else {
            if (!C0d4.A05(A00.A02, A0D)) {
                throw AnonymousClass001.A0G(String.format("Could not create orig mm PGO profile for %s from APK. Temp File: %s", str, A0D.getAbsolutePath()));
            }
            objArr = new Object[]{str, format};
            str2 = "Successfully created orig mm pgo prof file for %s from APK in tmp dir. Name: %s";
        }
        AnonymousClass001.A1F(str2, "PGOProfileUtil", objArr);
        return A0D;
    }

    public static File getMainDexStoreReferencePgoProfile(Context context) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        C0d4.A00(context);
        return AnonymousClass001.A0D(mainDexStoreLocation, "art_pgo_ref_profile.prof");
    }

    public static String getMainDexStoreReferencePgoProfileFilePath(Context context) {
        return getMainDexStoreReferencePgoProfile(context).getAbsolutePath();
    }

    public static C0cx getPgoDataForMainDexStore(Context context, boolean z) {
        DexStoreUtils.getMainDexStoreLocation(context).getAbsolutePath();
        return null;
    }

    public static List getPgoMethodInfoWithDexStore(Context context) {
        DexFile[] configuredDexFiles = MultiDexClassLoader.getConfiguredDexFiles();
        File A07 = C0d4.A00(context).A07();
        return A00(A07 == null ? null : A07.getAbsolutePath(), configuredDexFiles);
    }

    public static List getPgoMethodInfoWithDexStore(String str) {
        return A00(str, MultiDexClassLoader.getConfiguredDexFiles());
    }

    public static boolean isMainDexStoreProfileChangeSignificant(Context context, boolean z) {
        DexStoreUtils.getMainDexStoreLocation(context).getAbsolutePath();
        return false;
    }
}
