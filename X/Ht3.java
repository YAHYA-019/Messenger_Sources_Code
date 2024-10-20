package X;

import com.facebook.rtc.views.self.SelfOverlayContentView;

/* loaded from: Ht3.class */
public abstract class Ht3 {
    public static void A00(Gq8 gq8) {
        SelfOverlayContentView selfOverlayContentView = (SelfOverlayContentView) gq8.A01;
        SelfOverlayContentView.A02(selfOverlayContentView, selfOverlayContentView.getWidth(), selfOverlayContentView.getHeight());
        int width = selfOverlayContentView.getWidth();
        int height = selfOverlayContentView.getHeight();
        if (selfOverlayContentView.A03.A00 != null) {
            selfOverlayContentView.BO6();
            SelfOverlayContentView.A01(selfOverlayContentView, width, height);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0253, code lost:
    
        if (X.4YU.A0B(r0.A04).orientation != 2) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01() {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ht3.A01():void");
    }

    public void A02() {
        Gq8 gq8 = (Gq8) this;
        switch (gq8.A00) {
            case 11:
                C2475GeW.A00((C2475GeW) gq8.A01);
                return;
            case 13:
                ((GrU) gq8.A01).A0f();
                return;
            default:
                return;
        }
    }

    public void A03() {
        Gq8 gq8 = (Gq8) this;
        switch (gq8.A00) {
            case 5:
                GrD.A0A(gq8.A01);
                return;
            case 12:
                GrR.A09((GrR) gq8.A01);
                return;
            case 14:
                GrT.A03((GrT) gq8.A01);
                return;
            case 15:
                GrA.A03((GrA) gq8.A01);
                return;
            default:
                return;
        }
    }
}
