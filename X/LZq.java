package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: LZq.class */
public final class LZq implements GIt {
    public static final L6D A05 = new Object();
    public final Context A01;
    public final RQS A02 = new RQS();
    public final RQT A03 = new RQT();
    public String A00 = "LIVE";
    public final Rb7 A04 = new Rb7();

    public LZq(Context context) {
        this.A01 = context;
    }

    public static final MediatorLiveData A00(L4l l4l, LoggingContext loggingContext, LZq lZq, String str) {
        lZq.A07(KXo.A00(l4l));
        LZv A0b = 7zU.A0b();
        List A03 = 11T.A03(KOy.A0B);
        String str2 = l4l.A09;
        boolean A0O = 11T.A0O(str2, "PRE_WARM");
        OtcInput otcInput = l4l.A04;
        A0b.A0P(loggingContext, str2, A03, JR1.A15(otcInput != null ? KwO.A00(otcInput) : null), A0O);
        l4l.A01 = 7zN.A0e("PAYMENT_METHOD");
        K0E k0e = new K0E(l4l, lZq, C06014fk.A0F(), str);
        FH8.A02(k0e);
        DSD dsd = ((FH8) k0e).A03;
        MediatorLiveData A0a = JR0.A0a(KXo.A00(l4l), lZq);
        String str3 = lZq.A00;
        String str4 = l4l.A0B;
        if (!11T.A0O(str3, str4) || (JR0.A1O() && A0a.getValue() == null)) {
            lZq.A00 = str4;
            lZq.A04.A04(KXo.A00(l4l));
        }
        11T.A0D(dsd);
        KXx.A00(dsd, A0a, new FZA(A0a, l4l, loggingContext, 7));
        return A0a;
    }

