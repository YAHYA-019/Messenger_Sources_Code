package X;

import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.payments.p2p.service.model.transactions.DeclinePaymentParams;
import com.facebook.payments.p2p.service.model.transactions.FetchMoreTransactionsParams;

/* loaded from: E6N.class */
public final class E6N extends 3XG {
    public final C09694qx A00;
    public final F7L A01;
    public final Fgv A02;
    public final Fgw A03;
    public final Fgx A04;
    public final Fhx A05;
    public final Fgy A06;
    public final FhJ A07;
    public final C1671Apd A08;
    public final FhK A09;
    public final FhL A0A;
    public final Fhj A0B;
    public final Fhc A0C;
    public final FhM A0D;
    public final C2189Dgh A0E;
    public final C2190Dgi A0F;
    public final C2194Dgm A0G;
    public final FhN A0H;
    public final Fh0 A0I;
    public final E6O A0J;
    public final E6P A0K;
    public final E6Q A0L;
    public final C2191Dgj A0M;
    public final C2192Dgk A0N;
    public final Fh1 A0O;
    public final FhO A0P;
    public final FhP A0Q;
    public final Fhq A0R;
    public final Fh2 A0S;
    public final FhQ A0T;
    public final C15h A0U;

    public E6N() {
        super("PaymentWebServiceHandler");
        C09694qx A0V = DKE.A0V();
        G7K A01 = G7K.A01(this, ActionId.ACTION_BAR_COMPLETE);
        Fh1 fh1 = (Fh1) 1Bi.A03(98970);
        Fhx fhx = (Fhx) 1Bi.A03(98935);
        C2191Dgj c2191Dgj = (C2191Dgj) 1Bi.A03(98925);
        Fh0 fh0 = (Fh0) 1Bn.A0B(98869);
        Fgv fgv = (Fgv) 1Bn.A0B(99374);
        Fgx fgx = (Fgx) 1Bn.A0B(99373);
        Fgw fgw = (Fgw) 1Bi.A03(98856);
        Fgy fgy = (Fgy) 1Bn.A0B(98857);
        FhJ fhJ = (FhJ) 1Bi.A03(98855);
        Fh2 fh2 = (Fh2) 1Bi.A03(85020);
        C2192Dgk c2192Dgk = (C2192Dgk) 1Bi.A03(98920);
        E6O e6o = (E6O) 1Bi.A03(98923);
        E6P e6p = (E6P) 1Bi.A03(98922);
        E6Q e6q = (E6Q) 1Bi.A03(98921);
        FhP fhP = (FhP) 1Bn.A0B(98817);
        FhK fhK = (FhK) 1Bn.A0B(98870);
        Fhq fhq = (Fhq) 1Bn.A0B(99134);
        FhQ fhQ = (FhQ) 1Bn.A0B(99135);
        Fhc fhc = (Fhc) 1Bn.A0B(98891);
        Fhj fhj = (Fhj) 1Bn.A0B(98890);
        C2189Dgh c2189Dgh = (C2189Dgh) 1Bi.A03(98919);
        C2190Dgi c2190Dgi = (C2190Dgi) 1Bn.A0B(98926);
        FhM fhM = (FhM) 1Bn.A0B(98859);
        FhL fhL = (FhL) 1Bn.A0B(98858);
        FhN fhN = (FhN) 1Bn.A0B(98868);
        FhO fhO = (FhO) 1Bn.A0B(98893);
        C2194Dgm c2194Dgm = (C2194Dgm) 1Bi.A03(98918);
        C1671Apd c1671Apd = (C1671Apd) 1Bi.A03(84801);
        F7L f7l = (F7L) 1Bi.A03(98930);
        this.A00 = A0V;
        this.A0U = A01;
        this.A0O = fh1;
        this.A05 = fhx;
        this.A0M = c2191Dgj;
        this.A0I = fh0;
        this.A02 = fgv;
        this.A04 = fgx;
        this.A03 = fgw;
        this.A06 = fgy;
        this.A07 = fhJ;
        this.A0S = fh2;
        this.A0N = c2192Dgk;
        this.A0J = e6o;
        this.A0K = e6p;
        this.A0L = e6q;
        this.A0Q = fhP;
        this.A09 = fhK;
        this.A0R = fhq;
        this.A0T = fhQ;
        this.A0C = fhc;
        this.A0B = fhj;
        this.A0E = c2189Dgh;
        this.A0F = c2190Dgi;
        this.A0D = fhM;
        this.A0A = fhL;
        this.A0H = fhN;
        this.A0P = fhO;
        this.A0G = c2194Dgm;
        this.A08 = c1671Apd;
        this.A01 = f7l;
    }

    public OperationResult A00(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("addPaymentCardParams");
        return DKE.A0T(this.A02, this.A00, parcelable);
    }

    public OperationResult A01(1Tu r302, 1TC r303) {
        this.A00.A01(this.A0A, r303.A00.getParcelable("CancelPaymentRequestParams"));
        return OperationResult.A00;
    }

    public OperationResult A02(1Tu r302, 1TC r303) {
        this.A00.A01(this.A0H, r303.A00.getParcelable("CancelPaymentTransactionParams"));
        return OperationResult.A00;
    }

