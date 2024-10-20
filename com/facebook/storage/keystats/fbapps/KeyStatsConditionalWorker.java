package com.facebook.storage.keystats.fbapps;

import X.1BQ;
import X.4Yg;
import X.C00i;
import X.C4Av;
import X.C5hj;
import X.C5hm;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.inject.FbInjector;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: KeyStatsConditionalWorker.class */
public final class KeyStatsConditionalWorker implements C4Av {
    public final C00i A01 = new 1BQ(49827);
    public final Context A00 = FbInjector.A00();

    public void A00() {
        final C5hm c5hm = ((C5hj) this.A01.get()).A03;
        final long j = C5hm.A04;
        c5hm.A03.execute(new Runnable() { // from class: X.5hn
            public static final String __redex_internal_original_name = "CacheUtilizationSingletonListener$2";

            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis() - j;
                C5hm c5hm2 = C5hm.this;
                SharedPreferences sharedPreferences = c5hm2.A00;
                Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(it);
                    String A0j = AnonymousClass001.A0j(A0z);
                    if (A0j.startsWith("__data__/")) {
                        String A16 = 1BK.A16(A0z);
                        if (A16 == null) {
                            sharedPreferences.edit().remove(A0j).apply();
                            c5hm2.A02.remove(A0j);
                        } else {
                            try {
                                L2j A00 = L2j.A00(new JSONObject(A16));
                                if (currentTimeMillis > A00.A0C) {
                                    c5hm2.A01.A00(A00);
                                    sharedPreferences.edit().remove(A0j).apply();
                                    c5hm2.A02.remove(A0j);
                                }
                            } catch (JSONException unused) {
                                sharedPreferences.edit().remove(A0j).apply();
                                c5hm2.A02.remove(A0j);
                            }
                        }
                    }
                }
            }
        });
        this.A00.deleteDatabase("stash_keystats");
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        A00();
        return true;
    }
}
