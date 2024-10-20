package X;

import com.facebook.proxygen.HTTPClient;

/* renamed from: X.29t, reason: invalid class name */
/* loaded from: 29t.class */
public final class C29t {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r0 < 65536) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(org.apache.http.HttpHost r302) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29t.A00(org.apache.http.HttpHost):void");
    }

    public boolean A01(HTTPClient hTTPClient, boolean z) {
        hTTPClient.setProxy(this.A03, this.A00, "", "");
        hTTPClient.setSecureProxy(this.A04, this.A01, "", "");
        hTTPClient.setProxyDomainsRules(null, this.A02);
        hTTPClient.setIsSandbox(z);
        return hTTPClient.reInitializeIfNeeded();
    }
}
