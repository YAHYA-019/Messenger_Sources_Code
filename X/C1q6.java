package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1q6, reason: invalid class name */
/* loaded from: 1q6.class */
public abstract class C1q6 implements C1pu {
    @Override // X.C1pu
    public void Bhs(Intent intent, Fragment fragment, int i, int i2) {
    }

    @Override // X.C1pu
    public void BiD(Bundle bundle, Fragment fragment) {
    }

    @Override // X.C1pu
    public void BiF(Context context, Fragment fragment) {
    }

    @Override // X.C1pu
    public void BiN(Bundle bundle, Fragment fragment) {
    }

    @Override // X.C1pu
    public void BiO(Fragment fragment, boolean z) {
        if (this instanceof 1tA) {
            C1t7 c1t7 = ((1tA) this).A00;
            c1t7.A01 = z;
            C1t7.A01(c1t7);
        }
    }

    @Override // X.C1pu
    public void Bib(Bundle bundle, View view, Fragment fragment) {
    }

    @Override // X.C1pu, X.C1pv
    public void Bic(Fragment fragment) {
    }

    @Override // X.C1pu
    public void Bjc(Fragment fragment, Fragment fragment2) {
    }

    @Override // X.C1pu
    public void Bl8(Fragment fragment) {
        if (this instanceof 1tA) {
            C1t7 c1t7 = ((1tA) this).A00;
            1pK r0 = c1t7.A07;
            HashMap hashMap = C1t9.A00;
            List list = (List) hashMap.get(r0);
            if (list != null) {
                list.remove(c1t7);
                if (list.isEmpty()) {
                    hashMap.remove(r0);
                }
            }
        }
    }

    @Override // X.C1pu
    public void BlB(Bundle bundle) {
    }

    @Override // X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
    }

    @Override // X.C1pu
    public void CAx(Fragment fragment) {
    }

    @Override // X.C1pu
    public void CHq(Fragment fragment) {
    }

    @Override // X.C1pu
    public void CIe(Bundle bundle, Fragment fragment) {
    }

    @Override // X.C1pu, X.C1pv
    public void CL1(Fragment fragment, boolean z, boolean z2) {
    }

    @Override // X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
    }

    @Override // X.C1pu, X.C1pv
    public void CNf(Fragment fragment) {
    }
}
