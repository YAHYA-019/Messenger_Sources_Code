package X;

import java.util.Arrays;

/* renamed from: X.Jli, reason: case insensitive filesystem */
/* loaded from: Jli.class */
public final class C3177Jli extends AbstractC3179Jlk {
    public static final Integer A02 = 0S2.A0j;
    public int A00;
    public boolean A01 = true;

    public C3177Jli(int i) {
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C3177Jli) {
            C3177Jli c3177Jli = (C3177Jli) obj;
            if (this.A00 == c3177Jli.A00 && this.A01 == c3177Jli.A01) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A01)});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Int(");
        A0k.append(this.A00);
        AnonymousClass001.A1H(A0k);
        A0k.append(this.A01);
        return AnonymousClass001.A0d(")", A0k);
    }
}
