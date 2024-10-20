package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3g4, reason: invalid class name */
/* loaded from: 3g4.class */
public final class C3g4 implements Runnable {
    public static final String __redex_internal_original_name = "DefaultItemAnimator$2";
    public final /* synthetic */ 2NG A00;
    public final /* synthetic */ ArrayList A01;

    public C3g4(2NG r302, ArrayList arrayList) {
        this.A00 = r302;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            3Fs r0 = (3Fs) it.next();
            2NG r02 = this.A00;
            C2lb c2lb = r0.A05;
            View view = null;
            View view2 = c2lb == null ? null : c2lb.A0I;
            C2lb c2lb2 = r0.A04;
            if (c2lb2 != null) {
                view = c2lb2.A0I;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(((2NI) r02).A01);
                r02.A02.add(r0.A05);
                duration.translationX(r0.A02 - r0.A00);
                duration.translationY(r0.A03 - r0.A01);
                duration.alpha(0.0f).setListener(new GSC(view2, duration, r0, r02, 0)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                r02.A02.add(r0.A04);
                animate.translationX(0.0f).translationY(0.0f).setDuration(((2NI) r02).A01).alpha(1.0f).setListener(new GSC(view, animate, r0, r02, 1)).start();
            }
        }
        arrayList.clear();
        this.A00.A03.remove(arrayList);
    }
}
