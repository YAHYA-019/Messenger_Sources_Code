package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.util.Arrays;

/* renamed from: X.2e4, reason: invalid class name */
/* loaded from: 2e4.class */
public final class C2e4 {
    public final C1md A01;
    public final SubscribeTopic A02 = new SubscribeTopic("/t_p", 0);
    public boolean A00 = false;

    public C2e4(C1md c1md) {
        this.A01 = c1md;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C2e4)) {
                return false;
            }
            C2e4 c2e4 = (C2e4) obj;
            if (this.A02.equals(c2e4.A02) && this.A01 == c2e4.A01 && this.A00 == c2e4.A00) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, Boolean.valueOf(this.A00)});
    }
}
