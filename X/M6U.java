package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* loaded from: M6U.class */
public final class M6U extends C00q implements Function1 {
    public static final M6U A00 = new M6U();

    public M6U() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0F(obj, 0);
        0fH.A14("LinkManagerImpl", "Channel received error", Arrays.copyOf(new Object[]{obj}, 1));
        return 04S.A00;
    }
}
