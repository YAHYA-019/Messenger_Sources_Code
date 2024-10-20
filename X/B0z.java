package X;

import android.text.TextUtils;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: B0z.class */
public final class B0z extends C1rj {
    public int A00;
    public 1Im A01;
    public C2ko A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public B0z() {
        super("Rooms2LiveSinglePickerComponent");
        this.A00 = 2131966238;
    }

    public static 2cL A00(1Iw r301, MigColorScheme migColorScheme, String str) {
        2cM A0N = AbK.A0N(r301);
        A0N.A0V();
        2KD A00 = 2K3.A00(r301);
        A00.A2z(str);
        A00.A2X();
        A00.A0L();
        AbI.A1T(migColorScheme, A00);
        7zO.A1I(A00, 2RH.A03);
        4YU.A1K(A0N, A00);
        return A0N.A00;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.RG7, java.lang.Object] */
    public static void A01(C2iw c2iw, ImmutableList immutableList) {
        C2ko A0G = 1LI.A0G(c2iw, -1630579525);
        if (A0G != null) {
            ?? obj = new Object();
            ((RG7) obj).A00 = immutableList;
            7zO.A1P(A0G, (Object) obj);
        }
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A04, this.A05, Integer.valueOf(this.A00), this.A06, 1BK.A0d(), null, null};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2kV A00;
        B1p b1p = (B1p) 4YU.A0P(r302);
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A03;
        String str4 = this.A04;
        int i = this.A00;
        boolean z = b1p.A02;
        ImmutableList immutableList = b1p.A01;
        BRZ brz = b1p.A00;
        MigColorScheme A0o = AbF.A0o(r302.A0D, 16980);
        boolean z2 = false;
        if (!z) {
            A00 = A00(r302, A0o, str2);
        } else if (immutableList == null) {
            A00 = A00(r302, A0o, str4);
        } else if (immutableList.isEmpty()) {
            A00 = A00(r302, A0o, str3);
        } else {
            C2ki A002 = C2kV.A00(r302);
            7zL.A1K(r302);
            B24 b24 = new B24();
            b24.A00 = 1LI.A09(r302, B0z.class, "Rooms2LiveSinglePickerComponent", 1524449723);
            b24.A01 = immutableList;
            A002.A2d(b24);
            A002.A0R();
            A002.A2j(true);
            A00 = A002.A2W();
        }
        2cM A0f = AbH.A0f(r302, 0);
        AwR A003 = B12.A00(r302);
        A003.A2Y(true);
        A003.A2X(str);
        2RH r0 = 2RH.A07;
        4YU.A1M(A003, r0);
        A003.A0S();
        A0f.A2e(A003.A2W());
        A0f.A2e(A00);
        8Th A004 = C8nq.A00(r302);
        A004.A2a(r302.A0D(i));
        4YU.A1N(A004, 2RH.A05);
        A004.A0W();
        4YU.A1M(A004, r0);
        if (brz != null) {
            z2 = true;
        }
        A004.A2b(z2);
        A004.A0U();
        A004.A2Z(A0o);
        7zN.A1D(A004, r302, B0z.class, "Rooms2LiveSinglePickerComponent", 2019308025);
        A0f.A2e(A004.A2W());
        A0f.A0R();
        return A0f.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r0;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 1524449723) {
            1Iw r02 = r302.A00.A00;
            BRZ brz = ((Bgm) obj).A00;
            BRZ A00 = brz.A00(!brz.A05());
            if (r02.A02 == null) {
                return null;
            }
            r02.A0G(new C2l4(new Object[]{brz, A00}, 1), "updateState:Rooms2LiveSinglePickerComponent.onUpdateSelectedItem");
            return null;
        }
        if (i != 2019308025) {
            return null;
        }
        1Iw r03 = r302.A00.A00;
        BRZ brz2 = ((B1p) 4YU.A0P(r03)).A00;
        CJA A0O = AbN.A0O(r03.A0D, "Rooms2LiveSinglePickerComponentSpec");
        if (brz2 == null) {
            return null;
        }
        String A01 = brz2.A01();
        String A03 = brz2.A03();
        A0O.A06 = A01;
        A0O.A07 = A03;
        Iterator it = A0O.A0F.iterator();
        while (it.hasNext()) {
            CCF.A00(it);
        }
        CJA.A00(A0O);
        1LI r04 = r03.A02;
        if (r04 == null || (r0 = ((B0z) r04).A01) == null) {
            A0O.A01();
            return null;
        }
        r0.A00(new Object());
        return null;
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (c2ko.A02 != -1630579525) {
            return null;
        }
        1Iw r0 = c2ko.A00;
        ImmutableList immutableList = ((RG7) obj).A00;
        CJA A0O = AbN.A0O(r0.A0D, "Rooms2LiveSinglePickerComponentSpec");
        if (r0.A02 != null) {
            r0.A0G(7zS.A0N(immutableList), "updateState:Rooms2LiveSinglePickerComponent.onUpdateState");
        }
        String str = A0O.A06;
        if (str == null || immutableList == null) {
            return null;
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            BRZ brz = (BRZ) it.next();
            if (TextUtils.equals(brz.A01(), str)) {
                BRZ A00 = brz.A00(!brz.A05());
                if (r0.A02 == null) {
                    return null;
                }
                r0.A0G(new C2l4(new Object[]{brz, A00}, 1), "updateState:Rooms2LiveSinglePickerComponent.onUpdateSelectedItem");
                return null;
            }
        }
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A02, this, r303);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1p b1p = (B1p) r303;
        b1p.A02 = false;
        b1p.A01 = null;
        b1p.A00 = null;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
