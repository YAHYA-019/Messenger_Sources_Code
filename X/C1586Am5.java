package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.CommunityCreationState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Am5, reason: case insensitive filesystem */
/* loaded from: Am5.class */
public final class C1586Am5 extends 1pK implements 2Op {
    public static final String __redex_internal_original_name = "CommunityCreationPreviewFragment";
    public EnumC3499Mfu A00;
    public 1pI A01;
    public CfG A02;
    public CPh A03;
    public CG5 A04;
    public 2MX A05;
    public LithoView A06;
    public final 1Br A09 = 1Bu.A02(this, 82650);
    public final 1Br A08 = 7zN.A0I(this);
    public final 1Br A0A = 1Bu.A00(82444);
    public final 1Br A07 = AbG.A0c();
    public final Bcs A0B = new Bcs(this);

    public void CpV(2MX r302) {
        this.A05 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CommunityCreationState communityCreationState;
        int A02 = 0FI.A02(-1241537920);
        String string = requireArguments().getString("community_creation_fragment_entry_point");
        if (string == null) {
            throw 1BK.A0h();
        }
        this.A00 = CAJ.A00(string);
        if (bundle != null && (communityCreationState = (CommunityCreationState) bundle.getParcelable("community_creation_state")) != null) {
            CPh cPh = (CPh) 7zO.A0l(this, 83309);
            cPh.A05(communityCreationState);
            this.A03 = cPh;
        }
        LithoView lithoView = new LithoView(requireContext(), (AttributeSet) null);
        this.A06 = lithoView;
        1Iw r0 = lithoView.A09;
        MigColorScheme A0j = 7zS.A0j(this);
        CPh cPh2 = this.A03;
        if (cPh2 == null) {
            11T.A0L("communityCreationViewData");
            throw 0Q8.createAndThrow();
        }
        C1s0 A01 = ComponentTree.A01(new 8Yx(CPh.A00(cPh2), this.A0B, A0j, CxE.A00(this, 23)), r0, null);
        0AS A00 = 02B.A00(C02A.defaultInstance);
        A00.A0K = false;
        A01.A06 = A00.A00();
        lithoView.A0z(A01.A00());
        LithoView lithoView2 = this.A06;
        0FI.A08(1600540818, A02);
        return lithoView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-1844964142);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A06 = null;
        0FI.A08(1303430055, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        CPh cPh = this.A03;
        if (cPh == null) {
            11T.A0L("communityCreationViewData");
            throw 0Q8.createAndThrow();
        }
        bundle.putParcelable("community_creation_state", (Parcelable) cPh.A00.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A01 = 1vD.A00(view);
        Context requireContext = requireContext();
        1pI r0 = this.A01;
        if (r0 == null) {
            str = "contentViewManager";
        } else {
            this.A04 = CG5.A00(requireContext, r0, this.A05);
            CPh cPh = this.A03;
            if (cPh != null) {
                CaD.A00(getViewLifecycleOwner(), cPh.A00, A01, this, 16);
                this.A01 = 1vD.A00(view);
                this.A02 = ((CHy) 1Br.A0B(this.A09)).A01(requireContext(), 2131958873);
                LithoView lithoView = this.A06;
                if (lithoView != null) {
                    MigColorScheme A0j = 7zS.A0j(this);
                    CPh cPh2 = this.A03;
                    if (cPh2 != null) {
                        lithoView.A0x(new 8Yx(CPh.A00(cPh2), this.A0B, A0j, CxE.A00(this, 23)));
                    }
                }
                C1296Ad8 A0O = AbJ.A0O(this.A07);
                EnumC3499Mfu enumC3499Mfu = this.A00;
                if (enumC3499Mfu != null) {
                    A0O.A03(new CommunityMessagingLoggerModel(null, enumC3499Mfu, null, null, null, null, null, "community_creation_chat_bundle", "community_creation_chat_bundle_rendered", "community_creation_sheet_guided", null, null));
                    return;
                }
                str = "creationFlowEntrypoint";
            }
            str = "communityCreationViewData";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
