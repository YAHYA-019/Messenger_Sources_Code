package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.common.base.Platform;

/* loaded from: Ff8.class */
public final class Ff8 implements InterfaceC06154g3 {
    public final /* synthetic */ FFv A00;
    public final /* synthetic */ boolean A01;

    public Ff8(FFv fFv, boolean z) {
        this.A00 = fFv;
        this.A01 = z;
    }

    @Override // X.InterfaceC06154g3
    public void Bxm(Drawable drawable, Throwable th, long j) {
        2qZ r0;
        FFv fFv = this.A00;
        boolean z = this.A01;
        5C4 r02 = fFv.A08;
        if ((r02 == null || !r02.BN4()) && z && (r0 = fFv.A0C) != null) {
            String str = r0.A09;
            if (Platform.stringIsNullOrEmpty(str)) {
                return;
            }
            C2qz c2qz = fFv.A0E;
            if (c2qz != null && c2qz.A03(str)) {
                fFv.A09 = null;
                FFv.A01(fFv);
            } else {
                FFv.A00(5BS.A03().A03(fFv.A03.getResources(), (Rect) null, fFv.A07, fFv.A0A, 5Bm.A01(((C2fe) fFv.A0N.get()).A03(r0), (java.util.Map) null), fFv.A06, false, false), fFv, false);
            }
        }
    }

    @Override // X.InterfaceC06154g3
    public void Byb(Drawable drawable, 2Ec r303, int i, long j) {
    }

    @Override // X.InterfaceC06154g3
    public void C2B(long j, Throwable th) {
    }

    @Override // X.InterfaceC06154g3
    public void C2F(2Ec r302, long j) {
    }

    @Override // X.InterfaceC06154g3
    public void CBu(Drawable drawable, long j) {
    }

    @Override // X.InterfaceC06154g3
    public void CG3(long j) {
    }

    @Override // X.InterfaceC06154g3
    public void COB(long j, Object obj) {
    }
}
