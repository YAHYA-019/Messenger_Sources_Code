package com.facebook.messaging.internalprefs.fxpf;

import X.11T;
import X.1Br;
import X.1Bu;
import X.2OB;
import X.AnonymousClass001;
import X.C00i;
import X.C21i;
import X.C21j;
import X.C21m;
import X.DKC;
import X.DKH;
import X.FXr;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.resources.ui.FbLinearLayout;
import fxcache.model.FxCalAccount;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: FXPFLinkageCacheDebugFragment.class */
public final class FXPFLinkageCacheDebugFragment extends FbFragmentActivity {
    public final FXPFLinkageCacheDebugFragment A03 = this;
    public final CallerContext A01 = CallerContext.A0B("FXPFLinkageCacheDebugFragment");
    public final 1Br A02 = 1Bu.A00(65977);
    public final LinearLayout.LayoutParams A04 = new LinearLayout.LayoutParams(-1, -2);
    public final LinearLayout.LayoutParams A00 = new LinearLayout.LayoutParams(-2, -2);

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout, com.facebook.resources.ui.FbLinearLayout, android.view.View, android.view.ViewGroup] */
    private final FbLinearLayout A12(String str, String str2) {
        FXPFLinkageCacheDebugFragment fXPFLinkageCacheDebugFragment = this.A03;
        11T.A0I(fXPFLinkageCacheDebugFragment, "null cannot be cast to non-null type android.content.Context");
        ?? linearLayout = new LinearLayout(fXPFLinkageCacheDebugFragment);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(this.A04);
        LinearLayout.LayoutParams layoutParams = this.A00;
        linearLayout.addView(DKH.A0Z(fXPFLinkageCacheDebugFragment, layoutParams, str));
        linearLayout.addView(DKH.A0Z(fXPFLinkageCacheDebugFragment, layoutParams, str2));
        return linearLayout;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout, com.facebook.resources.ui.FbLinearLayout, android.view.ViewGroup] */
    private final FbLinearLayout A15(String str, List list) {
        FXPFLinkageCacheDebugFragment fXPFLinkageCacheDebugFragment = this.A03;
        11T.A0I(fXPFLinkageCacheDebugFragment, "null cannot be cast to non-null type android.content.Context");
        ?? linearLayout = new LinearLayout(fXPFLinkageCacheDebugFragment);
        linearLayout.setOrientation(1);
        2OB A0Z = DKH.A0Z(fXPFLinkageCacheDebugFragment, this.A00, str);
        A0Z.setTypeface(null, 1);
        linearLayout.addView(A0Z);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FxCalAccount fxCalAccount = (FxCalAccount) it.next();
            linearLayout.addView(A12("Account Id: ", fxCalAccount.A03));
            String str2 = fxCalAccount.A0A;
            String str3 = "NULL";
            if (str2 == null) {
                str2 = str3;
            }
            linearLayout.addView(A12("Username: ", str2));
            String str4 = fxCalAccount.A07;
            if (str4 != null) {
                str3 = str4;
            }
            linearLayout.addView(A12("ObId: ", str3));
            11T.A0I(fXPFLinkageCacheDebugFragment, "null cannot be cast to non-null type android.content.Context");
            View view = new View(fXPFLinkageCacheDebugFragment);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
            view.setBackgroundResource(2132214169);
            linearLayout.addView(view);
        }
        return linearLayout;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Toolbar A0E = DKH.A0E(this, 2132543165);
        A0E.A0T(getTitle().toString());
        FXr.A04(A0E, this, 88);
        this.A04.setMargins(32, 8, 4, 8);
        LinearLayout.LayoutParams layoutParams = this.A00;
        layoutParams.setMargins(16, 0, 4, 0);
        ViewGroup viewGroup = (ViewGroup) A2c(2131363324);
        viewGroup.removeAllViews();
        C00i c00i = this.A02.A00;
        C21j c21j = (C21j) c00i.get();
        CallerContext callerContext = this.A01;
        List A01 = c21j.A01(callerContext, "msgr_android_linking_cache_fx_internal", "FACEBOOK");
        List A012 = ((C21j) c00i.get()).A01(callerContext, "msgr_android_linking_cache_fx_internal", "INSTAGRAM");
        String format = String.format("Data of %d FB accounts and %d IG accounts", Arrays.copyOf(AnonymousClass001.A1b(Integer.valueOf(A01.size()), A012.size()), 2));
        11T.A0A(format);
        TextView A0J = DKC.A0J(this, 2131364443);
        A0J.setText(format);
        A0J.setLayoutParams(layoutParams);
        viewGroup.addView(A15("FB Accounts", A01));
        viewGroup.addView(A15("IG Accounts", A012));
        TextView A0J2 = DKC.A0J(this, 2131365161);
        String format2 = DateFormat.getDateTimeInstance().format(new Date(((C21m) 1Br.A0B(((C21i) c00i.get()).A00)).A06().A00));
        11T.A0A(format2);
        A0J2.setText(format2);
        A0J2.setLayoutParams(layoutParams);
    }
}
