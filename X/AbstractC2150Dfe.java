package X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.mobileconfig.factory.module.AdminIdMC;

/* renamed from: X.Dfe, reason: case insensitive filesystem */
/* loaded from: Dfe.class */
public abstract class AbstractC2150Dfe extends AbstractC2178Dg6 {
    public DfL A00;
    public FFO A01;
    public C1rs A02;
    public C1rs A03;
    public 1Im A04;
    public 1Im A05;
    public CharSequence A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final 1Iw A0A;

    public AbstractC2150Dfe(1Iw r302) {
        super(r302);
        this.A08 = true;
        this.A0A = r302;
    }

    @Override // X.AbstractC2178Dg6
    public /* bridge */ /* synthetic */ AbstractC2178Dg6 A0L(CharSequence charSequence) {
        this.A06 = charSequence;
        return this;
    }

    /* JADX WARN: Type inference failed for: r314v12, types: [java.lang.Object, X.ETj] */
    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        ETj eTj;
        Integer num;
        C5be c5be;
        boolean z;
        C1rs c1rs;
        C1rs c1rs2 = this.A03;
        1Im r304 = null;
        if (c1rs2 == null) {
            return null;
        }
        c1rs2.A2S(this.A06);
        c1rs2.A2Q(true);
        String str = this.A07;
        if (str != null) {
            this.A03.A0F(str);
        }
        AbstractC2178Dg6.A0E(this);
        C1rs c1rs3 = this.A03;
        if (c1rs3 == null) {
            return null;
        }
        if (this.A08) {
            1Im r0 = this.A04;
            c1rs = c1rs3;
            if (r0 != null) {
                c1rs3.A2T(r0);
            }
            return c1rs;
        }
        1Iw r02 = this.A0A;
        DfL dfL = this.A00;
        C1rs c1rs4 = this.A02;
        C1rs c1rs5 = this.A03;
        if (dfL == null || c1rs4 == null) {
            eTj = null;
        } else {
            if (c1rs5 == c1rs4) {
                c5be = null;
                z = true;
            } else {
                String str2 = dfL.A05;
                if (str2 == null) {
                    c5be = dfL.A00();
                } else {
                    LruCache lruCache = FBB.A00;
                    c5be = (C5be) lruCache.get(str2);
                    if (c5be == null) {
                        c5be = dfL.A00();
                        lruCache.put(dfL.A05, c5be);
                    }
                }
                c1rs4.A1e(c5be);
                z = false;
            }
            ?? obj = new Object();
            ((ETj) obj).A01 = c5be;
            ((ETj) obj).A00 = dfL;
            ((ETj) obj).A02 = z;
            eTj = obj;
        }
        Fie fie = new Fie(eTj, this.A01, r02, this.A05);
        FFO ffo = this.A01;
        if (ffo != null) {
            this.A03.A0v(ffo.A01(r02));
        }
        if (!((2yD) 1Bi.A05(1CO.class, AdminIdMC.class)).AZk(72339575822550496L)) {
            1Im r314 = fie.A03;
            if (r314 == null) {
                r314 = new 1Im(new 1Iv((1Iw) null, fie), 0S2.A00, (Object[]) null, 0);
                fie.A03 = r314;
            }
            r304 = r314;
        }
        C1rs c1rs6 = this.A03;
        1Im r311 = fie.A03;
        if (r311 == null) {
            r311 = new 1Im(new 1Iv((1Iw) null, fie), 0S2.A00, (Object[]) null, 0);
            fie.A03 = r311;
        }
        c1rs6.A1s(r311);
        c1rs6.A1p(r304);
        FFO ffo2 = this.A01;
        c1rs = c1rs6;
        if (ffo2 != null) {
            c1rs = c1rs6;
            if (1 - ffo2.A09.intValue() == 0) {
                C1rq A01 = C1rg.A01(r02, null, 0);
                A01.A2e(this.A03);
                FFO ffo3 = this.A01;
                DNJ dnj = null;
                if ((1 - ffo3.A09.intValue() == 0) && (num = ffo3.A08) != null && r02 != null) {
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        Context context = r02.A0D;
                        dnj = new DNJ(new int[]{C0A8.A00(context, ffo3.A04), C0A8.A00(context, ffo3.A05), C0A8.A00(context, ffo3.A02), C0A8.A00(context, ffo3.A01)}, 7zM.A02(context, ffo3.A06));
                    } else if (intValue == 0) {
                        dnj = new DNJ(new int[]{(-1) >>> 1, (-1) >>> 1, (-1) >>> 1, (-1) >>> 1}, 7zM.A02(r02.A0D, ffo3.A06));
                    }
                }
                A01.A1e(dnj);
                A01.A2O(true);
                this.A03 = A01;
                c1rs = A01;
            }
        }
        return c1rs;
    }

    public AbstractC2150Dfe A0f(DfL dfL) {
        this.A00 = dfL;
        this.A02 = this.A03;
        return this;
    }

    public /* bridge */ /* synthetic */ AbstractC2150Dfe A0g(1LI r302) {
        if (r302 != null) {
            this.A03 = 7zM.A0p(r302, this.A0A);
        }
        return this;
    }
}
