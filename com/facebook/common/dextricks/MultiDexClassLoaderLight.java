package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import X.C0bs;
import X.C0bu;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.fallback.FallbackDexLoader;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: MultiDexClassLoaderLight.class */
public class MultiDexClassLoaderLight extends ClassLoader {
    public static volatile MultiDexClassLoaderLight INSTANCE;
    public static final String[] REQUIRED_PRELOAD_CLASSES = {"com.facebook.common.dextricks.DexFileLoadNew", "com.facebook.common.dextricks.classifier.NameClassifier", "com.facebook.common.dextricks.StringTreeSet", "com.facebook.common.dextricks.MultiDexClassLoaderJava", "com.facebook.common.dextricks.halfnosis.Halfnosis", "com.facebook.common.dextricks.halfnosis.HalfnosisClassNotFoundException", "com.facebook.common.build.BuildConstants", "android.util.Log", "java.lang.StringBuilder"};
    public static final String TAG = "MDCLLight";
    public final DexFile mBaseApkDex;
    public final ClassLoader mPutativeLoader;

    public MultiDexClassLoaderLight(ClassLoader classLoader, DexFile dexFile, ClassLoader classLoader2) {
        super(classLoader);
        this.mBaseApkDex = dexFile;
        this.mPutativeLoader = classLoader2;
    }

    public static boolean install(ApplicationInfo applicationInfo, ClassLoader classLoader) {
        synchronized (MultiDexClassLoaderLight.class) {
            if (INSTANCE == null || INSTANCE.mPutativeLoader != classLoader) {
                try {
                    Field declaredField = ClassLoader.class.getDeclaredField("parent");
                    declaredField.setAccessible(true);
                    preloadRequiredClasses();
                    ArrayList A0s = AnonymousClass001.A0s();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    try {
                        C0bu.A01(applicationInfo, classLoader, A0s, A0s2);
                    } catch (C0bs e) {
                        Log.w(TAG, "failure to locate primary/auxiliary dexes.", e);
                        A0s.clear();
                        A0s2.clear();
                    }
                    if (A0s.isEmpty()) {
                        Log.e(TAG, "No dex primary files found, skipping install MDCLLight!");
                    } else {
                        ClassLoader parent = classLoader.getParent();
                        if (parent == null) {
                            Log.e(TAG, "Parent classloader is null, skipping install MDCLLight!");
                        } else {
                            if (A0s.size() != 1) {
                                Log.e(TAG, "More than 1 base.apk dex file found, something is unexpected!");
                            }
                            MultiDexClassLoaderLight multiDexClassLoaderLight = new MultiDexClassLoaderLight(parent, (DexFile) A0s.get(0), classLoader);
                            declaredField.set(classLoader, multiDexClassLoaderLight);
                            INSTANCE = multiDexClassLoaderLight;
                        }
                    }
                } catch (Exception e2) {
                    Log.e(TAG, "Failed to install MultiDexClassLoaderLight", e2);
                }
                return false;
            }
            Log.w(TAG, "MultiDexClassLoaderLight already installed");
            return true;
        }
    }

    public static boolean isInstalled() {
        return AnonymousClass001.A1T(INSTANCE);
    }

    private Class loadFromParent(String str) {
        try {
            return getParent().loadClass(str);
        } catch (ClassNotFoundException e) {
            Log.w(TAG, 0Pz.A0W("Failed to load class from parent: ", str), e);
            return null;
        }
    }

    private Class maybeFallbackLoadClass(String str) {
        try {
            if (!maybeFallbackLoadDexes(str)) {
                Log.e(TAG, 0Pz.A0W("Fallback load dex failed for ", str));
                return null;
            }
            ClassLoader classLoader = MultiDexClassLoader.sInstalledClassLoader;
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            Log.e(TAG, 0Pz.A0j("MDCL wasn't installed although fallback load dexes for ", str, " had succeeded!"));
            return null;
        } catch (ClassNotFoundException | RuntimeException e) {
            Log.e(TAG, 0Pz.A0W("Failed to load class from MDCL: ", str), e);
            return null;
        }
    }

