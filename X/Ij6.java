package X;

import android.media.MediaFormat;

/* loaded from: Ij6.class */
public final class Ij6 implements JMi {
    public int A00 = 0;
    public final 4RJ A01;
    public final JMi A02;

    public Ij6(4RJ r302, JMi jMi) {
        this.A02 = jMi;
        this.A01 = r302;
    }

    @Override // X.JMi
    public void AHJ(String str) {
        this.A02.AHJ(this.A01.getCanonicalPath());
    }

    @Override // X.JMi
    public void Cm1(MediaFormat mediaFormat) {
        this.A02.Cm1(mediaFormat);
        this.A01.A01();
    }

    @Override // X.JMi
    public void Cs6(int i) {
        this.A02.Cs6(i);
        this.A01.A01();
    }

    @Override // X.JMi
    public void CwH(MediaFormat mediaFormat) {
        this.A02.CwH(mediaFormat);
        this.A01.A01();
    }

    @Override // X.JMi
    public void DAz(JJ8 jj8) {
        this.A02.DAz(jj8);
        if (this.A00 % 2 == 0) {
            this.A01.A01();
        }
        this.A00++;
    }

    @Override // X.JMi
    public void DBN(JJ8 jj8) {
        this.A02.DBN(jj8);
        if (this.A00 % 2 == 0) {
            this.A01.A01();
        }
        this.A00++;
    }

    @Override // X.JMi
    public void start() {
        this.A02.start();
        this.A01.A01();
    }

    @Override // X.JMi
    public void stop() {
        this.A02.stop();
        this.A01.A00();
    }
}
