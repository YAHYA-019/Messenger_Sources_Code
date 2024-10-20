package X;

import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5pv, reason: invalid class name */
/* loaded from: 5pv.class */
public final class C5pv {
    public ThreadKey A00;
    public boolean A02;
    public boolean A03;
    public ImmutableList A01 = ImmutableList.of();
    public boolean A04 = true;
    public boolean A05 = false;

    public MessagesCollection A00() {
        return new MessagesCollection(this);
    }

    public void A01(ImmutableList immutableList) {
        immutableList.getClass();
        this.A01 = immutableList;
    }
}
