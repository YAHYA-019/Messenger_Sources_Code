package X;

import java.util.Date;

/* renamed from: X.Ars, reason: case insensitive filesystem */
/* loaded from: Ars.class */
public final class C1758Ars extends C04v {
    public final Date A00;
    public final boolean A01;

    public C1758Ars(Date date, boolean z) {
        this.A01 = z;
        this.A00 = date;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1758Ars)) {
                return false;
            }
            C1758Ars c1758Ars = (C1758Ars) obj;
            if (this.A01 != c1758Ars.A01 || !11T.A0O(this.A00, c1758Ars.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass001.A02(this.A00);
    }
}
