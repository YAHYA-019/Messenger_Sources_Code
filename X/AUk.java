package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AUk.class */
public final class AUk extends C00q implements Function1 {
    public static final AUk A00 = new AUk();

    public AUk() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        9YR r0 = (9YR) obj;
        StringBuilder A0x = 7zO.A0x(r0, 0);
        A0x.append(r0.A00);
        A0x.append('_');
        A0x.append(r0.A01);
        return A0x.toString();
    }
}
