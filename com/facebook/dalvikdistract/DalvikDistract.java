package com.facebook.dalvikdistract;

import X.AnonymousClass001;
import X.C0il;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: DalvikDistract.class */
public final class DalvikDistract {
    public final ArrayList mTransaction = AnonymousClass001.A0s();

    /* loaded from: DalvikDistract$GenericCall.class */
    public final class GenericCall {
        public static Object[] gcSave;

        public static void enlargeGcSave() {
            Object[] objArr = gcSave;
            gcSave = objArr != null ? Arrays.copyOf(objArr, objArr.length * 2) : new Object[16];
        }

        public static native boolean getBoolean(int i, int i2);

        public static native byte getByte(int i, int i2);

        public static native char getChar(int i, int i2);

        public static native double getDouble(int i, int i2);

        public static native float getFloat(int i, int i2);

        public static native int getInt(int i, int i2);

        public static native long getLong(int i, int i2);

        public static native Object getObject(int i, int i2);

        public static native short getShort(int i, int i2);

        public static native void invokeOriginal(int i);

        public static void saveReturnValue(int i, Object obj) {
            setObject(i, -1, obj);
        }

        public static native void setBoolean(int i, int i2, boolean z);

        public static native void setByte(int i, int i2, byte b);

        public static native void setChar(int i, int i2, char c);

        public static native void setDouble(int i, int i2, double d);

        public static native void setFloat(int i, int i2, float f);

        public static native void setInt(int i, int i2, int i3);

        public static native void setLong(int i, int i2, long j);

        public static native void setObject(int i, int i2, Object obj);

        public static native void setShort(int i, int i2, short s);
    }

    /* loaded from: DalvikDistract$GenericCallHandler.class */
    public interface GenericCallHandler {
        void handleCall(Object obj, int i);
    }

    /* loaded from: DalvikDistract$IncompatibleSignatureError.class */
    public class IncompatibleSignatureError extends RuntimeException {
        public IncompatibleSignatureError(String str) {
            super(str);
        }
    }

    /* loaded from: DalvikDistract$Unsafe.class */
    public final class Unsafe {
        public final Object wrapped;

        public Unsafe(Object obj) {
            this.wrapped = obj;
        }
    }

    static {
        C0il.A0B("c++_shared");
        C0il.A0B("sigmux");
        C0il.A0B("distract");
        C0il.A0B("dalvikdistract");
    }

    public static void checkSignatureCompatibility(Object obj, Object obj2, boolean z) {
        int i;
        int i2;
        Class<?>[] extractSignature = extractSignature(obj);
        Class[] extractSignature2 = extractSignature(obj2);
        Class cls = extractSignature[0];
        extractSignature[0] = extractSignature2[0];
        extractSignature2[0] = cls;
        int length = extractSignature2.length;
        int length2 = extractSignature.length;
        if (length > length2) {
            throw new RuntimeException(String.format("Argument length mismatch: hook may not accept more arguments than the original method.  Hook (%s) accepts %s arguments; original (%s) accepts %s", obj2, Integer.valueOf(length - 1), obj, Integer.valueOf(length2 - 1)));
        }
        while (true) {
            i2 = i;
            if (i2 >= length) {
                return;
            } else {
                i = (extractSignature2[i2].isAssignableFrom(extractSignature[i2]) || (z && extractSignature[i2] == Object.class && !extractSignature2[i2].isPrimitive())) ? i2 + 1 : 0;
            }
        }
        throw new RuntimeException(String.format("%s cannot substitute for %s", extractSignature[i2], extractSignature2[i2]));
    }

    public static Object cleanupMm(int i, Object obj) {
        nativeCleanupMm(i);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[LOOP:0: B:13:0x0064->B:15:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Class[] extractSignature(java.lang.Object r301) {
        /*
            r0 = r301
            boolean r0 = r0 instanceof java.lang.reflect.Method
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L8a
            r0 = r301
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r301 = r0
            r0 = r301
            java.lang.Class r0 = r0.getReturnType()
            r303 = r0
            r0 = r301
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L93
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L24:
            r0 = r301
            java.lang.Class[] r0 = r0.getParameterTypes()
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = 1
            r302 = r0
            r0 = r305
            if (r0 != 0) goto L3c
            r0 = 0
            r302 = r0
            r0 = 0
            r309 = r0
        L3c:
            r0 = r302
            r1 = 1
            int r0 = r0 + r1
            r302 = r0
            r0 = r306
            int r0 = r0.length
            r310 = r0
            r0 = r302
            r1 = r310
            int r0 = r0 + r1
            r302 = r0
            r0 = r302
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r311 = r0
            r0 = r311
            r1 = 0
            r2 = r303
            r0[r1] = r2
            r0 = r305
            if (r0 == 0) goto L64
            r0 = r311
            r1 = r308
            r2 = r305
            r0[r1] = r2
            r0 = 2
            r308 = r0
        L64:
            r0 = r307
            r1 = r310
            if (r0 >= r1) goto L9c
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r304 = r0
            r0 = r306
            r1 = r307
            r0 = r0[r1]
            r309 = r0
            r0 = r311
            r1 = r308
            r2 = r309
            r0[r1] = r2
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            r0 = r304
            r308 = r0
            goto L64
        L8a:
            r0 = r301
            java.lang.reflect.Executable r0 = (java.lang.reflect.Executable) r0
            r301 = r0
            java.lang.Class r0 = java.lang.Void.TYPE
            r303 = r0
        L93:
            r0 = r301
            java.lang.Class r0 = r0.getDeclaringClass()
            r305 = r0
            goto L24
        L9c:
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dalvikdistract.DalvikDistract.extractSignature(java.lang.Object):java.lang.Class[]");
    }

    public static native void nativeCleanupMm(int i);

    public static native synchronized void nativeCommit(Object[] objArr);

    public static Unsafe unsafe(Object obj) {
        return new Unsafe(obj);
    }

    public void commit() {
        String property = System.getProperty("java.vm.version");
        if (property != null && !property.startsWith("0.") && !property.startsWith("1.")) {
            throw AnonymousClass001.A0q("DalvikDistract does not yet support ART");
        }
        nativeCommit(this.mTransaction.toArray());
        this.mTransaction.clear();
    }

    public DalvikDistract hook(Object obj, Object obj2) {
        boolean z;
        boolean z2 = true;
        if (obj instanceof Unsafe) {
            obj = ((Unsafe) obj).wrapped;
            z = true;
        } else {
            z = false;
        }
        if (obj2 instanceof Unsafe) {
            obj2 = ((Unsafe) obj2).wrapped;
        } else {
            z2 = z;
        }
        if (!(obj2 instanceof GenericCallHandler)) {
            checkSignatureCompatibility(obj, obj2, z2);
        } else if (obj == null || (!(obj instanceof Constructor) && !(obj instanceof Method))) {
            throw AnonymousClass001.A0L("can hook only methods or constructors");
        }
        ArrayList arrayList = this.mTransaction;
        arrayList.add(obj);
        arrayList.add(obj2);
        return this;
    }

    public DalvikDistract hook(Object obj, Object obj2, Object obj3) {
        hook(obj, obj2);
        hook(obj3, obj);
        return this;
    }

    public DalvikDistract unhook(Constructor constructor) {
        ArrayList arrayList = this.mTransaction;
        arrayList.add(constructor);
        arrayList.add(null);
        return this;
    }

    public DalvikDistract unhook(Method method) {
        ArrayList arrayList = this.mTransaction;
        arrayList.add(method);
        arrayList.add(null);
        return this;
    }
}
