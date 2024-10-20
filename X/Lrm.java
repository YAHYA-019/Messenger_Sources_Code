package X;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: Lrm.class */
public final class Lrm implements GenericArrayType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type componentType;

    public Lrm(Type type) {
        type.getClass();
        this.componentType = LDK.A04(type);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.LDK.A06(r301, (java.lang.reflect.Type) r302) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.lang.reflect.GenericArrayType
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = X.LDK.A06(r0, r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lrm.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.componentType;
    }

    public int hashCode() {
        return this.componentType.hashCode();
    }

    public String toString() {
        return 0Pz.A0W(LDK.A01(this.componentType), "[]");
    }
}
