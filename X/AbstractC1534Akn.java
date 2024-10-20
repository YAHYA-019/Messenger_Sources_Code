package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.litho.LithoView;
import com.facebook.messaging.location.model.NearbyPlace;

/* renamed from: X.Akn, reason: case insensitive filesystem */
/* loaded from: Akn.class */
public abstract class AbstractC1534Akn extends 1pK {
    public static final String __redex_internal_original_name = "LocationPickerFragment";
    public View A00;
    public AbstractC2385Gbm A01;
    public final C00i A02 = AbH.A0c(this);

    public 1iF A1R() {
        return AbF.A0C(1645341882290020L);
    }

    public RF1 A1X() {
        return null;
    }

    public NearbyPlace A1Y(String str) {
        return null;
    }

    public abstract JEv A1Z();

    public abstract HRV A1a();

    public abstract AbstractC2385Gbm A1b();

    public abstract String A1c();

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof AbstractC2385Gbm) {
            AbstractC2385Gbm abstractC2385Gbm = (AbstractC2385Gbm) fragment;
            this.A01 = abstractC2385Gbm;
            abstractC2385Gbm.A04 = A1Z();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(899072685);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542562);
        0FI.A08(-2000459271, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(785176477);
        long A00 = 1EK.A00();
        1EK.A02();
        try {
            ReqContext A04 = AnonymousClass018.A04(__redex_internal_original_name, ReqContextTypeResolver.resolveName("ui_components"));
            try {
                super/*androidx.fragment.app.Fragment*/.onResume();
                if (getChildFragmentManager().A0b("search_results_fragment_tag") == null) {
                    if (this.A01 == null) {
                        AbJ.A1J(AbJ.A09(this), A1b(), "search_results_fragment_tag", 2131365420);
                        getChildFragmentManager().A0t();
                    }
                    C06c A09 = AbJ.A09(this);
                    A09.A0K(this.A01);
                    C06c.A00(A09, false);
                }
                if (A04 != null) {
                    A04.close();
                }
                1EK.A04(A00);
                0FI.A08(774280081, A02);
            } finally {
            }
        } catch (Throwable th) {
            1EK.A04(A00);
            0FI.A08(-2066047867, A02);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        View A0F = 7zL.A0F(this, 2131365377);
        this.A00 = A0F;
        LithoView lithoView = (LithoView) A0F;
        1Iw A0P = AbI.A0P(this);
        2Yl cpS = new CpS(this, 5);
        CpW cpW = new CpW(this, 3);
        C2ze A00 = 2hU.A00(A0P);
        C00i c00i = this.A02;
        A00.A2Y(BWx.A00(AbF.A0p(c00i)));
        A00.A2X(cpS);
        A00.A01.A05 = cpW;
        lithoView.A0x(A00.A2W());
        this.A00 = lithoView;
        7zL.A0F(this, 2131367142).setVisibility(8);
        AbH.A1K(view, AbF.A0p(c00i).AjC());
    }
}
