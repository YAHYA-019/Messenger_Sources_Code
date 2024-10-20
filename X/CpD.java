package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.rtc.interfaces.WebrtcUiHandlerListenerParams;
import java.util.Set;

/* loaded from: CpD.class */
public final class CpD implements DJW {
    public int A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2JM A05;
    public final java.util.Map A06;
    public final java.util.Map A07;
    public final Set A08;
    public final 1De A09;
    public final 2Qe A0A;
    public final 2QY A0B;

    public CpD(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A09 = r303;
        1BY r0 = r303.A00;
        this.A02 = 1Lm.A03(fbUserSession, r0, 99979);
        this.A03 = 1Lm.A03(fbUserSession, r0, 99977);
        this.A01 = 1Lm.A03(fbUserSession, r0, 33088);
        this.A04 = 1Lm.A03(fbUserSession, r0, 99981);
        this.A08 = AnonymousClass001.A0v();
        this.A07 = AnonymousClass001.A0u();
        this.A06 = AnonymousClass001.A0u();
        Gyv gyv = new Gyv(this, 1);
        this.A0A = gyv;
        this.A05 = new IY8(this, 44);
        BHi bHi = new BHi(this, 8);
        this.A0B = bHi;
        ((IRF) 1Br.A0B(this.A02)).A0l(gyv, (WebrtcUiHandlerListenerParams) null);
        ((2QT) 1Br.A0B(this.A04)).A67(bHi);
        A01(this);
    }

    public static final void A00(CpD cpD) {
        for (B7Y b7y : cpD.A08) {
            if (b7y instanceof B7Z) {
                ((B7Z) b7y).A00.CbG();
            } else {
                b7y.A00.CbG();
            }
        }
    }

    public static final void A01(CpD cpD) {
        1Du it = 1BL.A0a(IFr.A08(AbL.A0V(1Br.A0B(cpD.A01)))).iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            11T.A0D(next);
            Number number = (Number) cpD.A07.put(next, 3);
            if (number == null || number.intValue() != 3) {
                z = true;
            }
        }
        if (z) {
            A00(cpD);
        }
        C00i c00i = cpD.A03.A00;
        if (AbJ.A0j(c00i).A05 != null) {
            ThreadKey threadKey = AbJ.A0j(c00i).A05;
            11T.A0D(threadKey);
            cpD.CnE(threadKey, 3);
        }
    }

    public static final void A02(CpD cpD) {
        java.util.Map map = cpD.A07;
        boolean A1b = AbF.A1b(map);
        map.clear();
        if (A1b) {
            A00(cpD);
        }
        java.util.Map map2 = cpD.A06;
        boolean A1b2 = AbF.A1b(map2);
        map2.clear();
        if (A1b2) {
            A00(cpD);
        }
    }

    public void A64(BPe bPe) {
        11T.A0F(bPe, 0);
        Set set = this.A08;
        if (set.isEmpty()) {
            ((2JN) 1Br.A0B(this.A01)).A03(this.A05, C0uA.A00);
        }
        set.add(bPe);
    }

    public void CnE(ThreadKey threadKey, int i) {
        11T.A0F(threadKey, 0);
        String A0w = 1BK.A0w(threadKey);
        java.util.Map map = this.A07;
        Number number = (Number) (i == 1 ? map.remove(A0w) : map.put(A0w, Integer.valueOf(i)));
        if (number == null || number.intValue() != i) {
            A00(this);
        }
    }
}
