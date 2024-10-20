package X;

import com.facebook.messaging.model.messages.ReactionMetaData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.627, reason: invalid class name */
/* loaded from: 627.class */
public final class AnonymousClass627 {
    public int A00 = 0;
    public ReactionMetaData A01;
    public CopyOnWriteArrayList A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public void A00() {
        ReactionMetaData reactionMetaData;
        synchronized (this) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A02;
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    7WZ r0 = (7WZ) it.next();
                    synchronized (r0) {
                        AnonymousClass622 anonymousClass622 = r0.A01;
                        if (anonymousClass622 != null) {
                            1Iw r02 = r0.A00;
                            AnonymousClass627 anonymousClass627 = anonymousClass622.A06;
                            synchronized (anonymousClass627) {
                                reactionMetaData = anonymousClass627.A01;
                                anonymousClass627.A01 = null;
                            }
                            if (r02.A02 != null) {
                                r02.A0H(new C2l4(new Object[]{reactionMetaData}, 0), "updateState:ReactionsAnimationComponent.onReactionChanged");
                            }
                        }
                    }
                }
            }
        }
    }

    public void A01(int i) {
        synchronized (this) {
            this.A00 = i;
        }
    }

    public void A02(boolean z) {
        synchronized (this) {
            this.A06 = z;
        }
    }

    public boolean A03() {
        boolean z;
        synchronized (this) {
            z = this.A06;
        }
        return z;
    }
}
