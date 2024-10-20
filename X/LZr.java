package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: LZr.class */
public final class LZr implements GIt {
    public final PhoneNumberUtil A00;
    public final Context A04;
    public final RQS A02 = new RQS();
    public final RQT A03 = new RQT();
    public final Rb7 A01 = new Rb7();

    public LZr(Context context) {
        this.A04 = context;
        this.A00 = PhoneNumberUtil.getInstance(context);
    }

    public static final ArrayList A00(SparseArray sparseArray, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        Object obj = sparseArray.get(2);
        Object obj2 = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        Object obj3 = sparseArray.get(1);
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        Object obj4 = sparseArray.get(0);
        if (obj4 instanceof String) {
            obj2 = obj4;
        }
        if (obj != null) {
            A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str, A0s);
        }
        if (obj3 != null) {
            A05("email", str, A0s);
        }
        if (obj2 != null) {
            A05("phone", str, A0s);
        }
        return A0s;
    }

    public static final void A01(LiveData liveData, Ksw ksw, LZr lZr, String str, String str2) {
        11T.A0I(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.EmailResponse>>");
        LiveData map = Transformations.map(liveData, M6W.A00);
        MediatorLiveData A06 = lZr.A06(ksw);
        11T.A0I(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        11T.A0I(map, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayEmailResponse>>");
        A06.addSource(map, new LR5(map, ksw, A06, lZr, str2, str, 1));
    }

    public static final void A02(LiveData liveData, Ksw ksw, LZr lZr, String str, String str2) {
        11T.A0I(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.PhoneResponse>>");
        LiveData map = Transformations.map(liveData, M6X.A00);
        MediatorLiveData A06 = lZr.A06(ksw);
        11T.A0I(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        11T.A0I(map, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayPhoneNumberResponse>>");
        A06.addSource(map, new LR5(map, ksw, A06, lZr, str2, str, 2));
    }

    public static final void A03(MediatorLiveData mediatorLiveData, Ksy ksy, LZr lZr, String str, List list) {
        synchronized (lZr) {
            FJC A0X = JQz.A0X(mediatorLiveData);
            KtF ktF = (KtF) A0X.A01;
            MQK mqk = ktF.A02.A00;
            11T.A0F(list, 0);
            KtT ktT = new KtT(mqk, ksy, str, list);
            KtS ktS = ktF.A00;
            JQz.A18(mediatorLiveData, A0X, new KtF(new KtS(ktS.A00, (Ksy) null, (String) null, ktS.A03), ktF.A01, ktT));
        }
    }

    public static final void A04(MediatorLiveData mediatorLiveData, Ksy ksy, String str, List list) {
        FJC A0X = JQz.A0X(mediatorLiveData);
        KtF ktF = (KtF) A0X.A01;
        11T.A0D(ktF);
        MQK mqk = ktF.A00.A00;
        11T.A0F(list, 0);
        KtS ktS = new KtS(mqk, ksy, str, list);
        KtT ktT = ktF.A02;
        JQz.A18(mediatorLiveData, A0X, new KtF(ktS, ktF.A01, new KtT(ktT.A00, (Ksy) null, (String) null, ktT.A03)));
    }

    public static void A05(String str, String str2, AbstractCollection abstractCollection) {
        0DA r0 = new 0DA();
        r0.A07("mutation_data", str);
        r0.A01(KPG.valueOf(str2), "mutation_type");
        abstractCollection.add(r0);
    }

    public MediatorLiveData A06(Ksw ksw) {
        boolean A1O = JR0.A1O();
        FJC fjc = null;
        Rb7 rb7 = this.A01;
        if (!A1O) {
            fjc = FJC.A03((Object) null);
        }
        return rb7.A01(fjc, ksw);
    }

    public MediatorLiveData A07(L4l l4l, LoggingContext loggingContext, boolean z) {
        LZv A0b = 7zU.A0b();
        List A03 = 11T.A03(KOy.A04);
        String str = l4l.A09;
        boolean A0O = 11T.A0O(str, "PRE_WARM");
        OtcInput otcInput = l4l.A04;
        A0b.A0P(loggingContext, str, A03, JR1.A15(otcInput != null ? KwO.A00(otcInput) : null), A0O);
        MediatorLiveData A06 = A06(KXo.A00(l4l));
        11T.A0I(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        FJC A0X = JQz.A0X(A06);
        A06.setValue(A0X != null ? FJC.A01(LLl.A00, A0X) : null);
        l4l.A01 = 7zN.A0e("CONTACT_INFORMATION");
        K0F k0f = new K0F(C06014fk.A0F(), this, l4l, 0, z);
        FH8.A02(k0f);
        DSD dsd = ((FH8) k0f).A03;
        MediatorLiveData A062 = A06(KXo.A00(l4l));
        11T.A0I(A062, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        if (A062.getValue() == null) {
            JQz.A1A(A062, (Object) null);
        }
        11T.A0D(dsd);
        KXx.A00(dsd, A062, new FZA(A062, l4l, loggingContext, 5));
        return A062;
    }

    public void A08(Ksw ksw) {
        OtcInput otcInput = ksw.A00;
        Rb7 rb7 = this.A01;
        if (otcInput != null) {
            rb7.A00.remove(ksw);
        } else if (rb7.A00.containsKey(ksw)) {
            MediatorLiveData A02 = rb7.A02(ksw);
            if (JR0.A1R(A02)) {
                JQz.A1A(A02, (Object) null);
            }
        }
    }

    public void A09(Ksw ksw, FJC fjc) {
        11T.A0F(fjc, 1);
        MediatorLiveData A06 = A06(ksw);
        11T.A0I(A06, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        if (FJC.A0C(fjc)) {
            Object obj = fjc.A01;
            obj.getClass();
            GNl gNl = (GNl) obj;
            if (gNl.AkG() == null && JR0.A1S(A06)) {
                String B1q = gNl.B1q();
                if (B1q == null) {
                    throw 1BK.A0h();
                }
                FJC A0X = JQz.A0X(A06);
                KtF ktF = (KtF) A0X.A01;
                Ksx ksx = new Ksx(ktF.A01.A00, B1q);
                KtS ktS = ktF.A00;
                KtS ktS2 = new KtS(ktS.A00, (Ksy) null, (String) null, ktS.A03);
                KtT ktT = ktF.A02;
                JQz.A18(A06, A0X, new KtF(ktS2, ksx, new KtT(ktT.A00, (Ksy) null, (String) null, ktT.A03)));
            }
        }
    }

    public boolean A0A(Ksw ksw) {
        KtF ktF;
        FJC A0X = JQz.A0X(A06(ksw));
        boolean z = false;
        if (A0X != null && (ktF = (KtF) A0X.A01) != null && 1BK.A1Y(ktF.A00.A03)) {
            z = true;
        }
        return z;
    }

    public boolean A0B(Ksw ksw) {
        KtF ktF;
        String str;
        FJC A0X = JQz.A0X(A06(ksw));
        boolean z = false;
        if (A0X != null && (ktF = (KtF) A0X.A01) != null && (str = ktF.A01.A01) != null && !0CU.A0O(str)) {
            z = true;
        }
        return z;
    }

    public boolean A0C(Ksw ksw) {
        KtF ktF;
        FJC A0X = JQz.A0X(A06(ksw));
        boolean z = false;
        if (A0X != null && (ktF = (KtF) A0X.A01) != null && 1BK.A1Y(ktF.A02.A03)) {
            z = true;
        }
        return z;
    }

    @Override // X.GIt
    public LiveData AMg(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        Object obj = sparseArray.get(12);
        if (obj == null) {
            throw 1BK.A0h();
        }
        String str4 = (String) obj;
        Ksw ksw = new Ksw(otcInput2, str2);
        if (i == 0) {
            07S A0J = 4YU.A0J(GraphQlCallInput.A02, str4, "phone_id");
            07S.A00(A0J, true, "skip_validation");
            07S.A00(A0J, "DELETE", "mutation_type");
            DgU dgU = new DgU(72);
            dgU.A09("session_id", str);
            dgU.A09("product_id", ksw.A01);
            dgU.A09("client_receiver_id", str3);
            7zN.A17(A0J, dgU, "phone_input");
            dgU.A09("platform_trust_token", "");
            KwO.A01(dgU, otcInput, Kan.A00);
            C06014fk.A0A();
            0DA r0 = new 0DA();
            r0.A07("mutation_data", "phone");
            r0.A01(KPG.valueOf(AbK.A19("DELETE")), "mutation_type");
            GBI gbi = GBI.A00;
            GAZ gaz = new GAZ(r0, loggingContext, otcInput, 2);
            DLR dlr = new DLR(r0, loggingContext, otcInput, 4);
            gaz.invoke();
            LiveData map = Transformations.map(K0G.A03(C06014fk.A0F(), new FYg(this, 0), new FYl(dgU, this, str2, 0)), new GBq(dlr, gbi, 8));
            A02(map, ksw, this, "DELETE", str4);
            return map;
        }
        if (i != 1) {
            throw 0Pz.A04("{ContactInformationRepoImpl} deleteMutation is not supported for identifier => ", i);
        }
        07S A0J2 = 4YU.A0J(GraphQlCallInput.A02, str4, "email_id");
        07S.A00(A0J2, true, "skip_validation");
        07S.A00(A0J2, "DELETE", "mutation_type");
        DgU dgU2 = new DgU(72);
        dgU2.A09("session_id", str);
        dgU2.A09("product_id", ksw.A01);
        dgU2.A09("client_receiver_id", str3);
        7zN.A17(A0J2, dgU2, "email_input");
        dgU2.A09("platform_trust_token", "");
        KwO.A01(dgU2, otcInput, Kan.A00);
        C06014fk.A0A();
        0DA r02 = new 0DA();
        r02.A07("mutation_data", "email");
        r02.A01(KPG.valueOf(AbK.A19("DELETE")), "mutation_type");
        GBH gbh = GBH.A00;
        GAZ gaz2 = new GAZ(r02, loggingContext, otcInput, 1);
        DLR dlr2 = new DLR(r02, loggingContext, otcInput, 3);
        gaz2.invoke();
        LiveData map2 = Transformations.map(K0G.A03(C06014fk.A0F(), new FYg(this, 1), new FYl(dgU2, this, str2, 0)), new GBq(dlr2, gbh, 8));
        A01(map2, ksw, this, "DELETE", str4);
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01da A[Catch: NumberParseException -> 0x01ee, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberParseException -> 0x01ee, blocks: (B:28:0x01b6, B:30:0x01c6, B:32:0x01ce, B:35:0x01da, B:36:0x01df, B:37:0x01e6), top: B:27:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0305  */
    @Override // X.GIt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.lifecycle.LiveData Ckx(android.util.SparseArray r302, com.facebookpay.logging.LoggingContext r303, com.facebookpay.otc.models.OtcInput r304, com.facebookpay.otc.models.OtcInput r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, int r309) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZr.Ckx(android.util.SparseArray, com.facebookpay.logging.LoggingContext, com.facebookpay.otc.models.OtcInput, com.facebookpay.otc.models.OtcInput, java.lang.String, java.lang.String, java.lang.String, int):androidx.lifecycle.LiveData");
    }
}
