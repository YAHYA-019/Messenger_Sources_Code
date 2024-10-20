package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Aml, reason: case insensitive filesystem */
/* loaded from: Aml.class */
public final class C1604Aml extends C1q6 {
    public final int A00;
    public final Object A01;

    public C1604Aml(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1q6, X.C1pu
    public void Bib(Bundle bundle, View view, Fragment fragment) {
        if (2 - this.A00 != 0) {
            super.Bib(bundle, view, fragment);
        }
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
        if (1 - this.A00 != 0) {
            super.BtG(fragment);
            return;
        }
        FIe fIe = (FIe) this.A01;
        fIe.A0E.A01();
        fIe.A0J.A06("FETCH_PIN_API_FOR_P2P_PAYMENT");
    }

    @Override // X.C1q6, X.C1pu
    public void CAx(Fragment fragment) {
        if (this.A00 != 0) {
            super.CAx(fragment);
        } else {
            ((COx) this.A01).A02 = false;
        }
    }

    @Override // X.C1q6, X.C1pu
    public void CHq(Fragment fragment) {
        if (this.A00 != 0) {
            super.CHq(fragment);
            return;
        }
        COx cOx = (COx) this.A01;
        cOx.A02 = true;
        if (cOx.A04) {
            COx.A00(cOx.A00, cOx);
        }
        if (cOx.A03) {
            COx.A01(cOx.A01, cOx);
        }
    }
}
