package X;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.3Uk, reason: invalid class name */
/* loaded from: 3Uk.class */
public final class C3Uk implements C4cw {
    public final /* synthetic */ Inq A00;
    public final /* synthetic */ C4cw A01;
    public final /* synthetic */ InterfaceC04494b5 A02;
    public final /* synthetic */ 2Ff A03;
    public final /* synthetic */ 2Dp A04;

    public C3Uk(Inq inq, C4cw c4cw, InterfaceC04494b5 interfaceC04494b5, 2Ff r305, 2Dp r306) {
        this.A03 = r305;
        this.A04 = r306;
        this.A02 = interfaceC04494b5;
        this.A01 = c4cw;
        this.A00 = inq;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, X.0CL] */
    @Override // X.C4cw
    public /* bridge */ /* synthetic */ Object D4C(C05034cn c05034cn) {
        C05034cn A01;
        if (!c05034cn.A09() && !c05034cn.A0A()) {
            Object A08 = c05034cn.A08();
            11T.A0A(A08);
            if (AnonymousClass001.A1V(A08)) {
                A01 = C05034cn.A01(AnonymousClass001.A0K());
                return A01;
            }
        }
        2Ff r0 = this.A03;
        2Dp r02 = this.A04;
        InterfaceC04494b5 interfaceC04494b5 = this.A02;
        11T.A0D(interfaceC04494b5);
        C4cw c4cw = this.A01;
        Inq inq = this.A00;
        CancellationException cancellationException = 2Ff.A0G;
        Object obj = r0.A00.get();
        11T.A0A(obj);
        4bG r03 = (4bG) obj;
        String str = r02.A0I;
        C05004ck Aie = r03.Aie();
        if (str != null) {
            4cI r04 = (4cI) Aie.get(str);
            if (r04 != null) {
                return r04.A04(interfaceC04494b5);
            }
        } else if (Aie.size() != 0) {
            Iterator A0y = AnonymousClass001.A0y(r03.Aie());
            A01 = C05034cn.A01(false);
            11T.A0A(A01);
            ?? obj2 = new Object();
            ((0CL) obj2).element = A01;
            while (A0y.hasNext()) {
                ((0CL) obj2).element = ((4cI) AnonymousClass001.A0z(A0y).getValue()).A04(interfaceC04494b5);
                C05034cn.A00(inq.A00(), new ILu(inq, c4cw, (0CL) obj2), A01, C05034cn.A0A);
                A01 = (C05034cn) ((0CL) obj2).element;
            }
            return A01;
        }
        C05034cn A012 = C05034cn.A01(false);
        11T.A0A(A012);
        return A012;
    }
}
