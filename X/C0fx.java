package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* renamed from: X.0fx, reason: invalid class name */
/* loaded from: 0fx.class */
public final class C0fx extends C00q implements Function1 {
    public final /* synthetic */ C0rt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0fx(C0rt c0rt) {
        super(1);
        this.this$0 = c0rt;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        11T.A0F(entry, 0);
        C0rt c0rt = this.this$0;
        Object key = entry.getKey();
        String valueOf = key == c0rt ? "(this Map)" : String.valueOf(key);
        Object value = entry.getValue();
        return 0Pz.A0Y(valueOf, value == c0rt ? "(this Map)" : String.valueOf(value), '=');
    }
}
