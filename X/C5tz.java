package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.5tz, reason: invalid class name */
/* loaded from: 5tz.class */
public final class C5tz extends C04v {
    public static final AnonymousClass207 A01;
    public final int A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C5tz.class, null);
    }

    public C5tz(int i) {
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5tz) && this.A00 == ((C5tz) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }
}
