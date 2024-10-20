package X;

/* loaded from: Ey7.class */
public final class Ey7 {
    public final Object A00;
    public final Runnable A01;

    public Ey7(Runnable runnable, Object obj) {
        this.A00 = obj;
        this.A01 = runnable;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey7)) {
                return false;
            }
            Ey7 ey7 = (Ey7) obj;
            if (!11T.A0O(this.A00, ey7.A00) || !11T.A0O(this.A01, ey7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SubscribeResult(snapshot=");
        A0k.append(this.A00);
        A0k.append(", cancelToken=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
