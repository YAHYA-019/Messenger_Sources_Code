package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.AcS, reason: case insensitive filesystem */
/* loaded from: AcS.class */
public final class C1270AcS implements DIu {
    public final 2PF A00 = new 2PF(2000);
    public final /* synthetic */ AcO A01;

    public C1270AcS(AcO acO) {
        this.A01 = acO;
    }

    @Override // X.DIu
    public void BaE() {
        AcO.A00(this.A01).A0E(BLf.A04, 4YV.A0j());
    }

    @Override // X.DIu
    public void Bka() {
        AcQ acQ;
        AcO acO = this.A01;
        if ((!acO.A0C || !AcO.A08(acO)) && !AcO.A07(acO)) {
            1G1 r0 = acO.A0H;
            Context context = acO.A0F;
            AcP acP = (AcP) 1Lo.A04(context, r0, (1BY) null, 84248);
            C3c c3c = (C3c) 1Bn.A0E(context, (1BY) null, 83026);
            2Wo r02 = acO.A0N;
            View view = r02.A00;
            if (view == null) {
                view = r02.A01;
            }
            c3c.A00(view.getContext(), AcP.A04(acP), r0.A02);
        }
        3Jk A01 = AcO.A01(acO);
        if (A01 != null && (acQ = A01.A00.A04) != null) {
            acQ.A0P = null;
        }
        if (AcO.A01(acO) != null) {
            AcO.A03(acO);
            AcO.A04(acO);
        }
    }

    @Override // X.DIu
    public void BzF(View view, boolean z) {
        AcO acO = this.A01;
        if (acO.A0N.A05()) {
            if (AcO.A01(acO) == null || !z) {
                AcO.A04(acO);
            } else {
                acO.A0G.showSoftInput(view, 0);
            }
        }
    }

    @Override // X.DIu
    public boolean C0E(5SW r302, Long l, String str) {
        if (this.A00.A00()) {
            return false;
        }
        AcO acO = this.A01;
        FbUserSession fbUserSession = acO.A0H;
        Context context = acO.A0F;
        AcP acP = (AcP) 1Lo.A04(context, fbUserSession, (1BY) null, 84248);
        int ordinal = r302.ordinal();
        acP.A0E(ordinal != 82 ? ordinal != 83 ? (ordinal == 72 || ordinal == 76 || ordinal == 78) ? BLf.A07 : null : BLf.A02 : BLf.A03, l);
        if (AcO.A01(acO) != null && AcO.A02(acO) != null) {
            AcQ A02 = AcO.A02(acO);
            AcQ.A0O(A02, A02.A0f, false);
        }
        ((FH9) 1Bi.A03(84362)).A03();
        acO.A0D = true;
        83Z A0F = 1BK.A0F();
        if (A0F == null || AcO.A01(acO) == null || AcO.A02(acO) == null || AcO.A02(acO).mParentFragment == null) {
            return false;
        }
        A0F.A06(context, AcO.A02(acO).mParentFragment.getParentFragmentManager(), str, r302.toString(), AnonymousClass001.A1T(str), false);
        return true;
    }

    @Override // X.DIu
    public void C0F() {
        AcO.A00(this.A01).A0D(BLf.A08);
    }

    @Override // X.DIu
    public boolean C0G(Long l) {
        if (this.A00.A00()) {
            return false;
        }
        AcO acO = this.A01;
        FbUserSession fbUserSession = acO.A0H;
        Context context = acO.A0F;
        ((AcP) 1Lo.A04(context, fbUserSession, (1BY) null, 84248)).A0E(BLf.A08, l);
        acO.A0D = true;
        83Z A0F = 1BK.A0F();
        if (A0F == null || AcO.A01(acO) == null || AcO.A01(acO).A00.getChildFragmentManager() == null) {
            return false;
        }
        06Z childFragmentManager = AcO.A01(acO).A00.getChildFragmentManager();
        ((9WD) 1Bn.A0A(68284)).A00(context, childFragmentManager, new DBi(0, A0F, childFragmentManager, acO));
        return true;
    }

    @Override // X.DIu
    public void C79(BLf bLf) {
        AcO.A00(this.A01).A0D(bLf);
    }

    @Override // X.DIu
    public void CJf(String str) {
        Long l = new Long(String.valueOf(7zQ.A05(str)));
        AcO acO = this.A01;
        AcO.A00(acO).A0E(BLf.A02, l);
        AcO.A09(acO, AnonymousClass001.A0K(), str);
    }

    @Override // X.DIu
    public boolean CPv(String str) {
        AcO acO = this.A01;
        acO.A0L.A03 = str;
        CF6 cf6 = acO.A07;
        if (cf6 != null && AcO.A01(acO) != null && AcO.A02(acO) != null) {
            Context context = acO.A0F;
            LifecycleOwner viewLifecycleOwner = AcO.A02(acO).getViewLifecycleOwner();
            11T.A0H(str, context);
            C2a2 c2a2 = cf6.A02;
            if (c2a2 != null) {
                c2a2.AE0(null);
            }
            cf6.A02 = 2aK.A04(new AJJ(context, cf6, str, (0DR) null, 15), 7zO.A16(viewLifecycleOwner));
            cf6.A01 = str;
            CaE.A03(viewLifecycleOwner, cf6.A04, cf6, ActionId.RTMP_CONNECTION_CONNECTED);
        }
        int length = str.length();
        if (length > 1) {
            acO.A0C = true;
        }
        C9I c9i = acO.A06;
        if (c9i != null && length >= acO.A00) {
            c9i.A02(false);
        }
        Cq8 cq8 = (Cq8) 1Hv.A02(acO.A0F, 84253);
        cq8.A01 = acO.A0H;
        cq8.A02 = false;
        return AcO.A09(acO, false, str);
    }

    @Override // X.DIu
    public boolean onQueryTextSubmit(String str) {
        AcO acO = this.A01;
        if (str.length() > 1) {
            acO.A0C = true;
        }
        AcO.A04(acO);
        return false;
    }
}
