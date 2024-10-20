package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* loaded from: M6k.class */
public final class M6k extends C00q implements Function1 {
    public static final M6k A00 = new M6k();

    public M6k() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return GOo.A10("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
    }
}
