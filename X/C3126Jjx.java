package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Jjx, reason: case insensitive filesystem */
/* loaded from: Jjx.class */
public final class C3126Jjx extends LSJ {
    public LBU A00;
    public LBU A01;
    public LBU A02;
    public LBU A03;
    public LBU A04;
    public LBU A05;
    public LBU A06;
    public LBU A07;
    public LBU A08;
    public LBU A09;
    public final Matrix A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final C00p A0E;
    public final L4k A0F;
    public final JVZ A0G;
    public final C3104Jjb A0H;
    public final StringBuilder A0I;
    public final List A0J;
    public final java.util.Map A0K;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.Jjb, X.LBU] */
    public C3126Jjx(JVZ jvz, Ks8 ks8) {
        super(jvz, ks8);
        this.A0I = AnonymousClass001.A0l(2);
        this.A0D = DKC.A0D();
        this.A0A = GOn.A0F();
        this.A0B = new JVB(this);
        this.A0C = new JVC(this);
        this.A0K = AnonymousClass001.A0u();
        this.A0E = new C00p();
        this.A0J = AnonymousClass001.A0s();
        this.A0G = jvz;
        this.A0F = ks8.A09;
        ?? lbu = new LBU(((LSO) ks8.A0B).A00);
        this.A0H = lbu;
        lbu.A0A(this);
        A0C((LBU) lbu);
        Kk1 kk1 = ks8.A0C;
        if (kk1 != null) {
            C3113Jjk c3113Jjk = kk1.A00;
            if (c3113Jjk != null) {
                LBU lbu2 = new LBU(((LSO) c3113Jjk).A00);
                this.A00 = lbu2;
                lbu2.A0A(this);
                A0C(this.A00);
            }
            C3113Jjk c3113Jjk2 = kk1.A01;
            if (c3113Jjk2 != null) {
                LBU lbu3 = new LBU(((LSO) c3113Jjk2).A00);
                this.A02 = lbu3;
                lbu3.A0A(this);
                A0C(this.A02);
            }
            C3114Jjl c3114Jjl = kk1.A02;
            if (c3114Jjl != null) {
                C3110Jjh A01 = AbstractC3112Jjj.A01(c3114Jjl);
                this.A04 = A01;
                A01.A0A(this);
                A0C(this.A04);
            }
            C3114Jjl c3114Jjl2 = kk1.A03;
            if (c3114Jjl2 != null) {
                C3110Jjh A012 = AbstractC3112Jjj.A01(c3114Jjl2);
                this.A07 = A012;
                A012.A0A(this);
                A0C(this.A07);
            }
        }
    }

    public static List A00(Kk0 kk0, C3126Jjx c3126Jjx, String str, float f, float f2, float f3, boolean z) {
        float measureText;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i3 = 0;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                KqE kqE = (KqE) C0Ak.A00(c3126Jjx.A0F.A07, 7zM.A05(kk0.A03, AnonymousClass002.A07(kk0.A01, charAt * 31)));
                if (kqE != null) {
                    measureText = ((float) kqE.A00) * f2 * DKD.A08().density;
                }
            } else {
                measureText = c3126Jjx.A0B.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                i3 = i4;
                f5 = f7;
                z2 = false;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                List list = c3126Jjx.A0J;
                int size = list.size();
                while (true) {
                    int i5 = size;
                    if (i5 >= i) {
                        break;
                    }
                    list.add(new Kgm());
                    size = i5 + 1;
                }
                Kgm kgm = (Kgm) list.get(i - 1);
                if (i3 == i2) {
                    String trim = str.substring(i2, i4).trim();
                    kgm.A01 = trim;
                    kgm.A00 = (f4 - f7) - ((trim.length() - r0.length()) * f6);
                    i2 = i4;
                    i3 = i4;
                    f4 = f7;
                    f5 = f7;
                } else {
                    String trim2 = str.substring(i2, i3 - 1).trim();
                    kgm.A01 = trim2;
                    kgm.A00 = ((f4 - f5) - ((r0.length() - trim2.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            List list2 = c3126Jjx.A0J;
            int size2 = list2.size();
            while (true) {
                int i6 = size2;
                if (i6 >= i) {
                    break;
                }
                list2.add(new Kgm());
                size2 = i6 + 1;
            }
            Kgm kgm2 = (Kgm) list2.get(i - 1);
            kgm2.A01 = str.substring(i2);
            kgm2.A00 = f4;
        }
        return c3126Jjx.A0J.subList(0, i);
    }

    public static void A01(Canvas canvas, Paint paint, Path path) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    public static void A02(Canvas canvas, Paint paint, String str) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r0 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(android.graphics.Canvas r301, X.Kqs r302, X.C3126Jjx r303, float r304, int r305) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3126Jjx.A03(android.graphics.Canvas, X.Kqs, X.Jjx, float, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A7g(L34 l34, Object obj) {
        LBU lbu;
        super.A7g(l34, obj);
        if (obj == MLa.A0a) {
            LBU lbu2 = this.A01;
            if (lbu2 != null) {
                ((LSJ) this).A0K.remove(lbu2);
            }
            if (l34 == null) {
                this.A01 = null;
                return;
            }
            C3103Jja c3103Jja = new C3103Jja(l34, null);
            this.A01 = c3103Jja;
            c3103Jja.A0A(this);
            lbu = this.A01;
        } else if (obj == MLa.A0d) {
            LBU lbu3 = this.A03;
            if (lbu3 != null) {
                ((LSJ) this).A0K.remove(lbu3);
            }
            if (l34 == null) {
                this.A03 = null;
                return;
            }
            C3103Jja c3103Jja2 = new C3103Jja(l34, null);
            this.A03 = c3103Jja2;
            c3103Jja2.A0A(this);
            lbu = this.A03;
        } else if (obj == MLa.A0P) {
            LBU lbu4 = this.A05;
            if (lbu4 != null) {
                ((LSJ) this).A0K.remove(lbu4);
            }
            if (l34 == null) {
                this.A05 = null;
                return;
            }
            C3103Jja c3103Jja3 = new C3103Jja(l34, null);
            this.A05 = c3103Jja3;
            c3103Jja3.A0A(this);
            lbu = this.A05;
        } else if (obj == MLa.A0R) {
            LBU lbu5 = this.A08;
            if (lbu5 != null) {
                ((LSJ) this).A0K.remove(lbu5);
            }
            if (l34 == null) {
                this.A08 = null;
                return;
            }
            C3103Jja c3103Jja4 = new C3103Jja(l34, null);
            this.A08 = c3103Jja4;
            c3103Jja4.A0A(this);
            lbu = this.A08;
        } else if (obj == MLa.A0Q) {
            LBU lbu6 = this.A06;
            if (lbu6 != null) {
                ((LSJ) this).A0K.remove(lbu6);
            }
            if (l34 == null) {
                this.A06 = null;
                return;
            }
            C3103Jja c3103Jja5 = new C3103Jja(l34, null);
            this.A06 = c3103Jja5;
            c3103Jja5.A0A(this);
            lbu = this.A06;
        } else {
            if (obj != MLa.A08) {
                if (obj == "dynamic_text") {
                    this.A0H.A0C(l34);
                    return;
                }
                return;
            }
            LBU lbu7 = this.A09;
            if (lbu7 != null) {
                ((LSJ) this).A0K.remove(lbu7);
            }
            if (l34 == null) {
                this.A09 = null;
                return;
            }
            C3103Jja c3103Jja6 = new C3103Jja(l34, null);
            this.A09 = c3103Jja6;
            c3103Jja6.A0A(this);
            lbu = this.A09;
        }
        A0C(lbu);
    }

    public void Aa0(Matrix matrix, RectF rectF, boolean z) {
        super.Aa0(matrix, rectF, z);
        L4k l4k = this.A0F;
        rectF.set(0.0f, 0.0f, l4k.A05.width(), l4k.A05.height());
    }
}
