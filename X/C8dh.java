package X;

import com.facebook.acra.constants.ActionId;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8dh, reason: invalid class name */
/* loaded from: 8dh.class */
public final class C8dh extends 1LH {
    public final String A00;
    public final List A01;
    public final C00m A02;
    public final Function1 A03;
    public final Function2 A04;
    public final boolean A05;
    public final float A06;
    public final 2lO A07;

    public C8dh(2lO r302, String str, List list, C00m c00m, Function1 function1, Function2 function2, float f, boolean z) {
        C3o5.A0k(function2, 4, function1);
        this.A01 = list;
        this.A06 = f;
        this.A05 = z;
        this.A04 = function2;
        this.A03 = function1;
        this.A02 = c00m;
        this.A07 = r302;
        this.A00 = str;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, X.0PI] */
    public 1LI A0s(C2k5 c2k5) {
        long j = ((C2lu) 2rO.A00(c2k5, new G9D(c2k5, 21), 7zL.A1Z(c2k5))).A00;
        C2lh A00 = C2lc.A00(c2k5, AQO.A00);
        9cG r0 = (9cG) 2rO.A00(c2k5, AQP.A00, new Object[0]);
        8Du r02 = new 8Du(2, A00, r0, this);
        2lO r03 = this.A07;
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        float f = this.A06;
        long A0F = 7zP.A0F();
        int A04 = 7zO.A04(A0U, A0F);
        long A0A = 7zP.A0A();
        int A042 = 7zO.A04(A0U, A0A);
        ?? obj = new Object();
        ((0PI) obj).element = (7zO.A0I(3vP.A00(A0U)).widthPixels - (A04 * 2)) - A042;
        int A043 = 7zO.A04(A0U, A0A);
        float f2 = ((0PI) obj).element / f;
        List list = this.A01;
        if (list.size() < 2) {
            ((0PI) obj).element += A042;
        }
        Integer num = 0S2.A01;
        2lQ r04 = 2lO.A02;
        2lO A0K = 4YV.A0K(4YV.A0K(C82m.A00(null, 0), num, ((int) f2) | 9221401712017801216L), 0S2.A1J, A043 | 9221401712017801216L);
        int i = (-1) >>> 1;
        C2lu A0w = 7zL.A0w(A0F);
        C2lu A0w2 = 7zL.A0w(A0F);
        long A08 = 7zP.A08();
        2NI r05 = C8nc.A0O;
        1Iw AeS = A0U.AeS();
        C02A c02a = AeS.A03.A01;
        C1J8 c1j8 = c02a.A02;
        boolean z = c02a.A0X;
        C9sn A002 = C9sn.A00(AeS);
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                A0U.A00(new C8ej(r05, null, r02, A0K, null, C9mj.A05(AeS, c1j8, null, num, 0, i, 7zN.A03(A0U, A08), false, z), A002.A01, r0, null, A0w, A0w2, null, null, null, false, false, null, 2, null, null, null, null, null, true));
                String A09 = 3yH.A09(A0U, 2131960194);
                Integer num2 = 0S2.A0P;
                return 7zM.A0l(new Dw8(7zT.A0Z(4YV.A0K((2lO) null, 0S2.A0E, A0A), 7zM.A0r(7zP.A09()), 7zQ.A08()), null, C97i.A0Z, A09, num2, 0, ActionId.VIDEO_SET_RENDERER_CONTEXT), A0U, c2k5, r03);
            }
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            Exr exr = (Exr) next;
            GBr gBr = new GBr(exr, 6);
            GBq gBq = new GBq(exr, A00, 37);
            AUu aUu = AUu.A00;
            AVe aVe = new AVe(A00, this, exr, obj, A04, i3, j);
            A002.A01.A01(gBr.invoke(exr), new 85O(19, new C9sl(A002.A00), aVe, exr), (Object[]) gBq.invoke(exr), 7zM.A00(aUu.invoke(exr)), false);
            i2 = i4;
        }
    }
}
