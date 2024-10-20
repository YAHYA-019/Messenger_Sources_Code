package com.facebook.papaya.client.type;

import X.11T;
import X.1BL;
import X.C5h5;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: PapayaRestrictions.class */
public final class PapayaRestrictions {
    public final Map A00 = new HashMap();

    public final ImmutableMap A00() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        for (Map.Entry entry : this.A00.entrySet()) {
            builder.put(((C5h5) entry.getKey()).identifier, Long.valueOf(((Number) entry.getValue()).longValue()));
        }
        ImmutableMap build = builder.build();
        11T.A0A(build);
        return build;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !1BL.A1V(this, obj)) {
            return false;
        }
        return 11T.A0O(this.A00, ((PapayaRestrictions) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
