package X;

import com.google.common.base.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: Lrl.class */
public final class Lrl implements GenericArrayType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type componentType;

    public Lrl(Type type) {
        this.componentType = KME.A00.A02(type);
    }

    public boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return Objects.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.componentType;
    }

    public int hashCode() {
        return this.componentType.hashCode();
    }

    public String toString() {
        Type type = this.componentType;
        return 0Pz.A0W(type instanceof Class ? ((Class) type).getName() : type.toString(), "[]");
    }
}
