package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.stickers.model.Sticker;

/* renamed from: X.6qp, reason: invalid class name */
/* loaded from: 6qp.class */
public abstract class C6qp implements C6qq {
    public final 1Br A01;
    public final 1Br A03;
    public final 6wA A04;
    public final C6qz A05;
    public final 1Br A02 = 1Bu.A00(49970);
    public final 1Br A00 = 1Bu.A00(487);

    public C6qp(int i) {
        1Br A00 = 1Bu.A00(488);
        this.A01 = A00;
        C1F6 c1f6 = (C1F6) A00.A00.get();
        69I r0 = (69I) this.A02.A00.get();
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            6wA r02 = new 6wA(r0, i);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A04 = r02;
            this.A03 = 1Bu.A00(68026);
            this.A05 = ((82O) this.A00.A00.get()).A0a(i);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public boolean A00() {
        return 7Qc.A00((7Qc) this.A03.A00.get()).AZk(36322409573729782L);
    }

    public boolean A01() {
        return 7Qc.A00((7Qc) this.A03.A00.get()).AZk(36322409573729782L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x017f, code lost:
    
        if (r336.AZk(r337) != false) goto L34;
     */
    @Override // X.C6qq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI AJv(android.graphics.drawable.Drawable r302, android.net.Uri r303, com.facebook.common.callercontext.CallerContext r304, X.1Iw r305, X.1Im r306, X.1Im r307, X.1Im r308, X.1Im r309, com.facebook.stickers.model.Sticker r310, X.96D r311, java.lang.CharSequence r312, java.lang.String r313, int r314, int r315, boolean r316) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6qp.AJv(android.graphics.drawable.Drawable, android.net.Uri, com.facebook.common.callercontext.CallerContext, X.1Iw, X.1Im, X.1Im, X.1Im, X.1Im, com.facebook.stickers.model.Sticker, X.96D, java.lang.CharSequence, java.lang.String, int, int, boolean):X.1LI");
    }

    @Override // X.C6qq
    public 6wB B4P(Sticker sticker, boolean z) {
        return (((69I) 1Br.A0B(this.A02)).A04(sticker) == null || ((!A00() || z) && !(A01() && z))) ? this.A05.A00 : this.A04;
    }
}
