package X;

import kotlin.jvm.functions.Function2;

/* loaded from: J8i.class */
public final /* synthetic */ class J8i extends 01I implements Function2 {
    public static final J8i A00 = new J8i();

    public J8i() {
        super(2, HzK.class, "getLightVibrantColor", "getLightVibrantColor(I)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        HzK hzK = (HzK) obj;
        int A03 = AnonymousClass001.A03(obj2);
        11T.A0F(hzK, 0);
        return Integer.valueOf(GOq.A0B(hzK, Hyk.A06, A03));
    }
}
