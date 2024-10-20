package X;

/* loaded from: Ipj.class */
public final class Ipj implements Runnable {
    public static final String __redex_internal_original_name = "UploadJobImpl$registerNetworkMonitor$1";
    public final /* synthetic */ IEy A00;

    public Ipj(IEy iEy) {
        this.A00 = iEy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.A00.A0A;
        synchronized (obj) {
            11T.A0I(obj, 7zK.A00(389));
            obj.notifyAll();
        }
    }
}
