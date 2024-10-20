package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;

/* loaded from: Ii2.class */
public abstract class Ii2 implements JNT {
    public final 1Br A00;
    public final 1Br A07;
    public final 1Br A08;
    public final PlayerOrigin A09;
    public final Hhu A0B;
    public final Hxm A0D;
    public final I2v A0E;
    public final HYc A0F;
    public final HcU A0G;
    public final HfB A0H;
    public final 1Br A04 = 1BK.A0C();
    public final 1Br A02 = 7zM.A0N();
    public final 1Br A03 = 1Bq.A00(115203);
    public final C52b A01 = (C52b) 1Bi.A03(115174);
    public final 6V3 A0A = (6V3) 1Bi.A03(115184);
    public final 1Br A06 = 1Bq.A00(115341);
    public final HcT A0C = new HcT();
    public final 1Br A05 = 1Bq.A00(115340);

    public Ii2(PlayerOrigin playerOrigin) {
        this.A09 = playerOrigin;
        I2v i2v = (I2v) 1Bi.A03(115336);
        this.A0E = i2v;
        Hxm hxm = (Hxm) 1Bi.A03(115337);
        this.A0D = hxm;
        this.A07 = 1Bq.A00(115335);
        this.A00 = 1Bq.A00(115333);
        this.A08 = 1Bq.A00(115176);
        this.A0B = (Hhu) 1Bi.A03(67688);
        this.A0H = new HfB(hxm, i2v);
        this.A0G = new HcU(hxm, i2v);
        this.A0F = new HYc(hxm);
    }

    public boolean AIO() {
        return this.A0E.A00();
    }

    public boolean ANQ() {
        return false;
    }

    public boolean APH(float f, boolean z, boolean z2) {
        return false;
    }

    public boolean APO(float f, boolean z, boolean z2) {
        return true;
    }

    public /* synthetic */ boolean ARB() {
        return false;
    }

    public boolean ATe() {
        I2v i2v = this.A0E;
        if (i2v.A03) {
            return i2v.A02;
        }
        boolean A04 = 2yD.A04(i2v.A0K, 36320025876314841L);
        i2v.A02 = A04;
        i2v.A03 = true;
        return A04;
    }

    public boolean BO1() {
        HzH hzH = (HzH) 1Br.A0B(this.A00);
        if (hzH.A03) {
            return hzH.A02;
        }
        boolean A04 = 2yD.A04(hzH.A04, 72340052562348864L);
        hzH.A02 = A04;
        hzH.A03 = true;
        return A04;
    }

    public boolean BO2() {
        I2v i2v = this.A0E;
        if (i2v.A0B) {
            return i2v.A0A;
        }
        boolean A04 = 2yD.A04(i2v.A0K, 36320025898138489L);
        i2v.A0A = A04;
        i2v.A0B = true;
        return A04;
    }

    public boolean CiF() {
        I2v i2v = this.A0E;
        if (i2v.A0D) {
            return i2v.A0C;
        }
        boolean A04 = 2yD.A04(i2v.A0K, 2342163035088173770L);
        i2v.A0C = A04;
        i2v.A0D = true;
        return A04;
    }

    public boolean D8l() {
        return this.A0E.A00();
    }

    public boolean D8m() {
        I2v i2v = this.A0E;
        if (i2v.A0I) {
            return i2v.A0H;
        }
        boolean A04 = 2yD.A04(i2v.A0K, 36320025886931752L);
        i2v.A0H = A04;
        i2v.A0I = true;
        return A04;
    }
}
