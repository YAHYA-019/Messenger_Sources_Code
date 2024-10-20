package com.facebook.ffdb.provider;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1G2;
import X.1G3;
import X.1J7;
import X.1Ql;
import X.1Zb;
import android.content.Context;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: FFDBPrefsBasedProvider.class */
public final class FFDBPrefsBasedProvider implements 1Zb {
    public String A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1G2 A03;
    public final boolean A04;

    public FFDBPrefsBasedProvider() {
        String str;
        this.A02 = 1Bq.A00(33013);
        1G2 r0 = new 1G3("ffdb_token");
        this.A03 = r0;
        1Br A00 = 1Bq.A00(16642);
        this.A01 = A00;
        str = "";
        this.A00 = str;
        boolean CYN = ((1J7) A00.A00.get()).CYN();
        this.A04 = CYN;
        if (CYN) {
            String BD0 = ((FbSharedPreferences) this.A02.A00.get()).BD0(r0);
            this.A00 = BD0 != null ? BD0 : "";
        }
    }

    public FFDBPrefsBasedProvider(Context context) {
        this();
    }

    public String AlS() {
        String BD0;
        if (this.A04) {
            BD0 = this.A00;
        } else {
            BD0 = ((FbSharedPreferences) this.A02.A00.get()).BD0(this.A03);
            if (BD0 == null) {
                return "";
            }
        }
        return BD0;
    }

    public boolean BAq() {
        return false;
    }

    public void Cnz(String str) {
    }

    public void Coh(String str) {
        11T.A0F(str, 0);
        1Ql A08 = 1Br.A08(this.A02);
        A08.CaL(this.A03, str);
        A08.commit();
    }

    public void Cub(boolean z) {
    }
}
