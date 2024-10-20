package com.facebook.xapp.messaging.contextmenu.fragment;

import X.0FI;
import X.11T;
import X.1Iw;
import X.2Ov;
import X.7zL;
import X.7zR;
import X.7zT;
import X.83S;
import X.8cT;
import X.AKN;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C84j;
import X.C8g3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.msys.thread.aibot.citations.contextmenu.AiSearchCitationContextMenuFragment;
import com.facebook.messaging.msys.thread.aibot.getinfo.contextmenu.AiBotGetInfoContextMenuFragment;
import com.facebook.messaging.search.lists.item.aiagent.contextmenu.AiSearchSnippetContextMenuFragment;
import com.facebook.xapp.messaging.threadview.model.xma.citations.AISearchSource;
import java.util.List;

/* loaded from: AbstractContextMenuFragment.class */
public abstract class AbstractContextMenuFragment extends 2Ov {
    public final C01i A00 = C01g.A00(C03i.A02, new AKN(this, 13));

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1020064702);
        super.onCreate(bundle);
        A0g(2, 2132606976);
        0FI.A08(529082166, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C84j c84j;
        int A02 = 0FI.A02(-353247637);
        Context requireContext = requireContext();
        A0j(true);
        int i = requireArguments().getInt("AbstractContextMenuFragment.arg_view_y_position_px") - 7zT.A06(this).top;
        1Iw A0W = 7zL.A0W(requireContext);
        C01i c01i = this.A00;
        List list = (List) c01i.getValue();
        boolean z = this instanceof AiSearchCitationContextMenuFragment;
        if (z) {
            C01i c01i2 = ((AiSearchCitationContextMenuFragment) this).A01;
            c84j = new C84j(((AISearchSource) c01i2.getValue()).A02, ((AISearchSource) c01i2.getValue()).A01, 11);
        } else {
            c84j = null;
        }
        11T.A0F(list, 2);
        LithoView A022 = LithoView.A02(new 8cT(new C8g3(c84j, 7zR.A0b(requireContext), list, list.size()), ((Fragment) this).requireArguments().containsKey("AbstractContextMenuFragment.arg_view_x_position_px") ? Integer.valueOf(((Fragment) this).requireArguments().getInt("AbstractContextMenuFragment.arg_view_x_position_px")) : null, i, this instanceof AiSearchSnippetContextMenuFragment ? 25 : ((this instanceof AiBotGetInfoContextMenuFragment) || z) ? 0 : 8, ((List) c01i.getValue()).size(), this instanceof AiBotGetInfoContextMenuFragment), A0W);
        83S.A01(A022, this, 63);
        0FI.A08(-143621378, A02);
        return A022;
    }
}
