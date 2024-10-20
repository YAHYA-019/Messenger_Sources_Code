package X;

import kotlin.jvm.functions.Function2;

/* loaded from: AVv.class */
public final class AVv extends C00q implements Function2 {
    public static final AVv A00 = new AVv();

    public AVv() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        11T.A0H(obj, obj2);
        if (!obj2.equals(C9ee.A00)) {
            String str = obj2 instanceof 2JS ? HKc.A00((2JS) obj2).localCallId : null;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("DISPATCH RECEIVED AFTER CALLSTATE == IDLE & CallUiFinished.");
            A0k.append(str != null ? 0Pz.A0W("\nlocalCallId: ", str) : "");
            A0k.append("\naction: ");
            A0k.append(obj2);
            IDO.A02("RpStores", AnonymousClass001.A0g(A0k, ' '));
        }
        return obj;
    }
}
