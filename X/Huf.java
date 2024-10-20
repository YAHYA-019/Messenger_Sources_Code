package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: Huf.class */
public final class Huf {
    public CameraDevice A00;
    public CameraManager A01;
    public JGA A02;
    public HWu A03;
    public IEe A04;
    public IEU A05;
    public Gul A06;
    public I1R A07;
    public FutureTask A08;
    public boolean A09;
    public final HtV A0A;
    public final I5y A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public Huf(I5y i5y) {
        HtV htV = new HtV(i5y);
        this.A0B = i5y;
        this.A0A = htV;
    }

    public void A00() {
        synchronized (this) {
            FutureTask futureTask = this.A08;
            if (futureTask != null) {
                this.A0B.A08(futureTask);
                this.A08 = null;
            }
        }
    }

    public void A01(CaptureRequest.Builder builder, Ie3 ie3) {
        JLt jLt;
        this.A0A.A01("Can only reset focus on the Optic thread.");
        if (this.A04 == null || this.A05 == null || builder == null || this.A07 == null || !this.A0D || (jLt = this.A04.A09) == null) {
            return;
        }
        this.A0E = false;
        this.A0C = false;
        IEU ieu = this.A05;
        float A01 = IEU.A01(ieu, ieu.A06()) * 100.0f;
        IEU ieu2 = this.A05;
        Rect rect = ieu2.A04;
        MeteringRectangle[] A05 = IEU.A05(ieu2, ieu2.A0D);
        IEU ieu3 = this.A05;
        IEe.A01(rect, builder, this.A07, A05, IEU.A05(ieu3, ieu3.A0C), A01);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        GOo.A19(builder, key, 2);
        jLt.AEP(builder.build(), null, ie3);
        CameraManager cameraManager = this.A01;
        CameraDevice cameraDevice = this.A00;
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        Gul gul = this.A06;
        gul.getClass();
        int A00 = Hvk.A00(cameraManager, builder, gul, this.A07, id, 0);
        builder.set(key, 0);
        jLt.Ctz(builder.build(), null, ie3);
        if (A00 == 1) {
            GOo.A19(builder, key, 1);
            jLt.AEP(builder.build(), null, ie3);
            builder.set(key, 0);
        }
    }

    public void A02(CaptureRequest.Builder builder, Ie3 ie3, long j) {
        synchronized (this) {
            Callable j5r = new J5R(13, this, ie3, builder);
            A00();
            this.A08 = this.A0B.A02("reset_focus", j5r, j);
        }
    }

    public void A03(Ie3 ie3) {
        Gul gul;
        I1R i1r = this.A07;
        i1r.getClass();
        if (GOp.A1Y(I1R.A08, i1r)) {
            if (GOp.A1Y(I1R.A07, this.A07) && (gul = this.A06) != null && GOq.A1W(I82.A0Q, gul)) {
                this.A09 = true;
                ie3.A05 = new JGF() { // from class: X.Idt
                    public final void BzH(boolean z) {
                        Huf.this.A04(z ? 0S2.A0u : 0S2.A15, null);
                    }
                };
                return;
            }
        }
        ie3.A05 = null;
        this.A09 = false;
    }

    public void A04(Integer num, float[] fArr) {
        if (this.A02 != null) {
            I9z.A00(new J0x(this, num, fArr));
        }
    }
}
