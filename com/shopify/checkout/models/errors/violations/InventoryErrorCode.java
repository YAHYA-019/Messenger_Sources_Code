package com.shopify.checkout.models.errors.violations;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3I;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: InventoryErrorCode.class */
public final class InventoryErrorCode {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ InventoryErrorCode[] A02;
    public static final InventoryErrorCode A03;
    public static final InventoryErrorCode A04;
    public static final InventoryErrorCode A05;
    public static final Companion Companion;
    public final String value;

    /* loaded from: InventoryErrorCode$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(InventoryErrorCode.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.shopify.checkout.models.errors.violations.InventoryErrorCode$Companion, java.lang.Object] */
    static {
        InventoryErrorCode inventoryErrorCode = new InventoryErrorCode("InsufficientQuantity", 0, "insufficient_quantity");
        A03 = inventoryErrorCode;
        InventoryErrorCode inventoryErrorCode2 = new InventoryErrorCode("OutOfStock", 1, "out_of_stock");
        A04 = inventoryErrorCode2;
        InventoryErrorCode inventoryErrorCode3 = new InventoryErrorCode("UnavailableProduct", 2, "unavailable_product");
        A05 = inventoryErrorCode3;
        InventoryErrorCode[] inventoryErrorCodeArr = {inventoryErrorCode, inventoryErrorCode2, inventoryErrorCode3, new InventoryErrorCode("UnpurchasableProduct", 3, "unpurchasable_product")};
        A02 = inventoryErrorCodeArr;
        A01 = C00t.A00(inventoryErrorCodeArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3I.A00);
    }

    public InventoryErrorCode(String str, int i, String str2) {
        this.value = str2;
    }

    public static InventoryErrorCode valueOf(String str) {
        return (InventoryErrorCode) Enum.valueOf(InventoryErrorCode.class, str);
    }

    public static InventoryErrorCode[] values() {
        return (InventoryErrorCode[]) A02.clone();
    }
}
