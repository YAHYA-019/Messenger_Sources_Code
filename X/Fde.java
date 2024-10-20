package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.acra.constants.ActionId;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;

/* loaded from: Fde.class */
public final class Fde implements GJM, LifecycleObserver {
    public Ewv A00;
    public boolean A01;
    public boolean A02;
    public final Fdd A03;
    public final Fdd A04;
    public final 1Br A05;
    public final 1Br A06;
    public final Context A07;

    public Fde(Context context, Fdd fdd, Fdd fdd2) {
        11T.A0F(context, 1);
        this.A07 = context;
        this.A03 = fdd;
        this.A04 = fdd2;
        this.A05 = 1Bu.A01(context, 99855);
        this.A06 = 1Bu.A01(context, 50178);
        this.A00 = new Ewv("", 0.0f, 0.0f, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0080, code lost:
    
        if (X.1BK.A0M(r0).AZr(r0, 36318479678780066L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(android.content.Context r301, androidx.lifecycle.LifecycleOwner r302, X.Fde r303) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fde.A00(android.content.Context, androidx.lifecycle.LifecycleOwner, X.Fde):void");
    }

    @Override // X.GJM
    public void Brm(Context context, LifecycleOwner lifecycleOwner) {
        A00(context, lifecycleOwner, this);
    }

    @Override // X.GJM
    public View Bs1(Context context, LifecycleOwner lifecycleOwner, Ecl ecl) {
        A00(context, lifecycleOwner, this);
        Fdd fdd = this.A04;
        int i = this.A00.A02;
        if (fdd.A00 != null) {
            C1F6 c1f6 = (C1F6) 1Br.A0B(fdd.A05);
            Context A04 = AbI.A04(fdd.A03);
            Ecs ecs = new Ecs(fdd);
            Context A01 = FbInjector.A01();
            AbL.A0y(c1f6);
            try {
                EpN epN = new EpN(A04, ecs, i);
                1Bn.A0K();
                FbInjector.A04(A01);
                fdd.A00 = epN;
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        }
        1G1 A03 = 1Br.A03(fdd.A08);
        EpN epN2 = fdd.A00;
        if (epN2 != null) {
            11T.A0F(A03, 0);
            C5op c5op = epN2.A00;
            if (c5op != null) {
                c5op.A00();
            }
            boolean A032 = 2yD.A03(1Br.A07(epN2.A05), 2342160642783522284L);
            BwO bwO = (BwO) 1Br.A0B(epN2.A04);
            int i2 = epN2.A01;
            C03z c03z = GraphQlCallInput.A02;
            String str = A03.A05;
            07S A02 = c03z.A02();
            GraphQlQueryParamSet A0N = 4YU.A0N(A02, str, "user_id");
            4YV.A1A(A02, A0N, "input");
            Object obj = bwO.A02.get();
            11T.A0A(obj);
            A0N.A04("preview_image_width", Integer.valueOf(EVN.A00((Resources) obj, (C09964s0) 1Br.A0B(bwO.A01), 4.0f, 0.0f, i2)));
            A0N.A03("fetch_animated_image", Boolean.valueOf(A032));
            epN2.A00 = ((Eua) 1Lm.A05(epN2.A02, A03, 99905)).A00(null, 7zM.A0L(A0N, new C01983tf(8IU.class, 7zK.A00(ActionId.FILE_SYSTEM_FAIL), 7zK.A00(Process.SD_STDOUT), -2130321579, 2970785274L, 2970785274L)), FwL.A00(epN2, 12));
        }
        return ((6tZ) 1Br.A0B(this.A06)).A05(new Fs7(ecl, this));
    }

    @Override // X.GJM
    public void CnC(Ewv ewv) {
        this.A00 = ewv;
    }

    public final void onDestroy() {
        this.A01 = false;
    }
}
