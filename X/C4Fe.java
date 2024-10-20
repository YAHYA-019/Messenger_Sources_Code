package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.4Fe, reason: invalid class name */
/* loaded from: 4Fe.class */
public final class C4Fe {
    public final /* synthetic */ 2M8 A00;
    public final /* synthetic */ 2LQ A01;

    public C4Fe(2M8 r302, 2LQ r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    public void A00(Bundle bundle, Integer num) {
        2PI r304;
        if (0S2.A0u.equals(num)) {
            this.A00.CWE(this.A01.A00);
            return;
        }
        boolean equals = 0S2.A1J.equals(num);
        2Lz A01 = 2LQ.A01(this.A01);
        if (!equals) {
            2PI r0 = 2PI.A02;
            C30c c30c = C30c.$redex_init_class;
            switch (num.intValue()) {
                case 3:
                    r304 = 2PI.A0A;
                    break;
                case 4:
                    r304 = 2PI.A08;
                    break;
                case 5:
                case 9:
                case 10:
                    break;
                case 6:
                case 7:
                case 8:
                case 11:
                case 12:
                case 14:
                default:
                    r304 = 2PI.A09;
                    break;
                case 13:
                    r304 = 2PI.A03;
                    break;
                case 15:
                    r304 = 2PI.A02;
                    break;
                case 16:
                    r304 = 2PI.A0D;
                    break;
            }
            A01.A0C(bundle, r304);
        }
        r304 = 2PI.A07;
        A01.A0C(bundle, r304);
    }

    public void A01(String str) {
        2LQ r0 = this.A01;
        FbFragmentActivity fbFragmentActivity = r0.A00;
        ((6LF) 1Bn.A0D(fbFragmentActivity, 67784)).A01((View.OnClickListener) null, r0.A00, (MigColorScheme) 1Bn.A0D(fbFragmentActivity, 16979), (KT3) null, str, str, -1);
    }
}
