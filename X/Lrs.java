package X;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: Lrs.class */
public final class Lrs implements WildcardType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type lowerBound;
    public final Type upperBound;

    public Lrs(Type[] typeArr, Type[] typeArr2) {
        Type A04;
        int length = typeArr2.length;
        if (!DKD.A1V(length, 1)) {
            throw JQx.A0n();
        }
        if (!AnonymousClass001.A1Q(typeArr.length, 1)) {
            throw JQx.A0n();
        }
        if (length == 1) {
            typeArr2[0].getClass();
            LDK.A05(typeArr2[0]);
            A04 = Object.class;
            if (typeArr[0] != A04) {
                throw JQx.A0n();
            }
            this.lowerBound = LDK.A04(typeArr2[0]);
        } else {
            typeArr[0].getClass();
            LDK.A05(typeArr[0]);
            this.lowerBound = null;
            A04 = LDK.A04(typeArr[0]);
        }
        this.upperBound = A04;
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
            boolean r0 = r0 instanceof java.lang.reflect.WildcardType
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
        throw new UnsupportedOperationException("Method not decompiled: X.Lrs.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type != null ? new Type[]{type} : LDK.A00;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        return new Type[]{this.upperBound};
    }

    public int hashCode() {
        Type type = this.lowerBound;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
    }

    public String toString() {
        StringBuilder A0k;
        String str;
        Type type = this.lowerBound;
        if (type != null) {
            A0k = AnonymousClass001.A0k();
            str = "? super ";
        } else {
            type = this.upperBound;
            if (type == Object.class) {
                return "?";
            }
            A0k = AnonymousClass001.A0k();
            str = "? extends ";
        }
        A0k.append(str);
        return AnonymousClass001.A0d(LDK.A01(type), A0k);
    }
}
