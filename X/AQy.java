package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AQy.class */
public final class AQy extends C00q implements Function1 {
    public final /* synthetic */ int $rewindToIndex;
    public final /* synthetic */ 0PI $spanStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQy(0PI r302, int i) {
        super(1);
        this.$rewindToIndex = i;
        this.$spanStart = r302;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        07F r0 = (07F) obj;
        11T.A0F(r0, 0);
        if (r0.A01 <= this.$rewindToIndex) {
            return false;
        }
        0PI r02 = this.$spanStart;
        r02.element = Math.min(r02.element, r0.A00);
        return AnonymousClass001.A0K();
    }
}
