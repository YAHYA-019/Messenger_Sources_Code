package X;

import java.util.concurrent.CancellationException;

/* loaded from: J1k.class */
public final class J1k implements Runnable {
    public static final String __redex_internal_original_name = "Task$15";
    public final /* synthetic */ HlR A00;
    public final /* synthetic */ C4cw A01;
    public final /* synthetic */ C05034cn A02;
    public final /* synthetic */ C05104cu A03;

    public J1k(HlR hlR, C4cw c4cw, C05034cn c05034cn, C05104cu c05104cu) {
        this.A00 = hlR;
        this.A03 = c05104cu;
        this.A01 = c4cw;
        this.A02 = c05034cn;
    }

    @Override // java.lang.Runnable
    public void run() {
        HlR hlR = this.A00;
        if (hlR != null && hlR.A00.A01()) {
            this.A03.A00();
            return;
        }
        try {
            C05034cn c05034cn = (C05034cn) this.A01.D4C(this.A02);
            if (c05034cn == null) {
                this.A03.A02(null);
            } else {
                c05034cn.A06(new ILt(this, 0));
            }
        } catch (CancellationException unused) {
            this.A03.A00();
        } catch (Exception e) {
            this.A03.A01(e);
        }
    }
}
