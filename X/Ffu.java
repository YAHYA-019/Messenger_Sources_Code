package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: Ffu.class */
public final class Ffu implements GEs {
    public C3sa A00;
    public GraphQlQueryParamSet A01 = 7zL.A0M();
    public boolean A02 = false;
    public boolean A06 = false;
    public boolean A05 = false;
    public boolean A04 = false;
    public boolean A03 = false;

    public /* bridge */ /* synthetic */ Ffu A00(ImmutableList immutableList) {
        this.A01.A06("component_types", immutableList);
        this.A02 = true;
        return this;
    }

    public /* bridge */ /* synthetic */ Ffu A01(String str) {
        this.A01.A05("fetch_type", str);
        this.A03 = true;
        return this;
    }

    public /* bridge */ /* synthetic */ Ffu A02(String str) {
        this.A01.A05("payment_product_id", str);
        this.A04 = true;
        return this;
    }

    public /* bridge */ /* synthetic */ Ffu A03(String str) {
        this.A01.A05(TraceFieldType.RequestID, str);
        this.A05 = true;
        return this;
    }

    public /* bridge */ /* synthetic */ Ffu A04(String str) {
        this.A01.A05("session_id", str);
        this.A06 = true;
        return this;
    }

    public /* bridge */ /* synthetic */ void A05(2Jd r302) {
        this.A01.A01(r302, "bloks_params");
    }

    public /* bridge */ /* synthetic */ void A06(2Jd r302) {
        this.A01.A01(r302, "charge_amount");
    }

    public /* bridge */ /* synthetic */ void A07(2Jd r302) {
        this.A01.A01(r302, "otc_component_input");
    }

    public /* bridge */ /* synthetic */ void A08(ImmutableList immutableList) {
        this.A01.A06("payment_action_types", immutableList);
    }

    public /* bridge */ /* synthetic */ void A09(ImmutableList immutableList) {
        this.A01.A06("supported_container_types", immutableList);
    }

    public /* bridge */ /* synthetic */ void A0A(String str) {
        this.A01.A05(JQw.A00(256), str);
    }

    public /* bridge */ /* synthetic */ void A0B(String str) {
        this.A01.A05(AbE.A00(ActionId.DISPLAYED), str);
    }

    public /* bridge */ /* synthetic */ void A0C(String str) {
        this.A01.A05("order_id", str);
    }

    public /* bridge */ /* synthetic */ void A0D(String str) {
        this.A01.A05("otc_session_id", str);
    }

    public /* bridge */ /* synthetic */ void A0E(String str) {
        this.A01.A05("otc_type", str);
    }

    public /* bridge */ /* synthetic */ void A0F(String str) {
        this.A01.A05("payment_container_mode", str);
    }

    public /* bridge */ /* synthetic */ void A0G(String str) {
        this.A01.A05("receiver_id", str);
    }

    @Override // X.GEs
    public /* bridge */ /* synthetic */ C3s4 ACe() {
        Preconditions.checkArgument(this.A02);
        Preconditions.checkArgument(this.A06);
        Preconditions.checkArgument(this.A05);
        Preconditions.checkArgument(this.A04);
        Preconditions.checkArgument(this.A03);
        if (this.A00 != null) {
            DKC.A1W("FBPayComponentDataQueryResponse");
            return this.A00;
        }
        C3sa A0R = DKC.A0R(this.A01, new 2Jf(C3329Jqo.class, C3358Mam.class, "FBPayComponentDataQuery", (String) null, "fbpay-android", -679334865, 0, 1191857345L, 1191857345L, false, true));
        this.A00 = A0R;
        return A0R;
    }
}
