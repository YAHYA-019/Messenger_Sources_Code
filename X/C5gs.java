package X;

import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.fb.client.executor.analytics.mldw.AnalyticsMldwExecutorFactory;

/* renamed from: X.5gs, reason: invalid class name */
/* loaded from: 5gs.class */
public final class C5gs implements C5gr {
    public final 1Br A00 = 1Bq.A00(16385);

    @Override // X.C5gr
    public Bundle Akz() {
        Bundle A05 = 1BK.A05();
        A05.putInt("mldw_product", 0);
        A05.putString("mldw_store_path", 0Pz.A0W(((1MC) 1Bi.A03(98404)).AUU(866422773).getAbsolutePath(), "/mldw_messenger_test_store.db"));
        A05.putString("mldw_feature_group_id", "mwb_harmful_content-messenger_wellbeing");
        A05.putInt("mldw_feature_version", 0);
        A05.putBoolean("enforce_secure_aggregation", false);
        return A05;
    }

    @Override // X.C5gr
    public Class Al0() {
        return AnalyticsMldwExecutorFactory.class;
    }

    @Override // X.C5gr
    public PapayaRestrictions Al2() {
        C00i c00i = this.A00.A00;
        boolean AZk = 1BK.A0M(c00i).AZk(2342160763042869026L);
        boolean AZk2 = 1BK.A0M(c00i).AZk(2342160763042934563L);
        C5h4 c5h4 = new C5h4();
        long j = 1;
        c5h4.A01(C5h5.A02, 4YV.A03(AZk ? 1 : 0));
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
        return false;
    }

    @Override // X.C5gr
    public String getName() {
        return 1BJ.A00(ActionId.WAIT_FOR_BLOCKERS);
    }
}
