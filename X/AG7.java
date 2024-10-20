package X;

import com.facebook.messaging.photos.view.VideoMessageItem;

/* loaded from: AG7.class */
public final class AG7 implements Runnable {
    public static final String __redex_internal_original_name = "VideoMessageItem$checkSharedByBlockedUser$1";
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ HnS A01;
    public final /* synthetic */ VideoMessageItem A02;

    public AG7(1Br r302, HnS hnS, VideoMessageItem videoMessageItem) {
        this.A02 = videoMessageItem;
        this.A00 = r302;
        this.A01 = hnS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((AnonymousClass472) 1Br.A0B(this.A00)).A00(this.A02.BAN()).A02(new 9uS(this.A01, 3));
    }
}
