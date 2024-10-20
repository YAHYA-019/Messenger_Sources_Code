package X;

import com.facebook.rsys.call.gen.CallModel;

/* loaded from: JBr.class */
public final /* synthetic */ class JBr extends C06w {
    public static final JBr A00 = new JBr();

    public JBr() {
        super(CallModel.class, "remoteParticipants", "getRemoteParticipants()Ljava/util/ArrayList;", 0);
    }

    @Override // X.C06w, X.AnonymousClass070
    public Object get(Object obj) {
        return ((CallModel) obj).remoteParticipants;
    }
}
