package com.facebook.auth.login.ui;

import X.0FI;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Ew;
import X.1MM;
import X.1lN;
import X.4YU;
import X.4YV;
import X.67R;
import X.6HM;
import X.7zO;
import X.AbF;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C00i;
import X.C0et;
import X.C0lK;
import X.C4DT;
import X.CfG;
import X.DKD;
import X.DKG;
import X.DeE;
import X.EwB;
import X.F4q;
import X.GHV;
import X.GLf;
import X.JgM;
import X.MIN;
import X.RKb;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.fblibraries.fblogin.SsoSource;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: FirstPartySsoFragment.class */
public final class FirstPartySsoFragment extends AuthFragmentBase implements 1lN, GLf {
    public EwB A00;
    public GHV A01;
    public FirstPartySsoSessionInfo A02;
    public 6HM A03;
    public C0et A04;
    public JgM A05;
    public final 1Ew A06 = AbI.A09();
    public final C00i A09 = 1BQ.A02(85258);
    public final C00i A07 = AbF.A0S(this, 49964);
    public final C00i A08 = 1BQ.A02(16592);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent A03(com.facebook.auth.login.ui.FirstPartySsoFragment r301, boolean r302) {
        /*
            java.lang.String r0 = "sso_bypassed_class"
            r303 = r0
            r0 = r301
            com.facebook.auth.login.ui.AuthFragmentConfig r0 = r0.AnN()
            r304 = r0
            r0 = r304
            android.os.Bundle r0 = r0.A00
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.containsKey(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L2b
            r0 = r305
            r1 = r303
            java.lang.String r0 = r0.getString(r1)
            r304 = r0
            r0 = r304
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2a
            r304 = r0
            goto L30
        L2a:
        L2b:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L30:
            r0 = r304
            if (r0 != 0) goto L37
            java.lang.Class<com.facebook.auth.login.ui.PasswordCredentialsFragment> r0 = com.facebook.auth.login.ui.PasswordCredentialsFragment.class
            r304 = r0
        L37:
            X.F8h r0 = new X.F8h
            r303 = r0
            r0 = r303
            r1 = r304
            r0.<init>(r1)
            r0 = 99948(0x1866c, float:1.40057E-40)
            r306 = r0
            r0 = r306
            X.1BV r0 = X.1BV.A00(r0)
            r305 = r0
            r0 = r301
            X.GHV r0 = r0.A01
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
            r0 = r304
            r1 = r303
            r0.setCustomAnimations(r1)
        L5b:
            r0 = r301
            r1 = r305
            boolean r0 = A09(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L6c
            r0 = r303
            r0.A01()
        L6c:
            r0 = r303
            android.content.Intent r0 = r0.A00
            r307 = r0
            android.os.Bundle r0 = X.1BK.A05()
            r303 = r0
            r0 = 1
            r308 = r0
            r0 = r303
            java.lang.String r1 = "from_sso_screen"
            r2 = r308
            r0.putBoolean(r1, r2)
            r0 = r303
            java.lang.String r1 = "with_sso_available"
            r2 = r302
            r0.putBoolean(r1, r2)
            r0 = r301
            com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo r0 = r0.A02
            r304 = r0
            r0 = r304
            if (r0 == 0) goto La1
            r0 = r304
            java.lang.String r0 = r0.A08
            r305 = r0
            java.lang.String r0 = "fb_user_id"
            r304 = r0
            r0 = r303
            r1 = r304
            r2 = r305
            r0.putString(r1, r2)
        La1:
            r0 = r307
            r1 = r303
            android.content.Intent r0 = r0.putExtras(r1)
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.auth.login.ui.FirstPartySsoFragment.A03(com.facebook.auth.login.ui.FirstPartySsoFragment, boolean):android.content.Intent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(FirstPartySsoFragment firstPartySsoFragment) {
        FirstPartySsoSessionInfo firstPartySsoSessionInfo;
        GHV ghv;
        if (firstPartySsoFragment.A08()) {
            return;
        }
        FirstPartySsoSessionInfo firstPartySsoSessionInfo2 = firstPartySsoFragment.A02;
        if (firstPartySsoSessionInfo2 != null && (ghv = firstPartySsoFragment.A01) != null) {
            ghv.setSsoSessionInfo(firstPartySsoSessionInfo2);
        }
        boolean exists = C0lK.A00(firstPartySsoFragment.getContext(), true).exists();
        if (firstPartySsoFragment.A04 == C0et.A0P && exists && (firstPartySsoSessionInfo = firstPartySsoFragment.A02) != null) {
            SsoSource ssoSource = firstPartySsoSessionInfo.A04;
            if (ssoSource.A01 == 1 && ssoSource.A03.equals("com.facebook.messenger")) {
                A07(firstPartySsoFragment, new CfG(firstPartySsoFragment.getContext(), 2131958828));
            }
        }
    }

    public static void A07(FirstPartySsoFragment firstPartySsoFragment, MIN min) {
        if (firstPartySsoFragment.A05.A1S()) {
            return;
        }
        firstPartySsoFragment.A06.D2n();
        Bundle A05 = 1BK.A05();
        A05.putString("accessToken", firstPartySsoFragment.A02.A05);
        firstPartySsoFragment.A05.A1Q(min);
        firstPartySsoFragment.A05.A1R("auth_sso", A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A08() {
        Intent A03;
        FirstPartySsoSessionInfo A02;
        if (!((AbstractNavigableFragment) this).A02) {
            if (this.A06.Aue() != ViewerContext.A01) {
                this.A00.A00();
                A03 = 4YU.A0A("com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE");
            } else {
                this.A08.get();
                if (!1MM.A01 && A09(this, 1BV.A00(99948))) {
                    C0et c0et = this.A04;
                    if (c0et == C0et.A0P || c0et == C0et.A0g) {
                        A02 = ((67R) this.A07.get()).A02();
                    } else {
                        A02 = F4q.A00(getContext(), (F4q) this.A09.get());
                    }
                    this.A02 = A02;
                    if (A02 != null) {
                        return false;
                    }
                }
                A03 = A03(this, false);
            }
            A1Y(A03);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A09(FirstPartySsoFragment firstPartySsoFragment, C00i c00i) {
        if (!4YV.A1Y(c00i)) {
            return false;
        }
        C0et c0et = firstPartySsoFragment.A04;
        if (c0et == C0et.A0P || c0et == C0et.A0g) {
            return ((67R) firstPartySsoFragment.A07.get()).A02() != null;
        }
        F4q f4q = (F4q) firstPartySsoFragment.A09.get();
        Context context = firstPartySsoFragment.getContext();
        Iterator it = f4q.A01.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            ArrayList A02 = C4DT.A02(f4q.A00, context, new SsoSource(0, A0i));
            if (!A02.isEmpty() && A02.get(0) != null) {
                return true;
            }
            0fH.A17("SSO", "User is not logged into %s, or there was an error retrieving the session.", new Object[]{A0i});
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.auth.login.ui.AuthFragmentBase
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A04 = AbJ.A0E();
        this.A00 = DKD.A0G();
        this.A03 = (6HM) 7zO.A0m(this, 50020);
        JgM A0L = DKG.A0L(this, "authenticateOperation");
        this.A05 = A0L;
        A0L.A02 = new DeE(1BV.A00(99948), this, 0);
        0fH.A0n("FirstPartySsoFragment", "onFragmentCreate");
        if (((AuthFragmentBase) this).A00 == null) {
            RKb rKb = ((AuthNavigationController) requireParentFragment()).A00;
            ((AuthFragmentBase) this).A00 = rKb;
            if (rKb == null) {
                return;
            }
        }
        if (((AbstractNavigableFragment) this).A01 != null) {
            A08();
        }
    }

    public String AWg() {
        return "login_sso";
    }

    public Long Am7() {
        return 338399944209237L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1111391244);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        A06(this);
        0FI.A08(1635220861, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View A1a;
        int i;
        int A02 = 0FI.A02(14290412);
        if (((AbstractNavigableFragment) this).A02) {
            A1a = null;
            i = -294573846;
        } else {
            A1a = A1a(GLf.class);
            this.A01 = (GHV) A1a;
            i = -980408966;
        }
        0FI.A08(i, A02);
        return A1a;
    }
}
