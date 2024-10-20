package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2rr, reason: invalid class name */
/* loaded from: 2rr.class */
public final class C2rr extends C1rj {
    public static final CallerContext A0A = CallerContext.A0B("MigUriProfileSpec");
    public static final C2py A0B;
    public static final C2py A0C;
    public static final C2q2 A0D;
    public static final C2q2 A0E;
    public int A00;
    public C2q1 A01;
    public C2py A02;
    public C2py A03;
    public C2q2 A04;
    public C2q2 A05;
    public MigColorScheme A06;
    public String A07;
    public String A08;
    public List A09;

    static {
        C2q2 c2q2 = C2q2.A0G;
        A0D = c2q2;
        A0E = c2q2;
        C2py c2py = C2py.CIRCULAR;
        A0C = c2py;
        A0B = c2py;
    }

    public C2rr() {
        super("MigUriProfile");
        this.A04 = A0D;
        this.A02 = A0C;
        this.A00 = 0;
        this.A05 = A0E;
        this.A03 = A0B;
        this.A09 = Collections.emptyList();
    }

    public static C2sS A00(1Iw r301) {
        return new C2sS(r301, new C2rr());
    }
}
