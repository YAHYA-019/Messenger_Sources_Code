package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2o6, reason: invalid class name */
/* loaded from: 2o6.class */
public final class C2o6 extends C04v implements C2f1 {
    public static final AnonymousClass207 A01;
    public final long A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C2o6.class, null);
    }

    public C2o6(long j) {
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2o6) && this.A00 == ((C2o6) obj).A00);
    }

    public int hashCode() {
        return 1BL.A01(this.A00);
    }
}
