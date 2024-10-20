package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.search.filtertab.SearchFilterBottomsheetFragment;
import com.google.common.collect.ImmutableList;

/* loaded from: CsH.class */
public final class CsH implements DFm {
    public final Context A00;
    public final C1V A01;

    public CsH(Context context, C1V c1v) {
        11T.A0F(c1v, 1);
        this.A01 = c1v;
        this.A00 = context;
    }

    @Override // X.DFm
    public void CJc(int i) {
        GF8 gf8;
        if (i == 0) {
            this.A01.A00(AbJ.A0s(ImmutableList.builder(), CB2.A01(this.A00)), -1);
            return;
        }
        AcQ acQ = this.A01.A00;
        C1784AsI c1784AsI = acQ.A0D;
        if (c1784AsI == null || (gf8 = acQ.A0S) == null) {
            return;
        }
        c1784AsI.A00 = i;
        int i2 = i - 1;
        int intValue = ((Integer[]) c1784AsI.A03)[i2].intValue();
        0D2 searchFilterBottomsheetFragment = new SearchFilterBottomsheetFragment();
        Bundle A05 = 1BK.A05();
        A05.putInt("arg_bottomsheet_filter_pill_tab_position", i2);
        A05.putInt("arg_bottomsheet_filter_pill_list_item_position", intValue);
        searchFilterBottomsheetFragment.A02 = gf8;
        searchFilterBottomsheetFragment.setArguments(A05);
        searchFilterBottomsheetFragment.A0m(acQ.mFragmentManager, "MessagingTabbedSearchFragment");
    }
}
