package com.facebook.common.dextricks;

import X.0Pz;
import X.0QE;
import X.0Ug;
import X.0eP;
import X.0eQ;
import X.AnonymousClass001;
import X.C0d4;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.storer.Storer;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* loaded from: OdexSchemeOreo.class */
public class OdexSchemeOreo extends OdexScheme {
    public static final Set sForceUnpackSet = AnonymousClass001.A0v();
    public static final Map sOurAddedDexElements = AnonymousClass001.A0u();
    public static 0eQ sRegisteredClassLoaderCallback;
    public Context mContext;
    public HashMap mDexNameMap;
    public int mNumDexes;
    public LightweightQuickPerformanceLogger mQplCollector;
    public long mStorer;
    public IOException[] mSuppressedExceptions;
    public File mZipFile;

    /* loaded from: OdexSchemeOreo$OreoCompiler.class */
    public final class OreoCompiler extends OdexScheme.Compiler {
        public HashMap mDexNameMap;
        public long mStorer;

        public OreoCompiler(long j, HashMap hashMap) {
            this.mStorer = j;
            this.mDexNameMap = hashMap;
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            long j = 32;
            0QE.A01(j, "OdexSchemeOreo.compile", 180903662);
            try {
                String str = (String) this.mDexNameMap.get(inputDex.dex.hash);
                if (str == null) {
                    throw AnonymousClass001.A0T("Unexpected input dex!");
                }
                Storer.start(this.mStorer, str, 4);
                long j2 = this.mStorer;
                InputStream dexContents = inputDex.getDexContents();
                byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                while (true) {
                    int read = dexContents.read(bArr);
                    if (read < 0) {
                        Storer.finish(this.mStorer);
                        0QE.A00(j, 54074668);
                        return;
                    }
                    Storer.write(j2, bArr, read);
                }
            } catch (Throwable th) {
                0QE.A00(j, -2078960940);
                throw th;
            }
        }
    }

    public OdexSchemeOreo(DexManifest.Dex[] dexArr, File file, Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        super(1, new String[]{file.getName()});
        this.mContext = context;
        this.mZipFile = file;
        this.mQplCollector = lightweightQuickPerformanceLogger;
        this.mDexNameMap = makeNameMap(dexArr);
        this.mNumDexes = dexArr.length;
    }

    private String buildPrimaryDexDecoyFilename() {
        return 0Pz.A0j("p-", getPrimaryDexIdentifierString(this.mContext), ".zip");
    }

    public static void createDecoy(File file, String str) {
        long open = Storer.open(file.getPath(), 420);
        Storer.start(open, "classes.dex", 4);
        ZipFile zipFile = new ZipFile(str);
        try {
            InputStream inputStream = zipFile.getInputStream(new ZipEntry("classes.dex"));
            try {
                byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        inputStream.close();
                        zipFile.close();
                        Storer.finish(open);
                        Storer.cleanup(open);
                        return;
                    }
                    Storer.write(open, bArr, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                zipFile.close();
                throw th;
            } finally {
                0Ug.A00(th, th);
            }
        }
    }

    private Object disableReporter() {
        Object dexLoadReporter = Achilles.getDexLoadReporter();
        Achilles.setDexLoadReporter(null);
        return dexLoadReporter;
    }

    private void enableReporter(Object obj) {
        Achilles.setDexLoadReporter(obj);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.0eQ] */
    public static void enableTracingIfNeeded() {
        0eP A00;
        if (ClassTracingLogger.A00 && (A00 = 0eP.A00()) != null && sRegisteredClassLoaderCallback == null) {
            ?? obj = new Object();
            sRegisteredClassLoaderCallback = obj;
            A00.A01((0eQ) obj);
        }
    }

    public static String getPrimaryDexIdentifierString(Context context) {
        return String.valueOf(DexStore.getApkIdentifier(AnonymousClass001.A0E(context.getApplicationInfo().publicSourceDir), false));
    }

    private File getProfileFileAndInfo(boolean z) {
        File parentFile = this.mZipFile.getParentFile();
        if (parentFile == null) {
            return null;
        }
        File profileFile = getProfileFile(parentFile);
        if (profileFile != null && z && C0d4.A06) {
            serializeDex2ChecksumMap(profileFile);
        }
        return profileFile;
    }

    public static boolean isUnpackRequested(String str) {
        Set set = sForceUnpackSet;
        if (!set.contains(str)) {
            return false;
        }
        set.remove(str);
        return true;
    }

