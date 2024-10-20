package X;

import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import java.util.List;

/* loaded from: LZp.class */
public final class LZp implements GIt {
    public final RQS A01 = new RQS();
    public final RQT A02 = new RQT();
    public final Rb7 A00 = new Rb7();

    public static final void A00(MediatorLiveData mediatorLiveData, LZp lZp, String str, List list) {
        synchronized (lZp) {
            JQz.A19(mediatorLiveData, new RMB(((RMB) JR1.A0p(mediatorLiveData)).A00, str, list));
        }
    }

    public MediatorLiveData A01(Ksw ksw) {
        boolean A1O = JR0.A1O();
        FJC fjc = null;
        Rb7 rb7 = this.A00;
        if (!A1O) {
            fjc = FJC.A03((Object) null);
        }
        return rb7.A01(fjc, ksw);
    }

    public MediatorLiveData A02(L4l l4l, LoggingContext loggingContext, boolean z) {
        LZv A0b = 7zU.A0b();
        List A03 = 11T.A03(KOy.A0H);
        String str = l4l.A09;
        boolean A0O = 11T.A0O(str, "PRE_WARM");
        OtcInput otcInput = l4l.A04;
        A0b.A0P(loggingContext, str, A03, JR1.A15(otcInput != null ? KwO.A00(otcInput) : null), A0O);
        A04(KXo.A00(l4l));
        l4l.A01 = 7zN.A0e(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
        K0F k0f = new K0F(C06014fk.A0F(), this, l4l, 1, z);
        FH8.A02(k0f);
        DSD dsd = ((FH8) k0f).A03;
        MediatorLiveData A01 = A01(KXo.A00(l4l));
        11T.A0I(A01, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        if (A01.getValue() == null) {
            JQz.A1A(A01, (Object) null);
        }
        11T.A0D(dsd);
        KXx.A00(dsd, A01, new FZA(A01, l4l, loggingContext, 9));
        return A01;
    }

    public void A03(Ksw ksw) {
        OtcInput otcInput = ksw.A00;
        Rb7 rb7 = this.A00;
        if (otcInput != null) {
            rb7.A00.remove(ksw);
        } else if (rb7.A00.containsKey(ksw)) {
            MediatorLiveData A02 = rb7.A02(ksw);
            if (JR0.A1R(A02)) {
                JQz.A1A(A02, (Object) null);
            }
        }
    }

    public void A04(Ksw ksw) {
        synchronized (this) {
            MediatorLiveData A01 = A01(ksw);
            11T.A0I(A01, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
            FJC A0X = JQz.A0X(A01);
            A01.setValue(A0X != null ? FJC.A01(LM8.A00, A0X) : null);
        }
    }

    @Override // X.GIt
    public LiveData AMg(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        Object obj = sparseArray.get(12);
        if (obj == null) {
            throw 1BK.A0h();
        }
        String str4 = (String) obj;
        Kzj kzj = null;
        LEL lel = RCq.A00;
        0DA r0 = new 0DA();
        r0.A07("mutation_data", "shipping_address");
        r0.A01(KPG.valueOf(AbK.A19("DELETE")), "mutation_type");
        List A03 = 11T.A03(r0);
        if (otcInput != null) {
            kzj = KwO.A00(otcInput);
        }
        lel.A0F(loggingContext, kzj, "DELETE", (String) null, A03, false);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, "DELETE", "mutation_type");
        07S.A00(A0J, str4, "shipping_address_id");
        07S.A00(A0J, AnonymousClass001.A0K(), "skip_validation");
        DgU A0M = JR2.A0M(str, str2, str3);
        7zN.A17(A0J, A0M, "shipping_address_input");
        A0M.A09("platform_trust_token", "");
        KwO.A01(A0M, otcInput, Kan.A00);
        C06014fk.A0A();
        EH7 eh7 = new EH7(A0M, loggingContext, otcInput, this, C06014fk.A0F(), "DELETE", (String) null, str2);
        FH8.A02(eh7);
        DSD dsd = ((FH8) eh7).A03;
        11T.A0I(dsd, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<*>>");
        LiveData map = Transformations.map(dsd, new M3m(str4, 22));
        MediatorLiveData A01 = A01(new Ksw(otcInput2, str2));
        11T.A0I(A01, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        A01.addSource(map, new LR1(map, A01, this, str4));
        return dsd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, X.0CL] */
    @Override // X.GIt
    public LiveData Ckx(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        Boolean bool;
        int A05 = 7zP.A05(str, str2, 1);
        Object obj = sparseArray.get(3);
        String str4 = null;
        boolean booleanValue = (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) ? false : bool.booleanValue();
        Object A0o = JR1.A0o(sparseArray, 4);
        String str5 = "";
        if (A0o == null) {
            A0o = str5;
        }
        Object obj2 = sparseArray.get(A05);
        if (!(obj2 instanceof String) || obj2 == null) {
            obj2 = str5;
        }
        Object obj3 = sparseArray.get(5);
        if (!(obj3 instanceof String) || obj3 == null) {
            obj3 = str5;
        }
        Object obj4 = sparseArray.get(6);
        if (!(obj4 instanceof String) || obj4 == null) {
            obj4 = str5;
        }
        Object obj5 = sparseArray.get(7);
        if (!(obj5 instanceof String) || obj5 == null) {
            obj5 = str5;
        }
        Object obj6 = sparseArray.get(8);
        if (!(obj6 instanceof String) || obj6 == null) {
            obj6 = str5;
        }
        Object obj7 = sparseArray.get(9);
        if ((obj7 instanceof String) && obj7 != 0) {
            str5 = obj7;
        }
        String A00 = L6D.A00(sparseArray);
        String str6 = null;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, A0o, "label");
        07S.A00(A0J, obj2, "care_of");
        07S.A00(A0J, obj3, "street_1");
        07S.A00(A0J, obj4, "street_2");
        07S.A00(A0J, obj5, ServerW3CShippingAddressConstants.CITY);
        07S.A00(A0J, obj6, "state");
        07S.A00(A0J, str5, "postal_code");
        07S.A00(A0J, A00, "country_code");
        07S.A00(A0J, Boolean.valueOf(booleanValue), "is_default");
        07S.A00(A0J, true, "provide_suggestion");
        Object obj8 = sparseArray.get(12);
        if (obj8 instanceof String) {
            str4 = (String) obj8;
        }
        ?? obj9 = new Object();
        String str7 = "CREATE";
        ((0CL) obj9).element = str7;
        if (str4 != null && str4.length() != 0) {
            str7 = "UPDATE";
            ((0CL) obj9).element = str7;
        }
        Kzj kzj = null;
        if (str7.equals(str7)) {
            str6 = "pux_checkout";
        }
        LEL lel = RCq.A00;
        0DA r0 = new 0DA();
        r0.A07("mutation_data", "shipping_address");
        r0.A01(KPG.valueOf(AbK.A19(str7)), "mutation_type");
        List A03 = 11T.A03(r0);
        if (otcInput != null) {
            kzj = KwO.A00(otcInput);
        }
        lel.A0F(loggingContext, kzj, str7, str6, A03, false);
        GraphQlCallInput graphQlCallInput = new 2Jd(ActionId.VIEW_WILL_APPEAR_BEGIN);
        graphQlCallInput.A09("mutation_type", str7);
        graphQlCallInput.A09("shipping_address_id", str4);
        graphQlCallInput.A06("skip_validation", true);
        7zN.A17(A0J, graphQlCallInput, "save_shipping_address_input");
        DgU dgU = new DgU(72);
        dgU.A09("session_id", str);
        dgU.A09("product_id", str2);
        dgU.A09("client_receiver_id", str3);
        dgU.A05(graphQlCallInput, "shipping_address_input");
        dgU.A09("platform_trust_token", str5);
        KwO.A01(dgU, otcInput, Kan.A00);
        C06014fk.A0A();
        EH7 eh7 = new EH7(dgU, loggingContext, otcInput, this, C06014fk.A0F(), str7, str6, str2);
        FH8.A02(eh7);
        DSD dsd = ((FH8) eh7).A03;
        11T.A0I(dsd, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<*>>");
        LiveData map = Transformations.map(dsd, new M3m(str4, 23));
        Ksw ksw = new Ksw(otcInput2, str2);
        MediatorLiveData A01 = A01(ksw);
        11T.A0I(A01, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        A01.addSource(map, new LR4(map, A01, ksw, otcInput, this, (0CL) obj9));
        return Transformations.map(dsd, M6d.A00);
    }
}
