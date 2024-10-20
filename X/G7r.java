package X;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

/* loaded from: G7r.class */
public final class G7r implements ResponseHandler {
    public final /* synthetic */ 5SG A00;

    public G7r(5SG r302) {
        this.A00 = r302;
    }

    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        if (httpResponse == null) {
            this.A00.COq((String) null, -1);
            return httpResponse;
        }
        try {
            this.A00.COq(EntityUtils.toString(httpResponse.getEntity(), "UTF-8"), httpResponse.getStatusLine().getStatusCode());
            return httpResponse;
        } catch (IOException e) {
            this.A00.Bxs(httpResponse.getStatusLine().getStatusCode(), e);
            return httpResponse;
        }
    }
}
