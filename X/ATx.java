package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: ATx.class */
public final class ATx extends C00q implements Function1 {
    public static final ATx A00 = new ATx();

    public ATx() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        State state = (State) 7zO.A0e(obj).A00(State.class);
        if (state != null) {
            int i = state.callState;
            if (Integer.valueOf(i) != null && (i == 4 || i == 0)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
