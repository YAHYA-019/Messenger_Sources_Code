package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: La7.class */
public final class La7 implements JTZ {
    public int A00;
    public float A01 = 1.0f;
    public MCX A02;
    public final AudioManager A03;
    public final LFv A04;

    public La7(Context context, Handler handler, MCX mcx) {
        Object systemService = context.getApplicationContext().getSystemService("audio");
        systemService.getClass();
        this.A03 = (AudioManager) systemService;
        this.A02 = mcx;
        this.A04 = new LFv(handler, this);
        this.A00 = 0;
    }

    public static void A00(La7 la7, int i) {
        JT2 jt2 = la7.A02;
        if (jt2 != null) {
            JT0 jt0 = jt2.A00;
            JT0.A0D(jt0);
            boolean z = jt0.A0E.A0F;
            int i2 = 1;
            if (z && i != 1) {
                i2 = 2;
            }
            JT0.A0F(jt0, i, i2, z);
        }
    }

    public static void A01(La7 la7, int i) {
        if (la7.A00 != i) {
            la7.A00 = i;
            float f = 1.0f;
            if (i == 3) {
                f = 0.2f;
            }
            if (la7.A01 != f) {
                la7.A01 = f;
                JT2 jt2 = la7.A02;
                if (jt2 != null) {
                    JT0 jt0 = jt2.A00;
                    JT0 jt02 = JT0.$redex_init_class;
                    JT0.A0I(jt0, Float.valueOf(jt0.A00 * jt0.A0e.BKV()), 1, 2);
                }
            }
        }
    }

    public float BKV() {
        return this.A01;
    }

    public int D6Z(boolean z, int i) {
        int i2 = -1;
        if (this.A00 != 0) {
            A01(this, 0);
        }
        if (z) {
            i2 = 1;
        }
        return i2;
    }

    public void release() {
        this.A02 = null;
        if (this.A00 != 0) {
            A01(this, 0);
        }
    }
}
