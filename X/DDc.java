package X;

import kotlin.jvm.functions.Function1;

/* loaded from: DDc.class */
public final class DDc extends C00q implements Function1 {
    public static final DDc A00 = new DDc();

    public DDc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        B7K b7k = (BRA) obj;
        11T.A0F(b7k, 0);
        boolean z = true;
        if (b7k instanceof B7K) {
            z = b7k.A05.A0G();
        } else if ((b7k instanceof B7H) && ((B7H) b7k).A01.A0n.A0w()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
