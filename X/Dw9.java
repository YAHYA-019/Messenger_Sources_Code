package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.BitSet;

/* loaded from: Dw9.class */
public final class Dw9 extends 1LH {
    public static final CallerContext A08 = CallerContext.A0B("GeoGuidanceCard");
    public final DgM A00;
    public final DgM A01;
    public final Rel A02;
    public final DgL A03;
    public final DgP A04;
    public final Qp2 A05;
    public final CharSequence A06;
    public final CharSequence A07;

    public Dw9(DgM dgM, DgM dgM2, Rel rel, DgL dgL, DgP dgP, Qp2 qp2, CharSequence charSequence, CharSequence charSequence2) {
        11T.A0F(rel, 9);
        this.A00 = dgM;
        this.A06 = charSequence;
        this.A05 = qp2;
        this.A07 = charSequence2;
        this.A03 = dgL;
        this.A04 = dgP;
        this.A01 = dgM2;
        this.A02 = rel;
    }

    public 1LI A0s(C2k5 c2k5) {
        DgT dgT;
        Dva dva;
        11T.A0F(c2k5, 0);
        2lO r0 = this.A02.A00;
        1LI r308 = null;
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        1Iw r02 = A0U.A00;
        QBF qbf = new QBF(new QMJ(), r02);
        C2sn A0U2 = 7zQ.A0U(r02);
        2lQ r03 = 2lO.A02;
        long A0B = 7zQ.A0B();
        Integer num = 0S2.A08;
        2lO A0K = 4YV.A0K((2lO) null, num, A0B);
        1LI r317 = null;
        C2sn A0K2 = 7zS.A0K(A0U2);
        DgP dgP = this.A04;
        if (dgP != null) {
            dgP.A00 = 80;
            DgT.A00(dgP).A2A(C26z.END, ((DgT) dgP).A03.A02(16.0f));
            CallerContext callerContext = A08;
            11T.A0B(callerContext);
            r308 = dgP.A02(callerContext);
        }
        A0K2.A00(r308);
        CharSequence charSequence = this.A07;
        1Iw r04 = A0K2.A00;
        if (charSequence == null) {
            dgT = new DgT(r04);
            ((DgS) dgT).A00 = R4Z.A00;
            CharSequence charSequence2 = this.A06;
            11T.A0F(charSequence2, 0);
            ((DgS) dgT).A01 = charSequence2;
        } else {
            dgT = new DgT(r04);
            ((DgO) dgT).A04 = 0S2.A0Y;
            F8x f8x = R4Z.A00;
            ((DgO) dgT).A01 = f8x;
            ((DgO) dgT).A00 = f8x;
            ((DgO) dgT).A03 = charSequence;
            ((DgO) dgT).A02 = this.A06;
            ((DgO) dgT).A04 = 0S2.A0C;
        }
        CallerContext callerContext2 = A08;
        11T.A0B(callerContext2);
        7zQ.A1F(dgT.A02(callerContext2), A0K2, A0U2, A0K);
        if (this.A00 == null && this.A01 == null) {
            dva = null;
        } else {
            dva = new Dva(C82m.A00(7zS.A0Z((2lO) null, num, 16.0d), 0), null, null, 0S2.A01, new DKU(this, 21), 7zP.A0F());
        }
        A0U2.A00(dva);
        DgL dgL = this.A03;
        if (dgL != null) {
            DgT.A00(dgL).A0c();
            C26z c26z = C26z.TOP;
            C1qo c1qo = ((DgT) dgL).A03;
            DgT.A00(dgL).A2E(c26z, c1qo.A02(-16.0f));
            DgT.A00(dgL).A2E(C26z.END, c1qo.A02(-16.0f));
            11T.A0B(callerContext2);
            r317 = dgL.A02(callerContext2);
        }
        A0U2.A00(r317);
        2cL A00 = C2so.A00(A0U2);
        QMJ qmj = qbf.A00;
        qmj.A03 = A00.A0l();
        BitSet bitSet = qbf.A02;
        bitSet.set(0);
        qmj.A02 = this.A05;
        C1rs.A01(bitSet, qbf.A03);
        qbf.A0J();
        return 7zM.A0l(qmj, A0U, c2k5, r0);
    }
}
