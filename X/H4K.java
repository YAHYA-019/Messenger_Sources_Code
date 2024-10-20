package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.photos.editing.DoodleControlsLayout;
import com.facebook.widget.CustomFrameLayout;
import java.util.List;

/* loaded from: H4K.class */
public final class H4K extends CustomFrameLayout {
    public Hm1 A00;
    public GUI A01;
    public DoodleControlsLayout A02;

    public static void A00(H4K h4k) {
        h4k.A02.getClass();
        if (h4k.A01 == null) {
            ViewGroup viewGroup = (ViewGroup) h4k.getParent();
            Context context = viewGroup.getContext();
            11T.A0F(context, 1);
            View view = new View(context);
            ((GUI) view).A00 = (GSj) 1Bu.A00(115972).get();
            view.setLayerType(1, null);
            GSj gSj = ((GUI) view).A00;
            if (gSj != null) {
                gSj.setCallback(view);
                h4k.A01 = view;
                HUO huo = new HUO(h4k);
                GSj gSj2 = ((GUI) view).A00;
                if (gSj2 != null) {
                    gSj2.A03 = huo;
                    gSj2.A04 = new HUP(h4k);
                    view.setEnabled(false);
                    viewGroup.addView((View) h4k.A01, viewGroup.indexOfChild(h4k));
                    return;
                }
            }
            11T.A0L("doodleDrawable");
            throw 0Q8.createAndThrow();
        }
    }

    public void A0V() {
        GUI gui = this.A01;
        if (gui != null) {
            GSj gSj = gui.A00;
            if (gSj == null) {
                11T.A0L("doodleDrawable");
                throw 0Q8.createAndThrow();
            }
            List list = gSj.A09;
            if (!list.isEmpty()) {
                gSj.A00 = 0;
                list.clear();
                gSj.A08.clear();
                gSj.A05.set(gSj.getBounds());
                HUP hup = gSj.A04;
                if (hup != null) {
                    H4K h4k = hup.A00;
                    Hm1 hm1 = h4k.A00;
                    if (hm1 != null) {
                        hm1.A00();
                    }
                    DoodleControlsLayout doodleControlsLayout = h4k.A02;
                    if (doodleControlsLayout != null) {
                        doodleControlsLayout.A07.A00();
                    }
                }
                gSj.invalidateSelf();
            }
        }
        A0W();
    }

    public void A0W() {
        GUI gui = this.A01;
        if (gui != null) {
            gui.setEnabled(false);
        }
        DoodleControlsLayout doodleControlsLayout = this.A02;
        if (doodleControlsLayout != null) {
            doodleControlsLayout.A0V();
            this.A02.A07.A00();
        }
        Hm1 hm1 = this.A00;
        if (hm1 != null) {
            hm1.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r0.A09.isEmpty() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0X() {
        /*
            r301 = this;
            r0 = r301
            X.GUI r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2d
            r0 = r302
            X.GSj r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1b
            java.lang.String r0 = "doodleDrawable"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L1b:
            r0 = r302
            java.util.List r0 = r0.A09
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L31
        L2d:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L31:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4K.A0X():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.isEnabled() == false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEnabled() {
        /*
            r301 = this;
            r0 = r301
            X.GUI r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.isEnabled()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4K.isEnabled():boolean");
    }
}
