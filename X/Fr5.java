package X;

import android.animation.Animator;
import android.content.Context;

/* loaded from: Fr5.class */
public final class Fr5 implements 29I {
    public final /* synthetic */ F4s A00;
    public final /* synthetic */ FyG A01;
    public final /* synthetic */ DLQ A02;
    public final /* synthetic */ String A03;

    public Fr5(F4s f4s, FyG fyG, DLQ dlq, String str) {
        this.A00 = f4s;
        this.A02 = dlq;
        this.A03 = str;
        this.A01 = fyG;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        F4s f4s = this.A00;
        Dq5 dq5 = f4s.A01;
        String str = dq5.A03;
        boolean z = dq5.A04;
        int i = dq5.A01;
        float f = dq5.A00;
        11T.A0F(str, 0);
        DLQ dlq = this.A02;
        GJj A07 = dlq.A07();
        8BO r315 = A07 != null ? new 8BO(0, dlq, A07, this.A01) : null;
        String str2 = this.A03;
        if (!11T.A0O(str2, dq5.A03)) {
            z = dlq.A0J(true);
            i = dlq.getInt(38, 1);
            f = 0.0f;
        }
        dq5.A03 = str2;
        dq5.A04 = z;
        dq5.A01 = i;
        dq5.A02 = r315;
        dq5.A00 = f;
        if (f4s.A00 == null) {
            return null;
        }
        F4s.A00(f4s);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        float B59;
        F4s f4s = this.A00;
        5Gk r0 = f4s.A00;
        if (r0 != null) {
            Dq5 dq5 = f4s.A01;
            if (r0.BSj()) {
                dq5.A04 = false;
                B59 = 1.0f;
            } else {
                dq5.A04 = r0.isPlaying();
                if (dq5.A01 != 0) {
                    dq5.A01 = r0.B7C();
                }
                B59 = r0.B59();
            }
            dq5.A00 = B59;
            Animator.AnimatorListener animatorListener = dq5.A02;
            if (animatorListener != null) {
                r0.CeR(animatorListener);
            }
            r0.pause();
        }
    }
}
