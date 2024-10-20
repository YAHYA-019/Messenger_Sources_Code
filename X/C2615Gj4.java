package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Gj4, reason: case insensitive filesystem */
/* loaded from: Gj4.class */
public final class C2615Gj4 extends C04v {
    public final long A00;
    public final Context A01;
    public final String A02;
    public final String A03;
    public final Function1 A04;
    public final boolean A05;

    public C2615Gj4(Context context, String str, String str2, Function1 function1, long j, boolean z) {
        1BK.A1K(context, 3, str2);
        11T.A0F(function1, 5);
        this.A00 = j;
        this.A03 = str;
        this.A01 = context;
        this.A02 = str2;
        this.A04 = function1;
        this.A05 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2615Gj4)) {
                return false;
            }
            C2615Gj4 c2615Gj4 = (C2615Gj4) obj;
            if (this.A00 != c2615Gj4.A00 || !11T.A0O(this.A03, c2615Gj4.A03) || !11T.A0O(this.A01, c2615Gj4.A01) || !11T.A0O(this.A02, c2615Gj4.A02) || !11T.A0O(this.A04, c2615Gj4.A04) || this.A05 != c2615Gj4.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A04, AnonymousClass002.A07(this.A02, AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A03, 7zQ.A02(this.A00))))) + AnonymousClass002.A00(this.A05 ? 1 : 0);
    }
}
