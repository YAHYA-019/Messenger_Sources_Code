package com.google.android.gms.common.util;

/* loaded from: DeviceProperties.class */
public abstract class DeviceProperties {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 30) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(android.content.Context r301) {
        /*
            r0 = r301
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r302 = r0
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2c
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            java.lang.String r0 = "android.hardware.type.watch"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.hasSystemFeature(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L23
            r0 = 1
            r304 = r0
        L23:
            r0 = r304
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r303 = r0
            r0 = r303
            com.google.android.gms.common.util.DeviceProperties.A00 = r0
        L2c:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.A01
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L5c
            r0 = 0
            r307 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r305 = r0
            java.lang.String r0 = "cn.google"
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.hasSystemFeature(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L52
            r0 = 1
            r307 = r0
        L52:
            r0 = r307
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r303 = r0
            r0 = r303
            com.google.android.gms.common.util.DeviceProperties.A01 = r0
        L5c:
            r0 = r303
            boolean r0 = r0.booleanValue()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L78
            int r0 = android.os.Build.VERSION.SDK_INT
            r307 = r0
            r0 = 30
            r304 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            r1 = r304
            if (r0 >= r1) goto L7d
        L78:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L7d:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.A00(android.content.Context):boolean");
    }
}
