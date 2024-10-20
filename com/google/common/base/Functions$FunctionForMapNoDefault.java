package com.google.common.base;

import X.AnonymousClass001;
import X.JQy;
import java.io.Serializable;
import java.util.Map;

/* loaded from: Functions$FunctionForMapNoDefault.class */
public class Functions$FunctionForMapNoDefault implements Function, Serializable {
    public static final long serialVersionUID = 0;
    public final Map map;

    public Functions$FunctionForMapNoDefault(Map map) {
        this.map = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r301.map.containsKey(r302) != false) goto L6;
     */
    @Override // com.google.common.base.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            java.util.Map r0 = r0.map
            r303 = r0
            r0 = r303
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L27
            r0 = r301
            java.util.Map r0 = r0.map
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.containsKey(r1)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L2a
        L27:
            r0 = 1
            r306 = r0
        L2a:
            r0 = r306
            java.lang.String r1 = "Key '%s' not present in map"
            r2 = r302
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Functions$FunctionForMapNoDefault.apply(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.common.base.Function
    public boolean equals(Object obj) {
        if (obj instanceof Functions$FunctionForMapNoDefault) {
            return this.map.equals(((Functions$FunctionForMapNoDefault) obj).map);
        }
        return false;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Functions.forMap(");
        return JQy.A0r(this.map, A0k);
    }
}
