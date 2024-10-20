package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TransportAgnosticLogging;
import java.util.List;

/* renamed from: X.9ea, reason: invalid class name */
/* loaded from: 9ea.class */
public abstract class C9ea {
    public static C5oa[] A00 = 7zP.A1a("message_sends_client", new long[]{0, 1, 27, 26, 2, 23, 3, 25, 4, 24, 6, 7, 8, 28, 9, 18, 19, 29, 10, 11, 12, 13, 21, 14, 15, 16, 17, 20, 22}, 1412);

    public static void A00(PrivacyContext privacyContext, Boolean bool, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, String str2, List list, long j, long j2, long j3) {
        Object[] objArr = new Object[ActionId.VIDEO_PLAYING];
        Long A0j = 4YV.A0j();
        System.arraycopy(new Object[]{8, A0j, (byte) 0, list, 0, A0j, (byte) 1, Long.valueOf(j), 3, A0j, (byte) 0, null, 3, A0j, (byte) 0, null, 0, A0j, (byte) 1, Long.valueOf(j2), 5, A0j, (byte) 0, null, 22, A0j, (byte) 0}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{l, 9, A0j, (byte) 0, null, 3, A0j, (byte) 0, null, 3, A0j, (byte) 0, null, 3, A0j, (byte) 0, null, 3, A0j, (byte) 0, null, 22, A0j, (byte) 0, l2, 22, A0j}, 0, objArr, 27, 27);
        System.arraycopy(new Object[]{(byte) 0, null, 24, A0j, (byte) 0, bool, 5, A0j, (byte) 0, null, 3, A0j, (byte) 0, str, 3, A0j, (byte) 0, null, 0, A0j, (byte) 1, Long.valueOf(j3), 22, A0j, (byte) 0, l3, 22}, 0, objArr, 54, 27);
        System.arraycopy(new Object[]{A0j, (byte) 0, l4, 22, A0j, (byte) 0, l5, 3, A0j, (byte) 0, null, 3, A0j, (byte) 0, null, 3, A0j, (byte) 0, str2, 5, A0j, (byte) 0, null, 22, A0j, (byte) 0, l6}, 0, objArr, 81, 27);
        System.arraycopy(new Object[]{3, A0j, (byte) 0, null, 22, A0j, (byte) 0, l7}, 0, objArr, 108, 8);
        TransportAgnosticLogging.logTalEventToPipe(privacyContext, 0, false, 29, objArr, A00);
    }
}
