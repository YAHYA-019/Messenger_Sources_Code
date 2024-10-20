package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: J7S.class */
public final class J7S extends LinkedHashMap {
    public final /* synthetic */ HYM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7S(HYM hym) {
        super(21);
        this.this$0 = hym;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        return 4YV.A1X(size(), 20);
    }
}
