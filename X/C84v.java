package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.84v, reason: invalid class name */
/* loaded from: 84v.class */
public final class C84v extends C04v {
    public static final AnonymousClass207 A01;
    public final Integer A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C84v.class, null);
    }

    public C84v(Integer num) {
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C84v) && this.A00 == ((C84v) obj).A00);
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "UNCHECKED";
                break;
            case 2:
                str = "NONE";
                break;
            default:
                str = "CHECKED";
                break;
        }
        return 7zM.A04(str, intValue);
    }
}
