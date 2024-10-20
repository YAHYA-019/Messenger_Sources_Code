package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.852, reason: invalid class name */
/* loaded from: 852.class */
public final class AnonymousClass852 extends C04v {
    public static final AnonymousClass207 A01;
    public final String A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(AnonymousClass852.class, null);
    }

    public AnonymousClass852() {
        this(null);
    }

    public AnonymousClass852(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass852) && 11T.A0O(this.A00, ((AnonymousClass852) obj).A00));
    }

    public int hashCode() {
        return 1BL.A05(this.A00);
    }
}
