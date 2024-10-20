package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Aln, reason: case insensitive filesystem */
/* loaded from: Aln.class */
public final class C1568Aln extends 1pK implements 1pN, 2Op {
    public static final String __redex_internal_original_name = "ZeroChatSuggestionNuxFragment";
    public 1pI A00;
    public 2MX A01;
    public final C01i A02 = C01g.A00(C03i.A02, new AKM(this, 44));

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        Bundle requireArguments = requireArguments();
        7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, requireArguments.getString("ARG_COMMUNITY_ID"), requireArguments.getString("ARG_GROUP_ID"), null, null, null, "chat_suggestion_nux", "dismiss_chat_suggestion_nux", "ia_inbox", null, null));
        1pI r0 = this.A00;
        if (r0 != null) {
            if (!r0.BVa()) {
                return true;
            }
            1pI r02 = this.A00;
            if (r02 != null) {
                r02.CeH("ZERO_CHAT_SUGGESTION_NUX_FRAGMENT_TAG");
                2MX r03 = this.A01;
                if (r03 == null) {
                    return true;
                }
                r03.CVh(0S2.A0C);
                return true;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }

    public void CpV(2MX r302) {
        this.A01 = r302;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1836709994);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542368, viewGroup, false);
        0FI.A08(2105760884, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        MigColorScheme A0j = 7zS.A0j(this);
        C1296Ad8 A0W = 7zR.A0W();
        Bundle requireArguments = requireArguments();
        ((LithoView) this.A02.getValue()).A0x(new QH7(new CYr(7, requireArguments, A0W, this), A0j, CxE.A00(this, 39), requireArguments.getString("ARG_COMMUNITY_NAME"), requireArguments.getString("community_image_uri")));
        A0W.A03(new CommunityMessagingLoggerModel(null, null, requireArguments.getString("ARG_COMMUNITY_ID"), requireArguments.getString("ARG_GROUP_ID"), null, null, null, "chat_suggestion_nux", "chat_suggestion_nux_rendered", "ia_inbox", null, null));
        this.A00 = 1vD.A00(view);
    }
}
