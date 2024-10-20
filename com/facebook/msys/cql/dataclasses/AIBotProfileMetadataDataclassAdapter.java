package com.facebook.msys.cql.dataclasses;

import X.49J;
import X.AnonymousClass001;
import X.C00j;
import X.C5g9;
import X.DKC;
import X.KWv;
import X.MO0;

/* loaded from: AIBotProfileMetadataDataclassAdapter.class */
public final class AIBotProfileMetadataDataclassAdapter extends 49J {
    public static final KWv Companion = new Object();
    public static final AIBotProfileMetadataDataclassAdapter INSTANCE = new 49J();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.MO0, X.5g9] */
    public MO0 toAdaptedObject(String str) {
        if (str != null) {
            return new C5g9(DKC.A1F(str));
        }
        throw AnonymousClass001.A0Q("Trying to create AIBotProfileMetadataDataclass from null string");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.MO0, X.5g9] */
    public MO0 toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        C00j.A05("AIBotProfileMetadataDataclassImpl.toNullableAdaptedObject.Deserialize", -1988403300);
        try {
            ?? c5g9 = new C5g9(DKC.A1F(str));
            C00j.A01(609547912);
            return c5g9;
        } catch (Throwable th) {
            C00j.A01(-1328794345);
            throw th;
        }
    }

    public String toNullableRawObject(MO0 mo0) {
        if (mo0 != null) {
            return toRawObject(mo0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toRawObject(MO0 mo0) {
        String obj;
        if (mo0 == 0 || (obj = ((C5g9) mo0).A00.toString()) == null) {
            throw AnonymousClass001.A0Q("Trying to get string from null AIBotProfileMetadataDataclass");
        }
        return obj;
    }
}
