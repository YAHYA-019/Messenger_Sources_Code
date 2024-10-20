package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6vN, reason: invalid class name */
/* loaded from: 6vN.class */
public final class C6vN extends GestureDetector.SimpleOnGestureListener implements 6vJ, 6vK {
    public final 6vH A00;
    public final 6vI A01;
    public final List A02;
    public final List A03;

    public C6vN() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6vN(6vH r302, 6vI r303) {
        this.A00 = r302;
        this.A01 = r303;
        6vI r305 = null;
        6vJ[] r0 = {(6vJ) (r302 instanceof 6vJ ? r302 : null), r303 instanceof 6vJ ? r303 : null};
        11T.A0F(r0, 0);
        this.A02 = 02L.A08(r0);
        6vK[] r02 = {(6vK) (r302 instanceof 6vK ? r302 : null), r303 instanceof 6vK ? r303 : r305};
        11T.A0F(r02, 0);
        this.A03 = 02L.A08(r02);
    }

    public void Cmo(Capabilities capabilities) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((6vJ) it.next()).Cmo(capabilities);
        }
    }

    public void CwS(View view) {
        11T.A0F(view, 0);
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((6vK) it.next()).CwS(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r301.A01 != null) goto L6;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onDown(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r301
            X.6vH r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L17
            r0 = r301
            X.6vI r0 = r0.A01
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1a
        L17:
            r0 = 1
            r305 = r0
        L1a:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6vN.onDown(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        6vI r0 = this.A01;
        if (r0 != null && r0.A00.A00.get(6) && ((2yD) r0.A01.A00.get()).AZk(2342159556157384974L)) {
            r0.A03.AQN(new 7DB(0S2.A01));
            View view = (View) r0.A02.A00.get();
            if (view != null) {
                view.post(new AEG(view));
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z = false;
        11T.A0F(motionEvent, 0);
        6vH r0 = this.A00;
        if (r0 != null) {
            9ED.A00(r0.A00);
            z = true;
        }
        return z;
    }
}
