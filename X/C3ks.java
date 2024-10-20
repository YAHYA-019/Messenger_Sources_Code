package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* renamed from: X.3ks, reason: invalid class name */
/* loaded from: 3ks.class */
public final class C3ks extends C00q implements Function1 {
    public static final C3ks A00 = new C3ks();

    public C3ks() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        11T.A0F(entry, 0);
        return Boolean.valueOf(11T.A0O(entry.getValue(), "__x"));
    }
}
