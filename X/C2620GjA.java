package X;

/* renamed from: X.GjA, reason: case insensitive filesystem */
/* loaded from: GjA.class */
public final class C2620GjA extends C04v {
    public final HDm A00;

    public C2620GjA(HDm hDm) {
        this.A00 = hDm;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2620GjA) && 11T.A0O(this.A00, ((C2620GjA) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GridState(layoutState=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