    private boolean maybeFallbackLoadDexes(String str) {
        boolean A03;
        synchronized (this) {
            boolean A01 = NameClassifier.A01(MultiDexClassLoaderJava.sEncodedLongtailUnrenamedTypes, str);
            FallbackDexLoader fallbackDexLoader = FallbackDexLoader.A00;
            if (fallbackDexLoader != null) {
                String str2 = A01 ? "longtail" : null;
                Log.w(TAG, 0Pz.A0v("Trying to fallback load dex", str, " moduleHint = ", str2));
                A03 = fallbackDexLoader.A03(str, str2, null);
            } else {
                if (A01) {
                    ClassNotFoundException classNotFoundException = new ClassNotFoundException(str);
                    Log.e(TAG, 0Pz.A0j("Halfnosis class load attempts ", str, " before fallback loader is setup, this needs to be fixed!"), classNotFoundException);
                    throw classNotFoundException;
                }
                Log.w(TAG, 0Pz.A0W("tryFallbackLoadDex: fallbackLoader is null, unable to fallback load dex for ", str));
                A03 = false;
            }
        }
        return A03;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:228)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:208)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:64)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public static void preloadRequiredClasses() {
        /*
            java.lang.String[] r0 = com.facebook.common.dextricks.MultiDexClassLoaderLight.REQUIRED_PRELOAD_CLASSES     // Catch: java.lang.ClassNotFoundException -> L1f
            r301 = r0
            r0 = r301
            int r0 = r0.length     // Catch: java.lang.ClassNotFoundException -> L1f
            r302 = r0
            r0 = 0
            r303 = r0
        L9:
            r0 = r303
            r1 = r302
            if (r0 >= r1) goto L1e
            r0 = r301
            r1 = r303
            r0 = r0[r1]     // Catch: java.lang.ClassNotFoundException -> L1f
            r304 = r0
            r0 = r304
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L1f
            r0 = r303
            r1 = 1
            int r0 = r0 + r1
            r303 = r0
            goto L9
        L1e:
            return
        L1f:
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0U(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderLight.preloadRequiredClasses():void");
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) {
        Class loadClassBinaryName = DexFileLoadNew.loadClassBinaryName(this.mBaseApkDex, str, this.mPutativeLoader);
        if (loadClassBinaryName != null) {
            return loadClassBinaryName;
        }
        throw new ClassNotFoundException(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r307 != null) goto L6;
     */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class loadClass(java.lang.String r302, boolean r303) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = com.facebook.common.dextricks.classifier.NameClassifier.A00(r0)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L21
            r0 = 1
            r305 = r0
            r0 = r301
            r1 = r302
            java.lang.Class r0 = r0.loadFromParent(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L21
        L1e:
            r0 = r307
            return r0
        L21:
            r0 = r301
            dalvik.system.DexFile r0 = r0.mBaseApkDex
            r308 = r0
            r0 = r301
            java.lang.ClassLoader r0 = r0.mPutativeLoader
            r307 = r0
            r0 = r308
            r1 = r302
            r2 = r307
            java.lang.Class r0 = com.facebook.common.dextricks.DexFileLoadNew.loadClassBinaryName(r0, r1, r2)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L1e
            r0 = r305
            if (r0 != 0) goto L66
            r0 = r301
            r1 = r302
            java.lang.Class r0 = r0.loadFromParent(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L66
            java.lang.String r0 = "Class "
            r1 = r302
            java.lang.String r2 = " was loaded on parent fallback. This should be fixed and added to the shouldAskParent method."
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r308 = r0
            java.lang.String r0 = "MDCLLight"
            r307 = r0
            r0 = r307
            r1 = r308
            int r0 = android.util.Log.w(r0, r1)
        L63:
            r0 = r306
            return r0
        L66:
            r0 = r301
            r1 = r302
            java.lang.Class r0 = r0.maybeFallbackLoadClass(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L63
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r307 = r0
            r0 = r307
            r1 = r302
            r0.<init>(r1)
            r0 = r307
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderLight.loadClass(java.lang.String, boolean):java.lang.Class");
    }
}
