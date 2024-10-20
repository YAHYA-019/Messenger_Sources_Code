package com.facebook.base.fragment;

import X.0FI;
import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1iF;
import X.1pK;
import X.4YU;
import X.AbF;
import X.AbK;
import X.AbL;
import X.AnonymousClass001;
import X.C00i;
import X.DKD;
import X.DKE;
import X.Ee6;
import X.Evx;
import X.FEY;
import X.GHX;
import X.SAD;
import android.content.Intent;
import android.os.Handler;
import com.facebook.auth.login.ui.AuthFragmentBase;
import com.facebook.auth.login.ui.FirstPartySsoFragment;
import com.facebook.auth.login.ui.LoginApprovalFragment;
import com.facebook.auth.login.ui.LogoutFragment;
import com.facebook.auth.login.ui.OxygenTosAcceptanceFragment;
import com.facebook.auth.login.ui.PasswordCredentialsFragment;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxCaaLoginSaveCredentialsFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxContactImportFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxDeactivationsFragment;
import com.facebook.messaging.neue.nux.phoneconfirmation.ConfirmPhoneFragment;
import com.facebook.messaging.zombification.PhoneReconfirmationConfirmNumberFragment;
import com.facebook.messaging.zombification.PhoneReconfirmationForkFragment;
import com.facebook.messaging.zombification.PhoneReconfirmationLoginFragment;
import com.facebook.messaging.zombification.PhoneReconfirmationReactivatingAccountFragment;
import com.facebook.messaging.zombification.PhoneReconfirmationRequestCodeFragment;

/* loaded from: AbstractNavigableFragment.class */
public class AbstractNavigableFragment extends 1pK implements NavigableFragment {
    public Intent A00;
    public GHX A01;
    public Intent A03;
    public final C00i A04 = 1BQ.A01();
    public boolean A02 = false;

    private void A0E(Intent intent) {
        this.A03 = null;
        if (this.A02) {
            String A0W = 0Pz.A0W(AnonymousClass001.A0Y(this), ": Fragment already finished");
            Intent intent2 = this.A00;
            if (intent2 != null) {
                A0W = AnonymousClass001.A0Z(intent2, " with saved intent: ", AnonymousClass001.A0n(A0W));
            }
            0fH.A0B(AbstractNavigableFragment.class, A0W);
            1BK.A09(this.A04).D0v("FRAGMENT_NAVIGATION", A0W);
            return;
        }
        GHX ghx = this.A01;
        if (ghx == null) {
            String A0W2 = 0Pz.A0W(AnonymousClass001.A0Y(this), ": No navigation listener set; saving intent.");
            0fH.A0H(AbstractNavigableFragment.class, A0W2, new Throwable());
            1BK.A09(this.A04).D0v("FRAGMENT_NAVIGATION", A0W2);
            this.A00 = intent;
        } else {
            ghx.Byj(intent, this);
        }
        this.A02 = true;
    }

    public 1iF A1R() {
        if (this instanceof NuxFragment) {
            NuxFragment nuxFragment = (NuxFragment) this;
            if (!(nuxFragment instanceof NeueNuxContactImportFragment) && !(nuxFragment instanceof NeueNuxDeactivationsFragment)) {
                return AbK.A0F();
            }
            return AbL.A0A();
        }
        if (!(this instanceof PhoneReconfirmationRequestCodeFragment) && !(this instanceof PhoneReconfirmationReactivatingAccountFragment) && !(this instanceof PhoneReconfirmationLoginFragment) && !(this instanceof PhoneReconfirmationForkFragment) && !(this instanceof PhoneReconfirmationConfirmNumberFragment)) {
            if (!(this instanceof PasswordCredentialsFragment) && !(this instanceof OxygenTosAcceptanceFragment) && !(this instanceof LogoutFragment) && !(this instanceof LoginApprovalFragment) && !(this instanceof FirstPartySsoFragment)) {
                return AbF.A0C(881081412356415L);
            }
            return DKE.A0P();
        }
        return AbK.A0F();
    }

