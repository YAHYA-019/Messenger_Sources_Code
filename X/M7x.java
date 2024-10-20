package X;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function2;

/* loaded from: M7x.class */
public final class M7x extends C00q implements Function2 {
    public static final M7x A00 = new M7x();

    public M7x() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        if (collection == null) {
            return collection2;
        }
        ArrayList A17 = 1BK.A17(collection);
        A17.addAll(collection2);
        return A17;
    }
}
