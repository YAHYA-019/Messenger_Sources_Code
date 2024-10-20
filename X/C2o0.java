package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2o0, reason: invalid class name */
/* loaded from: 2o0.class */
public final class C2o0 extends C04v implements C2f1 {
    public static final AnonymousClass207 A01;
    public final long A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C2o0.class, null);
    }

    public C2o0(long j) {
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2o0) && this.A00 == ((C2o0) obj).A00);
    }

    public int hashCode() {
        return 1BL.A01(this.A00);
    }
}
