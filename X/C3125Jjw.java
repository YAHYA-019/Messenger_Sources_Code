package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.List;

/* renamed from: X.Jjw, reason: case insensitive filesystem */
/* loaded from: Jjw.class */
public final class C3125Jjw extends LSJ {
    public float A00;
    public boolean A01;
    public LBU A02;
    public final RectF A03;
    public final List A04;
    public final Paint A05;
    public final RectF A06;

    /* JADX WARN: Multi-variable type inference failed */
    public C3125Jjw(L4k l4k, JVZ jvz, Ks8 ks8, List list) {
        super(jvz, ks8);
        LSJ lsj;
        LSJ c3122Jjt;
        String str;
        this.A04 = AnonymousClass001.A0s();
        this.A06 = DKC.A0D();
        this.A03 = DKC.A0D();
        this.A05 = DKC.A09();
        this.A01 = true;
        C3114Jjl c3114Jjl = ks8.A0A;
        if (c3114Jjl != null) {
            C3110Jjh A01 = AbstractC3112Jjj.A01(c3114Jjl);
            this.A02 = A01;
            A0C(A01);
            this.A02.A0A(this);
        } else {
            this.A02 = null;
        }
        C00p c00p = new C00p(l4k.A08.size());
        int A0A = GOn.A0A(list, 1);
        LSJ lsj2 = null;
        while (true) {
            if (A0A < 0) {
                for (int i = 0; i < c00p.A00(); i++) {
                    LSJ lsj3 = (LSJ) c00p.A05(c00p.A02(i));
                    if (lsj3 != null && (lsj = (LSJ) c00p.A05(lsj3.A0J.A08)) != null) {
                        lsj3.A05 = lsj;
                    }
                }
                return;
            }
            Ks8 ks82 = (Ks8) list.get(A0A);
            int intValue = ks82.A0H.intValue();
            switch (intValue) {
                case 0:
                    c3122Jjt = new C3125Jjw(l4k, jvz, ks82, JQx.A12(ks82.A0K, l4k.A0C));
                    break;
                case 1:
                    c3122Jjt = new C3124Jjv(jvz, ks82);
                    break;
                case 2:
                    c3122Jjt = new C3123Jju(jvz, ks82);
                    break;
                case 3:
                    c3122Jjt = new LSJ(jvz, ks82);
                    break;
                case 4:
                    c3122Jjt = new C3122Jjt(l4k, jvz, this, ks82);
                    break;
                case 5:
                    c3122Jjt = new C3126Jjx(jvz, ks82);
                    break;
                default:
                    switch (intValue) {
                        case 1:
                            str = "SOLID";
                            break;
                        case 2:
                            str = "IMAGE";
                            break;
                        case 3:
                            str = "NULL";
                            break;
                        case 4:
                            str = "SHAPE";
                            break;
                        case 5:
                            str = "TEXT";
                            break;
                        case 6:
                            str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                            break;
                        default:
                            str = "PRE_COMP";
                            break;
                    }
                    Hv6.A00(0Pz.A0W("Unknown layer type ", str));
                    continue;
            }
            c00p.A0C(c3122Jjt.A0J.A07, c3122Jjt);
            if (lsj2 != null) {
                lsj2.A04 = c3122Jjt;
                lsj2 = null;
            } else {
                this.A04.add(0, c3122Jjt);
                int intValue2 = ks82.A0I.intValue();
                if (intValue2 == 1 || intValue2 == 2) {
                    lsj2 = c3122Jjt;
                }
            }
            A0A--;
        }
    }

    public void A0A(float f) {
        this.A00 = f;
        super.A0A(f);
        LBU lbu = this.A02;
        if (lbu != null) {
            L4k l4k = ((LSJ) this).A0H.A0D;
            float f2 = (l4k.A00 - l4k.A03) + 0.01f;
            L4k l4k2 = ((LSJ) this).A0J.A09;
            f = ((LBU.A02(lbu) * l4k2.A01) - l4k2.A03) / f2;
        }
        if (this.A02 == null) {
            Ks8 ks8 = ((LSJ) this).A0J;
            float f3 = ks8.A02;
            L4k l4k3 = ks8.A09;
            f -= f3 / (l4k3.A00 - l4k3.A03);
        }
        Ks8 ks82 = ((LSJ) this).A0J;
        float f4 = ks82.A03;
        if (f4 != 0.0f && !"__container".equals(ks82.A0J)) {
            f /= f4;
        }
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((LSJ) list.get(size)).A0A(f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A7g(L34 l34, Object obj) {
        super.A7g(l34, obj);
        if (obj == MLa.A0S) {
            if (l34 == null) {
                LBU lbu = this.A02;
                if (lbu != null) {
                    lbu.A0B((L34) null);
                    return;
                }
                return;
            }
            C3103Jja A00 = C3103Jja.A00(l34);
            this.A02 = A00;
            A00.A0A(this);
            A0C(this.A02);
        }
    }

    public void Aa0(Matrix matrix, RectF rectF, boolean z) {
        super.Aa0(matrix, rectF, z);
        List list = this.A04;
        int size = list.size() - 1;
        while (true) {
            int i = size;
            if (i < 0) {
                return;
            }
            RectF rectF2 = this.A06;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((LSJ) list.get(i)).Aa0(((LSJ) this).A08, rectF2, true);
            rectF.union(rectF2);
            size = i - 1;
        }
    }
}
