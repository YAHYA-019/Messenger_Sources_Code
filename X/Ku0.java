package X;

import java.io.IOException;

/* loaded from: Ku0.class */
public final class Ku0 {
    public final KJb A00;
    public final String A01;

    public Ku0(KJb kJb, String str) {
        11T.A0F(kJb, 2);
        this.A01 = str;
        this.A00 = kJb;
    }

    public final com.meta.wearable.comms.calling.hera.engine.base.Any A00(KJb kJb) {
        KG2 newBuilder = com.meta.wearable.comms.calling.hera.engine.base.Any.newBuilder();
        ((com.meta.wearable.comms.calling.hera.engine.base.Any) KGw.A00(newBuilder)).type_ = this.A01;
        try {
            int serializedSize = kJb.getSerializedSize();
            MGe mGe = Lj5.A01;
            byte[] bArr = new byte[serializedSize];
            KEF kef = new KEF(bArr, serializedSize);
            kJb.writeTo(kef);
            if (kef.A01 - kef.A00 != 0) {
                throw AnonymousClass001.A0N("Did not write as much data as expected.");
            }
            ((com.meta.wearable.comms.calling.hera.engine.base.Any) KGw.A00(newBuilder)).value_ = new KEB(bArr);
            return (com.meta.wearable.comms.calling.hera.engine.base.Any) newBuilder.A05();
        } catch (IOException e) {
            throw 1BK.A0s(0Pz.A0z("Serializing ", AnonymousClass001.A0Y(kJb), " to a ", "ByteString", " threw an IOException (should never happen)."), e);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ku0)) {
                return false;
            }
            Ku0 ku0 = (Ku0) obj;
            if (!11T.A0O(this.A01, ku0.A01) || !11T.A0O(this.A00, ku0.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 4YV.A02(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MessageDescription(type=");
        A0k.append(this.A01);
        A0k.append(", message=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
