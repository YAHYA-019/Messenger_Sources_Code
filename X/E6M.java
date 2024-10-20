package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.facebook.payments.p2p.service.model.cards.DeletePaymentCardParams;
import com.facebook.payments.p2p.service.model.cards.FetchPaymentCardsResult;
import com.facebook.payments.p2p.service.model.cards.SetPrimaryCardParams;
import com.facebook.payments.p2p.service.model.eligibility.FetchP2PSendEligibilityParams;
import com.facebook.payments.p2p.service.model.eligibility.FetchP2PSendEligibilityResult;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestParams;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsParams;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsResult;
import com.facebook.payments.p2p.service.model.transactions.FetchMoreTransactionsParams;
import com.facebook.payments.p2p.service.model.transactions.FetchMoreTransactionsResult;
import com.facebook.payments.p2p.service.model.transactions.FetchTransactionListParams;
import com.facebook.payments.p2p.service.model.transactions.FetchTransactionListResult;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: E6M.class */
public final class E6M extends 3XG {
    public 1BY A00;
    public final Exi A01;
    public final F7L A02;
    public final C1kw A03;
    public final C1634Aoc A04;
    public final EfE A05;
    public final EfF A06;
    public final EfG A07;
    public final EvY A08;
    public final EvT A09;
    public final F93 A0A;
    public final F8N A0B;
    public final Ej1 A0C;
    public final C15h A0D;

    public E6M(1BO r302) {
        super("PaymentDbServiceHandler");
        this.A00 = 7zL.A0Q(r302);
        G7K A01 = G7K.A01(this, ActionId.LEGACY_MARKER);
        C1kw A0F = DKD.A0F();
        F7L A0c = DKD.A0c();
        EfE efE = (EfE) 1Bn.A0B(99283);
        Exi exi = (Exi) 1Bn.A0B(99270);
        EfF efF = (EfF) 1Bn.A0B(99284);
        EfG efG = (EfG) 1Bn.A0B(99285);
        Ej1 ej1 = (Ej1) 1Bi.A03(99280);
        EvY evY = (EvY) 1Bi.A03(99267);
        F93 f93 = (F93) 1Bi.A03(99266);
        EvT evT = (EvT) 1Bi.A03(99263);
        C1634Aoc c1634Aoc = (C1634Aoc) 1Bi.A03(85123);
        F8N f8n = (F8N) 1Bi.A03(99265);
        this.A0D = A01;
        this.A03 = A0F;
        this.A02 = A0c;
        this.A05 = efE;
        this.A01 = exi;
        this.A07 = efG;
        this.A06 = efF;
        this.A0C = ej1;
        this.A08 = evY;
        this.A0A = f93;
        this.A09 = evT;
        this.A04 = c1634Aoc;
        this.A0B = f8n;
    }

    public OperationResult A07(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        DeletePaymentCardParams deletePaymentCardParams = (DeletePaymentCardParams) r303.A00.getParcelable("deletePaymentCardParams");
        FbUserSession A05 = 1Fw.A05(this.A00);
        Exi exi = this.A01;
        String str = deletePaymentCardParams.A00;
        F8u f8u = exi.A00;
        C00j.A05("deletePaymentCardId", 1696531542);
        try {
            SQLiteDatabase AUF = f8u.A01.AUF();
            C01m.A01(AUF, -1269385370);
            try {
                String A01 = f8u.A02.A01();
                if (A01 != null && A01.equals(str)) {
                    f8u.A01();
                }
                ImmutableList immutableList = C2095Ddh.A02;
                AUF.delete("payment_card_ids", 0Pz.A0W("credential_id", " = ? "), new String[]{str});
                AUF.setTransactionSuccessful();
                C01m.A03(AUF, 1521740910);
                C00j.A01(-948121520);
                Eu8 eu8 = (Eu8) 1Lo.A06(A05, 99275);
                synchronized (eu8) {
                    Optional optional = eu8.A01;
                    if (optional != null && optional.isPresent() && str == ((PaymentCard) optional.get()).A05) {
                        eu8.A01 = Absent.INSTANCE;
                    }
                    Optional optional2 = eu8.A00;
                    if (optional2.isPresent()) {
                        ImmutableList.Builder A0h = 4YU.A0h();
                        1Du it = ((ImmutableList) optional2.get()).iterator();
                        while (it.hasNext()) {
                            PaymentCard paymentCard = (PaymentCard) it.next();
                            if (paymentCard.A05 != str) {
                                A0h.m11011add((Object) paymentCard);
                            }
                        }
                        eu8.A00 = 1BK.A0a(A0h.build());
                    }
                }
                return BMQ;
            } catch (Throwable th) {
                C01m.A03(AUF, 751065055);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-121271889);
            throw th2;
        }
    }

