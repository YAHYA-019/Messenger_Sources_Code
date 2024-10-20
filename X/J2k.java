package X;

/* loaded from: J2k.class */
public final class J2k implements Runnable {
    public static final String __redex_internal_original_name = "MultimediaEditorView$OnMediaViewLayoutChangeListener$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ IKJ A04;

    public J2k(IKJ ikj, int i, int i2, int i3, int i4) {
        this.A04 = ikj;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        HmH hmH = this.A04.A00.A09;
        if (hmH != null) {
            hmH.A00(this.A01, this.A03, this.A02, this.A00);
        }
    }
}
