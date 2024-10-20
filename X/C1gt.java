package X;

import android.content.Context;

/* renamed from: X.1gt, reason: invalid class name */
/* loaded from: 1gt.class */
public final class C1gt {
    public final Context A00;
    public final 1Fe A01;
    public final C1gr A02;
    public final C1gq A03;

    public C1gt(Context context, 1Fe r303, C1gq c1gq) {
        11T.A0F(context, 1);
        11T.A0F(c1gq, 2);
        11T.A0F(r303, 3);
        this.A03 = c1gq;
        this.A01 = r303;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        11T.A0A(applicationContext);
        this.A02 = new C1gr(applicationContext);
    }

    public 1Fi A00(int i) {
        return A01(this.A03.A02.A01(), i);
    }

    public 1Fi A01(1Zj r302, int i) {
        String A01 = C1gv.A01(i);
        11T.A0A(A01);
        1Yt A00 = C1gv.A00(i);
        if (A00 != null && A00.A02 && A00.A00) {
            1Zj A012 = 1aP.A01(r302, A00);
            String str = A012.A00;
            if (str == null) {
                str = "__out_of_scope__";
            }
            String str2 = A012.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("lsp.");
            sb.append(str);
            sb.append('.');
            sb.append(str2);
            sb.append('.');
            sb.append(A01);
            A01 = sb.toString();
        }
        1Fi A002 = this.A01.A00(A01);
        11T.A0A(A002);
        return A002;
    }
}
