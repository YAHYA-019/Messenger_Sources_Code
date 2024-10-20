package X;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: Hqf.class */
public final class Hqf {
    public Context A00;
    public JIC A01;
    public JJB A02;
    public I8c A03;
    public JGv A04;
    public IFD A05;
    public JO9 A06;
    public JGx A07;
    public JGy A08;
    public JKb A09;
    public JLT A0A;
    public JJI A0B;
    public Hkg A0C;
    public JH6 A0D;
    public ExecutorService A0E;

    /* JADX WARN: Type inference failed for: r0v74, types: [X.JMX, X.IjP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, X.JGv] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, X.JJI] */
    public HkP A00() {
        this.A00.getClass();
        this.A0C.getClass();
        this.A07.getClass();
        this.A0E.getClass();
        this.A0A.getClass();
        this.A08.getClass();
        if (this.A0B == null) {
            this.A0B = new Object();
        }
        if (this.A06 == null) {
            this.A06 = new IjG(this.A00);
        }
        if (this.A02 == null) {
            this.A02 = HNo.A00;
        }
        if (this.A04 == null) {
            this.A04 = new Object();
        }
        if (this.A01 != null) {
            I0d i0d = new I0d(this.A0C);
            Hkg hkg = this.A0C;
            JMX jmx = hkg.A07;
            I8v i8v = hkg.A06;
            JIC jic = this.A01;
            HashMap A1E = GOn.A1E(2);
            A1E.put("flow_context", "TranscodeUtilsParams");
            A1E.put("waterfall_id", GOo.A0u());
            HuI huI = new HuI(jic, i8v, A1E);
            ?? obj = new Object();
            ((IjP) obj).A01 = jmx;
            ((IjP) obj).A00 = huI;
            i0d.A07 = obj;
            this.A0C = new Hkg(i0d);
        }
        if (this.A0D == null) {
            this.A0D = new Ik7(new IEP(), this.A0B);
        }
        if (this.A03 == null) {
            this.A03 = new I8c();
        }
        return new HkP(this);
    }
}
