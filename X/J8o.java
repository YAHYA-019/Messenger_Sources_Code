package X;

import com.facebook.rsys.callcontext.gen.CallContext;

/* loaded from: J8o.class */
public final /* synthetic */ class J8o extends 01I implements C0Bd {
    public J8o(Object obj) {
        super(3, obj, Hho.class, "createCallClient", "createCallClient(Ljava/lang/String;Lcom/facebook/rsys/callcontext/gen/CallContext;Lcom/facebook/rsys/devxcallagent/gen/DevXAgentCallConfig;)Lcom/facebook/rsys/callmanager/callclient/gen/CallClient;", 0);
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        CallContext callContext = (CallContext) obj2;
        11T.A0H(str, callContext);
        Hho hho = (Hho) ((01K) this).receiver;
        C2618Gj7 c2618Gj7 = hho.A02;
        String str2 = c2618Gj7.A02;
        if (!str.equals(str2)) {
            return null;
        }
        return new GwB((Gw1) hho.A04.invoke(obj3), callContext, hho.A03, str2, new AQh(49, hho.A01, c2618Gj7, hho.A00), JAn.A00);
    }
}
