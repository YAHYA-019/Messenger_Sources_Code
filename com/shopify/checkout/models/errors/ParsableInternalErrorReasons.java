package com.shopify.checkout.models.errors;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3E;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ParsableInternalErrorReasons.class */
public final class ParsableInternalErrorReasons {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ParsableInternalErrorReasons[] A02;
    public static final Companion Companion;
    public final String value = "meta_parsable_internal_error";

    /* loaded from: ParsableInternalErrorReasons$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(ParsableInternalErrorReasons.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.shopify.checkout.models.errors.ParsableInternalErrorReasons$Companion, java.lang.Object] */
    static {
        ParsableInternalErrorReasons[] parsableInternalErrorReasonsArr = {new ParsableInternalErrorReasons()};
        A02 = parsableInternalErrorReasonsArr;
        A01 = C00t.A00(parsableInternalErrorReasonsArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3E.A00);
    }

    public static ParsableInternalErrorReasons valueOf(String str) {
        return (ParsableInternalErrorReasons) Enum.valueOf(ParsableInternalErrorReasons.class, str);
    }

    public static ParsableInternalErrorReasons[] values() {
        return (ParsableInternalErrorReasons[]) A02.clone();
    }
}
