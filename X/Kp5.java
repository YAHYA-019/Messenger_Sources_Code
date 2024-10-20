package X;

/* loaded from: Kp5.class */
public final class Kp5 {
    public final C00m A00;
    public final C2s8 A01;

    public Kp5(C00m c00m, C2s8 c2s8) {
        this.A00 = c00m;
        this.A01 = c2s8;
    }

    public String toString() {
        C2s8 c2s8 = this.A01;
        c2s8.getContext().get(LzH.A00);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Request@");
        String num = Integer.toString(hashCode(), 16);
        11T.A0A(num);
        A0k.append(num);
        A0k.append("(");
        A0k.append("currentBounds()=");
        A0k.append(this.A00.invoke());
        A0k.append(", continuation=");
        return AnonymousClass002.A0K(c2s8, A0k);
    }
}
