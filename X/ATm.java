package X;

import com.facebook.presence.api.model.LightweightInteractions;
import com.facebook.user.model.UserKey;
import kotlin.jvm.functions.Function1;

/* loaded from: ATm.class */
public final class ATm extends C00q implements Function1 {
    public static final ATm A00 = new ATm();

    public ATm() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LightweightInteractions lightweightInteractions = (LightweightInteractions) obj;
        11T.A0F(lightweightInteractions, 0);
        UserKey userKey = lightweightInteractions.A00.A0k;
        11T.A0A(userKey);
        return userKey;
    }
}
