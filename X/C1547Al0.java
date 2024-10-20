package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.bubbles.settings.BubblesSettingsManager;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.CustomRelativeLayout;

/* renamed from: X.Al0, reason: case insensitive filesystem */
/* loaded from: Al0.class */
public final class C1547Al0 extends 1pK {
    public static final String __redex_internal_original_name = "MessengerBubblesNavigationFragment";
    public FbUserSession A00;
    public Boc A01;
    public final 1Br A02 = 1Bq.A00(83041);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1547Al0 c1547Al0) {
        CharSequence A0E;
        MigColorScheme A0j = 7zS.A0j(c1547Al0);
        if (((BubblesSettingsManager) 1Bi.A03(68466)).A00() == 2) {
            A0E = c1547Al0.getString(2131957385);
        } else {
            0Dc A0P = 7zP.A0P(c1547Al0.requireContext());
            A0P.A02(c1547Al0.getString(2131953537));
            A0P.A03(c1547Al0.getString(2131967456), "[[turn on]]", new Object[]{new C1354Aew(c1547Al0, A0j, 2)}, 33);
            A0E = 7zM.A0E(A0P);
        }
        11T.A0A(A0E);
        1LI c1938Ax3 = new C1938Ax3(7zO.A0U(new AeI(c1547Al0, 27)), A0j, A0E);
        Boc boc = c1547Al0.A01;
        if (boc != null) {
            boc.A01.A0y(c1938Ax3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 7zT.A08(this);
        CxA.A00(this, (C1sx) 1Bi.A03(33085), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        11T.A0F(fragment, 0);
        0fH.A0j(__redex_internal_original_name, "onAttachFragment");
        if (fragment instanceof C34t) {
            ((C34t) fragment).A09 = new B5B(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1357573274);
        0fH.A0j(__redex_internal_original_name, "onCreateView");
        Context requireContext = requireContext();
        LithoView lithoView = new LithoView(requireContext, (AttributeSet) null);
        lithoView.setId(2131365697);
        LithoView lithoView2 = new LithoView(requireContext, (AttributeSet) null);
        lithoView2.setId(2131365695);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        lithoView2.setLayoutParams(layoutParams);
        CustomLinearLayout customLinearLayout = new CustomLinearLayout(requireContext);
        customLinearLayout.setBackgroundResource(2132213766);
        customLinearLayout.setOrientation(1);
        customLinearLayout.addView(lithoView);
        CustomRelativeLayout customRelativeLayout = new CustomRelativeLayout(requireContext);
        customRelativeLayout.setBackgroundResource(2132213766);
        CustomFrameLayout customFrameLayout = new CustomFrameLayout(requireContext);
        customFrameLayout.setId(2131365696);
        customFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        customRelativeLayout.addView(customFrameLayout);
        customRelativeLayout.addView(lithoView2);
        customRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        customLinearLayout.addView(customRelativeLayout);
        Boc boc = new Boc(customLinearLayout, lithoView, lithoView2);
        this.A01 = boc;
        ViewGroup viewGroup2 = boc.A00;
        0FI.A08(428652693, A02);
        return viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(1157409140);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A01 = null;
        0FI.A08(1748035281, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        0fH.A0j(__redex_internal_original_name, "onViewCreated");
        super.onViewCreated(view, bundle);
        1LI c1922Awn = new C1922Awn(7zS.A0j(this), CxE.A00(this, 12));
        Boc boc = this.A01;
        if (boc != null) {
            boc.A02.A0y(c1922Awn);
        }
        1pK c34t = new C34t();
        C06c A09 = AbJ.A09(this);
        if (this.A01 != null) {
            A09.A0P(c34t, "inbox", 2131365696);
            C06c.A00(A09, false);
        }
        A03(this);
    }
}
