package X;

import com.google.common.base.Function;
import java.util.Map;

/* loaded from: Lex.class */
public final class Lex implements Function {
    public final int A00;
    public final Object A01;

    public Lex(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                return null;
            case 1:
                return this.A01;
            default:
                Map.Entry entry = (Map.Entry) obj;
                5sD r0 = (5sD) this.A01;
                entry.getClass();
                return new 5sH(r0, entry);
        }
    }
}
