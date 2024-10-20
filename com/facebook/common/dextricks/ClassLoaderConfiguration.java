package com.facebook.common.dextricks;

import X.AnonymousClass001;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: ClassLoaderConfiguration.class */
public class ClassLoaderConfiguration {
    public static final int BASE_DEX_RETRY_WAIT_MS = 500;
    public static final int LOAD_SECONDARY = 4;
    public static final int MAX_LOAD_DEX_RETRY = 3;
    public static final int SUPPORTS_LOCATORS = 2;
    public static final String TAG = "ClassLoaderConfiguration";
    public final int coldstartDexCount;
    public int configFlags;
    public final boolean disableVerifier;
    public final ArrayList mDexFiles = AnonymousClass001.A0s();
    public final ArrayList coldstartDexBaseNames = AnonymousClass001.A0s();

    public ClassLoaderConfiguration(int i, int i2, boolean z) {
        this.configFlags = i;
        this.coldstartDexCount = i2;
        this.disableVerifier = z;
    }

    private void appendColdstartDexBaseName(File file) {
        if (this.coldstartDexBaseNames.size() < this.coldstartDexCount) {
            String name = file.getName();
            String substring = name.substring(0, name.indexOf(46));
            this.coldstartDexBaseNames.add(substring);
            DalvikInternals.addDexBaseNames(substring);
        }
    }

    public void addDex(DexFile dexFile) {
        this.mDexFiles.add(dexFile);
    }

    public void addDex(File file) {
        addDex(file, false);
    }

    public void addDex(File file, File file2) {
        addDex(file, file2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        r301.mDexFiles.add(r0);
        appendColdstartDexBaseName(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addDex(java.io.File r302, java.io.File r303, boolean r304) {
        /*
            r301 = this;
            r0 = r302
            java.lang.String r0 = r0.getCanonicalPath()
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L13
            r0 = r303
            java.lang.String r0 = r0.getCanonicalPath()
            r306 = r0
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r307 = r0
            r0 = 33
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 < r1) goto L29
            r0 = r302
            r1 = 0
            boolean r0 = r0.setWritable(r1)
        L29:
            r0 = 0
            r309 = r0
        L2c:
            r0 = r309
            r1 = 1
            int r0 = r0 + r1
            r309 = r0
            r0 = 3
            r310 = r0
            r0 = r302
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L78
            r311 = r0
            r0 = r311
            r1 = r306
            r2 = 0
            dalvik.system.DexFile r0 = dalvik.system.DexFile.loadDex(r0, r1, r2)     // Catch: java.io.IOException -> L78
            r312 = r0
            r0 = r304
            if (r0 == 0) goto L4c
            goto L61
        L4c:
            r0 = r312
            if (r0 == 0) goto L6d
        L51:
            r0 = r301
            java.util.ArrayList r0 = r0.mDexFiles
            r1 = r312
            boolean r0 = r0.add(r1)
            r0 = r301
            r1 = r302
            r0.appendColdstartDexBaseName(r1)
            return
        L61:
            r0 = r312
            if (r0 != 0) goto L51
            r0 = r309
            r1 = r310
            if (r0 <= r1) goto La0
        L6d:
            java.lang.String r0 = "Could not load dex file "
            r1 = r305
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            java.io.IOException r0 = X.AnonymousClass001.A0G(r0)
            throw r0
        L78:
            r313 = move-exception
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r305
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r313
            r1[r2] = r3
            r312 = r0
            java.lang.String r0 = "ClassLoaderConfiguration Failed loading dex ( %s )"
            r311 = r0
            r0 = r311
            r1 = r312
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            r0 = r304
            if (r0 == 0) goto Lc1
            r0 = r310
            r1 = r309
            if (r0 < r1) goto Lc1
        La0:
            r0 = r309
            if (r0 <= 0) goto L2c
            r0 = r309
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = r0 * r1
            r308 = r0
            r0 = r308
            long r0 = (long) r0
            r314 = r0
            r0 = r314
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lba
            goto L2c
        Lba:
            X.AnonymousClass001.A13()
            goto L2c
        Lc1:
            r0 = r313
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ClassLoaderConfiguration.addDex(java.io.File, java.io.File, boolean):void");
    }

    public void addDex(File file, boolean z) {
        addDex(file, null, z);
    }

    public void addDexFileToClassLoaderPath(BaseDexClassLoader baseDexClassLoader) {
        Iterator it = this.mDexFiles.iterator();
        while (it.hasNext()) {
            try {
                IOException[] threadSafeAddDexPath = OdexSchemeOreo.threadSafeAddDexPath(baseDexClassLoader, AnonymousClass001.A0E(((DexFile) it.next()).getName()));
                if (threadSafeAddDexPath != null) {
                    for (IOException iOException : threadSafeAddDexPath) {
                        Mlog.e("ClassLoaderConfiguration Failed to add dex path", iOException);
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException("ClassLoaderConfigurationfail to add dex file to class loader path", e);
            }
        }
    }

    public int getConfigFlags() {
        return this.configFlags;
    }

    public int getNumberConfiguredDexFiles() {
        return this.mDexFiles.size();
    }

    public void setConfigFlags(int i) {
        this.configFlags = i;
    }
}
