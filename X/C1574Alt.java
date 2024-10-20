package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Alt, reason: case insensitive filesystem */
/* loaded from: Alt.class */
public final class C1574Alt extends 1pK implements DEr, DEt {
    public static final String __redex_internal_original_name = "ExternalLinkLocationFragment";
    public CNk A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public 2S3 A04;
    public LithoView A05;
    public DGi A06;
    public final 1Br A07 = 7zN.A0I(this);
    public final RF3 A08 = new RF3(this);

    public static final void A03(C1574Alt c1574Alt) {
        String str;
        LithoView lithoView = c1574Alt.A05;
        if (lithoView == null) {
            str = "lithoView";
        } else {
            MigColorScheme A0m = 7zQ.A0m(c1574Alt.A07);
            boolean z = c1574Alt.A03;
            RF3 rf3 = c1574Alt.A08;
            boolean z2 = c1574Alt.A02;
            String str2 = c1574Alt.A01;
            if (str2 != null) {
                lithoView.A0y(new QH5(rf3, A0m, str2, z, z2));
                return;
            }
            str = "inputUrl";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A03 = AbN.A1V(this);
    }

    @Override // X.DEr
    public void CmT(DGi dGi) {
        11T.A0F(dGi, 0);
        this.A06 = dGi;
    }

    @Override // X.DEt
    public void Cp6(2S3 r302) {
        11T.A0F(r302, 0);
        this.A04 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(811789864);
        LithoView A0M = 7zR.A0M(this);
        this.A05 = A0M;
        0FI.A08(-409984355, A02);
        return A0M;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        String str = this.A01;
        if (str == null) {
            11T.A0L("inputUrl");
            throw 0Q8.createAndThrow();
        }
        bundle.putString("arg_input_url", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String string;
        2S3 r0 = this.A04;
        if (r0 == null) {
            str = "fragmentSurface";
        } else {
            CNk cNk = (CNk) r0.A00(83385);
            this.A00 = cNk;
            if (cNk == null) {
                str = "eventsCreationLocationViewData";
            } else {
                String str2 = cNk.A02().A04;
                if (str2 == null) {
                    str2 = "";
                }
                if (bundle != null && (string = bundle.getString("arg_input_url")) != null) {
                    str2 = string;
                }
                this.A01 = str2;
                DGi dGi = this.A06;
                if (dGi != null) {
                    dGi.CvW(getString(2131956664));
                    A03(this);
                    return;
                }
                str = "eventCreationContentCallback";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
