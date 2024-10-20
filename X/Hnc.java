package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.MessageReactionsOverlayFragment;
import com.facebook.messaging.reactions.customreactions.views.CustomReactionEditorDialogFragment;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Hnc.class */
public final class Hnc {
    public final /* synthetic */ MessageReactionsOverlayFragment A00;
    public final /* synthetic */ 7oO A01;

    public Hnc(MessageReactionsOverlayFragment messageReactionsOverlayFragment, 7oO r303) {
        this.A00 = messageReactionsOverlayFragment;
        this.A01 = r303;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.messaging.reactions.MessageReactionsOverlayFragment, androidx.fragment.app.Fragment, X.6RX] */
    public void A00(ReactionsSet reactionsSet) {
        ?? r0 = this.A00;
        MessageReactionsOverlayFragment.A07(r0, 4YT.A00(1410), "enter_overreact_tray");
        7oO r02 = this.A01;
        06Z childFragmentManager = r0.getChildFragmentManager();
        5zD r03 = r0.A03;
        Message message = r0.A06;
        ThreadSummary threadSummary = r0.A07;
        Capabilities capabilities = MessageReactionsOverlayFragment.A0f;
        Hyn hyn = r02.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r04 = hyn.A01;
        r04.A08("com.facebook.messaging.reactions.plugins.interfaces.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "onButtonPress", andIncrement);
        try {
            if (Hyn.A00(hyn)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r04.A0A("com.facebook.messaging.reactions.plugins.customreactions.trayactionbutton.OverreactTrayActionButton", "messaging.reactions.customreactions.trayactionbutton.OverreactTrayActionButton", "com.facebook.messaging.reactions.plugins.interfaces.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", andIncrement2, "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "com.facebook.messaging.reactions.plugins.customreactions.CustomReactionsKillSwitch", "onButtonPress");
                    try {
                        Integer num = hyn.A02;
                        7zT.A1S(childFragmentManager, r03, message);
                        7zP.A1L(reactionsSet, 4, capabilities);
                        String A00 = DKB.A00(365);
                        if (childFragmentManager.A0b(A00) == null) {
                            CustomReactionEditorDialogFragment A05 = CustomReactionEditorDialogFragment.A05(message, threadSummary, EKz.A03, reactionsSet, r03.Axg(), capabilities, num);
                            A05.A0m(childFragmentManager, A00);
                            A05.A01 = r0;
                        }
                        r04.A09("messaging.reactions.customreactions.trayactionbutton.OverreactTrayActionButton", "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "onButtonPress", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r04.A04((Exception) null, "messaging.reactions.customreactions.trayactionbutton.OverreactTrayActionButton", "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "onButtonPress", andIncrement2);
                    throw th;
                }
            }
            r04.A02((Exception) null, "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "onButtonPress", andIncrement);
        } catch (Throwable th2) {
            r04.A02((Exception) null, "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "onButtonPress", andIncrement);
            throw th2;
        }
    }
}
