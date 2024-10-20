package X;

import java.util.concurrent.Executor;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: G7w.class */
public final class G7w implements ResponseHandler {
    public final /* synthetic */ EkV A00;
    public final /* synthetic */ EIE A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Executor A03;

    public G7w(EkV ekV, EIE eie, String str, Executor executor) {
        this.A03 = executor;
        this.A00 = ekV;
        this.A02 = str;
        this.A01 = eie;
    }

    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        this.A03.execute(new G4s(this.A00, this.A01, this.A02, httpResponse));
        return httpResponse;
    }
}
