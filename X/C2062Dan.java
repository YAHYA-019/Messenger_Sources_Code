package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.banner.BasicBannerNotificationView;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Dan, reason: case insensitive filesystem */
/* loaded from: Dan.class */
public final class C2062Dan extends 2PX {
    public final LayoutInflater A00;
    public final C47c A01;

    public C2062Dan() {
        super("BusinessRequestErrorBannerNotification");
        LayoutInflater layoutInflater = (LayoutInflater) 1Hv.A02(7zP.A0J(), 100193);
        Context A00 = FbInjector.A00();
        this.A00 = layoutInflater;
        ImmutableList of = ImmutableList.of();
        ImmutableList of2 = ImmutableList.of();
        String string = A00.getResources().getString(2131953650);
        Drawable drawable = A00.getResources().getDrawable(2132213811);
        Integer num = 0S2.A00;
        string.getClass();
        this.A01 = new C47c(drawable, of2, of, string, num, 0.0f, 0, 0);
    }

    public View BJy(ViewGroup viewGroup) {
        BasicBannerNotificationView basicBannerNotificationView = (BasicBannerNotificationView) AbG.A08(this.A00, viewGroup, 2132541563);
        basicBannerNotificationView.A0E(this.A01);
        return basicBannerNotificationView;
    }
}
