package X;

/* loaded from: Kwk.class */
public abstract class Kwk {
    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw JQy.A0m("index: ", ", size: ", i, i2);
        }
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i > i2) {
            throw JQy.A0m("index: ", ", size: ", i, i2);
        }
    }
}
