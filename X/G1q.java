package X;

import android.view.View;

/* loaded from: G1q.class */
public final /* synthetic */ class G1q implements Runnable {
    public static final String __redex_internal_original_name = "BondiOverflowAdapter$$ExternalSyntheticLambda0";
    public final /* synthetic */ View A00;
    public final /* synthetic */ MLq A01;

    public /* synthetic */ G1q(View view, MLq mLq) {
        this.A01 = mLq;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MLq mLq = this.A01;
        mLq.B06().onClick(this.A00);
    }
}