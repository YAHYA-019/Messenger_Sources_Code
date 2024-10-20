package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;

/* renamed from: X.Als, reason: case insensitive filesystem */
/* loaded from: Als.class */
public final class C1573Als extends 1pK implements DEr, DEt {
    public static final String __redex_internal_original_name = "EventCreationDetailsFragment";
    public CNk A00;
    public 2S3 A01;
    public LithoView A02;
    public DGi A03;
    public boolean A04;
    public final 1Br A05 = 7zN.A0I(this);

    public static final void A03(C1573Als c1573Als) {
        LithoView lithoView = c1573Als.A02;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        lithoView.A0y(new C1923Awo(7zQ.A0m(c1573Als.A05), c1573Als.A04));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A04 = AbN.A1V(this);
    }

    @Override // X.DEr
    public void CmT(DGi dGi) {
        11T.A0F(dGi, 0);
        this.A03 = dGi;
    }

    @Override // X.DEt
    public void Cp6(2S3 r302) {
        11T.A0F(r302, 0);
        this.A01 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1037431677);
        LithoView A0M = 7zR.A0M(this);
        this.A02 = A0M;
        0FI.A08(-1235196473, A02);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        DGi dGi = this.A03;
        if (dGi == null) {
            str = "eventCreationContentCallback";
        } else {
            dGi.CvW(getString(2131956602));
            2S3 r0 = this.A01;
            if (r0 == null) {
                str = "fragmentSurface";
            } else {
                requireContext();
                CNk cNk = (CNk) r0.A00(83386);
                this.A00 = cNk;
                if (cNk != null) {
                    CaE.A03(getViewLifecycleOwner(), cNk.A00, new AKM(this, 0), 36);
                    A03(this);
                    return;
                }
                str = "eventCreationDetailUiModel";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
