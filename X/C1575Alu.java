package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.runtimepermissions.RequestPermissionsConfig;

/* renamed from: X.Alu, reason: case insensitive filesystem */
/* loaded from: Alu.class */
public final class C1575Alu extends 1pK implements DEr, DEt {
    public static final int A0B = View.generateViewId();
    public static final String[] A0C = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public static final String __redex_internal_original_name = "EventCreationLocationFragment";
    public CNA A00;
    public DGi A01;
    public CNk A02;
    public 53U A03;
    public 53S A04;
    public boolean A05;
    public 2S3 A06;
    public final 1Br A07 = 7zN.A0I(this);
    public final 1Br A08 = 1BK.A0C();
    public final RF0 A09 = new RF0(this);
    public final JEv A0A = new Cls(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A05 = AbN.A1V(this);
    }

    @Override // X.DEr
    public void CmT(DGi dGi) {
        11T.A0F(dGi, 0);
        this.A01 = dGi;
    }

    @Override // X.DEt
    public void Cp6(2S3 r302) {
        11T.A0F(r302, 0);
        this.A06 = r302;
    }

    public void onAttachFragment(Fragment fragment) {
        QPM qpm;
        11T.A0F(fragment, 0);
        if (!(fragment instanceof QPM) || (qpm = (QPM) fragment) == null) {
            return;
        }
        RF0 rf0 = this.A09;
        11T.A0F(rf0, 0);
        qpm.A01 = rf0;
        qpm.A03 = this.A0A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2120978034);
        FrameLayout A08 = AbJ.A08(this);
        A08.setId(A0B);
        0FI.A08(105766155, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        MigColorScheme.A00(view, 7zQ.A0m(this.A07));
        DGi dGi = this.A01;
        if (dGi == null) {
            str = "eventCreationContentCallback";
        } else {
            dGi.CvW(getString(2131958772));
            2S3 r0 = this.A06;
            if (r0 == null) {
                str = "fragmentSurface";
            } else {
                this.A02 = (CNk) r0.A00(83385);
                if (bundle != null) {
                    return;
                }
                53S r02 = (53S) 7zO.A0l(this, 49478);
                this.A04 = r02;
                if (r02 == null) {
                    str = "permissionsManagerProvider";
                } else {
                    this.A03 = r02.A01(this);
                    this.A00 = new CNA(requireContext(), this);
                    C5iw c5iw = new C5iw();
                    c5iw.A00 = AbG.A11();
                    c5iw.A06 = true;
                    RequestPermissionsConfig requestPermissionsConfig = new RequestPermissionsConfig(c5iw);
                    GzL gzL = new GzL(this, 1);
                    if (1Br.A07(this.A08).AZk(36326902109132662L)) {
                        CNA cna = this.A00;
                        if (cna != null) {
                            cna.A01(requestPermissionsConfig, gzL, 1BJ.A00(1263), "event_creation_location_fragment", A0C);
                            return;
                        }
                        str = "locationSettingsOptInCore";
                    } else {
                        53U r03 = this.A03;
                        if (r03 != null) {
                            r03.AHQ(requestPermissionsConfig, gzL, A0C);
                            return;
                        }
                        str = "permissionsManager";
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
