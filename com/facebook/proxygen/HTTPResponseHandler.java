package com.facebook.proxygen;

import org.apache.http.Header;

/* loaded from: HTTPResponseHandler.class */
public interface HTTPResponseHandler {
    void onBody();

    void onEOM();

    void onError(HTTPRequestError hTTPRequestError);

    void onResponse(int i, String str, Header[] headerArr);
}
