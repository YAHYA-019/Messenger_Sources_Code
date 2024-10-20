package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.Gfo, reason: case insensitive filesystem */
/* loaded from: Gfo.class */
public final class C2508Gfo extends C69o {
    public 5CK A00;
    public final Hh7 A01;
    public final 2Ff A02;

    public C2508Gfo(Context context, Hh7 hh7, 2Ff r304) {
        super(context, null, null);
        this.A02 = r304;
        this.A01 = hh7;
    }

    @Override // X.C69o
    public /* bridge */ /* synthetic */ 1OW A02(C69w c69w, Integer num, Object obj, Object obj2, String str) {
        2IE r313;
        2Dp r0 = (2Dp) obj;
        2Ff r02 = this.A02;
        int intValue = num.intValue();
        C2r8 c2r8 = intValue != 0 ? intValue != 1 ? C2r8.BITMAP_MEMORY_CACHE : C2r8.DISK_CACHE : C2r8.FULL_FETCH;
        if (c69w instanceof C69u) {
            C69u c69u = (C69u) c69w;
            synchronized (c69u) {
                r313 = null;
                Set set = c69u.A05;
                if (set != null) {
                    new 2ID(set);
                }
            }
        } else {
            r313 = null;
        }
        return r02.A07(r313, c2r8, r0, obj2, str);
    }

    @Override // X.C69o
    public /* bridge */ /* synthetic */ C69v A04() {
        C69u c69u;
        InterfaceC04494b5 B42;
        if (GOo.A1S()) {
            2D9.A02("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            C69w c69w = super.A01;
            String valueOf = String.valueOf(C69o.A0D.getAndIncrement());
            if (c69w instanceof C69u) {
                c69u = (C69u) c69w;
            } else {
                Hh7 hh7 = this.A01;
                new C69u(hh7.A00, null, hh7.A01, hh7.A02, hh7.A03, hh7.A04);
            }
            1iL A01 = A01(c69u, valueOf);
            2Dp r0 = (2Dp) this.A03;
            2DJ r02 = this.A02.A02;
            if (r0 != null) {
                3xX r03 = r0.A0F;
                Object obj = super.A02;
                B42 = r03 != null ? r02.B42(r0, obj) : r02.AZD(r0, obj);
            } else {
                B42 = null;
            }
            c69u.A0J(B42, null, A01, super.A02, valueOf);
            c69u.A0K(this, this.A00);
            4YV.A14();
            return c69u;
        } catch (Throwable th) {
            4YV.A14();
            throw th;
        }
    }
}
