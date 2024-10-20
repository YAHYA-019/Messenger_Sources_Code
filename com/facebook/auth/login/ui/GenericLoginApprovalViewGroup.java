package com.facebook.auth.login.ui;

import X.0FI;
import X.1BK;
import X.1Bn;
import X.1Hv;
import X.2L0;
import X.7zR;
import X.AbG;
import X.AbH;
import X.C00i;
import X.C09s;
import X.CfG;
import X.DeE;
import X.EPM;
import X.Erh;
import X.FXr;
import X.FXs;
import X.FYa;
import X.GLg;
import X.JgM;
import X.RkA;
import X.S6V;
import X.SDu;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.http.protocol.ApiErrorResult;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* loaded from: GenericLoginApprovalViewGroup.class */
public class GenericLoginApprovalViewGroup extends AuthFragmentViewGroup {
    public static final String HIDE_LOGO_ON_SMALL_DISPLAYS = "orca:authparam:hide_logo";
    public static final String LAYOUT_RESOURCE = "orca:authparam:login_approval_layout";
    public static final long RESEND_CODE_BUTTON_ENABLED_DELAY_IN_MS = 60000;
    public static final String RESEND_CODE_STUB_ID = "orca:authparam:resend_code_stub_id";
    public InputMethodManager inputMethodManager;
    public final View loginButton;
    public C00i mAndroidThreadUtil;
    public Erh mDynamicLayoutUtil;
    public Runnable mEnableResendCodeButtonRunnable;
    public final boolean mHideLogoOnSmallDisplays;
    public View mResendCodeButton;
    public final TextView passwordText;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericLoginApprovalViewGroup(Context context, GLg gLg) {
        super(context, gLg);
        this.inputMethodManager = (InputMethodManager) 1Hv.A02(context, 100189);
        this.mDynamicLayoutUtil = (Erh) 1Bn.A0A(100055);
        this.mAndroidThreadUtil = AbH.A0K();
        setContentView(getResourceArgument(LAYOUT_RESOURCE, 2132542916));
        TextView A09 = AbG.A09(this, 2131366312);
        this.passwordText = A09;
        View A01 = C09s.A01(this, 2131365344);
        this.loginButton = A01;
        if (getArguments() == null) {
            this.mHideLogoOnSmallDisplays = false;
        } else {
            this.mHideLogoOnSmallDisplays = getArguments().getBoolean("orca:authparam:hide_logo", false);
            int resourceArgument = getResourceArgument(RESEND_CODE_STUB_ID, -1);
            if (resourceArgument != -1) {
                LoginErrorData loginErrorData = ((LoginApprovalFragment) gLg).A04;
                if (loginErrorData.A00 != 0 && !Platform.stringIsNullOrEmpty(loginErrorData.A05)) {
                    this.mResendCodeButton = ((ViewStub) C09s.A01(this, resourceArgument)).inflate();
                    setupResendButton(context);
                }
            }
        }
        setupViewSizeBasedVisibility();
        FXr.A03(A01, this, 7);
        FYa.A00(A09, this, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afterResendCodeError(ServiceException serviceException, Context context) {
        String obj;
        String str;
        boolean z = serviceException.getCause() instanceof 2L0;
        2L0 cause = serviceException.getCause();
        if (z) {
            ApiErrorResult apiErrorResult = cause.result;
            str = apiErrorResult.mErrorUserTitle;
            obj = apiErrorResult.A04();
        } else {
            obj = cause.toString();
            str = "";
        }
        AbG.A0B(this.mAndroidThreadUtil).Ciz(new SDu(context, this, str, obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afterResendCodeSuccess() {
        if (this.mEnableResendCodeButtonRunnable != null) {
            AbG.A0B(this.mAndroidThreadUtil).CY4(this.mEnableResendCodeButtonRunnable, 60000L);
        }
    }

    public static Bundle createParameterBundle(int i) {
        return createParameterBundle(i, false, -1);
    }

    public static Bundle createParameterBundle(int i, boolean z) {
        return createParameterBundle(i, z, -1);
    }

    public static Bundle createParameterBundle(int i, boolean z, int i2) {
        Bundle A05 = 1BK.A05();
        A05.putInt(LAYOUT_RESOURCE, i);
        A05.putBoolean("orca:authparam:hide_logo", z);
        A05.putInt(RESEND_CODE_STUB_ID, i2);
        return A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.os.Parcelable, com.facebook.auth.credentials.TwoFactorCredentials, com.facebook.auth.credentials.PasswordCredentials] */
    public void onLoginClick() {
        String charSequence = this.passwordText.getText().toString();
        if (charSequence.length() > 0) {
            7zR.A12(this, this.inputMethodManager);
            GLg gLg = (GLg) this.control;
            CfG cfG = new CfG(getContext(), 2131958828);
            LoginApprovalFragment loginApprovalFragment = (LoginApprovalFragment) gLg;
            EPM epm = EPM.A0Q;
            String str = loginApprovalFragment.A0A;
            Bundle A05 = 1BK.A05();
            LoginErrorData loginErrorData = loginApprovalFragment.A04;
            String l = Long.toString(loginErrorData.A00);
            String str2 = loginErrorData.A05;
            ?? passwordCredentials = new PasswordCredentials(epm, str, charSequence);
            passwordCredentials.A02 = l;
            passwordCredentials.A01 = charSequence;
            passwordCredentials.A00 = str2;
            A05.putParcelable("passwordCredentials", passwordCredentials);
            JgM jgM = loginApprovalFragment.A05;
            if (jgM.A1S()) {
                return;
            }
            jgM.A1Q(cfG);
            loginApprovalFragment.A05.A1R("auth_password", A05);
        }
    }

    private void setupResendButton(Context context) {
        View view = this.mResendCodeButton;
        if (view != null) {
            view.setEnabled(false);
            this.mEnableResendCodeButtonRunnable = new S6V(this);
            AbG.A0B(this.mAndroidThreadUtil).CY4(this.mEnableResendCodeButtonRunnable, 60000L);
            FXs.A01(this.mResendCodeButton, new DeE(context, this, 1), this, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupViewSizeBasedVisibility() {
        if (this.mHideLogoOnSmallDisplays) {
            Erh erh = this.mDynamicLayoutUtil;
            View rootView = getRootView();
            Resources resources = getResources();
            int integer = resources.getInteger(2131427334);
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new RkA(rootView, erh, ImmutableList.of((Object) 2131365357), integer));
            this.mDynamicLayoutUtil.A00(getRootView(), ImmutableList.of((Object) 2131368067, (Object) 2131363598), ImmutableList.of((Object) 2132279591, (Object) 2132279480), ImmutableList.of((Object) 2132279635, (Object) 2132279481), resources.getInteger(2131427330));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-953559593);
        AbG.A0B(this.mAndroidThreadUtil).CeL(this.mEnableResendCodeButtonRunnable);
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        0FI.A0C(-1973991899, A06);
    }
}
