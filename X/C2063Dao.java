package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.banner.BasicBannerNotificationView;
import com.facebook.litho.LithoView;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Dao, reason: case insensitive filesystem */
/* loaded from: Dao.class */
public final class C2063Dao extends 2PX {
    public int A00;
    public int A01;
    public Context A02;
    public BasicBannerNotificationView A03;
    public String A04;
    public 1BY A05;
    public final C00i A06;
    public final C00i A07;

    public C2063Dao(1BO r302) {
        super("QuicksilverBannerNotification");
        Context A0J = 7zP.A0J();
        this.A02 = A0J;
        this.A06 = AbF.A0Q(A0J, 100193);
        this.A07 = DKG.A0Q();
        this.A05 = 7zL.A0Q(r302);
        this.A01 = 0;
        this.A00 = 2132214062;
        this.A04 = "";
    }

    public View BJy(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        String string = this.A01 == 0 ? this.A04 : context.getResources().getString(this.A01);
        if (DKF.A0d(this.A07).A07()) {
            1Iw A0W = 7zL.A0W(context);
            LithoView lithoView = (LithoView) ((LayoutInflater) this.A06.get()).inflate(2132542149, viewGroup, false);
            QFK A00 = QMn.A00(A0W);
            A00.A2X(string);
            A00.A2Z(false);
            A00.A2Y(true);
            lithoView.A10(DKE.A0a(A00.A2W(), A0W), true);
            return lithoView;
        }
        ImmutableList of = ImmutableList.of();
        ImmutableList of2 = ImmutableList.of();
        Integer num = 0S2.A01;
        int A02 = 7zM.A02(context, 2MR.A2K);
        ColorDrawable A0D = 7zL.A0D(context.getColor(this.A00));
        BasicBannerNotificationView basicBannerNotificationView = this.A03;
        if (basicBannerNotificationView == null) {
            BasicBannerNotificationView basicBannerNotificationView2 = new BasicBannerNotificationView(context);
            this.A03 = basicBannerNotificationView2;
            DKH.A16(basicBannerNotificationView2);
            this.A03.setOrientation(1);
            basicBannerNotificationView = this.A03;
        }
        string.getClass();
        basicBannerNotificationView.A0E(new C47c(A0D, of2, of, string, num, 0.0f, 0, A02));
        return basicBannerNotificationView;
    }
}
