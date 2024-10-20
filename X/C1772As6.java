package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.As6, reason: case insensitive filesystem */
/* loaded from: As6.class */
public final class C1772As6 extends C04v {
    public final long A00;
    public final ThreadKey A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Boolean A0A;
    public final Long A0B;

    public C1772As6(ThreadKey threadKey, Boolean bool, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        this.A01 = threadKey;
        this.A05 = str;
        this.A00 = j;
        this.A02 = num;
        this.A09 = str2;
        this.A08 = str3;
        this.A07 = str4;
        this.A06 = str5;
        this.A04 = str6;
        this.A0B = l;
        this.A0A = bool;
        this.A03 = l2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1772As6)) {
                return false;
            }
            C1772As6 c1772As6 = (C1772As6) obj;
            if (!11T.A0O(this.A01, c1772As6.A01) || !11T.A0O(this.A05, c1772As6.A05) || this.A00 != c1772As6.A00 || this.A02 != c1772As6.A02 || !11T.A0O(this.A09, c1772As6.A09) || !11T.A0O(this.A08, c1772As6.A08) || !11T.A0O(this.A07, c1772As6.A07) || !11T.A0O(this.A06, c1772As6.A06) || !11T.A0O(this.A04, c1772As6.A04) || !11T.A0O(this.A0B, c1772As6.A0B) || !11T.A0O(this.A0A, c1772As6.A0A) || !11T.A0O(this.A03, c1772As6.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A02 = AnonymousClass002.A02(this.A00, AnonymousClass002.A07(this.A05, 1BL.A03(this.A01)));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "PHOTO_AND_VIDEO";
                break;
            case 2:
                str = "FILE";
                break;
            case 3:
                str = "LINK";
                break;
            case 4:
                str = "LOCATION_QUERY_STATE";
                break;
            case 5:
                str = "PHOTO_AND_VIDEO_QUERY_STATE";
                break;
            default:
                str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                break;
        }
        return ((((((((((((((7zR.A07(str, intValue, A02) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A04)) * 31) + AnonymousClass001.A02(this.A0B)) * 31) + AnonymousClass001.A02(this.A0A)) * 31) + 4YU.A03(this.A03);
    }
}
