package X;

import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.picker.model.PickerScreenConfig;
import com.facebook.payments.shipping.addresspicker.ShippingAddressPickerRunTimeData;
import com.google.common.collect.ImmutableList;

/* loaded from: Fnv.class */
public final class Fnv implements GJY {
    public Exy A00;
    public 1BY A01;
    public final C00i A04 = 1BV.A01((1BY) null, 49829);
    public final C00i A02 = 1BQ.A01();
    public final FIQ A03 = DKG.A0i();
    public final Em3 A05 = (Em3) 1Bn.A0E((Context) null, (1BY) null, 98537);
    public final F7o A06 = (F7o) 1Bn.A0E((Context) null, (1BY) null, 68083);

    public Fnv(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public void D1f(GFp gFp, ShippingAddressPickerRunTimeData shippingAddressPickerRunTimeData) {
        this.A00.A01();
        C2081Db6 c2081Db6 = new C2081Db6(12, gFp, shippingAddressPickerRunTimeData, this);
        ImmutableList.Builder A0h = 4YU.A0h();
        AbJ.A1P(this.A01);
        A0h.m11011add((Object) this.A06.A01(shippingAddressPickerRunTimeData.A02.forceFetchData));
        Em3 em3 = this.A05;
        C03z c03z = GraphQlCallInput.A02;
        String obj = PaymentItemType.A0W.toString();
        07S A02 = c03z.A02();
        GraphQlQueryParamSet A0N = 4YU.A0N(A02, obj, "payment_type");
        4YV.A1A(A02, A0N, "query_params");
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "FBPaymentsAddressFormConfigQuery", (String) null, "fbandroid", 2136490816, 0, 4012393483L, 4012393483L, false, true);
        r0.A00 = A0N;
        C3sa A0L = AbK.A0L(r0);
        A0L.A0B = false;
        1Vd A0J = AbK.A0J(em3.A01);
        4YU.A1J(A0L, 515262072463507L);
        1FV A09 = A0J.A09(A0L);
        DKF.A0h(this.A04).A03(c2081Db6, 1Kd.A00(AbG.A0z(A0h, AbJ.A0t(em3.A02, new Fvf(em3, 48), A09))), "fetch_shipping_addresses");
        PickerScreenConfig pickerScreenConfig = shippingAddressPickerRunTimeData.A01;
        FIQ.A02(PaymentsFlowStep.A27, this.A03, PickerScreenConfig.A00(pickerScreenConfig));
    }

    public void AE9() {
        DKG.A1N(this.A04);
    }

    public void CsU(Exy exy) {
        this.A00 = exy;
    }
}
