package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.0cV;
import X.AnonymousClass001;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: OdexSchemeArtTurbo.class */
public class OdexSchemeArtTurbo extends OdexScheme {
    public static final String OREO_ODEX_DIR = "oat";
    public static boolean sAttemptedArtHackInstallation;

    /* loaded from: OdexSchemeArtTurbo$TurboArtCompiler.class */
    public final class TurboArtCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        public TurboArtCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("turbo-art-compiler");
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mTmpDir.close();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            String makeDexName = inputDex.dex.makeDexName();
            File A0C = AnonymousClass001.A0C(this.mDexStore, makeDexName);
            if ((this.mFlags & 1) == 0 || !A0C.exists()) {
                File A0D = AnonymousClass001.A0D(this.mTmpDir.directory, makeDexName);
                InputStream dexContents = inputDex.getDexContents();
                try {
                    Mlog.v("size hint for %s: %s", inputDex, Integer.valueOf(inputDex.getSizeHint(dexContents)));
                    RandomAccessFile A0I = AnonymousClass001.A0I(A0D);
                    try {
                        byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                        int i = (-1) >>> 1;
                        int i2 = 0;
                        do {
                            int A06 = 0cV.A06(dexContents, bArr, i - i2);
                            if (A06 == -1) {
                                break;
                            }
                            A0I.write(bArr, 0, A06);
                            i2 += A06;
                        } while (i2 < i);
                        A0I.close();
                        if (dexContents != null) {
                            dexContents.close();
                        }
                        Fs.renameOrThrow(A0D, AnonymousClass001.A0C(this.mDexStore, makeDexName));
                    } finally {
                    }
                } catch (Throwable th) {
                    if (dexContents != null) {
                        try {
                            dexContents.close();
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

    public OdexSchemeArtTurbo(int i, String[] strArr) {
        super(i, strArr);
    }

    public OdexSchemeArtTurbo(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, null)));
    }

    public static String getArch() {
        String str = Build.SUPPORTED_32_BIT_ABIS[0];
        String str2 = "x86";
        if (!str.equals(str2)) {
            if (!str.equals("armeabi-v7a")) {
                throw 0Pz.A08("Unknown ABI ", str);
            }
            str2 = "arm";
        }
        return str2;
    }

    public static String getOreoOdexOutputDirectory(File file, boolean z) {
        File A02 = 0Pz.A02("oat/", getArch(), file);
        if (z) {
            Fs.mkdirOrThrow(A02);
        }
        return 0Pz.A0W(A02.getPath(), "/");
    }

    public static List makeExpectedFileInfoList(DexManifest.Dex[] dexArr, String str) {
        int length = dexArr.length;
        if (str != null) {
            length++;
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            arrayList.add(new ExpectedFileInfo(dexArr[i2]));
            i = i2 + 1;
        }
        if (str != null) {
            arrayList.add(new ExpectedFileInfo(str));
        }
        return arrayList;
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, String str) {
        return makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, str));
    }

    public static String[] makeExpectedFileListFrom(List list) {
        String[] strArr;
        if (list != null) {
            int size = list.size();
            strArr = new String[size];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                strArr[i2] = ((ExpectedFileInfo) list.get(i2)).toExpectedFileString();
                i = i2 + 1;
            }
        } else {
            strArr = null;
        }
        return strArr;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i < 29) {
            i2 = 6;
        }
        if (!sAttemptedArtHackInstallation) {
            sAttemptedArtHackInstallation = true;
            try {
                int installArtHacks = DalvikInternals.installArtHacks(i2, i);
                if ((i2 & 2) != 0 && (installArtHacks & 2) == 0) {
                    DexTricksErrorReporter.reportSampledSoftError("OdexSchemeArtTurbo", 0Pz.A0W("Could not install 0x", Integer.toHexString(2)), 100, null);
                }
            } catch (Exception e) {
                Mlog.w(e, "failed to install verifier-disabling ART hacks; continuing slowly", new Object[0]);
            }
        }
        int enabledThreadArtHacks = DalvikInternals.getEnabledThreadArtHacks();
        DalvikInternals.setEnabledThreadArtHacks(i2 | enabledThreadArtHacks);
        try {
            Mlog.v("enabled ART verifier hack (warning-level logs following are expected)", new Object[0]);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                String[] strArr = this.expectedFiles;
                if (i4 >= strArr.length) {
                    DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
                    Mlog.v("restored old ART hack mask", new Object[0]);
                    return;
                } else {
                    if (!strArr[i4].equals(OREO_ODEX_DIR)) {
                        classLoaderConfiguration.addDex(new File(file, strArr[i4]), true);
                    }
                    i3 = i4 + 1;
                }
            }
        } catch (Throwable th) {
            DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
            AnonymousClass001.A1C("restored old ART hack mask");
            throw th;
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeArtTurbo";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboArtCompiler(dexStore, i);
    }
}
