package X;

import android.content.Context;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: I3u.class */
public final class I3u {
    public Context A00;
    public HoE A01;
    public I4D A02;
    public I8q A03;
    public Hbn A04;
    public HWf A05;
    public JNI A06;
    public Executor A07;
    public final /* synthetic */ HiR A08;

    public I3u() {
    }

    public I3u(HiR hiR) {
        this.A08 = hiR;
        C00i c00i = hiR.A02;
        this.A00 = 1BK.A04(c00i);
        this.A07 = 1BK.A1E(hiR.A03);
        this.A04 = new Hbn(1BL.A0I(), hiR);
        this.A05 = new HWf(hiR);
        1G1 A0C = 4YV.A0C(1BK.A04(c00i));
        boolean AZk = 1BK.A0N(hiR.A04).AZk(36325205598818751L);
        if (!A0C.A07) {
            1Bn.A0E((Context) null, hiR.A00, 148160);
        }
        this.A06 = new QPLUserFlowImpl(AZk);
    }

    public Ij0 A00() {
        if (this.A01 == null) {
            this.A01 = new HoE((JQ8) this.A08.A01.A00.get(), false);
        }
        Executor executor = this.A07;
        executor.getClass();
        Context context = this.A00;
        context.getClass();
        I8q i8q = this.A03;
        i8q.getClass();
        Hbn hbn = this.A04;
        hbn.getClass();
        HWf hWf = this.A05;
        hWf.getClass();
        HoE hoE = this.A01;
        hoE.getClass();
        JNI jni = this.A06;
        jni.getClass();
        return new Ij0(context, hoE, this.A02, i8q, hbn, hWf, jni, executor);
    }

    public void A01(Hie hie, HgT hgT) {
        HiR hiR = this.A08;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16464);
        FbN fbN = (FbN) 1Bi.A03(98715);
        I8q i8q = new I8q((Context) hiR.A02.get(), hie, hgT, scheduledExecutorService, scheduledExecutorService);
        i8q.A05 = fbN.A00;
        this.A03 = i8q;
    }
}
