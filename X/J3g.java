package X;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.util.concurrent.CountDownLatch;

/* loaded from: J3g.class */
public final class J3g implements Runnable {
    public static final String __redex_internal_original_name = "GlProcessorGraph$renderSingleOutputInSeparateThread$1";
    public final /* synthetic */ Icn A00;
    public final /* synthetic */ JMv A01;
    public final /* synthetic */ JMh A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ CountDownLatch A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public J3g(Icn icn, JMv jMv, JMh jMh, Integer num, CountDownLatch countDownLatch, boolean z, boolean z2) {
        this.A00 = icn;
        this.A02 = jMh;
        this.A01 = jMv;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = num;
        this.A04 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Icn icn = this.A00;
            if (icn.A0a) {
                Long l = icn.A0Y;
                if (l != null) {
                    GLES20.glFlush();
                    long longValue = l.longValue();
                    GLES30.glWaitSync(longValue, 0, -1);
                    GLES30.glDeleteSync(longValue);
                }
                icn.A0Y = null;
                icn.A0X = Icn.A01(icn, this.A01, this.A02, this.A03, true, this.A06, this.A05);
                icn.A0Z = Icn.A04(icn, icn.A0Z);
            }
        } finally {
            this.A04.countDown();
        }
    }
}
