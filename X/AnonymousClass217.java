package X;

import com.facebook.messaging.model.threads.ThreadRtcRoomInfoData;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;

/* renamed from: X.217, reason: invalid class name */
/* loaded from: 217.class */
public interface AnonymousClass217 {
    public static final ThreadRtcRoomInfoData A00;
    public static final 2xU A01 = 2xU.A00;

    static {
        HashSet hashSet = new HashSet();
        if (!hashSet.contains("roomState")) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet = hashSet2;
            hashSet2.add("roomState");
        }
        if (!hashSet.contains("roomThreadUseCase")) {
            HashSet hashSet3 = new HashSet(hashSet);
            hashSet = hashSet3;
            hashSet3.add("roomThreadUseCase");
        }
        A00 = new ThreadRtcRoomInfoData(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "", hashSet, 0, 0);
    }
}
