package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.As8, reason: case insensitive filesystem */
/* loaded from: As8.class */
public final class C1774As8 extends C04v {
    public final boolean A00;
    public final boolean A01;

    public C1774As8(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1774As8)) {
                return false;
            }
            C1774As8 c1774As8 = (C1774As8) obj;
            if (this.A01 != c1774As8.A01 || this.A00 != c1774As8.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RestrictData(isRestricted=");
        A0k.append(this.A01);
        A0k.append(7zK.A00(ActionId.MESSENGER_QUEUE_CREATION));
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }
}
