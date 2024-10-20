package com.facebook.common.hiddenapis.exempt;

import X.C0cZ;
import android.os.Build;
import dalvik.system.VMStack;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jdk.internal.reflect.Reflection;

/* loaded from: HiddenApis$TestGetCallingClassClass.class */
public class HiddenApis$TestGetCallingClassClass {
    public static boolean callAndCheckVMStackGetStackClass2(Method method) {
        C0cZ.A02();
        Object[] objArr = {method.getDeclaringClass(), method.getName()};
        try {
            Class cls = (Class) method.invoke(null, new Object[0]);
            if (!HiddenApis$TestGetCallingClassClass.class.equals(cls)) {
                C0cZ.A02().A07("Cannot call %s.%s on this platform. Got result: %s but expected: %s", new Object[]{method.getDeclaringClass(), method.getName(), cls, HiddenApis$TestGetCallingClassClass.class});
                return false;
            }
            C0cZ.A02();
            Object[] objArr2 = {method.getDeclaringClass(), method.getName()};
            return true;
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C0cZ.A02().A0C(e, "Cannot call %s.%s on this platform", new Object[]{method.getDeclaringClass(), method.getName()});
            return false;
        }
    }

    public static boolean testJdkInternalReflectGetCallingClass() {
        C0cZ.A02();
        try {
            Class callerClass = Reflection.getCallerClass();
            if (HiddenApis$TestGetCallingClassClass.class.equals(callerClass)) {
                C0cZ.A02();
                return true;
            }
            C0cZ.A02().A07("Cannot call jdk.internal.reflect.Reflection.getCallerClass on this platform. Got result: %s but expected: %s", new Object[]{callerClass, HiddenApis$TestGetCallingClassClass.class});
            return false;
        } catch (Throwable th) {
            C0cZ.A02().A05("Cannot call jdk.internal.reflect.Reflection.getCallerClass on this platform", th);
            return false;
        }
    }

    public static boolean testSunReflectGetCallingClass() {
        if (33 <= Build.VERSION.SDK_INT) {
            return false;
        }
        C0cZ.A02();
        try {
            Class callerClass = sun.reflect.Reflection.getCallerClass();
            if (HiddenApis$TestGetCallingClassClass.class.equals(callerClass)) {
                C0cZ.A02();
                return true;
            }
            C0cZ.A02().A07("Cannot call sun.reflect.Reflection.getCallerClass on this platform. Got result: %s but expected: %s", new Object[]{callerClass, HiddenApis$TestGetCallingClassClass.class});
            return false;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            C0cZ.A02().A05("Cannot call sun.reflect.Reflection.getCallerClass on this platform", e);
            return false;
        }
    }

    public static boolean testVMStackGetCallingClassLoader() {
        C0cZ.A02();
        try {
            ClassLoader callingClassLoader = VMStack.getCallingClassLoader();
            ClassLoader classLoader = HiddenApis$TestGetCallingClassClass.class.getClassLoader();
            if (classLoader == null || !classLoader.equals(callingClassLoader)) {
                C0cZ.A02().A07("Cannot call VMStack.getCallingClassLoader on this platform. Got result: %s but expected: %s", new Object[]{callingClassLoader, classLoader});
                return false;
            }
            C0cZ.A02();
            return false;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            C0cZ.A02().A05("Cannot call VMStack.getCallingClassLoader on this platform", e);
            return false;
        }
    }
}
