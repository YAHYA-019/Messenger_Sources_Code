package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: JAu.class */
public final class JAu extends C00q implements Function1 {
    public static final JAu A00 = new JAu();

    public JAu() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int intValue;
        String str = (String) obj;
        11T.A0F(str, 0);
        State state = (State) GOp.A0n(str).A00(State.class);
        Integer valueOf = state != null ? Integer.valueOf(state.callState) : null;
        boolean z = false;
        if (valueOf != null && ((intValue = valueOf.intValue()) == 1 || intValue == 2 || intValue == 3)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
