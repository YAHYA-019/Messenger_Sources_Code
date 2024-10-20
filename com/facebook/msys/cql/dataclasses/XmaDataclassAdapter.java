package com.facebook.msys.cql.dataclasses;

import X.49J;
import X.6AN;
import X.6AO;
import X.AnonymousClass001;
import X.C00j;
import X.C5g9;
import org.json.JSONObject;

/* loaded from: XmaDataclassAdapter.class */
public final class XmaDataclassAdapter extends 49J {
    public static final 6AN Companion = new Object();
    public static final XmaDataclassAdapter INSTANCE = new 49J();

    public 6AO toAdaptedObject(String str) {
        if (str != null) {
            return new C5g9(new JSONObject(str));
        }
        throw AnonymousClass001.A0Q("Trying to create XmaDataclass from null string");
    }

    public 6AO toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        C00j.A05("XmaDataclassImpl.toNullableAdaptedObject.Deserialize", 324103212);
        try {
            C5g9 c5g9 = new C5g9(new JSONObject(str));
            C00j.A01(462920064);
            return c5g9;
        } catch (Throwable th) {
            C00j.A01(-1418394067);
            throw th;
        }
    }

    public String toNullableRawObject(6AO r302) {
        if (r302 != null) {
            return toRawObject(r302);
        }
        return null;
    }

    public String toRawObject(6AO r302) {
        String obj;
        if (r302 == null || (obj = ((C5g9) r302).A00.toString()) == null) {
            throw AnonymousClass001.A0Q("Trying to get string from null XmaDataclass");
        }
        return obj;
    }
}
