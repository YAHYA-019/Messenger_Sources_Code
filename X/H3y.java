package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.facebook.wearable.common.comms.rtc.hera.intf.IVideoSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: H3y.class */
public final class H3y extends H3z {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public Function2 A04;
    public final int A05;
    public final SurfaceTexture A06;
    public final Hhw A07;
    public final Surface A09;
    public volatile boolean A0B;
    public final float[] A08 = GOn.A1a();
    public final RRR A0A = new RRR();

    public H3y(Hhw hhw) {
        this.A07 = hhw;
        if (!11T.A0O(Thread.currentThread(), hhw.A04)) {
            throw AbstractC2327GOs.A0N("HeraSurfaceVideoInputImpl", "current thread is not renderThread.");
        }
        hhw.A00.BcD();
        int A00 = Hw5.A00(36197);
        this.A05 = A00;
        SurfaceTexture surfaceTexture = new SurfaceTexture(A00);
        surfaceTexture.setOnFrameAvailableListener(new IGg(this, 4));
        this.A06 = surfaceTexture;
        this.A09 = new Surface(surfaceTexture);
    }

    @Override // X.Ikm
    public void A00(int i, int i2, int i3) {
        Thread currentThread = Thread.currentThread();
        Hhw hhw = this.A07;
        if (!11T.A0O(currentThread, hhw.A04)) {
            throw AbstractC2327GOs.A0N("HeraSurfaceVideoInputImpl", "current thread is not renderThread.");
        }
        if (this.A0B) {
            if (A04()) {
                RRR rrr = this.A0A;
                float[] fArr = this.A08;
                11T.A0F(fArr, 0);
                rrr.A00 = RVr.A00(fArr);
                rrr.A01 = true;
            }
            RaA A00 = super.A02.A00(i3);
            float f = i;
            float f2 = f * A00.A01;
            int A01 = 0KF.A01(f2);
            float f3 = i2;
            float f4 = f3 * A00.A00;
            int A012 = 0KF.A01(f4);
            RRR rrr2 = this.A0A;
            rrr2.A00(this.A01, this.A00, A01, A012, i3 % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
            QV8 qv8 = hhw.A01;
            int i4 = this.A05;
            float[] fArr2 = rrr2.A02;
            int i5 = this.A01;
            int i6 = this.A00;
            int A013 = 0KF.A01(f * A00.A02);
            int A014 = 0KF.A01(f3 * A00.A03);
            int A015 = 0KF.A01(f2);
            int A016 = 0KF.A01(f4);
            I8Q.A00(qv8, 0S2.A00, fArr2, i5, i6, A015, A016);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i4);
            AbstractC2326GOr.A0r(A013, A014, A015, A016, 36197);
        }
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink
    public void addSurfaceListener(Function1 function1) {
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public Function2 getOnSinkParamsChanged() {
        return this.A04;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public IVideoSize getSinkSize() {
        return null;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink
    public Surface getSurface() {
        return this.A09;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public void notifySourceSizeChanged(int i, int i2) {
        this.A07.A04.A02().post(new SDs(this, i, i2));
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public void release() {
        this.A07.A04.A05(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink
    public void removeSurfaceListener(Function1 function1) {
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public void setOnSinkParamsChanged(Function2 function2) {
        this.A04 = function2;
    }
}
