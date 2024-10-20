package com.facebook.push.adm;

import X.1BL;
import X.1BQ;
import X.1OX;
import X.1OZ;
import X.1P5;
import X.AbstractC02263un;
import X.C00i;
import X.C1cx;
import X.C3279Jox;
import android.content.Intent;

/* loaded from: ADMService.class */
public class ADMService extends AbstractC02263un {
    public 1P5 A00;
    public final C00i A01;
    public final C00i A02;

    public ADMService() {
        super("ADMService");
        this.A01 = 1BQ.A02(131215);
        this.A02 = 1BQ.A02(16614);
    }

    @Override // X.AbstractC02263un
    public void A03() {
        this.A00 = ((1OX) this.A02.get()).A01(1OZ.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02263un
    public void A04(Intent intent) {
        C1cx.A00(this);
        if (intent == null || intent.getAction() == null) {
            return;
        }
        this.A00.A06();
        ((C3279Jox) this.A01.get()).A05(intent, 1BL.A0F());
        this.A00.A04();
        this.A00.A05();
    }
}
