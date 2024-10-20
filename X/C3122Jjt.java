package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;

/* renamed from: X.Jjt, reason: case insensitive filesystem */
/* loaded from: Jjt.class */
public final class C3122Jjt extends LSJ {
    public final LSD A00;
    public final C3125Jjw A01;

    public C3122Jjt(L4k l4k, JVZ jvz, C3125Jjw c3125Jjw, Ks8 ks8) {
        super(jvz, ks8);
        this.A01 = c3125Jjw;
        LSD lsd = new LSD(l4k, jvz, new LSY("__container", ks8.A0N, false), this);
        this.A00 = lsd;
        lsd.CnQ(Collections.emptyList(), Collections.emptyList());
    }

    public void Aa0(Matrix matrix, RectF rectF, boolean z) {
        super.Aa0(matrix, rectF, z);
        this.A00.Aa0(((LSJ) this).A08, rectF, z);
    }
}
