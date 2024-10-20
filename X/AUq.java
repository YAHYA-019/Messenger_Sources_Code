package X;

import android.view.animation.AccelerateInterpolator;
import kotlin.jvm.functions.Function1;

/* loaded from: AUq.class */
public final class AUq extends C00q implements Function1 {
    public static final AUq A00 = new AUq();

    public AUq() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        5X3 A02 = C3s9.A02("suggestions_visibility");
        C2jo c2jo = C2jm.A00;
        float A01 = 7zQ.A01(A02, c2jo);
        7zN.A12(new AccelerateInterpolator(), A02, 500);
        A02.A03(c2jo);
        A02.A02(A01);
        7zU.A1J(A02, 500);
        return A02;
    }
}
