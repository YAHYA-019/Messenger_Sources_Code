package com.facebook.messaging.sync.connection;

import X.0fH;
import X.1BJ;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Ew;
import X.1G9;
import X.1Ql;
import X.4YU;
import X.5Iy;
import X.8ET;
import X.AbE;
import X.AbstractC01593ro;
import X.AnonymousClass001;
import X.C00i;
import X.C09894rt;
import X.C10364tD;
import X.C1kw;
import X.HWF;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;
import java.util.ArrayList;

/* loaded from: MessagesSyncLoggedInUserFetcher.class */
public final class MessagesSyncLoggedInUserFetcher implements CallerContextable {
    public final C09894rt A01;
    public final 5Iy A04;
    public final C00i A02 = new 1BQ(65755);
    public final C00i A00 = new 1BQ(33013);
    public final C00i A03 = new 1BV(115105);

    public MessagesSyncLoggedInUserFetcher() {
        5Iy r0 = (5Iy) 1Bn.A0A(49671);
        C09894rt c09894rt = (C09894rt) 1Bi.A03(49320);
        this.A04 = r0;
        this.A01 = c09894rt;
    }

    public static void A00(MessagesSyncLoggedInUserFetcher messagesSyncLoggedInUserFetcher, boolean z) {
        String A00 = 1BJ.A00(802);
        C00i c00i = messagesSyncLoggedInUserFetcher.A00;
        1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
        1G9 r0 = C10364tD.A00;
        edit.putBoolean(r0, true).commit();
        C00i c00i2 = messagesSyncLoggedInUserFetcher.A03;
        AbstractC01593ro A3u = 8ET.A00((C1kw) ((HWF) c00i2.get()).A00.A00.get()).A00.A3u("android_messenger_refetch_login_user_request", false);
        if (A3u.A0B()) {
            A3u.A07("is_on_init", z);
            A3u.A0A();
        }
        try {
            C00i c00i3 = messagesSyncLoggedInUserFetcher.A02;
            User Auc = ((1Ew) c00i3.get()).Auc();
            ArrayList arrayList = new ArrayList();
            arrayList.add(messagesSyncLoggedInUserFetcher.A04);
            messagesSyncLoggedInUserFetcher.A01.A00(CallerContext.A06(messagesSyncLoggedInUserFetcher.getClass()), null, arrayList, "syncRefetchLoggedInUser");
            0fH.A0g(Boolean.valueOf(z), A00, "successfully fetched user details, onInit=%s");
            ((FbSharedPreferences) c00i.get()).edit().putBoolean(r0, false).commit();
            User Auc2 = ((1Ew) c00i3.get()).Auc();
            AbstractC01593ro A3u2 = 8ET.A00((C1kw) ((HWF) c00i2.get()).A00.A00.get()).A00.A3u("android_messenger_refetch_login_user_success", false);
            if (A3u2.A0B()) {
                if (Auc != null) {
                    A3u2.A06("local_id", Auc.A13);
                    A3u2.A06("local_type", Auc.A0e.name());
                    A3u2.A06("local_account_status", Auc.A14);
                    A3u2.A06("local_data_source", Auc.A1B);
                    A3u2.A06("is_local_partial", String.valueOf(Auc.A29));
                    A3u2.A06("is_local_mo_deactivated", String.valueOf(Auc.A25));
                    A3u2.A06("is_local_mo_user_has_password", String.valueOf(Auc.A2D));
                    A3u2.A06("is_local_deactivated_allowed_on_messenger", String.valueOf(Auc.A1u));
                }
                if (Auc2 != null) {
                    A3u2.A06("remote_id", Auc2.A13);
                    A3u2.A06("remote_type", Auc2.A0e.name());
                    A3u2.A06("remote_account_status", Auc2.A14);
                    A3u2.A06("remote_data_source", Auc2.A1B);
                    A3u2.A06("is_remote_partial", String.valueOf(Auc2.A29));
                    A3u2.A06("is_remote_mo_deactivated", String.valueOf(Auc2.A25));
                    A3u2.A06("is_remote_mo_user_has_password", String.valueOf(Auc2.A2D));
                    A3u2.A06("is_remote_deactivated_allowed_on_messenger", String.valueOf(Auc2.A1u));
                }
                A3u2.A07("is_on_init", z);
                A3u2.A0A();
            }
        } catch (Exception e) {
            0fH.A0z(A00, "failed to fetch user details, onInit=%s", e, 4YU.A1b(z));
            AbstractC01593ro A3u3 = 8ET.A00((C1kw) 1Br.A0B(((HWF) c00i2.get()).A00)).A00.A3u("android_messenger_refetch_login_user_failure", false);
            if (A3u3.A0B()) {
                A3u3.A07("is_on_init", z);
                A3u3.A06("exception", AnonymousClass001.A0X(e));
                A3u3.A06(AbE.A00(20), e.getMessage());
                A3u3.A0A();
            }
            throw e;
        }
    }
}
