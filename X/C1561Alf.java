package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Alf, reason: case insensitive filesystem */
/* loaded from: Alf.class */
public final class C1561Alf extends 1pK implements 1pN {
    public static final String __redex_internal_original_name = "CommunityCreationGroupUpgradeMessageFragment";
    public FbUserSession A00;
    public ThreadKey A01;
    public C2fr A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08 = "";
    public 1pI A09;
    public LithoView A0A;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1561Alf c1561Alf) {
        1pI r0 = c1561Alf.A09;
        if (r0 != null) {
            if (!r0.BVa()) {
                return;
            }
            C5fi.A01(c1561Alf.mView);
            1pI r02 = c1561Alf.A09;
            if (r02 != null) {
                r02.CeH(__redex_internal_original_name);
                return;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C1561Alf c1561Alf) {
        MigColorScheme A0j = 7zS.A0j(c1561Alf);
        LithoView lithoView = c1561Alf.A0A;
        if (lithoView != null) {
            lithoView.A0y(new AxW(c1561Alf, A0j, CxE.A00(c1561Alf, 27), c1561Alf.A02, c1561Alf.A08));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BM.A01(this);
        requireArguments().getString("community_creation_group_upgrade_message_entry_point");
        this.A04 = requireArguments().getString("community_creation_group_upgrade_message_community_creation_image_url");
        this.A05 = requireArguments().getString("community_creation_group_upgrade_message_community_description");
        String string = requireArguments().getString("community_creation_group_upgrade_message_community_id");
        this.A03 = string != null ? 0CW.A0e(string) : null;
        this.A07 = requireArguments().getString("community_creation_group_upgrade_message_link_to_main_chat");
        String A0u = 1BK.A0u(requireContext(), 2131954488);
        this.A08 = A0u;
        String str = this.A07;
        if (str != null) {
            this.A08 = 0Pz.A0Y(A0u, str, ' ');
        }
    }

    public boolean Bkd() {
        A03(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1248607402);
        long j = requireArguments().getLong("community_creation_group_upgrade_message_upgraded_from_group_thread_id");
        if (j != 0) {
            1Hv.A02(requireContext(), 67720);
            ThreadKey A08 = ThreadKey.A08(j);
            this.A01 = A08;
            LiveData A07 = 7zT.A07(A08);
            A07.observe(getViewLifecycleOwner(), new CaD(A07, this, 17));
        }
        LithoView A0M = 7zR.A0M(this);
        this.A0A = A0M;
        0FI.A08(-2002795168, A02);
        return A0M;
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A09 = 1vD.A00(view);
        A06(this);
    }
}
