package com.shopify.checkout.models.errors;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3C;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ErrorGroup.class */
public final class ErrorGroup {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ErrorGroup[] A02;
    public static final ErrorGroup A03;
    public static final ErrorGroup A04;
    public static final ErrorGroup A05;
    public static final ErrorGroup A06;
    public static final ErrorGroup A07;
    public static final Companion Companion;
    public final String value;

    /* loaded from: ErrorGroup$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(ErrorGroup.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.shopify.checkout.models.errors.ErrorGroup$Companion, java.lang.Object] */
    static {
        ErrorGroup errorGroup = new ErrorGroup("Violation", 0, "violation");
        A07 = errorGroup;
        ErrorGroup errorGroup2 = new ErrorGroup("Checkout", 1, "checkout");
        A03 = errorGroup2;
        ErrorGroup errorGroup3 = new ErrorGroup("Internal", 2, "internal");
        A05 = errorGroup3;
        ErrorGroup errorGroup4 = new ErrorGroup("VaultedPayment", 3, "vaulted_payment");
        A06 = errorGroup4;
        ErrorGroup errorGroup5 = new ErrorGroup("Defaults", 4, "defaults");
        A04 = errorGroup5;
        ErrorGroup[] errorGroupArr = {errorGroup, errorGroup2, errorGroup3, errorGroup4, errorGroup5, new ErrorGroup("Unrecoverable", 5, "unrecoverable")};
        A02 = errorGroupArr;
        A01 = C00t.A00(errorGroupArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3C.A00);
    }

    public ErrorGroup(String str, int i, String str2) {
        this.value = str2;
    }

    public static ErrorGroup valueOf(String str) {
        return (ErrorGroup) Enum.valueOf(ErrorGroup.class, str);
    }

    public static ErrorGroup[] values() {
        return (ErrorGroup[]) A02.clone();
    }
}
