package X;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: Lrq.class */
public final class Lrq implements ParameterizedType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type ownerType;
    public final Type rawType;
    public final Type[] typeArguments;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r302 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (r0.getEnclosingClass() == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Lrq(java.lang.reflect.Type r302, java.lang.reflect.Type r303, java.lang.reflect.Type... r304) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r303
            java.lang.Class r0 = r0.getClass()
            r0 = r303
            boolean r0 = r0 instanceof java.lang.Class
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L51
            r0 = r303
            r307 = r0
            r0 = r303
            java.lang.Class r0 = (java.lang.Class) r0
            r307 = r0
            r0 = r307
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L41
            r0 = r307
            java.lang.Class r0 = r0.getEnclosingClass()
            r307 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L44
        L41:
            r0 = 1
            r305 = r0
        L44:
            r0 = r302
            if (r0 != 0) goto Lbd
            r0 = r305
            if (r0 != 0) goto L55
            java.lang.IllegalArgumentException r0 = X.JQx.A0n()
            throw r0
        L51:
            r0 = r302
            if (r0 != 0) goto Lbd
        L55:
            r0 = 0
            r305 = r0
            r0 = 0
            r308 = r0
        L5b:
            r0 = r301
            r1 = r308
            r0.ownerType = r1
            r0 = r303
            java.lang.reflect.Type r0 = X.LDK.A04(r0)
            r308 = r0
            r0 = r301
            r1 = r308
            r0.rawType = r1
            r0 = r304
            java.lang.Object r0 = r0.clone()
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r308 = r0
            r0 = r301
            r1 = r308
            r0.typeArguments = r1
            r0 = r308
            int r0 = r0.length
            r309 = r0
        L81:
            r0 = r306
            r1 = r309
            if (r0 >= r1) goto Lc6
            r0 = r301
            java.lang.reflect.Type[] r0 = r0.typeArguments
            r1 = r306
            r0 = r0[r1]
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            java.lang.reflect.Type[] r0 = r0.typeArguments
            r1 = r306
            r0 = r0[r1]
            X.LDK.A05(r0)
            r0 = r301
            java.lang.reflect.Type[] r0 = r0.typeArguments
            r307 = r0
            r0 = r307
            r1 = r306
            r0 = r0[r1]
            java.lang.reflect.Type r0 = X.LDK.A04(r0)
            r308 = r0
            r0 = r307
            r1 = r306
            r2 = r308
            r0[r1] = r2
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L81
        Lbd:
            r0 = r302
            java.lang.reflect.Type r0 = X.LDK.A04(r0)
            r308 = r0
            goto L5b
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lrq.<init>(java.lang.reflect.Type, java.lang.reflect.Type, java.lang.reflect.Type[]):void");
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
            boolean r0 = r0 instanceof java.lang.reflect.ParameterizedType
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
        throw new UnsupportedOperationException("Method not decompiled: X.Lrq.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return (Type[]) this.typeArguments.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.rawType;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ AnonymousClass002.A04(this.ownerType);
    }

    public String toString() {
        int length = this.typeArguments.length;
        if (length == 0) {
            return LDK.A01(this.rawType);
        }
        StringBuilder A0l = AnonymousClass001.A0l((length + 1) * 30);
        A0l.append(LDK.A01(this.rawType));
        A0l.append("<");
        A0l.append(LDK.A01(this.typeArguments[0]));
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return AnonymousClass001.A0d(">", A0l);
            }
            AnonymousClass001.A1H(A0l);
            A0l.append(LDK.A01(this.typeArguments[i2]));
            i = i2 + 1;
        }
    }
}
