package X;

/* renamed from: X.254, reason: invalid class name */
/* loaded from: 254.class */
public abstract class AnonymousClass254 {
    public static final int A00(AnonymousClass255 anonymousClass255) {
        int i;
        11T.A0F(anonymousClass255, 0);
        int ordinal = anonymousClass255.ordinal();
        if (ordinal != 1) {
            i = 2;
            if (ordinal == 2) {
                return 1;
            }
            if (ordinal != 0) {
                throw AnonymousClass002.A0C(anonymousClass255, "Unknown YogaDirection ", AnonymousClass001.A0k());
            }
        } else {
            i = 0;
        }
        return i;
    }

    public static final AnonymousClass255 A01(int i) {
        if (i == 0) {
            return AnonymousClass255.LTR;
        }
        if (i == 1) {
            return AnonymousClass255.RTL;
        }
        if (i == 2) {
            return AnonymousClass255.INHERIT;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Unknown LayoutDirection ");
        A0k.append((Object) 0Pz.A0O("LayoutDirection(value=", ')', i));
        throw 1BL.A0d(A0k);
    }
}
