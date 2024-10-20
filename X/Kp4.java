package X;

/* loaded from: Kp4.class */
public final class Kp4 {
    public final LNu A00;
    public final Integer A01;

    public Kp4(LNu lNu, Integer num) {
        this.A00 = lNu;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AnimationResult(endReason=");
        A0k.append(this.A01.intValue() != 0 ? "Finished" : "BoundReached");
        A0k.append(", endState=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
