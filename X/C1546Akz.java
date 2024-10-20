package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.montage.composer.CanvasOverlayCropViewFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbLinearLayout;

/* renamed from: X.Akz, reason: case insensitive filesystem */
/* loaded from: Akz.class */
public final class C1546Akz extends 1pK {
    public static final String __redex_internal_original_name = "ChooseProfileFromLibraryFragment";
    public ViewGroup A00;
    public 6KV A01;
    public HvL A02;
    public BHc A03;
    public CMt A04;
    public Community A05;
    public CanvasOverlayCropViewFragment A06;
    public boolean A07;
    public boolean A08;
    public LithoView A09;
    public MigColorScheme A0A;
    public FbLinearLayout A0B;
    public final 1Br A0C = 1Bu.A00(83430);
    public final CmV A0D = new CmV(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1546Akz c1546Akz, boolean z) {
        LithoView lithoView = c1546Akz.A09;
        if (lithoView != null) {
            int i = 2131952737;
            if (z) {
                i = 2131953780;
            }
            String A0s = 7zN.A0s(c1546Akz, i);
            C5yw A00 = C5yv.A00(lithoView.A09);
            A00.A2a(2131966707);
            int i2 = C5yu.A00;
            LightColorScheme.A00();
            MigColorScheme migColorScheme = c1546Akz.A0A;
            if (migColorScheme != null) {
                A00.A2e(new C5z2(new Cwm(1, c1546Akz, z), migColorScheme, A0s, null, A0s, null, true));
                A00.A2Y();
                CxE.A01(A00, c1546Akz, 31);
                A00.A2i(false);
                MigColorScheme migColorScheme2 = c1546Akz.A0A;
                if (migColorScheme2 != null) {
                    A00.A2b(migColorScheme2);
                    AbH.A1R(lithoView, A00);
                    return;
                }
            }
            11T.A0L("migColorScheme");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        Context requireContext = requireContext();
        this.A0A = 7zR.A0c(requireContext);
        this.A02 = (HvL) 1Bn.A0A(83402);
        this.A01 = ((82O) 1Bn.A0A(65571)).A00(requireContext);
        this.A04 = (CMt) 1Lm.A05(requireContext, 1BM.A01(this), 83067);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1689588624);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132543309, false);
        0FI.A08(-397978914, A02);
        return A0G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-1892767946);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(-1651132901, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ViewGroup) 7zL.A0F(this, 2131363341);
        this.A09 = (LithoView) 7zL.A0F(this, 2131365268);
        this.A0B = (FbLinearLayout) 7zL.A0F(this, 2131364279);
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            MigColorScheme migColorScheme = this.A0A;
            if (migColorScheme == null) {
                11T.A0L("migColorScheme");
                throw 0Q8.createAndThrow();
            }
            MigColorScheme.A00(viewGroup, migColorScheme);
        }
        BHc bHc = new BHc(requireContext(), this);
        this.A03 = bHc;
        bHc.A02 = new DD3(this, 22);
        bHc.A01 = new DCw(this, 35);
        bHc.A00 = new DCw(this, 36);
        7zR.A11(bHc);
        FbLinearLayout fbLinearLayout = this.A0B;
        if (fbLinearLayout != null) {
            fbLinearLayout.addView(this.A03);
        }
        Parcelable parcelable = requireArguments().getParcelable("community");
        if (parcelable == null) {
            throw 1BK.A0h();
        }
        this.A05 = (Community) parcelable;
        this.A07 = requireArguments().getBoolean("is_cover_photo");
        A03(this, false);
    }
}
