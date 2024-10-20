package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import java.util.Iterator;
import java.util.Map;

/* loaded from: I85.class */
public final class I85 {
    public final 1Br A00 = 7zM.A0S();

    public static final EventBuilder A00(I85 i85, String str, String str2, String str3, String str4) {
        EventBuilder level = 7zP.A0e(i85.A00).markEventBuilder(1900625, str).annotate("fbgroot_player", str2).annotate("groot_player", str3).annotate("hero_player", str4).setLevel(7);
        11T.A0A(level);
        return level;
    }

    public static final void A01(I85 i85, String str, String str2, String str3, String str4, java.util.Map map) {
        if (6Tx.A00()) {
            EventBuilder A00 = A00(i85, str4, str, str2, str3);
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                A00.annotate(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
            }
            A00.report();
        }
    }

    public final void A02(HCA hca, String str, String str2, String str3, String str4, String str5) {
        if (6Tx.A00()) {
            7zP.A0e(this.A00).markEventBuilder(1904664, "groot_warning").annotate("fbgroot_player", str).annotate("groot_player", str2).annotate("hero_player", str3).annotate("report_video_id", str4).annotate("error_details", str5).annotate(TraceFieldType.ErrorDomain, "GROOT_INFRA").annotate(TraceFieldType.ErrorCode, hca.errorCode).setLevel(5);
        }
    }
}
