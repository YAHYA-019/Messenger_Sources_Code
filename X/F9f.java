package X;

import com.facebook.zero.sdk.json.JSONObjectImpl;
import java.io.IOException;

/* loaded from: F9f.class */
public final class F9f {
    public final 24X A00;

    public F9f(24X r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public F9f(String str) {
        AnonymousClass243.A00();
        2Jz A00 = 2Jz.A00(str);
        if (A00 == null) {
            throw new IOException("Couldn't create string node");
        }
        this.A00 = A00;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.facebook.zero.sdk.json.JSONObjectImpl] */
    public JSONObjectImpl A00() {
        24X r0 = this.A00;
        if (!(r0 instanceof 2DM)) {
            throw new IOException("node is not an object");
        }
        ?? obj = new Object();
        obj.nodeInner = r0;
        return obj;
    }

    public /* bridge */ /* synthetic */ Long A01() {
        24X r0 = this.A00;
        if (r0.A0T()) {
            return Long.valueOf(r0.A07());
        }
        throw new IOException("node is not numeric");
    }

    public String A02() {
        24X r0 = this.A00;
        if (!r0.A0Y()) {
            throw new IOException("Object is not of type String");
        }
        String A0H = r0.A0H();
        11T.A0A(A0H);
        return A0H;
    }
}
