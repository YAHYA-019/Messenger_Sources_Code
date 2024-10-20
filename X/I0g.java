package X;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Set;

/* loaded from: I0g.class */
public final class I0g {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public Point A0E;
    public Rect A0F;
    public C1u3 A0G;
    public HDa A0H;
    public C2p1 A0I;
    public Integer A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public Set A0N = AnonymousClass001.A0v();
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;

    public static void A00(I0g i0g, String str) {
        if (i0g.A0N.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(i0g.A0N);
        i0g.A0N = A1E;
        A1E.add(str);
    }
}
