package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AUz.class */
public final class AUz extends C00q implements Function1 {
    public static final AUz A00 = new AUz();

    public AUz() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        throw new Exception("Dispatching while constructing your middleware is not allowed.\n                    Other middleware would not be applied to this dispatch.");
    }
}
