package X;

import kotlinx.serialization.encoding.Encoder;

/* loaded from: Kwl.class */
public abstract class Kwl {
    public static final 5Yw A00(String str, 5Z6 r302, 5Z9 r303) {
        5Yw A00 = r303.A00(str, r302);
        if (A00 != null) {
            return A00;
        }
        KZ5.A00(str, ((M9g) r303).A04);
        throw 0Q8.createAndThrow();
    }

    public static final 5Yv A01(Object obj, Encoder encoder, 5Z9 r303) {
        11T.A0F(r303, 0);
        5Yv A01 = r303.A01(obj, encoder);
        if (A01 != null) {
            return A01;
        }
        0BY A18 = 7zL.A18(obj.getClass());
        0BZ r0 = ((M9g) r303).A04;
        11T.A0F(r0, 1);
        String A012 = C0Bx.A01(A18.A00);
        if (A012 == null) {
            A012 = String.valueOf(A18);
        }
        KZ5.A00(A012, r0);
        throw 0Q8.createAndThrow();
    }
}
