package X;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: Lrr.class */
public final class Lrr implements WildcardType, Serializable {
    public static final long serialVersionUID = 0;
    public final ImmutableList lowerBounds;
    public final ImmutableList upperBounds;

    public Lrr(Type[] typeArr, Type[] typeArr2) {
        L6n.A01("lower bound for wildcard", typeArr);
        L6n.A01("upper bound for wildcard", typeArr2);
        KME kme = KME.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        int length = typeArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            builder.m11011add((Object) kme.A02(typeArr[i2]));
            i = i2 + 1;
        }
        this.lowerBounds = builder.build();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        int length2 = typeArr2.length;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length2) {
                this.upperBounds = builder2.build();
                return;
            } else {
                builder2.m11011add((Object) kme.A02(typeArr2[i4]));
                i3 = i4 + 1;
            }
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds()))) {
                z = JQy.A1Z(this.upperBounds, Arrays.asList(wildcardType.getUpperBounds()));
            }
        }
        return z;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        return (Type[]) this.lowerBounds.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        return (Type[]) this.upperBounds.toArray(new Type[0]);
    }

    public int hashCode() {
        return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("?");
        1Du it = this.lowerBounds.iterator();
        while (it.hasNext()) {
            Type type = (Type) it.next();
            A0o.append(" super ");
            A0o.append(KME.A00.A00(type));
        }
        Iterator it2 = 2Ri.A03(new Predicates.NotPredicate(new Predicates.IsEqualToPredicate(Object.class)), this.upperBounds).iterator();
        while (it2.hasNext()) {
            Type type2 = (Type) it2.next();
            A0o.append(" extends ");
            A0o.append(KME.A00.A00(type2));
        }
        return A0o.toString();
    }
}
