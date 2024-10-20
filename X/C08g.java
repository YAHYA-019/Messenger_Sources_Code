package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.common.dextricks.DexStore;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.08g, reason: invalid class name */
/* loaded from: 08g.class */
public abstract class C08g {
    public static final String A00 = 0Pz.A0T("Null metadata in caller identity, API=", Build.VERSION.SDK_INT);

    public static 0EY A00(Context context, Intent intent) {
        return A01(context, intent, null, DexStore.DAYS_TO_MS_FACTOR);
    }

    public static 0EY A01(Context context, Intent intent, C0w6 c0w6, int i) {
        String str;
        if (intent == null) {
            str = "Null launching intent.";
        } else {
            String str2 = null;
            String str3 = null;
            if (intent.hasExtra("_ci_")) {
                PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
                if (pendingIntent != null) {
                    String creatorPackage = pendingIntent.getCreatorPackage();
                    int creatorUid = pendingIntent.getCreatorUid();
                    if (creatorPackage == null) {
                        return null;
                    }
                    try {
                        02C A02 = 09Q.A02(context, creatorPackage);
                        try {
                            String str4 = (String) PendingIntent.class.getMethod("getTag", String.class).invoke(pendingIntent, "");
                            if (str4 != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(str4, 11), "UTF-8"));
                                    if (jSONObject.has("d")) {
                                        str3 = jSONObject.getString("d");
                                    }
                                    if (jSONObject.has("v")) {
                                        str2 = jSONObject.getString("v");
                                    }
                                    long j = -1;
                                    long parseLong = jSONObject.has("t") ? Long.parseLong(jSONObject.getString("t")) : -1;
                                    if (jSONObject.has("r")) {
                                        j = Long.parseLong(jSONObject.getString("r"));
                                    }
                                    long j2 = i;
                                    if (System.currentTimeMillis() - parseLong < j2 || SystemClock.elapsedRealtime() - j < j2) {
                                        return new 0EY(str2, str3, Collections.singletonList(creatorPackage), Collections.singletonList(A02), creatorUid);
                                    }
                                    A04(c0w6, "Caller identity has expired.", null);
                                    return null;
                                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
                                    A04(c0w6, "Error parsing metadata from caller identity.", e);
                                    return null;
                                }
                            }
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                            A04(c0w6, "Error extracting metadata from caller identity.", e2);
                        }
                        A04(c0w6, A00, null);
                        return null;
                    } catch (SecurityException e3) {
                        A04(c0w6, "Failed to get signature.", e3);
                        return null;
                    }
                }
                Bundle extras = intent.getExtras();
                str = (extras == null || extras.get("_ci_") != null) ? "Caller identity extra is not a PendingIntent." : "Null caller identity intent extra.";
            } else {
                str = "Missing caller identity intent extra.";
            }
        }
        A04(c0w6, str, null);
        return null;
    }

    public static void A02(Context context, Intent intent, C0w6 c0w6, String str) {
        try {
            A03(context, intent, str);
        } catch (0Ci e) {
            c0w6.Cg0("CallerInfoHelper", "Error attaching caller info to Intent.", e);
        }
    }

    public static void A03(Context context, Intent intent, String str) {
        String str2;
        try {
            intent.setExtrasClassLoader(context.getClassLoader());
            Bundle extras = intent.getExtras();
            if (extras == null) {
                new Bundle();
            }
            extras.setClassLoader(context.getClassLoader());
            try {
                str2 = 0EB.A01(context, context.getPackageName(), 0).A03;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                str2 = null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            String str3 = null;
            try {
                jSONObject.put("t", Long.toString(currentTimeMillis));
                jSONObject.put("r", Long.toString(elapsedRealtime));
                if (str != null) {
                    jSONObject.put("d", str);
                }
                if (str2 != null) {
                    jSONObject.put("v", str2);
                }
                str3 = Base64.encodeToString(jSONObject.toString().getBytes("UTF-8"), 11);
            } catch (UnsupportedEncodingException | JSONException unused2) {
            }
            05Y r0 = new 05Y();
            r0.A0A = str3;
            r0.A03 = new ComponentName(context, "com.facebook.invalid_class.f4c3b00c");
            PendingIntent A01 = r0.A01(context, 0, 1140850688);
            if (A01 == null) {
                throw new Exception("Failed to generate CallerInfo metadata.");
            }
            extras.putParcelable("_ci_", A01);
            intent.putExtras(extras);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void A04(C0w6 c0w6, String str, Throwable th) {
        if (c0w6 != null) {
            c0w6.Cg0("CallerInfoHelper", str, th);
        }
    }
}
