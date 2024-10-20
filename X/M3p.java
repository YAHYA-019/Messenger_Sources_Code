package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M3p.class */
public final class M3p extends C00q implements Function1 {
    public final float A00;
    public final float A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3p(int i, float f, float f2) {
        super(1);
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A02 == 0) {
            throw AnonymousClass001.A0Q("setName");
        }
        DKM dkm = (DKM) obj;
        11T.A0F(dkm, 0);
        dkm.A0J(FB1.A00(this.A00), 3);
        dkm.A0J(FB1.A00(this.A01), 4);
        return dkm;
    }
}
