package X;

/* renamed from: X.8xg, reason: invalid class name */
/* loaded from: 8xg.class */
public final class C8xg extends 9Di {
    public final 3xX A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;

    public C8xg() {
        this(null, null, null, null);
        throw 0Q8.createAndThrow();
    }

    public C8xg(3xX r302, Integer num, Integer num2, String str) {
        this.A02 = num;
        this.A03 = str;
        this.A01 = num2;
        this.A00 = r302;
        if (num == null && str == null) {
            throw AnonymousClass001.A0N("Must provide either Remote Image Drawable resource or Remote Image Drawable URI");
        }
    }
}
