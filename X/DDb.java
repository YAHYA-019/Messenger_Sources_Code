package X;

import kotlin.jvm.functions.Function1;

/* loaded from: DDb.class */
public final class DDb extends C00q implements Function1 {
    public static final DDb A00 = new DDb();

    public DDb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        B7K b7k = (BRA) obj;
        11T.A0F(b7k, 0);
        boolean z = true;
        if ((b7k instanceof B7K) && b7k.A05.A0G()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
