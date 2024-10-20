package X;

import com.facebook.messaging.communitymessaging.plugins.multireact.reactiondecoration.MultiReactPillDecoration;
import com.facebook.messaging.reactions.MessageReactionsOverlayFragment;

/* loaded from: A8y.class */
public final class A8y implements 6nH {
    public final int A00;
    public final Object A01;

    public A8y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BhX(1Iw r302, String str, int i) {
        if (this.A00 != 0) {
            11T.A0F(str, 1);
            7Hf r0 = (7Hf) this.A01;
            7HH r02 = r0.A01;
            if (r02 != null) {
                r02.A01(new A8q(r0, str), new A8w(3), C0uA.A00);
                r02.A01.BaS("quick_reaction_pill", 4YT.A00(1401), null, null);
                return;
            }
            return;
        }
        MultiReactPillDecoration multiReactPillDecoration = (MultiReactPillDecoration) this.A01;
        AnonymousClass622 anonymousClass622 = multiReactPillDecoration.A0B;
        5zD r03 = multiReactPillDecoration.A0A;
        MessageReactionsOverlayFragment A05 = MessageReactionsOverlayFragment.A05(null, r03, null, anonymousClass622.A05, anonymousClass622, multiReactPillDecoration.A0C, 0S2.A0N, null, new int[]{0, 0}, false);
        A05.A0D = anonymousClass622;
        A05.A03 = r03;
        A05.A08 = new 9xG();
        06Z r04 = multiReactPillDecoration.A01;
        String A00 = 4YT.A00(1411);
        if (r04.A0b(A00) == null) {
            A05.A0q(7zL.A0G(r04), A00, true);
        }
        ((8Ai) 1Br.A0B(multiReactPillDecoration.A08)).A02(anonymousClass622);
    }
}
