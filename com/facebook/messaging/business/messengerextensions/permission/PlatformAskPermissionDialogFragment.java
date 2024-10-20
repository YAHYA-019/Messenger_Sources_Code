package com.facebook.messaging.business.messengerextensions.permission;

import X.0FI;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Bi;
import X.1Bn;
import X.1iF;
import X.2Ov;
import X.7zL;
import X.7zO;
import X.AbE;
import X.AbF;
import X.AnonymousClass001;
import X.C0A2;
import X.DKB;
import X.DKG;
import X.HoJ;
import X.IKC;
import X.IMc;
import X.IMd;
import X.REu;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PlatformAskPermissionDialogFragment.class */
public final class PlatformAskPermissionDialogFragment extends 2Ov implements CallerContextable {
    public static final CallerContext A08 = CallerContext.A06(PlatformAskPermissionDialogFragment.class);
    public FbUserSession A00;
    public BrowserLiteJSBridgeCall A01;
    public IMd A02;
    public IMc A03;
    public REu A04;
    public HoJ A05;
    public String A06;
    public String A07;

    public static final void A05(TextView textView, String str) {
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public Dialog A0n(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        Dialog A0n = super.A0n(bundle);
        Window window = A0n.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = A0n.getWindow();
        if (window2 != null && (attributes = window2.getAttributes()) != null) {
            attributes.windowAnimations = 2132608893;
        }
        return A0n;
    }

    public 1iF A17() {
        return AbF.A0C(606440390061697L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1051723426);
        super.onCreate(bundle);
        this.A00 = 1BM.A01(this);
        this.A05 = (HoJ) 7zO.A0l(this, 115420);
        this.A03 = (IMc) 1Bi.A03(115419);
        this.A02 = (IMd) 1Bn.A0A(115487);
        0FI.A08(-936759265, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-397065257);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132543124, viewGroup, false);
        0FI.A08(-1582426426, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String string = bundle2.getString("profile_image_uri_string");
        ?? r0 = (FbDraweeView) 7zL.A0F(this, 2131362112);
        if (string == null || string.length() == 0) {
            r0.setVisibility(8);
        } else {
            r0.setVisibility(0);
            Uri uri = null;
            try {
                uri = C0A2.A03(string);
            } catch (SecurityException unused) {
            }
            r0.A0G(uri, A08);
        }
        View A0F = 7zL.A0F(this, 2131362113);
        String A00 = DKB.A00(ActionId.VIDEO_SET_RENDERER_CONTEXT);
        11T.A0I(A0F, A00);
        A05((TextView) A0F, bundle2.getString("title"));
        View A0F2 = 7zL.A0F(this, 2131362111);
        11T.A0I(A0F2, A00);
        A05((TextView) A0F2, bundle2.getString("description"));
        ThreadKey A0K = ThreadKey.A0K(bundle2.getString("thread_key_string"), true);
        if (A0K == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A07 = 1BK.A0w(A0K);
        this.A06 = bundle2.getString("page_id");
        TextView A0D = DKG.A0D(this, 2131362110);
        A05(A0D, bundle2.getString(AbE.A00(60)));
        IKC.A00(A0D, bundle2, this, 4);
        TextView A0D2 = DKG.A0D(this, 2131362109);
        A05(A0D2, bundle2.getString(AbE.A00(41)));
        IKC.A00(A0D2, bundle2, this, 5);
        this.A01 = (BrowserLiteJSBridgeCall) bundle2.getParcelable("js_bridge_call");
    }
}
