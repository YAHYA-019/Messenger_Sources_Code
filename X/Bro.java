package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Bro.class */
public final class Bro {
    public final ThreadKey A00;
    public final SettableFuture A01;
    public final String A02;
    public final String A03;

    public Bro(ThreadKey threadKey, SettableFuture settableFuture, String str, String str2) {
        this.A02 = str;
        this.A00 = threadKey;
        this.A03 = str2;
        this.A01 = settableFuture;
    }
}
