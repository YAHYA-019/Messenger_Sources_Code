package X;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: B92.class */
public final class B92 extends BJB {
    public static final String __redex_internal_original_name = "M4ContactsPreferencesFragment";
    public final C00i A00 = AbF.A0S(this, 83736);
    public final C00i A01 = 1BV.A00(83739);
    public final BdX A02 = new BdX(this);

    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        C00i c00i = this.A00;
        ((Bxv) c00i.get()).A03 = this.A02;
        Bxv bxv = (Bxv) c00i.get();
        1PA A01 = 1P9.A01(AbJ.A0B(bxv.A06.get()), bxv.A07, 1BJ.A00(86));
        bxv.A01 = A01;
        A01.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        BdX bdX;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            return;
        }
        A1b();
        1Iw A0P = AbI.A0P(this);
        By5 by5 = new By5(null, AnonymousClass553.A01, C5xv.A01, null, null, 2131965803, 0, true, true);
        Context requireContext = requireContext();
        QC4 qc4 = new QC4(A0P, new AyT());
        MigColorScheme migColorScheme = ((BJB) this).A01;
        AyT ayT = qc4.A01;
        ayT.A02 = migColorScheme;
        BitSet bitSet = qc4.A02;
        bitSet.set(1);
        Bxv bxv = (Bxv) this.A00.get();
        if (bxv.A04 == null) {
            C1347Aep c1347Aep = ((BnS) 1Bn.A0E((Context) null, bxv.A02, 83738)).A01;
            bxv.A04 = c1347Aep;
            if (c1347Aep != null && (bdX = bxv.A03) != null) {
                c1347Aep.A01 = bdX;
                Czs czs = new Czs(c1347Aep, 8);
                c1347Aep.A02 = czs;
                c1347Aep.A04.CcX(czs, C09384py.A02);
            }
        }
        ayT.A00 = bxv.A04;
        bitSet.set(2);
        C00i c00i = this.A01;
        BdY bdY = (BdY) c00i.get();
        Preference preference = bdY.A00;
        if (preference == null) {
            preference = new C1346Aeo(requireContext);
            bdY.A00 = preference;
        }
        ayT.A01 = preference;
        bitSet.set(3);
        c00i.get();
        bitSet.set(0);
        C1rs.A02(bitSet, qc4.A03);
        qc4.A0J();
        BJB.A0I(ayT, A0P, lithoView, this, by5);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1957893719);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(-1659448162, A02);
        return A1Y;
    }

    public void onDestroy() {
        1HO r0;
        int A02 = 0FI.A02(221640751);
        Bxv bxv = (Bxv) this.A00.get();
        ((2Pl) bxv.A05.get()).A00("Leave current preference ", 0S2.A0j);
        1PA r02 = bxv.A01;
        if (r02 != null) {
            r02.A01();
        }
        C1347Aep c1347Aep = bxv.A04;
        if (c1347Aep != null && (r0 = c1347Aep.A02) != null) {
            c1347Aep.A04.D65(r0, C09384py.A02);
        }
        super/*X.DZJ*/.onDestroy();
        0FI.A08(-2096001921, A02);
    }
}
