package X;

/* loaded from: AG5.class */
public final class AG5 implements Runnable {
    public static final String __redex_internal_original_name = "DrawerListVerticalScrollListener$onScrolled$1";
    public final /* synthetic */ 8Dr A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AG5(8Dr r302, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A02;
        boolean z2 = this.A01;
        this.A00.A01.invoke(z ? z2 ? C96t.A04 : C96t.A05 : z2 ? C96t.A02 : C96t.A03);
    }
}
