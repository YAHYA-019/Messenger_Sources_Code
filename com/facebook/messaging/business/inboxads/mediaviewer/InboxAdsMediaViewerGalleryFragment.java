package com.facebook.messaging.business.inboxads.mediaviewer;

import X.0FI;
import X.0NA;
import X.0NL;
import X.1BJ;
import X.1BK;
import X.1Bi;
import X.1UG;
import X.1iF;
import X.2UZ;
import X.4oD;
import X.7zL;
import X.7zN;
import X.7zO;
import X.AbF;
import X.AbG;
import X.AbL;
import X.C0dr;
import X.C7W1;
import X.DKG;
import X.DTP;
import X.EdY;
import X.Ev9;
import X.FXr;
import X.FZN;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;
import com.google.common.collect.ImmutableList;

/* loaded from: InboxAdsMediaViewerGalleryFragment.class */
public class InboxAdsMediaViewerGalleryFragment extends FullScreenDialogFragment implements CallerContextable {
    public static final CallerContext A06 = CallerContext.A06(InboxAdsMediaViewerGalleryFragment.class);
    public FbUserSession A00;
    public InboxAdsData A01;
    public Ev9 A02;
    public long A03;
    public C0dr A04;
    public final 2UZ A05 = (2UZ) 1Bi.A03(17034);

    public 1iF A17() {
        return AbF.A0C(2429843100654746L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-557115400);
        super.onCreate(bundle);
        this.A00 = AbL.A09(this);
        A0g(2, 0NA.A03(getContext(), 2130971133, 2132608327));
        this.A02 = (Ev9) 7zO.A0l(this, 99699);
        this.A04 = (C0dr) 1Bi.A03(84488);
        0FI.A08(999852765, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(411868843);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542150);
        0FI.A08(-1996644154, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1986870075);
        super/*androidx.fragment.app.Fragment*/.onPause();
        2UZ r0 = this.A05;
        long now = this.A04.now() - this.A03;
        String str = 4oD.A00(this.A01).A0C;
        int i = 4oD.A00(this.A01).A01;
        1UG A08 = 1BK.A08(1BK.A07(r0.A03), 1BJ.A00(1424));
        if (A08.isSampled()) {
            A08.A7R("client_token", str);
            A08.A6H("time_on_screen", Long.valueOf(now));
            A08.A5q("ad_position", Integer.valueOf(i));
            A08.A7R("pigeon_reserved_keyword_module", "messenger_inbox_ads");
            A08.BZL();
        }
        0FI.A08(329282150, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-189836903);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A03 = this.A04.now();
        0FI.A08(-1851448591, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        this.A01 = (InboxAdsData) bundle2.getParcelable("inbox_ads_data");
        int i = bundle2.getInt("inbox_ads_mediainfo_start_index");
        ViewPager viewPager = (ViewPager) 7zL.A0F(this, 2131364574);
        ImmutableList A07 = this.A01.A07();
        EdY edY = new EdY(this);
        0NL r0 = new 0NL();
        ((DTP) r0).A01 = A07;
        ((DTP) r0).A00 = edY;
        viewPager.A0R(r0);
        viewPager.A0K(i);
        viewPager.A0S(new FZN(this, viewPager, 0));
        viewPager.A0M(7zO.A0D(this).getDimensionPixelSize(2132279314));
        View A0F = 7zL.A0F(this, 2131365563);
        A0F.measure(0, 0);
        Resources A0D = 7zO.A0D(this);
        DKG.A0D(this, 2131365564).setMaxWidth(((((C7W1.A01(getContext()) - (7zN.A01(A0D) * 2)) - (A0D.getDimensionPixelSize(2132279312) * 2)) - A0D.getDimensionPixelSize(2132279314)) - A0F.getMeasuredWidth()) - A0D.getDimensionPixelSize(2132279305));
        DKG.A0D(this, 2131365564).setText(4oD.A00(this.A01).A0B);
        ((FbDraweeView) 7zL.A0F(this, 2131365569)).A0G(this.A01.A02(), A06);
        FXr.A03(7zL.A0F(this, 2131365566), this, 69);
    }
}