    public void A1X() {
        if (this instanceof NeueNuxContactImportFragment) {
            NeueNuxContactImportFragment neueNuxContactImportFragment = (NeueNuxContactImportFragment) this;
            if (neueNuxContactImportFragment.A0A) {
                neueNuxContactImportFragment.A09 = false;
                neueNuxContactImportFragment.A0A = false;
                neueNuxContactImportFragment.A1e(null, null);
                C00i c00i = neueNuxContactImportFragment.A0F;
                if (((Ee6) c00i.get()).A00) {
                    ((Ee6) c00i.get()).A00 = false;
                    ((Evx) neueNuxContactImportFragment.A0G.get()).A01(false, false);
                    return;
                }
                return;
            }
            return;
        }
        if (this instanceof NeueNuxCaaLoginSaveCredentialsFragment) {
            ((NuxFragment) this).A1e(null, null);
            return;
        }
        if (this instanceof PhoneReconfirmationReactivatingAccountFragment) {
            PhoneReconfirmationReactivatingAccountFragment.A06((PhoneReconfirmationReactivatingAccountFragment) this);
            return;
        }
        if (this instanceof ConfirmPhoneFragment) {
            ConfirmPhoneFragment confirmPhoneFragment = (ConfirmPhoneFragment) this;
            ConfirmPhoneFragment.A03(confirmPhoneFragment);
            FEY fey = confirmPhoneFragment.A0Q;
            String str = fey.A01;
            fey.A01 = null;
            if (str != null) {
                ConfirmPhoneFragment.A06(confirmPhoneFragment, str);
                return;
            } else {
                fey.A00 = confirmPhoneFragment.A0P;
                return;
            }
        }
        if (this instanceof PasswordCredentialsFragment) {
            PasswordCredentialsFragment passwordCredentialsFragment = (PasswordCredentialsFragment) this;
            if (passwordCredentialsFragment.A0B.Aue() != ViewerContext.A01) {
                passwordCredentialsFragment.A02.A00();
                passwordCredentialsFragment.A1Y(4YU.A0A("com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"));
                return;
            }
            return;
        }
        if (this instanceof FirstPartySsoFragment) {
            FirstPartySsoFragment firstPartySsoFragment = (FirstPartySsoFragment) this;
            DKD.A1E(firstPartySsoFragment.A00.A01, "com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI");
            FirstPartySsoFragment.A06(firstPartySsoFragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1Y(Intent intent) {
        if (isResumed()) {
            A0E(intent);
        } else {
            this.A03 = intent;
        }
    }

    public boolean A1Z() {
        if (!(this instanceof AuthFragmentBase)) {
            return this.A01.CFu(this);
        }
        AuthFragmentBase authFragmentBase = (AuthFragmentBase) this;
        if (!((AbstractNavigableFragment) authFragmentBase).A01.CFu(authFragmentBase)) {
            authFragmentBase.A1b();
        }
        return true;
    }

    @Override // com.facebook.base.fragment.NavigableFragment
    public void Crb(GHX ghx) {
        Intent intent;
        this.A01 = ghx;
        if (ghx == null || (intent = this.A00) == null) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(AnonymousClass001.A0Y(this));
        String A0Z = AnonymousClass001.A0Z(intent, ": Saved intent found: ", A0k);
        0fH.A0H(AbstractNavigableFragment.class, A0Z, new Throwable());
        1BK.A09(this.A04).D0v("FRAGMENT_NAVIGATION", A0Z);
        new Handler().post(new SAD(this, ghx));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(1738238018);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A02 = false;
        0FI.A08(-1407653586, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        int A02 = 0FI.A02(-435070811);
        super/*androidx.fragment.app.Fragment*/.onResume();
        Intent intent = this.A03;
        if (intent != null) {
            A0E(intent);
            this.A03 = null;
        }
        if (!this.A02) {
            A1X();
        }
        0FI.A08(1636888093, A02);
    }
}
