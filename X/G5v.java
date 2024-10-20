package X;

import android.view.View;
import java.util.Set;

/* loaded from: G5v.class */
public final class G5v implements Runnable {
    public static final String __redex_internal_original_name = "BloksViewpointVisibilityExtensionBinder$unbind$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ F5j A02;
    public final /* synthetic */ DLQ A03;
    public final /* synthetic */ FFj A04;
    public final /* synthetic */ Set A05;

    public G5v(View view, F5j f5j, DLQ dlq, FFj fFj, Set set, int i) {
        this.A04 = fFj;
        this.A01 = view;
        this.A05 = set;
        this.A03 = dlq;
        this.A02 = f5j;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.A03(this.A01, FFD.A05);
        this.A05.remove(this.A03);
        this.A02.A01.remove(this.A00);
    }
}
