package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2o4, reason: invalid class name */
/* loaded from: 2o4.class */
public final class C2o4 extends C04v implements C2f1 {
    public static final AnonymousClass207 A01;
    public final String A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C2o4.class, null);
    }

    public C2o4(String str) {
        11T.A0F(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2o4) && 11T.A0O(this.A00, ((C2o4) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
