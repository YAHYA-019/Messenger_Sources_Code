package X;

import com.facebook.rsys.state.gen.State;

/* loaded from: JC4.class */
public final /* synthetic */ class JC4 extends C06w {
    public static final JC4 A00 = new JC4();

    public JC4() {
        super(State.class, "callState", "getCallState()I", 0);
    }

    @Override // X.C06w, X.AnonymousClass070
    public Object get(Object obj) {
        return Integer.valueOf(((State) obj).callState);
    }
}
