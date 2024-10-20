package com.facebook.msys.mci;

import X.0Pz;
import X.0T9;
import X.1BK;
import X.1Ne;
import X.1SL;
import X.1aH;
import X.2LF;
import X.AnonymousClass001;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: AuthDataStorage.class */
public class AuthDataStorage {
    public static volatile boolean sInitialized;
    public static volatile 1aH sObjectSerializer;
    public static volatile SharedPreferences sSharedPreferences;

    static {
        1SL.A00();
    }

    public static Object getFromRawKey(String str) {
        Throwable th;
        if (!sInitialized) {
            throw AnonymousClass001.A0T("Settings have not been initialized yet. Call initialize() first");
        }
        String string = sSharedPreferences.getString(str, null);
        try {
            if (string == null) {
                android.util.Log.d("AuthDataStorage", 0Pz.A0j("Requested key ", str, " not found in auth data storage"));
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                if (string2.equals("null")) {
                    return null;
                }
                if (string2.equals("double")) {
                    String string3 = jSONObject.getString("value");
                    try {
                        return Double.valueOf(Double.parseDouble(string3));
                    } catch (NumberFormatException unused) {
                        new JSONException(0Pz.A0W("Could not parse double ", string3));
                    }
                } else if (string2.equals("float")) {
                    String string4 = jSONObject.getString("value");
                    try {
                        return Float.valueOf(Float.parseFloat(string4));
                    } catch (NumberFormatException unused2) {
                        new JSONException(0Pz.A0W("Could not parse float ", string4));
                    }
                } else if (string2.equals("int")) {
                    String string5 = jSONObject.getString("value");
                    try {
                        return Integer.valueOf(Integer.parseInt(string5));
                    } catch (NumberFormatException unused3) {
                        new JSONException(0Pz.A0W("Could not parse int ", string5));
                    }
                } else if (string2.equals("long")) {
                    String string6 = jSONObject.getString("value");
                    try {
                        return 1BK.A0n(string6);
                    } catch (NumberFormatException unused4) {
                        new JSONException(0Pz.A0W("Could not parse long ", string6));
                    }
                } else {
                    if (string2.equals("string")) {
                        return jSONObject.getString("value");
                    }
                    new JSONException(0Pz.A0W("Unsupported type of object: ", string2));
                }
                throw th;
            } catch (JSONException e) {
                throw new Exception(e);
            }
        } catch (2LF e2) {
            android.util.Log.e("AuthDataStorage", 0Pz.A0W("Error deserializing object for key ", str), e2);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.1aH] */
    public static boolean initialize(Context context) {
        boolean z;
        int i;
        synchronized (AuthDataStorage.class) {
            0T9.A02("AuthDataStorage.initialize", 1546370689);
            try {
                z = false;
                if (sInitialized) {
                    i = -76257947;
                } else {
                    sSharedPreferences = context.getSharedPreferences("msys-auth-data", 0);
                    sObjectSerializer = new Object();
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                    i = -1710046115;
                }
                0T9.A00(i);
            } catch (Throwable th) {
                0T9.A00(-1016893822);
                throw th;
            }
        }
        return z;
    }

    public static boolean isMCPEnabledForAuthDataStorage() {
        return 1Ne.A00(2);
    }

    public static native void nativeInitialize();

    public static void resetFromFacebookUserId(String str) {
        if (!sInitialized) {
            throw AnonymousClass001.A0T("Settings have not been initialized yet. Call initialize() first");
        }
        Map<String, ?> all = sSharedPreferences.getAll();
        SharedPreferences.Editor edit = sSharedPreferences.edit();
        Iterator A0y = AnonymousClass001.A0y(all);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (AnonymousClass001.A0j(A0z).startsWith(str)) {
                edit.remove(AnonymousClass001.A0j(A0z));
            }
        }
        edit.commit();
    }

    public static void setWithRawKey(String str, Object obj) {
        if (!sInitialized) {
            throw AnonymousClass001.A0T("Settings have not been initialized yet. Call initialize() first");
        }
        try {
            SharedPreferences.Editor edit = sSharedPreferences.edit();
            JSONObject jSONObject = new JSONObject();
            try {
                if (obj == null) {
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "null");
                } else if (obj instanceof Double) {
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "double");
                    jSONObject.put("value", obj.toString());
                } else if (obj instanceof Float) {
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "float");
                    jSONObject.put("value", obj.toString());
                } else if (obj instanceof Integer) {
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "int");
                    jSONObject.put("value", obj.toString());
                } else if (obj instanceof Long) {
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "long");
                    jSONObject.put("value", obj.toString());
                } else {
                    if (!(obj instanceof String)) {
                        throw new Exception(0Pz.A0W("Unsupported type of object: ", AnonymousClass001.A0Y(obj)));
                    }
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "string");
                    jSONObject.put("value", obj.toString());
                }
                edit.putString(str, jSONObject.toString()).commit();
            } catch (JSONException e) {
                throw new Exception(e);
            }
        } catch (2LF e2) {
            android.util.Log.e("AuthDataStorage", 0Pz.A0W("Error serializing object for key ", str), e2);
        }
    }
}
