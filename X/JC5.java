package X;

import com.facebook.rsys.call.gen.CallModel;

/* loaded from: JC5.class */
public final /* synthetic */ class JC5 extends C06w {
    public static final JC5 A00 = new JC5();

    public JC5() {
        super(CallModel.class, "inCallState", "getInCallState()I", 0);
    }

    @Override // X.C06w, X.AnonymousClass070
    public Object get(Object obj) {
        return Integer.valueOf(((CallModel) obj).inCallState);
    }
}
