package X;

/* loaded from: L9m.class */
public final class L9m {
    public static final L9m A02;
    public static final L9m A03;
    public static final 2K8 A04;
    public static final String A05;
    public static final String A06;
    public final 2K8 A00;
    public final boolean A01;

    static {
        2K8 r0 = 2K5.A01;
        A04 = r0;
        A05 = Character.toString((char) 8206);
        A06 = Character.toString((char) 8207);
        A02 = new L9m(r0, false);
        A03 = new L9m(r0, true);
    }

    public L9m(2K8 r302, boolean z) {
        this.A01 = z;
        this.A00 = r302;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x0144. Please report as an issue. */
    public static int A00(CharSequence charSequence) {
        byte directionality;
        byte directionality2;
        byte[] bArr = KZy.A00;
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i < length) {
                if (i2 == 0) {
                    char charAt = charSequence.charAt(i);
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(charSequence, i);
                        i += Character.charCount(codePointAt);
                        directionality2 = Character.getDirectionality(codePointAt);
                    } else {
                        i++;
                        directionality2 = charAt < 1792 ? KZy.A00[charAt] : Character.getDirectionality(charAt);
                    }
                    if (directionality2 != 0) {
                        if (directionality2 == 1 || directionality2 == 2) {
                            if (i4 == 0) {
                                return 1;
                            }
                        } else if (directionality2 != 9) {
                            switch (directionality2) {
                                case 14:
                                case 15:
                                    i4++;
                                    i3 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i4++;
                                    i3 = 1;
                                    continue;
                                case 18:
                                    i4--;
                                    i3 = 0;
                                    continue;
                            }
                        }
                    } else if (i4 == 0) {
                        return -1;
                    }
                    i2 = i4;
                }
            } else if (i2 == 0) {
                return 0;
            }
        }
        if (i3 != 0) {
            return i3;
        }
        while (i > 0) {
            int i5 = i - 1;
            char charAt2 = charSequence.charAt(i5);
            if (Character.isLowSurrogate(charAt2)) {
                int codePointBefore = Character.codePointBefore(charSequence, i);
                i -= Character.charCount(codePointBefore);
                directionality = Character.getDirectionality(codePointBefore);
            } else {
                i = i5;
                directionality = charAt2 < 1792 ? KZy.A00[charAt2] : Character.getDirectionality(charAt2);
            }
            switch (directionality) {
                case 14:
                case 15:
                    if (i2 == i4) {
                        return -1;
                    }
                    i4--;
                case 16:
                case 17:
                    if (i2 == i4) {
                        return 1;
                    }
                    i4--;
                case 18:
                    i4++;
            }
        }
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x006f. Please report as an issue. */
    public static int A01(CharSequence charSequence) {
        byte directionality;
        byte[] bArr = KZy.A00;
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (length > 0) {
            char charAt = charSequence.charAt(length - 1);
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, length);
                length -= Character.charCount(codePointBefore);
                directionality = Character.getDirectionality(codePointBefore);
            } else {
                length--;
                directionality = charAt < 1792 ? KZy.A00[charAt] : Character.getDirectionality(charAt);
            }
            if (directionality != 0) {
                if (directionality == 1 || directionality == 2) {
                    if (i == 0) {
                        return 1;
                    }
                } else if (directionality != 9) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                    }
                } else {
                    continue;
                }
            } else if (i == 0) {
                return -1;
            }
            if (i2 == 0) {
                i2 = i;
            }
        }
        return 0;
    }
}
