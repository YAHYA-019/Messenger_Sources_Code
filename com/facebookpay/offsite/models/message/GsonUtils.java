package com.facebookpay.offsite.models.message;

import X.11T;
import X.AnonymousClass001;
import X.Ks3;
import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: GsonUtils.class */
public final class GsonUtils {
    public static final GsonUtils INSTANCE = new Object();
    public static final Gson defaultGson = new Gson();

    public static /* synthetic */ Gson deserializerGson$default(GsonUtils gsonUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return gsonUtils.deserializerGson(str);
    }

    public final Gson deserializerGson(String str) {
        Ks3 ks3 = new Ks3();
        ks3.A06 = true;
        ks3.A01(new OffsiteTypeAdapterFactory(str));
        return ks3.A00();
    }

    public final String getMessageType(String str) {
        11T.A0F(str, 0);
        return ((BaseMessage) defaultGson.A04(str, BaseMessage.class)).messageType;
    }

    public final String getToJson(Object obj) {
        11T.A0F(obj, 0);
        if (!(obj instanceof AvailabilityResponse) && !(obj instanceof PaymentDetailsChangedEvent) && !(obj instanceof PaymentResponse)) {
            throw AnonymousClass001.A0N("Invalid message to convert to Json");
        }
        String A06 = defaultGson.A06(obj);
        11T.A0A(A06);
        return A06;
    }

    public final CheckoutAvailability getToOffsiteAvailabilityResponse(String str) {
        11T.A0F(str, 0);
        11T.A0A(deserializerGson(null).A04(str, CheckoutAvailability.class));
        return null;
    }

    public final PaymentHandledRequest getToOffsitePaymentHandledMsg(String str) {
        11T.A0F(str, 0);
        Object A04 = deserializerGson(null).A04(str, PaymentHandledRequest.class);
        11T.A0A(A04);
        return (PaymentHandledRequest) A04;
    }

    public final PaymentRequest getToOffsitePaymentRequest(String str) {
        11T.A0F(str, 0);
        Object A04 = deserializerGson(null).A04(str, PaymentRequest.class);
        11T.A0A(A04);
        return (PaymentRequest) A04;
    }

    public final StartCheckoutRequest getToOffsiteStartCheckoutRequest(String str) {
        11T.A0F(str, 0);
        Object A04 = deserializerGson(null).A04(str, StartCheckoutRequest.class);
        11T.A0A(A04);
        return (StartCheckoutRequest) A04;
    }

    public final Map getToRedactedMap(String str) {
        11T.A0F(str, 0);
        Object A05 = defaultGson.A05(str, new TypeToken() { // from class: com.facebookpay.offsite.models.message.GsonUtils$toRedactedMap$1
        }.type);
        11T.A0A(A05);
        return (Map) A05;
    }

    public final ScriptOverrideRequest getToScriptOverrideRequest(String str) {
        11T.A0F(str, 0);
        Object A04 = deserializerGson(null).A04(str, ScriptOverrideRequest.class);
        11T.A0A(A04);
        return (ScriptOverrideRequest) A04;
    }

    public final PaymentDetailsUpdatedResponse toOffsitePaymentUpdatedMsg(String str, String str2) {
        11T.A0F(str, 0);
        Object A04 = deserializerGson(str2).A04(str, PaymentDetailsUpdatedResponse.class);
        11T.A0A(A04);
        return (PaymentDetailsUpdatedResponse) A04;
    }
}
