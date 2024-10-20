package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.5ty, reason: invalid class name */
/* loaded from: 5ty.class */
public final class C5ty extends C04v {
    public static final AnonymousClass207 A0A;
    public final Long A00;
    public final Long A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Long A08;
    public final boolean A09;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A0A = new AnonymousClass207(C5ty.class, null);
    }

    public C5ty(Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A05 = str;
        this.A09 = z;
        this.A00 = l;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = l2;
        this.A07 = str4;
        this.A06 = str5;
        this.A08 = l3;
        this.A02 = l4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5ty)) {
                return false;
            }
            C5ty c5ty = (C5ty) obj;
            if (!11T.A0O(this.A05, c5ty.A05) || this.A09 != c5ty.A09 || !11T.A0O(this.A00, c5ty.A00) || !11T.A0O(this.A03, c5ty.A03) || !11T.A0O(this.A04, c5ty.A04) || !11T.A0O(this.A01, c5ty.A01) || !11T.A0O(this.A07, c5ty.A07) || !11T.A0O(this.A06, c5ty.A06) || !11T.A0O(this.A08, c5ty.A08) || !11T.A0O(this.A02, c5ty.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((1BL.A05(this.A05) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A06)) * 31) + AnonymousClass001.A02(this.A08)) * 31) + 4YU.A03(this.A02);
    }
}
