package com.facebook.common.jit.common;

import X.0Pz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: MethodInfo.class */
public class MethodInfo {
    public static final Map PRIMITIVE_TO_SIGNATURE;
    public static final Map SIGNATURE_TO_PRIMITIVE;
    public final Class cls;
    public final Constructor constructor;
    public final Method method;
    public final String name;
    public final String signature;

    static {
        HashMap hashMap = new HashMap(9);
        PRIMITIVE_TO_SIGNATURE = hashMap;
        AnonymousClass002.A0Y(hashMap);
        hashMap.put(Void.TYPE, "V");
        hashMap.put(Boolean.TYPE, "Z");
        HashMap hashMap2 = new HashMap(9);
        SIGNATURE_TO_PRIMITIVE = hashMap2;
        hashMap2.put('B', Byte.TYPE);
        hashMap2.put('C', Character.TYPE);
        hashMap2.put('S', Short.TYPE);
        hashMap2.put('I', Integer.TYPE);
        hashMap2.put('J', Long.TYPE);
        hashMap2.put('F', Float.TYPE);
        hashMap2.put('D', Double.TYPE);
        hashMap2.put('V', Void.TYPE);
        hashMap2.put('Z', Boolean.TYPE);
    }

    public MethodInfo() {
        this.cls = null;
        this.method = null;
        this.constructor = null;
        this.name = null;
        this.signature = null;
    }

    public MethodInfo(Class cls, String str, String str2) {
        this.cls = cls;
        this.method = null;
        this.constructor = null;
        this.name = str;
        this.signature = str2;
    }

    public MethodInfo(Class cls, Constructor constructor, String str, String str2) {
        this.cls = cls;
        this.method = null;
        this.constructor = constructor;
        this.name = str;
        this.signature = str2;
    }

    public MethodInfo(Class cls, Method method, String str, String str2) {
        this.cls = cls;
        this.method = method;
        this.constructor = null;
        this.name = str;
        this.signature = str2;
    }

    public static boolean addArrayType(List list, Class cls, int i) {
        if (i <= 0) {
            throw 0Pz.A06("Array count ", " is not valid", i);
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        int i2 = 0;
        do {
            A0k.append('[');
            i2++;
        } while (i2 < i);
        String obj = A0k.toString();
        String A0b = AnonymousClass001.A0b(cls, PRIMITIVE_TO_SIGNATURE);
        StringBuilder A0n = AnonymousClass001.A0n(obj);
        if (A0b == null) {
            A0n.append("L");
            A0n.append(cls.getName());
            A0b = ";";
        }
        A0n.append(A0b);
        String obj2 = A0n.toString();
        try {
            Class<?> cls2 = Class.forName(obj2);
            if (cls2 == null) {
                return false;
            }
            list.add(cls2);
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
            Log.w("JitMethodInfo", String.format("Cannot find array class: %s", obj2), e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r308 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0149, code lost:
    
        if (r308 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0173, code lost:
    
        return new com.facebook.common.jit.common.MethodInfo(r301, r308, r302, getSignature(r308.getParameterTypes(), java.lang.Void.TYPE));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.common.jit.common.MethodInfo getMethod(java.lang.Class r301, java.lang.String r302, java.lang.Class... r303) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jit.common.MethodInfo.getMethod(java.lang.Class, java.lang.String, java.lang.Class[]):com.facebook.common.jit.common.MethodInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e9, code lost:
    
        r313[1] = r314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ee, code lost:
    
        r314 = java.lang.String.format("Signature %s is malformed. Cannot get array type for %s.", r313);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.common.jit.common.MethodInfo getMethod(java.lang.String r301, java.lang.String r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jit.common.MethodInfo.getMethod(java.lang.String, java.lang.String, java.lang.String):com.facebook.common.jit.common.MethodInfo");
    }

    public static String getSignature(Class[] clsArr, Class cls) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('(');
        int length = clsArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A0k.append(')');
                return AnonymousClass001.A0d(getSignatureFromType(cls), A0k);
            }
            A0k.append(getSignatureFromType(clsArr[i2]));
            i = i2 + 1;
        }
    }

    public static String getSignatureFromType(Class cls) {
        String str;
        String A0b = AnonymousClass001.A0b(cls, PRIMITIVE_TO_SIGNATURE);
        if (A0b == null) {
            boolean isArray = cls.isArray();
            StringBuilder A0k = AnonymousClass001.A0k();
            if (isArray) {
                A0k.append("[");
                str = getSignatureFromType(cls.getComponentType());
            } else {
                A0k.append("L");
                A0k.append(cls.getName().replace('.', '/'));
                str = ";";
            }
            A0b = AnonymousClass001.A0d(str, A0k);
        }
        return A0b;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof MethodInfo)) {
            MethodInfo methodInfo = (MethodInfo) obj;
            Class cls = this.cls;
            Class cls2 = methodInfo.cls;
            if (cls != null ? cls.equals(cls2) : cls2 == null) {
                Method method = this.method;
                Method method2 = methodInfo.method;
                if (method != null ? method.equals(method2) : method2 == null) {
                    Constructor constructor = this.constructor;
                    Constructor constructor2 = methodInfo.constructor;
                    if (constructor != null ? constructor.equals(constructor2) : constructor2 == null) {
                        String str = this.name;
                        String str2 = methodInfo.name;
                        if (str != null ? str.equals(str2) : str2 == null) {
                            String str3 = this.signature;
                            String str4 = methodInfo.signature;
                            if (str3 != null ? str3.equals(str4) : str4 == null) {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.cls.hashCode() * 31) + AnonymousClass002.A04(this.method)) * 31) + AnonymousClass002.A04(this.constructor)) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.signature;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o("[ MethodInfo ");
        A0o.append("cls: ");
        Class cls = this.cls;
        A0o.append(cls != null ? cls.getName() : "<null>");
        A0o.append(", ");
        Executable executable = this.method;
        if (executable == null) {
            executable = this.constructor;
            str = executable != null ? "constructor: " : "method: ";
            A0o.append("name: ");
            A0o.append(this.name);
            A0o.append(", ");
            A0o.append("signature: ");
            A0o.append(this.signature);
            return AnonymousClass001.A0g(A0o, ']');
        }
        A0o.append(str);
        A0o.append(executable.getName());
        A0o.append(", ");
        A0o.append("name: ");
        A0o.append(this.name);
        A0o.append(", ");
        A0o.append("signature: ");
        A0o.append(this.signature);
        return AnonymousClass001.A0g(A0o, ']');
    }
}
