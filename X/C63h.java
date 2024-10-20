package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.messages.Message;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Deque;

/* renamed from: X.63h, reason: invalid class name */
/* loaded from: 63h.class */
public abstract class C63h implements C63i, C63j {
    public final 1Iw A00;
    public final JTo A01;
    public final C6eQ A02;
    public final FbUserSession A03;

    public C63h(Context context) {
        11T.A0F(context, 1);
        this.A02 = new C6eQ(this);
        this.A01 = new JTo();
        this.A00 = new 1Iw(context);
        this.A03 = 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428));
    }

    public 1LI A02(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wi r306, 7Wh r307) {
        11T.A0F(r304, 1);
        return A05(r302, r303, r304, anonymousClass622, r307);
    }

    public String A03(6Az r302, Message message) {
        5Pm r0 = message.A08;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        6Ay BCm = r0.BCm();
        if (BCm == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str = message.A1V;
        if (str == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (r302 == BCm) {
            return str;
        }
        ImmutableList A0x = BCm.A0x();
        11T.A0A(A0x);
        int indexOf = A0x.indexOf(r302);
        if (indexOf == -1) {
            throw 1BK.A0g();
        }
        String A0e = AnonymousClass001.A0e("_", AnonymousClass001.A0n(str), indexOf);
        11T.A0A(A0e);
        return A0e;
    }

    public boolean A04() {
        return false;
    }

    public abstract 1LI A05(1Iw r1, 5zD r2, 6Az r3, AnonymousClass622 anonymousClass622, 7Wh r5);

    @Override // X.C63i
    public void ACH(View view, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        11T.A0H(view, anonymousClass622);
        11T.A0F(r304, 2);
        Preconditions.checkArgument(view instanceof LithoView, "Unexpected view: %s", view.toString());
        Message message = anonymousClass622.A03;
        11T.A09(message);
        String A03 = A03(r304, message);
        JTo jTo = this.A01;
        ComponentTree componentTree = (ComponentTree) jTo.get(A03);
        if (componentTree == null) {
            1Iw r0 = this.A00;
            C1s0 A01 = ComponentTree.A01(A05(r0, r303, r304, anonymousClass622, r306), r0, null);
            A01.A01(false);
            componentTree = A01.A00();
            jTo.put(A03, componentTree);
        } else if (!A04()) {
            componentTree.A0O(A05(this.A00, r303, r304, anonymousClass622, r306));
        }
        ((LithoView) view).A0z(componentTree);
    }

    @Override // X.C63j
    public void AFJ() {
        this.A02.A00.clear();
        this.A01.clear();
    }

    @Override // X.C63i
    public View BDK(ViewGroup viewGroup) {
        C6eQ c6eQ = this.A02;
        Deque deque = c6eQ.A00;
        if (deque.isEmpty()) {
            return new LithoView(c6eQ.A01.A00);
        }
        Object pop = deque.pop();
        11T.A0D(pop);
        return (View) pop;
    }

    @Override // X.C63j
    public void CiZ(View view) {
        Preconditions.checkArgument(view instanceof LithoView, "Unexpected view: %s", view.toString());
        this.A02.A00.push(view);
    }
}
