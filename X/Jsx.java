package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;

/* loaded from: Jsx.class */
public final class Jsx extends C04v {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final PushInfraMetaData A04;
    public final MIg A05;
    public final MIg A06;
    public final String A07;

    public Jsx(Context context, PushInfraMetaData pushInfraMetaData, MIg mIg, MIg mIg2, Integer num, String str, boolean z, boolean z2) {
        11T.A0F(pushInfraMetaData, 4);
        this.A03 = context;
        this.A06 = mIg;
        this.A05 = mIg2;
        this.A04 = pushInfraMetaData;
        this.A07 = str;
        this.A00 = num;
        this.A02 = z;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jsx)) {
                return false;
            }
            Jsx jsx = (Jsx) obj;
            if (!11T.A0O(this.A03, jsx.A03) || !11T.A0O(this.A06, jsx.A06) || !11T.A0O(this.A05, jsx.A05) || !11T.A0O(this.A04, jsx.A04) || !11T.A0O(this.A07, jsx.A07) || !11T.A0O(this.A00, jsx.A00) || this.A02 != jsx.A02 || this.A01 != jsx.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A07(this.A07, AnonymousClass002.A05(this.A04, (((1BL.A03(this.A03) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A05)) * 31)) + 4YU.A03(this.A00)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
