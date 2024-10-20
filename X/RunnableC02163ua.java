package X;

/* renamed from: X.3ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ua.class */
public final class RunnableC02163ua implements Runnable {
    public static final String __redex_internal_original_name = "InboxPymkRepository$fetchInitialSuggestionsForInbox$runnable$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2VP A01;
    public final /* synthetic */ 2ZG A02;
    public final /* synthetic */ String A03;

    public RunnableC02163ua(2VP r302, 2ZG r303, String str, int i) {
        this.A02 = r303;
        this.A00 = i;
        this.A01 = r302;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A05(this.A01, this.A03, this.A00, true, true);
    }
}
