package X;

import android.graphics.Typeface;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8n1, reason: invalid class name */
/* loaded from: 8n1.class */
public final class C8n1 extends C1rj {
    public static final CallerContext A0C = CallerContext.A0B("ReactionListItemComponentSpec");
    public static final C06974ih A0D = 7zO.A0Q(InterfaceC07034in.A04, 7zR.A0J());
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Typeface A06;
    public AaR A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public C8n1() {
        super("ReactorListItemComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), 4YU.A0k(), Boolean.valueOf(this.A0B), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04), this.A08, this.A09, Integer.valueOf(this.A05), this.A06, this.A07, this.A0A};
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0078, code lost:
    
        if (r0.ADg() == false) goto L8;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8n1.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1547492764) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        Object[] objArr = r302.A03;
        String str = (String) objArr[0];
        AaR aaR = (AaR) objArr[1];
        11T.A0F(str, 1);
        if (aaR == null) {
            return null;
        }
        aaR.CGR(str);
        return null;
    }
}
