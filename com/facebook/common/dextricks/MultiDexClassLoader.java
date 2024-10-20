package com.facebook.common.dextricks;

import X.0Pz;
import X.0oD;
import X.AnonymousClass001;
import X.C0fl;
import X.C0g6;
import X.C15h;
import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.util.Log;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.fallback.FallbackDexLoader;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: MultiDexClassLoader.class */
public abstract class MultiDexClassLoader extends ClassLoader implements ColdStartAwareClassLoader, DexFileAccessLoggingClassLoader {
    public static final ClassLoader APP_CLASSLOADER;
    public static final int BASE_DEX_RETRY_WAIT_MS = 500;
    public static final Field CLASSLOADER_PARENT_FIELD;
    public static final Object INSTALL_LOCK = AnonymousClass001.A0R();
    public static final int MAX_LOAD_DEX_RETRY = 3;
    public static final ClassLoader SYSTEM_CLASSLOADER;
    public static final String TAG = "MultiDexClassLoader";
    public static final boolean USE_DALVIK_NATIVE_LOADER = true;
    public static boolean sHadFancyLoaderFailure;
    public static volatile ClassLoader sInstalledClassLoader;
    public DexFileAccessListener dexFileAccessListener;
    public ClassLoaderConfiguration mConfig;
    public final ClassLoader mPutativeLoader;
    public DexFile[] subscribedDexFiles;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class, java.lang.Class<com.facebook.common.dextricks.MultiDexClassLoader>] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    static {
        ?? r0 = MultiDexClassLoader.class;
        try {
            ClassLoader classLoader = r0.getClassLoader();
            APP_CLASSLOADER = classLoader;
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            CLASSLOADER_PARENT_FIELD = declaredField;
            declaredField.setAccessible(true);
            r0 = (ClassLoader) declaredField.get(classLoader);
            SYSTEM_CLASSLOADER = r0;
        } catch (Exception unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public MultiDexClassLoader() {
        super(SYSTEM_CLASSLOADER);
        this.dexFileAccessListener = null;
        this.subscribedDexFiles = null;
        this.mPutativeLoader = APP_CLASSLOADER;
    }

    public static boolean classInLongtailModule(String str) {
        if (sInstalledClassLoader instanceof MultiDexClassLoaderJava) {
            return NameClassifier.A01(MultiDexClassLoaderJava.sEncodedLongtailUnrenamedTypes, str);
        }
        return false;
    }

    public static ClassLoader createMultiDexClassLoader(Context context, ArrayList arrayList, ArrayList arrayList2) {
        SystemProperties.get("com.facebook.force_mdclj");
        return new MultiDexClassLoaderJava(context, arrayList, arrayList2);
    }

    public static void forceLoadProfiloIfPresent() {
        try {
            Class.forName("com.facebook.profilo.logger.api.ProfiloClassLoadTracer");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static ClassLoader get() {
        return sInstalledClassLoader;
    }

    public static ClassLoaderConfiguration getConfiguration() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (classLoader instanceof MultiDexClassLoader) {
            return ((MultiDexClassLoader) classLoader).mConfig;
        }
        return null;
    }

    public static DexFile[] getConfiguredDexFiles() {
        ClassLoader classLoader = sInstalledClassLoader;
        return !(classLoader instanceof MultiDexClassLoader) ? new DexFile[0] : ((MultiDexClassLoader) classLoader).doGetConfiguredDexFiles();
    }

    public static ClassLoader getSysClassloader() {
        return SYSTEM_CLASSLOADER;
    }

    public static boolean hadFancyLoaderFailure() {
        return sHadFancyLoaderFailure;
    }

    public static ClassLoader install(Context context, ArrayList arrayList, ArrayList arrayList2) {
        ClassLoader classLoader;
        RuntimeException A0U;
        ClassLoader classLoader2 = sInstalledClassLoader;
        if (classLoader2 != null) {
            return classLoader2;
        }
        synchronized (INSTALL_LOCK) {
            Log.v(TAG, "installing MultiDexClassLoader before application classloader");
            classLoader = sInstalledClassLoader;
            if (classLoader == null) {
                try {
                    Class.forName("com.facebook.common.dextricks.FatalDexError");
                    Class.forName("com.facebook.common.dextricks.DexFileLoadOld");
                    Class.forName("com.facebook.common.dextricks.DexFileLoadNew");
                    Class.forName("com.facebook.common.dextricks.classifier.NameClassifier");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite");
                    Class.forName("com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger");
                    Class.forName("com.facebook.common.dextricks.benchmarkhelper.ClassloadNameCollector");
                    Class.forName("com.facebook.common.dextricks.classid.ClassId");
                    Class.forName("com.facebook.common.dextricks.StringTreeSet");
                    Class.forName("com.facebook.common.dextricks.fallback.FallbackDexLoader");
                    forceLoadProfiloIfPresent();
                    0oD r0 = C0fl.A00;
                    if (r0 != null) {
                        r0.A02(AnonymousClass001.A09("recentClassLoadFailures", -2, true), new C15h() { // from class: com.facebook.common.dextricks.MultiDexClassLoader.1
                            @Override // X.C15h
                            public String get() {
                                ClassLoader classLoader3 = MultiDexClassLoader.sInstalledClassLoader;
                                return classLoader3 instanceof MultiDexClassLoader ? Arrays.toString(((MultiDexClassLoader) classLoader3).getRecentFailedClasses()) : "";
                            }
                        });
                        r0.A02(C0g6.A7Z, new C15h() { // from class: com.facebook.common.dextricks.MultiDexClassLoader.2
                            @Override // X.C15h
                            public String get() {
                                return AnonymousClass001.A0Z(MultiDexClassLoader.sInstalledClassLoader, "", AnonymousClass001.A0k());
                            }
                        });
                    }
                    classLoader = createMultiDexClassLoader(context, arrayList, arrayList2);
                } catch (ClassNotFoundException e) {
                    A0U = AnonymousClass001.A0U(e);
                }
                try {
                    CLASSLOADER_PARENT_FIELD.set(((MultiDexClassLoader) classLoader).mPutativeLoader, classLoader);
                    sInstalledClassLoader = classLoader;
                } catch (IllegalAccessException e2) {
                    A0U = AnonymousClass001.A0U(e2);
                    throw A0U;
                }
            }
        }
        return classLoader;
    }

    public static boolean isArt() {
        return true;
    }

    public static boolean isNativeHookUseable() {
        return false;
    }

    public static final boolean maybeFallbackLoadDexes(String str, Throwable th) {
        FallbackDexLoader fallbackDexLoader = FallbackDexLoader.A00;
        if (fallbackDexLoader == null) {
            return false;
        }
        String str2 = null;
        if (classInLongtailModule(str)) {
            str2 = "longtail";
        }
        return fallbackDexLoader.A03(str, str2, th);
    }

    public abstract void configure(ClassLoaderConfiguration classLoaderConfiguration);

    public void configureArtHacks(ClassLoaderConfiguration classLoaderConfiguration) {
        if (classLoaderConfiguration.disableVerifier) {
            Log.d(TAG, 0Pz.A0T("Install Art Hacks: ", 4));
            DalvikInternals.installArtHacks(4, Build.VERSION.SDK_INT);
        }
    }

    public abstract DexFile[] doGetConfiguredDexFiles();

    public ClassLoaderConfiguration getConfig() {
        return this.mConfig;
    }

    public String[] getRecentFailedClasses() {
        return new String[0];
    }

    public final Class maybeFallbackLoadClass(String str, Throwable th) {
        try {
            if (maybeFallbackLoadDexes(str, th)) {
                Class<?> findClass = findClass(str);
                if (findClass != null) {
                    return findClass;
                }
                Log.w(TAG, 0Pz.A0W("findClass failed without throwing for ", str));
            }
            if (th instanceof ClassNotFoundException) {
                throw ((ClassNotFoundException) th);
            }
            throw new ClassNotFoundException(str, th);
        } catch (RuntimeException e) {
            throw new ClassNotFoundException(0Pz.A0W("Fallback class load failed for ", str), e);
        }
    }

    public void observeDexFileLoad(DexFile dexFile, Class cls) {
        DexFile[] dexFileArr;
        DexFileAccessListener dexFileAccessListener;
        if (cls == null || (dexFileArr = this.subscribedDexFiles) == null || (dexFileAccessListener = this.dexFileAccessListener) == null) {
            return;
        }
        int length = dexFileArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            if (dexFile == dexFileArr[i2]) {
                dexFileAccessListener.onClassLoadedFromDexFile(cls, dexFile);
                return;
            }
            i = i2 + 1;
        }
    }

    @Override // com.facebook.common.dextricks.ColdStartAwareClassLoader
    public void onColdstartDone() {
    }

    @Override // com.facebook.common.dextricks.DexFileAccessLoggingClassLoader
    public void subscribeToDexFileAccesses(DexFile[] dexFileArr, DexFileAccessListener dexFileAccessListener) {
        this.subscribedDexFiles = dexFileArr;
        this.dexFileAccessListener = dexFileAccessListener;
    }

    public String verboseDescription() {
        return TAG;
    }
}
