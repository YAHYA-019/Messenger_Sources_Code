package X;

/* loaded from: AW9.class */
public final class AW9 extends C00q implements C0Bd {
    public static final AW9 A00 = new AW9();

    public AW9() {
        super(3);
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        8CC r0 = (8CC) obj2;
        8Lu r02 = (8Lu) obj3;
        1BL.A1F(r0, r02);
        if (!11T.A0O(r0.A00, r02)) {
            r0.A00 = r02;
            r0.invalidate();
        }
        return new C2md(new AQW(r0, 14));
    }
}
