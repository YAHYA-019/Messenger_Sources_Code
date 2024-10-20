package X;

import com.facebook.http.interfaces.RequestPriority;

/* renamed from: X.4ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ig.class */
public abstract class AbstractC06964ig {
    public static final RequestPriority A00(2rC r301) {
        int ordinal = r301.ordinal();
        if (ordinal == 2) {
            return RequestPriority.INTERACTIVE;
        }
        if (ordinal == 1) {
            return RequestPriority.NON_INTERACTIVE;
        }
        if (ordinal == 0) {
            return RequestPriority.CAN_WAIT;
        }
        throw AnonymousClass001.A0q(AnonymousClass001.A0Z(r301, "Unrecognized priority: ", AnonymousClass001.A0k()));
    }
}
