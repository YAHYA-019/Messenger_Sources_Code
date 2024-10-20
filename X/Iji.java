package X;

import android.media.MediaFormat;

/* loaded from: Iji.class */
public final class Iji implements JMz {
    public int A00;
    public boolean A01;
    public final 4RJ A02;
    public final JMz A03;

    public Iji(4RJ r302, JMz jMz) {
        this.A03 = jMz;
        this.A02 = r302;
    }

    @Override // X.JMz
    public void AHJ(String str) {
        this.A03.AHJ(this.A02.getCanonicalPath());
    }

    @Override // X.JMz
    public String Ayf() {
        return this.A03.Ayf();
    }

    @Override // X.JMz
    public boolean BWK() {
        return this.A01;
    }

    @Override // X.JMz
    public void Cm1(MediaFormat mediaFormat) {
        this.A03.Cm1(mediaFormat);
        this.A02.A01();
    }

    @Override // X.JMz
    public void Cs6(int i) {
        this.A03.Cs6(i);
        this.A02.A01();
    }

    @Override // X.JMz
    public void CwH(MediaFormat mediaFormat) {
        this.A03.CwH(mediaFormat);
        this.A02.A01();
    }

    @Override // X.JMz
    public void DB0(JKa jKa) {
        this.A03.DB0(jKa);
        if (this.A00 % 2 == 0) {
            this.A02.A01();
        }
        this.A00++;
    }

    @Override // X.JMz
    public void DBO(JKa jKa) {
        this.A03.DBO(jKa);
        if (this.A00 % 2 == 0) {
            this.A02.A01();
        }
        this.A00++;
    }

    @Override // X.JMz
    public void start() {
        this.A03.start();
        this.A01 = true;
    }

    @Override // X.JMz
    public void stop() {
        this.A03.stop();
        this.A01 = false;
        this.A02.A00();
    }
}
