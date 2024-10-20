package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2xq, reason: invalid class name */
/* loaded from: 2xq.class */
public final class C2xq extends C00q implements Function1 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xq(Object obj, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (2 - this.A00 == 0) {
            Function1 function1 = (Function1) obj;
            11T.A0F(function1, 0);
            2bM.A00((2bM) this.A03).A01(new A1b(function1, 28), this.A01, this.A02);
            return 04S.A00;
        }
        0D7 r0 = (0D7) obj;
        11T.A0F(r0, 0);
        2R0 r02 = (2R0) this.A03;
        int i = this.A01;
        int i2 = this.A02;
        0DA r03 = new 0DA();
        r03.A06("badge_count", Long.valueOf(i));
        r03.A01(C1ub.A03.A0H() ? ((C46n) r02.A07.A00.get()).A00() : ((2R4) r02.A08.A00.get()).A00() ? i > 0 ? EnumC03213xe.UNREAD_STORIES : null : EnumC03213xe.FIRST_TIME_HT_NUX, "badge_type");
        r0.A0A(r03, "surface_info");
        0DA r04 = new 0DA();
        r04.A02(new 0DA(), "ids");
        r04.A01(2R7.A08, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r04.A06("relative_position", Long.valueOf(i2));
        r0.A0A(r04, "item_container");
        return r0;
    }
}
