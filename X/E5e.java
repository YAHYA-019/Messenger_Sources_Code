package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.util.JSONUtil;
import com.facebook.endtoend.EndToEnd;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.AltpayPaymentOption;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.PaymentMethodsInfo;
import com.facebook.payments.paymentmethods.picker.protocol.GetPaymentMethodsInfoParams;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

/* loaded from: E5e.class */
public final class E5e extends 45O {
    public static final String __redex_internal_original_name = "GetPaymentMethodsInfoMethod";
    public final EfS A00;
    public final EfT A01;

    public E5e() {
        super((CbI) 1Bn.A0B(82307), PaymentMethodsInfo.class);
        EfT efT = (EfT) 1Bn.A0B(98947);
        EfS efS = (EfS) 1Bn.A0B(98946);
        this.A01 = efT;
        this.A00 = efS;
    }

    public String A02() {
        return 1BJ.A00(440);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C04083zw A0T;
        GetPaymentMethodsInfoParams getPaymentMethodsInfoParams = (GetPaymentMethodsInfoParams) obj;
        PaymentItemType paymentItemType = getPaymentMethodsInfoParams.A01;
        boolean A01 = RVV.A01(paymentItemType);
        String A00 = 1BJ.A00(440);
        if (A01) {
            Preconditions.checkArgument(RVV.A01(paymentItemType));
            String str = getPaymentMethodsInfoParams.A02;
            RVV.A00(paymentItemType, str);
            StringBuilder A0o = AnonymousClass001.A0o("payment_options");
            ArrayList A0s = AnonymousClass001.A0s();
            Country country = getPaymentMethodsInfoParams.A00;
            if (country != null) {
                A0o.append(".country_code(%s)");
                A0s.add(LocaleMember.A01(country));
            }
            boolean isRunningEndToEndTest = EndToEnd.isRunningEndToEndTest();
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(A0o.toString(), A0s.toArray());
            ImmutableMap of = isRunningEndToEndTest ? ImmutableMap.of((Object) "fields", (Object) formatStrLocaleSafe, (Object) "payment_dev_cycle", (Object) "test") : ImmutableMap.of((Object) "fields", (Object) formatStrLocaleSafe);
            A0T = DKC.A0T();
            A0T.A0D = A00;
            A0T.A0E = "GET";
            A0T.A06 = 0S2.A01;
            A0T.A0F = StringFormatUtil.formatStrLocaleSafe("/act_%s", str);
            A0T.A06(of);
        } else {
            ArrayList A0s2 = AnonymousClass001.A0s();
            A0s2.add(new BasicNameValuePair("format", "json"));
            StringBuilder A0o2 = AnonymousClass001.A0o("payment_modules_options");
            ArrayList A0s3 = AnonymousClass001.A0s();
            A0o2.append(".payment_type(%s)");
            A0s3.add(paymentItemType.mValue);
            Country country2 = getPaymentMethodsInfoParams.A00;
            if (country2 != null) {
                A0o2.append(".country_code(%s)");
                A0s3.add(LocaleMember.A01(country2));
            }
            String str2 = getPaymentMethodsInfoParams.A04;
            if (str2 != null) {
                A0o2.append(".session_id(%s)");
                A0s3.add(str2);
            }
            JSONObject jSONObject = getPaymentMethodsInfoParams.A05;
            if (jSONObject != null) {
                A0o2.append(".extra_data(%s)");
                1BK.A1N(jSONObject, A0s3);
            }
            String str3 = getPaymentMethodsInfoParams.A03;
            if (str3 != null) {
                A0o2.append(".receiver_id(%s)");
                A0s3.add(str3);
            }
            A0s2.add(new BasicNameValuePair("fields", StringFormatUtil.formatStrLocaleSafe(A0o2.toString(), A0s3.toArray())));
            if (EndToEnd.isRunningEndToEndTest()) {
                A0s2.add(new BasicNameValuePair("payment_dev_cycle", "test"));
            }
            A0T = DKC.A0T();
            A0T.A0D = A00;
            A0T.A0E = "GET";
            A0T.A06 = 0S2.A01;
            A0T.A0F = "me";
            A0T.A0J = A0s2;
        }
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        String A0P;
        String A0P2;
        Country A00;
        ImmutableList build;
        ImmutableList build2;
        ImmutableList build3;
        GetPaymentMethodsInfoParams getPaymentMethodsInfoParams = (GetPaymentMethodsInfoParams) obj;
        24X A01 = anonymousClass439.A01();
        PaymentItemType paymentItemType = getPaymentMethodsInfoParams.A01;
        2DO A09 = JSONUtil.A09(A01, 2DM.class, RVV.A01(paymentItemType) ? "payment_options" : "payment_modules_options");
        if (RVV.A01(paymentItemType)) {
            EfS efS = this.A00;
            String A0H = JSONUtil.A0H(A09.A0D("country"), null);
            A0P = C3o5.A0P(A09, "currency", null);
            A0P2 = C3o5.A0P(A09, "account_id", null);
            A00 = A0H == null ? null : Country.A00(null, A0H);
            Iterable A0E = JSONUtil.A0E(A09, "available_payment_options");
            ImmutableList.Builder A0h = 4YU.A0h();
            Iterator it = A0E.iterator();
            while (it.hasNext()) {
                ERH A002 = ERH.A00(JSONUtil.A0H(DKC.A0j(it), null));
                Iterator it2 = efS.A00.A00.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        GIF gif = (GIF) it2.next();
                        if (gif.Az2() == A002) {
                            A0h.m11011add((Object) gif.Az1(A09));
                            break;
                        }
                    }
                }
            }
            Iterator it3 = JSONUtil.A0E(A09, "available_altpay_options").iterator();
            while (it3.hasNext()) {
                24X A0j = DKC.A0j(it3);
                String str = ERH.A01.mValue;
                24X A0D = A0j.A0D("payment_method_type");
                Preconditions.checkNotNull(A0D, "No key %s in %s", "payment_method_type", A0j);
                if (str.equals(A0D.A0H())) {
                    24X A0D2 = A0j.A0D("credential_id");
                    Preconditions.checkNotNull(A0D2, "No key %s in %s", "credential_id", A0j);
                    if (!"boletobancario_santander_BR".equals(A0D2.A0H())) {
                        24X A0D3 = A0j.A0D("credential_id");
                        Preconditions.checkNotNull(A0D3, "No key %s in %s", "credential_id", A0j);
                        if (!"doku_permata_lite_atm_ID".equals(A0D3.A0H())) {
                        }
                    }
                    String A0P3 = C3o5.A0P(A0j, "credential_id", null);
                    02W.A02(A0P3);
                    String A0P4 = C3o5.A0P(A0j, "logo_uri", null);
                    02W.A02(A0P4);
                    Uri A03 = C0A2.A03(A0P4);
                    String A0P5 = C3o5.A0P(A0j, "title", null);
                    02W.A02(A0P5);
                    A0h.m11011add((Object) new AltpayPaymentOption(A03, A0P3, A0P5));
                }
            }
            build = A0h.build();
            Iterable A0E2 = JSONUtil.A0E(A09, "existing_payment_methods");
            ImmutableList.Builder A0h2 = 4YU.A0h();
            Iterator it4 = A0E2.iterator();
            while (it4.hasNext()) {
                24X A0j2 = DKC.A0j(it4);
                24X A0D4 = A0j2.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                Preconditions.checkNotNull(A0D4, "No key %s in %s", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0j2);
                ERI A003 = EVD.A00(A0D4.A0H(), ERI.values());
                ERI eri = ERI.A0A;
                if (A003 == null) {
                    A003 = eri;
                }
                Iterator it5 = efS.A00.A02.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        GIH gih = (GIH) it5.next();
                        if (gih.B22() == A003) {
                            A0h2.m11011add((Object) gih.B20(A0j2));
                            break;
                        }
                    }
                }
            }
            build2 = A0h2.build();
            build3 = ImmutableList.of();
        } else {
            EfT efT = this.A01;
            String A0H2 = JSONUtil.A0H(A09.A0D("country"), null);
            A0P = C3o5.A0P(A09, "currency", null);
            A0P2 = C3o5.A0P(A09, "account_id", null);
            A00 = A0H2 == null ? null : Country.A00(null, A0H2);
            Iterable A0E3 = JSONUtil.A0E(A09, "available_payment_options");
            ImmutableList.Builder A0h3 = 4YU.A0h();
            Iterator it6 = A0E3.iterator();
            while (it6.hasNext()) {
                24X A0j3 = DKC.A0j(it6);
                DKF.A1T(A0j3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                ERH A004 = ERH.A00(C3o5.A0P(A0j3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, null));
                if (A004 != ERH.A0C) {
                    Iterator it7 = efT.A00.A01.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            GIG gig = (GIG) it7.next();
                            if (gig.Az2() == A004) {
                                A0h3.m11011add((Object) gig.Az1(A0j3));
                                break;
                            }
                        }
                    }
                }
            }
            build = A0h3.build();
            Iterable A0E4 = JSONUtil.A0E(A09, "available_payment_options");
            ImmutableList.Builder A0h4 = 4YU.A0h();
            Iterator it8 = A0E4.iterator();
            while (it8.hasNext()) {
                24X A0j4 = DKC.A0j(it8);
                DKF.A1T(A0j4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                ERI A005 = EVD.A00(C3o5.A0P(A0j4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, null), ERI.values());
                ERI eri2 = ERI.A0A;
                if (A005 != null && A005 != eri2) {
                    Iterator it9 = efT.A00.A02.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            GIH gih2 = (GIH) it9.next();
                            if (gih2.B22() == A005) {
                                A0h4.m11011add((Object) gih2.B20(A0j4));
                                break;
                            }
                        }
                    }
                }
            }
            ImmutableList build4 = A0h4.build();
            ImmutableList.Builder A0h5 = 4YU.A0h();
            1Du it10 = build4.iterator();
            while (it10.hasNext()) {
                PaymentMethod paymentMethod = (PaymentMethod) it10.next();
                if (paymentMethod.BHR() != ERI.A0B) {
                    A0h5.m11011add((Object) paymentMethod);
                }
            }
            build2 = A0h5.build();
            ImmutableList.Builder A0h6 = 4YU.A0h();
            1Du it11 = build4.iterator();
            while (it11.hasNext()) {
                PaymentMethod paymentMethod2 = (PaymentMethod) it11.next();
                if (paymentMethod2.BHR() == ERI.A0B) {
                    A0h6.m11011add((Object) paymentMethod2);
                }
            }
            build3 = A0h6.build();
        }
        PaymentMethodsInfo paymentMethodsInfo = new PaymentMethodsInfo(A00, build2, build, build3, A0P, A0P2);
        if (RVV.A01(paymentItemType)) {
            paymentMethodsInfo = new PaymentMethodsInfo((Country) MoreObjects.firstNonNull(paymentMethodsInfo.A00, getPaymentMethodsInfoParams.A00), paymentMethodsInfo.A03, paymentMethodsInfo.A02, paymentMethodsInfo.A01, paymentMethodsInfo.A04, getPaymentMethodsInfoParams.A02);
        }
        return paymentMethodsInfo;
    }
}
