package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: ATv.class */
public final class ATv extends C00q implements Function1 {
    public static final ATv A00 = new ATv();

    public ATv() {
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
