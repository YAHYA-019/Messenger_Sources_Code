package com.shopify.checkout.models.errors;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3B;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: DefaultsErrorCode.class */
public final class DefaultsErrorCode {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ DefaultsErrorCode[] A02;
    public static final DefaultsErrorCode A03;
    public static final DefaultsErrorCode A04;
    public static final Companion Companion;
    public final String value;

    /* loaded from: DefaultsErrorCode$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(DefaultsErrorCode.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.shopify.checkout.models.errors.DefaultsErrorCode$Companion] */
    static {
        DefaultsErrorCode defaultsErrorCode = new DefaultsErrorCode("EmptyDefaults", 0, "empty_defaults");
        A03 = defaultsErrorCode;
        DefaultsErrorCode defaultsErrorCode2 = new DefaultsErrorCode("NonUniqueAddressReferenceIds", 1, "non_unique_address_reference_ids");
        A04 = defaultsErrorCode2;
        DefaultsErrorCode[] defaultsErrorCodeArr = {defaultsErrorCode, defaultsErrorCode2, new DefaultsErrorCode("AddressMissingCountry", 2, "partial_address_missing_country_code")};
        A02 = defaultsErrorCodeArr;
        A01 = C00t.A00(defaultsErrorCodeArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3B.A00);
    }

    public DefaultsErrorCode(String str, int i, String str2) {
        this.value = str2;
    }

    public static DefaultsErrorCode valueOf(String str) {
        return (DefaultsErrorCode) Enum.valueOf(DefaultsErrorCode.class, str);
    }

    public static DefaultsErrorCode[] values() {
        return (DefaultsErrorCode[]) A02.clone();
    }
}
