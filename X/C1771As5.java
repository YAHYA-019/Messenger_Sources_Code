package X;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* renamed from: X.As5, reason: case insensitive filesystem */
/* loaded from: As5.class */
public final class C1771As5 extends C04v {
    public final int A00;
    public final int A01 = 2132347032;
    public final PendingIntent A02;
    public final 4vL A03;
    public final ThreadKey A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final Bitmap A0B;

    public C1771As5(PendingIntent pendingIntent, Bitmap bitmap, 4vL r304, ThreadKey threadKey, String str, String str2, String str3, List list, List list2, int i, boolean z) {
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = list;
        this.A0B = bitmap;
        this.A04 = threadKey;
        this.A00 = i;
        this.A08 = list2;
        this.A02 = pendingIntent;
        this.A03 = r304;
        this.A0A = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1771As5)) {
                return false;
            }
            C1771As5 c1771As5 = (C1771As5) obj;
            if (!11T.A0O(this.A05, c1771As5.A05) || !11T.A0O(this.A06, c1771As5.A06) || !11T.A0O(this.A07, c1771As5.A07) || !11T.A0O(this.A09, c1771As5.A09) || !11T.A0O(this.A0B, c1771As5.A0B) || !11T.A0O(this.A04, c1771As5.A04) || this.A00 != c1771As5.A00 || this.A01 != c1771As5.A01 || !11T.A0O(this.A08, c1771As5.A08) || !11T.A0O(this.A02, c1771As5.A02) || !11T.A0O(this.A03, c1771As5.A03) || this.A0A != c1771As5.A0A) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.A08, (((AnonymousClass002.A05(this.A04, (AnonymousClass002.A05(this.A09, AnonymousClass002.A07(this.A07, (4YV.A02(this.A05) + 1BL.A05(this.A06)) * 31)) + AnonymousClass001.A02(this.A0B)) * 31) + this.A00) * 31) + this.A01) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 4YU.A03(this.A03)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0);
    }
}
