package X;

import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.AsI, reason: case insensitive filesystem */
/* loaded from: AsI.class */
public final class C1784AsI extends C04v {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public C1784AsI(int i) {
        this.A05 = i;
        this.A05 = 1;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A05 = 1;
        this.A02 = A0s;
        this.A00 = 0;
        this.A03 = new Integer[]{0, 0, 0, 0};
        this.A01 = new String[]{"", "", "", ""};
        this.A04 = "";
    }

    public C1784AsI(CommunityExtraData communityExtraData, 1F9 r303, Long l, String str, int i) {
        this.A05 = 0;
        this.A03 = l;
        this.A01 = communityExtraData;
        this.A04 = str;
        this.A00 = i;
        this.A02 = r303;
    }

    public boolean equals(Object obj) {
        switch (this.A05) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1784AsI)) {
                    return false;
                }
                C1784AsI c1784AsI = (C1784AsI) obj;
                return c1784AsI.A05 == 0 && 11T.A0O(this.A03, c1784AsI.A03) && 11T.A0O(this.A01, c1784AsI.A01) && 11T.A0O(this.A04, c1784AsI.A04) && this.A00 == c1784AsI.A00 && this.A02 == c1784AsI.A02;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1784AsI)) {
                    return false;
                }
                C1784AsI c1784AsI2 = (C1784AsI) obj;
                return c1784AsI2.A05 == 1 && 11T.A0O(this.A02, c1784AsI2.A02) && this.A00 == c1784AsI2.A00 && 11T.A0O(this.A03, c1784AsI2.A03) && 11T.A0O(this.A01, c1784AsI2.A01) && 11T.A0O(this.A04, c1784AsI2.A04);
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        int A03;
        int hashCode;
        switch (this.A05) {
            case 0:
                A03 = ((((((AnonymousClass001.A02(this.A03) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 7zN.A05(this.A04)) * 31) + this.A00) * 31;
                hashCode = this.A02.hashCode();
                break;
            case 1:
                A03 = (((((1BL.A03(this.A02) + this.A00) * 31) + Arrays.hashCode((Object[]) this.A03)) * 31) + Arrays.hashCode((Object[]) this.A01)) * 31;
                hashCode = this.A04.hashCode();
                break;
            default:
                return super.hashCode();
        }
        return A03 + hashCode;
    }
}
