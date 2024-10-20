package X;

import com.google.common.collect.ImmutableList;

/* loaded from: J1q.class */
public final class J1q implements Runnable {
    public static final String __redex_internal_original_name = "LivingRoomPresenceManager$publishPresence$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ IRt A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ boolean A03;

    public J1q(IRt iRt, ImmutableList immutableList, int i, boolean z) {
        this.A01 = iRt;
        this.A02 = immutableList;
        this.A00 = i;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((67L) this.A01.A04.get()).A01(new Q62(this.A02));
    }
}
