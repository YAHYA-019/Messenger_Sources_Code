package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Fkf.class */
public final class Fkf implements GKF {
    public int A00;
    public GL7 A01;
    public final FyG A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r303 == X.0S2.A0Y) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Fkf(X.FyG r302, java.lang.Integer r303, java.lang.String r304, java.util.List r305) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            java.lang.Integer r0 = X.0S2.A0C
            r306 = r0
            r0 = r303
            r1 = r306
            if (r0 == r1) goto L2b
            java.lang.Integer r0 = X.0S2.A0N
            r306 = r0
            r0 = r303
            r1 = r306
            if (r0 == r1) goto L2b
            java.lang.Integer r0 = X.0S2.A0Y
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r306 = r0
            r0 = r303
            r1 = r307
            if (r0 != r1) goto L2e
        L2b:
            r0 = 1
            r308 = r0
        L2e:
            r0 = r308
            X.FJ5.A08(r0)
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r301
            r1 = r304
            r0.A04 = r1
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r305
            r0.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fkf.<init>(X.FyG, java.lang.Integer, java.lang.String, java.util.List):void");
    }

    public GL7 A8c(GL7 gl7) {
        int i;
        List A01;
        List AcV;
        ArrayList A0t;
        int i2;
        this.A01.getClass();
        FJ5.A08(AnonymousClass001.A1N(this.A00));
        int intValue = this.A03.intValue();
        if (intValue != 2) {
            FyG fyG = this.A02;
            List list = this.A05;
            GL7 gl72 = this.A01;
            i = this.A00;
            if (intValue != 3) {
                FGI.A02(gl72, fyG);
                List A012 = FGI.A01(fyG, list);
                AcV = gl7.AcV(i);
                int indexOf = AcV.indexOf(gl72);
                FJ5.A08(1BL.A1S(indexOf));
                A0t = AbJ.A1B(AcV);
                A0t.addAll(AcV.subList(0, indexOf));
                A0t.addAll(A012);
                i2 = indexOf + 1;
                A0t.addAll(AcV.subList(i2, AcV.size()));
                return F27.A00(gl7, A0t, i);
            }
            A01 = FGI.A01(fyG, list);
            AcV = gl7.AcV(i);
            i2 = AcV.indexOf(gl72);
            FJ5.A08(1BL.A1S(i2));
            A0t = AnonymousClass001.A0t(AcV.size() + A01.size());
        } else {
            FyG fyG2 = this.A02;
            List list2 = this.A05;
            GL7 gl73 = this.A01;
            i = this.A00;
            A01 = FGI.A01(fyG2, list2);
            AcV = gl7.AcV(i);
            int indexOf2 = AcV.indexOf(gl73);
            if (indexOf2 < 0) {
                FwX.A00(fyG2).BM7(AnonymousClass001.A0T(StringFormatUtil.formatStrLocaleSafe("Insertion index of not found. id:%s parentStyle:%d attribute:%d", gl73.getId(), Integer.valueOf(gl7.BDE()), Integer.valueOf(i))), FJ3.A08(fyG2));
                return gl7;
            }
            A0t = AnonymousClass001.A0t(AcV.size() + A01.size());
            i2 = indexOf2 + 1;
        }
        A0t.addAll(AcV.subList(0, i2));
        A0t.addAll(A01);
        A0t.addAll(AcV.subList(i2, AcV.size()));
        return F27.A00(gl7, A0t, i);
    }

    public int BEP() {
        return 0;
    }

    public String BES() {
        return this.A04;
    }

    public Integer BEX() {
        return 0S2.A0C;
    }

    public void Cmu(GL7 gl7) {
        this.A01 = gl7;
    }

    public void CsI(int i) {
        this.A00 = i;
    }
}
