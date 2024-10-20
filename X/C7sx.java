package X;

import android.os.Parcelable;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.InstantGameInfoProperties;
import com.facebook.messaging.model.messages.Message;

/* renamed from: X.7sx, reason: invalid class name */
/* loaded from: 7sx.class */
public final class C7sx {
    public static final boolean A00(Message message) {
        GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
        InstantGameInfoProperties instantGameInfoProperties = null;
        if (genericAdminMessageInfo != null) {
            Parcelable parcelable = genericAdminMessageInfo.A0E;
            if (parcelable == null) {
                parcelable = null;
            }
            InstantGameInfoProperties instantGameInfoProperties2 = (InstantGameInfoProperties) parcelable;
            if (instantGameInfoProperties2 != null) {
                instantGameInfoProperties = instantGameInfoProperties2;
            }
        }
        boolean z = false;
        if (instantGameInfoProperties != null) {
            Integer num = 0S2.A0C;
            String str = instantGameInfoProperties.A0B;
            11T.A09(str);
            if (num == C7kx.A00(str)) {
                z = true;
            }
        }
        return z;
    }
}
