package X;

import com.facebook.messaging.memories.model.MemoryHiddenThreadModel;
import kotlin.jvm.functions.Function1;

/* loaded from: ASp.class */
public final class ASp extends C00q implements Function1 {
    public static final ASp A00 = new ASp();

    public ASp() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C13h c13h = (C13h) obj;
        11T.A0F(c13h, 0);
        Object obj2 = ((MemoryHiddenThreadModel) c13h.A01).A03;
        if (obj2 == null) {
            obj2 = Integer.valueOf(c13h.A00);
        }
        return obj2;
    }
}
