package com.facebook.messaging.professionalservices.booking.calendar;

import X.07S;
import X.0Pz;
import X.0QO;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1VX;
import X.28M;
import X.2A4;
import X.2A8;
import X.2A9;
import X.2AE;
import X.2JX;
import X.4YU;
import X.4YV;
import X.5Dh;
import X.5iG;
import X.7zL;
import X.7zR;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.AbstractC00481b7;
import X.AbstractC00603o4;
import X.AbstractC05414dq;
import X.AnonymousClass001;
import X.AnonymousClass283;
import X.AnonymousClass286;
import X.C00i;
import X.C01643sd;
import X.C03z;
import X.C08f;
import X.C0et;
import X.C2083Db8;
import X.C30G;
import X.C3sa;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import X.DKS;
import X.DMV;
import X.Ee9;
import X.F7X;
import X.FvM;
import X.FvN;
import X.JQw;
import X.K2P;
import X.K2n;
import X.Kd2;
import X.KdD;
import X.L2d;
import X.L9Z;
import X.LG4;
import X.LcF;
import X.LcI;
import X.LcL;
import X.MKC;
import X.Q8a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.http.interfaces.RequestPriority;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: CalendarExportUpsellActivity.class */
public class CalendarExportUpsellActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public ViewerContext A01;
    public 2JX A02;
    public 2JX A03;
    public C00i A04;
    public Ee9 A05;
    public F7X A06;
    public 28M A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public int A0C;
    public C0et A0D;
    public DMV A0E;
    public boolean A0F;
    public final C00i A0G = AbH.A0D();
    public final C00i A0H = DKG.A0T();
    public final 2A4 A0I = new FvM(this);

    private View A12(int i) {
        View A0B = DKF.A0B(LayoutInflater.from(this), 2132541850);
        ((ImageView) A0B.findViewById(2131363630)).setImageResource(i);
        return A0B;
    }

    public static void A15(CalendarExportUpsellActivity calendarExportUpsellActivity) {
        A1G(calendarExportUpsellActivity, true);
        C30G A0H = AbF.A0H(78);
        A0H.A03(AbstractC00603o4.A00(426), calendarExportUpsellActivity.A08);
        FbUserSession fbUserSession = calendarExportUpsellActivity.A00;
        fbUserSession.getClass();
        AbstractC05414dq A07 = 1VX.A07(calendarExportUpsellActivity, fbUserSession);
        C3sa A0L = AbK.A0L(A0H);
        A0L.A0B = false;
        A0L.A03.A03 = RequestPriority.INTERACTIVE;
        4YU.A1J(A0L, 740420216588428L);
        DKF.A0h(calendarExportUpsellActivity.A0H).A04(C2083Db8.A00(calendarExportUpsellActivity, 9), A07.A03(A0L), "fetch_appointment_export_detail");
    }

    public static void A16(CalendarExportUpsellActivity calendarExportUpsellActivity) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        if (googleApiAvailability.A03(calendarExportUpsellActivity) != 0) {
            7zR.A1M(AbF.A0v(calendarExportUpsellActivity.A04), 2131962939);
            A1F(calendarExportUpsellActivity, 7);
            return;
        }
        String A0r = calendarExportUpsellActivity.A03.A0r(-2115151196);
        L2d l2d = new L2d(GoogleSignInOptions.A0C);
        Set set = l2d.A03;
        set.add(GoogleSignInOptions.A0E);
        set.add(new Scope(1, calendarExportUpsellActivity.A03.A0r(172753908)));
        set.addAll(Arrays.asList(new Scope[0]));
        l2d.A04 = true;
        AbstractC00481b7.A04(A0r);
        String str = l2d.A01;
        boolean z = true;
        if (str != null && !str.equals(A0r)) {
            z = false;
        }
        AbstractC00481b7.A08(z, "two different server client ids provided");
        l2d.A01 = A0r;
        l2d.A05 = true;
        GoogleSignInOptions A00 = l2d.A00();
        HashSet A0v = AnonymousClass001.A0v();
        HashSet A0v2 = AnonymousClass001.A0v();
        0QO r0 = new 0QO(0);
        0QO r02 = new 0QO(0);
        AnonymousClass283 anonymousClass283 = KdD.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Looper mainLooper = calendarExportUpsellActivity.getMainLooper();
        String packageName = calendarExportUpsellActivity.getPackageName();
        String A0Y = AnonymousClass001.A0Y(calendarExportUpsellActivity);
        FvN fvN = new FvN(calendarExportUpsellActivity);
        AnonymousClass286 anonymousClass286 = Kd2.A02;
        AbstractC00481b7.A03(anonymousClass286, JQw.A00(ActionId.VIEW_WILL_APPEAR_BEGIN));
        AbstractC00481b7.A03(A00, "Null options are not permitted for this Api");
        r02.put(anonymousClass286, A00);
        AnonymousClass283 anonymousClass2832 = anonymousClass286.A00;
        AbstractC00481b7.A03(anonymousClass2832, JQw.A00(ActionId.MESSENGER_QUEUE_CREATION));
        List A002 = anonymousClass2832.A00(A00);
        A0v2.addAll(A002);
        A0v.addAll(A002);
        AbstractC00481b7.A08(!r02.isEmpty(), "must call addApi() to add at least one API");
        2A8 r304 = 2A8.A00;
        Object obj = KdD.A04;
        if (r02.containsKey(obj)) {
            r304 = (2A8) r02.get(obj);
        }
        AnonymousClass286 anonymousClass2862 = null;
        2A9 r03 = new 2A9(r304, packageName, A0Y, r0, A0v);
        Map map = r03.A04;
        0QO r04 = new 0QO(0);
        0QO r05 = new 0QO(0);
        ArrayList A0s3 = AnonymousClass001.A0s();
        Iterator A1B = 1BK.A1B(r02);
        while (A1B.hasNext()) {
            AnonymousClass286 anonymousClass2863 = (AnonymousClass286) A1B.next();
            Object obj2 = r02.get(anonymousClass2863);
            boolean A1T = AnonymousClass001.A1T(map.get(anonymousClass2863));
            r04.put(anonymousClass2863, Boolean.valueOf(A1T));
            2A4 lcF = new LcF(anonymousClass2863, A1T);
            A0s3.add(lcF);
            AnonymousClass283 anonymousClass2833 = anonymousClass2863.A00;
            AbstractC00481b7.A02(anonymousClass2833);
            2AE A01 = anonymousClass2833.A01(calendarExportUpsellActivity, mainLooper, lcF, lcF, r03, obj2);
            r05.put(anonymousClass2863.A01, A01);
            if (A01.CZl()) {
                if (anonymousClass2862 != null) {
                    throw 0Pz.A07(anonymousClass2863.A02, " cannot be used with ", anonymousClass2862.A02);
                }
                anonymousClass2862 = anonymousClass2863;
            }
        }
        if (anonymousClass2862 != null) {
            String str2 = anonymousClass2862.A02;
            boolean equals = A0v.equals(A0v2);
            Object[] objArr = {str2};
            if (!equals) {
                throw AnonymousClass001.A0N(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
            }
        }
        boolean z2 = false;
        int i = 0;
        for (2AE r06 : r05.values()) {
            z2 |= r06.ChO();
            i |= r06.CZl() ? 1 : 0;
        }
        K2P k2p = new K2P(calendarExportUpsellActivity, mainLooper, googleApiAvailability, anonymousClass283, r03, A0s3, A0s, A0s2, r04, r05, new ReentrantLock(), 0, z2 ? AbJ.A00(i) : 3);
        Set set2 = 28M.A00;
        synchronized (set2) {
            set2.add(k2p);
        }
        MKC A003 = LifecycleCallback.A00(calendarExportUpsellActivity);
        String A004 = JQw.A00(125);
        K2n k2n = (K2n) A003.Ab0(K2n.class, A004);
        if (k2n == null) {
            k2n = new K2n(A003);
        }
        SparseArray sparseArray = k2n.A00;
        AbstractC00481b7.A09(DKD.A1U(sparseArray.indexOfKey(0)), 0Pz.A0T("Already managing a GoogleApiClient with id ", 0));
        Object obj3 = k2n.A01.get();
        boolean z3 = k2n.A03;
        String valueOf = String.valueOf(obj3);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("starting AutoManage for client ");
        A0k.append(0);
        A0k.append(" ");
        A0k.append(z3);
        Log.d(A004, 1BL.A0u(" ", valueOf, A0k));
        LcI lcI = new LcI(fvN, k2p, k2n);
        LG4 lg4 = k2p.A0B;
        lg4.A01(lcI);
        sparseArray.put(0, lcI);
        if (k2n.A03 && obj3 == null) {
            Log.d(A004, "connecting ".concat(k2p.toString()));
            k2p.A08();
        }
        calendarExportUpsellActivity.A07 = k2p;
        if (calendarExportUpsellActivity.A0F) {
            lg4.A00(calendarExportUpsellActivity.A0I);
            return;
        }
        C08f A005 = DKC.A0f(calendarExportUpsellActivity.A0G).A00();
        28M r07 = calendarExportUpsellActivity.A07;
        A005.A09(calendarExportUpsellActivity, L9Z.A00(r07.A02(), r07.A04(Kd2.A01).A00), 1);
    }

    public static void A1D(CalendarExportUpsellActivity calendarExportUpsellActivity) {
        7zR.A1M(AbF.A0v(calendarExportUpsellActivity.A04), 2131957317);
        A1F(calendarExportUpsellActivity, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A1F(com.facebook.messaging.professionalservices.booking.calendar.CalendarExportUpsellActivity r301, int r302) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.professionalservices.booking.calendar.CalendarExportUpsellActivity.A1F(com.facebook.messaging.professionalservices.booking.calendar.CalendarExportUpsellActivity, int):void");
    }

    public static void A1G(CalendarExportUpsellActivity calendarExportUpsellActivity, boolean z) {
        DMV dmv = calendarExportUpsellActivity.A0E;
        if (dmv != null) {
            dmv.dismiss();
        }
        if (z) {
            DMV dmv2 = calendarExportUpsellActivity.A0E;
            if (dmv2 == null) {
                View A0B = DKF.A0B(LayoutInflater.from(calendarExportUpsellActivity), 2132543007);
                DKS dks = new DKS(calendarExportUpsellActivity, 2132607211);
                dks.A09(A0B);
                dmv2 = dks.A0I();
                calendarExportUpsellActivity.A0E = dmv2;
            }
            dmv2.show();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x00f5, code lost:
    
        if (r0 != 4) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0110  */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.professionalservices.booking.calendar.CalendarExportUpsellActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A04 = AbI.A0J(this);
        this.A06 = (F7X) 1Bn.A0A(82342);
        this.A05 = (Ee9) 1Bn.A0A(99678);
        this.A01 = (ViewerContext) 1Bn.A0E(this, (1BY) null, 83431);
        this.A0D = AbJ.A0E();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        if (i != 1) {
            if (i != 2) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        LcL A01 = L9Z.A01(intent);
        int i4 = A01.A01.A00;
        if (i4 <= 0) {
            GoogleSignInAccount googleSignInAccount = A01.A00;
            if (googleSignInAccount != null) {
                String str = googleSignInAccount.A00;
                A1G(this, true);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                C03z c03z = GraphQlCallInput.A02;
                07S A0J = 4YU.A0J(c03z, this.A01.mUserId, "actor_id");
                07S.A00(A0J, this.A0A, "page_id");
                A0J.A0H(4YU.A0J(c03z, str, "sensitive_string_value"), "auth_code");
                4YV.A1A(A0J, A0M, "input");
                5iG A0h = DKF.A0h(this.A0H);
                FbUserSession fbUserSession = this.A00;
                fbUserSession.getClass();
                A0h.A04(C2083Db8.A00(this, 10), AbK.A0z(1VX.A07(this, fbUserSession), 5Dh.A00(A0M, new C01643sd(Q8a.class, "ServicesExternalCalendarProviderSaveTokensMutation", null, "input", "fbandroid", -46270688, 384, 2080758723L, 2080758723L, false, true)), 740420216588428L), "save_auth_token");
                return;
            }
        } else if (i4 == 12501) {
            i3 = 8;
            A1F(this, i3);
        }
        7zR.A1M(AbF.A0v(this.A04), 2131957317);
        i3 = 7;
        A1F(this, i3);
    }
}
