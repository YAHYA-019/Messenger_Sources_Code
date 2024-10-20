package com.facebook.advancedcryptotransport;

import X.0fH;
import X.1Fi;
import X.1Oy;
import X.InterfaceC00051a0;
import android.content.Context;

/* loaded from: PlatformStorageProvider.class */
public class PlatformStorageProvider {
    public static volatile 1Fi sSharedPrefs;

    public static void initialize(Context context) {
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs == null) {
                sSharedPrefs = 1Oy.A00(context);
            }
        }
    }

    public static Object platformStorageGetValue(String str) {
        synchronized (PlatformStorageProvider.class) {
            Object obj = null;
            if (sSharedPrefs == null || !sSharedPrefs.contains(str)) {
                if (sSharedPrefs == null) {
                    0fH.A18("PlatformStorageProvider", "sSharedPrefs not ready when platformStorageGetValue is called. key=%s", new Object[]{str});
                }
                return null;
            }
            try {
                obj = Integer.valueOf(sSharedPrefs.getInt(str, 0));
            } catch (RuntimeException unused) {
                try {
                    obj = Boolean.valueOf(sSharedPrefs.getBoolean(str, false));
                } catch (RuntimeException unused2) {
                    try {
                        obj = Double.valueOf(sSharedPrefs.AiA(str, 0.0d));
                    } catch (RuntimeException unused3) {
                        try {
                            obj = Long.valueOf(sSharedPrefs.getLong(str, 0L));
                        } catch (RuntimeException unused4) {
                            try {
                                obj = sSharedPrefs.getString(str, (String) null);
                            } catch (RuntimeException unused5) {
                            }
                        }
                    }
                }
            }
            return obj;
        }
    }

    public static void platformStorageRemoveValue(String str) {
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs != null && sSharedPrefs.contains(str)) {
                InterfaceC00051a0 AP5 = sSharedPrefs.AP5();
                AP5.Cdi(str);
                AP5.apply();
            } else if (sSharedPrefs == null) {
                0fH.A18("PlatformStorageProvider", "sSharedPrefs not ready when platformStorageRemoveValue is called. key=%s", new Object[]{str});
            }
        }
    }

    public static void platformStorageSaveValue(String str, Object obj) {
        InterfaceC00051a0 AP5;
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs == null) {
                0fH.A18("PlatformStorageProvider", "sSharedPrefs not ready when platformStorageSaveValue is called, key=%s", new Object[]{str});
            } else {
                if (obj instanceof Integer) {
                    AP5 = sSharedPrefs.AP5();
                    AP5.CaD(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    AP5 = sSharedPrefs.AP5();
                    AP5.Ca2(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    AP5 = sSharedPrefs.AP5();
                    AP5.Ca6(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    AP5 = sSharedPrefs.AP5();
                    AP5.CaG(str, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    AP5 = sSharedPrefs.AP5();
                    AP5.CaK(str, (String) obj);
                }
                AP5.apply();
            }
        }
    }
}
