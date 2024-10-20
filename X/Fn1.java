package X;

import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.p2p.paypal.PaypalFundingOptionData;
import java.util.HashSet;

/* loaded from: Fn1.class */
public final class Fn1 implements GFj {
    public final /* synthetic */ C2046Da7 A00;

    public Fn1(C2046Da7 c2046Da7) {
        this.A00 = c2046Da7;
    }

    @Override // X.GFj
    public void BoJ(2JX r302) {
        CurrencyAmount A0U;
        CurrencyAmount A0U2;
        GIE gie = this.A00.A03;
        HashSet A0v = AnonymousClass001.A0v();
        String A0r = r302.A0r(1845434661);
        AbF.A1T(A0r);
        String A0j = r302.A0j();
        AbF.A1U(A0j);
        2JY A0B = 1BK.A0B(r302, 2JX.class, -1422887516, 103802029);
        if (A0B == null) {
            A0U = null;
        } else {
            Parcelable.Creator creator = CurrencyAmount.CREATOR;
            A0U = DKH.A0U(A0B, A0B.A0n());
        }
        HashSet A0z = 4YV.A0z("totalAmount", A0v, A0v);
        2JY A0B2 = 1BK.A0B(r302, 2JX.class, -576957429, 103802029);
        if (A0B2 == null) {
            A0U2 = null;
        } else {
            Parcelable.Creator creator2 = CurrencyAmount.CREATOR;
            A0U2 = DKH.A0U(A0B2, A0B2.A0n());
        }
        gie.COd(new PaypalFundingOptionData(A0U2, A0U, A0r, A0j, 4YV.A10("feeAmount", A0z)));
    }
}
