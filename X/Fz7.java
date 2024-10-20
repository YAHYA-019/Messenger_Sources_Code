package X;

import com.google.common.base.Objects;
import java.text.CollationKey;
import java.text.Collator;

/* loaded from: Fz7.class */
public class Fz7 implements Comparable {
    public static final Collator A04 = Collator.getInstance();
    public final String A00;
    public final String A01;
    public final String A02;
    public final CollationKey A03 = A04.getCollationKey(toString());

    public Fz7(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A03.compareTo(((Fz7) obj).A03);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.A03, ((Fz7) obj).A03);
    }

    public int hashCode() {
        return DKD.A04(this.A03);
    }

    public String toString() {
        return 0Pz.A0v(this.A01, " (", this.A00, ")");
    }
}
