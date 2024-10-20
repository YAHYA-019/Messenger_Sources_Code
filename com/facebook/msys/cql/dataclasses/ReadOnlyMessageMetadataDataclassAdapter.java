package com.facebook.msys.cql.dataclasses;

import X.49J;
import X.5oV;
import X.AnonymousClass001;
import X.C00j;
import X.C5g9;
import X.C5oc;
import org.json.JSONObject;

/* loaded from: ReadOnlyMessageMetadataDataclassAdapter.class */
public final class ReadOnlyMessageMetadataDataclassAdapter extends 49J {
    public static final C5oc Companion = new Object();
    public static final ReadOnlyMessageMetadataDataclassAdapter INSTANCE = new 49J();

    public 5oV toAdaptedObject(String str) {
        if (str != null) {
            return new C5g9(new JSONObject(str));
        }
        throw AnonymousClass001.A0Q("Trying to create ReadOnlyMessageMetadataDataclass from null string");
    }

    public 5oV toNullableAdaptedObject(String str) {
        if (str == null) {
            return null;
        }
        C00j.A05("ReadOnlyMessageMetadataDataclassAdapter.toNullableAdaptedObject.Deserialize", 912460440);
        try {
            C5g9 c5g9 = new C5g9(new JSONObject(str));
            C00j.A01(-1169828240);
            return c5g9;
        } catch (Throwable th) {
            C00j.A01(-698625127);
            throw th;
        }
    }

    public String toNullableRawObject(5oV r302) {
        if (r302 != null) {
            return toRawObject(r302);
        }
        return null;
    }

    public String toRawObject(5oV r302) {
        String obj;
        if (r302 == null || (obj = ((C5g9) r302).A00.toString()) == null) {
            throw AnonymousClass001.A0Q("Trying to get string from null ReadOnlyMessageMetadataDataclass");
        }
        return obj;
    }
}
