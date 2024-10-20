package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.7f8, reason: invalid class name */
/* loaded from: 7f8.class */
public final class C7f8 extends C04v {
    public static final AnonymousClass207 A01;
    public final String A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C7f8.class, null);
    }

    public C7f8() {
        this(null);
    }

    public C7f8(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7f8) && 11T.A0O(this.A00, ((C7f8) obj).A00));
    }

    public int hashCode() {
        return 1BL.A05(this.A00);
    }
}
