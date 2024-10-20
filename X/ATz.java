package X;

import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: ATz.class */
public final class ATz extends C00q implements Function1 {
    public static final ATz A00 = new ATz();

    public ATz() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        State state = (State) 7zO.A0e(obj).A00(State.class);
        boolean z = true;
        if (state != null && (i = state.callState) != 4 && i != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
