package com.facebookpay.offsite.models.message;

import X.11T;
import X.C00t;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PaymentContainerType.class */
public final class PaymentContainerType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ PaymentContainerType[] $VALUES;
    public static final Companion Companion;
    public final String type;
    public static final PaymentContainerType BASIC_CARD_V1 = new PaymentContainerType("BASIC_CARD_V1", 0, "basic-card-v1");
    public static final PaymentContainerType ECOM_TOKEN_V1 = new PaymentContainerType("ECOM_TOKEN_V1", 1, "ecom-token-v1");
    public static final PaymentContainerType PAYPAL_OTC_V1 = new PaymentContainerType("PAYPAL_OTC_V1", 2, "paypal-otc-v1");
    public static final PaymentContainerType FIRMLY_TOKEN_V1 = new PaymentContainerType("FIRMLY_TOKEN_V1", 3, "firmly-token-v1");

    /* loaded from: PaymentContainerType$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final PaymentContainerType fromString(String str) {
            PaymentContainerType paymentContainerType;
            11T.A0F(str, 0);
            PaymentContainerType[] values = PaymentContainerType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    paymentContainerType = null;
                    break;
                }
                paymentContainerType = values[i2];
                if (str.equals(paymentContainerType.getType())) {
                    break;
                }
                i = i2 + 1;
            }
            return paymentContainerType;
        }
    }

    public static final /* synthetic */ PaymentContainerType[] $values() {
        return new PaymentContainerType[]{BASIC_CARD_V1, ECOM_TOKEN_V1, PAYPAL_OTC_V1, FIRMLY_TOKEN_V1};
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebookpay.offsite.models.message.PaymentContainerType$Companion, java.lang.Object] */
    static {
        PaymentContainerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C00t.A00($values);
        Companion = new Object();
    }

    public PaymentContainerType(String str, int i, String str2) {
        this.type = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PaymentContainerType valueOf(String str) {
        return (PaymentContainerType) Enum.valueOf(PaymentContainerType.class, str);
    }

    public static PaymentContainerType[] values() {
        return (PaymentContainerType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}
