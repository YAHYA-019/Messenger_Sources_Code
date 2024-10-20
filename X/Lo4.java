package X;

/* loaded from: Lo4.class */
public final class Lo4 implements Runnable {
    public static final String __redex_internal_original_name = "MediaStreamLibraryLoader$addCallbackInternal$5$1";
    public final /* synthetic */ HG8 A00;
    public final /* synthetic */ MIo A01;

    public Lo4(HG8 hg8, MIo mIo) {
        this.A01 = mIo;
        this.A00 = hg8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.onSuccess(this.A00);
    }
}
