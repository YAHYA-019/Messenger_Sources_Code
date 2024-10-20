package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Gb7, reason: case insensitive filesystem */
/* loaded from: Gb7.class */
public abstract class AbstractC2370Gb7 extends HuU {
    public final String A00;

    public AbstractC2370Gb7(JDx jDx, String str) {
        super(jDx);
        this.A00 = str;
    }

    public void A06() {
        A02("onPinAddressError", AnonymousClass001.A1Z());
    }

    public void A07() {
        A02("onPinAddressShared", AnonymousClass001.A1Z());
    }

    public void A08() {
        A02("onPlaceShared", AnonymousClass001.A1Z());
    }

    public void A09() {
        A02("onRecenterClicked", AnonymousClass001.A1Z());
    }

    public void A0A(LiveLocationSession liveLocationSession) {
        A02("onLiveLocationStarted: session=%s", liveLocationSession);
    }

    public void A0B(LiveLocationSession liveLocationSession) {
        A02("onLiveLocationStopped: session=%s", liveLocationSession);
    }

    public void A0C(LiveLocationSession liveLocationSession, ImmutableList immutableList, String str) {
        A02("onMapUpdated: session=%s sharers=%s groupishId=%s", liveLocationSession, immutableList, str);
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            LiveLocationSharer liveLocationSharer = (LiveLocationSharer) it.next();
            long j = liveLocationSharer.A01.A04;
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (j <= 0) {
                A03(AnonymousClass001.A0N("sender clock skew"));
            } else if (currentTimeMillis < 0 || currentTimeMillis >= 3600000) {
                A03(AnonymousClass001.A0N("receiver clock skew"));
            } else {
                A02("onSharerStalenessUpdated: userId=%s stalenessMillis=%d groupishId=%s messageId=%s", liveLocationSharer.A04, Long.valueOf(currentTimeMillis), str, liveLocationSharer.A03);
            }
        }
    }
}
