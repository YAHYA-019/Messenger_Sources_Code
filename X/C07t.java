package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.07t, reason: invalid class name */
/* loaded from: 07t.class */
public final class C07t extends C00q implements Function1 {
    public final /* synthetic */ C00m $nextFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07t(C00m c00m) {
        super(1);
        this.$nextFunction = c00m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.$nextFunction.invoke();
    }
}
