package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: GW2.class */
public final class GW2 extends HFn implements JLl {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;

    public GW2(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 82069);
        this.A03 = 1Bu.A03(r0, 16428);
        this.A01 = 1Bu.A03(r0, 115624);
    }

    @Override // X.JLl
    public /* bridge */ /* synthetic */ HAh AoH(Object obj) {
        int intValue;
        IYA iya = (JD6) obj;
        11T.A0F(iya, 0);
        if (iya instanceof IYC) {
            1Br A0S = 7zL.A0S(1Br.A03(this.A03), this.A00, 114863);
            IYC iyc = (IYC) iya;
            if (iyc.A0C) {
                return HAh.A07;
            }
            Integer num = iyc.A04;
            return ((num == null || !((intValue = num.intValue()) == 6 || intValue == 7)) && !11T.A0O(iyc.A07, ((HpS) 1Br.A0B(A0S)).A00())) ? HAh.A05 : HAh.A04;
        }
        boolean z = iya instanceof IYA;
        StringBuilder A0k = AnonymousClass001.A0k();
        if (z) {
            A0k.append("GroupCallRosterDelegate.getGroup() called on RosterSheetActionItemViewData with ActionType: ");
            A0k.append(iya.A00);
        } else {
            A0k.append("GroupCallRosterDelegate.getGroup() called on an invalid type: ");
            A0k.append(AnonymousClass001.A0Y(iya));
        }
        4YV.A0G().D0v("GroupCallRosterDelegate", 0Pz.A0W("T90379892: ", A0k.toString()));
        return null;
    }

    @Override // X.JLl
    public ImmutableList AoJ() {
        ImmutableList of = ImmutableList.of((Object) HAh.A07, (Object) HAh.A04, (Object) HAh.A05);
        11T.A0A(of);
        return of;
    }

    @Override // X.JLl
    public /* bridge */ /* synthetic */ IYB Aon(Enum r302, List list) {
        int i;
        HAh hAh = (HAh) r302;
        11T.A0F(hAh, 0);
        int ordinal = hAh.ordinal();
        int i2 = 1;
        if (ordinal == 2) {
            i2 = 0;
        } else if (ordinal == 5) {
            i2 = 6;
        }
        D09 d09 = (D09) 4YU.A0n(1Br.A03(this.A03), this.A00, 83954);
        int size = list.size();
        C00i A0R = AbF.A0R(this.A01);
        boolean A03 = d09.A03();
        if (i2 == 0) {
            A0R.get();
            1Br.A0C(this.A02);
            i = 2131964963;
        } else if (i2 == 1) {
            i = 2131965226;
        } else {
            if (i2 != 6) {
                throw AnonymousClass001.A0L("HeaderType not supported in GroupCallRoster");
            }
            i = 2131964964;
        }
        return new IYB(i2, size, i, A03, true, true, false, false);
    }

    @Override // X.JLl
    public /* bridge */ /* synthetic */ HAm BBa(Object obj) {
        IYC iyc = (JD6) obj;
        11T.A0F(iyc, 0);
        if (iyc instanceof IYC) {
            IYC iyc2 = iyc;
            HpS hpS = (HpS) 4YU.A0n(1Br.A03(this.A03), this.A00, 114863);
            if (iyc2.A0C) {
                return HAm.A08;
            }
            if (11T.A0O(iyc2.A07, hpS.A00())) {
                return HAm.A0B;
            }
            Integer num = iyc2.A04;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 2 || intValue == 3) {
                    return HAm.A06;
                }
                if (intValue == 6 || intValue == 7) {
                    return HAm.A03;
                }
            }
        }
        return HAm.A05;
    }

    @Override // X.JLl
    public ImmutableList BBb() {
        ImmutableList of = ImmutableList.of((Object) HAm.A08, (Object) HAm.A0B, (Object) HAm.A03, (Object) HAm.A06, (Object) HAm.A05);
        11T.A0A(of);
        return of;
    }
}
