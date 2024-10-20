package X;

import kotlin.jvm.functions.Function1;

/* loaded from: J8d.class */
public final /* synthetic */ class J8d extends 01I implements Function1 {
    public static final J8d A00 = new J8d();

    public J8d() {
        super(1, IFr.class, "isSelfAudioOn", "isSelfAudioOn(Lcom/facebook/rsys/call/gen/CallModel;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(IFr.A0F(GOo.A0Y(obj)));
    }
}
