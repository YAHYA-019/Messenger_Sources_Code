package X;

/* loaded from: Exm.class */
public final class Exm {
    public final java.util.Map A00;

    public Exm(java.util.Map map) {
        11T.A0F(map, 1);
        this.A00 = map;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Exm) && 11T.A0O(this.A00, ((Exm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Snapshot(memorySnapshot=");
        java.util.Map map = this.A00;
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("Snapshot(snapshot=");
        A0k2.append(map);
        A0k.append((Object) AnonymousClass001.A0g(A0k2, ')'));
        return AnonymousClass001.A0g(A0k, ')');
    }
}
