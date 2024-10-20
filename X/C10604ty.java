package X;

import com.facebook.msys.mca.Mailbox;

/* renamed from: X.4ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ty.class */
public final class C10604ty extends C1iw {
    public static final String __redex_internal_original_name = "Mailbox$13";
    public final /* synthetic */ Mailbox A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10604ty(Mailbox mailbox) {
        super("startAllSyncDelayedSyncGroups");
        this.A00 = mailbox;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.startAllDelayedSyncGroupsNative();
    }
}
