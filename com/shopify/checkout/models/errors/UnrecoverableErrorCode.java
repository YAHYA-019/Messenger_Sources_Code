package com.shopify.checkout.models.errors;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3F;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: UnrecoverableErrorCode.class */
public final class UnrecoverableErrorCode {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ UnrecoverableErrorCode[] A02;
    public static final UnrecoverableErrorCode A03;
    public static final Companion Companion;
    public final String value;

    /* loaded from: UnrecoverableErrorCode$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(UnrecoverableErrorCode.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.shopify.checkout.models.errors.UnrecoverableErrorCode$Companion] */
    static {
        UnrecoverableErrorCode unrecoverableErrorCode = new UnrecoverableErrorCode("SdkNotEnabled", 0, "sdk_not_enabled");
        A03 = unrecoverableErrorCode;
        UnrecoverableErrorCode[] unrecoverableErrorCodeArr = {unrecoverableErrorCode, new UnrecoverableErrorCode("InvalidCheckoutUrl", 1, "invalid_checkout_url")};
        A02 = unrecoverableErrorCodeArr;
        A01 = C00t.A00(unrecoverableErrorCodeArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3F.A00);
    }

    public UnrecoverableErrorCode(String str, int i, String str2) {
        this.value = str2;
    }

    public static UnrecoverableErrorCode valueOf(String str) {
        return (UnrecoverableErrorCode) Enum.valueOf(UnrecoverableErrorCode.class, str);
    }

    public static UnrecoverableErrorCode[] values() {
        return (UnrecoverableErrorCode[]) A02.clone();
    }
}
