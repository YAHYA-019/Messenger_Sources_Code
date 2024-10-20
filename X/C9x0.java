package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9x0, reason: invalid class name */
/* loaded from: 9x0.class */
public final class C9x0 implements 2Qv {
    public final 1Br A00 = 1Bq.A00(68174);

    public /* bridge */ /* synthetic */ void AAz(Context context, Fragment fragment, 2OO r304) {
        8GW r0 = (8GW) fragment;
        1BL.A1F(r0, r304);
        r0.A02 = new 9I1(r304);
    }

    public /* bridge */ /* synthetic */ Fragment AJJ() {
        return new 8GW();
    }

    public 2QB AYk(Context context) {
        2QB r0 = 2RC.A00;
        11T.A0B(r0);
        return r0;
    }

    public Class AeN() {
        return 8GW.class;
    }

    public 2Rg BE9(Context context, boolean z) {
        Drawable drawable = context.getDrawable(4YV.A0I().A03(C1u3.A39));
        if (drawable != null) {
            return new 2Rg(drawable, 22, -1, 28, -1, false);
        }
        throw 1BK.A0h();
    }

    public String BEA(Context context) {
        return 1BK.A0u(context, 2131955680);
    }

    public String BG7(Context context) {
        11T.A0F(context, 0);
        return 1BK.A0u(context, 2131967352);
    }

    public ImmutableList BGN() {
        return 1BK.A0b();
    }

    public boolean BVp(Fragment fragment) {
        return false;
    }

    public boolean BVr(Fragment fragment) {
        return ((8GW) fragment).A06;
    }

    public void Bp7(boolean z) {
        if (z) {
            return;
        }
        1G1 A04 = 1Fw.A04((1EZ) 1Bn.A0A(16428));
        9OV r0 = (9OV) 1Br.A0B(this.A00);
        11T.A0F(A04, 0);
        1UG A08 = 1BK.A08(1Br.A02(r0.A00), 1BJ.A00(1064));
        if (A08.isSampled()) {
            A08.A7R("page_id", A04.A02);
            A08.BZL();
        }
    }

    public void Cjv(Fragment fragment) {
        ((8GW) fragment).A0B.A05(0, true);
    }

    public void Cv7(Fragment fragment, 2OW r303) {
        11T.A0F(r303, 1);
        ((8GW) fragment).A03 = new 9I2(r303);
    }
}
