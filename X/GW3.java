package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: GW3.class */
public final class GW3 extends HFn implements JLl {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C01i A06;
    public final FbUserSession A07;

    public GW3(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A05 = 1Bu.A03(r0, 16428);
        this.A06 = J9s.A01(this, 5);
        FbUserSession A03 = 1Br.A03(this.A05);
        this.A07 = A03;
        this.A01 = GOn.A0k(A03, r0);
        this.A04 = GOn.A0f(A03, r0);
        this.A03 = GOn.A0g(A03, r0);
        this.A02 = 1Bq.A00(115038);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.JLl
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public HAm BBa(JD6 jd6) {
        ArrayList arrayList;
        11T.A0F(jd6, 0);
        if (jd6 instanceof IYC) {
            CallModel A0S = AbstractC2326GOr.A0S(this.A03);
            if (A0S != null && (arrayList = A0S.remoteParticipants) != null) {
                ArrayList A0z = 1BL.A0z(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GOq.A1K(A0z, it);
                }
            }
            IYC iyc = (IYC) jd6;
            if (iyc.A0C) {
                return HAm.A08;
            }
            if (11T.A0O(iyc.A07, this.A06.getValue())) {
                return HAm.A0B;
            }
            if (iyc.A0D) {
                return HAm.A0C;
            }
            Integer num = iyc.A04;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 17) {
                    return HAm.A07;
                }
                if (intValue == 6 || intValue == 7) {
                    return HAm.A03;
                }
            }
            1Br.A0C(this.A04);
        } else if (jd6 instanceof IYA) {
            int i = ((IYA) jd6).A00;
            if (i == 1) {
                return HAm.A09;
            }
            if (i == 2) {
                return HAm.A04;
            }
            if (i == 3) {
                return HAm.A0A;
            }
            if (i == 4) {
                return HAm.A02;
            }
            if (i == 5) {
                return HAm.A0D;
            }
        }
        return HAm.A05;
    }

    @Override // X.JLl
    public /* bridge */ /* synthetic */ HAh AoH(Object obj) {
        JD6 jd6 = (JD6) obj;
        11T.A0F(jd6, 0);
        switch (BBa(jd6).ordinal()) {
            case 2:
                return HAh.A05;
            case 3:
            case 4:
            case 5:
            case 6:
                return HAh.A02;
            case 7:
                return HAh.A06;
            case 8:
                return HAh.A07;
            case 9:
                return HAh.A09;
            case 10:
                return HAh.A08;
            case 11:
                return null;
            default:
                return HAh.A04;
        }
    }

    @Override // X.JLl
    public ImmutableList AoJ() {
        ImmutableList of = ImmutableList.of((Object) HAh.A09, (Object) HAh.A06, (Object) HAh.A02, (Object) HAh.A03, (Object) HAh.A07, (Object) HAh.A04, (Object) HAh.A08, (Object) HAh.A05);
        11T.A0A(of);
        return of;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JLl
    public /* bridge */ /* synthetic */ IYB Aon(Enum r302, List list) {
        int i;
        C3Oh c3Oh;
        HAh hAh = (HAh) r302;
        11T.A0F(hAh, 0);
        boolean z = false;
        int i2 = 1;
        int i3 = 1;
        int size = list.size();
        AbF.A0R(this.A02).get();
        02J.A01(4YV.A13(hAh.name(), list.size()));
        switch (hAh.ordinal()) {
            case 0:
                i = 2131965217;
                i3 = 2;
                break;
            case 1:
                i = 2131965219;
                i3 = 3;
                break;
            case 2:
                i = 2131965163;
                IDd iDd = (IDd) 4YU.A0n(1Br.A03(this.A05), this.A00, 114855);
                Set set = iDd.A01.A07;
                z = true;
                if (set == null || !set.contains(HCj.A01) || !IFr.A0D(GS1.A01(iDd.A07))) {
                    z = false;
                }
                Set set2 = iDd.A01.A07;
                if (set2 != null && set2.contains(HCj.A01) && IFr.A0D(GS1.A01(iDd.A07))) {
                    List A06 = IFr.A06(AbstractC2326GOr.A0S(this.A03));
                    if (!(A06 instanceof Collection) || !A06.isEmpty()) {
                        Iterator it = A06.iterator();
                        while (it.hasNext()) {
                            I9O A0u = GOq.A0u(this.A01, AnonymousClass001.A0i(it));
                            if (A0u != null && (c3Oh = A0u.A03) != null && c3Oh.A06) {
                                i2 = i3;
                                i3 = 0;
                                break;
                            }
                        }
                    }
                }
                i3 = 0;
                i2 = i3;
                i3 = 0;
                break;
            case 3:
                i = 2131965223;
                break;
            case 4:
                1Br.A0C(this.A04);
                i = 2131965230;
                i3 = 4;
                break;
            case 5:
                i = 2131964964;
                i3 = 6;
                break;
            case 6:
                1Br.A0C(this.A04);
                return null;
            case 7:
                i = 2131965229;
                i3 = 5;
                break;
            default:
                throw 1BK.A1F();
        }
        return new IYB(i3, size, i, true, i2, false, true, z);
    }

    @Override // X.JLl
    public ImmutableList BBb() {
        ImmutableList of = ImmutableList.of(HAm.A0D, HAm.A0C, HAm.A07, HAm.A04, HAm.A09, HAm.A0A, HAm.A02, HAm.A08, HAm.A0B, HAm.A03, HAm.A06);
        11T.A0A(of);
        return of;
    }
}
