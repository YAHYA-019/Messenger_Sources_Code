package com.facebook.common.dextricks;

import X.0Pz;

/* loaded from: ReflectionClassLoaderJava.class */
public final class ReflectionClassLoaderJava extends ReflectionClassLoader {
    private ClassNotFoundException createCNFE(String str) {
        return new ClassNotFoundException(str);
    }

    public ClassNotFoundException createCNFE(String str, Throwable th) {
        return new ClassNotFoundException(str, th);
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) {
        Class<?> loadClass;
        ClassLoader classLoader = this.mPutativeLoader;
        if (classLoader == null || (loadClass = classLoader.loadClass(str)) == null) {
            throw new ClassNotFoundException(0Pz.A0W("ReflectionClassLoaderJava cannot find ", str));
        }
        return loadClass;
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        Throwable th;
        try {
            if (ReflectionClassLoader.maybeFallbackLoadDexes(str)) {
                try {
                    return findClass(str);
                } catch (ClassNotFoundException unused) {
                    new ClassNotFoundException(0Pz.A0W("ReflectionClassLoaderJava cannot find ", str));
                }
            } else {
                new ClassNotFoundException(0Pz.A0W("Fallback dex load return false for class ", str));
            }
            throw th;
        } catch (RuntimeException e) {
            throw new ClassNotFoundException(0Pz.A0W("Fallback dex load failed for ", str), e);
        }
    }
}
