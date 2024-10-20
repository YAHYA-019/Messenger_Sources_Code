package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Akh, reason: case insensitive filesystem */
/* loaded from: Akh.class */
public final class C1528Akh extends 1pK {
    public static final String __redex_internal_original_name = "ThreadNotificationSoundFragment";
    public 1pI A00;
    public LithoView A01;
    public 2Pg A02;
    public final C5xv A03 = CxE.A00(this, 72);

    public 1iF A1R() {
        return AbF.A0C(1495860380622412L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        ThreadKey threadKey = (ThreadKey) AbM.A0B(this);
        this.A02 = ((C2xd) 7zO.A0l(this, 464)).A0C(getContext(), 1BM.A01(this), threadKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(949750391);
        LithoView A0O = AbK.A0O(this);
        this.A01 = A0O;
        0FI.A08(1627468418, A02);
        return A0O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-1097053090);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A01 = null;
        0FI.A08(447407921, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(1600898542);
        super/*androidx.fragment.app.Fragment*/.onStart();
        if (this.A01 != null) {
            MigColorScheme A0j = 7zS.A0j(this);
            LithoView lithoView = this.A01;
            GnI gnI = null;
            1Iw r307 = lithoView != null ? lithoView.A09 : null;
            2Pg r0 = this.A02;
            if (r0 != null) {
                gnI = r0.A0h();
            }
            ImmutableList A0e = 7zN.A0e(gnI);
            LithoView lithoView2 = this.A01;
            if (lithoView2 != null) {
                AbN.A19(new AxE(A0j, this.A03, A0e), r307, lithoView2);
            }
        }
        0FI.A08(141027089, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = 1vD.A00(view);
    }
}
