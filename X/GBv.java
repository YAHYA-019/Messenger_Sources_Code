package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: GBv.class */
public final class GBv extends C00q implements Function2 {
    public final /* synthetic */ F99 $actionHelper;
    public final /* synthetic */ Drawable $appIcon;
    public final /* synthetic */ C3bp $firstDrawReporter;
    public final /* synthetic */ C2lh $hasLoginStarted;
    public final /* synthetic */ boolean $isSingleProfile;
    public final /* synthetic */ C2lh $isUserInputEnabled;
    public final /* synthetic */ C00m $onLoginFinished;
    public final /* synthetic */ C00m $onLoginStarted;
    public final /* synthetic */ List $userAccounts;
    public final /* synthetic */ Dup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBv(Drawable drawable, C2lh c2lh, C2lh c2lh2, C3bp c3bp, Dup dup, F99 f99, List list, C00m c00m, C00m c00m2, boolean z) {
        super(2);
        this.$firstDrawReporter = c3bp;
        this.this$0 = dup;
        this.$isSingleProfile = z;
        this.$userAccounts = list;
        this.$onLoginStarted = c00m;
        this.$onLoginFinished = c00m2;
        this.$isUserInputEnabled = c2lh;
        this.$hasLoginStarted = c2lh2;
        this.$actionHelper = f99;
        this.$appIcon = drawable;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C2k5 c2k5 = (C2k5) obj;
        long j = ((C26P) obj2).A00;
        11T.A0F(c2k5, 0);
        ENz eNz = (ENz) 2rO.A00(c2k5, new G9F(this.this$0, j, this.$isSingleProfile), new Object[0]);
        C1ro c1ro = C1ro.STRETCH;
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        2lQ r0 = 2lO.A02;
        long A0G = 7zP.A0G();
        long A0A = 7zP.A0A();
        long A0F = 7zP.A0F();
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A04, A0A);
        Integer num = 0S2.A15;
        2lO A0K2 = 4YV.A0K(A0K, num, A0F);
        Integer num2 = 0S2.A1J;
        2lO A0K3 = 4YV.A0K(A0K2, num2, A0G);
        Integer num3 = 0S2.A01;
        2lO A00 = F1p.A00(7zQ.A0X(A0K3, num3, 1.0f), this.$firstDrawReporter);
        boolean z = this.$isSingleProfile;
        List list = this.$userAccounts;
        C00m c00m = this.$onLoginStarted;
        C00m c00m2 = this.$onLoginFinished;
        C2lh c2lh = this.$isUserInputEnabled;
        C2lh c2lh2 = this.$hasLoginStarted;
        F99 f99 = this.$actionHelper;
        Drawable drawable = this.$appIcon;
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r02 = A0L.A00;
        C2sn A0U = 7zQ.A0U(r02);
        Integer num4 = 0S2.A00;
        A0U.A00(new Dv1(num4, 11T.A03(new Ep8(ERA.A0M, ERD.A01, num4, 3yH.A09(A0U, 2131965777), new G9J(20, f99, A0U, list)))));
        A0L.A00(C2so.A00(A0U));
        2lO A0K4 = 4YV.A0K(7zS.A0V((2lO) null, 7zL.A0i(num, eNz.appLogoTopPadding), num2, eNz.appLogoBottomPadding), num3, eNz.appLogoSize);
        long j2 = eNz.minAppLogoSize;
        Integer num5 = 0S2.A0Y;
        7zQ.A1G(new DwQ(drawable, ImageView.ScaleType.CENTER_INSIDE, 4YV.A0K(4YV.A0K((2lO) null, num3, eNz.appLogoSize), num5, eNz.minAppLogoSize), 0, false), 7zQ.A0U(r02), A0L, 4YV.A0K(A0K4, num5, j2));
        if (z) {
            Eyw eyw = (Eyw) list.get(0);
            A0L.A00(new DvK(eNz, eyw, c00m, c00m2));
            A0L.A00(new Dvf(eNz, eyw, c00m, c00m2, 7zP.A1V(c2lh), 7zP.A1V(c2lh2)));
        } else {
            z = false;
        }
        C2sn A0U2 = 7zQ.A0U(r02);
        7zQ.A1G(new Dvd(eNz.loginToAnotherAccountSize, FE4.A00, 3yH.A09(A0U2, 2131958780), num4, new G9G(A0U2, f99, 12), true), A0U2, A0L, (2lO) null);
        A0L.A00(C2so.A0C(null, A0L, 7zQ.A0X((2lO) null, num3, 1.0f), C1rp.FLEX_END));
        A0L.A00(new Dw1(7zP.A1V(c2lh), z ? "SINGLE_PROFILE_AYMH_SCREEN" : "MULTI_PROFILE_AYMH_SCREEN"));
        2lO A0V = 7zS.A0V((2lO) null, 7zL.A0i(num, 7zQ.A0B()), num2, Double.doubleToRawLongBits(20.0f - FdG.A00.D18(0S2.A0B)));
        C2sn A0U3 = 7zQ.A0U(r02);
        A0U3.A00(new Dv7(num4, num4));
        A0L.A00(C2so.A0M(A0U3, A0L, A0V));
        return C2so.A0B(A0L, c2k5, A00, c1ro, c1rp);
    }
}
