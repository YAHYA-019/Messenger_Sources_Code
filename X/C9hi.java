package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import java.util.Locale;

/* renamed from: X.9hi, reason: invalid class name */
/* loaded from: 9hi.class */
public final class C9hi {
    public final Context A00;
    public final ThreadKey A02;
    public final C00i A01 = 1BQ.A02(16634);
    public final C00i A03 = 1BQ.A02(16387);

    public C9hi(Context context, ThreadKey threadKey) {
        this.A00 = context;
        this.A02 = threadKey;
    }

    public static void A00(C9hi c9hi, BNV bnv, String str, String str2) {
        1ZG r309;
        String str3;
        1UD r306;
        String obj = bnv.toString();
        if (AbE.A00(195).equalsIgnoreCase(obj) || "message_expiration".equalsIgnoreCase(obj)) {
            1UD A07 = 1BK.A07(c9hi.A01);
            r309 = 1ZG.A03;
            str3 = "messenger_thread_details_item_click";
            r306 = A07;
        } else {
            str3 = "messenger_thread_details_item_click";
            r306 = (1UD) 1BK.A07(c9hi.A01);
            r309 = 1ZG.A01;
        }
        2R2 r0 = new 2R2(1UD.A00(r306, r309, str3), 202);
        if (4YU.A1X(r0)) {
            r0.A0E("setting_type", obj);
            ThreadKey threadKey = c9hi.A02;
            r0.A0E("thread_type", threadKey == null ? "" : threadKey.A06.name().toLowerCase(Locale.US));
            r0.A0E("pigeon_reserved_keyword_module", "messenger_thread_details");
            r0.A0E("entry_point", str);
            r0.A0B("is_m4", AnonymousClass001.A0K());
            r0.A0E("thread_key", threadKey.A0u());
            r0.A0E("thread_id", str2);
            r0.BZL();
        }
    }

    public void A01(ThreadKey threadKey) {
        if (1BK.A0N(this.A03).AZk(72341031814697337L)) {
            1UG A08 = 1BK.A08(1BK.A07(this.A01), 1BJ.A00(1712));
            if (A08.isSampled()) {
                7zS.A1E(A08, threadKey);
                7zS.A1F(A08, threadKey);
                A08.BZL();
            }
        }
    }

    public void A02(BNV bnv, String str) {
        boolean equalsIgnoreCase = "message_expiration".equalsIgnoreCase(bnv.toString());
        2yD A0K = 1BK.A0K();
        if (!equalsIgnoreCase || A0K.AZk(36315511858406430L)) {
            ThreadKey threadKey = this.A02;
            if (!threadKey.A0z() || !equalsIgnoreCase) {
                A00(this, bnv, str, 1BK.A0w(threadKey));
            } else {
                Context context = this.A00;
                ((5P5) 1Lo.A04(context, 4YV.A0C(context), (1BY) null, 67488)).A00((MailboxCallback) null, threadKey.A01).addResultCallback(new A1V(this, bnv, str, 13));
            }
        }
    }
}
