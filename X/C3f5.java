package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.3f5, reason: invalid class name */
/* loaded from: 3f5.class */
public final class C3f5 implements Runnable {
    public static final String __redex_internal_original_name = "InboxAdsFetcherWithUnitStore$1";
    public final /* synthetic */ C04624bi A00;

    public C3f5(C04624bi c04624bi) {
        this.A00 = c04624bi;
    }

    @Override // java.lang.Runnable
    public void run() {
        C04624bi c04624bi = this.A00;
        ImmutableList immutableList = C04624bi.A0D;
        c04624bi.A0A.A00();
        ((1I7) c04624bi.A06.get()).CkT("com.facebook.orca.ACTION_MESSENGER_ADS_CHANGED");
    }
}
