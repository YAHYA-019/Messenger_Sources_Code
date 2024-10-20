package X;

import com.facebook.messaging.nativepagereply.plugins.filters.filtersegmentedcontrolitemsupplier.FilterSegmentedControlItemSupplierImplementation;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.zero.messenger.plugins.messenger.threadviewprefsdata.ThreadViewPrefsData;

/* loaded from: A1u.class */
public final class A1u implements 1HN, 1HO {
    public final int A00;
    public final Object A01;

    public A1u(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        switch (this.A00) {
            case 0:
                11T.A0F(r303, 1);
                if (r303.equals(1NK.A1U)) {
                    C8rM.A00((C8rM) this.A01);
                    return;
                }
                return;
            case 1:
                FilterSegmentedControlItemSupplierImplementation filterSegmentedControlItemSupplierImplementation = (FilterSegmentedControlItemSupplierImplementation) this.A01;
                if (1BK.A1T(1Br.A09(((C3Nq) 1Br.A0B(filterSegmentedControlItemSupplierImplementation.A04)).A00), C2bv.A0S)) {
                    filterSegmentedControlItemSupplierImplementation.A05.A00(1BJ.A00(265), "Rerender Segmented Control for Follow Up Filter QP.");
                    return;
                }
                return;
            case 2:
                B3y b3y = (B3y) this.A01;
                b3y.A04(new 2QC(b3y.A08(), "RED_WITH_TEXT"));
                return;
            default:
                ThreadViewPrefsData.A00((ThreadViewPrefsData) this.A01);
                return;
        }
    }
}
