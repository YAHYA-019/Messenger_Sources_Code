package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* loaded from: M6l.class */
public final class M6l extends C00q implements Function1 {
    public static final M6l A00 = new M6l();

    public M6l() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return GOo.A10("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
    }
}
