package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.810, reason: invalid class name */
/* loaded from: 810.class */
public final class AnonymousClass810 extends C1rj {
    public static final AtomicInteger A0B = new AtomicInteger();
    public int A00;
    public int A01;
    public AnonymousClass953 A02;
    public C6N1 A03;
    public MigColorScheme A04;
    public UserKey A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;

    public AnonymousClass810() {
        super("JumpPillComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A06, this.A04, 1BK.A0d(), Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A), this.A07, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A05, this.A08};
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01d0, code lost:
    
        if (r0 != null) goto L18;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass810.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        String str = this.A07;
        boolean z = this.A0A;
        5XB r305 = null;
        AtomicInteger atomicInteger = A0B;
        String A0T = 0Pz.A0T("PILL_USERTILE_TRANSITION_KEY", atomicInteger.get());
        String A0T2 = 0Pz.A0T("PILL_TEXT_TRANSITION_KEY", atomicInteger.get());
        atomicInteger.incrementAndGet();
        if (str != null) {
            5Rn r0 = 5Rn.A01;
            5X3 A01 = C3s9.A01(r0, "PILL_TRANSITION_KEY", A0T2);
            A01.A03(C2jm.A07);
            ((5X4) A01).A02 = new C5X0(200);
            5X3 A012 = C3s9.A01(r0, "PILL_TRANSITION_KEY", A0T, A0T2, "PILL_ARROW_TRANSITION_KEY");
            A012.A03(C2jm.A08);
            ((5X4) A012).A02 = new C5X0(200);
            r305 = new 5XA(new 5X3[]{A01, A012});
            C3s9 A013 = C3s9.A01(r0, A0T, A0T2);
            C2jo c2jo = C2jm.A00;
            A013.A03(c2jo);
            A013.A02(0.0f);
            ((5X4) A013).A02 = new C5X0(200);
            C3s9 A014 = C3s9.A01(r0, A0T, A0T2);
            A014.A03(c2jo);
            A014.A01(0.0f);
            ((5X4) A014).A02 = new C5X0(200);
            if (!z) {
                r305 = new 5XB(new C3s9[]{A013, r305, A014});
            }
        }
        return r305;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        C6N1 c6n1 = ((AnonymousClass810) r302.A00.A01).A03;
        if (c6n1 == null) {
            return null;
        }
        c6n1.BoD();
        return null;
    }
}
