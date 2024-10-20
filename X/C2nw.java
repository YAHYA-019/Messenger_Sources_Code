package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2nw, reason: invalid class name */
/* loaded from: 2nw.class */
public final class C2nw extends C04v implements C2f1 {
    public static final AnonymousClass207 A03;
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A03 = new AnonymousClass207(C2nw.class, null);
    }

    public C2nw(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2nw)) {
                return false;
            }
            C2nw c2nw = (C2nw) obj;
            if (!11T.A0O(this.A00, c2nw.A00) || this.A01 != c2nw.A01 || this.A02 != c2nw.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00.hashCode() * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }
}
