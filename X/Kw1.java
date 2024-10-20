package X;

import com.facebook.messenger.nulltransport.NullTransport;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

/* loaded from: Kw1.class */
public final class Kw1 {
    private final NativeHolder initNativeHolder(Mailbox mailbox, String str) {
        return NullTransport.initNativeHolder(mailbox, str);
    }
}
