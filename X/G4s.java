package X;

import org.apache.http.HttpResponse;

/* loaded from: G4s.class */
public final class G4s implements Runnable {
    public static final String __redex_internal_original_name = "BloksPrepackagedCdnFetcher$fetchFromCdn$request$1$1";
    public final /* synthetic */ EkV A00;
    public final /* synthetic */ EIE A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ HttpResponse A03;

    public G4s(EkV ekV, EIE eie, String str, HttpResponse httpResponse) {
        this.A03 = httpResponse;
        this.A00 = ekV;
        this.A02 = str;
        this.A01 = eie;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        r0 = new java.io.ByteArrayOutputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r0 = r0.read(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (r0 != (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        r0.write(r0, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        r0.closeEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        r0 = X.11T.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        r0 = r0.A02.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        r0 = X.C03r.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        r0 = X.DKC.A1a(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        r0 = javax.crypto.Mac.getInstance("HmacSHA256");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        r0.init(new javax.crypto.spec.SecretKeySpec(X.DKC.A1a("prepackaged", r0), "HmacSHA256"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
    
        r0 = X.C0B9.A00(r0.doFinal(r0), false).toLowerCase();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        X.11T.A0A(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        X.11T.A0F(r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        if (r0.equalsIgnoreCase(r0) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
    
        r0.A01.A00(r0, r0, X.C0ty.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0175, code lost:
    
        r305 = X.AnonymousClass001.A0N("Downloaded zip file does not have valid checksum");
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4s.run():void");
    }
}
