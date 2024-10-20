package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.iorg.common.upsell.model.PromoDataModel;
import com.facebook.iorg.common.upsell.server.ZeroPromoResult;
import com.facebook.iorg.common.upsell.server.ZeroRecommendedPromoResult;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;

/* loaded from: Dpo.class */
public final class Dpo extends Dpp {
    public static final String __redex_internal_original_name = "UpsellDialogFragment";
    public LinearLayout A00;
    public ZeroPromoResult A01;
    public ZeroRecommendedPromoResult A02;
    public EgS A04;
    public ImmutableMap A05;
    public boolean A03 = false;
    public final java.util.Map A06 = AnonymousClass001.A0u();

    /* JADX WARN: Multi-variable type inference failed */
    private EM6 A05() {
        if (requireArguments().getParcelable("promo_data_model") == null) {
            return EM6.A03;
        }
        int i = requireArguments().getInt("current_screen", 1);
        EM6[] values = EM6.values();
        if (i < 0 || i >= values.length) {
            throw AnonymousClass001.A0L("Unrecognized int value for Screen");
        }
        return values[i];
    }

    private Eub A06(EM6 em6) {
        java.util.Map map = this.A06;
        Eub eub = (Eub) map.get(em6);
        if (eub == null) {
            eub = new Eub((C00i) this.A05.get(em6), this);
            map.put(em6, eub);
        }
        return eub;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Dpo, androidx.fragment.app.Fragment] */
    public static Dpo A07(EM6 em6, EMn eMn, Object obj, Object obj2, String str) {
        ?? dpo = new Dpo();
        Bundle A08 = Dpp.A08(eMn, obj2, str, null, null);
        A08.putInt("current_screen", em6.ordinal());
        A08.putInt("title_extra_image_resource_id", 0);
        A08.putParcelable("promo_data_model", (Parcelable) obj);
        dpo.setArguments(A08);
        return dpo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dpp
    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        A0n.setCanceledOnTouchOutside(true);
        if (bundle != null) {
            requireArguments().putInt("current_screen", EM6.valueOf(bundle.getString("current_screen")).ordinal());
            Parcelable parcelable = bundle.getParcelable("promo_data_model");
            ZeroRecommendedPromoResult zeroRecommendedPromoResult = (ZeroRecommendedPromoResult) bundle.getParcelable("promo_result");
            requireArguments().putParcelable("promo_data_model", parcelable);
            this.A02 = zeroRecommendedPromoResult;
        }
        return A0n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A19(EM6 em6) {
        EM6 A05;
        C00i c00i;
        if (this.A04 == null) {
            throw AnonymousClass001.A0N("Called go to screen before Fragment.onCreate was called");
        }
        Context context = getContext();
        if (!isAdded() || context == null) {
            return;
        }
        AbI.A1N(this.A04.A00);
        if (!this.A03 || (A05 = A05()) == em6) {
            return;
        }
        requireArguments().putInt("current_screen", em6.ordinal());
        View A00 = A06(A05).A00(context);
        DQU A002 = A06(em6).A00(context);
        ImmutableMap immutableMap = this.A05;
        if (immutableMap != null && (c00i = (C00i) immutableMap.get(em6)) != null) {
            FAG fag = (FAG) c00i.get();
            PromoDataModel promoDataModel = (PromoDataModel) requireArguments().getParcelable("promo_data_model");
            fag.A01 = this;
            fag.A00 = promoDataModel;
            fag.A05(A002);
        }
        this.A00.removeView(A00);
        this.A00.addView(A002);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dpp
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(921507345);
        super.onCreate(bundle);
        EgS egS = (EgS) 1Bi.A03(98826);
        1BV A00 = 1BV.A00(98843);
        1BV A002 = 1BV.A00(98840);
        1BV A003 = 1BV.A00(98839);
        1BV A0S = AbF.A0S(this, 98837);
        1BV A004 = 1BV.A00(98842);
        1BV A005 = 1BV.A00(98841);
        1BV A0S2 = AbF.A0S(this, 98838);
        1BV A0S3 = AbF.A0S(this, 98835);
        1BV A0S4 = AbF.A0S(this, 98836);
        1BV A0S5 = AbF.A0S(this, 98834);
        1BV A006 = 1BV.A00(98821);
        this.A04 = egS;
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.put(EM6.A0A, A002);
        A0c.put(EM6.A06, A00);
        A0c.put(EM6.A0B, A004);
        A0c.put(EM6.A07, A005);
        A0c.put(EM6.A02, A003);
        A0c.put(EM6.A05, A0S);
        A0c.put(EM6.A04, A0S2);
        A0c.put(EM6.A03, A0S3);
        A0c.put(EM6.A08, A0S4);
        A0c.put(EM6.A01, A0S5);
        this.A05 = AbG.A10(A0c, EM6.A09, A006);
        A0g(1, 2132608821);
        0FI.A08(-1227778503, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(131211777);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.A00 = linearLayout;
        FXr.A03(linearLayout, this, 50);
        View A00 = A06(A05()).A00(context);
        if (A00 != null) {
            this.A00.addView(A00);
        }
        LinearLayout linearLayout2 = this.A00;
        0FI.A08(240245120, A02);
        return linearLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(2036511625);
        Iterator A1A = 1BK.A1A(this.A06);
        while (A1A.hasNext()) {
            Eub eub = (Eub) A1A.next();
            FAG fag = eub.A01;
            if (fag != null) {
                fag.A01 = null;
            }
            eub.A01 = null;
        }
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(838789286, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1451938995);
        this.A03 = false;
        A06(A05()).A00 = null;
        super.onDestroyView();
        0FI.A08(421911158, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Dpp
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("current_screen", A05().toString());
        bundle.putParcelable("promo_data_model", requireArguments().getParcelable("promo_data_model"));
        bundle.putParcelable("promo_result", this.A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.A03 = true;
    }
}
