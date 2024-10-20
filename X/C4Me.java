package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.4Me, reason: invalid class name */
/* loaded from: 4Me.class */
public final class C4Me extends C04v implements 4MT {
    public static final AnonymousClass207 A01;
    public final String A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C4Me.class, null);
    }

    public C4Me(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C4Me) && 11T.A0O(this.A00, ((C4Me) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
