package X;

import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6vl, reason: invalid class name */
/* loaded from: 6vl.class */
public final class C6vl implements 5To {
    public 1LI A00;
    public boolean A01;
    public ComponentTree A02;
    public final C6vk A03;
    public final Object A04;
    public final AtomicReference A05;
    public final LithoView A06;
    public final 1cP A07;
    public final boolean A08;

    public C6vl(LithoView lithoView, C6vk c6vk, boolean z) {
        this.A06 = lithoView;
        this.A03 = c6vk;
        this.A08 = z;
        1cP A02 = 1NF.A02();
        11T.A0A(A02);
        this.A07 = A02;
        this.A05 = new AtomicReference();
        this.A04 = new Object();
    }

    public void CbI(Object obj) {
        C5oF c5oF;
        this.A05.set(obj);
        new 1Iw(this.A06.A09);
        C6vk c6vk = this.A03;
        if (obj == null) {
            C5o6 c5o6 = new C5o6(5oG.A00);
            c5o6.A03 = c6vk.A01;
            c5oF = new C5oF(c5o6);
        } else {
            c5oF = (5oH) obj;
        }
        1LI A00 = C6vk.A00(c6vk, c5oF);
        if (!this.A08) {
            ComponentTree componentTree = this.A02;
            if (componentTree == null) {
                11T.A0L("componentTree");
                throw 0Q8.createAndThrow();
            }
            componentTree.A0O(A00);
            return;
        }
        synchronized (this.A04) {
            if (this.A01) {
                ComponentTree componentTree2 = this.A02;
                if (componentTree2 == null) {
                    11T.A0L("componentTree");
                    throw 0Q8.createAndThrow();
                }
                componentTree2.A0O(A00);
            } else {
                this.A00 = A00;
            }
        }
    }

    public void CbM(Object obj) {
        C5oF c5oF;
        boolean z = this.A08;
        LithoView lithoView = this.A06;
        if (z) {
            lithoView.A0x(new 2AW());
            ComponentTree componentTree = lithoView.A00;
            if (componentTree == null) {
                throw AnonymousClass001.A0L("Required value was null.");
            }
            componentTree.A0R(new C3Ym(this, componentTree, 1));
        } else {
            11T.A0A(lithoView.A09);
            C6vk c6vk = this.A03;
            if (obj == null) {
                C5o6 c5o6 = new C5o6(5oG.A00);
                c5o6.A03 = c6vk.A01;
                c5oF = new C5oF(c5o6);
            } else {
                c5oF = (5oH) obj;
            }
            2AW A00 = C6vk.A00(c6vk, c5oF);
            if (obj != null) {
                A00 = new 2AW();
            }
            lithoView.A0x(A00);
        }
        ComponentTree componentTree2 = lithoView.A00;
        if (componentTree2 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A02 = componentTree2;
        if (obj != null) {
            this.A07.CXv(new 7RN(this, this.A05.get(), obj), "postToReceiveAdditional");
        }
    }
}
