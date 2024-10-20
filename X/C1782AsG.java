package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.AsG, reason: case insensitive filesystem */
/* loaded from: AsG.class */
public final class C1782AsG extends C04v {
    public static final AnonymousClass207 A02;
    public final Long A00;
    public final boolean A01;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(C1782AsG.class, null);
    }

    public C1782AsG(Long l, boolean z) {
        this.A01 = z;
        this.A00 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1782AsG)) {
                return false;
            }
            C1782AsG c1782AsG = (C1782AsG) obj;
            if (this.A01 != c1782AsG.A01 || !11T.A0O(this.A00, c1782AsG.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass001.A02(this.A00);
    }
}
