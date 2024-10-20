package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2no, reason: invalid class name */
/* loaded from: 2no.class */
public final class C2no extends C04v implements C2f1 {
    public static final AnonymousClass207 A03;
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A03 = new AnonymousClass207(C2no.class, null);
    }

    public C2no() {
        this(false, false, false);
        throw 0Q8.createAndThrow();
    }

    public C2no(boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A00 = z2;
        this.A01 = z3;
        if (!z && !z2 && !z3) {
            throw AnonymousClass001.A0N("Invalid metadata if nothing was muted.");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2no)) {
                return false;
            }
            C2no c2no = (C2no) obj;
            if (this.A02 != c2no.A02 || this.A00 != c2no.A00 || this.A01 != c2no.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass002.A00(this.A02 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
