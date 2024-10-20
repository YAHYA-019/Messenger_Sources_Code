package X;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: G7s.class */
public final class G7s implements ResponseHandler {
    public final /* synthetic */ F8W A00;

    public G7s(F8W f8w) {
        this.A00 = f8w;
    }

    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        Integer num;
        HttpEntity entity = httpResponse.getEntity();
        F8W f8w = this.A00;
        StatusLine statusLine = httpResponse.getStatusLine();
        statusLine.getClass();
        f8w.A00 = statusLine.getStatusCode();
        C00i c00i = f8w.A05;
        F8L A0R = DKF.A0R(c00i);
        int i = f8w.A00;
        A0R.A01 = i;
        JSONObject jSONObject = null;
        if (i == 400 || i == 500) {
            num = 0S2.A0C;
        } else {
            if (i == 200 || i == 403) {
                entity.getClass();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(entity.getContent());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, "UTF-8"));
                try {
                    try {
                        StringBuilder A0k = AnonymousClass001.A0k();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            A0k.append(readLine);
                        }
                        jSONObject = DKC.A1F(A0k.toString());
                    } catch (JSONException e) {
                        DKF.A0R(c00i).A01("pii_business_response_handle_failure", e.toString());
                    }
                    bufferedInputStream.close();
                    bufferedReader.close();
                    return jSONObject;
                } catch (Throwable th) {
                    bufferedInputStream.close();
                    bufferedReader.close();
                    throw th;
                }
            }
            num = 0S2.A0j;
        }
        f8w.A02 = num;
        return null;
    }
}
