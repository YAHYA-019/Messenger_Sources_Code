package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.resources.compat.RedexResourcesCompat;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5vl, reason: invalid class name */
/* loaded from: 5vl.class */
public final class C5vl {
    public static final 1G9 A04;
    public static final 1G9 A05;
    public static final 1G9 A06;
    public static final 1G9 A07;
    public static final 1G9 A08;
    public Boolean A00;
    public final 1Br A02 = 1Bq.A00(99390);
    public final 1Br A03 = 1Bq.A00(16385);
    public final 1Br A01 = 1Bq.A00(66646);

    static {
        1G9 A0F = 1G0.A0B.A0F("biim_tas/");
        A08 = A0F;
        A07 = A0F.A0F("biim_tas_nux/");
        A05 = A0F.A0F("biim_tas_qp_last_shown_timestamp/");
        A06 = A0F.A0F("biim_tas_qp_show_count/");
        A04 = A0F.A0F("biim_tas_qp_dismiss_count/");
    }

    public final void A00(Context context, 06Z r303, ThreadKey threadKey, String str) {
        String str2;
        if (r303 == null) {
            throw AnonymousClass001.A0N("fragmentManager should not be null");
        }
        DKT dkt = (DKT) 1Bn.A0A(98520);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1G9 r0 = A07;
        boolean AZn = fbSharedPreferences.AZn(r0, false);
        String valueOf = String.valueOf(Long.valueOf(threadKey.A05));
        if (valueOf == null) {
            throw AnonymousClass001.A0N("viewerUserId should not be null");
        }
        String valueOf2 = String.valueOf(Long.valueOf(threadKey.A02));
        if (valueOf2 == null) {
            throw AnonymousClass001.A0N("otherUserId should not be null");
        }
        String valueOf3 = String.valueOf(4YU.A0l(threadKey));
        if (valueOf3 == null) {
            throw AnonymousClass001.A0N("threadFbId should not be null");
        }
        if (AZn) {
            str2 = AbstractC00603o4.A00(437);
        } else {
            1Ql.A01(fbSharedPreferences.edit(), r0, true);
            str2 = "com.bloks.www.bmc.tas.nux.bottomsheet";
        }
        CP0 cp0 = new CP0(str2);
        cp0.A05("page_id", valueOf);
        cp0.A05("consumer_id", valueOf2);
        cp0.A05("thread_id", valueOf3);
        int identifier = RedexResourcesCompat.getIdentifier(context.getResources(), 1BJ.A00(33), "dimen", "android");
        int identifier2 = RedexResourcesCompat.getIdentifier(context.getResources(), "config_showNavigationBar", "bool", "android");
        cp0.A05("safe_area_bottom", (identifier <= 0 || identifier2 <= 0 || !context.getResources().getBoolean(identifier2)) ? "10" : String.valueOf(context.getResources().getDimension(identifier) / context.getResources().getDisplayMetrics().density));
        cp0.A05(AbstractC00603o4.A00(611), str);
        DKT.A04(context, r303, dkt, cp0.A03(), 90);
    }

    public final boolean A01(FbUserSession fbUserSession, ThreadKey threadKey) {
        boolean z = false;
        11T.A0F(fbUserSession, 0);
        11T.A0F(threadKey, 2);
        if (threadKey.A1K()) {
            this.A01.A00.get();
            if (!11T.A0O(String.valueOf(threadKey.A0r()), "272444046603812")) {
                if (!threadKey.A0y() && ((2yD) this.A03.A00.get()).AZr(1GD.A07, 36323474725161563L)) {
                    1xP r0 = (1xP) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 33149);
                    Boolean bool = r0.A00;
                    if (bool == null) {
                        r0.A00();
                        bool = false;
                    }
                    this.A00 = bool;
                }
                Boolean bool2 = this.A00;
                if ((bool2 == null || bool2.booleanValue()) && ((2yD) this.A03.A00.get()).AZk(36319205528319666L)) {
                    User A00 = ((23F) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 33102)).A00(new UserKey(1Js.A03, String.valueOf(threadKey.A02)));
                    if (A00 != null) {
                        z = !A00.A0E();
                    }
                }
                MessengerAccountInfo AVA = ((InterfaceC09434q3) 1Bi.A03(66417)).AVA(String.valueOf(threadKey.A05));
                if (AVA != null && AVA.A0D) {
                    return true;
                }
            }
        }
        return z;
    }

    public final boolean A02(FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(fbUserSession, 0);
        if (!A01(fbUserSession, threadKey)) {
            return false;
        }
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        if (TimeUnit.MILLISECONDS.toDays(((C0dp) this.A02.A00.get()).now() - fbSharedPreferences.Av1(A05, 0L)) >= 1) {
            return fbSharedPreferences.ArU(A06, 0) <= 2 && fbSharedPreferences.ArU(A04, 0) <= 2;
        }
        return false;
    }
}
