package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: L3u.class */
public final class L3u {
    public final long A00;
    public static final long A01 = 4 << 32;
    public static final long A06 = 19 << 32;
    public static final long A03 = 20 << 32;
    public static final long A04 = 21 << 32;
    public static final long A05 = 22 << 32;
    public static final long A02 = 23 << 32;
    public static final long A0C = 61 << 32;
    public static final long A07 = 66 << 32;
    public static final long A08 = ActionId.NEW_START_FOUND << 32;
    public static final long A0B = 92 << 32;
    public static final long A0A = 93 << 32;
    public static final long A09 = 160 << 32;

    public boolean equals(Object obj) {
        long j = this.A00;
        boolean z = false;
        if ((obj instanceof L3u) && j == ((L3u) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return 1BL.A01(this.A00);
    }

    public String toString() {
        return AnonymousClass001.A0h(AnonymousClass001.A0n("Key code: "), this.A00);
    }
}
