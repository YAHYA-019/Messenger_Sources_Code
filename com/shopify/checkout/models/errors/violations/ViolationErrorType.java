package com.shopify.checkout.models.errors.violations;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3J;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ViolationErrorType.class */
public final class ViolationErrorType {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ViolationErrorType[] A02;
    public static final ViolationErrorType A03;
    public static final Companion Companion;
    public final String value;

    /* loaded from: ViolationErrorType$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(ViolationErrorType.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.shopify.checkout.models.errors.violations.ViolationErrorType$Companion] */
    static {
        ViolationErrorType violationErrorType = new ViolationErrorType("Delivery", 0, "delivery");
        A03 = violationErrorType;
        ViolationErrorType[] violationErrorTypeArr = {violationErrorType, new ViolationErrorType("Inventory", 1, "inventory")};
        A02 = violationErrorTypeArr;
        A01 = C00t.A00(violationErrorTypeArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3J.A00);
    }

    public ViolationErrorType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ViolationErrorType valueOf(String str) {
        return (ViolationErrorType) Enum.valueOf(ViolationErrorType.class, str);
    }

    public static ViolationErrorType[] values() {
        return (ViolationErrorType[]) A02.clone();
    }
}
