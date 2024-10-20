package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.AsE, reason: case insensitive filesystem */
/* loaded from: AsE.class */
public final class C1780AsE extends C04v {
    public static final AnonymousClass207 A01;
    public final BLj A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C1780AsE.class, null);
    }

    public C1780AsE(BLj bLj) {
        this.A00 = bLj;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1780AsE) && this.A00 == ((C1780AsE) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
