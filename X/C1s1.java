package X;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* renamed from: X.1s1, reason: invalid class name */
/* loaded from: 1s1.class */
public final class C1s1 extends C00q implements Function1 {
    public static final C1s1 A00 = new C1s1();

    public C1s1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        File file = (File) obj;
        11T.A0F(file, 0);
        return Boolean.valueOf(file.isFile());
    }
}
