package X;

/* loaded from: Kr9.class */
public final class Kr9 {
    public final int A00;

    public Kr9(boolean z) {
        this.A00 = z ? 262144 : 262152;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Kr9) && this.A00 == ((Kr9) obj).A00);
    }

    public int hashCode() {
        return (((((((((this.A00 * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1237;
    }
}
