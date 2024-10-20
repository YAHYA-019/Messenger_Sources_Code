package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;

/* loaded from: DqK.class */
public final class DqK extends C04v {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public DqK(Bitmap bitmap, Uri uri, 2EU r304, String str, String str2, String str3, String str4) {
        7zP.A1L(str, 1, str4);
        this.A05 = str;
        this.A01 = bitmap;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = uri;
        this.A04 = str4;
        this.A02 = r304;
    }

    public DqK(IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension) {
        this(iABAdsBwIntegrationExtension.A01, iABAdsBwIntegrationExtension.A02, iABAdsBwIntegrationExtension.A03, iABAdsBwIntegrationExtension.A07, iABAdsBwIntegrationExtension.A05, iABAdsBwIntegrationExtension.A06, iABAdsBwIntegrationExtension.A08);
    }

    public DqK(Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        1BL.A1F(num, num2);
        this.A01 = num;
        this.A03 = num2;
        this.A06 = str;
        this.A02 = l;
        this.A04 = str2;
        this.A05 = str3;
        this.A07 = str4;
    }

    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DqK)) {
                return false;
            }
            DqK dqK = (DqK) obj;
            if (dqK.A00 != 1 || !11T.A0O(this.A05, dqK.A05) || !11T.A0O(this.A01, dqK.A01) || !11T.A0O(this.A06, dqK.A06) || !11T.A0O(this.A07, dqK.A07) || !11T.A0O(this.A03, dqK.A03) || !11T.A0O(this.A04, dqK.A04)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = dqK.A02;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DqK)) {
                return false;
            }
            DqK dqK2 = (DqK) obj;
            if (dqK2.A00 != 0 || this.A01 != dqK2.A01 || this.A03 != dqK2.A03 || !11T.A0O(this.A06, dqK2.A06) || !11T.A0O(this.A02, dqK2.A02) || !11T.A0O(this.A04, dqK2.A04) || !11T.A0O(this.A05, dqK2.A05)) {
                return false;
            }
            obj2 = this.A07;
            obj3 = dqK2.A07;
        }
        return 11T.A0O(obj2, obj3);
    }

    public int hashCode() {
        int A03;
        int A05;
        if (this.A00 != 0) {
            A05 = AnonymousClass002.A07(this.A04, AnonymousClass002.A05(this.A03, AnonymousClass002.A07(this.A07, AnonymousClass002.A07(this.A06, AnonymousClass002.A05(this.A01, 4YV.A02(this.A05))))));
            A03 = AnonymousClass001.A02(this.A02);
        } else {
            Integer num = (Integer) this.A01;
            int A052 = C3o5.A05(num, EVz.A00(num));
            Integer num2 = (Integer) this.A03;
            A03 = (((((((7zV.A03(num2, EW0.A00(num2), A052) + 1BL.A05(this.A06)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A05)) * 31;
            A05 = 7zN.A05(this.A07);
        }
        return A03 + A05;
    }

    public String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BwIAdsInfo(bwIType=");
        Integer num = (Integer) this.A01;
        A0k.append(num != null ? EVz.A00(num) : "null");
        A0k.append(", partnerType=");
        Integer num2 = (Integer) this.A03;
        A0k.append(num2 != null ? EW0.A00(num2) : "null");
        A0k.append(", initialUrl=");
        A0k.append(this.A06);
        A0k.append(", oauthIntegrationId=");
        A0k.append(this.A02);
        A0k.append(", apiKey=");
        A0k.append(this.A04);
        A0k.append(", bauProductUrl=");
        A0k.append(this.A05);
        A0k.append(", pageName=");
        return DKH.A0o(this.A07, A0k);
    }
}
