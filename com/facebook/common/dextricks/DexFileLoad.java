package com.facebook.common.dextricks;

import dalvik.system.DexFile;
import java.lang.reflect.Method;

/* loaded from: DexFileLoad.class */
public final class DexFileLoad {
    public static Method getLoadMethodWithClassLoader() {
        Method[] declaredMethods = DexFile.class.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return null;
            }
            Method method = declaredMethods[i2];
            if (method.getName().equals("loadDex") && method.getParameterTypes().length >= 5) {
                method.setAccessible(true);
                return method;
            }
            i = i2 + 1;
        }
    }

    public static void init() {
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static dalvik.system.DexFile loadDex(java.lang.String r301, java.lang.String r302, java.lang.ClassLoader r303) {
        /*
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L4a
            java.lang.reflect.Method r0 = getLoadMethodWithClassLoader()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49 java.lang.Throwable -> L49
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L4a
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49 java.lang.Throwable -> L49
            r307 = r0
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L49
            r1 = r0
            r2 = r0; r3 = r1;      // Catch: java.lang.Throwable -> L49
            r4 = 0
            r5 = r301
            r3[r4] = r5     // Catch: java.lang.Throwable -> L49
            r3 = 1
            r4 = r302
            r2[r3] = r4     // Catch: java.lang.Throwable -> L49
            r2 = r0; r3 = r1;      // Catch: java.lang.Throwable -> L49
            r4 = 2
            r5 = r307
            r3[r4] = r5     // Catch: java.lang.Throwable -> L49
            r3 = 3
            r4 = r303
            r2[r3] = r4     // Catch: java.lang.Throwable -> L49
            r2 = 4
            r3 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L49
            r307 = r0
            r0 = r305
            r1 = 0
            r2 = r307
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49 java.lang.Throwable -> L49
            r307 = r0
            r0 = r307
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49 java.lang.Throwable -> L49
            r307 = r0
            r0 = r307
            r304 = r0
            goto L4d
        L49:
        L4a:
            r0 = 0
            r306 = r0
        L4d:
            r0 = r306
            if (r0 != 0) goto L59
            r0 = r301
            r1 = r302
            r2 = 0
            dalvik.system.DexFile r0 = dalvik.system.DexFile.loadDex(r0, r1, r2)
            r304 = r0
        L59:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexFileLoad.loadDex(java.lang.String, java.lang.String, java.lang.ClassLoader):dalvik.system.DexFile");
    }
}
