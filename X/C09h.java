package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;

/* renamed from: X.09h, reason: invalid class name */
/* loaded from: 09h.class */
public final class C09h {
    public static AnonymousClass030 A00;
    public static final AnonymousClass030 A01;
    public static final AnonymousClass030 A02 = new AnonymousClass030() { // from class: X.09i
        @Override // X.AnonymousClass030
        public 08T[] AgG() {
            return new 08T[0];
        }

        @Override // X.AnonymousClass030
        public java.util.Map Ago() {
            return AnonymousClass001.A0u();
        }

        @Override // X.AnonymousClass030
        public 08U[] ArZ() {
            return new 08U[0];
        }

        @Override // X.AnonymousClass030
        public boolean CxK() {
            return false;
        }

        @Override // X.AnonymousClass030
        public boolean CxM() {
            return false;
        }
    };
    public static final C02w A03;

    static {
        AnonymousClass030 anonymousClass030 = new AnonymousClass030() { // from class: X.09j
            @Override // X.AnonymousClass030
            public 08T[] AgG() {
                return C09h.A02().AgG();
            }

            @Override // X.AnonymousClass030
            public java.util.Map Ago() {
                return C09h.A02().Ago();
            }

            @Override // X.AnonymousClass030
            public 08U[] ArZ() {
                return C09h.A02().ArZ();
            }

            @Override // X.AnonymousClass030
            public boolean CxK() {
                return C09h.A02().CxK();
            }

            @Override // X.AnonymousClass030
            public boolean CxM() {
                return C09h.A02().CxM();
            }
        };
        A01 = anonymousClass030;
        A03 = new C02w(anonymousClass030);
    }

    public static SharedPreferences A00(Context context) {
        SharedPreferences A012;
        if (context.isDeviceProtectedStorage()) {
            A012 = A01(context);
        } else {
            Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            if (createDeviceProtectedStorageContext == null) {
                return null;
            }
            A012 = A01(createDeviceProtectedStorageContext);
            if (A012 == null || A012.getAll().isEmpty()) {
                if (createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, "com.facebook.secure.switchoff")) {
                    android.util.Log.i("DefaultSwitchOffs", "Moved configs SharedPreferences from CE to DE");
                    A012 = A01(createDeviceProtectedStorageContext);
                }
                if (A012 != null) {
                    A012.edit().putInt("marker", 1).apply();
                    return A012;
                }
            }
        }
        return A012;
    }

    public static SharedPreferences A01(Context context) {
        try {
            return context.getSharedPreferences("com.facebook.secure.switchoff", 0);
        } catch (Throwable th) {
            android.util.Log.w("DefaultSwitchOffs", "Could not load SharedPreferences", th);
            return null;
        }
    }

    public static AnonymousClass030 A02() {
        AnonymousClass030 anonymousClass030;
        synchronized (C09h.class) {
            anonymousClass030 = A00;
            if (anonymousClass030 == null) {
                throw new IllegalStateException();
            }
        }
        return anonymousClass030;
    }

    public static C02w A03() {
        C02w c02w;
        synchronized (C09h.class) {
            c02w = A03;
        }
        return c02w;
    }

    public static void A04(Context context) {
        synchronized (C09h.class) {
            if (A00 == null) {
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    SharedPreferences A002 = A00(context);
                    if (A002 == null) {
                        android.util.Log.w("DefaultSwitchOffs", "Could not load last config");
                    } else {
                        String string = A002.getString("last_criteria", "");
                        String string2 = A002.getString("last_custom_config", "");
                        String string3 = A002.getString("last_deeplink_config", "");
                        A00 = new C09l(08S.A00(string3), 08U.A00(context, string), 08T.A00(string2));
                    }
                    if (A00 == null) {
                        A00 = A02;
                    }
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                }
            }
        }
    }
}
