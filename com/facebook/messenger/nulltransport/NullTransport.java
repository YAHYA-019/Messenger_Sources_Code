package com.facebook.messenger.nulltransport;

import X.11T;
import X.C0il;
import X.Kaa;
import X.Kw1;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NullTransport.class */
public final class NullTransport {
    public static final Kw1 Companion = new Object();
    public final NativeHolder nativeHolder;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Kw1, java.lang.Object] */
    static {
        synchronized (Kaa.class) {
            if (!Kaa.A00) {
                C0il.A0B("messengernulltransportjni");
                Kaa.A00 = true;
            }
        }
    }

    public NullTransport(Mailbox mailbox) {
        11T.A0F(mailbox, 1);
        this.nativeHolder = initNativeHolder(mailbox, "NullTransport");
    }

    public static final native NativeHolder initNativeHolder(Mailbox mailbox, String str);
}
