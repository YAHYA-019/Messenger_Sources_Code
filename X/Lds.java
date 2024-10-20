package X;

import android.app.Activity;
import android.content.Intent;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzc;
import java.util.concurrent.CountDownLatch;

/* loaded from: Lds.class */
public final class Lds implements C51o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Lds(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C51o
    public final void Bpv(C4Ez c4Ez) {
        C4Ez c4Ez2;
        if (this.A00 != 0) {
            ((CountDownLatch) this.A02).countDown();
            return;
        }
        11T.A0F(c4Ez, 0);
        if (c4Ez.A0E()) {
            ReviewInfo reviewInfo = (ReviewInfo) c4Ez.A05();
            1pK r0 = (1pK) this.A02;
            Activity A1P = r0.A1P();
            if (A1P != null) {
                Leo leo = (Leo) ((MDO) this.A01);
                zza zzaVar = (zza) reviewInfo;
                if (zzaVar.A01) {
                    c4Ez2 = new C4Ez();
                    c4Ez2.A0C(null);
                } else {
                    Intent A0D = C3o5.A0D(A1P, PlayCoreDialogWrapperActivity.class);
                    A0D.putExtra("confirmation_intent", zzaVar.A00);
                    A0D.putExtra("window_flags", DKD.A0B(A1P).getWindowSystemUiVisibility());
                    4FE r02 = new 4FE();
                    A0D.putExtra("result_receiver", new zzc(leo.A00, r02));
                    A1P.startActivity(A0D);
                    c4Ez2 = r02.A00;
                }
                11T.A0A(c4Ez2);
                c4Ez2.A08(new Ldn(r0, 1));
            }
        }
    }
}
