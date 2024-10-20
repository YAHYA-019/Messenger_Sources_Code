package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.invoice.creation.v2.model.InvoiceData;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fmg.class */
public final class Fmg implements GOL {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1De A05;

    public Fmg(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A04 = 1Bu.A03(r0, 16428);
        this.A03 = 1Bu.A03(r0, 98534);
        this.A02 = 1Bu.A03(r0, 1076);
        this.A00 = AbG.A0M();
        this.A01 = 1Bq.A00(98761);
    }

    @Override // X.GOL
    public ListenableFuture Bz7(Context context, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, String str) {
        ThreadKey threadKey;
        ListenableFuture A0z;
        FvZ fvZ;
        C00i c00i;
        11T.A0F(context, 0);
        boolean A1Z = 7zP.A1Z(p2pPaymentData);
        11T.A0F(p2pPaymentConfig, 3);
        C00i c00i2 = this.A01.A00;
        c00i2.get();
        if (p2pPaymentConfig.A09 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        InvoiceData invoiceData = p2pPaymentData.A02;
        if (invoiceData == null) {
            1Br.A04(this.A00).D11("MessengerP2mInvoiceFlowLifecycleController", "No invoice data found");
            threadKey = null;
        } else {
            threadKey = invoiceData.A01;
        }
        if (threadKey == null) {
            1Br.A04(this.A00).D11("MessengerP2mInvoiceFlowLifecycleController", "No thread key set");
            return null;
        }
        if (invoiceData == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str2 = invoiceData.A06;
        if (str2 == null) {
            1Br.A04(this.A00).D11("MessengerP2mInvoiceFlowLifecycleController", "No entry point set");
        }
        FbUserSession A0E = 4YV.A0E(context);
        c00i2.get();
        Epi epi = (Epi) 1Bn.A0E(context, (1BY) null, 99033);
        11T.A0F(A0E, 0);
        11T.A0I(invoiceData, "null cannot be cast to non-null type com.facebook.payments.invoice.creation.v2.model.InvoiceData");
        ThreadKey threadKey2 = invoiceData.A01;
        if (threadKey2 == null) {
            1Br.A04(epi.A01).D11("MessengerP2mBuyerInitiatedPaymentUtil", "No thread key found");
            return null;
        }
        String str3 = invoiceData.A0A;
        11T.A0A(str3);
        if (threadKey2.A1K()) {
            C03z c03z = GraphQlCallInput.A02;
            CurrencyAmount A00 = p2pPaymentData.A00();
            07S A0J = 4YU.A0J(c03z, DKF.A0t(A00), "amount");
            07S.A00(A0J, A00.A00, "currency");
            2Jd A0Q = DKC.A0Q();
            7zN.A17(A0J, A0Q, "currency_amount");
            A0Q.A09("title", context.getString(2131963148));
            A0Q.A09("quantity", ConstantsKt.CAMERA_ID_BACK);
            A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "CUSTOMIZED");
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A09("invoice_type", "BUYER_REQUEST");
            graphQlCallInput.A0A("items", ImmutableList.of((Object) A0Q));
            graphQlCallInput.A06("is_buyer_initialized", Boolean.valueOf(A1Z));
            graphQlCallInput.A09("notes", p2pPaymentData.A0B);
            graphQlCallInput.A09(DexOptimization.OPT_KEY_CLIENT, "PAGES_COMMERCE");
            graphQlCallInput.A09("seller_id", String.valueOf(threadKey2.A02));
            graphQlCallInput.A09("buyer_id", String.valueOf(threadKey2.A05));
            Elo elo = (Elo) 1Br.A0B(epi.A03);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A01(graphQlCallInput, "input");
            A0z = AbK.A0z(1VX.A05(elo.A00, A0E), 5Dh.A00(A0M, new C01643sd(Q8y.class, "PageCommerceInvoiceCreationMutation", null, "input", "fbandroid", -411852218, 192, 578275771L, 578275771L, false, A1Z)), 545759736138515L);
            fvZ = FvZ.A00;
            c00i = elo.A01;
        } else {
            2Jd A0Q2 = DKC.A0Q();
            CurrencyAmount A002 = p2pPaymentData.A00();
            A0Q2.A09("amount", DKF.A0t(A002));
            A0Q2.A09("currency", A002.A00);
            07S A02 = GraphQlCallInput.A02.A02();
            DKF.A1L(A02, A0Q2, "currency_amount");
            07S.A00(A02, 1BK.A0w(threadKey2), "message_thread_id");
            07S.A00(A02, "BUYER_REQUEST", "invoice_action");
            07S.A00(A02, String.valueOf(str2), "entrypoint");
            String str4 = p2pPaymentData.A0B;
            if (str4 != null) {
                07S.A00(A02, str4, "invoice_notes");
            }
            Elp elp = (Elp) 1Br.A0B(epi.A04);
            GraphQlQueryParamSet A0M2 = 7zL.A0M();
            4YV.A1A(A02, A0M2, "input");
            A0z = AbK.A0z(1VX.A05(elp.A00, A0E), 5Dh.A00(A0M2, new C01643sd(2JX.class, "ProfileCommerceInvoiceCreationMutation", null, "input", "fbandroid", -1776259979, 384, 2335528995L, 2335528995L, false, A1Z)), 545759736138515L);
            fvZ = Fva.A00;
            c00i = elp.A01;
        }
        return 2FP.A01(new D2v(context, epi, str3, 3), AbJ.A0t(c00i, fvZ, A0z));
    }

    @Override // X.GOL
    public ListenableFuture Bz8(P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        ThreadKey threadKey;
        11T.A0F(p2pPaymentData, 0);
        1Br.A0C(this.A01);
        FbUserSession A03 = 1Br.A03(this.A04);
        Eln eln = (Eln) 1Br.A0B(this.A03);
        InvoiceData invoiceData = p2pPaymentData.A02;
        if (invoiceData == null || (threadKey = invoiceData.A01) == null) {
            1BK.A09(eln.A01).D11("P2mPaymentConfigBuilder", "No invoice data or thread key found");
            return 1hM.A01;
        }
        Eiz eiz = (Eiz) eln.A02.get();
        String A0w = 1BK.A0w(threadKey);
        11T.A0F(A03, 0);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0w);
        return Fvf.A00(7zT.A09(eiz.A00).A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MessengerP2mThreadDataQuery", (String) null, "fbandroid", -71929531, 0, 4269305066L, 4269305066L, false, true))), eln, 12);
    }

    @Override // X.GFg
    public void Cqu(RTb rTb) {
    }
}
