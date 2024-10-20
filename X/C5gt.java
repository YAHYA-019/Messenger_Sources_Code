package X;

import android.os.Bundle;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.fb.client.executor.analytics.mldwfalco.AnalyticsMldwFalcoExecutorFactory;

/* renamed from: X.5gt, reason: invalid class name */
/* loaded from: 5gt.class */
public final class C5gt implements C5gr {
    public final 1Br A00 = 1Bq.A00(16385);

    @Override // X.C5gr
    public Bundle Akz() {
        Bundle bundle = new Bundle();
        bundle.putString("mldw_store_path", 0Pz.A0W(((1MC) 1Bi.A03(98404)).AUU(866422773).getCanonicalPath(), "/falco.db"));
        bundle.putBoolean("enforce_secure_aggregation", false);
        bundle.putBoolean("validate_enclave_binary_identifiers", ((2yD) this.A00.A00.get()).AZk(36317753833041718L));
        return bundle;
    }

    @Override // X.C5gr
    public Class Al0() {
        return AnalyticsMldwFalcoExecutorFactory.class;
    }

    @Override // X.C5gr
    public PapayaRestrictions Al2() {
        C00i c00i = this.A00.A00;
        boolean AZk = ((2yD) c00i.get()).AZk(2342160763042869026L);
        boolean AZk2 = ((2yD) c00i.get()).AZk(2342160763042934563L);
        C5h4 c5h4 = new C5h4();
        long j = 1;
        c5h4.A01(C5h5.A02, AZk ? 1L : 0L);
        C5h5 c5h5 = C5h5.A03;
        if (!AZk2) {
            j = 0;
        }
        c5h4.A01(c5h5, j);
        c5h4.A01(C5h5.A0A, 0L);
        return c5h4.A00();
    }

    @Override // X.C5gr
    public boolean BSI() {
        return ((2yD) this.A00.A00.get()).AZk(36317753832255280L);
    }

    @Override // X.C5gr
    public String getName() {
        String BCy = ((2yD) this.A00.A00.get()).BCy(36880703785600005L);
        11T.A0A(BCy);
        return BCy;
    }
}
