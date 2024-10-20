package com.facebook.storage.keystats.fbapps;

import X.1BK;
import X.1BL;
import X.1BQ;
import X.1G2;
import X.1G3;
import X.1HN;
import X.1HO;
import X.AnonymousClass001;
import X.C00i;
import X.FKL;
import X.Rvb;
import android.content.SharedPreferences;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: FbSharedPreferencesCompat.class */
public class FbSharedPreferencesCompat implements SharedPreferences {
    public final 1G2 A01;
    public final C00i A00 = new 1BQ(33013);
    public final Map A02 = new HashMap();

    public FbSharedPreferencesCompat(1G2 r302) {
        this.A01 = r302.A0D("/");
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return 1BK.A0R(this.A00).BNM(1G3.A01(this.A01, str));
    }

    @Override // android.content.SharedPreferences
    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        return new FKL(1BL.A0V(this.A00), this.A01);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        1G2 r0 = this.A01;
        int length = r0.A08().length();
        C00i c00i = this.A00;
        Set<1G2> Asu = ((FbSharedPreferences) c00i.get()).Asu(r0);
        HashMap hashMap = new HashMap();
        for (1G2 r02 : Asu) {
            hashMap.put(r02.A08().substring(length), 1BK.A0R(c00i).BIj(r02));
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return 1BK.A0R(this.A00).AZn(1G3.A01(this.A01, str), z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return 1BK.A0R(this.A00).Amn(1G3.A01(this.A01, str), f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return 1BK.A0R(this.A00).ArU(1G3.A01(this.A01, str), i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return 1BK.A0R(this.A00).Av1(1G3.A01(this.A01, str), j);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        FbSharedPreferences A0R = 1BK.A0R(this.A00);
        1G2 A01 = 1G3.A01(this.A01, str);
        return str2 == null ? A0R.BD0(A01) : A0R.A3a(A01, str2);
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        String string = getString(str, null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONObject(string).getJSONArray("__data__");
                if (jSONArray != null) {
                    HashSet A0v = AnonymousClass001.A0v();
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            return A0v;
                        }
                        A0v.add(jSONArray.getString(i));
                        i++;
                    }
                }
            } catch (JSONException unused) {
                return set;
            }
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            1G2 r0 = this.A01;
            1HO rvb = new Rvb(onSharedPreferenceChangeListener, this, r0.A08().length());
            Map map = this.A02;
            if (map.containsKey(onSharedPreferenceChangeListener)) {
                unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
            map.put(onSharedPreferenceChangeListener, rvb);
            1BK.A0R(this.A00).CcV(rvb, r0);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            1HO r0 = (1HN) this.A02.get(onSharedPreferenceChangeListener);
            if (r0 != null) {
                1BK.A0R(this.A00).D63(r0, this.A01);
            }
        }
    }
}
