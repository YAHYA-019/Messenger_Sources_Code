package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.4g6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4g6.class */
public final class C06184g6 implements InterfaceC06194g7 {
    public final C00i A00;
    public final C00i A01;
    public final InterfaceC06194g7 A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;

    public C06184g6() {
        1Br A00 = 1Bq.A00(116410);
        this.A04 = A00;
        this.A06 = 1Bq.A00(65609);
        this.A07 = 1Bq.A00(116407);
        1Br A002 = 1Bq.A00(66389);
        this.A05 = A002;
        this.A00 = 1Bq.A00(116408);
        this.A03 = 1Bq.A00(116409);
        this.A01 = 1Bq.A00(16385);
        ((1iG) A002.get()).A00();
        C06864i5 c06864i5 = ((4iF) A00.get()).A02;
        4iG r307 = c06864i5.A00;
        if (r307 == null) {
            2Cb r303 = c06864i5.A02;
            if (r303 == null) {
                r303 = 2Cb.A01();
                c06864i5.A02 = r303;
            }
            2Ff A0B = r303.A0B();
            r307 = new 4iG(c06864i5.A03, c06864i5.A05, A0B);
            c06864i5.A00 = r307;
        }
        this.A02 = r307;
    }

    public static final CallerContext A00(Object obj, String str) {
        ContextChain contextChain;
        CallerContext callerContext = null;
        if (obj instanceof CallerContext) {
            callerContext = (CallerContext) obj;
            contextChain = callerContext.A01;
        } else {
            contextChain = null;
        }
        return CallerContext.A01(callerContext, new ContextChain(new ContextChain(contextChain, "callsite", str), "prefetcher", "FrescoVito"));
    }

    @Override // X.InterfaceC06194g7
    public 1OW CYK(Uri uri, C06974ih c06974ih, Integer num, Object obj, String str) {
        11T.A0F(num, 0);
        return this.A02.CYK(uri, c06974ih, num, A00(obj, str), str);
    }

    @Override // X.InterfaceC06194g7
    public 1OW CYL(ContextChain contextChain, 5BR r303, 2IE r304, Integer num, Object obj, String str) {
        11T.A0F(num, 0);
        boolean AZk = ((2yD) this.A01.get()).AZk(36313282769983572L);
        this.A00.get();
        return CYM(r303, r304, num, AZk ? 5Bg.A01(contextChain, obj) : 5Bg.A00(contextChain, obj), str);
    }

    @Override // X.InterfaceC06194g7
    public 1OW CYM(5BR r302, 2IE r303, Integer num, Object obj, String str) {
        11T.A0F(num, 0);
        return this.A02.CYM(r302, r303, num, A00(obj, str), str);
    }

    @Override // X.InterfaceC06194g7
    public 1OW CYS(Uri uri, C06984ii c06984ii, Object obj, String str) {
        11T.A0F(uri, 0);
        return this.A02.CYS(uri, c06984ii, A00(obj, str), str);
    }

    @Override // X.InterfaceC06194g7
    public 1OW CYT(Uri uri, ContextChain contextChain, C06984ii c06984ii, Object obj, String str) {
        boolean AZk = ((2yD) this.A01.get()).AZk(36313282769983572L);
        this.A00.get();
        Object A01 = AZk ? 5Bg.A01(contextChain, obj) : 5Bg.A00(contextChain, obj);
        if (((5Bi) this.A03.get()).A00(A01 instanceof CallerContext ? (CallerContext) A01 : null) && c06984ii != null) {
            C07014il c07014il = new C07014il(c06984ii);
            ((AbstractC07024im) c07014il).A01 = 2rB.A02;
            ((AbstractC07024im) c07014il).A02 = "logged_out_disk_cache_config_id";
            c06984ii = new C06984ii(c07014il);
        }
        return CYS(uri, c06984ii, A01, "BloksImageComponent");
    }
}
