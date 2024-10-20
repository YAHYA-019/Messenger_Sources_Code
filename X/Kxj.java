package X;

import com.google.common.base.Preconditions;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: Kxj.class */
public final class Kxj {
    public static final boolean A00;

    static {
        TypeVariable typeVariable = Kxj.class.getTypeParameters()[0];
        Lro lro = new Lro(new KtI("X", Kxj.class, new Type[]{Object.class}));
        Preconditions.checkArgument(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        A00 = !typeVariable.equals((TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, lro)));
    }
}
