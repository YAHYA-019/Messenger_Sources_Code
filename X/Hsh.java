package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.common.connectionstatus.FbDataConnectionManager;
import com.facebook.http.historical.NetworkInfoMap;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: Hsh.class */
public abstract class Hsh {
    public String A00;
    public final C01s A01;
    public final 1CO A02 = AbJ.A0e();
    public final Context A03;
    public final TelephonyManager A04;
    public final 1Ex A05;
    public final FbDataConnectionManager A06;
    public final Hq4 A07;

    public Hsh(Context context, TelephonyManager telephonyManager, 1Ex r304, FbDataConnectionManager fbDataConnectionManager, C01s c01s, Hq4 hq4) {
        this.A06 = fbDataConnectionManager;
        this.A07 = hq4;
        this.A04 = telephonyManager;
        this.A03 = context;
        this.A01 = c01s;
        this.A05 = r304;
    }

    public HashMap A00() {
        5Mf r0;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("rule_version", this.A00);
        1CO r02 = this.A02;
        String BCy = r02.BCy(36874145370210592L);
        if (!TextUtils.isEmpty(BCy)) {
            A0u.put("configuration", BCy.toLowerCase(Locale.getDefault()));
        }
        NetworkInfoMap networkInfoMap = this.A07.A02;
        synchronized (networkInfoMap) {
            r0 = networkInfoMap.A02;
        }
        long j = r0 != null ? r0.A00 : -1;
        FbDataConnectionManager fbDataConnectionManager = this.A06;
        double A01 = fbDataConnectionManager.A01();
        if (j > 0) {
            A0u.put(4YT.A00(1560), String.valueOf(j));
        }
        if (A01 > 0.0d) {
            A0u.put("connection_bandwidth", String.valueOf((int) A01));
        }
        if (!TextUtils.isEmpty(fbDataConnectionManager.A05().name())) {
            A0u.put("connection_quality", fbDataConnectionManager.A05().name().toLowerCase());
        }
        if (!TextUtils.isEmpty(fbDataConnectionManager.A06())) {
            A0u.put("connection_type", fbDataConnectionManager.A06().toLowerCase());
        }
        boolean AZk = r02.AZk(36311195417053704L);
        User Auc = this.A05.Auc();
        String str = Auc != null ? Auc.A1H : "";
        TelephonyManager telephonyManager = this.A04;
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (!AZk ? !TextUtils.isEmpty(networkCountryIso) : TextUtils.isEmpty(str)) {
            str = networkCountryIso;
        }
        if (!TextUtils.isEmpty(str)) {
            A0u.put("country", str.toLowerCase());
        }
        if (!TextUtils.isEmpty(telephonyManager.getNetworkOperatorName())) {
            A0u.put("carrier", telephonyManager.getNetworkOperatorName().toLowerCase());
        }
        A0u.put(AnonymousClass000.A00(232), String.valueOf(C05a.A00(this.A03)));
        return A0u;
    }

    public void A01(JSONObject jSONObject) {
        C2754Gn7 c2754Gn7 = (C2754Gn7) this;
        synchronized (c2754Gn7) {
            List list = c2754Gn7.A00;
            list.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                if (!A0i.equals(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY)) {
                    try {
                        list.add(new HpM(A0i, (JSONObject) jSONObject.get(A0i)));
                    } catch (Exception unused) {
                        c2754Gn7.A01.D0v("media_quality_adaptive_rule_parasing", A0i);
                    }
                }
            }
        }
    }
}