    public static HashMap makeNameMap(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        HashMap hashMap = new HashMap(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return hashMap;
            }
            hashMap.put(dexArr[i2].hash, i2 != 0 ? 0Pz.A0d("classes", DexManifest.DEX_EXT, i2 + 1) : "classes.dex");
            i = i2 + 1;
        }
    }

    public static Object recordAddedDexElement(File file, Object obj) {
        return sOurAddedDexElements.put(file.getAbsolutePath(), obj);
    }

    private void registerCodeAndProfileBgDexopt() {
        if (Build.VERSION.SDK_INT == 29) {
            registerCodeAndProfileBgDexoptWithPrimary();
            return;
        }
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        boolean isXiaomiDevice = isXiaomiDevice();
        if (isXiaomiDevice) {
            Achilles.simulateReportClassLoaderChainR(baseDexClassLoader, this.mContext.getPackageName(), VMRuntime.getRuntime().vmInstructionSet(), this.mContext.getPackageManager(), isXiaomiDevice);
        } else {
            Achilles.reportClassLoaderChain(baseDexClassLoader);
        }
    }

    private void registerCodeAndProfileBgDexoptWithPrimary() {
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        File A0D = AnonymousClass001.A0D(getMainDexStoreLocation(), buildPrimaryDexDecoyFilename());
        if (!A0D.exists()) {
            try {
                createDecoy(A0D, this.mContext.getApplicationInfo().publicSourceDir);
            } catch (IOException e) {
                Mlog.w(e, "Unable to unpack decoy, continuing without!!!!", new Object[0]);
            }
        }
        String A0j = 0Pz.A0j(A0D.getAbsolutePath(), File.pathSeparator, this.mZipFile.getAbsolutePath());
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(baseDexClassLoader);
        ArrayList A0s2 = AnonymousClass001.A0s();
        A0s2.add(A0j);
        Achilles.simulateReportClassLoaderChainQ(new String[]{this.mZipFile.getAbsolutePath()}, baseDexClassLoader, A0s, A0s2, this.mContext.getPackageName(), VMRuntime.getRuntime().vmInstructionSet(), this.mContext.getPackageManager(), isXiaomiDevice());
    }

    public static Object[] removeFromOldElements(Class cls, Object[] objArr, Object obj) {
        int length;
        if (obj != null && objArr != null && (length = objArr.length) != 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    break;
                }
                if (obj == objArr[i3]) {
                    Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) cls, length - 1);
                    int i4 = 0;
                    do {
                        Object obj2 = objArr[i];
                        if (obj != obj2) {
                            objArr2[i4] = obj2;
                            i4++;
                        }
                        i++;
                    } while (i < length);
                    return objArr2;
                }
                i2 = i3 + 1;
            }
        }
        return objArr;
    }

    public static void requestUnpack(String str) {
        sForceUnpackSet.add(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setupErrorReportingFields() {
        /*
            X.0oD r0 = X.C0fl.A00
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L5e
            X.0jV r0 = X.C0g6.A7Z
            r302 = r0
            com.facebook.common.dextricks.OdexSchemeOreo$1 r0 = new com.facebook.common.dextricks.OdexSchemeOreo$1
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r301
            r1 = r302
            r2 = r303
            r0.A02(r1, r2)
            X.0eP r0 = X.0eP.A07
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3b
            r0 = r304
            r302 = r0
            r0 = r304
            monitor-enter(r0)
            r0 = r304
            boolean r0 = r0.A06     // Catch: java.lang.Throwable -> L2f
            r305 = r0
            goto L34
        L2f:
            r303 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r303
            throw r0
        L34:
            r0 = r304
            monitor-exit(r0)
            r0 = r305
            if (r0 != 0) goto L43
        L3b:
            java.lang.Class<com.facebook.common.dextricks.OdexSchemeOreo> r0 = com.facebook.common.dextricks.OdexSchemeOreo.class
            r303 = r0
            r0 = r303
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r304 = r0
        L43:
            X.0jV r0 = X.C0g6.A8c
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L56
            java.lang.String r0 = ""
            r303 = r0
        L4f:
            r0 = r301
            r1 = r302
            r2 = r303
            r0.A01(r1, r2)
            return
        L56:
            r0 = r304
            java.lang.String r0 = r0.toString()
            r303 = r0
            goto L4f
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.setupErrorReportingFields():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fd, code lost:
    
        if (r307 != null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.IOException[] threadSafeAddDexPath(dalvik.system.BaseDexClassLoader r301, java.io.File r302) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.threadSafeAddDexPath(dalvik.system.BaseDexClassLoader, java.io.File):java.io.IOException[]");
    }

    public void addEmptyDex(Context context) {
        AssetManager assets = context.getAssets();
        String A0d = 0Pz.A0d("classes", DexManifest.DEX_EXT, this.mNumDexes + 1);
        InputStream open = assets.open("secondary-program-dex-jars/empty.dex");
        try {
            Storer.start_unaligned(this.mStorer, A0d, 4);
            long j = this.mStorer;
            byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
            while (true) {
                int read = open.read(bArr);
                if (read < 0) {
                    Storer.finish(this.mStorer);
                    open.close();
                    return;
                }
                Storer.write(j, bArr, read);
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
    }

    public void finalizeZip() {
        long j = this.mStorer;
        if (j != 0) {
            Storer.cleanup(j);
            this.mStorer = 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, java.io.File] */
    public File getMainDexStoreLocation() {
        ?? mainDexStoreLocation;
        try {
            mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(this.mContext);
            return mainDexStoreLocation;
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(mainDexStoreLocation);
        }
    }

    public File getProfileFile(File file) {
        File A0D = AnonymousClass001.A0D(file, OdexSchemeArtTurbo.OREO_ODEX_DIR);
        if (!A0D.exists() && !A0D.mkdir()) {
            DexTricksErrorReporter.reportSampledSoftError("RegisterProf", AnonymousClass001.A0Z(A0D, "Failed to mkdir for prof dir: ", AnonymousClass001.A0k()), null);
            return null;
        }
        File A02 = 0Pz.A02(this.mZipFile.getName(), ".cur.prof", A0D);
        try {
            if (A02.createNewFile()) {
                Mlog.w("Created new profile file: %s", A02);
            }
            return A02;
        } catch (IOException e) {
            DexTricksErrorReporter.reportSampledSoftError("RegisterProf", "Failed to touch new profile file", e);
            return null;
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeOreo";
    }

    public IOException[] getSuppressedExceptions() {
        return this.mSuppressedExceptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0 A[Catch: ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00d7, IllegalAccessException -> 0x00dc, InvocationTargetException -> 0x00e1, NoSuchMethodException -> 0x00e6, NoSuchFieldException -> 0x00eb, ClassNotFoundException -> 0x00f0, all -> 0x0101, TRY_ENTER, TryCatch #0 {all -> 0x0101, blocks: (B:7:0x0032, B:11:0x0041, B:13:0x0049, B:25:0x0082, B:29:0x008d, B:32:0x0099, B:42:0x00b8, B:46:0x00c4, B:49:0x00d0, B:51:0x00d6, B:66:0x00f9), top: B:6:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initializeClassLoader() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.initializeClassLoader():void");
    }

    public boolean isXiaomiDevice() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i > 30) {
            return false;
        }
        return Achilles.existsNotifyDexLoadWithStatus();
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        long open = Storer.open(this.mZipFile.getPath(), 420);
        this.mStorer = open;
        return new OreoCompiler(open, this.mDexNameMap);
    }

    public int markLoadResult(int i, boolean z) {
        int i2 = i | 8;
        if (OreoFileUtils.hasVdexOdex(this.mZipFile)) {
            i2 = i | 512 | Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        }
        File file = this.mZipFile;
        if (!z ? OreoFileUtils.getReferenceProfile(file).exists() : OreoFileUtils.getOdex(file).length() >= 4194304) {
            i2 |= Constants.LOAD_RESULT_PGO;
        }
        return i2;
    }

    public boolean needsUnpack() {
        boolean z = true;
        if (!isUnpackRequested(this.mZipFile.getAbsolutePath()) && this.mZipFile.exists()) {
            if (OreoFileUtils.isTruncated(this.mZipFile)) {
                return !OreoFileUtils.hasVdexOdex(this.mZipFile);
            }
            z = false;
        }
        return z;
    }

    public void registerCodeAndProfile(boolean z, boolean z2) {
        File profileFileAndInfo = getProfileFileAndInfo(z2);
        if (z) {
            registerCodeAndProfileBgDexopt();
            return;
        }
        if (profileFileAndInfo != null) {
            String path = profileFileAndInfo.getPath();
            String[] strArr = {this.mZipFile.getPath()};
            try {
                Method declaredMethod = VMRuntime.class.getDeclaredMethod("registerAppInfo", String.class, String[].class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, path, strArr);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                Achilles.registerAppInfo(path, strArr);
            }
        }
    }

    public void requestDexUnpack() {
        requestUnpack(this.mZipFile.getAbsolutePath());
    }

    public void serializeDex2ChecksumMap(File file) {
        Object[] objArr;
        String str;
        HashMap A0u;
        try {
            ZipFile zipFile = new ZipFile(this.mZipFile);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            A0u = AnonymousClass001.A0u();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement != null) {
                    AnonymousClass001.A1A(nextElement.getName(), A0u, (int) nextElement.getCrc());
                }
            }
            zipFile.close();
        } catch (ZipException e) {
            objArr = new Object[]{e};
            str = "Megazip file cannot be opened as a ZipFile, exception %s";
        } catch (IOException e2) {
            objArr = new Object[]{e2};
            str = "Megazip file io failed in serializeDex2ChecksumMap %s";
        }
        if (A0u.isEmpty()) {
            objArr = new Object[0];
            str = "dexname2ChecksumMap has nothing";
            Mlog.w(str, objArr);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(0Pz.A02(this.mZipFile.getName(), ".checksum", file.getParentFile()));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(A0u);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException unused) {
            Mlog.w("fail to write checksum file ", new Object[0]);
        }
    }
}
