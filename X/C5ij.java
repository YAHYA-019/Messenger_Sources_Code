package X;

import android.content.Intent;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebook.xapp.messaging.reactions.sendbar.fragment.ReactionsBarFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.5ij, reason: invalid class name */
/* loaded from: 5ij.class */
public abstract class C5ij implements C1ph {
    @Override // X.C1ph
    public void Bth(2Ov r302) {
    }

    @Override // X.C1ph
    public void Btk(2Ov r302) {
        String str;
        java.util.Map AWe;
        if (!(this instanceof 7QF)) {
            if (this instanceof C5ii) {
                C5ii c5ii = (C5ii) this;
                if (r302 instanceof C2vj) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(AnonymousClass000.A00(ActionId.ACTION_BAR_COMPLETE), C01e.A00(r302.getClass()));
                hashMap.put(1BJ.A00(173), Integer.valueOf(r302.hashCode()));
                if (r302 instanceof 1lN) {
                    str = ((1lN) r302).AWg();
                    if ((r302 instanceof C1lM) && (AWe = ((C1lM) r302).AWe()) != null) {
                        hashMap.putAll(AWe);
                    }
                } else {
                    str = "dialog";
                }
                Iterator it = c5ii.A00.A00.iterator();
                while (it.hasNext()) {
                    ((C1is) it.next()).A0I(str, hashMap, true);
                }
                return;
            }
            return;
        }
        11T.A0F(r302, 0);
        C6rj c6rj = ((7QF) this).A00;
        ReactionsBarFragment reactionsBarFragment = r302 instanceof ReactionsBarFragment ? (ReactionsBarFragment) r302 : null;
        RecyclerView A02 = c6rj.A04.A02();
        if (A02 != null) {
            A02.suppressLayout(true);
        }
        c6rj.A03 = true;
        if (reactionsBarFragment != null) {
            ReactionsBarFragment reactionsBarFragment2 = reactionsBarFragment.A0G;
            if (reactionsBarFragment2 != null) {
                c6rj.A00 = new WeakReference(reactionsBarFragment2);
                c6rj.A02 = true;
            }
            9Ur r0 = reactionsBarFragment.A07;
            if (r0 != null) {
                c6rj.A01 = new WeakReference(r0);
                r0.A04 = false;
                r0.A02 = false;
                r0.A03 = true;
                float f = (-1.0f) / 0.0f;
                r0.A00 = f;
                r0.A01 = f;
            }
        }
    }

    @Override // X.C1ph
    public void CR0(MotionEvent motionEvent) {
        if (this instanceof C5ii) {
            ((C5ii) this).A01.CQz(null, motionEvent);
        }
    }

    @Override // X.C1ph
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
