package X;

import android.net.Uri;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.messaging.rollcall.presentation.viewer.model.ContributionReactionsViewState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.8e6, reason: invalid class name */
/* loaded from: 8e6.class */
public final class C8e6 extends 1LH {
    public final AaM A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final 8K8 A05;
    public final MediaMessageItem A06;
    public final MigColorScheme A07;
    public final C66e A08;
    public final boolean A09;

    public C8e6(AaM aaM, 8K8 r303, MediaMessageItem mediaMessageItem, MigColorScheme migColorScheme, C66e c66e, float f, float f2, float f3, int i, boolean z) {
        7zR.A1O(migColorScheme, r303);
        this.A04 = i;
        this.A07 = migColorScheme;
        this.A05 = r303;
        this.A06 = mediaMessageItem;
        this.A03 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A00 = aaM;
        this.A09 = z;
        this.A08 = c66e;
    }

    public 1LI A0s(C2k5 c2k5) {
        2cL r312;
        11T.A0F(c2k5, 0);
        8K8 r0 = this.A05;
        boolean z = r0.A05;
        float f = this.A03;
        float f2 = f;
        float f3 = this.A01;
        if (z) {
            f *= f3;
        } else {
            f2 = f * f3;
        }
        C1u2 A0I = 4YV.A0I();
        2lQ r02 = 2lO.A02;
        2cL r316 = null;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A00, 7zL.A07(f));
        long A07 = 7zL.A07(f2);
        Integer num = 0S2.A01;
        2lO A0K2 = 4YV.A0K(A0K, num, A07);
        int i = this.A04;
        2lO A0b = 7zS.A0b(A0K2, 0S2.A08, 0Pz.A0T("media_grid_item_component_", i));
        C2sn A0L = 7zR.A0L(c2k5);
        Integer num2 = r0.A03;
        Uri uri = r0.A01;
        boolean z2 = r0.A06;
        long j = r0.A00;
        float f4 = this.A02;
        A0L.A00(new 8hW(uri, this.A00, this.A07, this.A08, num2, f, f2, f4, i, j, z2, this.A09));
        MediaMessageItem mediaMessageItem = this.A06;
        if (mediaMessageItem == null || !mediaMessageItem.BTC()) {
            r312 = null;
        } else {
            C1ro c1ro = C1ro.FLEX_END;
            C1rp c1rp = C1rp.FLEX_START;
            2dP r03 = 2dP.A01;
            2lO A0Y = 7zQ.A0Y(4YV.A0L((2lO) null, 0S2.A0Y, r03, 0), num, 7zP.A08());
            C2sn A0K3 = 7zS.A0K(A0L);
            C2cm A0I2 = 7zL.A0I(A0K3);
            7zN.A18(A0I2, C1u3.A3h, A0I);
            A0I2.A2Z(2132214193);
            A0I2.A2H(r03);
            A0I2.A2F(C26z.END, R.dimen.mapbox_eight_dp);
            A0I2.A1Z(R.dimen.mapbox_eight_dp);
            7zO.A19(A0I2, A0K3);
            r312 = C2so.A0B(A0K3, A0L, A0Y, c1ro, c1rp);
        }
        A0L.A00(r312);
        ContributionReactionsViewState contributionReactionsViewState = r0.A02;
        if (contributionReactionsViewState != null) {
            2dP r04 = 2dP.A01;
            Integer num3 = 0S2.A0Y;
            2lO A0X = 7zT.A0X(4YV.A0L((2lO) null, num3, r04, 0), new 2lV(num3, 7zP.A08()), Double.doubleToRawLongBits(-10.0d));
            C2sn A0K4 = 7zS.A0K(A0L);
            7zL.A1L(A0K4.A00);
            r316 = 7zM.A0l(new 8XB(new 9wI(this), contributionReactionsViewState, r0.A04), A0K4, A0L, A0X);
        }
        return 7zM.A0k(r316, A0L, c2k5, A0b);
    }
}
