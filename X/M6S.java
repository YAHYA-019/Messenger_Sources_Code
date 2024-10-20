package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: M6S.class */
public final class M6S extends C00q implements Function1 {
    public static final M6S A00 = new M6S();

    public M6S() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder A0x = 7zO.A0x(entry, 0);
        A0x.append("|    ");
        A0x.append(AnonymousClass001.A0j(entry));
        A0x.append(" = ");
        return AnonymousClass001.A0a(entry.getValue(), A0x);
    }
}
