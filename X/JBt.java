package X;

import com.facebook.rsys.call.gen.CallModel;

/* loaded from: JBt.class */
public final /* synthetic */ class JBt extends C06w {
    public static final JBt A00 = new JBt();

    public JBt() {
        super(CallModel.class, "inCallState", "getInCallState()I", 0);
    }

    @Override // X.C06w, X.AnonymousClass070
    public Object get(Object obj) {
        return Integer.valueOf(((CallModel) obj).inCallState);
    }
}
