package X;

import kotlin.jvm.functions.Function1;

/* loaded from: J66.class */
public class J66 implements 0G2 {
    public Object A00 = null;
    public final Function1 A01;

    public J66(Function1 function1) {
        this.A01 = function1;
    }

    public Object BIk(Object obj, C06z c06z) {
        return this.A00;
    }

    public void Cvy(Object obj, Object obj2, C06z c06z) {
        Object obj3 = this.A00;
        if (obj3 != null && obj3 != obj2) {
            this.A01.invoke(obj3);
        }
        this.A00 = obj2;
    }
}
