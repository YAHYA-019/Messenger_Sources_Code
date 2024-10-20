package X;

import com.facebook.rsys.call.gen.CallModel;

/* loaded from: JBs.class */
public final /* synthetic */ class JBs extends C06w {
    public static final JBs A00 = new JBs();

    public JBs() {
        super(CallModel.class, "inCallState", "getInCallState()I", 0);
    }

    @Override // X.C06w, X.AnonymousClass070
    public Object get(Object obj) {
        return Integer.valueOf(((CallModel) obj).inCallState);
    }
}
