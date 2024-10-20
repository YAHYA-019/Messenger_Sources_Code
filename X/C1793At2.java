package X;

import com.facebook.messaging.groups.members.model.EmptyStateDecorImage;

/* renamed from: X.At2, reason: case insensitive filesystem */
/* loaded from: At2.class */
public final class C1793At2 extends C04v implements DEE {
    public final int A00;
    public final int A01;
    public final EmptyStateDecorImage A02;
    public final Integer A03;
    public final C00m A04;

    public C1793At2(EmptyStateDecorImage emptyStateDecorImage, Integer num, C00m c00m, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = num;
        this.A04 = c00m;
        this.A02 = emptyStateDecorImage;
        if (num != null && c00m == null) {
            throw 1BK.A0g();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1793At2)) {
                return false;
            }
            C1793At2 c1793At2 = (C1793At2) obj;
            if (this.A01 != c1793At2.A01 || this.A00 != c1793At2.A00 || !11T.A0O(this.A03, c1793At2.A03) || !11T.A0O(this.A04, c1793At2.A04) || !11T.A0O(this.A02, c1793At2.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((this.A01 * 31) + this.A00) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A02)) * 31;
    }
}
