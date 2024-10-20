package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4e6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4e6.class */
public final class RunnableC05514e6 implements Runnable {
    public static final String __redex_internal_original_name = "DefaultItemAnimator$3";
    public final /* synthetic */ 2NG A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC05514e6(2NG r302, ArrayList arrayList) {
        this.A00 = r302;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2lb c2lb = (C2lb) it.next();
            2NG r0 = this.A00;
            View view = c2lb.A0I;
            ViewPropertyAnimator animate = view.animate();
            r0.A00.add(c2lb);
            animate.alpha(1.0f).setDuration(r0.A04()).setListener(new C31v(view, animate, r0, c2lb)).start();
        }
        arrayList.clear();
        this.A00.A01.remove(arrayList);
    }
}