    public static final K0H A01(GNA gna) {
        GNy Alr;
        GN5 Af0;
        GNi A9U;
        GNB AkD;
        MQL AAc;
        K0H k0h = null;
        if (gna != null && (Alr = gna.Alr()) != null && (Af0 = Alr.Af0()) != null && (A9U = Af0.A9U()) != null && (AkD = A9U.AkD()) != null && (AAc = AkD.AAc()) != null) {
            k0h = L69.A01(AAc);
        }
        return k0h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (X.11T.A0O(r301 != null ? r301.getTypeName() : null, "CreditCard") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.FJC A02(X.MQV r301, boolean r302) {
        /*
            r0 = 0
            r303 = r0
            r0 = r301
            if (r0 == 0) goto L7f
            r0 = r301
            java.lang.String r0 = r0.getTypeName()
            r304 = r0
        Ld:
            java.lang.String r0 = "ECPPrewarmCard"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L56
            r0 = r301
            if (r0 == 0) goto L77
            r0 = r301
            java.lang.String r0 = r0.getTypeName()
            r304 = r0
        L29:
            java.lang.String r0 = "ExternalCreditCard"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L56
            r0 = r301
            if (r0 == 0) goto L6f
            r0 = r301
            java.lang.String r0 = r0.getTypeName()
            r304 = r0
        L45:
            java.lang.String r0 = "CreditCard"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L6d
        L56:
            r0 = 1
            r307 = r0
            com.facebookpay.paymentmethod.model.CreditCard r0 = new com.facebookpay.paymentmethod.model.CreditCard
            r305 = r0
            r0 = r305
            r1 = r301
            r2 = r307
            r3 = r302
            r0.<init>(r1, r2, r3)
            r0 = r305
            X.FJC r0 = X.FJC.A04(r0)
            r303 = r0
        L6d:
            r0 = r303
            return r0
        L6f:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            goto L45
        L77:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            goto L29
        L7f:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZq.A02(X.MQV, boolean):X.FJC");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List A03(java.util.List r301) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZq.A03(java.util.List):java.util.List");
    }

    public MediatorLiveData A04(Ksw ksw) {
        boolean A1O = JR0.A1O();
        FJC fjc = null;
        Rb7 rb7 = this.A04;
        if (!A1O) {
            fjc = FJC.A03((Object) null);
        }
        return rb7.A01(fjc, ksw);
    }

    public MediatorLiveData A05(L4l l4l, LoggingContext loggingContext) {
        String str;
        String str2 = this.A00;
        String str3 = l4l.A0B;
        boolean A1X = 7zL.A1X(str2, str3);
        Ksw A00 = KXo.A00(l4l);
        Rb7 rb7 = this.A04;
        MediatorLiveData A03 = rb7.A03(A00);
        if (A1X || A03 == null) {
            if (!JR0.A1O()) {
                this.A00 = str3;
                rb7.A04(A00);
            }
            if (A03 != null) {
                str = A1X ? "PERSISTENT_UP_TO_DATE" : "NETWORK_ONLY";
            }
            A00(l4l, loggingContext, this, str);
        }
        return A04(A00);
    }

    public void A06(Ksw ksw) {
        FJC A01;
        OtcInput otcInput = ksw.A00;
        Rb7 rb7 = this.A04;
        if (otcInput != null) {
            rb7.A00.remove(ksw);
            return;
        }
        if (rb7.A00.containsKey(ksw)) {
            MediatorLiveData A02 = rb7.A02(ksw);
            if (JR0.A1R(A02)) {
                A01 = FJC.A03((Object) null);
            } else {
                if (!JR0.A1S(A02)) {
                    return;
                }
                A01 = FJC.A01(LM4.A00, JQz.A0X(A02));
            }
            A02.setValue(A01);
        }
    }

    public void A07(Ksw ksw) {
        synchronized (this) {
            MediatorLiveData A0a = JR0.A0a(ksw, this);
            FJC A0X = JQz.A0X(A0a);
            A0a.setValue(A0X != null ? FJC.A01(LM3.A00, A0X) : null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r311 == null) goto L6;
     */
    @Override // X.GIt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.lifecycle.LiveData AMg(android.util.SparseArray r302, com.facebookpay.logging.LoggingContext r303, com.facebookpay.otc.models.OtcInput r304, com.facebookpay.otc.models.OtcInput r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, int r309) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZq.AMg(android.util.SparseArray, com.facebookpay.logging.LoggingContext, com.facebookpay.otc.models.OtcInput, com.facebookpay.otc.models.OtcInput, java.lang.String, java.lang.String, java.lang.String, int):androidx.lifecycle.LiveData");
    }

    @Override // X.GIt
    public LiveData Ckx(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        String str4;
        String A00;
        GraphQlCallInput graphQlCallInput;
        String A002;
        String str5;
        Ey0 A003;
        boolean z;
        String str6;
        Object obj;
        FGo fGo = null;
        FEq fEq = null;
        int A052 = 7zP.A05(str, str2, 1);
        11T.A0F(str3, 3);
        11T.A0F(loggingContext, 5);
        String A004 = KXj.A00(sparseArray, 12);
        String str7 = (A004.length() == 0 || otcInput != null) ? "CREATE" : "UPDATE";
        AtomicLong atomicLong = Kan.A00;
        String valueOf = String.valueOf(atomicLong.getAndIncrement());
        GraphQlCallInput graphQlCallInput2 = null;
        if (i == 3) {
            Context context = this.A01;
            String A005 = KXj.A00(sparseArray, 12);
            String str8 = (A005.length() == 0 || otcInput != null) ? "CREATE" : "UPDATE";
            String A01 = L6D.A01(sparseArray);
            Object obj2 = sparseArray.get(39);
            Parcelable parcelable = null;
            Object obj3 = null;
            if (obj2 instanceof KOm) {
                obj3 = obj2;
            }
            Object obj4 = sparseArray.get(15);
            String str9 = obj4 instanceof String ? (String) obj4 : null;
            if (str9 == null) {
                str9 = "";
            }
            if (str9.equals(obj3 == KOm.A05 ? "••••" : "•••")) {
                str9 = "";
            }
            int length = A01.length();
            String A1C = length >= 6 ? 7zM.A1C(0, 6, A01) : "";
            String A19 = length >= 4 ? DKC.A19(A01, length - 4) : "";
            Object obj5 = sparseArray.get(14);
            if (!(obj5 instanceof String) || (str4 = (String) obj5) == null) {
                throw 1BK.A0h();
            }
            03Y A012 = RW5.A01(str4);
            Object obj6 = sparseArray.get(33);
            if (obj6 instanceof BaseCheckoutItem) {
                parcelable = (BaseCheckoutItem) obj6;
            }
            boolean z2 = parcelable instanceof SelectionShippingAddressItem;
            if (z2) {
                A00 = ((SelectionShippingAddressItem) parcelable).A03;
                if (A00 == null) {
                    A00 = "";
                }
            } else {
                A00 = KXj.A00(sparseArray, A052);
            }
            if (z2) {
                graphQlCallInput = new 2Jd(ActionId.HEADER_DATA_LOADED);
                SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) parcelable;
                graphQlCallInput.A09("street1", selectionShippingAddressItem.A0E);
                graphQlCallInput.A09("street2", selectionShippingAddressItem.A0F);
                graphQlCallInput.A09(ServerW3CShippingAddressConstants.CITY, selectionShippingAddressItem.A07);
                graphQlCallInput.A09("state", selectionShippingAddressItem.A0D);
                graphQlCallInput.A09(ServerW3CShippingAddressConstants.POSTAL_CODE, selectionShippingAddressItem.A0C);
                A002 = selectionShippingAddressItem.A08;
            } else {
                graphQlCallInput = new 2Jd(ActionId.HEADER_DATA_LOADED);
                graphQlCallInput.A09("street1", KXj.A00(sparseArray, 5));
                graphQlCallInput.A09("street2", KXj.A00(sparseArray, 6));
                graphQlCallInput.A09(ServerW3CShippingAddressConstants.CITY, KXj.A00(sparseArray, 7));
                graphQlCallInput.A09("state", KXj.A00(sparseArray, 8));
                graphQlCallInput.A09(ServerW3CShippingAddressConstants.POSTAL_CODE, KXj.A00(sparseArray, 9));
                A002 = L6D.A00(sparseArray);
            }
            graphQlCallInput.A09("country_code", A002);
            GraphQlCallInput graphQlCallInput3 = new 2Jd(ActionId.CARD_DATA_LOADED);
            C03z c03z = GraphQlCallInput.A02;
            str5 = "$e2ee";
            String A006 = DKB.A00(ActionId.MESSENGER_DELTA_REQUEST);
            7zN.A17(4YU.A0J(c03z, str5, A006), graphQlCallInput3, DKB.A00(45));
            7zN.A17(4YU.A0J(c03z, str9 == "" ? str9 : "$e2ee", A006), graphQlCallInput3, "csc");
            7zN.A17(4YU.A0J(c03z, A1C, A006), graphQlCallInput3, "credit_card_first_6");
            7zN.A17(4YU.A0J(c03z, A19, A006), graphQlCallInput3, DKB.A00(363));
            graphQlCallInput3.A09("expiry_month", (String) A012.first);
            graphQlCallInput3.A09("expiry_year", (String) A012.second);
            graphQlCallInput3.A09("cardholder_name", A00);
            graphQlCallInput3.A05(graphQlCallInput, "billing_address");
            graphQlCallInput3.A09("risk_features", "");
            String str10 = (String) A012.first;
            String str11 = (String) A012.second;
            if (str8.equals("CREATE")) {
                A003 = FAr.A01(context, otcInput, A00, A01, str9, str10, str11, str3, 04R.A0G());
            } else {
                if (!str8.equals("UPDATE")) {
                    throw 0Pz.A05("MutationType is not yet supported + ", str8);
                }
                A003 = FAr.A00(context, otcInput, A005, A00, A01, str9, str10, str11, str3, 04R.A0G());
            }
            fGo = A003.A00;
            fEq = A003.A01;
            z = true;
            str6 = null;
            graphQlCallInput2 = graphQlCallInput3;
        } else {
            if (i != 7) {
                throw AnonymousClass001.A0p();
            }
            str6 = KXj.A00(sparseArray, 32);
            z = false;
        }
        Kzj kzj = null;
        String str12 = str7.equals("CREATE") ? "pux_checkout" : null;
        LEL lel = RCq.A00;
        0DA r0 = new 0DA();
        r0.A07("mutation_data", "credentials");
        r0.A01(KPG.valueOf(AbK.A19(str7)), "mutation_type");
        List A03 = 11T.A03(r0);
        if (otcInput != null) {
            kzj = KwO.A00(otcInput);
        }
        lel.A0F(loggingContext, kzj, str7, str12, A03, true);
        C03z c03z2 = GraphQlCallInput.A02;
        07S A0J = 4YU.A0J(c03z2, A004, "credential_id");
        07S.A00(A0J, str7, "mutation_type");
        if (graphQlCallInput2 != null) {
            A0J.A0H(graphQlCallInput2.A03(), "save_credential_input");
        }
        if (i == 7) {
            if (str7.equals("CREATE") && str6 != null) {
                A0J.A0H(4YU.A0J(c03z2, str6, "ba_token"), "complete_paypal_ba_linking_input");
            }
            obj = "PAYPAL_BA";
        } else {
            obj = "CREDIT_CARD";
        }
        07S.A00(A0J, obj, "credential_type");
        DgU A0M = JR2.A0M(str, str2, str3);
        7zN.A17(A0J, A0M, "credential_input");
        KwO.A01(A0M, otcInput, atomicLong);
        C06014fk.A0A();
        K0G A02 = z ? FAr.A02(this.A01, new Ey0(fGo, fEq), new GAe(this, A0M, str2, 11), M6Z.A00, new GAb(this, 43)) : new K0G(C06014fk.A0F(), new LLj(this, 3), new FYl(A0M, this, str2, A052), 1);
        FH8.A02(A02);
        DSD dsd = ((FH8) A02).A03;
        11T.A0A(dsd);
        LiveData map = Transformations.map(dsd, new GAm(otcInput, loggingContext, str12, str7, 14));
        Ksw ksw = new Ksw(otcInput, str2);
        MediatorLiveData A0a = JR0.A0a(ksw, this);
        A0a.addSource(map, new LR6(sparseArray, map, A0a, ksw, otcInput, this, str7, valueOf, i));
        return Transformations.map(map, M6b.A00);
    }
}
