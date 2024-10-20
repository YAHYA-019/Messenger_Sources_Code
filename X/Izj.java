package X;

import java.io.File;

/* loaded from: Izj.class */
public final class Izj implements Runnable {
    public static final String __redex_internal_original_name = "ProcessingRecorderImpl$5";
    public final /* synthetic */ JHq A00;
    public final /* synthetic */ IAI A01;
    public final /* synthetic */ File A02;

    public Izj(JHq jHq, IAI iai, File file) {
        this.A01 = iai;
        this.A02 = file;
        this.A00 = jHq;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.JMp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.JMp, java.lang.Object] */
    @Override // java.lang.Runnable
    public void run() {
        I0E i0e;
        try {
            IAI iai = this.A01;
            File file = this.A02;
            JHq jHq = this.A00;
            if (iai.A0A != 0S2.A01) {
                throw AnonymousClass001.A0N("Must call prepare() before calling start()");
            }
            iai.A0A = 0S2.A0N;
            if (iai.A04 == null) {
                String absolutePath = file.getAbsolutePath();
                new I0E((JG6) null, iai.A09, (JMQ) null, (JMp) new Object(), absolutePath);
            } else {
                String absolutePath2 = file.getAbsolutePath();
                new I0E(iai.A04, iai.A09, (JMQ) null, (JMp) new Object(), absolutePath2);
            }
            iai.A0H = new HsV(i0e);
            iai.A09.D1F(new IcK(iai, jHq, 4), iai.A0B);
        } catch (Exception e) {
            this.A00.onError(e);
        }
    }
}