    public OperationResult A03(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("CreateGroupRequestParams");
        return DKE.A0T(this.A0B, this.A00, parcelable);
    }

    public OperationResult A04(1Tu r302, 1TC r303) {
        return new OperationResult((String) this.A00.A00(this.A0C, null, r303.A00.getParcelable("CreatePaymentRequestParams")), null);
    }

    public OperationResult A05(1Tu r302, 1TC r303) {
        DeclinePaymentParams declinePaymentParams = (DeclinePaymentParams) r303.A00.getParcelable("declinePaymentParams");
        this.A00.A01(this.A0I, declinePaymentParams);
        if (!1BL.A1a(this.A0U)) {
            this.A01.A01(EnumC3492Mfn.A04, Long.parseLong(declinePaymentParams.A00));
        }
        return OperationResult.A00;
    }

    public OperationResult A06(1Tu r302, 1TC r303) {
        this.A00.A01(this.A0D, r303.A00.getParcelable("DeclinePaymentRequestParams"));
        return OperationResult.A00;
    }

    public OperationResult A07(1Tu r302, 1TC r303) {
        this.A00.A01(this.A03, r303.A00.getParcelable("deletePaymentCardParams"));
        return OperationResult.A00;
    }

    public OperationResult A08(1Tu r302, 1TC r303) {
        return new OperationResult((String) this.A00.A00(this.A04, null, r303.A00.getParcelable("editPaymentCardParams")), null);
    }

    public OperationResult A09(1Tu r302, 1TC r303) {
        C09694qx c09694qx;
        E6Q e6q;
        FetchMoreTransactionsParams fetchMoreTransactionsParams = (FetchMoreTransactionsParams) r303.A00.getParcelable("fetchMoreTransactionsParams");
        EOe eOe = fetchMoreTransactionsParams.A01;
        int ordinal = eOe.ordinal();
        if (ordinal == 0) {
            c09694qx = this.A00;
            e6q = this.A0J;
        } else if (ordinal == 1) {
            c09694qx = this.A00;
            e6q = this.A0K;
        } else {
            if (ordinal != 2) {
                throw AnonymousClass002.A0C(eOe, "Unknown queryType seen ", AnonymousClass001.A0k());
            }
            c09694qx = this.A00;
            e6q = this.A0L;
        }
        return DKE.A0T(e6q, c09694qx, fetchMoreTransactionsParams);
    }

    public OperationResult A0A(1Tu r302, 1TC r303) {
        return OperationResult.A04(this.A00.A00(this.A08, null, null));
    }

    public OperationResult A0B(1Tu r302, 1TC r303) {
        return OperationResult.A04(this.A00.A00(this.A05, null, null));
    }

    public OperationResult A0C(1Tu r302, 1TC r303) {
        return new OperationResult((String) this.A00.A00(this.A0S, null, null), null);
    }

    public OperationResult A0D(1Tu r302, 1TC r303) {
        return OperationResult.A04(this.A00.A00(this.A0G, null, null));
    }

    public OperationResult A0E(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("fetchTransactionListParams");
        return DKE.A0T(this.A0N, this.A00, parcelable);
    }

    public OperationResult A0F(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("fetchTransactionPaymentCardParams");
        return DKE.A0T(this.A0O, this.A00, parcelable);
    }

    public OperationResult A0G(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("SendPaymentMessageParams");
        return DKE.A0T(this.A0R, this.A00, parcelable);
    }

    public OperationResult A0H(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("moneyPennyPlaceOrderParams");
        return DKE.A0T(this.A09, this.A00, parcelable);
    }

    public OperationResult A0I(1Tu r302, 1TC r303) {
        this.A00.A01(this.A0P, r303.A00.getParcelable("mutatePaymentPlatformContextParams"));
        return OperationResult.A00;
    }

    public OperationResult A0J(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("sendCampaignPaymentMessageParams");
        return DKE.A0T(this.A0Q, this.A00, parcelable);
    }

    public OperationResult A0K(1Tu r302, 1TC r303) {
        this.A00.A01(this.A06, r303.A00.getParcelable("setPrimaryCardParams"));
        F7L.A00(AbF.A05(), this.A01, "com.facebook.messaging.payment.ACTION_PRESET_CARD_ADDED");
        return OperationResult.A00;
    }

    public OperationResult A0L(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("verifyPaymentParams");
        return DKE.A0T(this.A0T, this.A00, parcelable);
    }

    public OperationResult A0M(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("FetchPaymentRequestParams");
        return DKE.A0T(this.A0E, this.A00, parcelable);
    }

    public OperationResult A0N(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("FetchPaymentRequestsParams");
        return DKE.A0T(this.A0F, this.A00, parcelable);
    }

    public OperationResult A0O(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("fetchPaymentTransactionParams");
        return DKE.A0T(this.A0M, this.A00, parcelable);
    }

    public OperationResult A0P(1Tu r302, 1TC r303) {
        Parcelable parcelable = r303.A00.getParcelable("P2PSendEligibilityParams");
        return DKE.A0T(this.A07, this.A00, parcelable);
    }
}
