package X;

import com.facebook.messaging.msys.contacts.plugins.user.threadviewotheruser.ThreadViewOtherUserLoaderImplementation;
import com.google.common.collect.ImmutableList;

/* loaded from: Iwg.class */
public final class Iwg implements Runnable {
    public static final String __redex_internal_original_name = "ThreadViewOtherUserLoaderImplementation$storedProcedureListener$1$onObservedStoredProcedureChanged$1$1";
    public final /* synthetic */ ThreadViewOtherUserLoaderImplementation A00;
    public final /* synthetic */ ImmutableList A01;

    public Iwg(ThreadViewOtherUserLoaderImplementation threadViewOtherUserLoaderImplementation, ImmutableList immutableList) {
        this.A00 = threadViewOtherUserLoaderImplementation;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadViewOtherUserLoaderImplementation threadViewOtherUserLoaderImplementation = this.A00;
        ImmutableList immutableList = this.A01;
        if (threadViewOtherUserLoaderImplementation.A07.get()) {
            11T.A0D(immutableList);
            Object A0J = 0QD.A0J(immutableList, 0);
            if (A0J != null) {
                threadViewOtherUserLoaderImplementation.A05.A03(A0J, "otherUser");
            }
        }
    }
}
