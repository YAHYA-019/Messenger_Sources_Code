package X;

import android.graphics.Color;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.8gc, reason: invalid class name */
/* loaded from: 8gc.class */
public final class C8gc extends 1LH {
    public final float A00;
    public final float A01;
    public final MemoryViewModel A02;
    public final C96y A03;
    public final MigColorScheme A04;
    public static final CallerContext A06 = CallerContext.A0B(C8gc.class.getName());
    public static final int A05 = Color.parseColor("#3B5093");

    public C8gc(MemoryViewModel memoryViewModel, C96y c96y, MigColorScheme migColorScheme, float f, float f2) {
        1BL.A1F(memoryViewModel, migColorScheme);
        11T.A0F(c96y, 5);
        this.A02 = memoryViewModel;
        this.A04 = migColorScheme;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = c96y;
    }

    public 1LI A0s(C2k5 c2k5) {
        String format;
        boolean A1W = 7zL.A1W(c2k5);
        2dP r0 = 2dP.A01;
        Integer num = 0S2.A0Y;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, r0, A1W ? 1 : 0));
        Integer num2 = 0S2.A01;
        2lO A04 = C82m.A04(A0g, num2, 100.0f, A1W ? 1 : 0);
        Integer num3 = 0S2.A00;
        2lO A042 = C82m.A04(A04, num3, 100.0f, A1W ? 1 : 0);
        C2sn A0I = 7zS.A0I(c2k5);
        int i = 8gY.A05;
        MemoryViewModel memoryViewModel = this.A02;
        CallerContext callerContext = A06;
        float f = this.A00;
        float f2 = this.A01;
        C96y c96y = this.A03;
        A0I.A00(new 8gY(callerContext, memoryViewModel, c96y, f, f2));
        if (c96y == C96y.A03) {
            2lO A043 = C82m.A04(null, num2, 0.0f, 1);
            boolean z = memoryViewModel.A0S;
            9Sg r02 = c96y.imageConfig;
            2lO A044 = C82m.A04(7zS.A0W(C82m.A04(A043, num3, z ? r02.A01 : r02.A02, A1W ? 1 : 0), 7zL.A0k(num, memoryViewModel.A00), num, r0, A1W ? 1 : 0), num2, 0.0f, 1);
            long A062 = 4YV.A06(2RH.A07);
            Integer num4 = 0S2.A1J;
            2lO A0V = 7zS.A0V(7zL.A0g(A044, new C6na(num4, A062)), 7zL.A0i(0S2.A1G, 7zQ.A08()), num4, 7zP.A0B());
            C1rp c1rp = C1rp.FLEX_END;
            C1ro c1ro = C1ro.FLEX_END;
            C2sn A0J = 7zS.A0J(A0I);
            2KD A0r = 7zL.A0r(A0J, A1W ? 1 : 0);
            long j = memoryViewModel.A06;
            if (j == 0) {
                format = "";
            } else {
                format = new SimpleDateFormat("MMM d, yyyy", ((1GS) 1Bi.A03(16504)).A05()).format(new Date(j));
                11T.A0A(format);
            }
            A0r.A2z(format);
            int i2 = A05;
            A0r.A2w(new 3yK(i2, i2));
            A0r.A2l();
            A0r.A2q(1);
            7zQ.A1K(A0J, this.A04, A0r);
            A0I.A00(C2so.A0B(A0J, A0I, A0V, c1ro, c1rp));
        }
        return C2so.A06(A0I, c2k5, A042);
    }
}