    public OperationResult A09(1Tu r302, 1TC r303) {
        C1625Ao3 c1625Ao3;
        String str;
        FetchMoreTransactionsParams fetchMoreTransactionsParams = (FetchMoreTransactionsParams) r303.A00.getParcelable("fetchMoreTransactionsParams");
        OperationResult BMQ = r302.BMQ(r303);
        FetchMoreTransactionsResult fetchMoreTransactionsResult = (FetchMoreTransactionsResult) BMQ.A07();
        F8N f8n = this.A0B;
        C00j.A05("insertMoreTransactions", -197518941);
        try {
            int ordinal = fetchMoreTransactionsParams.A01.ordinal();
            if (ordinal == 0) {
                ImmutableList immutableList = C2102Ddo.A03;
                c1625Ao3 = BaB.A06;
                str = "recent_all_transactions";
            } else if (ordinal == 1) {
                ImmutableList immutableList2 = C2103Ddp.A03;
                c1625Ao3 = BaB.A07;
                str = "recent_incoming_transactions";
            } else {
                if (ordinal != 2) {
                    throw AnonymousClass001.A0N("Unknown transaction query type encountered");
                }
                ImmutableList immutableList3 = C2104Ddq.A03;
                c1625Ao3 = BaB.A08;
                str = "recent_outgoing_transactions";
            }
            1Du it = fetchMoreTransactionsResult.A00.iterator();
            while (it.hasNext()) {
                PaymentTransaction paymentTransaction = (PaymentTransaction) it.next();
                F8N.A00(f8n, paymentTransaction, str);
                f8n.A01(paymentTransaction);
            }
            f8n.A00.A04(c1625Ao3, fetchMoreTransactionsResult.A01 ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
            C00j.A01(-138066861);
            return BMQ;
        } catch (Throwable th) {
            C00j.A01(-1818369265);
            throw th;
        }
    }

    public OperationResult A0A(1Tu r302, 1TC r303) {
        TriState triState;
        C1634Aoc c1634Aoc = this.A04;
        C1625Ao3 c1625Ao3 = BaB.A05;
        String A01 = c1634Aoc.A01(c1625Ao3);
        if (A01 == null) {
            triState = TriState.UNSET;
        } else {
            try {
                triState = TriState.fromDbValue(Integer.parseInt(A01));
            } catch (NumberFormatException unused) {
                triState = TriState.UNSET;
            }
        }
        if (triState == TriState.UNSET) {
            OperationResult BMQ = r302.BMQ(r303);
            c1634Aoc.A04(c1625Ao3, Integer.toString(TriState.valueOf(((TreeJNI) BMQ.A07()).getBooleanValue(1464876847)).getDbValue()));
            return BMQ;
        }
        Object obj = 2JZ.A01;
        6As newTreeBuilder = 2tS.A00().newTreeBuilder("PeerToPeerPaymentAccount", 6As.class, 852676480);
        newTreeBuilder.A0B("account_enabled", triState.asBoolean());
        return OperationResult.A04(newTreeBuilder.getResult(2JX.class, 852676480));
    }

    public OperationResult A0B(1Tu r302, 1TC r303) {
        Optional optional;
        RYZ ryz;
        Optional optional2;
        RYa rYa;
        FbUserSession A05 = 1Fw.A05(this.A00);
        if (1BL.A1a(this.A0D)) {
            EfE efE = this.A05;
            Eu8 eu8 = (Eu8) 1Lo.A06(A05, 99275);
            synchronized (eu8) {
                optional = eu8.A01;
            }
            if (optional == null || !optional.isPresent()) {
                ryz = efE.A00.A01() == null ? RYZ.A03 : RYZ.A02;
            } else {
                PaymentCard paymentCard = (PaymentCard) optional.get();
                paymentCard.getClass();
                ryz = new RYZ(paymentCard, 0S2.A00);
            }
            Integer num = ryz.A01;
            Integer num2 = 0S2.A0C;
            if (num != num2) {
                PaymentCard paymentCard2 = ryz.A00;
                Eu8 eu82 = (Eu8) 1Lo.A06(A05, 99275);
                synchronized (eu82) {
                    optional2 = eu82.A00;
                }
                ImmutableList A00 = efE.A00.A00();
                if (!optional2.isPresent() || ((AbstractCollection) optional2.get()).size() != A00.size()) {
                    rYa = RYa.A02;
                } else if (((AbstractCollection) optional2.get()).isEmpty()) {
                    rYa = RYa.A03;
                } else {
                    ImmutableList immutableList = (ImmutableList) optional2.get();
                    RYa rYa2 = RYa.A02;
                    immutableList.getClass();
                    Preconditions.checkArgument(7zM.A1b(immutableList));
                    rYa = new RYa(immutableList, 0S2.A00);
                }
                if (rYa.A01 != num2) {
                    ImmutableList immutableList2 = rYa.A00;
                    F7L.A00(AbF.A05(), this.A02, "com.facebook.messaging.payment.ACTION_PAYMENT_CARD_CACHE_UPDATED");
                    return OperationResult.A04(new FetchPaymentCardsResult(paymentCard2, immutableList2));
                }
            }
        }
        OperationResult BMQ = r302.BMQ(r303);
        FetchPaymentCardsResult fetchPaymentCardsResult = (FetchPaymentCardsResult) BMQ.A07();
        PaymentCard paymentCard3 = fetchPaymentCardsResult.A00;
        Exi exi = this.A01;
        if (paymentCard3 != null) {
            exi.A01(A05, paymentCard3);
        } else {
            exi.A00(A05);
        }
        exi.A02(A05, fetchPaymentCardsResult.A01);
        F7L.A00(AbF.A05(), this.A02, "com.facebook.messaging.payment.ACTION_PAYMENT_CARD_CACHE_UPDATED");
        return BMQ;
    }

    public OperationResult A0E(1Tu r302, 1TC r303) {
        C1625Ao3 c1625Ao3;
        String str;
        IllegalStateException th;
        FetchTransactionListParams fetchTransactionListParams = (FetchTransactionListParams) r303.A00.getParcelable("fetchTransactionListParams");
        OperationResult BMQ = r302.BMQ(r303);
        FetchTransactionListResult fetchTransactionListResult = (FetchTransactionListResult) BMQ.A07();
        F8N f8n = this.A0B;
        C00j.A05("insertTransactionList", 1430682433);
        try {
            int ordinal = fetchTransactionListParams.A01.ordinal();
            if (ordinal == 0) {
                ImmutableList immutableList = C2102Ddo.A03;
                c1625Ao3 = BaB.A06;
                str = "recent_all_transactions";
            } else if (ordinal == 1) {
                ImmutableList immutableList2 = C2103Ddp.A03;
                c1625Ao3 = BaB.A07;
                str = "recent_incoming_transactions";
            } else {
                if (ordinal != 2) {
                    th = AnonymousClass001.A0N("Unknown transaction query type encountered");
                    throw th;
                }
                ImmutableList immutableList3 = C2104Ddq.A03;
                c1625Ao3 = BaB.A08;
                str = "recent_outgoing_transactions";
            }
            SQLiteDatabase AUF = f8n.A01.AUF();
            C01m.A01(AUF, -59325468);
            try {
                AUF.delete(str, null, null);
                1Du it = fetchTransactionListResult.A00.iterator();
                while (it.hasNext()) {
                    PaymentTransaction paymentTransaction = (PaymentTransaction) it.next();
                    F8N.A00(f8n, paymentTransaction, str);
                    f8n.A01(paymentTransaction);
                }
                f8n.A00.A04(c1625Ao3, fetchTransactionListResult.A01 ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                AUF.setTransactionSuccessful();
                C01m.A03(AUF, 225839576);
                C00j.A01(1414300612);
                return BMQ;
            } catch (Throwable th2) {
                th = th2;
                C01m.A03(AUF, 1332523791);
            }
        } catch (Throwable th3) {
            C00j.A01(1204394788);
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A0F(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6M.A0F(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A0K(1Tu r302, 1TC r303) {
        OperationResult BMQ = r302.BMQ(r303);
        SetPrimaryCardParams setPrimaryCardParams = (SetPrimaryCardParams) r303.A00.getParcelable("setPrimaryCardParams");
        FbUserSession A05 = 1Fw.A05(this.A00);
        Exi exi = this.A01;
        String str = setPrimaryCardParams.A00;
        exi.A00.A02(str);
        Eu8 eu8 = (Eu8) 1Lo.A06(A05, 99275);
        Optional A00 = eu8.A00(str);
        if (A00.isPresent()) {
            Object obj = A00.get();
            synchronized (eu8) {
                eu8.A01 = 1BK.A0a(obj);
            }
        }
        return BMQ;
    }

    public OperationResult A0M(1Tu r302, 1TC r303) {
        TreeBuilderJNI treeBuilderJNI;
        if (1BL.A1a(this.A0D)) {
            DpA A00 = this.A08.A00(Long.parseLong(((FetchPaymentRequestParams) r303.A00.getParcelable("FetchPaymentRequestParams")).A00));
            if (A00 != null) {
                Object obj = 2JZ.A01;
                return OperationResult.A04(A00.isValidGraphServicesJNIModel() ? A00.reinterpret(DpA.class, -928754971) : ((A00 instanceof Tree) && ((Tree) A00).isValidGraphServicesJNIModel() && (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder("PeerToPeerPaymentRequest", 6As.class, -928754971, (Tree) A00)) != null) ? treeBuilderJNI.getResult(DpA.class, -928754971) : null);
            }
        }
        OperationResult BMQ = r302.BMQ(r303);
        this.A0A.A01((GNv) BMQ.A07());
        return BMQ;
    }

    public OperationResult A0N(1Tu r302, 1TC r303) {
        int i;
        Cursor query;
        int i2;
        ImmutableList A00;
        int i3;
        int i4;
        FetchPaymentRequestsParams fetchPaymentRequestsParams = (FetchPaymentRequestsParams) r303.A00.getParcelable("FetchPaymentRequestsParams");
        if (1BL.A1a(this.A0D) && fetchPaymentRequestsParams.A00 == EKm.A01) {
            EvY evY = this.A08;
            C00j.A05("getIncomingPaymentRequests", -908535602);
            try {
                C00j.A05("getIncomingRequestIds", -2131322705);
                try {
                    ImmutableList immutableList = null;
                    if (evY.A01.A05(BaB.A01)) {
                        query = evY.A02.AUF().query("incoming_request_ids", null, null, null, null, null, null);
                        try {
                            try {
                                ImmutableList.Builder builder = ImmutableList.builder();
                                while (query.moveToNext()) {
                                    builder.m11011add((Object) Long.valueOf(query.getLong(0)));
                                }
                                immutableList = builder.build();
                                query.close();
                                i2 = -1602521806;
                            } catch (Exception e) {
                                evY.A00.D12("DbFetchPaymentRequestHandler", "Reading the request from the database threw an exception.", e);
                                query.close();
                                i2 = 1511458709;
                            }
                        } finally {
                        }
                    } else {
                        i2 = 1993363544;
                    }
                    C00j.A01(i2);
                    if (immutableList == null) {
                        A00 = null;
                        i3 = 1347465315;
                    } else {
                        C8w c8w = evY.A04;
                        ImmutableList.Builder A0h = 4YU.A0h();
                        A0h.m11011add((Object) AbH.A1E(evY.A08));
                        1Du it = immutableList.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Long) it.next()).longValue();
                            C00j.A05("getRequesterIdForRequest", -495859944);
                            try {
                                SQLiteDatabase AUF = evY.A02.AUF();
                                ImmutableList immutableList2 = C2100Ddm.A0F;
                                query = AUF.query("requests", null, 0Pz.A0g(TraceFieldType.RequestID, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, longValue), null, null, null, null);
                                String str = null;
                                try {
                                    try {
                                        if (query.getCount() > 1) {
                                            DKH.A0x(query, evY.A00, "Requests table should only have one row for a given request ID, but it has ", "DbFetchPaymentRequestsHandler");
                                            query.close();
                                            i4 = 758930879;
                                        } else if (query.getCount() == 0) {
                                            query.close();
                                            i4 = -513498975;
                                        } else {
                                            query.moveToFirst();
                                            str = query.getString(query.getColumnIndex("requester_id"));
                                            query.close();
                                            i4 = -1564881548;
                                        }
                                    } finally {
                                    }
                                } catch (Exception e2) {
                                    evY.A00.D12("DbFetchPaymentRequestHandler", "Reading the request from the database threw an exception.", e2);
                                    query.close();
                                    i4 = 313973861;
                                }
                                C00j.A01(i4);
                                if (str != null) {
                                    A0h.m11011add((Object) str);
                                }
                            } catch (Throwable th) {
                                th = th;
                                i = 1746765213;
                                C00j.A01(i);
                                throw th;
                            }
                        }
                        c8w.A02(A0h.build());
                        ImmutableList.Builder A0h2 = 4YU.A0h();
                        1Du it2 = immutableList.iterator();
                        while (it2.hasNext()) {
                            DpA A002 = evY.A00(((Long) it2.next()).longValue());
                            if (A002 != null) {
                                A0h2.m11011add((Object) A002);
                            }
                        }
                        A00 = evY.A07.A00(A0h2.build());
                        i3 = -1321524741;
                    }
                    C00j.A01(i3);
                    if (A00 != null) {
                        return OperationResult.A04(new FetchPaymentRequestsResult(1BK.A17(A00)));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = -1565363691;
                    C00j.A01(i);
                    throw th;
                }
            } catch (Throwable th3) {
                C00j.A01(1921125202);
                throw th3;
            }
        }
        OperationResult BMQ = r302.BMQ(r303);
        if (fetchPaymentRequestsParams.A00 == EKm.A01) {
            this.A0A.A02(ImmutableList.copyOf((Collection) ((FetchPaymentRequestsResult) BMQ.A07()).A00));
        }
        return BMQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult A0O(X.1Tu r302, X.1TC r303) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6M.A0O(X.1Tu, X.1TC):com.facebook.fbservice.service.OperationResult");
    }

    public OperationResult A0P(1Tu r302, 1TC r303) {
        int i;
        int i2;
        TriState valueOf;
        int i3;
        FetchP2PSendEligibilityParams fetchP2PSendEligibilityParams = (FetchP2PSendEligibilityParams) r303.A00.getParcelable("P2PSendEligibilityParams");
        if (fetchP2PSendEligibilityParams.A00 == 1He.A04) {
            Ej1 ej1 = this.A0C;
            String str = fetchP2PSendEligibilityParams.A01;
            C00j.A05("getRecipientEligibility", -32155067);
            try {
                SQLiteDatabase AUF = ej1.A01.AUF();
                1Dj r0 = C2098Ddk.A00;
                Cursor query = AUF.query("recipient_eligibility", new String[]{"is_eligible"}, 0Pz.A0j("recipient_id", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str), null, null, null, null);
                try {
                    if (query.getCount() > 1) {
                        DKH.A0x(query, ej1.A00, "RecipientEligibilityTable table should only have one row for a given recipient IDbut it has ", "DbRecipientEligibilityHandler");
                        valueOf = TriState.UNSET;
                        query.close();
                        i3 = 148338064;
                    } else if (query.getCount() == 0) {
                        valueOf = TriState.UNSET;
                        query.close();
                        i3 = -1208080363;
                    } else {
                        query.moveToFirst();
                        valueOf = TriState.valueOf(Boolean.valueOf(r0.A00(query)).booleanValue());
                        query.close();
                        i3 = 2091481970;
                    }
                    C00j.A01(i3);
                    if (valueOf.isSet()) {
                        return OperationResult.A04(new FetchP2PSendEligibilityResult(Boolean.valueOf(valueOf.asBoolean())));
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i = -601518655;
                C00j.A01(i);
                throw th;
            }
        }
        OperationResult BMQ = r302.BMQ(r303);
        FetchP2PSendEligibilityResult fetchP2PSendEligibilityResult = (FetchP2PSendEligibilityResult) BMQ.A07();
        Ej1 ej12 = this.A0C;
        String str2 = fetchP2PSendEligibilityParams.A01;
        boolean z = fetchP2PSendEligibilityResult.mCanSend;
        C00j.A05("setRecipientEligibility", -847173827);
        try {
            SQLiteDatabase AUF2 = ej12.A01.AUF();
            C01m.A01(AUF2, -1989316836);
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    ImmutableList immutableList = C2098Ddk.A03;
                    contentValues.put("recipient_id", str2);
                    contentValues.put("is_eligible", String.valueOf(z));
                    if (AUF2.update("recipient_eligibility", contentValues, 0Pz.A0W("recipient_id", " = ? "), new String[]{str2}) == 0) {
                        C01m.A00(1762768505);
                        AUF2.insertOrThrow("recipient_eligibility", null, contentValues);
                        C01m.A00(-1740788497);
                    }
                    AUF2.setTransactionSuccessful();
                    i2 = -634273758;
                } catch (Throwable th3) {
                    C01m.A03(AUF2, 462902365);
                    throw th3;
                }
            } catch (SQLException e) {
                ej12.A00.D12("DbRecipientEligibilityHandler", "A SQLException occurred when trying to insert into the database", e);
                i2 = 1511484813;
            }
            C01m.A03(AUF2, i2);
            C00j.A01(1190955780);
            return BMQ;
        } catch (Throwable th4) {
            th = th4;
            i = 1219000255;
            C00j.A01(i);
            throw th;
        }
    }
}
