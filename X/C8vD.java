package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;

/* renamed from: X.8vD, reason: invalid class name */
/* loaded from: 8vD.class */
public final class C8vD extends BJB implements 1pN {
    public static final String __redex_internal_original_name = "MemuUploadedPhotosFragment";
    public 1pI A00;
    public final 1Br A01 = 7zM.A0Y();
    public final C01i A02;
    public final C01i A03;
    public final C01i A04;

    public C8vD() {
        C03i c03i = C03i.A02;
        this.A02 = AQk.A00(this, c03i, 46);
        this.A03 = AQk.A00(this, c03i, 47);
        0BY A18 = 7zL.A18(8Cx.class);
        this.A04 = 7zU.A0F(AQk.A01(this, 48), AQk.A01(this, 49), AQc.A00(null, this, 30), A18);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1789010881);
        11T.A0F(layoutInflater, 0);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        7zQ.A1I(7zV.A0E(A1Y), A1Y);
        0FI.A08(336477070, A02);
        return A1Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A00 = 1vD.A00(view);
        AJT.A02(this, 7zO.A0J(this), 16);
    }
}
