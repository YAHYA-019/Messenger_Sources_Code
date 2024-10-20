package X;

import com.fasterxml.jackson.databind.node.JsonNodeCreator;
import java.io.Serializable;

/* renamed from: X.26T, reason: invalid class name */
/* loaded from: 26T.class */
public final class C26T implements JsonNodeCreator, Serializable {
    public static final C26T A00;
    public static final C26T A01;
    public static final long serialVersionUID = 1;
    public final boolean _cfgBigDecimalExact;

    static {
        C26T c26t = new C26T(false);
        A01 = c26t;
        A00 = c26t;
    }

    public C26T() {
        this(false);
    }

    public C26T(boolean z) {
        this._cfgBigDecimalExact = false;
    }

    public C03353xs A00() {
        return new C03353xs(this);
    }

    public 2DM A01() {
        return new 2DM(this);
    }
}
