package X;

import android.graphics.Typeface;
import com.facebook.inspiration.model.fonts.InspirationFont;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* loaded from: F7t.class */
public final class F7t {
    public static final InspirationFont A03;
    public final 1Br A00;
    public final Typeface A01;
    public final 1De A02;

    static {
        Rb5 rb5 = new Rb5();
        rb5.A0F = true;
        rb5.A08 = "ROBOTO";
        rb5.A0C = "default";
        A03 = new InspirationFont(rb5);
    }

    public F7t(1De r302) {
        this.A02 = r302;
        1Br A0O = AbI.A0O(r302);
        this.A00 = A0O;
        Typeface A01 = 2KU.A01(AbJ.A05(A0O), 0S2.A0N);
        if (A01 == null) {
            throw 1BK.A0h();
        }
        this.A01 = A01;
    }

    public final Typeface A00(InspirationFont inspirationFont) {
        Typeface typeface = this.A01;
        if (!inspirationFont.A0F) {
            LCE lce = (LCE) 7zR.A0o(AbJ.A05(this.A00), 131120);
            String str = inspirationFont.A06;
            11T.A0A(str);
            String str2 = inspirationFont.A0B;
            11T.A0A(str2);
            String str3 = inspirationFont.A07;
            11T.A0A(str3);
            HashMap A04 = lce.A04(ImmutableList.of((Object) new RoW(str, str2, str3)));
            if (A04 != null && A04.containsKey(str)) {
                typeface = (Typeface) A04.get(str);
            }
        }
        return typeface;
    }
}
