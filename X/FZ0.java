package X;

import androidx.lifecycle.LifecycleObserver;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.TreeJNI;
import java.util.List;

/* loaded from: FZ0.class */
public final class FZ0 implements LifecycleObserver {
    public final /* synthetic */ FyG A00;

    public FZ0(FyG fyG) {
        this.A00 = fyG;
    }

    public void onActivityPause() {
        int i;
        GDg[] gDgArr;
        FxZ A02 = FJ6.A02(this.A00);
        if (A02.A0O) {
            return;
        }
        List list = A02.A0G;
        synchronized (list) {
            gDgArr = (GDg[]) list.toArray(new GDg[0]);
        }
        for (GDg gDg : gDgArr) {
            java.util.Map map = A02.A08;
            Fwh fwh = (Fwh) gDg;
            Object obj = map.get(fwh.A06);
            Runnable runnable = fwh.A01;
            if (runnable != null && (obj instanceof TreeJNI)) {
                fwh.A00 = (TreeJNI) obj;
                runnable.run();
                fwh.A01 = null;
            }
        }
    }

    public void onActivityResume() {
        int i;
        GDg[] gDgArr;
        FxZ A02 = FJ6.A02(this.A00);
        if (A02.A0O) {
            return;
        }
        List list = A02.A0G;
        synchronized (list) {
            gDgArr = (GDg[]) list.toArray(new GDg[0]);
        }
        for (GDg gDg : gDgArr) {
            ExB exB = A02.A02;
            Fwh fwh = (Fwh) gDg;
            PandoGraphQLConsistencyJNI graphQLConsistency = fwh.A04.graphQLConsistency();
            TreeJNI treeJNI = fwh.A00;
            if (treeJNI != null) {
                Fkt fkt = fwh.A02;
                if (graphQLConsistency != null) {
                    FzK fzK = new FzK(graphQLConsistency.subscribe(treeJNI, TreeJNI.class, fkt, FxX.A01).cancelToken);
                    fwh.A01 = fzK;
                    exB.A01(fzK);
                    fwh.A00 = null;
                }
            }
        }
    }
}
