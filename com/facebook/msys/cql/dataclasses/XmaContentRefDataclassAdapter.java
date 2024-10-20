package com.facebook.msys.cql.dataclasses;

import X.49J;
import X.6AQ;
import X.6Am;
import X.AnonymousClass001;
import X.C00j;
import X.C5g9;
import org.json.JSONObject;

/* loaded from: XmaContentRefDataclassAdapter.class */
public final class XmaContentRefDataclassAdapter extends 49J {
    public static final 6AQ Companion = new Object();
    public static final XmaContentRefDataclassAdapter INSTANCE = new 49J();

    public 6Am toAdaptedObject(String str) {
        if (str != null) {
            return new C5g9(new JSONObject(str));
        }
        throw AnonymousClass001.A0Q("Trying to create XmaContentRefDataclass from null string");
    }

    public 6Am toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        C00j.A05("XmaContentRefDataclassImpl.toNullableAdaptedObject.Deserialize", -1366890266);
        try {
            C5g9 c5g9 = new C5g9(new JSONObject(str));
            C00j.A01(-1950496410);
            return c5g9;
        } catch (Throwable th) {
            C00j.A01(1078972292);
            throw th;
        }
    }

    public String toNullableRawObject(6Am r302) {
        if (r302 != null) {
            return toRawObject(r302);
        }
        return null;
    }

    public String toRawObject(6Am r302) {
        String obj;
        if (r302 == null || (obj = ((C5g9) r302).A00.toString()) == null) {
            throw AnonymousClass001.A0Q("Trying to get string from null XmaContentRefDataclass");
        }
        return obj;
    }
}
