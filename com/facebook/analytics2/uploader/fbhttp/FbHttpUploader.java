package com.facebook.analytics2.uploader.fbhttp;

import X.0fH;
import X.1BK;
import X.1BQ;
import X.1Rb;
import X.2yD;
import X.3LT;
import X.AnonymousClass001;
import X.C00i;
import X.C1fd;
import X.C2mT;
import X.C4Bb;
import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import java.util.HashSet;
import java.util.Set;

/* loaded from: FbHttpUploader.class */
public class FbHttpUploader implements 1Rb, CallerContextable {
    public static Set A09;
    public 3LT A00;
    public Boolean A01;
    public boolean A02;
    public boolean A03;
    public final C00i A08 = new 1BQ(84633);
    public final C00i A05 = new 1BQ(16385);
    public final C00i A06 = new 1BQ(16753);
    public final C00i A04 = new 1BQ(17093);
    public final C00i A07 = new 1BQ(16610);

    static {
        HashSet hashSet = new HashSet(1);
        hashSet.add("native_newsfeed");
        A09 = hashSet;
    }

    public FbHttpUploader(Context context) {
    }

    private void A00(C4Bb c4Bb, int i) {
        C1fd c1fd;
        boolean z;
        if (!this.A03) {
            C00i c00i = this.A05;
            boolean AZk = ((2yD) c00i.get()).AZk(36311448816782128L);
            this.A02 = AZk;
            if (AZk && 1BK.A0N(c00i).AZk(36311448817240885L)) {
                3LT r0 = new 3LT((C1fd) this.A06.get());
                boolean[] zArr = r0.A01;
                zArr[0] = 1BK.A0N(c00i).AZk(36311448816847665L);
                zArr[1] = 1BK.A0N(c00i).AZk(36311448816913202L);
                boolean[] zArr2 = r0.A02;
                zArr2[0] = 1BK.A0N(c00i).AZk(36311448816978739L);
                zArr2[1] = 1BK.A0N(c00i).AZk(36311448817044276L);
                this.A00 = r0;
            }
            this.A03 = true;
        }
        if (this.A02) {
            int i2 = 0;
            do {
                3LT r02 = this.A00;
                if (r02 == null) {
                    return;
                }
                if (!(c4Bb.A01.intValue() != 1 ? r02.A02 : r02.A01)[i] || !r02.A00.A01 || !A09.contains(((C2mT) this.A04.get()).A02())) {
                    return;
                }
                3LT r03 = this.A00;
                if (r03 != null && (c1fd = r03.A00) != null) {
                    Object obj = c1fd.A02;
                    synchronized (obj) {
                        z = true;
                        if (c1fd.A01) {
                            0fH.A0j(c1fd.A03, "wait indefinitely until state is off");
                            do {
                                try {
                                    obj.wait();
                                } catch (InterruptedException unused) {
                                    AnonymousClass001.A13();
                                    z = false;
                                }
                            } while (c1fd.A01);
                            C1fd.A00(c1fd);
                        }
                    }
                    if (!z) {
                        return;
                    }
                }
                i2++;
            } while (i2 < 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw r301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(X.C4Bb r302, X.C4Bq r303, X.C04033zm r304) {
        /*
            r301 = this;
            r0 = r302
            X.4BS r0 = r0.A00
            r305 = r0
            r0 = r301
            X.00i r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.1Rl r0 = (X.1Rl) r0
            r306 = r0
            java.lang.Class<com.facebook.analytics2.uploader.fbhttp.FbHttpUploader> r0 = com.facebook.analytics2.uploader.fbhttp.FbHttpUploader.class
            r307 = r0
            java.lang.String r0 = "MAGIC_LOGOUT_TAG"
            r308 = r0
            r0 = r307
            r1 = r308
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A09(r0, r1)     // Catch: java.lang.Exception -> L38 java.util.concurrent.CancellationException -> L54 java.io.IOException -> L6b
            r308 = r0
            r0 = r306
            r1 = r308
            r2 = r303
            r3 = r304
            r4 = r305
            java.lang.Object r0 = r0.A07(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L38 java.util.concurrent.CancellationException -> L54 java.io.IOException -> L6b
            r0 = r301
            r1 = r302
            r2 = 1
            r0.A00(r1, r2)
            return
        L38:
            r308 = move-exception
            r0 = r308
            com.google.common.base.Throwables.throwIfUnchecked(r0)
            java.io.IOException r0 = new java.io.IOException
            r307 = r0
            r0 = r307
            r0.<init>()
            r0 = r307
            r1 = r308
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r307
            throw r0
        L54:
            r308 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r307 = r0
            r0 = r307
            r0.<init>()
            r0 = r307
            r1 = r308
            java.lang.Throwable r0 = r0.initCause(r1)
            r0 = r307
            throw r0
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics2.uploader.fbhttp.FbHttpUploader.A01(X.4Bb, X.4Bq, X.3zm):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x02a4, code lost:
    
        if (r313.BNB() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02a7, code lost:
    
        r313.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02ae, code lost:
    
        r302.A01.Bxc(r304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x028d, code lost:
    
        if (r313.BNB() == false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D8S(X.C4Bc r302, X.C4Bb r303) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics2.uploader.fbhttp.FbHttpUploader.D8S(X.4Bc, X.4Bb):void");
    }
}
