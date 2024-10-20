package com.google.android.gms.flags.impl;

import X.0FI;
import X.1BL;
import X.KSI;
import X.LtR;
import X.Lte;
import X.Ltf;
import X.Ltg;
import X.Lth;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.flags.zzb;
import java.util.concurrent.Callable;

/* loaded from: FlagProviderImpl.class */
public class FlagProviderImpl extends zzb implements IInterface {
    public SharedPreferences A00;
    public boolean A01;

    public FlagProviderImpl() {
        this(0);
        int A03 = 0FI.A03(-1741199633);
        this.A01 = false;
        0FI.A09(-1023645763, A03);
    }

    public FlagProviderImpl(int i) {
        int A03 = 0FI.A03(579507904);
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        0FI.A09(-948036037, A03);
        0FI.A09(908346635, 0FI.A03(2060808163));
    }

    public static Object A00(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        Boolean bool;
        int A03 = 0FI.A03(-2070042418);
        if (!this.A01) {
            0FI.A09(1788763518, A03);
            return z;
        }
        SharedPreferences sharedPreferences = this.A00;
        ?? valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) A00(new Lte(sharedPreferences, valueOf, str));
            bool = valueOf;
        } catch (Exception unused) {
            Log.w("FlagDataUtils", 1BL.A0s("Flag value not available, returning default: ", valueOf.getMessage()));
            bool = valueOf;
        }
        boolean booleanValue = bool.booleanValue();
        0FI.A09(1630667707, A03);
        return booleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    public int getIntFlagValue(String str, int i, int i2) {
        Number number;
        int A03 = 0FI.A03(2065136014);
        if (!this.A01) {
            0FI.A09(-697527951, A03);
            return i;
        }
        SharedPreferences sharedPreferences = this.A00;
        ?? valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) A00(new Ltf(sharedPreferences, valueOf, str));
            number = valueOf;
        } catch (Exception unused) {
            Log.w("FlagDataUtils", 1BL.A0s("Flag value not available, returning default: ", valueOf.getMessage()));
            number = valueOf;
        }
        int intValue = number.intValue();
        0FI.A09(716281568, A03);
        return intValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    public long getLongFlagValue(String str, long j, int i) {
        Number number;
        int A03 = 0FI.A03(-2136135437);
        if (!this.A01) {
            0FI.A09(1634664166, A03);
            return j;
        }
        SharedPreferences sharedPreferences = this.A00;
        ?? valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) A00(new Ltg(sharedPreferences, valueOf, str));
            number = valueOf;
        } catch (Exception unused) {
            Log.w("FlagDataUtils", 1BL.A0s("Flag value not available, returning default: ", valueOf.getMessage()));
            number = valueOf;
        }
        long longValue = number.longValue();
        0FI.A09(-2105866292, A03);
        return longValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    public String getStringFlagValue(String str, String str2, int i) {
        String str3;
        int A03 = 0FI.A03(-1939083101);
        if (!this.A01) {
            0FI.A09(440927957, A03);
            return str2;
        }
        ?? r0 = this.A00;
        try {
            r0 = (String) A00(new Lth(r0, str, str2));
            str3 = r0;
        } catch (Exception unused) {
            Log.w("FlagDataUtils", 1BL.A0s("Flag value not available, returning default: ", r0.getMessage()));
            str3 = str2;
        }
        0FI.A09(-1556420234, A03);
        return str3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, android.content.Context] */
    public void init(IObjectWrapper iObjectWrapper) {
        int i;
        SharedPreferences sharedPreferences;
        int A03 = 0FI.A03(-1400581887);
        ?? r0 = (Context) ObjectWrapper.A00(iObjectWrapper);
        if (this.A01) {
            i = 1138904607;
        } else {
            try {
                try {
                    Context createPackageContext = r0.createPackageContext("com.google.android.gms", 0);
                    synchronized (SharedPreferences.class) {
                        sharedPreferences = KSI.A00;
                        if (sharedPreferences == null) {
                            sharedPreferences = (SharedPreferences) A00(new LtR(createPackageContext));
                            KSI.A00 = sharedPreferences;
                        }
                    }
                    this.A00 = sharedPreferences;
                    this.A01 = true;
                    i = -752775161;
                } catch (Exception unused) {
                    Log.w("FlagProviderImpl", 1BL.A0s("Could not retrieve sdk flags, continuing with defaults: ", r0.getMessage()));
                    i = -537315490;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                0FI.A09(190901158, A03);
                return;
            }
        }
        0FI.A09(i, A03);
    }
}
