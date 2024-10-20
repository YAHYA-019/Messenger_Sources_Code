package X;

/* loaded from: Io5.class */
public final class Io5 implements Comparable {
    public int A00;
    public int A01;
    public JNq A02;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Io5 io5 = (Io5) obj;
        11T.A0F(io5, 0);
        int i = -1;
        if (11T.A0O(this.A02, io5.A02)) {
            i = 0;
        } else {
            int i2 = this.A01;
            int i3 = io5.A01;
            if (i2 != i3) {
                return i2 > i3 ? -1 : 1;
            }
            if (this.A00 < io5.A00) {
                return 1;
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Io5) {
            return 11T.A0O(this.A02, ((Io5) obj).A02);
        }
        return false;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }
}
