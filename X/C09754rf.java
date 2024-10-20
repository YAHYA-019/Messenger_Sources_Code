package X;

import com.facebook.common.util.TriState;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.List;
import java.util.Set;

/* renamed from: X.4rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rf.class */
public final class C09754rf implements InterfaceC03993zi, InterfaceC04003zj {
    public List A00;
    public final 1Od A01;
    public final C00i A02;
    public final FbSharedPreferences A03;
    public final Set A04;
    public final 1CQ A05;
    public final 1CQ A06;
    public final C15h A07;

    public C09754rf() {
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1BV r0 = new 1BV(49288);
        Set A0I = 1Bn.A0I(213);
        1Od r02 = (1Od) 1Bi.A03(16616);
        DBP dbp = new DBP(this, 4);
        1CQ r03 = (1CQ) 1Bn.A0A(131253);
        1CQ r04 = (1CQ) 1Bi.A03(131252);
        this.A03 = fbSharedPreferences;
        this.A02 = r0;
        this.A04 = A0I;
        this.A01 = r02;
        this.A07 = dbp;
        this.A06 = r03;
        this.A05 = r04;
    }

    @Override // X.InterfaceC03993zi
    public void A7p() {
        1G1 A04 = 1Fw.A04((1EZ) 1Bn.A0A(16428));
        if (A04.A07) {
            return;
        }
        1CQ r0 = this.A06;
        String str = A04.A02;
        1CN r02 = r0.A08;
        if (r02 != null) {
            1CU r03 = new 1CU(r02.A00.Azl());
            1C9 A00 = 1CN.A00(r02, str);
            if (A00 != null) {
                A00.A02(r03);
            }
            synchronized (r0) {
                1CU r04 = r0.A05;
                TriState[] triStateArr = r03.A02;
                int length = triStateArr.length;
                TriState[] triStateArr2 = r04.A02;
                int length2 = triStateArr2.length;
                02W.A04(length == length2);
                for (int i = 0; i < length2; i++) {
                    triStateArr2[i] = triStateArr[i];
                    r04.A01[i] = r03.A01[i];
                    r04.A00[i] = r03.A00[i];
                }
            }
        }
    }

    @Override // X.InterfaceC03993zi
    public void ABa(EnC enC, boolean z) {
        1G1 A04 = 1Fw.A04((1EZ) 1Bn.A0A(16428));
        boolean z2 = A04.A07;
        1CQ r0 = this.A06;
        if (!z2) {
            String str = A04.A02;
            1CN r02 = r0.A08;
            if (r02 != null) {
                1CU r03 = r0.A05;
                1C9 A00 = 1CN.A00(r02, str);
                if (A00 != null) {
                    A00.A03(r03);
                }
            }
        }
        r0.A08();
    }

    @Override // X.InterfaceC03993zi
    public 4qU AZ2() {
        return new C1255Abx(this);
    }

    @Override // X.InterfaceC04003zj
    public 4qU AZ3() {
        return new C1255Abx(this);
    }

    @Override // X.InterfaceC03993zi
    public String Asw() {
        return "GkConfigurationComponent";
    }

    @Override // X.InterfaceC04003zj
    public long Axo() {
        return ((Number) this.A07.get()).longValue();
    }

    @Override // X.InterfaceC03993zi
    public boolean BX1() {
        1CU r0 = this.A05.A05;
        synchronized (r0) {
            int length = r0.A02.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return false;
                }
                if (!TriState.UNSET.equals(r0.A00[i2])) {
                    return true;
                }
                i = i2 + 1;
            }
        }
    }

    @Override // X.InterfaceC03993zi
    public boolean Cy8() {
        return false;
    }
}
