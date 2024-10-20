package X;

import com.facebook.messaging.rollcall.presentation.reactions.ReactorsListFragment;
import com.facebook.messaging.rollcall.presentation.reactions.RollCallViewerReactorsListFragment;
import com.facebook.messaging.rollcall.presentation.viewer.model.ContributionReactionsViewState;
import com.google.common.collect.ImmutableMultimap;
import java.util.Iterator;
import java.util.List;

/* loaded from: A93.class */
public final class A93 implements 7HQ {
    public final /* synthetic */ 8dW A00;

    public A93(8dW r302) {
        this.A00 = r302;
    }

    public /* synthetic */ void Bi6(5vW r302, List list) {
    }

    public /* synthetic */ void CFQ(1Iw r302, 5vW r303, String str, boolean z) {
    }

    public /* synthetic */ void CFR(5vW r302, String str, List list, int i) {
    }

    public void CFW(1Iw r302, ImmutableMultimap immutableMultimap, String str, boolean z) {
        List list;
        Object obj;
        ContributionReactionsViewState contributionReactionsViewState;
        11T.A0F(str, 1);
        C8ub c8ub = (C8ub) this.A00.A00;
        C9l3 c9l3 = c8ub.A03;
        06Z r0 = c8ub.A02;
        8KE r02 = (8KE) c9l3.A03.getValue();
        if (r02 == null || (list = r02.A03) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (11T.A0O(((8KV) obj).A0F, str)) {
                    break;
                }
            }
        }
        8KV r03 = (8KV) obj;
        if (r03 == null || (contributionReactionsViewState = r03.A08) == null) {
            return;
        }
        1Br.A0C(c9l3.A07);
        A4y a4y = new A4y(c9l3);
        if (9hP.A00(r0, "reactors_list_fragment_tag")) {
            RollCallViewerReactorsListFragment rollCallViewerReactorsListFragment = new RollCallViewerReactorsListFragment();
            rollCallViewerReactorsListFragment.setArguments(0PK.A00(7zO.A1b("arg_entry_id", str, 1BK.A1G("arg_reactions_view_state", contributionReactionsViewState))));
            ((ReactorsListFragment) rollCallViewerReactorsListFragment).A02 = a4y;
            rollCallViewerReactorsListFragment.A0m(r0, "reactors_list_fragment_tag");
        }
    }

    public /* synthetic */ void CFY(String str, String str2, List list, int i) {
    }
}
