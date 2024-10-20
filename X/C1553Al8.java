package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.Al8, reason: case insensitive filesystem */
/* loaded from: Al8.class */
public final class C1553Al8 extends 1pK {
    public static final String __redex_internal_original_name = "CommunityInviteLinkFragment";
    public FbUserSession A00;
    public 1pI A01;
    public LithoView A02;
    public C1296Ad8 A03;
    public ThreadKey A04;
    public final 1Br A09 = 7zM.A0O();
    public final 1Br A05 = 7zN.A0I(this);
    public final 1Br A06 = 1BK.A0C();
    public final 1Br A08 = 1Bq.A00(68133);
    public final 1Br A07 = 7zM.A0S();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void A03(C1553Al8 c1553Al8, String str) {
        String str2;
        switch (str.hashCode()) {
            case -989830105:
                if (str.equals("reset_link_button")) {
                    str2 = "render_community_reset_invite_link_confirmation";
                    break;
                }
                str2 = null;
                break;
            case -410501449:
                if (str.equals("share_link_button")) {
                    str2 = "render_invite_link_share_sheet";
                    break;
                }
                str2 = null;
                break;
            case 1505434244:
                if (str.equals("copy_link")) {
                    str2 = "thread_user_copy_invite_link";
                    break;
                }
                str2 = null;
                break;
            case 1875355944:
                if (str.equals("invite_button")) {
                    str2 = "render_community_invite_sheet";
                    break;
                }
                str2 = null;
                break;
            default:
                str2 = null;
                break;
        }
        C1296Ad8 c1296Ad8 = c1553Al8.A03;
        if (c1296Ad8 == null) {
            11T.A0L("cmLogger");
            throw 0Q8.createAndThrow();
        }
        c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, null, null, null, null, str, "invite_link_settings", str2, "channel_list_menu", null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (((X.C4Mu) X.1Br.A0B(r301.A08)).A03(X.1BK.A0n(r303)) == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A06(X.C1553Al8 r301, java.lang.String r302, java.lang.String r303, boolean r304) {
        /*
            r0 = 33174(0x8196, float:4.6487E-41)
            r305 = r0
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L16
            X.7zL.A1C()
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L16:
            r0 = r301
            r1 = r306
            r2 = r305
            X.1Br r0 = X.AbM.A0O(r0, r1, r2)
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L68
            r0 = r306
            X.22F r0 = X.AbJ.A0P(r0)
            r307 = r0
            r0 = 9
            r308 = r0
            r0 = r302
            long r0 = java.lang.Long.parseLong(r0)
            r309 = r0
            r0 = r307
            r1 = r308
            r2 = r309
            boolean r0 = r0.A00(r1, r2)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L68
            r0 = r301
            X.1Br r0 = r0.A08
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.4Mu r0 = (X.C4Mu) r0
            r312 = r0
            r0 = r303
            java.lang.Long r0 = X.1BK.A0n(r0)
            r306 = r0
            r0 = r312
            r1 = r306
            boolean r0 = r0.A03(r1)
            r305 = r0
            r0 = 1
            r311 = r0
            r0 = r305
            if (r0 != 0) goto L6e
        L68:
            r0 = 0
            r311 = r0
            r0 = 0
            r306 = r0
        L6e:
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1553Al8.A06(X.Al8, java.lang.String, java.lang.String, boolean):boolean");
    }

    public 1iF A1R() {
        return AbF.A0C(681066249448173L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1573908389);
        this.A00 = 1BM.A01(this);
        Parcelable parcelable = requireArguments().getParcelable("THREAD_KEY");
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(107723363, A02);
            throw A0h;
        }
        this.A04 = (ThreadKey) parcelable;
        this.A02 = 7zR.A0M(this);
        this.A03 = 7zR.A0W();
        LithoView lithoView = this.A02;
        if (lithoView == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        0FI.A08(-1483433597, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = 1vD.A00(view);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            C1284Aco c1284Aco = (C1284Aco) 7zN.A0m(this, fbUserSession, 82370);
            ThreadKey threadKey = this.A04;
            if (threadKey != null) {
                CaE.A03(getViewLifecycleOwner(), c1284Aco.A01(threadKey), this, 44);
                return;
            }
            str = "threadKey";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
