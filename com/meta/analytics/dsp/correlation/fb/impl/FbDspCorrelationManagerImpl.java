package com.meta.analytics.dsp.correlation.fb.impl;

import X.1Bq;
import X.1Br;
import X.1GD;
import X.1Yi;
import X.1Z9;
import X.1ZT;
import X.1ZV;
import X.1ZW;
import X.1ZZ;
import X.1Za;
import X.2jL;
import X.C3j9;
import java.util.Map;

/* loaded from: FbDspCorrelationManagerImpl.class */
public final class FbDspCorrelationManagerImpl implements 1Z9, 1ZT, 1ZV, 1ZW {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Za A02;
    public final C3j9 A03;
    public final 1ZZ A04;

    public FbDspCorrelationManagerImpl() {
        int i;
        1Br A00 = 1Bq.A00(66823);
        this.A01 = A00;
        this.A00 = 1Bq.A00(16616);
        C3j9 c3j9 = new C3j9(this, 20);
        this.A03 = c3j9;
        1Yi r0 = (1Yi) A00.A00.get();
        if (r0.A02) {
            i = r0.A00;
        } else {
            i = (int) r0.A0C.Av9(1GD.A06, 36601908865341078L);
            r0.A00 = i;
            r0.A02 = true;
        }
        1ZZ r02 = new 1ZZ(i);
        this.A04 = r02;
        this.A02 = new 1Za(r02, c3j9);
    }

    public void A7q(2jL r302) {
        if (((1Yi) 1Br.A0B(this.A01)).A00()) {
            1Za r0 = this.A02;
            r0.A01++;
            r0.A00 = 0;
        }
    }

    public String Aei() {
        return ((1Yi) this.A01.A00.get()).A00() ? this.A02.Aei() : "disabled_correlation_id";
    }

    public /* bridge */ /* synthetic */ Integer Akw() {
        return 1;
    }

    public String Au7() {
        return "FbDspCorrelationManager";
    }

    public void C8a(2jL r302) {
        boolean z;
        1Yi r0 = (1Yi) this.A01.A00.get();
        if (r0.A09) {
            z = r0.A08;
        } else {
            z = r0.A0C.AZr(1GD.A06, 36320433888443772L);
            r0.A08 = z;
            r0.A09 = true;
        }
        if (z) {
            r302.A07(Aei(), "correlation_id");
        }
    }

    public void C8c(String str, String str2, Map map) {
        if (((1Yi) this.A01.A00.get()).A00()) {
            1Za r0 = this.A02;
            r0.A01++;
            r0.A00 = 0;
        }
    }
}
