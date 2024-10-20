package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model.ReachabilitySetting;

/* loaded from: B98.class */
public final class B98 extends BJB {
    public static final String __redex_internal_original_name = "ReachabilitySettingDeliveryFragment";
    public CfG A00;
    public C00i A01;
    public DGH A02;
    public CFB A03;
    public ReachabilitySetting A04;
    public String A05;
    public String A06;
    public String A07;
    public final C00i A0B = 1Bu.A02(this, 803);
    public final 1Br A0A = AbG.A0O();
    public final C00i A09 = 1Bu.A02(this, 83250);
    public final C00i A08 = 1Bu.A02(this, 82650);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = AbG.A0a();
        C1F6 A0P = AbF.A0P(this.A0B);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            CFB cfb = new CFB(7zQ.A0S(A0P), this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = cfb;
            if (bundle == null) {
                bundle = requireArguments();
            }
            ReachabilitySetting reachabilitySetting = (ReachabilitySetting) bundle.getParcelable("reachability_setting_key");
            if (reachabilitySetting == null) {
                throw 1BK.A0h();
            }
            this.A04 = reachabilitySetting;
            this.A06 = bundle.getString("ig_name_key");
            this.A07 = bundle.getString("obid_key");
            this.A05 = bundle.getString("current_delivery_option_key");
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1a() {
        this.mFragmentManager.A0w();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1635874867);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(760472771, A04);
        return A0J;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.DZJ*/.onSaveInstanceState(bundle);
        ReachabilitySetting reachabilitySetting = this.A04;
        if (reachabilitySetting == null) {
            11T.A0L("reachabilitySetting");
            throw 0Q8.createAndThrow();
        }
        bundle.putParcelable("reachability_setting_key", reachabilitySetting);
        bundle.putString("ig_name_key", this.A06);
        bundle.putString("obid_key", this.A07);
        bundle.putString("current_delivery_option_key", this.A05);
    }
}
