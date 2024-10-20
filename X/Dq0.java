package X;

/* loaded from: Dq0.class */
public final class Dq0 extends C04v {
    public boolean A00;
    public final String A01;

    public Dq0(String str) {
        11T.A0F(str, 1);
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Dq0) && 11T.A0O(this.A01, ((Dq0) obj).A01));
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
