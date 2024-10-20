package X;

import androidx.lifecycle.ViewModelKt;
import java.util.LinkedHashMap;

/* renamed from: X.9fp, reason: invalid class name */
/* loaded from: 9fp.class */
public final class C9fp {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final java.util.Map A03;

    public C9fp(Integer num, Integer num2, Integer num3, 03Y... r305) {
        java.util.Map A1F;
        1BK.A1K(num3, 3, r305);
        int length = r305.length;
        if (length == 0) {
            A1F = 7zM.A1F();
        } else if (length != 1) {
            A1F = new LinkedHashMap(02J.A00(length));
            04R.A0I(A1F, r305);
        } else {
            A1F = 02J.A01(r305[0]);
        }
        this.A01 = num;
        this.A02 = num2;
        this.A00 = num3;
        this.A03 = A1F;
    }

    public static void A00(8Cz r301, Integer num, Integer num2, Integer num3, Object obj) {
        C9fp c9fp = new C9fp(num, num2, num3, (03Y[]) obj);
        2aK.A03((Integer) null, (0DE) null, new AJX(c9fp, r301, (0DR) null, 13), ViewModelKt.getViewModelScope(r301), 3);
    }
}
