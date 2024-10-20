package X;

import android.animation.StateListAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import java.util.List;

/* renamed from: X.28s, reason: invalid class name */
/* loaded from: 28s.class */
public final class C28s {
    public static final C28t A0f = new Object();
    public float A01;
    public float A02;
    public float A03;
    public float A05;
    public int A07;
    public int A08;
    public int A0C;
    public StateListAnimator A0E;
    public Paint A0F;
    public Drawable A0G;
    public Drawable A0H;
    public SparseArray A0I;
    public ViewOutlineProvider A0J;
    public 1Im A0K;
    public 1Im A0L;
    public 1Im A0M;
    public 1Im A0N;
    public 1Im A0O;
    public 3OV A0P;
    public CharSequence A0Q;
    public Object A0R;
    public String A0T;
    public String A0U;
    public List A0V;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public String A0S = "";
    public int A0D = -1;
    public int A0A = 2;
    public int A09 = -1;
    public float A04 = 1.0f;
    public float A00 = 1.0f;
    public boolean A0W = true;
    public int A06 = -16777216;
    public int A0B = -16777216;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C28s)) {
                return false;
            }
            C28s c28s = (C28s) obj;
            if (this.A0c != c28s.A0c || !11T.A0O(this.A0S, c28s.A0S) || this.A08 != c28s.A08 || this.A0Y != c28s.A0Y || this.A07 != c28s.A07 || this.A00 != c28s.A00 || !C28q.A01(this.A0K, c28s.A0K) || this.A0X != c28s.A0X || this.A0W != c28s.A0W || !11T.A0O(this.A0Q, c28s.A0Q) || !11T.A0O(this.A0T, c28s.A0T) || this.A0a != c28s.A0a || !C28q.A01(this.A0L, c28s.A0L) || this.A0b != c28s.A0b || !C28q.A01(this.A0M, c28s.A0M) || !C28q.A01(this.A0N, c28s.A0N) || !11T.A0O(this.A0J, c28s.A0J) || this.A01 != c28s.A01 || this.A02 != c28s.A02 || this.A03 != c28s.A03 || this.A04 != c28s.A04 || this.A0e != c28s.A0e || this.A0d != c28s.A0d || this.A0Z != c28s.A0Z || this.A05 != c28s.A05 || this.A06 != c28s.A06 || this.A0B != c28s.A0B || !C28q.A01(this.A0O, c28s.A0O) || this.A0D != c28s.A0D || !11T.A0O(this.A0R, c28s.A0R) || !C28q.A00(this.A0I, c28s.A0I) || !C4Da.A00(this.A0G, c28s.A0G) || !C4Da.A00(this.A0H, c28s.A0H) || !new C1tr(this.A0A).equals(new C1tr(c28s.A0A)) || this.A0C != c28s.A0C || !11T.A0O(this.A0E, c28s.A0E) || !11T.A0O(this.A0U, c28s.A0U) || this.A09 != c28s.A09 || !11T.A0O(this.A0F, c28s.A0F)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A00 = (((1BL.A00((((((((((((((1BL.A00(1BL.A00(1BL.A00(1BL.A00(1BL.A00((((((((((((((((((((((((((((((((((((((((((AnonymousClass002.A07(this.A0S, AnonymousClass002.A00(this.A0c ? 1 : 0) * 31) + this.A08) * 31) + AnonymousClass002.A00(this.A0Y ? 1 : 0)) * 31) + AnonymousClass002.A04(this.A0Q)) * 31) + this.A0D) * 31) + AnonymousClass002.A04(this.A0R)) * 31) + 1BL.A06(this.A0U)) * 31) + AnonymousClass002.A04(this.A0I)) * 31) + AnonymousClass002.A04(this.A0J)) * 31) + AnonymousClass002.A04(this.A0K)) * 31) + AnonymousClass002.A04(this.A0N)) * 31) + AnonymousClass002.A04(this.A0L)) * 31) + AnonymousClass002.A04(this.A0O)) * 31) + AnonymousClass002.A04(this.A0M)) * 31) + AnonymousClass002.A04(this.A0G)) * 31) + AnonymousClass002.A04(this.A0H)) * 31) + this.A0A) * 31) + AnonymousClass002.A04(this.A0E)) * 31) + this.A0C) * 31) + this.A09) * 31) + AnonymousClass002.A04(this.A0F)) * 31) + this.A07) * 31, this.A04), this.A00), this.A01), this.A02), this.A03) + AnonymousClass002.A00(this.A0W ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0X ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0b ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0Z ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0a ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0e ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0d ? 1 : 0)) * 31, this.A05) + this.A06) * 31) + this.A0B) * 31;
        String str = this.A0T;
        if (str != null) {
            i = str.hashCode();
        }
        return A00 + i;
    }
}
