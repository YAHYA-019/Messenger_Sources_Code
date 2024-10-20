package X;

/* loaded from: Eye.class */
public final class Eye {
    public final int A00;
    public final int A01;
    public final DLQ A02;

    public Eye(DLQ dlq, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = dlq;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eye)) {
                return false;
            }
            Eye eye = (Eye) obj;
            if (this.A01 != eye.A01 || this.A00 != eye.A00 || !11T.A0O(this.A02, eye.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LayoutSignalArgs(widthSpec=");
        A0k.append(this.A01);
        A0k.append(", heightSpec=");
        A0k.append(this.A00);
        A0k.append(", model=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
