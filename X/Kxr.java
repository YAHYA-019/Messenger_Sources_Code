package X;

/* loaded from: Kxr.class */
public abstract class Kxr {
    public static final KTQ A00;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        A00 = (LDw.A03 && LDw.A04 && (KcF.A00 == null || KcF.A01)) ? new Object() : new Object();
    }

    public static int A00(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= length || charSequence.charAt(i) >= 128) {
                break;
            }
            i2 = i + 1;
        }
        int i3 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i4 = 0;
                while (i < length2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i) < 65536) {
                                throw new KQu(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i3 += i4;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw JQy.A0h("UTF-8 length does not fit in int: ", i3 + 4294967296L);
    }
}
