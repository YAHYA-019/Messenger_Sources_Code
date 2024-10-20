package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.6vj, reason: invalid class name */
/* loaded from: 6vj.class */
public final class C6vj extends C04v implements C7xu {
    public static final C6vj A01;
    public static final AnonymousClass207 A02;
    public final Integer A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(C6vj.class, null);
        A01 = new C6vj(null);
    }

    public C6vj() {
        this(null);
    }

    public C6vj(Integer num) {
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6vj) && 11T.A0O(this.A00, ((C6vj) obj).A00));
    }

    public int hashCode() {
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
