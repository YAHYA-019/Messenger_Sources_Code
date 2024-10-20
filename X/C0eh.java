package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.0eh, reason: invalid class name */
/* loaded from: 0eh.class */
public final class C0eh extends C00q implements Function2 {
    public final /* synthetic */ 0DE[] $elements;
    public final /* synthetic */ 0PI $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0eh(0PI r302, 0DE[] r303) {
        super(2);
        this.$elements = r303;
        this.$index = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        11T.A0F(obj2, 1);
        0DE[] r0 = this.$elements;
        0PI r02 = this.$index;
        int i = r02.element;
        r02.element = i + 1;
        r0[i] = obj2;
        return 04S.A00;
    }
}
