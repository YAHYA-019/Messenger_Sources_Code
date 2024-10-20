package X;

import java.util.List;

/* loaded from: F9z.class */
public final class F9z {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public F9z() {
        this(C0ty.A00, true, true, true);
    }

    public F9z(List list, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9z)) {
                return false;
            }
            F9z f9z = (F9z) obj;
            if (this.A03 != f9z.A03 || this.A02 != f9z.A02 || this.A01 != f9z.A01 || !11T.A0O(this.A00, f9z.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, ((((AnonymousClass002.A00(this.A03 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("WritePromptsState(isVisible=");
        A0k.append(this.A03);
        A0k.append(", isLoading=");
        A0k.append(this.A02);
        A0k.append(", isDisabled=");
        A0k.append(this.A01);
        A0k.append(", prompts=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
