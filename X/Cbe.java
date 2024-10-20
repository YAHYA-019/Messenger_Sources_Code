package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.MarkThreadFields;
import java.util.Locale;

/* loaded from: Cbe.class */
public final class Cbe implements CallerContextable {
    public static final String __redex_internal_original_name = "WebMarkThreadsHandler";
    public final C00i A00 = 1BQ.A02(84635);
    public final C00i A05 = 1BQ.A02(84690);
    public final C00i A09 = 1BV.A00(84686);
    public final C00i A0A = 1BQ.A02(84685);
    public final C00i A06 = 1BQ.A02(84689);
    public final C00i A07 = 1BQ.A02(84688);
    public final C00i A08 = 1BQ.A02(84687);
    public final C00i A02 = AbH.A0Y();
    public final C00i A03 = 1BQ.A02(82002);
    public final C00i A04 = 1BQ.A02(Constants.LOAD_RESULT_PGO);
    public final C00i A01 = 1BV.A00(84545);

    public static C11884xs A00(Cbe cbe, MarkThreadFields markThreadFields, Integer num, String str, String str2, String str3, int i, long j) {
        int i2;
        CLv cLv = (CLv) cbe.A01.get();
        long j2 = markThreadFields.A02;
        ThreadKey threadKey = markThreadFields.A06;
        CLv.A02 = str2;
        AbstractC11854xp abstractC11854xp = cLv.A00;
        C11884xs A03 = abstractC11854xp.A03(0Pz.A0g(threadKey.A0u(), ":", j2), str, 0, 1L, AnonymousClass001.A1W(num, 0S2.A00));
        if (A03 == null) {
            A03 = null;
        } else {
            A03.A09 = str2;
            A03.A00 = i;
            if (!abstractC11854xp.A06() && (i2 = A03.A02) < 10) {
                A03.A02 = i2 + 1;
                CLv.A00(A03, cLv, AbI.A16(threadKey), threadKey.A06.toString().toLowerCase(Locale.US), str, str3, i, j, false);
                return A03;
            }
        }
        return A03;
    }

    public static CgW A01(Cbe cbe, Integer num) {
        C00i c00i;
        if (num == 0S2.A01) {
            c00i = cbe.A05;
        } else if (num == 0S2.A00) {
            c00i = cbe.A09;
        } else if (num == 0S2.A0C) {
            c00i = cbe.A0A;
        } else if (num == 0S2.A0Y) {
            c00i = cbe.A06;
        } else if (num == 0S2.A0N) {
            c00i = cbe.A07;
        } else {
            if (num != 0S2.A0j) {
                throw new IllegalArgumentException();
            }
            c00i = cbe.A08;
        }
        return (CgW) c00i.get();
    }

    public static void A02(Cbe cbe, MarkThreadFields markThreadFields, Exception exc, String str, int i, long j) {
        Integer num = 0S2.A01;
        String message = exc.getMessage();
        message.getClass();
        C11884xs A00 = A00(cbe, markThreadFields, num, message, AnonymousClass001.A0X(exc), str, i, j);
        if (A00 == null || A00.A01 < 4) {
            return;
        }
        CLv cLv = (CLv) cbe.A01.get();
        ThreadKey threadKey = markThreadFields.A06;
        C11884xs A02 = cLv.A00.A02(0Pz.A0g(threadKey.A0u(), ":", markThreadFields.A02));
        if (A02 != null) {
            CLv.A00(A02, cLv, AbI.A16(threadKey), threadKey.A06.toString().toLowerCase(Locale.US), A02.A08, str, A02.A00, j, true);
        }
    }
}
