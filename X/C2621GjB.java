package X;

import com.facebook.rtc.views.omnigrid.GridItemType;

/* renamed from: X.GjB, reason: case insensitive filesystem */
/* loaded from: GjB.class */
public final class C2621GjB extends C04v {
    public final int A00;
    public final long A01;
    public final GridItemType A02;
    public final Integer A03;

    public C2621GjB(GridItemType gridItemType, Integer num, int i, long j) {
        this.A01 = j;
        this.A02 = gridItemType;
        this.A03 = num;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2621GjB)) {
                return false;
            }
            C2621GjB c2621GjB = (C2621GjB) obj;
            if (this.A01 != c2621GjB.A01 || this.A02 != c2621GjB.A02 || this.A03 != c2621GjB.A03 || this.A00 != c2621GjB.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = AnonymousClass002.A05(this.A02, 7zQ.A02(this.A01));
        int intValue = this.A03.intValue();
        return (7zR.A07(1 != intValue ? "NONE" : "CAMERA", intValue, A05) + this.A00) * 31 * 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RtcItemViewModel(id=");
        A0k.append(this.A01);
        A0k.append(", itemType=");
        A0k.append(this.A02);
        A0k.append(", streamType=");
        Integer num = this.A03;
        A0k.append(num != null ? 1 - num.intValue() != 0 ? "NONE" : "CAMERA" : "null");
        A0k.append(", viewType=");
        A0k.append(this.A00);
        A0k.append(", priority=");
        A0k.append(0);
        A0k.append(", extras=");
        return AnonymousClass002.A0K(null, A0k);
    }
}
