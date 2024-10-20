package com.facebook.config.background.impl;

import X.0S2;
import X.1BQ;
import X.1iF;
import X.2yD;
import X.4CA;
import X.C00i;
import X.C15h;
import X.C4Ah;
import X.C4Ak;
import X.C4Ao;
import X.C4Ax;
import X.C4Ay;
import X.C4Xh;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: ConfigurationConditionalWorkerInfo.class */
public final class ConfigurationConditionalWorkerInfo implements C4Ah {
    public final C00i A01 = new 1BQ(16385);
    public final C15h A02 = new C4Xh(this, 0);
    public final AtomicInteger A00 = new AtomicInteger(1);

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A02;
    }

    @Override // X.C4Ah
    public long Aro() {
        C00i c00i = this.A01;
        if (((2yD) c00i.get()).AZk(2342153345634140339L)) {
            return Math.min(((2yD) c00i.get()).Auy(36591811397025895L), this.A00.get() * 7200000);
        }
        return 7200000L;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return null;
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        C4Ak.A00(c4Ak, C4Ax.A01);
        c4Ak.A01.A00 = 0S2.A00;
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        return true;
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return "ConfigurationConditionalWorkerInfo";
    }
}
