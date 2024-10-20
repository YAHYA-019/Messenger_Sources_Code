package X;

import X.28Q;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: Kxa.class */
public abstract class Kxa {
    public static final JsonSerializer A00 = new StdSerializer() { // from class: com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void A0A(28Q r302, C26c c26c, Object obj) {
            r302.A0o((String) obj);
        }
    };

    public Kxa() {
        throw 0Q8.createAndThrow();
    }
}
