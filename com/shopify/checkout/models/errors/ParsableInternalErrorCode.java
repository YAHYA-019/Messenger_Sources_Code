package com.shopify.checkout.models.errors;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3D;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ParsableInternalErrorCode.class */
public final class ParsableInternalErrorCode {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ParsableInternalErrorCode[] A02;
    public static final Companion Companion;

    /* loaded from: ParsableInternalErrorCode$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(ParsableInternalErrorCode.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.shopify.checkout.models.errors.ParsableInternalErrorCode$Companion] */
    static {
        ParsableInternalErrorCode[] parsableInternalErrorCodeArr = {new ParsableInternalErrorCode()};
        A02 = parsableInternalErrorCodeArr;
        A01 = C00t.A00(parsableInternalErrorCodeArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3D.A00);
    }

    public static ParsableInternalErrorCode valueOf(String str) {
        return (ParsableInternalErrorCode) Enum.valueOf(ParsableInternalErrorCode.class, str);
    }

    public static ParsableInternalErrorCode[] values() {
        return (ParsableInternalErrorCode[]) A02.clone();
    }
}
