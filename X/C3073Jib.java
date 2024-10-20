package X;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* renamed from: X.Jib, reason: case insensitive filesystem */
/* loaded from: Jib.class */
public final class C3073Jib extends LRX implements MKU, 6BL {
    public boolean A00;
    public LQZ A03;
    public Runnable A04;
    public boolean A05;
    public final /* synthetic */ Lij A07;
    public long A02 = -1;
    public int A01 = 0;
    public final Kig A06 = new Kig();

    public C3073Jib(Lij lij) {
        this.A07 = lij;
    }

    private void A00() {
        float signum;
        float f;
        if (this.A03 == null) {
            Kig kig = this.A06;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = (float) this.A02;
            int i = (kig.A00 + 1) % 20;
            kig.A00 = i;
            long[] jArr = kig.A02;
            jArr[i] = currentAnimationTimeMillis;
            float[] fArr = kig.A01;
            fArr[i] = f2;
            LQZ lqz = new LQZ(new Kdz());
            this.A03 = lqz;
            L8i l8i = new L8i();
            l8i.A02(1.0f);
            l8i.A03(200.0f);
            lqz.A07 = l8i;
            lqz.A02 = f2;
            lqz.A09 = true;
            lqz.A04(this);
            LQZ lqz2 = this.A03;
            int i2 = kig.A00;
            if (i2 != 0 || jArr[i2] != Long.MIN_VALUE) {
                long j = jArr[i2];
                int i3 = 0;
                long j2 = j;
                while (true) {
                    long j3 = j2;
                    long j4 = jArr[i2];
                    if (j4 == Long.MIN_VALUE) {
                        break;
                    }
                    float f3 = (float) (j - j4);
                    float abs = (float) Math.abs(j4 - j3);
                    if (f3 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    if (i2 == 0) {
                        i2 = 20;
                    }
                    i2--;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    } else {
                        j2 = j4;
                    }
                }
                if (i3 >= 2) {
                    if (i3 == 2) {
                        int i4 = i2 - 1;
                        if (i2 == 0) {
                            i4 = 19;
                        }
                        float f4 = (float) (j - jArr[i4]);
                        if (f4 != 0.0f) {
                            signum = (fArr[i2] - fArr[i4]) / f4;
                        }
                    } else {
                        int i5 = (((i2 - i3) + 20) + 1) % 20;
                        int i6 = ((i2 + 1) + 20) % 20;
                        long j5 = jArr[i5];
                        float f5 = fArr[i5];
                        int i7 = i5 + 1;
                        float f6 = 0.0f;
                        for (int i8 = i7 % 20; i8 != i6; i8 = (i8 + 1) % 20) {
                            long j6 = jArr[i8];
                            float f7 = (float) (j6 - j5);
                            if (f7 != 0.0f) {
                                float f8 = fArr[i8];
                                float f9 = (f8 - f5) / f7;
                                f6 += (f9 - ((float) (Math.signum(f6) * Math.sqrt(Math.abs(f6) * 2.0f)))) * Math.abs(f9);
                                if (i8 == i7) {
                                    f6 *= 0.5f;
                                }
                                f5 = f8;
                                j5 = j6;
                            }
                        }
                        signum = (float) (Math.signum(f6) * Math.sqrt(Math.abs(f6) * 2.0f));
                    }
                    f = signum * 1000.0f;
                    lqz2.A03 = f;
                    lqz2.A00 = (float) (this.A07.A04 + 1);
                    lqz2.A01 = -1.0f;
                    lqz2.A04 = 4.0f;
                    JQy.A1P(new LQa(this), lqz2.A0C);
                }
            }
            f = 0.0f;
            lqz2.A03 = f;
            lqz2.A00 = (float) (this.A07.A04 + 1);
            lqz2.A01 = -1.0f;
            lqz2.A04 = 4.0f;
            JQy.A1P(new LQa(this), lqz2.A0C);
        }
    }

    public void A03() {
        Lij lij = this.A07;
        long j = 0;
        if (lij.A04 == 0) {
            j = 1;
        }
        lij.A0U(j, this.A02);
        this.A02 = j;
    }

    public void A04() {
        this.A00 = true;
        int i = this.A01;
        if (i == 1) {
            this.A01 = 0;
            A87();
        } else if (i == 2) {
            this.A01 = 0;
            A89(this.A04);
        }
    }

    public /* synthetic */ void A05(float f, boolean z) {
        Lij lij;
        MLT mlt;
        boolean z2;
        if (z) {
            return;
        }
        if (f < 1.0f) {
            JiR jiR = this.A07;
            long j = jiR.A04;
            ArrayList arrayList = jiR.A02;
            Lij lij2 = 0 >= arrayList.size() ? null : (Lij) arrayList.get(0);
            lij = lij2.A09;
            lij2.A09 = null;
            long j2 = -1;
            jiR.A0U(j2, this.A02);
            jiR.A0U(j, j2);
            this.A02 = j;
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
            jiR.A0F.clear();
            if (lij == null) {
                return;
            }
            mlt = MLT.A01;
            z2 = true;
        } else {
            lij = this.A07;
            mlt = MLT.A01;
            z2 = false;
        }
        Lij.A09(mlt, lij, lij, z2);
    }

    public void A87() {
        if (!this.A00) {
            this.A01 = 1;
            this.A04 = null;
            return;
        }
        A00();
        LQZ lqz = this.A03;
        float f = (float) (this.A07.A04 + 1);
        if (lqz.A08) {
            lqz.A05 = f;
            return;
        }
        L8i l8i = lqz.A07;
        if (l8i == null) {
            l8i = new L8i(f);
            lqz.A07 = l8i;
        }
        l8i.A02 = f;
        lqz.A03();
    }

    public void A89(Runnable runnable) {
        this.A04 = runnable;
        if (!this.A00) {
            this.A01 = 2;
            return;
        }
        A00();
        LQZ lqz = this.A03;
        if (lqz.A08) {
            lqz.A05 = 0.0f;
            return;
        }
        L8i l8i = lqz.A07;
        if (l8i == null) {
            l8i = new L8i(0.0f);
            lqz.A07 = l8i;
        }
        l8i.A02 = 0.0d;
        lqz.A03();
    }

    public boolean BVE() {
        return this.A00;
    }

    public void Bj6(LQZ lqz, float f, float f2) {
        Lij lij = this.A07;
        long max = Math.max(-1, Math.min(lij.A04 + 1, Math.round(f)));
        lij.A0U(max, this.A02);
        this.A02 = max;
    }

    public void CRm(Lij lij) {
        this.A05 = true;
    }

    public void Cne(long j) {
        if (this.A03 != null) {
            throw AnonymousClass001.A0N("setCurrentPlayTimeMillis() called after animation has been started");
        }
        long j2 = this.A02;
        if (j == j2 || !this.A00) {
            return;
        }
        if (!this.A05) {
            if (j != 0 || j2 <= 0) {
                long j3 = this.A07.A04;
                if (j == j3 && j2 < j3) {
                    j = j3 + 1;
                }
            } else {
                j = -1;
            }
            if (j != j2) {
                this.A07.A0U(j, j2);
                this.A02 = j;
            }
        }
        Kig kig = this.A06;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (kig.A00 + 1) % 20;
        kig.A00 = i;
        kig.A02[i] = currentAnimationTimeMillis;
        kig.A01[i] = (float) j;
    }

    public long getDurationMillis() {
        return this.A07.A04;
    }
}
