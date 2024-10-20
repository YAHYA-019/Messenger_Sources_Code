package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.payments.transactionhub.views.HubBrandingPromiseInfoSectionView;
import com.facebook.payments.transactionhub.views.HubIntroBrandingView;

/* loaded from: Fmr.class */
public final class Fmr implements GFd {
    public 1BY A00;
    public final C00i A01 = DKE.A0Z();

    public Fmr(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.GFd
    public GFc B1x(ThreadSummary threadSummary, EMw eMw) {
        E6u e6u = new E6u(1BK.A04(this.A01));
        e6u.A01 = eMw;
        Context context = e6u.getContext();
        Resources resources = context.getResources();
        C00i c00i = e6u.A00;
        ((HubIntroBrandingView) e6u).A07.setText(2yD.A02(DKH.A0T(c00i), 36875820405621292L));
        ((HubIntroBrandingView) e6u).A06.A05(resources.getString(2131962355));
        CharSequence A02 = 2yD.A02(DKH.A0T(c00i), 36875820405686829L);
        CharSequence A022 = 2yD.A02(DKH.A0T(c00i), 36875820405752366L);
        CharSequence A023 = 2yD.A02(DKH.A0T(c00i), 36875820405817903L);
        HubBrandingPromiseInfoSectionView hubBrandingPromiseInfoSectionView = ((HubIntroBrandingView) e6u).A05;
        hubBrandingPromiseInfoSectionView.A00.A00.setText(A02);
        hubBrandingPromiseInfoSectionView.A01.A00.setText(A022);
        hubBrandingPromiseInfoSectionView.A02.A00.setText(A023);
        5Gh drawable = context.getDrawable(2132411330);
        String str = drawable instanceof 5OF ? drawable.A00.A02.A02 : null;
        if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
            ((HubIntroBrandingView) e6u).A02.A0G(C0A2.A03(str), HubIntroBrandingView.A0A);
        }
        5Gh drawable2 = context.getDrawable(2132347065);
        String str2 = drawable2 instanceof 5OF ? drawable2.A00.A02.A02 : null;
        if (!TextUtils.isEmpty(str2) && URLUtil.isValidUrl(str2)) {
            ((HubIntroBrandingView) e6u).A03.A0G(C0A2.A03(str2), HubIntroBrandingView.A0A);
        }
        return e6u;
    }
}
