package X;

import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import com.facebook.graphservice.tree.TreeJNI;

/* loaded from: Dyx.class */
public final class Dyx extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public QUC A06;
    public static final int A08 = 2MR.A1j.attr;
    public static final int A07 = 2MR.A2B.attr;
    public static final C00i A09 = 1BQ.A00();

    public Dyx() {
        super("SurveyMessageComponent");
        this.A00 = A07;
        this.A01 = 2132279323;
        this.A02 = 0;
        this.A03 = A08;
        this.A04 = 2132279515;
        this.A05 = 0;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A06, Integer.valueOf(this.A03), Integer.valueOf(this.A04), Integer.valueOf(this.A05)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        3yF A0L;
        Layout.Alignment alignment;
        String A0m;
        QUC quc = this.A06;
        int i = this.A04;
        int i2 = this.A03;
        int i3 = this.A05;
        int i4 = this.A01;
        int i5 = this.A00;
        int i6 = this.A02;
        if (1BK.A0N(A09).AZk(36310744443454571L) && !quc.A01.B5l().isEmpty()) {
            2JY r0 = quc.A01;
            String A0i = r0.A0i();
            if (A0i != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0i);
                1Du it = r0.B5l().iterator();
                while (it.hasNext()) {
                    TreeJNI treeJNI = (GMB) it.next();
                    2JX Ak1 = treeJNI.Ak1();
                    if (Ak1 != null && (A0m = Ak1.A0m()) != null) {
                        URLSpan uRLSpan = new URLSpan(A0m);
                        TreeJNI treeJNI2 = treeJNI;
                        int intValue = treeJNI2.getIntValue(-1019779949);
                        spannableStringBuilder.setSpan(uRLSpan, intValue, intValue + treeJNI2.getIntValue(-1106363674), 18);
                    }
                }
                A0L = 2KZ.A0L(r302, 0);
                alignment = Layout.Alignment.ALIGN_NORMAL;
                A0L.A35(alignment);
                A0L.A3A(spannableStringBuilder);
                A0L.A32(i4);
                A0L.A2y(i5);
                A0L.A33(i6);
                2KZ A2W = A0L.A2W();
                2cM A0f = AbH.A0f(r302, 0);
                A0f.A2D(C26z.LEFT, 2132279314);
                A0f.A2D(C26z.RIGHT, 2132279314);
                C26z c26z = C26z.BOTTOM;
                A0f.A2B(c26z, 2132279310);
                3yF A0L2 = 2KZ.A0L(r302, 0);
                A0L2.A3A(quc.A00.A0i());
                A0L2.A2y(i2);
                A0L2.A32(i);
                A0L2.A17(20.0f);
                A0L2.A22(c26z);
                A0L2.A33(i3);
                A0L2.A35(alignment);
                A0f.A2e(A0L2.A2W());
                return 7zL.A0V(A0f, A2W);
            }
        }
        A0L = 2KZ.A0L(r302, 0);
        alignment = Layout.Alignment.ALIGN_NORMAL;
        A0L.A35(alignment);
        A0L.A3A(quc.A01.A0i());
        A0L.A32(i4);
        A0L.A2y(i5);
        A0L.A33(i6);
        2KZ A2W2 = A0L.A2W();
        2cM A0f2 = AbH.A0f(r302, 0);
        A0f2.A2D(C26z.LEFT, 2132279314);
        A0f2.A2D(C26z.RIGHT, 2132279314);
        C26z c26z2 = C26z.BOTTOM;
        A0f2.A2B(c26z2, 2132279310);
        3yF A0L22 = 2KZ.A0L(r302, 0);
        A0L22.A3A(quc.A00.A0i());
        A0L22.A2y(i2);
        A0L22.A32(i);
        A0L22.A17(20.0f);
        A0L22.A22(c26z2);
        A0L22.A33(i3);
        A0L22.A35(alignment);
        A0f2.A2e(A0L22.A2W());
        return 7zL.A0V(A0f2, A2W2);
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        A00.A03(1iF.class, AbL.A0A());
        return A00;
    }

    @Override // X.C1rj
    public void A1E(1Iw r302) {
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        TypedArray A02 = r302.A02(0, C1oo.A2H);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A02.getIndexCount()) {
                break;
            }
            int index = A02.getIndex(i2);
            if (index == 10) {
                num = DKG.A11(A02, index, 2132279515);
            } else if (index == 9) {
                num2 = DKG.A11(A02, index, A08);
            } else if (index == 11) {
                num3 = Integer.valueOf(A02.getInt(index, 0));
            } else if (index == 7) {
                num4 = DKG.A11(A02, index, 2132279323);
            } else if (index == 6) {
                num5 = DKG.A11(A02, index, A07);
            } else if (index == 8) {
                num6 = Integer.valueOf(A02.getInt(index, 0));
            }
            i = i2 + 1;
        }
        A02.recycle();
        if (num != null) {
            this.A04 = num.intValue();
        }
        if (num2 != null) {
            this.A03 = num2.intValue();
        }
        if (num3 != null) {
            this.A05 = num3.intValue();
        }
        if (num4 != null) {
            this.A01 = num4.intValue();
        }
        if (num5 != null) {
            this.A00 = num5.intValue();
        }
        if (num6 != null) {
            this.A02 = num6.intValue();
        }
    }
}
