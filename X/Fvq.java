package X;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/* loaded from: Fvq.class */
public final class Fvq implements 1K9 {
    public final /* synthetic */ FH2 A00;

    public Fvq(FH2 fh2) {
        this.A00 = fh2;
    }

    public void onFailure(Throwable th) {
        FH2 fh2 = this.A00;
        synchronized (fh2.A07) {
            FH2.A02(fh2, 400);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        HttpResponse httpResponse = (HttpResponse) obj;
        FH2 fh2 = this.A00;
        synchronized (fh2.A07) {
            StatusLine statusLine = httpResponse.getStatusLine();
            FH2.A02(fh2, statusLine == null ? null : Integer.valueOf(statusLine.getStatusCode()));
        }
    }
}
