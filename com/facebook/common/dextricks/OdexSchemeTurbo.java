package com.facebook.common.dextricks;

import X.0Pz;
import X.0Ug;
import X.0cV;
import X.AnonymousClass001;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.forker.ProcessBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: OdexSchemeTurbo.class */
public class OdexSchemeTurbo extends OdexScheme {

    /* loaded from: OdexSchemeTurbo$TurboCompiler.class */
    public final class TurboCompiler extends OdexScheme.Compiler {
        public final TurboDexOptRunner mDexOptRunner;
        public final DexStore mDexStore;
        public final File mDummyZip;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        public TurboCompiler(DexStore dexStore, int i) {
            this.mDexOptRunner = new TurboDexOptRunner(dexStore.root);
            this.mDexStore = dexStore;
            this.mFlags = i;
            DexStore.TmpDir makeTemporaryDirectory = dexStore.makeTemporaryDirectory("turbo-compiler");
            this.mTmpDir = makeTemporaryDirectory;
            try {
                File A0D = AnonymousClass001.A0D(makeTemporaryDirectory.directory, "dummy.zip");
                this.mDummyZip = A0D;
                OdexSchemeTurbo.makeDummyZip(A0D);
            } catch (Throwable th) {
                Fs.safeClose(this.mTmpDir);
                throw th;
            }
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mDexOptRunner.cleanup();
            this.mTmpDir.close();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            String makeDexName = OdexSchemeTurbo.makeDexName(inputDex.dex);
            String makeOdexName = OdexSchemeTurbo.makeOdexName(makeDexName);
            File A0C = AnonymousClass001.A0C(this.mDexStore, makeDexName);
            File A0C2 = AnonymousClass001.A0C(this.mDexStore, makeOdexName);
            if ((this.mFlags & 1) != 0 && A0C.exists() && A0C2.exists()) {
                return;
            }
            File A0D = AnonymousClass001.A0D(this.mTmpDir.directory, makeOdexName);
            InputStream dexContents = inputDex.getDexContents();
            try {
                int sizeHint = inputDex.getSizeHint(dexContents);
                Mlog.v("size hint for %s: %s", inputDex, Integer.valueOf(sizeHint));
                RandomAccessFile A0I = AnonymousClass001.A0I(A0D);
                try {
                    try {
                        this.mDexOptRunner.run(dexContents, sizeHint, makeDexName, A0I, "quick", null);
                        A0I.close();
                        if (dexContents != null) {
                            dexContents.close();
                        }
                        Fs.linkAtomic(this.mDummyZip, AnonymousClass001.A0C(this.mDexStore, makeDexName));
                        Fs.renameOrThrow(A0D, AnonymousClass001.A0C(this.mDexStore, makeOdexName));
                    } catch (InterruptedException unused) {
                        throw new AssertionError();
                    }
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

    /* loaded from: OdexSchemeTurbo$TurboDexOptRunner.class */
    public final class TurboDexOptRunner extends DexOptRunner {
        public final byte[] mBuffer;
        public final DexStore.Config mDsConfig;

        public TurboDexOptRunner(DexStore.Config config, File file) {
            super(file);
            this.mBuffer = new byte[65536];
            this.mDsConfig = config;
        }

        public TurboDexOptRunner(File file) {
            super(file);
            this.mBuffer = new byte[65536];
            this.mDsConfig = null;
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public void addDexOptOptions(ProcessBuilder processBuilder) {
            DexStore.Config config = this.mDsConfig;
            if (config != null) {
                OdexSchemeTurbo.addConfiguredDexOptOptions(config, processBuilder);
            }
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            byte[] bArr = this.mBuffer;
            int i2 = (-1) >>> 1;
            int i3 = 0;
            do {
                int A06 = 0cV.A06(inputStream, bArr, i2 - i3);
                if (A06 == -1) {
                    break;
                }
                randomAccessFile.write(bArr, 0, A06);
                i3 += A06;
            } while (i3 < i2);
            return i3;
        }
    }

    public OdexSchemeTurbo(int i, DexManifest.Dex[] dexArr) {
        super(i, makeExpectedFileList(dexArr));
    }

    public OdexSchemeTurbo(DexManifest.Dex[] dexArr) {
        this(8, dexArr);
    }

    public static void addConfiguredDexOptOptions(DexStore.Config config, ProcessBuilder processBuilder) {
        String str;
        String str2;
        String str3;
        byte b = config.dalvikVerify;
        if (b != 0) {
            if (b == 1) {
                Mlog.i("using DALVIK_VERIFY_NONE as requested in config file", new Object[0]);
                str3 = "-Vn";
            } else if (b == 2) {
                Mlog.i("using DALVIK_VERIFY_REMOTE as requested in config file", new Object[0]);
                str3 = "-Vr";
            } else if (b != 3) {
                Mlog.w("ignoring unknown Dalvik verify value %s in config file", Byte.valueOf(b));
            } else {
                Mlog.i("using DALVIK_VERIFY_ALL as requested in config file", new Object[0]);
                str3 = "-Va";
            }
            processBuilder.addArgument(str3);
        }
        byte b2 = config.dalvikOptimize;
        if (b2 != 0) {
            if (b2 == 1) {
                Mlog.i("using DALVIK_OPT_NONE as requested in config file", new Object[0]);
                str2 = "-On";
            } else if (b2 == 2) {
                Mlog.i("using DALVIK_OPT_VERIFIED as requested in config file", new Object[0]);
                str2 = "-Ov";
            } else if (b2 == 3) {
                Mlog.i("using DALVIK_OPT_ALL as requested in config file", new Object[0]);
                str2 = "-Oa";
            } else if (b2 != 4) {
                Mlog.w("ignoring unknown Dalvik optimize value %s in config file", Byte.valueOf(b2));
            } else {
                Mlog.i("using DALVIK_OPT_FULL as requested in config file", new Object[0]);
                str2 = "-Of";
            }
            processBuilder.addArgument(str2);
        }
        byte b3 = config.dalvikRegisterMaps;
        if (b3 != 0) {
            if (b3 == 1) {
                str = "-Rn";
            } else {
                if (b3 != 2) {
                    Mlog.w("ignoring unknown Dalvik register map value %s in config file", Byte.valueOf(b3));
                    return;
                }
                str = "-Ry";
            }
            processBuilder.addArgument(str);
        }
    }

    public static String makeDexName(DexManifest.Dex dex) {
        return 0Pz.A0j("prog-", dex.hash, ".dex.jar");
    }

    public static void makeDummyZip(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            try {
                zipOutputStream.putNextEntry(new ZipEntry("META-INF/MANIFEST.MF"));
                PrintStream printStream = new PrintStream(zipOutputStream);
                try {
                    printStream.println("Manifest-Version: 1.0");
                    printStream.println("Created-By: OdexSchemeTurbo");
                    printStream.flush();
                    printStream.close();
                    printStream.close();
                    zipOutputStream.close();
                    fileOutputStream.close();
                } finally {
                }
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

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        String[] strArr = new String[length * 2];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return strArr;
            }
            String makeDexName = makeDexName(dexArr[i2]);
            int i3 = i2 * 2;
            strArr[i3] = makeDexName;
            strArr[i3 + 1] = makeOdexName(makeDexName);
            i = i2 + 1;
        }
    }

    public static String makeOdexName(String str) {
        return 0Pz.A0W(Fs.stripLastExtension(str), DexManifest.ODEX_EXT);
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public final void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        int i = 0;
        while (true) {
            int i2 = i;
            String[] strArr = this.expectedFiles;
            if (i2 >= strArr.length) {
                return;
            }
            classLoaderConfiguration.addDex(AnonymousClass001.A0D(file, strArr[i2]), AnonymousClass001.A0D(file, this.expectedFiles[i2 + 1]));
            i = i2 + 2;
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeTurbo";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboCompiler(dexStore, i);
    }
}
