package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GP4.class */
public final class GP4 extends C04v {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public GP4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, long j) {
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A03 = str7;
        this.A04 = str8;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.analytics.perf.efficiency.connectiontimeline.MessagingConnectionTimelineLogger.ConnectionEventRecord");
            GP4 gp4 = (GP4) obj;
            if (this.A00 == gp4.A00 && this.A01 == gp4.A01 && 11T.A0O(this.A08, gp4.A08) && 11T.A0O(this.A07, gp4.A07) && 11T.A0O(this.A09, gp4.A09) && 11T.A0O(this.A05, gp4.A05) && 11T.A0O(this.A06, gp4.A06) && 11T.A0O(this.A03, gp4.A03) && 11T.A0O(this.A04, gp4.A04)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((((((((((((((((this.A00 * 31) + this.A01) * 31) + 1BL.A06(this.A08)) * 31) + 1BL.A06(this.A07)) * 31) + 1BL.A06(this.A09)) * 31) + 1BL.A06(this.A0A)) * 31) + 1BL.A06(this.A05)) * 31) + 1BL.A06(this.A06)) * 31) + 1BL.A06(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return A06 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(HHl.A00(this.A02));
        A0k.append(" ");
        int i = this.A00;
        A0k.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : "MOBILE" : "DGW" : "CHATD" : "MQTT");
        A0k.append(" ");
        int i2 = this.A01;
        A0k.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : "DISCONNECTED" : "CONNECTED" : "CONNECTING");
        String str = this.A08;
        if (str != null) {
            A0k.append(" source:");
            A0k.append(str);
        }
        String str2 = this.A07;
        if (str2 != null) {
            A0k.append(" reason:");
            A0k.append(str2);
        }
        String str3 = this.A09;
        if (str3 != null) {
            A0k.append(" winnerIp:");
            A0k.append(str3);
        }
        String str4 = this.A0A;
        if (str4 != null) {
            A0k.append(" winnerPort:");
            A0k.append(str4);
        }
        String str5 = this.A05;
        if (str5 != null) {
            A0k.append(" dns:");
            A0k.append(str5);
        }
        String str6 = this.A06;
        if (str6 != null) {
            A0k.append(" ips:[");
            A0k.append(str6);
            A0k.append("]");
        }
        String str7 = this.A03;
        if (str7 != null) {
            A0k.append(" connect_fail:");
            A0k.append(str7);
        }
        String str8 = this.A04;
        if (str8 != null) {
            A0k.append(" disconnect_reason:");
            A0k.append(str8);
        }
        return 11T.A02(A0k);
    }
}
