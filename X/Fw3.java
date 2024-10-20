package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Fw3.class */
public final class Fw3 implements 1K9 {
    public final /* synthetic */ 3sU A00;
    public final /* synthetic */ 1QE A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ Integer A03;

    public Fw3(3sU r302, 1QE r303, SettableFuture settableFuture, Integer num) {
        this.A00 = r302;
        this.A02 = settableFuture;
        this.A01 = r303;
        this.A03 = num;
    }

    public void onFailure(Throwable th) {
        String str;
        C01s A09 = 1BK.A09(this.A00.A08);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Error fetching SingleZeroRatingAPI: ");
        A0k.append(this.A01);
        A0k.append(" with cache policy: ");
        switch (this.A03.intValue()) {
            case 0:
                str = "NETWORK_ONLY";
                break;
            case 1:
                str = "CACHE_ONLY";
                break;
            default:
                str = "FULLY_CACHED";
                break;
        }
        A09.D0y(AbstractC00603o4.A00(24), AnonymousClass001.A0d(str, A0k), 1000, th);
        this.A02.setException(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A02.set(((AbstractC08294mh) obj).A03);
    }
}
