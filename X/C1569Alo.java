package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.CommunityTemplate;
import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.CommunityTopic;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.Alo, reason: case insensitive filesystem */
/* loaded from: Alo.class */
public final class C1569Alo extends 1pK implements 1pN, 2Op {
    public static final String __redex_internal_original_name = "CommunityCreationTemplateFragment";
    public 1pI A00;
    public LithoView A01;
    public 2MX A02;
    public String A03;
    public List A04 = C0ty.A00;
    public final 1Br A05 = AbG.A0c();
    public final 1Br A06 = 1Bu.A00(83310);
    public final 1Br A07 = 1Bq.A00(68133);

    /* JADX WARN: Multi-variable type inference failed */
    public static final 1LH A03(C1569Alo c1569Alo) {
        MigColorScheme A0j = 7zS.A0j(c1569Alo);
        boolean AZk = AbN.A0W(c1569Alo.A07).AZk(36321834050274139L);
        1Br r0 = c1569Alo.A06;
        if (!AZk) {
            1Br.A0C(r0);
            Context requireContext = c1569Alo.requireContext();
            return new 8Yy(c1569Alo, A0j, CxE.A00(c1569Alo, 26), C0s8.A14(new CommunityTemplate(C1u3.A47, BMB.A05, 1BK.A0u(requireContext, 2131958856), 1BK.A0u(requireContext, 2131958855), A0j.ApO()), new CommunityTemplate(C1u3.A39, BMB.A07, 1BK.A0u(requireContext, 2131958859), 1BK.A0u(requireContext, 2131958858), A0j.Aed()), new CommunityTemplate(C1u3.A0t, BMB.A06, 1BK.A0u(requireContext, 2131958850), 1BK.A0u(requireContext, 2131958857), A0j.BBD()), new CommunityTemplate(C1u3.A6O, BMB.A04, 1BK.A0u(requireContext, 2131958854), 1BK.A0u(requireContext, 2131958853), A0j.AjN()), new CommunityTemplate(C1u3.A3L, BMB.A03, 1BK.A0u(requireContext, 2131958852), 1BK.A0u(requireContext, 2131958851), A0j.Aa5()), new CommunityTemplate(C1u3.A52, BMB.A02, 1BK.A0u(requireContext, 2131958849), 1BK.A0u(requireContext, 2131958848), 7zP.A1X(A0j) ? 1 : 0)));
        }
        1Br.A0C(r0);
        CommunityTopic communityTopic = new CommunityTopic(0S2.A0j, "Gaming");
        CommunityTopic communityTopic2 = new CommunityTopic(0S2.A15, "Neighborhood");
        CommunityTopic communityTopic3 = new CommunityTopic(0S2.A01, "Campus");
        Integer num = 0S2.A03;
        return new 8aV(c1569Alo, A0j, CxE.A00(c1569Alo, 25), C0s8.A14(communityTopic, communityTopic2, communityTopic3, new CommunityTopic(num, "Social"), new CommunityTopic(0S2.A1G, "Organization and groups"), new CommunityTopic(0S2.A00, "Anime"), new CommunityTopic(0S2.A0u, "Music, movies, and TV"), new CommunityTopic(0S2.A05, "Wellness"), new CommunityTopic(0S2.A0N, "Fitness and sports"), new CommunityTopic(0S2.A0Y, "Food and drink"), new CommunityTopic(num, "Travel"), new CommunityTopic(0S2.A02, "Pets"), new CommunityTopic(0S2.A0C, "Career and learning"), new CommunityTopic(0S2.A1J, "Other")), c1569Alo.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C1569Alo c1569Alo) {
        2MX r0;
        AbJ.A0O(c1569Alo.A05).A04(new CommunityMessagingLoggerModel(null, CAJ.A00(c1569Alo.A03), null, null, null, null, "dismiss", "community_creation_community_category", null, "community_creation_nux_interstitial", null, null));
        1pI r02 = c1569Alo.A00;
        if (r02 != null) {
            if (!r02.BVa()) {
                return;
            }
            1pI r03 = c1569Alo.A00;
            if (r03 != null) {
                r03.CeH(__redex_internal_original_name);
                if (11T.A0O(c1569Alo.requireArguments().getString("community_creation_template_entry_point"), "communities_tab") || (r0 = c1569Alo.A02) == null) {
                    return;
                }
                r0.CVh(0S2.A0C);
                return;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }

    public boolean Bkd() {
        A06(this);
        return true;
    }

    public void CpV(2MX r302) {
        this.A02 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1591036151);
        this.A03 = requireArguments().getString("community_creation_template_entry_point");
        AbJ.A0O(this.A05).A03(new CommunityMessagingLoggerModel(null, CAJ.A00(this.A03), null, null, null, null, null, "community_creation_community_category", "community_creation_community_category_rendered", "community_creation_nux_interstitial", null, null));
        LithoView lithoView = new LithoView(requireContext(), (AttributeSet) null);
        this.A01 = lithoView;
        0FI.A08(-348492832, A04);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-229269153);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A01 = null;
        0FI.A08(-328124116, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            lithoView.A0x(A03(this));
        }
        this.A00 = 1vD.A00(view);
        C5fi.A00(getActivity());
    }
}
