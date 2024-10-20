package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.69t, reason: invalid class name */
/* loaded from: 69t.class */
public class C69t extends C69u {
    public Drawable A00;
    public Context A01;
    public final 82O A02;

    public C69t(Context context, 5C6 r303, 2Fp r304, 2HD r305, 82O r306, Executor executor) {
        super(context != null ? context.getResources() : null, new ArrayList(new ArrayList(1Bi.A06(94))), r303, r305, r304 != null ? r304.AWr(context) : null, executor);
        this.A01 = context;
        this.A02 = r306;
    }

    @Override // X.C69u, X.C69v
    public 1OW A0A() {
        1OW A0A;
        C06354gk A00;
        C00j.A05("FbPipelineDraweeController.getDataSource", 1814949527);
        try {
            1iL r0 = ((C69u) this).A02;
            if (r0 instanceof 6A3) {
                A0A = (1OW) r0.get();
                synchronized (this) {
                    A00 = C06354gk.A00();
                }
                A0A.D3K(new IQv(this), A00);
            } else {
                A0A = super.A0A();
            }
            C00j.A01(-1452857827);
            return A0A;
        } catch (Throwable th) {
            C00j.A01(168068380);
            throw th;
        }
    }

    @Override // X.C69v
    public boolean A0F() {
        6A3 r0 = ((C69u) this).A02;
        if (r0 instanceof 6A3) {
            6A3 r02 = r0;
            if (!r02.A00) {
                if (this.A00 == null) {
                    A0L();
                    ((C69u) this).A02.A00 = true;
                    return true;
                }
                this.A02.A03(this.A01, new IR2(this), r02.A02.A02).A00("photo_placeholder_click");
                return true;
            }
        }
        A0D(null);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0.A02.A03 == false) goto L8;
     */
    @Override // X.C69v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0G() {
        /*
            r301 = this;
            r0 = r301
            X.1iL r0 = r0.A02
            r302 = r0
            r0 = r302
            boolean r0 = r0 instanceof X.6A3
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2e
            r0 = r302
            X.6A3 r0 = (X.6A3) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2e
            r0 = r302
            X.66O r0 = r0.A02
            r304 = r0
            r0 = r304
            boolean r0 = r0.A03
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L32
        L2e:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L32:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69t.A0G():boolean");
    }

    @Override // X.C69u
    public Drawable A0H(2EU r302) {
        C00j.A05("FbPipelineDraweeController.createDrawable", 1031105575);
        try {
            C0By.A04(2EU.A06(r302));
            Drawable A0H = super.A0H(r302);
            C00j.A01(504690743);
            return A0H;
        } catch (Throwable th) {
            C00j.A01(-1643020590);
            throw th;
        }
    }

    @Override // X.C69u
    public String A0I() {
        CallerContext callerContext = (CallerContext) ((C69v) this).A05;
        return callerContext != null ? callerContext.A03 : super.A0I();
    }

    @Override // X.C69u
    public void A0K(C69o c69o, 5CK r303) {
        synchronized (this) {
            super.A0K(c69o, r303);
        }
    }

    public void A0L() {
        A0D(null);
        6A3 r0 = ((C69u) this).A02;
        if (r0 instanceof 6A3) {
            r0.A00();
        }
        release();
        A0C();
    }

    @Override // X.C69v, X.C69w
    public Animatable AWq() {
        return super.AWq();
    }
}
