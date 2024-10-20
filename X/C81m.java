package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Function;

/* renamed from: X.81m, reason: invalid class name */
/* loaded from: 81m.class */
public final /* synthetic */ class C81m implements Function {
    public final /* synthetic */ JU4 A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ 5SW A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C81m(JU4 ju4, ThreadKey threadKey, 5SW r304, String str) {
        this.A00 = ju4;
        this.A01 = threadKey;
        this.A02 = r304;
        this.A03 = str;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.A00.A18(this.A01, this.A02, this.A03);
    }
}
