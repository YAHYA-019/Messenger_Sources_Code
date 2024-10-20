package com.facebook.common.dextricks;

import X.0fH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0bv;
import android.content.Context;
import com.facebook.common.dextricks.OdexScheme;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: OdexSchemeIsolatedSplit.class */
public class OdexSchemeIsolatedSplit extends OdexScheme {
    public static final String TAG = "OdexSchemeIsolatedSplit";
    public File apk;
    public Context ctx;

    public OdexSchemeIsolatedSplit(File file, Context context) {
        super(0, new String[0]);
        this.apk = file;
        this.ctx = context.getApplicationContext();
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        File file2 = this.apk;
        if (file2 == null) {
            0fH.A14(TAG, "Could not find split apk path %s.", new Object[]{file2});
            return;
        }
        0fH.A17(TAG, new RuntimeImageHelper(this.ctx, file2).tryRemovingImage() ? "Removed unexpected runtime image for %s" : "Could not find any runtime images for %s", new Object[]{this.apk});
        try {
            try {
                DalvikInternals.setMadviseFileForRangeEnabled(false);
                PathClassLoader pathClassLoader = new PathClassLoader(this.apk.getCanonicalPath(), MultiDexClassLoader.SYSTEM_CLASSLOADER);
                LinkedList linkedList = new LinkedList();
                if (AnonymousClass001.A1N(C0bv.A01 ? 1 : 0)) {
                    try {
                        Object[] objArr = (Object[]) AnonymousClass002.A0J(AnonymousClass002.A0J(pathClassLoader, Class.forName("dalvik.system.BaseDexClassLoader"), "pathList"), Class.forName("dalvik.system.DexPathList"), "dexElements");
                        if (objArr != null) {
                            Field declaredField = Class.forName("dalvik.system.DexPathList$Element").getDeclaredField("dexFile");
                            declaredField.setAccessible(true);
                            for (Object obj : objArr) {
                                DexFile dexFile = (DexFile) declaredField.get(obj);
                                if (dexFile != null) {
                                    String name = dexFile.getName();
                                    if (name != null && name.contains(".apk")) {
                                        linkedList.add(dexFile);
                                    }
                                }
                            }
                        }
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        0fH.A11("DexUtils", "Could not get dex files like %", e, new Object[]{".apk"});
                    }
                } else {
                    0fH.A0n("DexUtils", "Could not call hidden apis.");
                }
                if (linkedList.isEmpty()) {
                    0fH.A14(TAG, "Could not get dex files from PCL of split %s.", new Object[]{this.apk});
                } else {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        classLoaderConfiguration.addDex((DexFile) it.next());
                    }
                }
            } catch (IOException e2) {
                0fH.A0z(TAG, "Could not getCanonicalPath of apk path for split %s.", e2, new Object[]{this.apk});
            }
        } finally {
            DalvikInternals.setMadviseFileForRangeEnabled(true);
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return TAG;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.common.dextricks.OdexScheme$Compiler] */
    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new Object();
    }
}
