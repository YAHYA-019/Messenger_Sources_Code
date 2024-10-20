package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.At4, reason: case insensitive filesystem */
/* loaded from: At4.class */
public final class C1795At4 extends C04v implements 4MT {
    public static final AnonymousClass207 A04;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A04 = new AnonymousClass207(C1795At4.class, null);
    }

    public C1795At4(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1795At4)) {
                return false;
            }
            C1795At4 c1795At4 = (C1795At4) obj;
            if (!11T.A0O(this.A00, c1795At4.A00) || !11T.A0O(this.A01, c1795At4.A01) || !11T.A0O(this.A03, c1795At4.A03) || !11T.A0O(this.A02, c1795At4.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A02, AnonymousClass002.A07(this.A03, (4YV.A02(this.A00) + 1BL.A05(this.A01)) * 31));
    }
}
