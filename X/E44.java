package X;

import java.util.AbstractCollection;
import java.util.List;

/* loaded from: E44.class */
public final class E44 extends ExW {
    public static final E44 A00 = new Object();

    public /* bridge */ /* synthetic */ Object A02(FFX ffx, GL7 gl7, FyG fyG) {
        AbstractCollection A1F;
        GL7 Ay2 = gl7.Ay2(36);
        F4M A002 = F4M.A00(gl7.Aty(38));
        GKG A003 = FFX.A00(ffx, fyG, gl7.getString(42));
        FJ5.A06(A003, "Cannot find state %s");
        Object BIm = A003.BIm(FJ3.A01(fyG), A002);
        if (BIm instanceof List) {
            A1F = AbF.A1F();
            for (Object obj : (List) BIm) {
                if (obj instanceof java.util.Map) {
                    Object obj2 = ((java.util.Map) obj).get("__key");
                    if (obj2 instanceof String) {
                        A1F.add(R1f.A00(A002, A003, Ay2, fyG, (String) obj2, GL7.A05(gl7)));
                    } else {
                        FAo.A00(fyG, AnonymousClass001.A0L("Received a for each item with invalid or no __key."));
                    }
                } else {
                    FAo.A00(fyG, AnonymousClass001.A0L("Received a for each item that is not a Map."));
                }
            }
        } else {
            FAo.A00(fyG, AnonymousClass001.A0L("Received non List value to for-each on."));
            A1F = AnonymousClass001.A0s();
        }
        return A1F;
    }

    public void A03(ET4 et4, GI1 gi1, FyG fyG) {
        GL7 gl7 = et4.A01;
        int Acj = gl7.Acj();
        String string = gl7.getString(42);
        QQD qqd = new QQD(F4M.A00(gl7.Aty(38)), fyG, Acj, et4.A00);
        GKG A002 = FFX.A00(FJ3.A04(fyG), fyG, string);
        FJ5.A06(A002, "Cannot find state %s");
        A002.A6B(FJ3.A01(fyG), qqd);
        qqd.A00.add(gi1);
    }
}
