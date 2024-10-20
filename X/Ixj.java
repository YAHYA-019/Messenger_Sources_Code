package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import java.util.Iterator;

/* loaded from: Ixj.class */
public final class Ixj implements Runnable {
    public static final String __redex_internal_original_name = "CameraLifecycleNotifier$7";
    public final /* synthetic */ View A00;
    public final /* synthetic */ HrO A01;

    public Ixj(View view, HrO hrO) {
        this.A01 = hrO;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            it.next();
            View view = this.A00;
            if ((view.getContext() instanceof Activity) && view.getId() != -1) {
                try {
                    view.getResources().getResourceName(view.getId());
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
    }
}
