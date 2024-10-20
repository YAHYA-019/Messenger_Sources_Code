package X;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: F08.class */
public abstract class F08 {
    public static final 8Lu A00(FyG fyG, DLQ dlq) {
        if (dlq.A05 != 16594) {
            throw AnonymousClass001.A0L("Expected canvas gradient model.");
        }
        List AcV = dlq.AcV(36);
        11T.A0A(AcV);
        ArrayList A0z = 1BL.A0z(AcV);
        Iterator it = AcV.iterator();
        while (it.hasNext()) {
            AnonymousClass001.A1J(A0z, EYa.A00(fyG, DKC.A0s(it), 0));
        }
        return new 8Lu(26, DKD.A12(dlq, 35).isEmpty() ? null : 0QD.A0m(DKD.A12(dlq, 35)), 0QD.A0n(A0z));
    }

    public static final GDB A01(FyG fyG, DLQ dlq, long j) {
        GG1 dqw;
        GDB dr6;
        int i = dlq.A05;
        if (AnonymousClass001.A1Q(i, 16591)) {
            DLQ A06 = dlq.A06(35);
            if (A06 == null) {
                throw AnonymousClass001.A0L("Color shading must specify the themed color");
            }
            dr6 = new Dr7(EYa.A00(fyG, A06, 0));
        } else {
            if (AnonymousClass001.A1Q(i, 16616)) {
                DLQ A062 = dlq.A06(38);
                if (A062 == null) {
                    throw AnonymousClass001.A0L("Radial gradient shading must specify the gradient");
                }
                8Lu A00 = A00(fyG, A062);
                String A0B = dlq.A0B();
                float A002 = DKH.A00(j);
                float A01 = F09.A01(A0B, 0.0f, A002);
                String A0F = dlq.A0F();
                float A003 = FFf.A00(j);
                dqw = new Dqv(Shader.TileMode.CLAMP, A00, F2D.A01(A0F, A003, A01), F2D.A01(dlq.A0C(), A003, F09.A00(dlq, A002, 35)));
            } else {
                if (i != 16615) {
                    throw AnonymousClass001.A0L("Unknown canvas shading.");
                }
                DLQ A063 = dlq.A06(38);
                if (A063 == null) {
                    throw AnonymousClass001.A0L("Radial gradient shading must specify the gradient");
                }
                8Lu A004 = A00(fyG, A063);
                long A012 = F2D.A01(dlq.A0C(), FFf.A00(j), F09.A01(dlq.getString(35), 0.0f, DKH.A00(j)));
                String A0B2 = dlq.A0B();
                float f = 0.0f;
                if (A0B2 != null) {
                    f = FIy.A01(A0B2);
                }
                dqw = new Dqw(Shader.TileMode.CLAMP, A004, f, A012);
            }
            dr6 = new Dr6(dqw);
        }
        return dr6;
    }
}
