package X;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Idf.class */
public final class Idf implements JG9, JGB {
    public JG9 A00;
    public final JNk A02;
    public volatile JGC A03;
    public volatile boolean A05;
    public volatile boolean A06;
    public volatile UUID A04 = UUID.randomUUID();
    public AtomicInteger A01 = new AtomicInteger();

    public Idf(JNk jNk) {
        this.A02 = jNk;
    }

    public void A00(JGC jgc) {
        if (this.A03 != jgc) {
            if (this.A03 != null) {
                this.A02.Cep(this.A03);
            }
            this.A03 = jgc;
            if (this.A03 != null) {
                this.A02.A6p(this.A03);
            }
        }
    }

    public boolean A01() {
        boolean z = false;
        if (this.A05) {
            this.A05 = false;
            if (this.A03 != null) {
                this.A02.Cep(this.A03);
            }
            this.A02.CeF(this);
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r301.A02.isConnected() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r301
            boolean r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r301
            X.JNk r0 = r0.A02
            r303 = r0
            r0 = r303
            boolean r0 = r0.isConnected()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L28
        L24:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L28:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Idf.A02():boolean");
    }

    @Override // X.JG9
    public void BwL(J7E j7e) {
        JG9 jg9;
        int i = j7e.mCameraError;
        String message = j7e.getMessage();
        if (i == 2 || i == 100) {
            A01();
        } else {
            this.A02.CeF(this);
        }
        if (!this.A06 || (jg9 = this.A00) == null) {
            return;
        }
        jg9.BwL(new J7E(i, message));
        this.A00 = null;
    }

    public void C4s(String str, String str2) {
        JG9 jg9;
        A01();
        String A0W = 0Pz.A0W("Local Eviction from: ", str2);
        if (!this.A06 || (jg9 = this.A00) == null) {
            return;
        }
        jg9.BwL(new J7E(2, A0W));
        this.A00 = null;
    }
}
