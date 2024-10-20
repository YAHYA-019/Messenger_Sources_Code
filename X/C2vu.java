package X;

import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.List;

/* renamed from: X.2vu, reason: invalid class name */
/* loaded from: 2vu.class */
public final class C2vu {
    public final ZonedValue A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;

    public C2vu(ZonedValue zonedValue, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        this.A02 = num;
        this.A06 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A01 = num2;
        this.A0A = str4;
        this.A03 = l;
        this.A05 = str5;
        this.A0C = list;
        this.A07 = str6;
        this.A0B = list2;
        this.A04 = str7;
        this.A00 = zonedValue;
    }

    public final C2vu A00(ZonePolicy zonePolicy) {
        String str;
        ZonedValue zonedValue = this.A00;
        if (zonedValue == null || zonePolicy == null) {
            return this;
        }
        try {
            Integer num = 0S2.A02;
            String str2 = (String) C5ua.A01(new 3bV(this, zonedValue, 0), zonePolicy, num);
            try {
                str = (String) C5ua.A01(new 3bV(this, zonedValue, 1), zonePolicy, num);
            } catch (C48s unused) {
                str = null;
            }
            if (str2 != null || str != null) {
                Integer num2 = this.A02;
                String str3 = this.A09;
                Integer num3 = this.A01;
                String str4 = this.A0A;
                return new C2vu(zonedValue, num2, num3, this.A03, str2, str, str3, str4, this.A05, this.A07, str4, this.A0C, this.A0B);
            }
        } catch (C48s unused2) {
        }
        return this;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            C2vu c2vu = (C2vu) obj;
            String str = this.A06;
            String str2 = c2vu.A06;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            String str3 = this.A08;
            String str4 = c2vu.A08;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            Integer num = this.A01;
            Integer num2 = c2vu.A01;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
            ZonedValue zonedValue = this.A00;
            ZonedValue zonedValue2 = c2vu.A00;
            if (zonedValue != null) {
                return zonedValue.equals(zonedValue2);
            }
            if (zonedValue2 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((1BL.A06(this.A06) * 31) + 1BL.A06(this.A08)) * 31;
        Integer num = this.A01;
        int intValue = (A06 + (num != null ? num.intValue() : 0)) * 31;
        ZonedValue zonedValue = this.A00;
        if (zonedValue != null) {
            i = zonedValue.hashCode();
        }
        return intValue + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributionSurfaceScope{mClassName='");
        sb.append(this.A06);
        sb.append("', mModule='");
        sb.append(this.A08);
        sb.append("', mFragmentId=");
        sb.append(this.A01);
        sb.append(", mTapPoint='");
        sb.append(this.A09);
        sb.append("', mTimestamp='");
        sb.append(this.A0A);
        sb.append("', mBookmarkId=");
        sb.append(this.A03);
        sb.append(", mBookmarkTypeName='");
        sb.append(this.A05);
        sb.append("', mPrivateNavEventData='");
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        sb.append(z);
        sb.append("'}");
        return sb.toString();
    }
}
