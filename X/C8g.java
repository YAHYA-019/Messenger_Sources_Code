package X;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: C8g.class */
public final class C8g {
    public static volatile R0w A0E;
    public Uri A00;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public Set A0A = AnonymousClass001.A0v();
    public ImmutableList A01 = ImmutableList.of();

    public void A00(Integer num) {
        this.A02 = num;
        String A00 = AbstractC00603o4.A00(403);
        C1pq.A08(A00, num);
        if (this.A0A.contains(A00)) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0A);
        this.A0A = A1E;
        A1E.add(A00);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.R0w] */
    public void A01(String str) {
        Uri uri;
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = new Object();
                }
            }
        }
        if (str == null || str.length() == 0) {
            uri = null;
        } else {
            uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
        }
        this.A00 = uri;
    }
}
