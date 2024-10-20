package X;

import android.graphics.drawable.Animatable;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.base.Objects;

/* renamed from: X.Gfx, reason: case insensitive filesystem */
/* loaded from: Gfx.class */
public final class C2517Gfx extends 4gL {
    public final /* synthetic */ 2Dp A00;
    public final /* synthetic */ 6wC A01;

    public C2517Gfx(2Dp r302, 6wC r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        2Ec r0 = (2Ec) obj;
        if (animatable != null) {
            6wC r02 = this.A01;
            CallerContext callerContext = 6wC.A09;
            if (r02.A04 != null && Objects.equal(r02.A06, this.A00)) {
                EXs.A00(animatable, true);
            }
        }
        if (r0 != null) {
            6wC.A02(this.A01, r0.getWidth(), r0.getHeight());
        }
    }
}
