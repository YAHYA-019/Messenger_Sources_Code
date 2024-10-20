package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import dalvik.system.DexFile;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* loaded from: OdexSchemeBoring.class */
public final class OdexSchemeBoring extends OdexScheme {

    /* loaded from: OdexSchemeBoring$BoringCompiler.class */
    public final class BoringCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public boolean mLowDiskSpace;
        public final Map mRenameTempToFinalOdexMap = AnonymousClass001.A0u();
        public final DexStore.TmpDir mTmpDir;

        public BoringCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("boring-compiler");
            this.mLowDiskSpace = AnonymousClass001.A1N(i & 32);
        }

        private void onLowDiskSpaceLikelyDetected() {
            this.mLowDiskSpace = true;
            for (File file : this.mRenameTempToFinalOdexMap.keySet()) {
                Mlog.d("Deleting odex file [success: %s]: %s", Boolean.valueOf(file.delete()), file.getAbsolutePath());
            }
            this.mRenameTempToFinalOdexMap.clear();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mTmpDir.close();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            String makeDexName = OdexSchemeBoring.makeDexName(inputDex.dex);
            String makeOdexName = OdexSchemeBoring.makeOdexName(makeDexName);
            File A0C = AnonymousClass001.A0C(this.mDexStore, makeDexName);
            File A0C2 = AnonymousClass001.A0C(this.mDexStore, makeOdexName);
            if ((this.mFlags & 1) != 0 && A0C.exists() && A0C2.exists()) {
                return;
            }
            File A0D = AnonymousClass001.A0D(this.mTmpDir.directory, makeDexName);
            String str = null;
            File A0D2 = !this.mLowDiskSpace ? AnonymousClass001.A0D(this.mTmpDir.directory, makeOdexName) : null;
            inputDex.extract(A0D);
            if (Build.VERSION.SDK_INT > 33) {
                A0D.setWritable(false);
            }
            String absolutePath = A0D.getAbsolutePath();
            if (A0D2 != null) {
                str = A0D2.getAbsolutePath();
            }
            DexFile.loadDex(absolutePath, str, 0);
            Fs.renameOrThrow(A0D, A0C);
            if (A0D2 != null) {
                if (A0D2.exists()) {
                    this.mRenameTempToFinalOdexMap.put(A0D2, A0C2);
                } else {
                    Mlog.w("Odex file does not exist (likely because dex2oat failed due to low disk space).\n Failing back to using dex file: %s\n Odex file: %s", A0C, A0D2.getAbsolutePath());
                    onLowDiskSpaceLikelyDetected();
                }
            }
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void performFinishActions() {
            Iterator A0y = AnonymousClass001.A0y(this.mRenameTempToFinalOdexMap);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                Mlog.d("Copying odex file %s to %s", ((File) A0z.getKey()).getAbsolutePath(), ((File) A0z.getValue()).getAbsolutePath());
                Fs.renameOrThrow((File) A0z.getKey(), (File) A0z.getValue());
            }
        }
    }

    public OdexSchemeBoring(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileList(dexArr));
    }

    public static String makeDexName(DexManifest.Dex dex) {
        String str = dex.assetName;
        boolean endsWith = str.endsWith(".dex.xz");
        String str2 = DexManifest.DEX_EXT;
        if (!endsWith && !str.endsWith(str2)) {
            str2 = ".dex.jar";
        }
        return 0Pz.A0j("prog-", dex.hash, str2);
    }

    public static ExpectedFileInfo[] makeExpectedFileList(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        ExpectedFileInfo[] expectedFileInfoArr = new ExpectedFileInfo[length * 2];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return expectedFileInfoArr;
            }
            DexManifest.Dex dex = dexArr[i2];
            String makeDexName = makeDexName(dex);
            int i3 = i2 * 2;
            expectedFileInfoArr[i3] = new ExpectedFileInfo(dex, makeDexName);
            int i4 = i3 + 1;
            ExpectedFileInfo expectedFileInfo = new ExpectedFileInfo(makeOdexName(makeDexName));
            expectedFileInfo.mIsOptional = true;
            expectedFileInfoArr[i4] = expectedFileInfo;
            i = i2 + 1;
        }
    }

    public static String makeOdexName(String str) {
        return 0Pz.A0W(Fs.stripLastExtension(str), DexManifest.ODEX_EXT);
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        int i = 0;
        while (true) {
            int i2 = i;
            String[] strArr = this.expectedFiles;
            if (i2 >= strArr.length) {
                return;
            }
            File A0D = AnonymousClass001.A0D(file, strArr[i2 + 1]);
            File file2 = A0D;
            if (!A0D.exists()) {
                file2 = null;
                Mlog.i("Odex %s does not exist. Skipping...", A0D);
            }
            classLoaderConfiguration.addDex(AnonymousClass001.A0D(file, this.expectedFiles[i2]), file2);
            i = i2 + 2;
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeBoring";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new BoringCompiler(dexStore, i);
    }
}
