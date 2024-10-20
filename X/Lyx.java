package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Lyx.class */
public abstract class Lyx extends AtomicInteger implements MQs {
    public static final long serialVersionUID = -1001730202384742097L;

    @Override // X.MJr
    public final boolean offer(Object obj) {
        throw AnonymousClass001.A0q("Should not be called");
    }
}
