package X;

import com.facebook.messaging.msys.contacts.plugins.user.threadviewotheruser.ThreadViewOtherUserLoaderImplementation;
import com.facebook.user.model.User;

/* loaded from: GRz.class */
public final class GRz implements 7Yx {
    public final /* synthetic */ ThreadViewOtherUserLoaderImplementation A00;

    public GRz(ThreadViewOtherUserLoaderImplementation threadViewOtherUserLoaderImplementation) {
        this.A00 = threadViewOtherUserLoaderImplementation;
    }

    public final void CHY(User user) {
        ThreadViewOtherUserLoaderImplementation threadViewOtherUserLoaderImplementation = this.A00;
        if (threadViewOtherUserLoaderImplementation.A07.get()) {
            if (user != null) {
                threadViewOtherUserLoaderImplementation.A05.A03(user, "otherUser");
            } else {
                ((C2eo) 1Br.A0B(threadViewOtherUserLoaderImplementation.A01)).A09(null, Long.valueOf(threadViewOtherUserLoaderImplementation.A04.A02));
            }
        }
    }
}
