package com.facebook.browser.lite.search.ui.facebook;

import X.0CU;
import X.0CV;
import X.0D2;
import X.0FI;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.2yD;
import X.7zL;
import X.7zM;
import X.7zP;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C27w;
import X.DKC;
import X.DKD;
import X.DR8;
import X.E9e;
import X.EQM;
import X.FKB;
import X.FKF;
import X.JQw;
import X.K2L;
import X.KOr;
import X.L7b;
import X.LDF;
import X.LFa;
import X.LUB;
import X.MLg;
import X.RYc;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.resources.ui.FbTextView;
import com.facebook.secure.securewebview.SecureWebView;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.widget.FbImageView;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

/* loaded from: SearchBottomSheetFragment.class */
public final class SearchBottomSheetFragment extends DR8 {
    public RYc A00;
    public FbTextView A01;
    public SecureWebView A02;
    public FbImageView A03;
    public String A04;
    public MLg A06;
    public final 1Br A08 = 7zM.A0S();
    public final 1Br A07 = 1BK.A0C();
    public final Set A0B = 7zL.A15();
    public final Set A09 = 7zL.A15();
    public String A05 = "";
    public final DialogInterface.OnKeyListener A0A = new FKF(this, 1);

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(12:5|6|7|(2:9|(2:11|12)(2:27|28))(2:29|(20:31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|(2:51|52))(2:53|54))|13|14|15|16|17|(4:19|20|21|22)|24|25))|56|6|7|(0)(0)|13|14|15|16|17|(0)|24|25) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0128 A[Catch: Exception -> 0x0145, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0145, blocks: (B:12:0x0109, B:14:0x0110, B:15:0x0115, B:16:0x011c, B:19:0x0128, B:21:0x0130, B:31:0x0099, B:33:0x00a5, B:34:0x00ab, B:34:0x00ab, B:37:0x00b2, B:39:0x00b8, B:41:0x00c3, B:43:0x00d7, B:44:0x00de, B:45:0x00e5, B:46:0x00eb, B:47:0x00f1, B:48:0x00f8), top: B:7:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A05(com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment r301, java.lang.String r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment.A05(com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment, java.lang.String, X.0DR):java.lang.Object");
    }

    public static final void A07(SearchBottomSheetFragment searchBottomSheetFragment, KOr kOr) {
        MLg mLg = searchBottomSheetFragment.A06;
        if (mLg != null) {
            mLg.BZU(kOr, 0S2.A01);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A09(com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment r301, java.lang.Integer r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment.A09(com.facebook.browser.lite.search.ui.facebook.SearchBottomSheetFragment, java.lang.Integer, java.lang.String):void");
    }

    public static final void A0A(SearchBottomSheetFragment searchBottomSheetFragment, String str, int i) {
        7zP.A0e(searchBottomSheetFragment.A08).markerPoint(i, 0, str);
    }

    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        11T.A0I(A0n, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        A0n.setOnShowListener(new LFa(this, A0n, 0));
        return A0n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        int A02 = 0FI.A02(-954331169);
        11T.A0F(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString(JQw.A00(2))) != null) {
            this.A00 = new RYc(string);
            Bundle bundle3 = LUB.A04;
            this.A06 = new LUB(LDF.A00(), string);
        }
        View inflate = layoutInflater.inflate(2132543294, viewGroup, false);
        0FI.A08(597283068, A02);
        return inflate;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-512786289);
        super/*X.0D2*/.onDestroyView();
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setOnKeyListener(null);
        }
        this.A02 = null;
        this.A03 = null;
        this.A01 = null;
        this.A0B.clear();
        this.A09.clear();
        0FI.A08(-823814981, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-2066383105);
        Context context = getContext();
        if (context != null) {
            C27w.A00(new K2L(context), new L7b(), 0);
        }
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(1449381895, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-18828863);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C27w.A00(new K2L(activity), new L7b(), 0);
        }
        super/*androidx.fragment.app.Fragment*/.onResume();
        0FI.A08(130391338, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        A0A(this, "IABSearch.openSearchBottomSheet.viewCreated", 1008351974);
        A07(this, KOr.A1V);
        A0A(this, "IABSearch.searchBottomSheet.Open", 1008351974);
        RYc rYc = this.A00;
        if (rYc != null) {
            rYc.A01.put(EQM.A03, AnonymousClass002.A0G());
        }
        this.A02 = (SecureWebView) view.findViewById(2131367233);
        this.A03 = (FbImageView) view.findViewById(2131367169);
        this.A01 = DKC.A0e(view, 2131367170);
        SecureWebView secureWebView = this.A02;
        if (secureWebView != null) {
            secureWebView.getSettings().setJavaScriptEnabled(true);
            secureWebView.getSettings().setDatabaseEnabled(true);
            secureWebView.getSettings().setDomStorageEnabled(true);
            try {
                this.A09.addAll(0CU.A0M(2yD.A02(1Br.A06(this.A07), 36888911465678661L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
            } catch (Exception e) {
                0fH.A0w("SearchBottomSheetFragment", "malformed domains", e);
            }
            secureWebView.A06(new E9e(this));
            String A02 = 2yD.A02(1Br.A07(this.A07), 36888911465350980L);
            Dialog dialog = ((0D2) this).A01;
            11T.A0I(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            View findViewById = dialog.findViewById(2131363607);
            if (findViewById != null) {
                findViewById.getLayoutParams().height = DKD.A09(findViewById).heightPixels;
            }
            secureWebView.loadUrl(A02);
            Context context = getContext();
            if (context != null) {
                Bundle bundle2 = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
                String str = null;
                if (bundle2 != null) {
                    str = bundle2.getString("com.google.android.safetynet.API_KEY");
                }
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                this.A05 = str;
                if (!TextUtils.isEmpty("blocking.html")) {
                    try {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("blocking.html", 3)));
                            try {
                                try {
                                    StringBuilder A0k = AnonymousClass001.A0k();
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        } else {
                                            A0k.append(readLine);
                                        }
                                    }
                                    bufferedReader.close();
                                    String obj = A0k.toString();
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused) {
                                    }
                                    if (obj != null) {
                                        str2 = obj;
                                    }
                                } catch (FileNotFoundException | IOException unused2) {
                                    bufferedReader.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (IOException unused3) {
                                    throw th;
                                }
                            }
                        } catch (FileNotFoundException | IOException unused4) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.A04 = str2;
                if (str2.length() > 0) {
                    this.A04 = 0CV.A0W(0CV.A0W(0CV.A0W(0CV.A0W(str2, "{{__search_safe_browsing_blocking_page_headline__}}", 1BK.A0u(context, 2131951935)), "{{__search_safe_browsing_blocking_page_subtext__}}", 1BK.A0u(context, 2131951936)), "{{__search_safe_browsing_blocking_page_go_back_button_text__}}", 1BK.A0u(context, 2131951934)), "{{__search_safe_browsing_blocking_page_go_back_button__}}", 1BK.A0u(context, 2131951933));
                }
            }
        }
        Dialog dialog2 = ((0D2) this).A01;
        if (dialog2 != null) {
            dialog2.setOnKeyListener(this.A0A);
        }
        Dialog dialog3 = ((0D2) this).A01;
        if (dialog3 != null) {
            dialog3.setOnDismissListener(new FKB(this, 2));
        }
    }
}
