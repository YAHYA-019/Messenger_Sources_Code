package com.facebook.common.binderhooker;

import X.0KO;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.reflect.Field;

/* loaded from: NativeBinderHooker.class */
public final class NativeBinderHooker {
    public static final Field FIELD_Parcel_mNativePtr;
    public static final 0KO ML;
    public static final boolean PLATFORM_SUPPORTED;

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    static {
        /*
            java.lang.String r0 = "NativeBinderHooker"
            r301 = r0
            X.0KO r0 = new X.0KO
            r302 = r0
            r0 = r302
            r1 = r301
            r0.<init>(r1)
            r0 = r302
            com.facebook.common.binderhooker.NativeBinderHooker.ML = r0
            boolean r0 = X.0ZY.A00
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L25
            java.lang.String r0 = "binderhookerjni"
            r301 = r0
            r0 = r301
            boolean r0 = X.C0il.A0B(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L3c
            goto L52
        L25:
            int r0 = android.os.Build.VERSION.SDK_INT
            r303 = r0
            r0 = r303
            java.lang.Object[] r0 = X.AnonymousClass001.A1a(r0)
            r305 = r0
            java.lang.String r0 = "Binder hooking is not currently supported on Android %d."
            r301 = r0
            r0 = r302
            r1 = r301
            r2 = r305
            r0.A07(r1, r2)
            goto L4c
        L3c:
            r302 = move-exception
            X.0KO r0 = com.facebook.common.binderhooker.NativeBinderHooker.ML
            r305 = r0
            java.lang.String r0 = "Can't load Binder hooker lib"
            r301 = r0
            r0 = r305
            r1 = r301
            r2 = r302
            r0.A04(r1, r2)
        L4c:
            r0 = 0
            r306 = r0
            goto L55
        L52:
            r0 = 1
            r306 = r0
        L55:
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L91
            java.lang.Class<android.os.Parcel> r0 = android.os.Parcel.class
            r305 = r0
            java.lang.String r0 = "mNativePtr"
            r301 = r0
            r0 = r305
            r1 = r301
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L73
            r301 = r0
            r0 = r301
            r1 = r304
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L73
            goto L88
        L73:
            r302 = move-exception
            X.0KO r0 = com.facebook.common.binderhooker.NativeBinderHooker.ML
            r305 = r0
            java.lang.String r0 = "Can't find Parcel mNativePtr"
            r301 = r0
            r0 = r305
            r1 = r301
            r2 = r302
            r0.A04(r1, r2)
            r0 = 0
            r304 = r0
            goto L8b
        L88:
            r0 = r301
            r307 = r0
        L8b:
            r0 = r306
            r1 = r304
            r0 = r0 & r1
            r306 = r0
        L91:
            r0 = r307
            com.facebook.common.binderhooker.NativeBinderHooker.FIELD_Parcel_mNativePtr = r0
            r0 = r306
            com.facebook.common.binderhooker.NativeBinderHooker.PLATFORM_SUPPORTED = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.binderhooker.NativeBinderHooker.m5843clinit():void");
    }

    public static int callOriginalBinderOnTransact(long j, int i, Parcel parcel, Parcel parcel2, int i2) {
        if (!isSupported()) {
            return 523;
        }
        try {
            return nativeCallOriginalBinderOnTransact(j, i, getParcelNativePtr(parcel), getParcelNativePtr(parcel2), i2);
        } catch (IllegalAccessException e) {
            ML.A04("Call original binder on transact failed", e);
            return 523;
        }
    }

    public static long fromNativeWriteBinderToParcelAndReturnParcelPtr(Object obj) {
        new Object[1][0] = obj != null ? obj.toString() : "<null binder>";
        try {
            IBinder iBinder = (IBinder) obj;
            Parcel obtain = Parcel.obtain();
            obtain.setDataPosition(0);
            obtain.writeStrongBinder(iBinder);
            obtain.setDataPosition(0);
            return getParcelNativePtr(obtain);
        } catch (ClassCastException | IllegalAccessException e) {
            ML.A0B(e, "Failed to write binder to parcel and return", new Object[0]);
            return -1;
        }
    }

    public static long getParcelNativePtr(Parcel parcel) {
        Field field = FIELD_Parcel_mNativePtr;
        if (field == null) {
            throw new IllegalAccessException();
        }
        if (parcel == null) {
            return 0L;
        }
        return field.getLong(parcel);
    }

    public static long hookBinder(Binder binder, BinderHook binderHook) {
        if (isSupported()) {
            return nativeHookBinder(binder, binderHook);
        }
        return 0L;
    }

    public static boolean isSupported() {
        return PLATFORM_SUPPORTED;
    }

    public static native int nativeCallOriginalBinderOnTransact(long j, int i, long j2, long j3, int i2);

    public static native long nativeHookBinder(Object obj, Object obj2);

    public static native boolean nativeSetupBinderHooker();

    public static native boolean nativeUnhookBinder(long j);
}
