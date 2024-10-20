package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.9h3, reason: invalid class name */
/* loaded from: 9h3.class */
public final class C9h3 {
    public final ConcurrentHashMap A00;
    public final 99G A01;

    public C9h3() {
        this(8rP.A00);
    }

    public C9h3(99G r302) {
        this.A01 = r302;
        this.A00 = new ConcurrentHashMap();
    }

    public Object A00(Object obj, 0DR r303, Function1 function1) {
        Function2 aJj;
        99G r0 = this.A01;
        if (11T.A0O(r0, 8rP.A00)) {
            aJj = new AnonymousClass851(obj, (0DR) null, this, new AIi(function1, null, 1), 15);
        } else {
            if (!11T.A0O(r0, 8rO.A00)) {
                throw 1BK.A1F();
            }
            aJj = new AJj(new AIi(function1, null, 1), this, obj, (0DR) null, 27);
        }
        return 2aG.A00(r303, aJj);
    }
}
