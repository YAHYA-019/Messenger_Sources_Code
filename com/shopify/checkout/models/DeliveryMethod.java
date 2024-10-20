package com.shopify.checkout.models;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M36;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: DeliveryMethod.class */
public final class DeliveryMethod {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ DeliveryMethod[] A02;
    public static final DeliveryMethod A03;
    public static final DeliveryMethod A04;
    public static final DeliveryMethod A05;
    public static final DeliveryMethod A06;
    public static final DeliveryMethod A07;
    public static final Companion Companion;
    public final String value;

    /* loaded from: DeliveryMethod$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(DeliveryMethod.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.shopify.checkout.models.DeliveryMethod$Companion, java.lang.Object] */
    static {
        DeliveryMethod deliveryMethod = new DeliveryMethod("Shipping", 0, "SHIPPING");
        A07 = deliveryMethod;
        DeliveryMethod deliveryMethod2 = new DeliveryMethod("Pickup", 1, "PICK_UP");
        A04 = deliveryMethod2;
        DeliveryMethod deliveryMethod3 = new DeliveryMethod("Local", 2, "LOCAL");
        A03 = deliveryMethod3;
        DeliveryMethod deliveryMethod4 = new DeliveryMethod("PickupPoint", 3, "PICKUP_POINT");
        A05 = deliveryMethod4;
        DeliveryMethod deliveryMethod5 = new DeliveryMethod("Retail", 4, "RETAIL");
        A06 = deliveryMethod5;
        DeliveryMethod[] deliveryMethodArr = {deliveryMethod, deliveryMethod2, deliveryMethod3, deliveryMethod4, deliveryMethod5, new DeliveryMethod("None", 5, "NONE")};
        A02 = deliveryMethodArr;
        A01 = C00t.A00(deliveryMethodArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M36.A00);
    }

    public DeliveryMethod(String str, int i, String str2) {
        this.value = str2;
    }

    public static DeliveryMethod valueOf(String str) {
        return (DeliveryMethod) Enum.valueOf(DeliveryMethod.class, str);
    }

    public static DeliveryMethod[] values() {
        return (DeliveryMethod[]) A02.clone();
    }
}
