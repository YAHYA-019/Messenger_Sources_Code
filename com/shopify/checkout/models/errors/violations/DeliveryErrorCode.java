package com.shopify.checkout.models.errors.violations;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3H;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: DeliveryErrorCode.class */
public final class DeliveryErrorCode {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ DeliveryErrorCode[] A02;
    public static final Companion Companion;
    public final String value = "unshippable_product";

    /* loaded from: DeliveryErrorCode$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(DeliveryErrorCode.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.shopify.checkout.models.errors.violations.DeliveryErrorCode$Companion, java.lang.Object] */
    static {
        DeliveryErrorCode[] deliveryErrorCodeArr = {new DeliveryErrorCode()};
        A02 = deliveryErrorCodeArr;
        A01 = C00t.A00(deliveryErrorCodeArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3H.A00);
    }

    public static DeliveryErrorCode valueOf(String str) {
        return (DeliveryErrorCode) Enum.valueOf(DeliveryErrorCode.class, str);
    }

    public static DeliveryErrorCode[] values() {
        return (DeliveryErrorCode[]) A02.clone();
    }
}
