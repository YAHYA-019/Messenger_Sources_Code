package X;

/* loaded from: Cpe.class */
public final class Cpe implements DK3 {
    public final String A00;

    public Cpe(String str) {
        this.A00 = str;
    }

    @Override // X.C4zn
    public String Aus() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DK3) {
            return 11T.A0O(this.A00, ((C4zn) obj).Aus());
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
