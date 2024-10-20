package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.At3, reason: case insensitive filesystem */
/* loaded from: At3.class */
public final class C1794At3 extends C04v implements 4MT {
    public static final AnonymousClass207 A02;
    public final String A00;
    public final String A01;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(C1794At3.class, null);
    }

    public C1794At3(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1794At3)) {
                return false;
            }
            C1794At3 c1794At3 = (C1794At3) obj;
            if (!11T.A0O(this.A00, c1794At3.A00) || !11T.A0O(this.A01, c1794At3.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }
}
