package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Fvu.class */
public final class Fvu implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fvu(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onFailure(Throwable th) {
        5SG r305;
        int i;
        AtomicBoolean atomicBoolean;
        switch (this.A00) {
            case 0:
                if (th == null) {
                    th = new Throwable();
                }
                ((1FX) this.A02).setException(th);
                return;
            case 1:
                r305 = (5SG) this.A02;
                i = -1;
                break;
            case 2:
                r305 = (5SG) this.A02;
                i = 1;
                break;
            case 3:
                C5xz c5xz = (C5xz) this.A01;
                Looper mainLooper = Looper.getMainLooper();
                if (11T.A0O(mainLooper.getThread(), Thread.currentThread())) {
                    c5xz.CHX(null);
                    return;
                } else {
                    new Handler(mainLooper).post(new G0B(c5xz));
                    return;
                }
            case 4:
                AbstractC08514n7.A00((04J) this.A02, EnumC07184j2.CLIENT_ERROR, null, ((AbstractC06534h6) this.A01).A00, 0Pz.A1B("GraphQL fetch failure: ", th));
                return;
            case 5:
                atomicBoolean = ((EoD) this.A01).A00;
                atomicBoolean.set(false);
                return;
            default:
                atomicBoolean = ((EoE) this.A01).A00;
                atomicBoolean.set(false);
                return;
        }
        r305.Bxs(i, th);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        2JX A0L;
        2BQ A0d;
        String str;
        Object obj3;
        2JY A0B;
        switch (this.A00) {
            case 0:
                AbF.A1W(this.A02, obj);
                return;
            case 1:
                5Ua r0 = (5Ua) obj;
                int i = r0.A00;
                boolean z = r0.A02;
                5SG r02 = (5SG) this.A02;
                if (z) {
                    r02.Bxs(i, new IOException(0Pz.A0E(i, "Status code: ", " Result: ", r0.A01)));
                    return;
                } else {
                    r02.COq(r0.A01, i);
                    return;
                }
            case 2:
                Ei1 ei1 = (Ei1) obj;
                int i2 = ei1.A00;
                5SG r03 = (5SG) this.A02;
                if (i2 == 0) {
                    r03.COq((String) null, 0);
                    return;
                } else {
                    r03.Bxs(i2, AbF.A1D(ei1.A01));
                    return;
                }
            case 3:
                ThreadSummary threadSummary = (ThreadSummary) obj;
                C5xz c5xz = (C5xz) this.A01;
                Looper mainLooper = Looper.getMainLooper();
                if (11T.A0O(mainLooper.getThread(), Thread.currentThread())) {
                    c5xz.CHX(threadSummary);
                    return;
                } else {
                    new Handler(mainLooper).post(new 7KM(c5xz, threadSummary));
                    return;
                }
            case 4:
                ((AbstractC06534h6) this.A01).A03((GraphQLResult) obj);
                return;
            case 5:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                EoD eoD = (EoD) this.A01;
                eoD.A00.set(false);
                if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0L = 1BL.A0L((2JY) obj2, -153865720, 498874505)) == null) {
                    return;
                }
                Context context = (Context) this.A02;
                Eux eux = (Eux) 1Hv.A02(context, 99540);
                1BK.A05().putBoolean("hide_dialtone_toggle", true);
                eux.A00(context, A0L.A22());
                A0d = 4YU.A0d(eoD.A02);
                str = "flex_optout_nux";
                A0d.A01(str);
                return;
            default:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                EoE eoE = (EoE) this.A01;
                eoE.A00.set(false);
                if (abstractC08294mh2 == null || (obj3 = abstractC08294mh2.A03) == null || (A0B = 1BK.A0B((2JY) obj3, 2JX.class, -640865446, -107229108)) == null) {
                    return;
                }
                Context context2 = (Context) this.A02;
                ((Eux) 1Hv.A02(context2, 99540)).A00(context2, 1BL.A0M(A0B, -837729363, -28055390).A22());
                A0d = 4YU.A0d(eoE.A02);
                str = "autoflex_jumpstart_nux";
                A0d.A01(str);
                return;
        }
    }
}
