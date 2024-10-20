package X;

import com.facebook.messaging.search.filtertab.SearchFilterBottomsheetFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import java.util.List;

/* loaded from: C1a.class */
public final class C1a {
    public final /* synthetic */ SearchFilterBottomsheetFragment A00;

    public C1a(SearchFilterBottomsheetFragment searchFilterBottomsheetFragment) {
        this.A00 = searchFilterBottomsheetFragment;
    }

    public void A00(List list) {
        SearchFilterBottomsheetFragment searchFilterBottomsheetFragment = this.A00;
        2qR r0 = BaseMigBottomSheetDialogFragment.A06;
        List list2 = searchFilterBottomsheetFragment.A04;
        list2.addAll(list);
        ((8Ks) list2.get(searchFilterBottomsheetFragment.A00)).A00 = true;
        7zP.A0N(searchFilterBottomsheetFragment.A06).Ciz(new D6T(searchFilterBottomsheetFragment));
    }
}
