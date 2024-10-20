package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.widget.CustomLinearLayout;

/* loaded from: B97.class */
public final class B97 extends BJB {
    public static final String __redex_internal_original_name = "BusinessInboxCatalogSettingFragment";
    public FbUserSession A00;
    public C00i A01;
    public LithoView A02;
    public LithoView A03;
    public C6R A04;
    public final C00i A06 = AbF.A0S(this, 980);
    public final C00i A07 = 1BV.A00(83956);
    public final C00i A08 = 1BV.A00(83294);
    public final C00i A05 = AbF.A0S(this, 83960);
    public final DEI A09 = new CnA(this, 3);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = AbL.A09(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1613611363);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        CustomLinearLayout customLinearLayout = new CustomLinearLayout(requireContext());
        AbH.A1J(customLinearLayout, -1);
        customLinearLayout.setOrientation(1);
        Context context = customLinearLayout.getContext();
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        this.A03 = lithoView;
        AbK.A1G(lithoView, customLinearLayout);
        LithoView lithoView2 = new LithoView(context, (AttributeSet) null);
        this.A02 = lithoView2;
        customLinearLayout.addView(lithoView2, new LinearLayout.LayoutParams(-1, -1));
        0FI.A08(151026422, A02);
        return customLinearLayout;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-2139072490);
        super/*X.DZJ*/.onDestroy();
        C6R c6r = this.A04;
        ((CIk) 1Br.A0B(c6r.A06)).A03(1Br.A03(c6r.A0A), c6r.A0C);
        CIk cIk = (CIk) this.A05.get();
        FbUserSession fbUserSession = this.A00;
        fbUserSession.getClass();
        cIk.A03(fbUserSession, this.A09);
        0FI.A08(-1380618369, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super/*X.1pK*/.onViewCreated(view, bundle);
        1BV A0K = AbJ.A0K(this, 83958);
        this.A01 = A0K;
        C7V c7v = (C7V) A0K.get();
        C00i c00i = this.A05;
        CIk cIk = (CIk) c00i.get();
        this.A00.getClass();
        c7v.A00("me_settings", cIk.A01(r0).size());
        this.A04 = ((AbR) this.A06.get()).A0h(this.A02, ((BJB) this).A01, "me_settings", false, true);
        A1c();
        CIk cIk2 = (CIk) c00i.get();
        FbUserSession fbUserSession = this.A00;
        fbUserSession.getClass();
        cIk2.A02(fbUserSession, this.A09);
    }
}
