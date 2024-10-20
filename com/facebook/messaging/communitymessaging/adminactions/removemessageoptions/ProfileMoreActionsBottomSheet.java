package com.facebook.messaging.communitymessaging.adminactions.removemessageoptions;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1F9;
import X.1Fv;
import X.1Iw;
import X.1LI;
import X.7zQ;
import X.7zV;
import X.AbG;
import X.AnonymousClass001;
import X.BaY;
import X.BdI;
import X.Bs5;
import X.C1Y6;
import X.C3R9;
import X.CoU;
import X.DJY;
import X.QGF;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.adminactions.logging.AdminActionsLoggingExtras;
import com.facebook.messaging.communitymessaging.model.MemberActionsState;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ProfileMoreActionsBottomSheet.class */
public final class ProfileMoreActionsBottomSheet extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public MemberActionsState A01;
    public ThreadSummary A02;
    public MigColorScheme A03;
    public User A04;
    public final DJY A05 = new CoU(this, 1);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        this.A03 = 7zV.A0S(this);
        Context context = getContext();
        ThreadSummary threadSummary = this.A02;
        if (threadSummary == null) {
            str = "threadSummary";
        } else {
            1F9 r0 = 1F9.A0B;
            ParcelableSecondaryData A0w = AbG.A0w(new AdminActionsLoggingExtras(null, "other_actions_bottom_sheet", "thread_view", 1BK.A1D("entrypoint", "remove_message_flow")), new C3R9());
            MemberActionsState memberActionsState = this.A01;
            if (memberActionsState == null) {
                str = "memberActionsState";
            } else {
                Bs5 bs5 = new Bs5(memberActionsState, r0, threadSummary, A0w);
                MigColorScheme migColorScheme = this.A03;
                str = "colorScheme";
                if (migColorScheme != null) {
                    DJY djy = this.A05;
                    User user = this.A04;
                    if (user != null) {
                        06Z r02 = this.mFragmentManager;
                        if (r02 == null) {
                            throw 1BK.A0e();
                        }
                        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                        FbUserSession fbUserSession = this.A00;
                        if (fbUserSession == null) {
                            str = "fbUserSession";
                        } else {
                            BdI bdI = new BdI((BaY) C1Y6.A00(context, "com_facebook_messaging_communitymessaging_plugins_interfaces_memberactions_CommunityActionsMenuItemInterfaceSpec", "ProfileMoreActions", new Object[]{bs5, migColorScheme, r302, djy, user, r02, viewLifecycleOwner, null, fbUserSession}));
                            11T.A0D(bdI);
                            User user2 = this.A04;
                            if (user2 != null) {
                                MigColorScheme migColorScheme2 = this.A03;
                                if (migColorScheme2 != null) {
                                    return new QGF(bdI, migColorScheme2, user2);
                                }
                            }
                        }
                    }
                    11T.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    throw 0Q8.createAndThrow();
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(748961228);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        1Fv A0N2 = 7zQ.A0N();
        Parcelable parcelable = requireArguments.getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (parcelable != null) {
            this.A04 = (User) parcelable;
            Parcelable parcelable2 = requireArguments.getParcelable("thread_summary");
            if (parcelable2 != null) {
                this.A02 = (ThreadSummary) parcelable2;
                Parcelable parcelable3 = requireArguments.getParcelable("member_action_state");
                if (parcelable3 != null) {
                    this.A01 = (MemberActionsState) parcelable3;
                    this.A00 = A0N2.A06(this);
                    0FI.A08(-1223198916, A02);
                    return;
                }
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1398495097;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 314822637;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 1522485321;
        }
        0FI.A08(i, A02);
        throw A0N;
    }
}
