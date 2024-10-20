package X;

import com.facebook.rsys.state.gen.State;

/* loaded from: JC8.class */
public final /* synthetic */ class JC8 extends C06w {
    public static final JC8 A00 = new JC8();

    public JC8() {
        super(State.class, "callState", "getCallState()I", 0);
    }

    @Override // X.C06w, X.AnonymousClass070
    public Object get(Object obj) {
        return Integer.valueOf(((State) obj).callState);
    }
}
