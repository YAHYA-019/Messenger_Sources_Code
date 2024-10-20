package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.9rs, reason: invalid class name */
/* loaded from: 9rs.class */
public final class C9rs implements 4gJ {
    public final 4gJ A00;
    public final 1CO A01 = (1CO) 1Bi.A03(16385);

    public C9rs(4gJ r302) {
        this.A00 = r302;
    }

    public void Bxg(String str, Throwable th) {
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        11T.A0F(str, 0);
        this.A00.Byc(animatable, obj, str);
        if ((animatable instanceof JVb) && 2yD.A03(this.A01, 36317633569893869L)) {
            if (((JVb) animatable).isRunning()) {
                animatable.stop();
            }
            animatable.start();
        }
    }

    public void C2D(String str, Throwable th) {
    }

    public /* bridge */ /* synthetic */ void C2E(String str, Object obj) {
    }

    public void CG6(String str) {
    }

    public void COC(String str, Object obj) {
    }
}
