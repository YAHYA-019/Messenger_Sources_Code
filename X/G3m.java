package X;

/* loaded from: G3m.class */
public final class G3m implements Runnable {
    public static final String __redex_internal_original_name = "PaginationLoggingController$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ L9r A01;
    public final /* synthetic */ EwL A02;

    public G3m(L9r l9r, EwL ewL, long j) {
        this.A02 = ewL;
        this.A01 = l9r;
        this.A00 = j;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.EpW, java.lang.Object] */
    @Override // java.lang.Runnable
    public void run() {
        L9r l9r = this.A01;
        1Im r0 = l9r.A01;
        String str = l9r.A05;
        Integer num = l9r.A03;
        long j = this.A00;
        int i = l9r.A00;
        String str2 = l9r.A04;
        Exception exc = l9r.A02;
        ?? obj = new Object();
        obj.A05 = str;
        obj.A03 = num;
        obj.A01 = j;
        obj.A00 = i;
        obj.A04 = str2;
        obj.A02 = exc;
        r0.A00((Object) obj);
    }
}
