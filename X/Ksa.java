package X;

import java.lang.reflect.TypeVariable;

/* loaded from: Ksa.class */
public final class Ksa {
    public final TypeVariable A00;

    public Ksa(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.A00 = typeVariable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (r0.getName().equals(r0.getName()) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.Ksa
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L57
            r0 = r302
            X.Ksa r0 = (X.Ksa) r0
            r302 = r0
            r0 = r302
            java.lang.reflect.TypeVariable r0 = r0.A00
            r304 = r0
            r0 = r301
            java.lang.reflect.TypeVariable r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.reflect.GenericDeclaration r0 = r0.getGenericDeclaration()
            r306 = r0
            r0 = r304
            java.lang.reflect.GenericDeclaration r0 = r0.getGenericDeclaration()
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L57
            r0 = r305
            java.lang.String r0 = r0.getName()
            r306 = r0
            r0 = r304
            java.lang.String r0 = r0.getName()
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 != 0) goto L5c
        L57:
            r0 = 0
            r303 = r0
            r0 = 0
            r307 = r0
        L5c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ksa.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        TypeVariable typeVariable = this.A00;
        return AbM.A05(typeVariable.getGenericDeclaration(), typeVariable.getName());
    }

    public String toString() {
        return this.A00.toString();
    }
}
