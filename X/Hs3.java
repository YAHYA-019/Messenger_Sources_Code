package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.facebook.inject.FbInjector;
import java.util.concurrent.ExecutorService;

/* loaded from: Hs3.class */
public final class Hs3 {
    public final 1De A00;
    public final 1Br A01 = 1BK.A0C();
    public final Gyn A02;

    public Hs3(1De r302) {
        this.A00 = r302;
        this.A02 = (Gyn) 1De.A00(r302, 115664);
    }

    public final Gw0 A00() {
        Context A00 = FbInjector.A00();
        HgZ hgZ = (HgZ) 1De.A00(this.A00, 115667);
        JLv jLv = (JLv) 1Bi.A03(115662);
        JKQ jkq = (JKQ) 1Bi.A03(115645);
        11T.A0D(A00);
        Gyn gyn = this.A02;
        ExecutorService A1G = GOp.A1G(gyn.A03);
        HwZ hwZ = HwZ.A00;
        2Zs A002 = 2Zo.A00();
        1BK.A1M(A00, hgZ);
        7zS.A18(2, jLv, hwZ, A002);
        return new Gw0(A00, gyn, jkq, jLv, hgZ, hwZ, null, A1G, A002, false);
    }

    public final If6 A01(JGN jgn) {
        Context A00 = FbInjector.A00();
        1BY r0 = this.A00.A00;
        HgZ hgZ = (HgZ) 1Bn.A0E((Context) null, r0, 115667);
        AudioManager audioManager = (AudioManager) 7zN.A0l(GOn.A0C(r0), 1, 100191);
        1BV A01 = 1BV.A01(r0, 115666);
        JLv jLv = (JLv) 1Bi.A03(115662);
        JKQ jkq = (JKQ) 1Bi.A03(115645);
        I5D i5d = (I5D) 1Bi.A03(115690);
        if (Build.VERSION.SDK_INT >= 31 && 1Br.A07(this.A01).AZk(36326988008413087L)) {
            11T.A0D(A00);
            Gyn gyn = this.A02;
            return new Gyl(A00, audioManager, i5d, gyn, jgn, jkq, jLv, new HuN((AudioManager) 7zN.A0l(GOn.A0C(r0), 1, 100191), i5d), hgZ, GOp.A1G(gyn.A03), 2Zo.A00());
        }
        11T.A0D(A00);
        I7g i7g = (I7g) A01.get();
        Gyn gyn2 = this.A02;
        return new Gyj(A00, audioManager, i5d, i7g, gyn2, jgn, jkq, jLv, new HuN((AudioManager) 7zN.A0l(GOn.A0C(r0), 1, 100191), i5d), hgZ, GOp.A1G(gyn2.A03), 2Zo.A00());
    }
}
