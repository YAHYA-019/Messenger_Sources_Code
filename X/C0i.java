package X;

import androidx.appcompat.widget.SearchView;
import com.google.common.collect.ImmutableList;

/* loaded from: C0i.class */
public final class C0i {
    public final /* synthetic */ C1555AlG A00;

    public C0i(C1555AlG c1555AlG) {
        this.A00 = c1555AlG;
    }

    public void A00(ImmutableList immutableList) {
        AlM alM;
        SearchView searchView;
        C1555AlG c1555AlG = this.A00;
        Be3 be3 = c1555AlG.A04;
        if (be3 == null || !((searchView = (alM = be3.A00).A03) == null || searchView.getVisibility() != 0 || 1JF.A0B(alM.A03.mSearchSrcTextView.getText()))) {
            C1555AlG.A08(c1555AlG, immutableList);
        }
    }
}
