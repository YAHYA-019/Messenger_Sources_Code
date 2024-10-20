package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.advancedcryptotransport.model.PeerDevice;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.List;

/* renamed from: X.Axk, reason: case insensitive filesystem */
/* loaded from: Axk.class */
public final class C1955Axk extends 1LH {
    public final BfA A00;
    public final MigColorScheme A01;
    public final C5xv A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C1955Axk(BfA bfA, MigColorScheme migColorScheme, C5xv c5xv, String str, String str2, List list, boolean z) {
        11T.A0F(str, 2);
        this.A01 = migColorScheme;
        this.A03 = str;
        this.A00 = bfA;
        this.A02 = c5xv;
        this.A04 = str2;
        this.A06 = z;
        this.A05 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v5 */
    /* JADX WARN: Type inference failed for: r308v6 */
    /* JADX WARN: Type inference failed for: r308v7 */
    /* JADX WARN: Type inference failed for: r308v9, types: [android.text.SpannableString] */
    public 1LI A0s(C2k5 c2k5) {
        CharSequence A0d;
        String str;
        11T.A0F(c2k5, 0);
        1Br A00 = 1Bu.A00(83250);
        1Br A002 = 1Bu.A00(83585);
        1Br A003 = 1Bu.A00(83586);
        1Br A01 = 1Bu.A01(3vP.A00(c2k5), 100160);
        1Br A012 = 1Bu.A01(3vP.A00(c2k5), 83587);
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, new 2lT(0S2.A01, 1.0f));
        MigColorScheme migColorScheme = this.A01;
        int BDl = migColorScheme.BDl();
        Integer num = 0S2.A00;
        2lO A0L = 4YV.A0L(A0g, num, 7zL.A0j(BDl), 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        C5yw A004 = C5yv.A00(A0L2.A00);
        A004.A2f(this.A04);
        A004.A2b(migColorScheme);
        A004.A2i(false);
        A004.A2d(this.A02);
        7zN.A1R(A0L2, A004);
        String str2 = this.A03;
        BfA bfA = this.A00;
        List<PeerDevice> list = this.A05;
        boolean z = this.A06;
        C1i c1i = (C1i) A00.get();
        1Iw AeS = A0L2.AeS();
        CQY A005 = c1i.A00(AeS, migColorScheme);
        int i = 9GF.A00;
        LightColorScheme.A00();
        2KE r02 = 2KE.A02;
        C1u7 c1u7 = C1u7.A0A;
        String A09 = 3yH.A09(A0L2, 2131963496);
        String A092 = 3yH.A09(A0L2, 2131963494);
        Object obj = A01.get();
        11T.A0A(obj);
        EvM evM = (EvM) obj;
        Object obj2 = A012.get();
        11T.A0A(obj2);
        C40 c40 = (C40) obj2;
        String A0w = 7zO.A0w(A09, new Object[]{3yH.A09(A0L2, z ? 2131959933 : 2131956666)});
        11T.A0A(A0w);
        0Dc A0F = 7zS.A0F(AeS.A0D, A0w);
        A0F.A05(new C1358Af0(A0L2, evM, c40, this, migColorScheme, z), "[[full-list]]", A092, 33);
        A005.A0L(new C55g(c1u7, migColorScheme, r02, 7zM.A0E(A0F), 7zL.A03(), 2RH.A09.A00(), 7zL.A02(), -1, true));
        if (list != null) {
            for (PeerDevice peerDevice : list) {
                Object obj3 = A003.get();
                11T.A0A(obj3);
                C0z c0z = (C0z) obj3;
                Object obj4 = A002.get();
                11T.A0A(obj4);
                C10 c10 = (C10) obj4;
                Integer A006 = peerDevice.A00();
                C58x A007 = c0z.A00(migColorScheme, A006, true);
                AnonymousClass557 A0p = 7zL.A0p();
                A0p.A02(new 55J((Drawable) null, new CvP(peerDevice, A0L2, bfA, this, str2), (C5wx) null, (CharSequence) null, "android.widget.Button", 0, false, false));
                A0p.A05(migColorScheme);
                A0p.A05 = A007;
                A0p.A08((A006 == num || (str = peerDevice.A09) == null) ? 3yH.A09(A0L2, 2131952901) : 0Pz.A0j(9Au.A00(A006), " · ", str));
                A0p.A01();
                1BV A008 = 1BV.A00(66576);
                String str3 = peerDevice.A08;
                String A0W = (str3 == null || ((20U) A008.get()).A02()) ? "" : 0Pz.A0W(" · ", str3);
                if (peerDevice.A0A) {
                    String A093 = 3yH.A09(A0L2, 2131963537);
                    A0d = new SpannableString(0Pz.A0W(A093, A0W));
                    A0d.setSpan(new ForegroundColorSpan(migColorScheme.AoC()), 0, A093.length(), 0);
                } else if (peerDevice.A05 == null) {
                    Long l = peerDevice.A02;
                    11T.A0A(l);
                    A0d = 3yH.A0A(A0L2, c10.A00(AeS, l.longValue()).toString(), 2131963493);
                } else {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    Long l2 = peerDevice.A03;
                    11T.A0A(l2);
                    A0k.append((Object) c10.A00(AeS, l2.longValue()));
                    A0d = AnonymousClass001.A0d(A0W, A0k);
                }
                A0p.A07(A0d);
                A005.A0L(AbG.A0q(A0p));
            }
        }
        return 7zM.A0l(A005.A09(), A0L2, c2k5, A0L);
    }
}
