package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2nm, reason: invalid class name */
/* loaded from: 2nm.class */
public final class C2nm extends C04v implements C2f1 {
    public static final AnonymousClass207 A01;
    public final String A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C2nm.class, null);
    }

    public C2nm(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2nm) && 11T.A0O(this.A00, ((C2nm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
