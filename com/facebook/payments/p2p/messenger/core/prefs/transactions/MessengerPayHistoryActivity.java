package com.facebook.payments.p2p.messenger.core.prefs.transactions;

import X.0PY;
import X.1BK;
import X.33A;
import X.6Gx;
import X.7zU;
import X.AbH;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00i;
import X.C06c;
import X.C1uu;
import X.C2047Da8;
import X.DKC;
import X.DKD;
import X.DKH;
import X.DS3;
import X.DU4;
import X.DUD;
import X.EL2;
import X.EOe;
import X.ER3;
import X.FHR;
import X.FI2;
import X.FXq;
import X.FZM;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fbui.widget.pagerindicator.TabbedViewPagerIndicator;
import com.facebook.payments.transactionhub.views.HubSettingsRowView;

/* loaded from: MessengerPayHistoryActivity.class */
public class MessengerPayHistoryActivity extends FbFragmentActivity {
    public C00i A00;
    public C00i A01;
    public final C00i A02 = DKD.A0Q();
    public final C00i A03 = AbH.A0D();
    public final C00i A04 = DKD.A0P();

    public static EOe A12(int i) {
        int intValue = DKD.A1a()[i].intValue();
        if (intValue == 0) {
            return EOe.A01;
        }
        if (intValue == 1) {
            return EOe.A03;
        }
        if (intValue == 2) {
            return EOe.A02;
        }
        throw AnonymousClass001.A0N(StringFormatUtil.formatStrLocaleSafe("%s View Pager cannot view page with index %d", MessengerPayHistoryActivity.class.getName(), Integer.valueOf(i)));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        6Gx A0a = DKC.A0a(this.A04);
        FHR A00 = FHR.A00();
        A00.A08("payments_transaction_history_impression");
        A00.A04(ER3.A0K);
        A0a.A05(A00);
        EL2 serializableExtra = getIntent().getSerializableExtra("messenger_pay_history_mode");
        int ordinal = serializableExtra.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2) {
                throw AnonymousClass002.A0C(serializableExtra, "Unknown MessengerPayHistoryMode provided ", AnonymousClass001.A0k());
            }
            Toolbar A0E = DKH.A0E(this, 2132542032);
            int i = 2131962829;
            if (serializableExtra == EL2.A01) {
                i = 2131957879;
            }
            A0E.A0M(i);
            FXq.A02(A0E, this, 77);
            if (BDe().A0Y(2131364227) == null) {
                33A c2047Da8 = new C2047Da8();
                Bundle A05 = 1BK.A05();
                A05.putSerializable("messenger_pay_history_mode", serializableExtra);
                c2047Da8.setArguments(A05);
                C06c A0D = 7zU.A0D(this);
                A0D.A0M(c2047Da8, 2131364227);
                A0D.A04();
                return;
            }
            return;
        }
        setContentView(2132542589);
        if (FI2.A02(this.A00)) {
            HubSettingsRowView findViewById = findViewById(2131368189);
            findViewById.setVisibility(0);
            CharSequence string = getString(2131952757);
            if (string != null) {
                findViewById.A01.setText(string);
                findViewById.A01.setVisibility(0);
            }
            Drawable A01 = ((C1uu) this.A02.get()).A01(2132345263, getResources().getColor(2132214292));
            ImageView imageView = findViewById.A00;
            if (imageView != null) {
                imageView.setImageDrawable(A01);
                findViewById.A00.setVisibility(0);
            }
            FXq.A01(findViewById, this, 75);
            findViewById(2131363685).setVisibility(0);
        }
        DU4 A002 = DU4.A00(1BK.A06(this.A01));
        DUD A052 = DUD.A05(AbstractC00603o4.A00(79), "p2p_settings");
        A052.A0D("tab_name", EOe.A01.toString());
        A002.A03(A052);
        ViewPager viewPager = (ViewPager) findViewById(2131365706);
        viewPager.A0R(new DS3(BDe(), this));
        TabbedViewPagerIndicator tabbedViewPagerIndicator = (TabbedViewPagerIndicator) findViewById(2131365707);
        tabbedViewPagerIndicator.A07(viewPager);
        0PY fzm = new FZM(this, 2);
        ViewPager viewPager2 = tabbedViewPagerIndicator.A03;
        if (viewPager2 != null) {
            viewPager2.A0S(fzm);
        }
        tabbedViewPagerIndicator.A0A.add(fzm);
        Toolbar toolbar = (Toolbar) A2c(2131368112);
        toolbar.A0M(2131963121);
        FXq.A02(toolbar, this, 76);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        this.A01 = AbH.A0P();
        this.A00 = DKD.A0V();
        setTheme(2132607581);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DUD.A06(DU4.A00(1BK.A06(this.A01)), "p2p_cancel_history", "p2p_settings");
        super.onBackPressed();
    }
}
