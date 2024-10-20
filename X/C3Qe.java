package X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.3Qe, reason: invalid class name */
/* loaded from: 3Qe.class */
public final class C3Qe {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Boolean A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public HashMap A0E;
    public final Uri A0F;
    public final String A0G;

    public C3Qe(C3Qe c3Qe) {
        this.A07 = "";
        this.A08 = "";
        this.A09 = "";
        long j = -1;
        this.A00 = j;
        this.A0B = "";
        this.A0C = "";
        this.A01 = j;
        this.A03 = j;
        this.A0E = AnonymousClass001.A0u();
        this.A0G = c3Qe.A0G;
        this.A0F = c3Qe.A0F;
        this.A0A = c3Qe.A0A;
        this.A07 = c3Qe.A07;
        this.A08 = c3Qe.A08;
        this.A09 = c3Qe.A09;
        this.A0B = c3Qe.A0B;
        this.A0C = c3Qe.A0C;
        this.A00 = c3Qe.A00;
        this.A01 = c3Qe.A01;
        this.A05 = c3Qe.A05;
        this.A02 = c3Qe.A02;
        this.A04 = c3Qe.A04;
        this.A03 = c3Qe.A03;
        this.A0E = c3Qe.A0E;
        this.A0D = c3Qe.A0D;
        this.A06 = c3Qe.A06;
    }

    public C3Qe(boolean z, Uri uri) {
        this.A07 = "";
        this.A08 = "";
        this.A09 = "";
        long j = -1;
        this.A00 = j;
        this.A0B = "";
        this.A0C = "";
        this.A01 = j;
        this.A03 = j;
        this.A0E = AnonymousClass001.A0u();
        Uri A00 = C0Aj.A00(uri);
        11T.A0A(A00);
        this.A0F = A00;
        String obj = z ? uri.toString() : A00.toString();
        11T.A0A(obj);
        this.A0G = obj;
    }
}
