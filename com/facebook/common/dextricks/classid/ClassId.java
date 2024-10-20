package com.facebook.common.dextricks.classid;

import X.AnonymousClass001;
import X.C0il;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: ClassId.class */
public class ClassId {
    public static Field javaLangClass_dexCache;
    public static Field javaLangClass_dexClassDefIndex;
    public static Method javaLangClass_getDexClassDefIndex;
    public static Field javaLangDexCache_dexFile;
    public static final ConcurrentHashMap sDexKeyToDexSignature;
    public static final boolean sInitialized;

    static {
        boolean z;
        boolean z2 = false;
        try {
            C0il.A0B("classid");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        sDexKeyToDexSignature = new ConcurrentHashMap(0, 0.9f);
        if (z) {
            synchronized (ClassId.class) {
                try {
                    Field declaredField = Class.class.getDeclaredField("dexClassDefIndex");
                    Field declaredField2 = Class.class.getDeclaredField("dexCache");
                    Class<?> cls = Class.forName("java.lang.DexCache");
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    javaLangClass_dexClassDefIndex = declaredField;
                    javaLangClass_dexCache = declaredField2;
                    Field declaredField3 = cls.getDeclaredField("dexFile");
                    declaredField3.setAccessible(true);
                    javaLangDexCache_dexFile = declaredField3;
                    getClassDef(ClassId.class);
                    if (getDexSignature(ClassId.class) == 0) {
                        throw AnonymousClass001.A0p();
                    }
                } catch (Exception unused2) {
                }
            }
            z2 = true;
        }
        sInitialized = z2;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x003a: INVOKE (r0 I:java.lang.RuntimeException) = (r0 I:java.lang.Throwable) STATIC call: X.001.A0U(java.lang.Throwable):java.lang.RuntimeException A[MD:(java.lang.Throwable):java.lang.RuntimeException (m)], block:B:21:0x003a */
    public static int getClassDef(Class cls) {
        RuntimeException A0U;
        try {
            Field field = javaLangClass_dexClassDefIndex;
            if (field != null) {
                return ((Integer) field.get(cls)).intValue();
            }
            Method method = javaLangClass_getDexClassDefIndex;
            if (method != null) {
                return ((Integer) AnonymousClass001.A0S(cls, method)).intValue();
            }
            throw new IllegalStateException();
        } catch (Exception unused) {
            throw AnonymousClass001.A0U(A0U);
        }
    }

    public static long getClassId(Class cls) {
        return !sInitialized ? -1 : (getDexSignature(cls) & 4294967295L) | (getClassDef(cls) << 32);
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00a4: INVOKE (r0 I:java.lang.RuntimeException) = (r0 I:java.lang.Throwable) STATIC call: X.001.A0U(java.lang.Throwable):java.lang.RuntimeException A[Catch: IOException | IllegalAccessException | InvocationTargetException -> 0x00a4, IOException | IllegalAccessException | InvocationTargetException -> 0x00a4, IOException | IllegalAccessException | InvocationTargetException -> 0x00a4, MD:(java.lang.Throwable):java.lang.RuntimeException (m), TRY_LEAVE], block:B:38:0x00a4 */
    public static int getDexSignature(Class cls) {
        RuntimeException A0U;
        int signatureFromDexFile_11_0_0;
        try {
            if (javaLangDexCache_dexFile == null) {
                throw new IllegalStateException();
            }
            Object obj = javaLangClass_dexCache.get(cls);
            if (obj == null) {
                return 0;
            }
            ConcurrentHashMap concurrentHashMap = sDexKeyToDexSignature;
            Number number = (Number) concurrentHashMap.get(obj);
            if (number == null) {
                long j = javaLangDexCache_dexFile.getLong(obj);
                switch (Build.VERSION.SDK_INT) {
                    case 28:
                        signatureFromDexFile_11_0_0 = getSignatureFromDexFile_9_0_0(j);
                        break;
                    case 29:
                        signatureFromDexFile_11_0_0 = getSignatureFromDexFile_10_0_0(j);
                        break;
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        signatureFromDexFile_11_0_0 = getSignatureFromDexFile_11_0_0(j);
                        break;
                    default:
                        signatureFromDexFile_11_0_0 = 0;
                        break;
                }
                number = Integer.valueOf(signatureFromDexFile_11_0_0);
                concurrentHashMap.put(obj, number);
            }
            return number.intValue();
        } catch (IOException | IllegalAccessException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(A0U);
        }
    }

    public static native int getSignatureFromDexFile_10_0_0(long j);

    public static native int getSignatureFromDexFile_11_0_0(long j);

    public static native int getSignatureFromDexFile_8_0_0(long j);

    public static native int getSignatureFromDexFile_8_1_0(long j);

    public static native int getSignatureFromDexFile_9_0_0(long j);
}
