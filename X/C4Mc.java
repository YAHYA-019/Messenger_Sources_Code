package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.4Mc, reason: invalid class name */
/* loaded from: 4Mc.class */
public final class C4Mc extends C04v implements 4MT {
    public static final AnonymousClass207 A06;
    public final long A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A06 = new AnonymousClass207(C4Mc.class, null);
    }

    public C4Mc(Integer num, Integer num2, Long l, String str, String str2, long j) {
        11T.A0F(str, 3);
        this.A02 = num;
        this.A00 = j;
        this.A05 = str;
        this.A03 = l;
        this.A04 = str2;
        this.A01 = num2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4Mc)) {
                return false;
            }
            C4Mc c4Mc = (C4Mc) obj;
            if (this.A02 != c4Mc.A02 || this.A00 != c4Mc.A00 || !11T.A0O(this.A05, c4Mc.A05) || !11T.A0O(this.A03, c4Mc.A03) || !11T.A0O(this.A04, c4Mc.A04) || this.A01 != c4Mc.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        Integer num = this.A02;
        int i = 0;
        int A07 = (((AnonymousClass002.A07(this.A05, AnonymousClass002.A02(this.A00, C3o5.A05(num, BSy.A00(num)))) + AnonymousClass001.A02(this.A03)) * 31) + 1BL.A05(this.A04)) * 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            int intValue = num2.intValue();
            switch (intValue) {
                case 1:
                    str = "PARTICIPATION_REQUEST_REQUIRED";
                    break;
                case 2:
                    str = "PARTICIPATION_REQUEST_PENDING";
                    break;
                default:
                    str = "CAN_PARTICIPATE";
                    break;
            }
            i = str.hashCode() + intValue;
        }
        return A07 + i;
    }
}
