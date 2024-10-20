package X;

import android.animation.Animator;
import android.net.Uri;

/* renamed from: X.8io, reason: invalid class name */
/* loaded from: 8io.class */
public final class C8io extends 2Kb {
    public final int A00;
    public final Animator.AnimatorListener A01;
    public final Uri A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;
    public final 2lO A06;

    public C8io() {
        this(null, null, null, null, null, -1, true);
    }

    public C8io(Animator.AnimatorListener animatorListener, Uri uri, 2lO r304, Integer num, Integer num2, int i, boolean z) {
        this.A04 = num;
        this.A02 = uri;
        this.A00 = i;
        this.A05 = z;
        this.A01 = animatorListener;
        this.A03 = num2;
        this.A06 = r304;
    }

    public C2lt A0s(2lX r302) {
        11T.A0F(r302, 0);
        if (this.A04 == null && this.A02 == null) {
            throw AnonymousClass001.A0T("Either rawRes or uri must be provided to LottieComponent");
        }
        return new C2lt(this.A06, A2o.A00, 7zQ.A0r(r302, 7zQ.A0s(A2Q.A00, true), new DKU(this, 32)));
    }
}
