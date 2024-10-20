package X;

import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.google.common.base.Function;

/* loaded from: D38.class */
public final class D38 implements Function {
    public static final D38 A00 = new Object();

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        MessageSearchMessageModel messageSearchMessageModel = (MessageSearchMessageModel) obj;
        if (messageSearchMessageModel == null) {
            return null;
        }
        String str = messageSearchMessageModel.A09;
        if (1JF.A0B(str)) {
            return null;
        }
        return new C2U(str, messageSearchMessageModel.A00);
    }
}
