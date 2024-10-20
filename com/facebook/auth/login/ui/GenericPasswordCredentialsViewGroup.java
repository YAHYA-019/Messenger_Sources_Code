package com.facebook.auth.login.ui;

import X.0Dc;
import X.1BY;
import X.1Bn;
import X.5YB;
import X.7zM;
import X.AbG;
import X.BRe;
import X.C09s;
import X.C0A2;
import X.CfG;
import X.DKC;
import X.DKD;
import X.DOT;
import X.FEv;
import X.FWn;
import X.FXr;
import X.FYa;
import X.GCO;
import X.GHW;
import X.GLh;
import X.MIN;
import android.R;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbservice.service.ServiceException;
import com.google.common.base.Preconditions;
import java.util.TreeSet;

/* loaded from: GenericPasswordCredentialsViewGroup.class */
public class GenericPasswordCredentialsViewGroup extends AuthFragmentLogoViewGroup implements GHW, CallerContextable {
    public static final CallerContext CALLER_CONTEXT = CallerContext.A06(GenericPasswordCredentialsViewGroup.class);
    public final TextView emailText;
    public final Button loginButton;
    public final boolean mInitialized;
    public FEv mPasswordCredentialsViewGroupHelper;
    public final TextView notYouLink;
    public final TextView passwordText;
    public final Button signupButton;
    public final TextView userName;
    public final FbDraweeView userPhoto;

    public GenericPasswordCredentialsViewGroup(Context context, GLh gLh) {
        this(context, gLh, null, new CfG(context, 2131958828));
    }

    public GenericPasswordCredentialsViewGroup(Context context, GLh gLh, GCO gco) {
        this(context, gLh, gco, new CfG(context, 2131958828));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericPasswordCredentialsViewGroup(Context context, GLh gLh, GCO gco, MIN min) {
        super(context, gLh);
        AccountManager accountManager;
        TelephonyManager telephonyManager;
        String line1Number;
        this.userPhoto = DKC.A0M(this, 2131368302);
        this.userName = AbG.A09(this, 2131368301);
        TextView A09 = AbG.A09(this, 2131365996);
        this.notYouLink = A09;
        TextView A092 = AbG.A09(this, 2131363849);
        this.emailText = A092;
        TextView A093 = AbG.A09(this, 2131366312);
        this.passwordText = A093;
        Button button = (Button) C09s.A01(this, 2131365344);
        this.loginButton = button;
        Button button2 = (Button) findViewById(2131367399);
        this.signupButton = button2;
        FEv fEv = (FEv) 1Bn.A0E(context, (1BY) null, 100139);
        this.mPasswordCredentialsViewGroupHelper = fEv;
        fEv.A04 = this;
        fEv.A05 = gLh;
        fEv.A02 = A092;
        fEv.A03 = A093;
        fEv.A00 = button;
        fEv.A01 = button2;
        fEv.A06 = gco;
        fEv.A07 = min;
        FEv.A01(fEv);
        TextWatcher fWn = new FWn(fEv, 0);
        TextView textView = fEv.A02;
        if (textView instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textView;
            TreeSet treeSet = new TreeSet();
            Context context2 = autoCompleteTextView.getContext();
            if (BRe.A00(context2) && (telephonyManager = fEv.A0B) != null && (line1Number = telephonyManager.getLine1Number()) != null && DKD.A1X(line1Number, Patterns.PHONE)) {
                treeSet.add(line1Number);
            }
            if (fEv.A0A.checkPermission("android.permission.GET_ACCOUNTS", fEv.A0D) == 0 && (accountManager = fEv.A09) != null) {
                Account[] accounts = accountManager.getAccounts();
                int length = accounts.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    Account account = accounts[i2];
                    if (DKD.A1X(account.name, Patterns.EMAIL_ADDRESS)) {
                        treeSet.add(account.name);
                    }
                    i = i2 + 1;
                }
            }
            autoCompleteTextView.setAdapter(new ArrayAdapter(context2, R.layout.simple_dropdown_item_1line, treeSet.toArray(new String[treeSet.size()])));
        }
        fEv.A02.addTextChangedListener(fWn);
        fEv.A03.addTextChangedListener(fWn);
        FXr.A03(fEv.A00, fEv, 9);
        Button button3 = fEv.A01;
        if (button3 != null) {
            FXr.A03(button3, fEv, 10);
        }
        FYa.A00(fEv.A03, fEv, 4);
        fEv.A03.setTypeface(Typeface.DEFAULT);
        this.mInitialized = true;
        DOT dot = new DOT();
        Resources resources = getResources();
        0Dc r0 = new 0Dc(resources);
        r0.A04(dot, 33);
        r0.A02(resources.getString(2131966278));
        r0.A00();
        A09.setText(7zM.A0E(r0));
        A09.setSaveEnabled(false);
        FXr.A03(A09, this, 8);
    }

    public GenericPasswordCredentialsViewGroup(Context context, GLh gLh, MIN min) {
        this(context, gLh, null, min);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUser() {
        Bundle bundle = ((Fragment) ((GLh) this.control)).mArguments;
        if (bundle != null) {
            bundle.remove("orca:authparam:phone");
            bundle.remove("orca:authparam:name");
            bundle.remove("orca:authparam:photourl");
        }
        DKC.A1Q(this.emailText);
        this.emailText.setVisibility(0);
        this.userPhoto.setVisibility(8);
        this.userName.setVisibility(8);
        this.notYouLink.setVisibility(8);
        Button button = this.signupButton;
        if (button != null) {
            button.setVisibility(0);
        }
    }

    @Override // com.facebook.auth.login.ui.AuthFragmentLogoViewGroup
    public int getDefaultLayoutResource() {
        return 2132542915;
    }

    public boolean handleUserAuthError() {
        return false;
    }

    public void onAuthFailure(ServiceException serviceException) {
    }

    public void onAuthSuccess() {
    }

    public boolean onHandleCheckpointError(String str, String str2) {
        return false;
    }

    public void onUserAuthError(int i) {
    }

    public void onUserAuthErrorLimitHit() {
    }

    public void removeProgressIndicator() {
        if (this.mInitialized) {
            this.mPasswordCredentialsViewGroupHelper.A07 = null;
        }
    }

    public void setUser(String str, String str2, String str3, boolean z) {
        Preconditions.checkState(z);
        this.emailText.setText(str);
        this.emailText.setVisibility(8);
        this.userPhoto.A0G(str3 != null ? C0A2.A03(str3) : null, CALLER_CONTEXT);
        5YB r0 = this.userPhoto;
        int i = 8;
        if (str3 != null) {
            i = 0;
        }
        r0.setVisibility(i);
        this.userName.setText(str2);
        this.userName.setVisibility(0);
        this.notYouLink.setVisibility(0);
        Button button = this.signupButton;
        if (button != null) {
            button.setVisibility(8);
        }
    }
}
