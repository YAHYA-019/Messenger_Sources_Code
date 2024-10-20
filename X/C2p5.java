package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2p5, reason: invalid class name */
/* loaded from: 2p5.class */
public final class C2p5 extends C04v implements C2f1 {
    public static final AnonymousClass207 A01;
    public final Integer A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C2p5.class, null);
    }

    public C2p5(Integer num) {
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2p5) && this.A00 == ((C2p5) obj).A00);
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "READ_ALL_UNBOLD";
                break;
            case 2:
                str = "UNREAD";
                break;
            case 3:
                str = "UNREAD_ALL_BOLD";
                break;
            case 4:
                str = "READ_ALL_UNBOLD_CUSTOM";
                break;
            default:
                str = "READ";
                break;
        }
        return str.hashCode() + intValue;
    }
}
