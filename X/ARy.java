package X;

import com.facebook.messaging.aibot.memory.model.MemoryData;
import kotlin.jvm.functions.Function1;

/* loaded from: ARy.class */
public final class ARy extends C00q implements Function1 {
    public static final ARy A00 = new ARy();

    public ARy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MemoryData memoryData = (MemoryData) obj;
        11T.A0F(memoryData, 0);
        return memoryData.A00;
    }
}
