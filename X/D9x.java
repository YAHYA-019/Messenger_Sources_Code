package X;

import androidx.lifecycle.LiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D9x.class */
public final class D9x implements Runnable {
    public static final String __redex_internal_original_name = "ProactiveWarningMsysBannerManager$launchAdditionalActionsPage$1";
    public final /* synthetic */ 1pK A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ 7Fn A02;
    public final /* synthetic */ C8zy A03;

    public D9x(1pK r302, ThreadKey threadKey, 7Fn r304, C8zy c8zy) {
        this.A02 = r304;
        this.A00 = r302;
        this.A01 = threadKey;
        this.A03 = c8zy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlT blT = (BlT) 1Br.A0B(this.A02.A01);
        1pK r0 = this.A00;
        ThreadKey threadKey = this.A01;
        C5yl c5yl = C5yl.A0G;
        String string = ((1qX) this.A03).mResultSet.getString(0, 1);
        if (string != null) {
            6Im r02 = (6In) 1Br.A0B(blT.A00);
            if (r0.isAdded()) {
                LiveData A07 = 7zT.A07(threadKey);
                A07.observe(r0.getViewLifecycleOwner(), new Ca7(r0, 7zM.A0h(r02.A01, 68427), r02, threadKey, c5yl, A07, string, 0));
            }
        }
    }
}
