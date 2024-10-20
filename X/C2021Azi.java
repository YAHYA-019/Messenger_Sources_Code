package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.emoji.model.Emoji;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.BitSet;

/* renamed from: X.Azi, reason: case insensitive filesystem */
/* loaded from: Azi.class */
public final class C2021Azi extends C1rj {
    public int A00;
    public 06Z A01;
    public C2ko A02;
    public C2ko A03;
    public DI3 A04;
    public Bet A05;
    public MigColorScheme A06;
    public C5xv A07;
    public Emoji A08;
    public ImmutableList A09;
    public CharSequence A0A;
    public WeakReference A0B;

    public C2021Azi() {
        super("MagicWordsCreationComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A06, this.A04, this.A01, this.A08, this.A0A, this.A09, this.A05, this.A0B, this.A07, Integer.valueOf(this.A00)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        B1B A0d;
        C1929Awu c1929Awu;
        B1h b1h = (B1h) 4YU.A0P(r302);
        MigColorScheme migColorScheme = this.A06;
        int i = this.A00;
        ImmutableList immutableList = this.A09;
        Emoji emoji = this.A08;
        CharSequence charSequence = this.A0A;
        WeakReference weakReference = this.A0B;
        06Z r0 = this.A01;
        DI3 di3 = this.A04;
        C5xv c5xv = this.A07;
        Bet bet = this.A05;
        C2iw c2iw = b1h.A00;
        C2kx c2kx = b1h.A01;
        1BK.A1J(migColorScheme, 1, immutableList);
        11T.A0F(weakReference, 6);
        7zS.A18(7, r0, di3, c5xv);
        7zP.A1O(bet, 10, c2iw);
        11T.A0F(c2kx, 12);
        C22a A0u = 7zQ.A0u();
        Context A0A = 7zL.A0A(r302);
        1Bn.A0E(A0A, (1BY) null, 67734);
        int size = immutableList.size();
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        7zM.A1O(A01, migColorScheme);
        C5yw A0b = 7zN.A0b(r302, false);
        A0b.A2a(2131958994);
        A0b.A2Y();
        AbM.A1N(migColorScheme, A0b, c5xv, false);
        A0b.A2j(true);
        AbH.A1Q(A01, A0b);
        if (i != 1) {
            if (i == 2) {
                if (immutableList.isEmpty()) {
                    c1929Awu = new C1929Awu(bet, migColorScheme);
                } else {
                    8T0 A00 = 8mB.A00(r302);
                    A00.A2Y(immutableList);
                    A00.A01.A03 = c2kx;
                    A00.A0R();
                    A00.A0J();
                    c1929Awu = A00.A01;
                    11T.A0D(c1929Awu);
                }
                A01.A2e(c1929Awu);
                AwG awG = new AwG(r302, new B1B());
                awG.A0S();
                B1B b1b = awG.A01;
                b1b.A08 = migColorScheme;
                BitSet bitSet = awG.A02;
                bitSet.set(0);
                C1u3 c1u3 = C1u3.A2o;
                Resources resources = A0A.getResources();
                b1b.A06 = new C1770As4(c1u3, C1u3.A0Y, new CkQ(A0u), C1ut.A02, emoji, charSequence, 4YU.A0t(resources, 2131958976), 4YU.A0t(resources, 2131958987), 4YU.A0t(resources, 2131958991), C0s8.A14(new 9pG(r302, c2iw), new InputFilter.LengthFilter(50)), 49153, 6);
                bitSet.set(1);
                b1b.A09 = weakReference;
                bitSet.set(5);
                b1b.A00 = r0;
                bitSet.set(2);
                b1b.A07 = new CkP(c2kx, di3, size);
                bitSet.set(4);
                awG.A1w(c2iw);
                b1b.A0A = false;
                bitSet.set(3);
                A0d = awG.A2W();
            }
            return A01.A00;
        }
        C1rq A0m = 7zM.A0m(r302);
        A0m.A2c();
        36Z A002 = C2rs.A00(r302);
        A002.A0L();
        A002.A0z(36.0f);
        A002.A0l(36.0f);
        A002.A0J();
        A0d = 7zL.A0d(A002.A01, A0m);
        A01.A2e(A0d);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        int i = c2ko.A02;
        if (i == -159455724) {
            1Iw r0 = c2ko.A00;
            Emoji emoji = ((RFO) obj).A00;
            C2iw c2iw = ((B1h) 4YU.A0P(r0)).A00;
            1BL.A1F(emoji, c2iw);
            B1B.A01(c2iw, emoji);
            return null;
        }
        if (i != 246710759) {
            return null;
        }
        1Iw r02 = c2ko.A00;
        String str = ((RFN) obj).A00;
        C2iw c2iw2 = ((B1h) 4YU.A0P(r02)).A00;
        1BL.A1F(str, c2iw2);
        B1B.A0L(c2iw2, str);
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A02, this, r303);
        7zQ.A1H(r302, this.A03, this, r303);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2iw, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1h b1h = (B1h) r303;
        ?? obj = new Object();
        C2kx c2kx = new C2kx();
        b1h.A00 = obj;
        b1h.A01 = c2kx;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
