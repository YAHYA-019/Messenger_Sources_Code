package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M61.class */
public final class M61 extends C00q implements Function1 {
    public static final M61 A00 = new M61();

    public M61() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, X.JeA] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ?? r0 = (C2945JeA) obj;
        if (r0.isAttachedToWindow()) {
            r0.A07();
        }
        return 04S.A00;
    }
}
