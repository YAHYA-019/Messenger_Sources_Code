package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.account.twofac.protocol.CheckApprovedMachineMethod$ApprovalStatus;
import com.facebook.account.twofac.protocol.CheckApprovedMachineMethod$Result;
import com.facebook.auth.component.AccountSwitchingAuthenticationResult;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.login.ui.LoginApprovalFragment;
import com.facebook.auth.login.ui.LoginErrorData;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.accountswitch.AddAccountDialogFragment;
import com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment;
import com.facebook.messaging.accountswitch.OneClickAddAccountDialogFragment;
import com.facebook.messaging.accountswitch.SsoDialogFragment;
import com.facebook.messaging.integrity.frx.model.AdditionalAction;
import com.facebook.messaging.integrity.frx.model.AdditionalActionsPage;
import com.facebook.messaging.integrity.frx.model.FRXPage;
import com.facebook.messaging.integrity.frx.model.ProactiveWarningAdditionalActionsPageConfig;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: X.Ap6, reason: case insensitive filesystem */
/* loaded from: Ap6.class */
public final class C1664Ap6 extends ETZ {
    public final int A00;
    public final Object A01;

    public C1664Ap6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.auth.login.ui.LoginApprovalFragment, androidx.fragment.app.Fragment] */
    public void A01(OperationResult operationResult) {
        String string;
        String string2;
        AdditionalActionsPage additionalActionsPage;
        ThreadKey threadKey;
        switch (this.A00) {
            case 0:
                ?? r0 = (LoginApprovalFragment) this.A01;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) ((CheckApprovedMachineMethod$Result) operationResult.A07()).A00);
                if (copyOf.size() < 1 || !((CheckApprovedMachineMethod$ApprovalStatus) 1BK.A0r(copyOf)).A00.booleanValue()) {
                    return;
                }
                LoginErrorData loginErrorData = r0.A04;
                String valueOf = String.valueOf(loginErrorData.A00);
                String str = loginErrorData.A02;
                EPM epm = EPM.A0P;
                Bundle A05 = 1BK.A05();
                A05.putParcelable("passwordCredentials", new PasswordCredentials(epm, valueOf, str));
                CfG cfG = new CfG(r0.getContext(), 2131958828);
                JgM jgM = r0.A05;
                if (jgM.A1S()) {
                    return;
                }
                jgM.A1Q(cfG);
                r0.A05.A1R("auth_password", A05);
                return;
            case 1:
                COx cOx = (COx) this.A01;
                if (cOx.A02) {
                    COx.A00(operationResult, cOx);
                    return;
                } else {
                    cOx.A00 = operationResult;
                    cOx.A04 = true;
                    return;
                }
            case 2:
                AlN alN = (AlN) this.A01;
                if (alN.isAdded()) {
                    0fH.A0g("edit_password_success", "AccountPasswordFunnelLogger", "log action: %s");
                    C02 c02 = alN.A06;
                    Context context = alN.getContext();
                    boolean z = alN.A05.A04;
                    DialogInterface.OnDismissListener onDismissListener = alN.A0B;
                    String string3 = context.getString(2131952789);
                    if (z) {
                        string = context.getString(2131955730);
                        string2 = context.getString(2131955729);
                    } else {
                        string = context.getString(2131955722);
                        string2 = 1BK.A0v(context, string3, 2131955721);
                    }
                    C2121Dea c2121Dea = new C2121Dea(context);
                    c2121Dea.A0B(string);
                    c2121Dea.A0A(string2);
                    c2121Dea.A08(CSG.A00(c02, 10));
                    if (onDismissListener != null) {
                        ((DKS) c2121Dea).A01.A06 = onDismissListener;
                    }
                    AbM.A1I(c2121Dea);
                    return;
                }
                return;
            case 3:
                BaseLoadingActionDialogFragment baseLoadingActionDialogFragment = (BaseLoadingActionDialogFragment) this.A01;
                if (baseLoadingActionDialogFragment.A08 != null) {
                    if (baseLoadingActionDialogFragment instanceof SsoDialogFragment) {
                        SsoDialogFragment ssoDialogFragment = (SsoDialogFragment) baseLoadingActionDialogFragment;
                        boolean z2 = ssoDialogFragment.A03;
                        CQH A0g = AbH.A0g(ssoDialogFragment);
                        if (z2) {
                            A0g.A09(BMG.A0P);
                        } else {
                            A0g.A0H(BMG.A3L, ssoDialogFragment.A01);
                        }
                    } else if (baseLoadingActionDialogFragment instanceof OneClickAddAccountDialogFragment) {
                        OneClickAddAccountDialogFragment oneClickAddAccountDialogFragment = (OneClickAddAccountDialogFragment) baseLoadingActionDialogFragment;
                        if (oneClickAddAccountDialogFragment.A00 != null) {
                            AbH.A0g(oneClickAddAccountDialogFragment).A0L(BMG.A3d, oneClickAddAccountDialogFragment.A01, oneClickAddAccountDialogFragment.A00.A03);
                        }
                    } else if (baseLoadingActionDialogFragment instanceof AddAccountDialogFragment) {
                        AddAccountDialogFragment addAccountDialogFragment = (AddAccountDialogFragment) baseLoadingActionDialogFragment;
                        if (addAccountDialogFragment.A0A) {
                            AbK.A1O(1BL.A0V(addAccountDialogFragment.A0D), AddAccountDialogFragment.A0I);
                        }
                        if (addAccountDialogFragment.A06 != null) {
                            ((C01) 1Bi.A03(85263)).A00(AbM.A0u(addAccountDialogFragment.A03), AbM.A0u(addAccountDialogFragment.A02));
                            addAccountDialogFragment.A06.A01();
                        }
                    }
                    baseLoadingActionDialogFragment.A09.A02("_op_success", baseLoadingActionDialogFragment.AWg(), (String) null);
                    AccountSwitchingAuthenticationResult accountSwitchingAuthenticationResult = (AccountSwitchingAuthenticationResult) operationResult.A07();
                    Intent A0A = 4YU.A0A("com.facebook.messaging.accountswitch.SWITH_OPERATION_COMPLETE");
                    Bundle A052 = 1BK.A05();
                    A052.putParcelable("account_switch_result", accountSwitchingAuthenticationResult);
                    A052.putString("operation_type", baseLoadingActionDialogFragment.A0B);
                    A0A.putExtras(A052);
                    baseLoadingActionDialogFragment.A08.A06(A0A);
                    return;
                }
                return;
            default:
                FeedbackReportFragment feedbackReportFragment = (FeedbackReportFragment) this.A01;
                FRXPage A053 = FeedbackReportFragment.A05(feedbackReportFragment);
                if (A053 == null || (additionalActionsPage = A053.A00) == null || (threadKey = feedbackReportFragment.A0M) == null) {
                    return;
                }
                boolean A0w = threadKey.A0w();
                CQD cqd = feedbackReportFragment.A0E;
                cqd.getClass();
                ImmutableList of = ImmutableList.of((Object) BLo.A0C, (Object) BLo.A03, (Object) BLo.A0G);
                BLo[] bLoArr = {A0w ? BLo.A0A : BLo.A0B};
                ImmutableList.Builder A0h = 4YU.A0h();
                1Du it = additionalActionsPage.A01.iterator();
                while (it.hasNext()) {
                    AdditionalAction additionalAction = (AdditionalAction) it.next();
                    if (!of.contains(additionalAction.A01())) {
                        A0h.m11011add((Object) additionalAction);
                    }
                }
                new HashSet();
                String str2 = additionalActionsPage.A05;
                String str3 = additionalActionsPage.A06;
                ImmutableList immutableList = additionalActionsPage.A02;
                String str4 = additionalActionsPage.A07;
                ImmutableList immutableList2 = additionalActionsPage.A03;
                Integer num = additionalActionsPage.A04;
                ProactiveWarningAdditionalActionsPageConfig proactiveWarningAdditionalActionsPageConfig = additionalActionsPage.A00;
                boolean z3 = additionalActionsPage.A0C;
                boolean z4 = additionalActionsPage.A0D;
                String str5 = additionalActionsPage.A08;
                String str6 = additionalActionsPage.A09;
                String str7 = additionalActionsPage.A0A;
                HashSet A1E = AbF.A1E(additionalActionsPage.A0B);
                ImmutableList build = A0h.build();
                C1pq.A08("additionalActions", build);
                FeedbackReportFragment.A0C(cqd.A07(new AdditionalActionsPage(proactiveWarningAdditionalActionsPageConfig, build, immutableList, immutableList2, num, str2, str3, str4, str5, str6, str7, A1E, z3, z4), bLoArr), feedbackReportFragment);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x073f, code lost:
    
        if (r307 == null) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05f3  */
    /* JADX WARN: Type inference failed for: r0v212, types: [com.facebook.messaging.accountswitch.AddAccountDialogFragment, androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v508, types: [com.facebook.messaging.accountswitch.SwitchSavedAccountDialogFragment, androidx.fragment.app.Fragment, com.facebook.messaging.accountswitch.BaseLoadingActionDialogFragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(com.facebook.fbservice.service.ServiceException r302) {
        /*
            Method dump skipped, instructions count: 2646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1664Ap6.A02(com.facebook.fbservice.service.ServiceException):void");
    }
}
