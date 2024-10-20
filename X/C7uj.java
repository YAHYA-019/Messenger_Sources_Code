package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.7uj, reason: invalid class name */
/* loaded from: 7uj.class */
public abstract class C7uj {
    public static final CharSequence A00(int i, CharSequence charSequence) {
        String str;
        StringBuilder A0n;
        if (charSequence.length() >= 200) {
            str = ".....";
            if (i == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    A0n = AnonymousClass001.A0n(str);
                    str = charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i2 = i - 30;
                int i3 = i + 30;
                String str2 = str;
                if (i2 <= 0) {
                    str2 = "";
                }
                str = i3 >= charSequence.length() ? "" : ".....";
                A0n = AnonymousClass001.A0n(str2);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length2 = charSequence.length();
                if (i3 > length2) {
                    i3 = length2;
                }
                1BK.A1R(A0n, charSequence.subSequence(i2, i3));
            }
            charSequence = AnonymousClass001.A0d(str, A0n);
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.7xp, java.lang.IllegalArgumentException] */
    public static final C7xp A01(CharSequence charSequence, String str, int i) {
        1BL.A1F(str, charSequence);
        StringBuilder A0n = AnonymousClass001.A0n(str);
        A0n.append("\nJSON input: ");
        String A0a = AnonymousClass001.A0a(A00(i, charSequence), A0n);
        11T.A0F(A0a, 1);
        if (i >= 0) {
            A0a = 0Pz.A0E(i, "Unexpected JSON token at offset ", ": ", A0a);
        }
        11T.A0F(A0a, 1);
        return new IllegalArgumentException(A0a);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.7xq, java.lang.IllegalArgumentException] */
    public static final C7xq A02(SerialDescriptor serialDescriptor) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Value of type '");
        A0k.append(serialDescriptor.BA2());
        A0k.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        A0k.append(serialDescriptor.Asv());
        String A0d = AnonymousClass001.A0d("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", A0k);
        11T.A0F(A0d, 1);
        return new IllegalArgumentException(A0d);
    }

    public static final void A03(String str, 5Z1 r302) {
        r302.A0G(0Pz.A0W("Trailing comma before the end of JSON ", str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.", r302.A00 - 1);
        throw 0Q8.createAndThrow();
    }
}
