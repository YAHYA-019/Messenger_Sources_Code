package X;

import com.facebook.user.model.UserKey;

/* renamed from: X.515, reason: invalid class name */
/* loaded from: 515.class */
public final class AnonymousClass515 {
    public final UserKey A00;
    public final Long A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass515(UserKey userKey, Long l, boolean z, boolean z2) {
        this.A00 = userKey;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass515 anonymousClass515 = (AnonymousClass515) obj;
            if (this.A03 != anonymousClass515.A03 || !this.A00.equals(anonymousClass515.A00) || this.A02 != anonymousClass515.A02) {
                return false;
            }
            Long l = this.A01;
            Long l2 = anonymousClass515.A01;
            if (l != null) {
                if (!l.equals(l2)) {
                    return false;
                }
            } else if (l2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (((1BL.A03(this.A00) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31;
        Long l = this.A01;
        if (l != null) {
            i = l.hashCode();
        }
        return A03 + i;
    }
}
