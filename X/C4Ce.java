package X;

import android.util.Base64;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Ce, reason: invalid class name */
/* loaded from: 4Ce.class */
public abstract class C4Ce {
    public String A00;
    public String A01;

    public C4Ce(String str) {
        StringBuilder A0n;
        if ("".length() == 0) {
            this.A00 = 0Pz.A0W("acs_storage_manager_cached_token:", str);
            A0n = new StringBuilder();
            A0n.append("acs_storage_manager_server_config:");
            A0n.append(str);
        } else {
            this.A00 = 0Pz.A0m("acs_storage_manager_cached_token:", str, "", ':');
            A0n = AnonymousClass001.A0n("acs_storage_manager_server_config:");
            A0n.append(str);
            A0n.append(':');
            A0n.append("");
        }
        this.A01 = A0n.toString();
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [X.KSz, java.lang.Object] */
    public static final HashMap A00(C4Ce c4Ce) {
        HashMap A0u = AnonymousClass001.A0u();
        String str = c4Ce.A01;
        String string = c4Ce instanceof C4Cd ? ((C4Cd) c4Ce).A00.getString(str, "") : (String) ((C4QO) c4Ce).A00.get(str);
        if (string != null && string.length() != 0) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(AnonymousClass001.A0i(keys));
                String string2 = jSONObject2.getString("server_config_id");
                int i = jSONObject2.getInt("cipher_suite");
                byte[] decode = Base64.decode(jSONObject2.getString(DevicePkeKeypairStoreImplKt.PUBLIC_KEY_JSON_KEY), 2);
                int i2 = jSONObject2.getInt("max_evals");
                int i3 = jSONObject2.getInt("max_redemptions");
                long j = jSONObject2.getLong("config_expires_on");
                long j2 = jSONObject2.getLong("token_ttl");
                ?? obj = new Object();
                ((KSz) obj).A05 = string2;
                ((KSz) obj).A00 = i;
                ((KSz) obj).A06 = decode;
                ((KSz) obj).A01 = i2;
                ((KSz) obj).A02 = i3;
                ((KSz) obj).A03 = j;
                ((KSz) obj).A04 = j2;
                11T.A0D(string2);
                A0u.put(string2, obj);
            }
        }
        return A0u;
    }

    /* JADX WARN: Type inference failed for: r0v63, types: [X.4S2, java.lang.Object] */
    public static final HashMap A01(C4Ce c4Ce) {
        HashMap A0u = AnonymousClass001.A0u();
        String str = c4Ce.A00;
        String string = c4Ce instanceof C4Cd ? ((C4Cd) c4Ce).A00.getString(str, "") : (String) ((C4QO) c4Ce).A00.get(str);
        if (string != null && string.length() != 0) {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                JSONObject jSONObject2 = jSONObject.getJSONObject(A0i);
                HashMap A0u2 = AnonymousClass001.A0u();
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String A0i2 = AnonymousClass001.A0i(keys2);
                    Object obj = jSONObject2.get(A0i2);
                    11T.A0I(obj, 1BJ.A00(206));
                    JSONObject jSONObject3 = (JSONObject) obj;
                    String string2 = jSONObject3.getString("server_config_id");
                    byte[] decode = Base64.decode(jSONObject3.getString("nonce"), 2);
                    byte[] decode2 = Base64.decode(jSONObject3.getString("shared_secret"), 2);
                    long j = jSONObject3.getLong("token_expires_on");
                    int i = jSONObject3.getInt("max_redemptions");
                    int i2 = jSONObject3.getInt("number_redemptions");
                    ?? obj2 = new Object();
                    obj2.A03 = string2;
                    obj2.A04 = decode;
                    obj2.A05 = decode2;
                    obj2.A02 = j;
                    obj2.A00 = i;
                    obj2.A01 = i2;
                    11T.A0D(A0i2);
                    A0u2.put(A0i2, obj2);
                }
                11T.A0D(A0i);
                A0u.put(A0i, A0u2);
            }
        }
        return A0u;
    }

    public static final void A02(C4Ce c4Ce, java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            KSz kSz = (KSz) A0z.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("server_config_id", kSz.A05);
            jSONObject2.put("cipher_suite", kSz.A00);
            jSONObject2.put(DevicePkeKeypairStoreImplKt.PUBLIC_KEY_JSON_KEY, Base64.encodeToString(kSz.A06, 2));
            jSONObject2.put("max_evals", kSz.A01);
            jSONObject2.put("max_redemptions", kSz.A02);
            jSONObject2.put("config_expires_on", kSz.A03);
            jSONObject2.put("token_ttl", kSz.A04);
            jSONObject.put(A0j, jSONObject2);
        }
        String str = c4Ce.A01;
        String A02 = 11T.A02(jSONObject);
        if (!(c4Ce instanceof C4Cd)) {
            ((C4QO) c4Ce).A00.put(str, A02);
            return;
        }
        InterfaceC00051a0 AP5 = ((C4Cd) c4Ce).A00.AP5();
        AP5.CaK(str, A02);
        AP5.AGl(1);
    }

    private final void A03(java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        Iterator A0y = AnonymousClass001.A0y(map);
        int i = 0;
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            java.util.Map map2 = (java.util.Map) A0z.getValue();
            JSONObject jSONObject2 = new JSONObject();
            for (C4S2 c4s2 : map2.values()) {
                if (c4s2.A00()) {
                    if (i >= 50) {
                        break;
                    }
                    i++;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("server_config_id", c4s2.A03);
                    byte[] bArr = c4s2.A04;
                    jSONObject3.put("nonce", Base64.encodeToString(bArr, 2));
                    jSONObject3.put("shared_secret", Base64.encodeToString(c4s2.A05, 2));
                    jSONObject3.put("token_expires_on", c4s2.A02);
                    jSONObject3.put("max_redemptions", c4s2.A00);
                    jSONObject3.put("number_redemptions", c4s2.A01);
                    jSONObject2.put(Base64.encodeToString(bArr, 2), jSONObject3);
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put(A0j, jSONObject2);
            }
        }
        String str = this.A00;
        String A02 = 11T.A02(jSONObject);
        if (!(this instanceof C4Cd)) {
            ((C4QO) this).A00.put(str, A02);
            return;
        }
        InterfaceC00051a0 AP5 = ((C4Cd) this).A00.AP5();
        AP5.CaK(str, A02);
        AP5.AGl(1);
    }

    public void A04() {
        if (!(this instanceof C4Cd)) {
            ((C4QO) this).A00 = new HashMap();
            return;
        }
        C4Cd c4Cd = (C4Cd) this;
        InterfaceC00051a0 AP5 = c4Cd.A00.AP5();
        AP5.Cdi(((C4Ce) c4Cd).A00);
        AP5.Cdi(c4Cd.A01);
        AP5.AGl(1);
    }

    public void A05(C4S2 c4s2) {
        synchronized (this) {
            try {
                HashMap A01 = A01(this);
                java.util.Map map = (java.util.Map) A01.get(c4s2.A03);
                if (map != null) {
                    map.remove(Base64.encodeToString(c4s2.A04, 2));
                    A03(A01);
                }
            } catch (IllegalArgumentException | JSONException unused) {
                A04();
            }
        }
    }

    public void A06(List list) {
        synchronized (this) {
            11T.A0F(list, 0);
            try {
                HashMap A01 = A01(this);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C4S2 c4s2 = (C4S2) it.next();
                    String str = c4s2.A03;
                    java.util.Map map = (java.util.Map) A01.get(str);
                    if (map == null) {
                        map = AnonymousClass001.A0u();
                        11T.A0A(str);
                        A01.put(str, map);
                    }
                    String encodeToString = Base64.encodeToString(c4s2.A04, 2);
                    11T.A0A(encodeToString);
                    map.put(encodeToString, c4s2);
                }
                A03(A01);
            } catch (IllegalArgumentException | JSONException unused) {
                A04();
            }
        }
    }
}
