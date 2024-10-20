package X;

import com.facebook.messaging.photos.view.DefaultPhotoMessageItem;

/* loaded from: AG6.class */
public final class AG6 implements Runnable {
    public static final String __redex_internal_original_name = "DefaultPhotoMessageItem$checkSharedByBlockedUser$1";
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ HnS A01;
    public final /* synthetic */ DefaultPhotoMessageItem A02;

    public AG6(1Br r302, HnS hnS, DefaultPhotoMessageItem defaultPhotoMessageItem) {
        this.A02 = defaultPhotoMessageItem;
        this.A00 = r302;
        this.A01 = hnS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((AnonymousClass472) 1Br.A0B(this.A00)).A00(this.A02.BAN()).A02(new 9uS(this.A01, 2));
    }
}
