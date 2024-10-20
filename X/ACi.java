package X;

/* loaded from: ACi.class */
public abstract class ACi implements Comparable, AXs {
    public final String A00;

    public ACi(String str) {
        11T.A0F(str, 1);
        this.A00 = str;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ACi aCi = (ACi) obj;
        11T.A0F(aCi, 0);
        return this.A00.compareTo(aCi.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ACi) {
            return 11T.A0O(this.A00, ((ACi) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
