package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.List;

/* renamed from: X.2ns, reason: invalid class name */
/* loaded from: 2ns.class */
public final class C2ns extends C04v implements C2f1 {
    public static final AnonymousClass207 A02;
    public final List A00;
    public final List A01;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(C2ns.class, null);
    }

    public C2ns(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
        if (!list.isEmpty()) {
            return;
        }
        if (list2 == null || !(!list2.isEmpty())) {
            throw AnonymousClass001.A0N("userKeys and pictureUrls cannot both be empty");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2ns)) {
                return false;
            }
            C2ns c2ns = (C2ns) obj;
            if (!11T.A0O(this.A01, c2ns.A01) || !11T.A0O(this.A00, c2ns.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A022 = AnonymousClass001.A02(this.A01) * 31;
        List list = this.A00;
        if (list != null) {
            i = list.hashCode();
        }
        return A022 + i;
    }
}
