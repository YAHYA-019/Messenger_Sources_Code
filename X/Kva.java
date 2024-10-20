package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: Kva.class */
public abstract class Kva {
    public static final Ke6 A00(String str) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            if (!Character.isDigit(str.charAt(i))) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            return null;
        }
        char[] charArray = str.toCharArray();
        11T.A0A(charArray);
        ArrayList A0t = AnonymousClass001.A0t(charArray.length);
        for (char c : charArray) {
            int digit = Character.digit((int) c, 10);
            if (digit < 0) {
                throw AnonymousClass001.A0L(0Pz.A0Y("Char ", " is not a decimal digit", c));
            }
            A0t.add(String.valueOf(digit));
        }
        return new Ke6(0QD.A0K("", "", "", A0t, (Function1) null, -1));
    }

    public static final Ke6 A01(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= str.length()) {
                return new Ke6(str);
            }
            char charAt = str.charAt(i2);
            if (!Character.isDefined(charAt) || 0AH.A00(charAt) == AnonymousClass104.A0F || 0AH.A00(charAt) == AnonymousClass104.A05 || 0AH.A00(charAt) == AnonymousClass104.A0H || 0AH.A00(charAt) == AnonymousClass104.A0M) {
                return null;
            }
            i = i2 + 1;
        }
    }
}
