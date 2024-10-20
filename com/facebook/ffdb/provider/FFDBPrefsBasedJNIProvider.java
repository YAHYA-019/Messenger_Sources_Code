package com.facebook.ffdb.provider;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1G2;
import X.1G3;
import X.1J7;
import X.1Ql;
import X.1Zb;
import X.C0il;
import android.content.Context;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import java.io.IOException;

/* loaded from: FFDBPrefsBasedJNIProvider.class */
public final class FFDBPrefsBasedJNIProvider implements 1Zb {
    public String A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1G2 A03;
    public final boolean A04;

    public FFDBPrefsBasedJNIProvider(Context context) {
        String str;
        11T.A0F(context, 1);
        this.A02 = 1Bq.A00(33013);
        1G2 r0 = new 1G3("ffdb_token");
        this.A03 = r0;
        this.A01 = 1Bq.A00(16642);
        str = "";
        this.A00 = str;
        try {
            C0il.A05(context.getApplicationContext(), 0);
            boolean CYN = ((1J7) 1Br.A0B(this.A01)).CYN();
            this.A04 = CYN;
            if (CYN) {
                String BD0 = 1Br.A09(this.A02).BD0(r0);
                this.A00 = BD0 != null ? BD0 : "";
            }
        } catch (IOException e) {
            throw new RuntimeException("SoLoader.init() failed", e);
        }
    }

    public String AlS() {
        String BD0;
        String BD02;
        boolean z = this.A04;
        if (z) {
            BD0 = this.A00;
        } else {
            BD0 = 1Br.A09(this.A02).BD0(this.A03);
            if (BD0 == null) {
                BD0 = "";
            }
        }
        if (z) {
            BD02 = this.A00;
        } else {
            BD02 = 1Br.A09(this.A02).BD0(this.A03);
            if (BD02 == null) {
                BD02 = "";
            }
        }
        if (BD02.length() == 0) {
            BD0 = FFSingletonJNILogger.getFFDBToken();
            11T.A0A(BD0);
        } else if (!FFSingletonJNILogger.getFFDBToken().equals(BD0)) {
            FFSingletonJNILogger.setFFDBToken(BD0);
            return BD0;
        }
        return BD0;
    }

    public boolean BAq() {
        return FFSingletonJNILogger.shouldRequestDebugConfig();
    }

    public void Cnz(String str) {
        FFSingletonJNILogger.setDebugUserId(str);
    }

    public void Coh(String str) {
        11T.A0F(str, 0);
        1Ql A08 = 1Br.A08(this.A02);
        A08.CaL(this.A03, str);
        A08.commit();
        FFSingletonJNILogger.setFFDBToken(str);
    }

    public void Cub(boolean z) {
        FFSingletonJNILogger.setShouldRequestDebugConfig(false);
    }
}
