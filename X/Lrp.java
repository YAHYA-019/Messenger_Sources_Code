package X;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: Lrp.class */
public final class Lrp implements ParameterizedType, Serializable {
    public static final long serialVersionUID = 0;
    public final ImmutableList argumentsList;
    public final Type ownerType;
    public final Class rawType;

    public Lrp(Class cls, Type type, Type[] typeArr) {
        int length = typeArr.length;
        Preconditions.checkArgument(AnonymousClass001.A1Q(length, cls.getTypeParameters().length));
        L6n.A01("type parameter", typeArr);
        this.ownerType = type;
        this.rawType = cls;
        KME kme = KME.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                this.argumentsList = builder.build();
                return;
            } else {
                builder.m11011add((Object) kme.A02(typeArr[i2]));
                i = i2 + 1;
            }
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (getRawType().equals(parameterizedType.getRawType()) && Objects.equal(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return (Type[]) this.argumentsList.toArray(new Type[0]);
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
        return (AnonymousClass001.A02(this.ownerType) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        Type type = this.ownerType;
        if (type != null) {
            KBK kbk = KME.A00;
            if (3 - kbk.A00 != 0) {
                A0k.append(kbk.A00(type));
                A0k.append('.');
            }
        }
        JQz.A1I(this.rawType, A0k);
        A0k.append('<');
        A0k.append(L6n.A00.join((Iterable) 2Ri.A02(new Ley(KME.A00, 14), this.argumentsList)));
        return AnonymousClass001.A0g(A0k, '>');
    }
}
