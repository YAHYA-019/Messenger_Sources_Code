package X;

import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import kotlin.jvm.functions.Function2;

/* loaded from: GBt.class */
public final class GBt extends C00q implements Function2 {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBt(String str, int i) {
        super(2);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [X.23P, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 == 0) {
            Object obj3 = DKD.A0f(obj).A01;
            obj3.getClass();
            return Boolean.valueOf(11T.A0O(((PaymentMethod) obj3).Aez(), this.A01));
        }
        C2k5 c2k5 = (C2k5) obj;
        long j = ((C26P) obj2).A00;
        11T.A0F(c2k5, 0);
        Integer num = 0S2.A0E;
        C97i c97i = C97i.A0i;
        String str = this.A01;
        2lQ r0 = 2lO.A02;
        long A01 = C26P.A01(j) | 9221401712017801216L;
        Integer num2 = 0S2.A00;
        2lO A0K = 4YV.A0K((2lO) null, num2, A01);
        long A02 = C26P.A02(j) | 9221401712017801216L;
        Integer num3 = 0S2.A0Y;
        Dw8 dw8 = new Dw8(4YV.A0K(A0K, num3, A02), null, c97i, str, num, 3, ActionId.MISSED_EVENT);
        ?? obj4 = new Object();
        1Iw r02 = c2k5.A05;
        dw8.A0c(r02, (C23P) obj4, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        2lO A0K2 = 4YV.A0K(4YV.A0K((2lO) null, num2, A01), 0S2.A01, obj4.A00 | 9221401712017801216L);
        long A08 = 7zP.A08();
        Dud A012 = Dzc.A01(r02);
        A012.A2c(new Dw8(4YV.A0K(C82m.A04(null, num2, 100.0f, 0), num3, obj4.A00 | 9221401712017801216L), null, c97i, str, num, 0, ActionId.VIDEO_SET_RENDERER_CONTEXT));
        A012.A2a(7zO.A03(c2k5, 9221401712017801216L));
        A012.A2g(true);
        A012.A2X();
        A012.A2h(false);
        A012.A2f(true);
        A012.A2Z(7zO.A03(c2k5, A08));
        A012.A2e(false);
        A012.A2d(null);
        C5z7.A00(A012, A0K2);
        Dzc A2V = A012.A2V();
        11T.A0D(A2V);
        return A2V;
    }
}
