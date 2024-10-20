package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Dva.class */
public final class Dva extends 1LH {
    public final long A00;
    public final 2lO A01;
    public final C1ro A02;
    public final C1rp A03;
    public final Integer A04;
    public final Function1 A05;

    public Dva(2lO r302, C1ro c1ro, C1rp c1rp, Integer num, Function1 function1, long j) {
        this.A02 = c1ro;
        this.A04 = num;
        this.A03 = c1rp;
        this.A00 = j;
        this.A01 = r302;
        this.A05 = function1;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.0CL] */
    public 1LI A0s(C2k5 c2k5) {
        C1rh A0Y;
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        Fis fis = new Fis(r0, AnonymousClass001.A0s());
        this.A05.invoke(fis);
        ?? obj = new Object();
        List A0S = 0QD.A0S(fis.A01);
        ((0CL) obj).element = A0S;
        if (A0S.isEmpty()) {
            return null;
        }
        long j = this.A00;
        if (7zO.A03(c2k5, j) > 0) {
            int intValue = this.A04.intValue();
            if (intValue == 0) {
                2lQ r02 = 2lO.A02;
                A0Y = C2so.A0Y(c2k5, 4YV.A0K(7zQ.A0X((2lO) null, 0S2.A0C, 0.0f), 0S2.A01, j));
            } else {
                if (intValue != 1) {
                    throw 1BK.A1F();
                }
                2lQ r03 = 2lO.A02;
                A0Y = C2so.A0Y(c2k5, 4YV.A0K(7zQ.A0X((2lO) null, 0S2.A0C, 0.0f), 0S2.A00, j));
            }
            Iterable iterable = (Iterable) ((0CL) obj).element;
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 0;
            for (Object obj2 : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    C0s8.A18();
                    throw 0Q8.createAndThrow();
                }
                0QU.A0t(i == 0 ? 11T.A03(obj2) : C0s8.A14(A0Y, (1LI) obj2), A0s);
                i = i2;
            }
            ((0CL) obj).element = A0s;
        }
        DKU dku = new DKU((Object) obj, 22);
        2lO r307 = this.A01;
        C2xi c2xi = new C2xi(0S2.A0C, false, 1);
        if (r307 == 2lO.A02) {
            r307 = null;
        }
        2lO A0g = 7zL.A0g(r307, c2xi);
        int intValue2 = this.A04.intValue();
        if (intValue2 == 0) {
            C1ro c1ro = this.A02;
            C1rp c1rp = this.A03;
            C2sn A0U = 7zQ.A0U(r0);
            dku.invoke(A0U);
            return C2so.A0B(A0U, c2k5, A0g, c1ro, c1rp);
        }
        if (intValue2 != 1) {
            throw 1BK.A1F();
        }
        C1ro c1ro2 = this.A02;
        C1rp c1rp2 = this.A03;
        C2sn A0U2 = 7zQ.A0U(r0);
        dku.invoke(A0U2);
        return C2so.A0V(A0U2, c2k5, A0g, c1ro2, c1rp2);
    }
}
