package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Ax7, reason: case insensitive filesystem */
/* loaded from: Ax7.class */
public final class C1942Ax7 extends 1LH {
    public final MigColorScheme A00;
    public final List A01;
    public final Function1 A02;

    public C1942Ax7(MigColorScheme migColorScheme, List list, Function1 function1) {
        11T.A0F(migColorScheme, 2);
        this.A01 = list;
        this.A00 = migColorScheme;
        this.A02 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        String A0W;
        11T.A0F(c2k5, 0);
        List<C1769As3> list = this.A01;
        if (list == null || list.isEmpty()) {
            return new 2AW();
        }
        2lQ r0 = 2lO.A02;
        2lO A0X = 7zQ.A0X(7zS.A0f(0S2.A01, 1.0f), 0S2.A0C, 1.0f);
        Integer num = 0S2.A00;
        2lO A0Y = 7zQ.A0Y(A0X, num, 9221401712017801217L);
        MigColorScheme migColorScheme = this.A00;
        2lO A0L = 4YV.A0L(A0Y, num, 7zL.A0j(migColorScheme.BDl()), 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        8OH A00 = C8m6.A00(A0L2.A00);
        7zM.A1O(A00, migColorScheme);
        A00.A0g(1.0f);
        Function1 function1 = this.A02;
        ArrayList A0z = 1BL.A0z(list);
        for (C1769As3 c1769As3 : list) {
            6BC r02 = new 6BC();
            r02.A00 = c1769As3.A00;
            r02.A06(c1769As3.A06);
            Context context = A0L2.AeS().A0D;
            Context A0B = 7zM.A0B(context);
            Long l = c1769As3.A05;
            r02.A05(l == null ? "" : AbK.A13(A0B, AbI.A1E(DateFormat.getDateTimeInstance(1, 3), l.longValue()), 2131956636));
            Context A0B2 = 7zM.A0B(context);
            1Bi.A03(83583);
            long A08 = 7zS.A08(l);
            Long l2 = c1769As3.A04;
            long longValue = l2 != null ? l2.longValue() : 0L;
            long now = 7zR.A0G().now();
            if ((longValue == 0 || longValue >= now) && (longValue != 0 || A08 >= now)) {
                Resources resources = A0B2.getResources();
                long j = c1769As3.A01;
                String quantityString = resources.getQuantityString(2131820598, (int) j, 1BK.A1Z(j));
                Resources resources2 = A0B2.getResources();
                long j2 = c1769As3.A02;
                A0W = 0Pz.A0W(quantityString, resources2.getQuantityString(2131820599, (int) j2, 1BK.A1Z(j2)));
            } else {
                Resources resources3 = A0B2.getResources();
                long j3 = c1769As3.A01;
                A0W = resources3.getQuantityString(2131820600, (int) j3, 1BK.A1Z(j3));
            }
            String str = A0W;
            11T.A0D(str);
            r02.A04 = 5OM.A00(str);
            r02.A03(migColorScheme);
            r02.A02(C5wv.A00(C0A2.A03(c1769As3.A07), C2q0.A08, C2py.ROUND_RECT, migColorScheme, 0));
            r02.A07 = COF.A00(2MQ.A0A, 2Re.A02, (AnonymousClass553) function1.invoke(c1769As3), migColorScheme, 3yH.A09(A0L2, 2131956637));
            A0z.add(r02.A00());
        }
        A00.A2W(0DW.A00(A0z));
        A00.A0J();
        return 7zM.A0l(A00.A01, A0L2, c2k5, A0L);
    }
}
