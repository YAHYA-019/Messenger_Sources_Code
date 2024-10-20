package X;

import android.os.Bundle;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.fb.client.executor.analytics.mldw.AnalyticsMldwExecutorFactory;

/* renamed from: X.5gq, reason: invalid class name */
/* loaded from: 5gq.class */
public final class C5gq implements C5gr {
    public final 1Br A00 = 1Bq.A00(16385);

    @Override // X.C5gr
    public Bundle Akz() {
        Bundle bundle = new Bundle();
        bundle.putInt("mldw_product", 9);
        bundle.putString("mldw_store_path", 0Pz.A0W(((1MC) 1Bi.A03(98404)).AUU(866422773).getAbsolutePath(), "/mldw_messenger_wellbeing_store.db"));
        C00i c00i = this.A00.A00;
        bundle.putString("mldw_feature_group_id", ((2yD) c00i.get()).BCy(36880703784813570L));
        bundle.putInt("mldw_feature_version", (int) ((2yD) c00i.get()).Auy(36599228808172076L));
        bundle.putBoolean("enforce_secure_aggregation", true);
        bundle.putBoolean("validate_enclave_binary_identifiers", true);
        bundle.putInt("min_kanon_threshold", 100);
        bundle.putFloat("max_epsilon", 1.0f);
        return bundle;
    }

    @Override // X.C5gr
    public Class Al0() {
        return AnalyticsMldwExecutorFactory.class;
    }

    @Override // X.C5gr
    public PapayaRestrictions Al2() {
        boolean AZk = ((2yD) this.A00.A00.get()).AZk(2342160763042934563L);
        C5h4 c5h4 = new C5h4();
        c5h4.A01(C5h5.A02, 0L);
        c5h4.A01(C5h5.A03, AZk ? 1L : 0L);
        c5h4.A01(C5h5.A0A, 0L);
        return c5h4.A00();
    }

    @Override // X.C5gr
    public boolean BSI() {
        return ((2yD) this.A00.A00.get()).AZk(36317753830944553L);
    }

    @Override // X.C5gr
    public String getName() {
        String BCy = ((2yD) this.A00.A00.get()).BCy(36880703784420353L);
        11T.A0A(BCy);
        return BCy;
    }
}
