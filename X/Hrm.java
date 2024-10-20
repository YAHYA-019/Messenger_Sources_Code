package X;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Hrm.class */
public final class Hrm {
    public final I0Y A00;
    public final /* synthetic */ I0Y A01;

    public Hrm(I0Y i0y, I0Y i0y2) {
        this.A01 = i0y;
        this.A00 = i0y2;
    }

    public void A00(HBM hbm, String str) {
        11T.A0F(str, 0);
        StringBuilder A0k = AnonymousClass001.A0k();
        GOq.A1J(A0k, this);
        A0k.append("]onDownloadFailed(");
        A0k.append(str);
        A0k.append(", ");
        0fH.A0j("E2EEStreamingDataSourceInternal", AnonymousClass002.A0K(hbm, A0k));
        I0Y i0y = this.A01;
        i0y.A0B.set(false);
        i0y.A0C.set(false);
        Object obj = i0y.A08;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public void A01(String str, Uri uri) {
        I0Y i0y;
        ImL imL;
        5L4 A01;
        5Ly r0;
        ImL imL2;
        StringBuilder A0k = AnonymousClass001.A0k();
        GOq.A1J(A0k, this);
        A0k.append("]onUriAvailable(");
        A0k.append(str);
        A0k.append(", ");
        0fH.A0j("E2EEStreamingDataSourceInternal", AnonymousClass002.A0K(uri, A0k));
        AtomicReference atomicReference = this.A00.A0H;
        if (((CharSequence) GOo.A0t(atomicReference)).length() <= 0 || str.length() <= 0 || str.equals(atomicReference.get())) {
            if ("file".equals(uri.getScheme())) {
                this.A01.A0D.set(true);
                StringBuilder A0k2 = AnonymousClass001.A0k();
                GOq.A1J(A0k2, this);
                A0k2.append("]onUriAvailable(");
                A0k2.append(uri);
                GOp.A1S(") - skip the player cache for local file", "E2EEStreamingDataSourceInternal", A0k2);
            }
            i0y = this.A01;
            if (i0y.A06 == null || (A01 = 5L4.A01()) == null || (r0 = A01.A02) == null) {
                imL = null;
            } else {
                imL = null;
                if (!TextUtils.isEmpty(uri.toString())) {
                    String scheme = uri.getScheme();
                    if ("file".equalsIgnoreCase(scheme)) {
                        imL2 = new ImL(r0.A08, r0.A0E.userAgent);
                    } else if ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) {
                        String str2 = r0.A0E.userAgent;
                        5LN r02 = r0.A0D;
                        imL2 = new 6Py((6Pz) null, str2, 5LN.A01(r02, 8), 5LN.A01(r02, 0));
                    }
                    imL = imL2;
                }
            }
            AtomicReference atomicReference2 = i0y.A0I;
            atomicReference2.set(imL);
            StringBuilder A0k3 = AnonymousClass001.A0k();
            GOq.A1J(A0k3, this);
            A0k3.append("]onUriAvailable(");
            A0k3.append(uri);
            A0k3.append(") - upstreamDataSource: ");
            Object obj = atomicReference2.get();
            0fH.A0j("E2EEStreamingDataSourceInternal", AnonymousClass001.A0a(obj != null ? 1BK.A0j(obj) : "null", A0k3));
            if (imL != null) {
                try {
                    AtomicLong atomicLong = i0y.A0F;
                    6DQ r03 = 6DQ.A0B;
                    AtomicReference atomicReference3 = i0y.A0G;
                    6DQ r04 = (6DQ) atomicReference3.get();
                    long j = r04 != null ? r04.A04 : 0L;
                    6DQ r05 = (6DQ) atomicReference3.get();
                    atomicLong.set(imL.CVO(new 6DQ(uri, new 6DO(), (String) null, Collections.emptyMap(), (byte[]) null, 1, 0, 0L, j, r05 != null ? r05.A03 : -1)));
                } catch (IOException e) {
                    StringBuilder A0k4 = AnonymousClass001.A0k();
                    GOq.A1J(A0k4, this);
                    A0k4.append("]onUriAvailable(");
                    A0k4.append(uri);
                    A0k4.append(") - failed to open - ");
                    GOp.A1S(e.getMessage(), "E2EEStreamingDataSourceInternal", A0k4);
                }
            }
        } else {
            StringBuilder A0k5 = AnonymousClass001.A0k();
            GOq.A1J(A0k5, this);
            0fH.A0j("E2EEStreamingDataSourceInternal", 1BL.A0u("]onUriAvailable() ignored due to downloadId mismatch - current: ", str, A0k5));
            i0y = this.A01;
        }
        i0y.A0C.set(false);
        Object obj2 = i0y.A08;
        synchronized (obj2) {
            obj2.notifyAll();
        }
    }
}
