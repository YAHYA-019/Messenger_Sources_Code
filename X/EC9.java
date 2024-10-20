package X;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: EC9.class */
public final class EC9 extends DZJ implements GKP {
    public static final String __redex_internal_original_name = "PaymentReminderPreferenceFragment";
    public EsF A00;
    public PreferenceCategory A01;
    public final C00i A02 = DKD.A0U();

    public 1iF A1R() {
        return AbL.A0A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        PreferenceCategory A0K = DZJ.A0K(this);
        this.A01 = A0K;
        A0K.setLayoutResource(2132543137);
        this.A01.setTitle(2131963164);
    }

    public Preference B49() {
        return this.A01;
    }

    public boolean BV0() {
        this.A02.get();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFuture BYO() {
        this.A01.removeAll();
        PreferenceCategory preferenceCategory = this.A01;
        Preference A0J = DZJ.A0J(this);
        A0J.setTitle(2131963166);
        A0J.setKey(__redex_internal_original_name);
        FWh.A01(A0J, this, 7);
        preferenceCategory.addPreference(A0J);
        return 1hM.A01;
    }

    public /* bridge */ /* synthetic */ void C4E(Object obj) {
    }

    public void CBA(Ew2 ew2) {
    }

    public void Cqi(EsF esF) {
        this.A00 = esF;
    }

    public void CsV(EsG esG) {
    }
}
