package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Adf, reason: case insensitive filesystem */
/* loaded from: Adf.class */
public final class C1302Adf {
    public int A00 = 1;
    public long A01;
    public View.OnClickListener A02;
    public View.OnLongClickListener A03;
    public MigColorScheme A04;
    public String A05;
    public String A06;
    public String A07;

    public static final C1302Adf A00() {
        return new C1302Adf();
    }

    public static C1302Adf A01(AeL aeL, String str) {
        C1302Adf A01 = aeL.A01();
        A01.A01 = str.hashCode();
        A01.A07 = str;
        return A01;
    }

    public C55c A02() {
        this.A07.getClass();
        2K8 r0 = 2K5.A04;
        long j = this.A01;
        return new C55c(this.A02, this.A03, r0, this.A04, null, this.A07, this.A05, null, this.A06, this.A00, j, true);
    }
}
