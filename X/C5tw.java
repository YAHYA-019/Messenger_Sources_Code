package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.5tw, reason: invalid class name */
/* loaded from: 5tw.class */
public final class C5tw extends C04v {
    public static final AnonymousClass207 A01;
    public static final C5tw A02;
    public final long A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C5tw.class, null);
        A02 = new C5tw(-1);
    }

    public C5tw(long j) {
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5tw) && this.A00 == ((C5tw) obj).A00);
    }

    public int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }
}
