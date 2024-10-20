package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2o2, reason: invalid class name */
/* loaded from: 2o2.class */
public final class C2o2 extends C04v implements C2f1 {
    public static final AnonymousClass207 A01;
    public final int A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C2o2.class, null);
    }

    public C2o2(int i) {
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2o2) && this.A00 == ((C2o2) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }
}
