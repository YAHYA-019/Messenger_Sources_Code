package X;

/* renamed from: X.5dt, reason: invalid class name */
/* loaded from: 5dt.class */
public final class C5dt implements Runnable {
    public static final String __redex_internal_original_name = "AbstractListenableFutureFbLoader$postCachedResult$1";
    public final /* synthetic */ 2UV A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ boolean A03;

    public C5dt(2UV r302, Object obj, Object obj2, boolean z) {
        this.A00 = r302;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2UV r0 = this.A00;
        2TV r02 = r0.A01;
        Object obj = this.A01;
        Object obj2 = this.A02;
        r02.C9D(obj, obj2);
        if (this.A03) {
            r0.A01.C4X(obj, obj2);
        }
    }
}
