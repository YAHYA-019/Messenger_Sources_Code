package X;

import com.google.android.gms.auth.blockstore.StoreBytesData;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.1BH, reason: invalid class name */
/* loaded from: 1BH.class */
public final class C1BH implements 1xJ {
    public final /* synthetic */ 1xH A00;
    public final /* synthetic */ 0BJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;

    public C1BH(1xH r302, 0BJ r303, String str, byte[] bArr) {
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = r303;
        this.A00 = r302;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void Cit(Boolean bool) {
        11T.A0O(bool, true);
        Kt1 kt1 = new Kt1();
        kt1.A02(this.A03);
        kt1.A01(this.A02);
        StoreBytesData A00 = kt1.A00();
        final 0BJ r0 = this.A01;
        C4Ez D32 = 0BJ.A07(r0).D32(A00);
        final 1xH r02 = this.A00;
        D32.A08(new C51o() { // from class: X.1BG
            @Override // X.C51o
            public final void Bpv(final C4Ez c4Ez) {
                11T.A0F(c4Ez, 0);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r0.A01;
                final 1xH r03 = r02;
                scheduledThreadPoolExecutor.execute(new Runnable() { // from class: X.1BF
                    public static final String __redex_internal_original_name = "BlockStoreBackupHelper$backupByteArray$1$1$1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Exception A04;
                        1xH r305;
                        String message;
                        List A0M;
                        String str;
                        Integer A0d;
                        C19d c19d;
                        C4Ez c4Ez2 = c4Ez;
                        if (c4Ez2.A0E()) {
                            Object A05 = c4Ez2.A05();
                            11T.A0A(A05);
                            int A03 = AnonymousClass001.A03(A05);
                            r305 = r03;
                            if (A03 > 0) {
                                c19d = 0EI.A00;
                                r305.A04(c19d);
                            }
                            A04 = new Exception("Blockstore API reported complete, but no bytes written");
                        } else {
                            Exception A042 = c4Ez2.A04();
                            String str2 = null;
                            if (A042 != null && (message = A042.getMessage()) != null && (A0M = 0CU.A0M(message, new String[]{":"}, 0)) != null && (str = (String) 0QD.A0E(A0M)) != null && (A0d = 0CW.A0d(str, 10)) != null) {
                                int intValue = A0d.intValue();
                                if (intValue == 40002 || intValue == 17) {
                                    Exception A043 = c4Ez2.A04();
                                    if (A043 != null) {
                                        str2 = A043.getMessage();
                                    }
                                    A04 = new IOException(str2);
                                } else if (intValue == 40000) {
                                    Exception A044 = c4Ez2.A04();
                                    if (A044 != null) {
                                        str2 = A044.getMessage();
                                    }
                                    A04 = new IOException(str2);
                                } else if (intValue == 40001) {
                                    Exception A045 = c4Ez2.A04();
                                    if (A045 != null) {
                                        str2 = A045.getMessage();
                                    }
                                    A04 = new IOException(str2);
                                }
                                r305 = r03;
                            }
                            if (c4Ez2.A04() instanceof C3js) {
                                Exception A046 = c4Ez2.A04();
                                if (A046 != null) {
                                    str2 = A046.getMessage();
                                }
                                A04 = new IOException(str2);
                            } else {
                                A04 = c4Ez2.A04();
                            }
                            r305 = r03;
                        }
                        c19d = new C19d(A04);
                        r305.A04(c19d);
                    }
                });
            }
        });
    }
}
