package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lw, reason: invalid class name */
/* loaded from: 1lw.class */
public final class C1lw extends C08p {
    public static final 1G2 A06;
    public static final 1G2 A07;
    public static final 1G2 A08;
    public static final 1G2 A09;
    public static final 1G2 A0A;
    public static final 1G2 A0B;
    public final FbSharedPreferences A00;
    public final Context A01 = FbInjector.A00();
    public final C1m0 A02;
    public final 1HN A03;
    public final C1lx A04;
    public volatile C08q A05;

    static {
        1G2 A0D = 1G0.A05.A0D("sandbox/");
        A0A = A0D;
        1G2 A0D2 = A0D.A0D("mqtt/");
        A0B = A0D2;
        A09 = A0D2.A0D("server_tier");
        A08 = A0D2.A0D("sandbox");
        A07 = A0D2.A0D("delivery_sandbox");
        A06 = A0D2.A0D("asset_ids");
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.1m0] */
    public C1lw() {
        C1lx c1lx = (C1lx) 1Bi.A03(16780);
        this.A04 = c1lx;
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        this.A00 = fbSharedPreferences;
        3bR r0 = new 3bR(this, 13);
        this.A03 = r0;
        fbSharedPreferences.CcW(r0, ImmutableSet.A05(A07, A09, A08, C1ly.A03, A06));
        this.A05 = new C08q(new JSONObject());
        fbSharedPreferences.CcT(new Runnable() { // from class: X.1lz
            public static final String __redex_internal_original_name = "MqttConnectionConfigManager$2";

            @Override // java.lang.Runnable
            public void run() {
                C1lw c1lw = C1lw.this;
                1G2 r02 = C1lw.A0A;
                c1lw.A04();
                c1lw.A05();
            }
        });
        ?? r02 = new Object() { // from class: X.1m0
        };
        this.A02 = r02;
        c1lx.A00 = r02;
    }

    public static JSONObject A00(C1lw c1lw, 1G2 r302) {
        String A3a = c1lw.A00.A3a(r302, "");
        JSONObject jSONObject = new JSONObject();
        if (1JF.A0B(A3a)) {
            return jSONObject;
        }
        try {
            return new JSONObject(A3a);
        } catch (JSONException e) {
            0fH.A0P(C1lw.class, "", e, AnonymousClass001.A1Z());
            return jSONObject;
        }
    }

    @Override // X.C08p
    public C08q A03() {
        return this.A05;
    }

    @Override // X.C08p
    public void A04() {
        int i;
        JSONObject A00 = A00(this, C1ly.A03);
        A02(A00);
        FbSharedPreferences fbSharedPreferences = this.A00;
        1G2 r0 = A09;
        String A3a = fbSharedPreferences.A3a(r0, "default");
        1G2 r02 = A07;
        String BD0 = fbSharedPreferences.BD0(r02);
        if ("sandbox".equals(A3a) || !1JF.A0B(BD0)) {
            String BD02 = fbSharedPreferences.BD0(A08);
            if (!1JF.A0B(BD02) || !1JF.A0B(BD0)) {
                0fH.A04(C1lw.class, A3a, BD02, BD0, "MQTT config is set with tier: %s, sandbox: %s, phpsandbox: %s");
                try {
                    if (!TextUtils.isEmpty(BD02)) {
                        if (BD02.contains(":")) {
                            String[] split = BD02.split(":", 2);
                            BD02 = split[0];
                            i = Integer.parseInt(split[1]);
                        } else {
                            i = 8883;
                        }
                        if (!TextUtils.isEmpty(BD02)) {
                            A00.put("host_name_v6", BD02);
                            A00.put("default_port", i);
                            A00.put("backup_port", i);
                            A00.put("use_ssl", false);
                            A00.put("use_compression", false);
                        }
                    }
                    if (!TextUtils.isEmpty(BD0)) {
                        A00.put("php_sandbox_host_name", BD0);
                    }
                } catch (Throwable th) {
                    0fH.A0u("ConnectionConfigManager", "Failed to parse mqtt sandbox URL", th);
                }
            }
        }
        C08q c08q = new C08q(A00);
        String BD03 = fbSharedPreferences.BD0(A06);
        HashMap hashMap = new HashMap();
        if (BD03 != null) {
            try {
                JSONObject jSONObject = new JSONObject(BD03);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String A0i = AnonymousClass001.A0i(keys);
                    hashMap.put(A0i, Long.valueOf(jSONObject.getLong(A0i)));
                }
            } catch (JSONException e) {
                0fH.A0P(C1lw.class, "", e, AnonymousClass001.A1Z());
            }
        }
        c08q.A02 = hashMap;
        String A3a2 = fbSharedPreferences.A3a(r0, "default");
        String str = null;
        String BD04 = fbSharedPreferences.BD0(r02);
        if (!"sandbox".equals(A3a2) && 1JF.A0B(BD04)) {
            str = "edge-mqtt-fallback.facebook.com";
        }
        c08q.A01 = str;
        if (c08q.equals(this.A05)) {
            return;
        }
        this.A05 = c08q;
    }

    @Override // X.C08p
    public void A05() {
        Context context = this.A01;
        context.getClass();
        05S r0 = new 05S(context, (C01s) null, (05L) null, (Boolean) null);
        Intent intent = new Intent("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED");
        String packageName = context.getPackageName();
        r0.A02(intent);
        if (packageName != null) {
            05V.A01(intent, r0, packageName);
            return;
        }
        Iterator it = 1BK.A17(((AnonymousClass096) C08r.A00).A08).iterator();
        while (it.hasNext()) {
            05V.A01(intent, r0, AnonymousClass001.A0i(it));
        }
    }
}
