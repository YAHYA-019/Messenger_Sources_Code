package X;

import android.content.Context;
import com.facebook.common.network.FbNetworkManager;

/* renamed from: X.6tC, reason: invalid class name */
/* loaded from: 6tC.class */
public final class C6tC {
    public static boolean A02;
    public static boolean A03;
    public JIN A00;
    public final 1Br A01 = 1Bq.A00(16687);

    public final void A00(Context context, boolean z, boolean z2) {
        11T.A0F(context, 0);
        if (z && !A02 && ((FbNetworkManager) 1Br.A0B(this.A01)).A0N()) {
            DR6 A022 = ((C5ic) 1Bn.A0A(67527)).A02(context);
            A022.A03(context.getString(2131957561));
            int i = 2131957559;
            if (z2) {
                i = 2131957560;
            }
            A022.A0J(context.getString(i));
            A022.A0E(new IGH(this, 0), context.getString(2131957557));
            A022.A0G(new IGH(this, 1), context.getString(2131957558));
            A022.A0K(false);
            A022.A04().show();
        }
    }
}
