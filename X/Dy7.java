package X;

import com.facebook.forker.Process;
import java.util.Collections;
import java.util.List;

/* loaded from: Dy7.class */
public final class Dy7 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dy7() {
        super("FDSNTRadioButtonGroupComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r303;
        QNj A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        Integer num = A0P.A01;
        Integer num2 = A0P.A00;
        QMB qmb = new QMB();
        C1rs c1rs = new C1rs(qmb, r302, 0, 0);
        ((DrP) c1rs).A00 = qmb;
        ((DrP) c1rs).A01 = r302;
        Integer valueOf = Integer.valueOf(gl7.getInt(53, -1));
        if (!valueOf.equals(num2)) {
            F4N.A00((F4N) FJ3.A07(gl7, fyG), valueOf);
            if (r302.A02 != null) {
                4YV.A1F(r302, valueOf, Process.WAIT_RESULT_STOPPED);
            }
            if (r302.A02 != null) {
                4YV.A1F(r302, valueOf, (-1) << (-1));
            }
            num = valueOf;
        }
        ((DrP) c1rs).A00.A01 = num;
        ((DrP) c1rs).A00.A00 = 1LI.A09(r302, Dy7.class, "FDSNTRadioButtonGroupComponent", -679093025);
        List A0A = GL7.A0A(gl7);
        int size = A0A.size();
        if (size == 0) {
            FAo.A00(fyG, AnonymousClass001.A0N("Need at least one radio button group item specified for this radio button group."));
            r303 = null;
        } else {
            for (int i = 0; i < size; i++) {
                GL7 A0n = DKC.A0n(A0A, i);
                El1 el1 = new El1(GL7.A03(A0n, 36), GL7.A05(A0n), A0n.getString(42));
                QMB qmb2 = ((DrP) c1rs).A00;
                List list = qmb2.A02;
                if (list == Collections.EMPTY_LIST) {
                    list = AnonymousClass001.A0s();
                    qmb2.A02 = list;
                }
                list.add(el1);
            }
            c1rs.A0J();
            r303 = ((DrP) c1rs).A00;
        }
        return r303;
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return DKF.A0P(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -679093025) {
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        Integer num = ((RIJ) obj).A01;
        Dy7 dy7 = (Dy7) r02;
        QNj A07 = r03.A07(4YU.A0P(r03));
        GL7 gl7 = dy7.A00;
        FyG fyG = dy7.A01;
        Integer num2 = A07.A01;
        List A0A = GL7.A0A(gl7);
        GL7 Ay2 = DKC.A0n(A0A, num.intValue()).Ay2(40);
        F4N.A00(DKG.A0b(gl7, fyG), num);
        int intValue = num2.intValue();
        if (intValue < 0 || intValue >= A0A.size()) {
            0fH.A17("FDSNTRadioButtonGroupComponentSpec", "Old stateSelectedIndex (%d) is out of bounds for current radio button group (%d items). Is that expected?", AnonymousClass001.A1b(num2, A0A.size()));
        } else {
            GL7 Ay22 = DKC.A0n(A0A, intValue).Ay2(38);
            if (Ay22 != null) {
                FJ9.A0A(Ay22, fyG);
            }
        }
        if (Ay2 != null) {
            FJ9.A0A(Ay2, fyG);
        }
        if (r03.A02 == null) {
            return null;
        }
        r03.A0H(7zS.A0N(num), "updateState:FDSNTRadioButtonGroupComponent.updateStateSelectedIndex");
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNj qNj = (QNj) r303;
        GL7 gl7 = this.A00;
        Object obj = DKG.A0b(gl7, this.A01).A00[1];
        if (obj == null) {
            obj = Integer.valueOf(gl7.getInt(53, -1));
        }
        Integer num = (Integer) obj;
        qNj.A01 = num;
        qNj.A00 = num;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
