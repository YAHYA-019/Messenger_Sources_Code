package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3Z4, reason: invalid class name */
/* loaded from: 3Z4.class */
public final class C3Z4 implements 1SH {
    public final int A00;
    public final Object A01;

    public C3Z4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static StringBuilder A00(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(str);
            return sb;
        }
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        return sb;
    }

    public final void A01(String str, String str2, String str3, long j, short s) {
        String A13 = 1BK.A13(0Fx.A00(s));
        StringBuilder A00 = A00(str, str3, AnonymousClass001.A1O(str3.length()));
        A00.append('/');
        String A0d = AnonymousClass001.A0d(A13, A00);
        1SG r0 = (1SG) this.A01;
        r0.A0a(A0d, TimeUnit.MILLISECONDS, j);
        r0.A0Z(str2, 0Pz.A0Y(str3, A13, '/'));
    }

    public final void A02(String str, String str2, String str3, long j, short s) {
        String A13 = 1BK.A13(0Fx.A00(s));
        StringBuilder A00 = A00(str, str3, AnonymousClass001.A1O(str3.length()));
        A00.append('/');
        String A0d = AnonymousClass001.A0d(A13, A00);
        1SG r0 = (1SG) this.A01;
        r0.A0a(A0d, TimeUnit.MILLISECONDS, j);
        r0.A0Z(str2, 0Pz.A0Y(str3, A13, '/'));
    }

    public final void A03(String str, String str2, String str3, long j, short s) {
        String A13 = 1BK.A13(0Fx.A00(s));
        StringBuilder A00 = A00(str, str3, AnonymousClass001.A1O(str3.length()));
        A00.append('/');
        String A0d = AnonymousClass001.A0d(A13, A00);
        1SG r0 = (1SG) this.A01;
        r0.A0a(A0d, TimeUnit.MILLISECONDS, j);
        r0.A0Z(str2, 0Pz.A0Y(str3, A13, '/'));
    }

    public final void A04(String str, String str2, String str3, long j, short s) {
        String A13 = 1BK.A13(0Fx.A00(s));
        StringBuilder A00 = A00(str, str3, AnonymousClass001.A1O(str3.length()));
        A00.append('/');
        String A0d = AnonymousClass001.A0d(A13, A00);
        1SG r0 = (1SG) this.A01;
        r0.A0a(A0d, TimeUnit.MILLISECONDS, j);
        r0.A0Z(str2, 0Pz.A0Y(str3, A13, '/'));
    }
}
