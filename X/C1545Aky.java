package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.composer.CanvasOverlayCropViewFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbLinearLayout;

/* renamed from: X.Aky, reason: case insensitive filesystem */
/* loaded from: Aky.class */
public final class C1545Aky extends 1pK {
    public static final String __redex_internal_original_name = "SelectProfilePictureFragment";
    public ViewGroup A00;
    public FbUserSession A01;
    public 6KV A02;
    public HvL A03;
    public BHd A04;
    public CanvasOverlayCropViewFragment A05;
    public LithoView A06;
    public MigColorScheme A07;
    public FbLinearLayout A08;
    public final C01i A0A = DCx.A00(this, 15);
    public final CmU A09 = new CmU(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1545Aky c1545Aky, boolean z) {
        Boolean A00;
        LithoView lithoView = c1545Aky.A06;
        if (lithoView != null) {
            int i = 2131952737;
            if (z) {
                i = 2131953780;
            }
            String A0s = 7zN.A0s(c1545Aky, i);
            BHd bHd = c1545Aky.A04;
            boolean booleanValue = (bHd == null || (A00 = bHd.A06.A00()) == null) ? false : A00.booleanValue();
            C5yw A002 = C5yv.A00(lithoView.A09);
            A002.A2a(2131966707);
            int i2 = C5yu.A00;
            LightColorScheme.A00();
            MigColorScheme migColorScheme = c1545Aky.A07;
            if (migColorScheme != null) {
                A002.A2e(new C5z2(new Cwm(0, c1545Aky, z), migColorScheme, A0s, null, A0s, null, booleanValue));
                A002.A2Y();
                CxE.A01(A002, c1545Aky, 10);
                A002.A2i(false);
                MigColorScheme migColorScheme2 = c1545Aky.A07;
                if (migColorScheme2 != null) {
                    A002.A2b(migColorScheme2);
                    AbH.A1R(lithoView, A002);
                    return;
                }
            }
            11T.A0L("migColorScheme");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = 1BM.A01(this);
        Context requireContext = requireContext();
        this.A07 = 7zR.A0c(requireContext);
        this.A03 = (HvL) 1Bn.A0A(83402);
        this.A02 = ((82O) 1Bn.A0A(65571)).A00(requireContext);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1152299264);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132543309, false);
        0FI.A08(996732296, A02);
        return A0G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(746832776);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        7zP.A0e(((CBz) this.A0A.getValue()).A00).markerEnd(744822533, (short) 4);
        0FI.A08(-745477883, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ViewGroup) 7zL.A0F(this, 2131363341);
        this.A06 = (LithoView) 7zL.A0F(this, 2131365268);
        this.A08 = (FbLinearLayout) 7zL.A0F(this, 2131364279);
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            MigColorScheme migColorScheme = this.A07;
            if (migColorScheme == null) {
                11T.A0L("migColorScheme");
                throw 0Q8.createAndThrow();
            }
            MigColorScheme.A00(viewGroup, migColorScheme);
        }
        BHd bHd = new BHd(requireContext(), this);
        this.A04 = bHd;
        bHd.A03 = new AeI(this, 4);
        bHd.A02 = new DCx(this, 12);
        bHd.A01 = new DCx(this, 13);
        bHd.A00 = new DCx(this, 14);
        7zR.A11(bHd);
        FbLinearLayout fbLinearLayout = this.A08;
        if (fbLinearLayout != null) {
            fbLinearLayout.addView(this.A04);
        }
        A03(this, false);
    }
}
