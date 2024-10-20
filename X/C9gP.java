package X;

import com.facebook.litho.LithoView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.9gP, reason: invalid class name */
/* loaded from: 9gP.class */
public final class C9gP {
    public LithoView A00;
    public 5zD A01;
    public AZW A02;
    public String A03;
    public List A04;
    public final 1Br A05 = 1Bq.A00(67960);
    public final 1Br A06;
    public final Integer A07;
    public final Function1 A08;
    public final Function2 A09;

    public C9gP(Integer num) {
        this.A07 = num;
        1Br A00 = 1Bu.A00(49882);
        this.A06 = A00;
        this.A01 = (5zC) 1Br.A0B(A00);
        this.A03 = "";
        this.A04 = C0ty.A00;
        this.A08 = AnonymousClass843.A00(this, 47);
        this.A09 = new AW4(this, 33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [X.0ty] */
    public static final void A00(C9gP c9gP) {
        ArrayList A0z;
        LithoView lithoView;
        int i;
        Function2 function2;
        Function1 function1;
        if (c9gP.A03.length() == 0) {
            lithoView = c9gP.A00;
            if (lithoView == null) {
                return;
            }
            A0z = C0ty.A00;
            i = 0;
            function2 = AVo.A00;
            function1 = AT2.A00;
        } else {
            List<9Xd> list = c9gP.A04;
            A0z = 1BL.A0z(list);
            for (9Xd r0 : list) {
                String str = c9gP.A03;
                5zD r02 = c9gP.A01;
                5aU A00 = r0.A00();
                Integer num = c9gP.A07;
                Integer num2 = 0S2.A01;
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(num == num2 ? "avatar_power_up_tag_" : "regular_power_up_tag_");
                A0k.append(A00);
                A0k.append('_');
                A0k.append(str.hashCode());
                A0z.add(new 8Le(r02, r0, str, A0k.toString()));
            }
            Integer num3 = c9gP.A07;
            if (num3 == 0S2.A01 && 1BK.A1Y(A0z)) {
                ((9bU) 1Br.A0B(c9gP.A05)).A00(C93k.A00);
            }
            lithoView = c9gP.A00;
            if (lithoView == null) {
                return;
            }
            i = num3.intValue() != 0 ? 0 : 12;
            function2 = c9gP.A09;
            function1 = c9gP.A08;
        }
        lithoView.A0x(new 8ZT(A0z, function1, function2, i));
    }
}
