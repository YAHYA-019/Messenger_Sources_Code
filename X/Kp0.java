package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* loaded from: Kp0.class */
public class Kp0 {
    public final ImmutableMap A00 = RegularImmutableMap.A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.reflect.Type] */
    public Type A00(Kp0 kp0, TypeVariable typeVariable) {
        if (this instanceof KBG) {
            KBG kbg = (KBG) this;
            if (!typeVariable.getGenericDeclaration().equals(kbg.A01.getGenericDeclaration())) {
                typeVariable = kbg.A00.A00(kp0, typeVariable);
            }
            return typeVariable;
        }
        Type type = (Type) this.A00.get(new Ksa(typeVariable));
        if (type == null) {
            Type[] bounds = typeVariable.getBounds();
            int length = bounds.length;
            if (length != 0) {
                L1V l1v = new L1V(kp0);
                Type[] typeArr = new Type[length];
                for (int i = 0; i < length; i++) {
                    typeArr[i] = l1v.A00(bounds[i]);
                }
                if (Kxj.A00 && Arrays.equals(bounds, typeArr)) {
                    return typeVariable;
                }
                Lro lro = new Lro(new KtI(typeVariable.getName(), typeVariable.getGenericDeclaration(), typeArr));
                Preconditions.checkArgument(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
                return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, lro));
            }
        } else {
            typeVariable = new L1V(kp0).A00(type);
        }
        return typeVariable;
    }
}
