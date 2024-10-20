package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import java.util.Collections;

/* loaded from: I4v.class */
public final class I4v {
    public int A00;
    public Camera A01;
    public JGA A02;
    public HWt A03;
    public boolean A04;
    public final Htk A05;
    public final I5y A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public I4v(Htk htk, I5y i5y) {
        this.A06 = i5y;
        this.A05 = htk;
    }

    public static void A00(Point point, JGA jga, I4v i4v, Integer num) {
        if (jga != null) {
            HWt hWt = i4v.A03;
            if (point != null && hWt != null) {
                float[] fArr = {point.x, point.y};
                Matrix matrix = hWt.A00;
                Matrix A0F = GOn.A0F();
                matrix.invert(A0F);
                A0F.mapPoints(fArr);
                point.set((int) fArr[0], (int) fArr[1]);
            }
            I9z.A00(new SDS(point, jga, num));
        }
    }

    public void A01() {
        this.A06.A06("Focus reset must happen on the Optic thread.");
        if (this.A09 && this.A04) {
            this.A07 = false;
            this.A08 = false;
            A00(null, this.A02, this, 0S2.A01);
            Camera camera = this.A01;
            camera.getClass();
            camera.cancelAutoFocus();
            Gun A00 = this.A05.A00(this.A00);
            ((IA2) A00).A00.A02(I82.A0C, Collections.emptyList());
            ((IA2) A00).A00.A02(I82.A0f, Collections.emptyList());
            A00.A03();
            A00.A02();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        if (X.GOo.A1U(6, r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            r301 = this;
            r0 = r301
            X.I5y r0 = r0.A06
            r302 = r0
            java.lang.String r0 = "Setting focus mode for video must happen on the Optic thread."
            r303 = r0
            r0 = r302
            r1 = r303
            r0.A06(r1)
            r0 = r301
            boolean r0 = r0.A09
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2d
            r0 = r301
            r1 = 1
            r0.A0A = r1
            r0 = r301
            boolean r0 = r0.A07
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            r0.A04 = r1
        L2d:
            return
        L2e:
            r0 = r301
            X.Htk r0 = r0.A05
            r302 = r0
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r302
            r1 = r304
            X.Gun r0 = r0.A00(r1)
            r305 = r0
            r0 = r305
            X.Guh r0 = r0.A00
            r302 = r0
            android.graphics.Rect r0 = X.I9y.A00
            r303 = r0
            X.HX6 r0 = X.I1R.A0w
            r303 = r0
            r0 = r303
            r1 = r302
            java.util.List r0 = X.GOn.A1H(r0, r1)
            r302 = r0
            r0 = 3
            r306 = r0
            r0 = r306
            r1 = r302
            boolean r0 = X.GOo.A1U(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L70
            r0 = 6
            r306 = r0
            r0 = r306
            r1 = r302
            boolean r0 = X.GOo.A1U(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L81
        L70:
            r0 = r305
            X.I4E r0 = r0.A00
            r302 = r0
            X.HX7 r0 = X.I82.A0D
            r303 = r0
            r0 = r303
            r1 = r302
            r2 = r306
            X.I4E.A00(r0, r1, r2)
        L81:
            r0 = r305
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4v.A02():void");
    }

    public void A03(Rect rect, JGA jga) {
        Point point;
        this.A06.A06("Focus requests must be on the Optic thread. ");
        if (this.A09) {
            if (rect != null) {
                Htk htk = this.A05;
                if (GOp.A1Y(I1R.A0Z, htk.A01(this.A00))) {
                    Gun A00 = htk.A00(this.A00);
                    ((IA2) A00).A00.A02(I82.A0f, I9y.A00(rect));
                    A00.A02();
                }
            }
            if (this.A09) {
                Htk htk2 = this.A05;
                I1R A01 = htk2.A01(this.A00);
                HX6 hx6 = I1R.A0Y;
                if (GOp.A1Y(hx6, A01) || GOp.A1Y(I1R.A08, A01)) {
                    if (this.A08) {
                        Camera camera = this.A01;
                        camera.getClass();
                        camera.cancelAutoFocus();
                    }
                    this.A07 = false;
                    this.A08 = true;
                    this.A0A = false;
                    if (rect == null) {
                        point = null;
                    } else {
                        Gun A002 = htk2.A00(this.A00);
                        if (GOp.A1Y(hx6, htk2.A01(this.A00))) {
                            ((IA2) A002).A00.A02(I82.A0C, I9y.A00(rect));
                            point = new Point(rect.centerX(), rect.centerY());
                        } else {
                            point = new Point(0, 0);
                        }
                        IA2.A03(I82.A0D, A002, 1);
                        A002.A02();
                    }
                    A00(point, this.A02, this, 0S2.A00);
                    Camera camera2 = this.A01;
                    camera2.getClass();
                    camera2.autoFocus(new Rj0(point, jga, this));
                }
            }
        }
    }
}
