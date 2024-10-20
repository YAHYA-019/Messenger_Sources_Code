package X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.payments.auth.dynamicdescriptor.params.DynamicDescriptorParams;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.p2p.service.model.transactions.PostTransactionScreenData;
import com.facebook.payments.p2p.service.model.transactions.SendPaymentMessageParams;
import com.facebook.payments.p2p.service.model.transactions.SendPaymentMessageResult;
import com.facebook.payments.p2p.verification.PaymentRiskVerificationActivity;
import com.facebook.payments.webview.model.PaymentsWebViewOnlinePaymentParams;
import com.facebook.payments.webview.model.PaymentsWebViewParams;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: Fvn.class */
public final class Fvn implements 2eF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fvn(Ezy ezy, Euz euz, int i) {
        this.A00 = i;
        this.A01 = euz;
        this.A02 = ezy;
    }

    public Fvn(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r307v24, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        Object obj2;
        String str;
        String str2;
        DynamicDescriptorParams dynamicDescriptorParams;
        ListenableFuture listenableFuture;
        Object obj3 = obj;
        switch (this.A00) {
            case 0:
                28M r0 = (28M) obj;
                r0.getClass();
                Hdf hdf = (Hdf) this.A01;
                if (!r0.A0E()) {
                    throw AnonymousClass001.A0N("Google Api Client unexpectedly disconnected");
                }
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.A01(100);
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.add(locationRequest);
                K2V k7x = new K7x(r0, new LocationSettingsRequest(null, A0s, true, false));
                r0.A06(k7x);
                ?? A0j = 4YU.A0j();
                k7x.A04(new LcM(hdf, r0, (SettableFuture) A0j));
                return A0j;
            case 1:
                Iterable iterable = (Iterable) obj;
                ImmutableList.Builder A0h = 4YU.A0h();
                if (iterable != null) {
                    java.util.Map map = (java.util.Map) this.A02;
                    LinkedHashMap A1C = 1BK.A1C();
                    Iterator it = C1A3.A1F(iterable).iterator();
                    while (it.hasNext()) {
                        ThreadSummary threadSummary = (ThreadSummary) it.next();
                        A1C.put(Long.valueOf(threadSummary.A0n.A0r()), threadSummary);
                    }
                    Iterator it2 = 0QD.A0b(0RB.A0J(map), new G6c(12)).iterator();
                    while (it2.hasNext()) {
                        Object obj4 = A1C.get(7zN.A0j((Number) ((03Y) it2.next()).first));
                        if (obj4 != null) {
                            A0h.m11011add(obj4);
                        }
                    }
                }
                1FX r02 = (1FX) this.A01;
                r02.set(A0h.build());
                return r02;
            case 2:
                Boolean bool = (Boolean) obj;
                obj2 = bool;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    obj2 = bool;
                    if (booleanValue) {
                        return ((Ezy) this.A02).A09();
                    }
                }
                break;
            case 3:
                Boolean bool2 = (Boolean) obj;
                obj2 = bool2;
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    obj2 = bool2;
                    if (booleanValue2) {
                        return ((Ezy) this.A02).A08();
                    }
                }
                break;
            case 4:
                obj2 = obj3;
                if (obj != null) {
                    obj2 = obj3;
                    if (obj == ELQ.A04) {
                        return ((Ezy) this.A02).A0A("SEND");
                    }
                }
                break;
            default:
                SendPaymentMessageResult sendPaymentMessageResult = (SendPaymentMessageResult) obj;
                String str3 = sendPaymentMessageResult.riskResult;
                if (str3 == null || !(str3.equals("REQUIRE_VERIFICATION") || str3.equals("UNDER_MANUAL_REVIEW"))) {
                    SendPaymentMessageResult.DynamicAuthentication dynamicAuthentication = sendPaymentMessageResult.mDynamicAuthentication;
                    if (dynamicAuthentication != null) {
                        String str4 = dynamicAuthentication.authType;
                        if (!str4.equals("DYNAMIC_AUTH_CVV") && str4.equals("DYNAMIC_AUTH_SOFT_DESCRIPTOR")) {
                            String str5 = dynamicAuthentication.dynamicDescriptorResolutionStatus;
                            Fmh fmh = (Fmh) this.A01;
                            if (str5 == null) {
                                1FV A0j2 = 4YU.A0j();
                                A0j2.set(new RYs((String) null, (String) null, (String) null, false));
                                C00i c00i = fmh.A03;
                                A0j2.setException(new G8K(1BL.A0B(c00i), (String) null, 1BL.A0B(c00i).getString(2131955479)));
                                return A0j2;
                            }
                            C00i c00i2 = fmh.A03;
                            FbFragmentActivity A0O = DKE.A0O(1BK.A04(c00i2));
                            if (A0O == null) {
                                1FV A0j3 = 4YU.A0j();
                                A0j3.set(new RYs((String) null, (String) null, (String) null, false));
                                A0j3.setException(new G8K(1BL.A0B(c00i2), (String) null, 1BL.A0B(c00i2).getString(2131955479)));
                                return A0j3;
                            }
                            ?? A0j4 = 4YU.A0j();
                            A0O.A5D(new C2059Dak((Object) A0j4, fmh, 1));
                            String str6 = sendPaymentMessageResult.mDynamicAuthentication.dynamicDescriptorResolutionStatus;
                            if (str6 == null) {
                                str6 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                            }
                            F6A f6a = (F6A) fmh.A0B.get();
                            SendPaymentMessageResult.DynamicAuthentication dynamicAuthentication2 = sendPaymentMessageResult.mDynamicAuthentication;
                            String A0t = 1BK.A0t();
                            String packageName = 1BK.A04(c00i2).getPackageName();
                            String A0z = AbJ.A0z(fmh.A09);
                            if (dynamicAuthentication2 == null || TextUtils.isEmpty(dynamicAuthentication2.cardLastFour) || TextUtils.isEmpty(dynamicAuthentication2.cardAssociation) || TextUtils.isEmpty(dynamicAuthentication2.cardAssociationImageUrl) || TextUtils.isEmpty(dynamicAuthentication2.authAmount) || TextUtils.isEmpty(dynamicAuthentication2.id) || TextUtils.isEmpty(dynamicAuthentication2.expirationMonth) || TextUtils.isEmpty(dynamicAuthentication2.expirationYear) || TextUtils.isEmpty("p2p_send") || TextUtils.isEmpty("actorId") || TextUtils.isEmpty(A0t) || TextUtils.isEmpty(dynamicAuthentication2.credentialId) || TextUtils.isEmpty("MOR_P2P_TRANSFER") || TextUtils.isEmpty(packageName) || TextUtils.isEmpty(A0z) || TextUtils.isEmpty(dynamicAuthentication2.descriptorPrefix)) {
                                dynamicDescriptorParams = null;
                            } else {
                                String str7 = dynamicAuthentication2.authAmount;
                                String A0j5 = 0Pz.A0j(dynamicAuthentication2.expirationMonth, "/", dynamicAuthentication2.expirationYear);
                                String str8 = dynamicAuthentication2.cardLastFour;
                                dynamicDescriptorParams = EX5.A00("adAccountId", packageName, str7, dynamicAuthentication2.cardAssociation, A0j5, dynamicAuthentication2.cardAssociationImageUrl, A0t, dynamicAuthentication2.credentialId, dynamicAuthentication2.descriptorPrefix, A0z, "p2p_send", str8, "MOR_P2P_TRANSFER", dynamicAuthentication2.id);
                            }
                            f6a.A00 = dynamicDescriptorParams;
                            Intent A00 = F54.A00(A0O, (F54) fmh.A04.get(), GraphQLStringDefUtil.A00().ATw("GraphQLPRiskRestrictionDynamicDescriptorResolutionStatus", str6), "p2p_send");
                            listenableFuture = A0j4;
                            if (A00 != null) {
                                0LS.A07(A0O, A00, 2022);
                                return A0j4;
                            }
                        }
                    }
                    SendPaymentMessageResult.OpenWebviewData openWebviewData = sendPaymentMessageResult.mOpenWebviewData;
                    Fmh fmh2 = (Fmh) this.A01;
                    if (openWebviewData == null) {
                        fmh2.A03.get();
                        PostTransactionScreenData postTransactionScreenData = sendPaymentMessageResult.mPostTransactionScreenData;
                        String str9 = null;
                        if (postTransactionScreenData != null) {
                            str9 = postTransactionScreenData.title;
                            str2 = postTransactionScreenData.body;
                            str = postTransactionScreenData.confirmButtonText;
                        } else {
                            str = null;
                            str2 = null;
                        }
                        return C3o5.A0J(new RYs(str9, str2, str, true));
                    }
                    C00i c00i3 = fmh2.A03;
                    String string = 1BL.A0B(c00i3).getString(2131967815);
                    boolean z = true;
                    Preconditions.checkArgument(AnonymousClass001.A1T(openWebviewData.webviewUrl));
                    Preconditions.checkArgument(AnonymousClass001.A1T(openWebviewData.successUrl));
                    Preconditions.checkArgument(AnonymousClass001.A1T(openWebviewData.failUrl));
                    Preconditions.checkArgument(AnonymousClass001.A1T(openWebviewData.httpMethod));
                    if (openWebviewData.params == null) {
                        z = false;
                    }
                    Preconditions.checkArgument(z);
                    RO8 ro8 = new RO8();
                    String str10 = openWebviewData.webviewUrl;
                    ro8.A03 = str10;
                    C1pq.A08("redirectUrl", str10);
                    String str11 = openWebviewData.successUrl;
                    ro8.A05 = str11;
                    C1pq.A08("successDismissUrl", str11);
                    String str12 = openWebviewData.failUrl;
                    ro8.A01 = str12;
                    C1pq.A08("failureDismissUrl", str12);
                    String str13 = openWebviewData.httpMethod;
                    ro8.A02 = str13;
                    C1pq.A08("httpMethod", str13);
                    ro8.A00 = openWebviewData.params;
                    PaymentsWebViewOnlinePaymentParams paymentsWebViewOnlinePaymentParams = new PaymentsWebViewOnlinePaymentParams(ro8);
                    Rb2 rb2 = new Rb2();
                    rb2.A03(paymentsWebViewOnlinePaymentParams);
                    rb2.A01(R2s.A00(DKD.A0a(fmh2.A06), ImmutableMap.of((Object) "is_3ds", (Object) Boolean.TRUE.toString())));
                    rb2.A02(PaymentItemType.A0C);
                    rb2.A05 = string;
                    C1pq.A08("titleBarTitle", string);
                    return Fmh.A00(DKH.A08(1BK.A04(c00i3), new PaymentsWebViewParams(rb2)), fmh2, 2021);
                }
                if (!Optional.fromNullable(sendPaymentMessageResult.verificationUrl).isPresent()) {
                    C00i c00i4 = ((Fmh) this.A01).A03;
                    throw new G8K(1BL.A0B(c00i4), (String) null, 1BL.A0B(c00i4).getString(2131964633));
                }
                Fmh fmh3 = (Fmh) this.A01;
                listenableFuture = Fmh.A00(PaymentRiskVerificationActivity.A12(1BK.A04(fmh3.A03), sendPaymentMessageResult.id, ((SendPaymentMessageParams) this.A02).A0H), fmh3, 2020);
                return listenableFuture;
        }
        return 1Kd.A0A(obj2);
    }
}
