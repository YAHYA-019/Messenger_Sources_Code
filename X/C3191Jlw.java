package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherCryptoHelper;
import com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Jlw, reason: case insensitive filesystem */
/* loaded from: Jlw.class */
public final class C3191Jlw extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$52";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ EnC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3191Jlw(Ezc ezc, EnC enC, QuickPerformanceLogger quickPerformanceLogger, Class cls, AtomicInteger atomicInteger) {
        super(quickPerformanceLogger, cls, "BeforeLogout", "SwitchAccountThreadsDbCacher", "saveThreadsDb", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, atomicInteger, 9699331, true);
        this.A00 = ezc;
        this.A01 = enC;
    }

    public void A02() {
        C5ck c5ck = (C5ck) this.A00.A0x.get();
        if (c5ck.A07.get() != C0et.A0U) {
            String str = c5ck.A01.A02;
            boolean z = ((C09794rj) c5ck.A06.get()).A03;
            InterfaceC00051a0 AP5 = 1Oy.A00(C0f1.A00()).AP5();
            AP5.Ca2("ShouldCacheThreadsDB".concat(str), z);
            AP5.apply();
            if (z) {
                C00i c00i = c5ck.A02;
                ((ThreadsDbCacherCryptoHelper) c00i.get()).A03();
                try {
                    byte[] generateAndSaveNewThreadsDbCacherKey = ((ThreadsDbCacherCryptoHelper) c00i.get()).generateAndSaveNewThreadsDbCacherKey(str);
                    try {
                        ThreadsDbCacherCryptoHelper threadsDbCacherCryptoHelper = (ThreadsDbCacherCryptoHelper) c00i.get();
                        String str2 = c5ck.A09;
                        File file = new File(str2);
                        File file2 = new File(0Pz.A0v(str2, "-", str, ".enc"));
                        synchronized (threadsDbCacherCryptoHelper) {
                            1aF r0 = new 1aF(((AbR) threadsDbCacherCryptoHelper.A00.get()).A0R(generateAndSaveNewThreadsDbCacherKey), new 1UR(), 0S2.A01);
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    3DK A01 = r0.A01(ThreadsDbCacherCryptoHelper.A02, fileOutputStream);
                                    try {
                                        ThreadsDbCacherCryptoHelper.A00(fileInputStream, A01);
                                        A01.close();
                                        fileOutputStream.close();
                                        fileInputStream.close();
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                        ThreadsDbCacherCryptoHelper.A01(str, 4YT.A00(180), C1uK.A02(((6EC) c5ck.A05.get()).A00()), generateAndSaveNewThreadsDbCacherKey);
                        C00i c00i2 = c5ck.A03;
                        ThreadsDbCacherCryptoHelper.A01(str, "sync_token", ((6E9) c00i2.get()).A01(AbstractC11664x8.A08).getBytes(), generateAndSaveNewThreadsDbCacherKey);
                        6E9 r02 = (6E9) c00i2.get();
                        1F9 r03 = 1F9.A0I;
                        ThreadsDbCacherCryptoHelper.A01(str, "last_get_threads_time_client_ms", C1uK.A02(r02.A00(AbstractC11664x8.A01(r03))), generateAndSaveNewThreadsDbCacherKey);
                        boolean A04 = r02.A04(AbstractC11664x8.A00(r03), true);
                        byte[] bArr = new byte[1];
                        bArr[0] = A04 ? (byte) 1 : (byte) 0;
                        ThreadsDbCacherCryptoHelper.A01(str, "is_threads_table_out_of_date", bArr, generateAndSaveNewThreadsDbCacherKey);
                    } catch (IOException | 2LB e) {
                        0fH.A0s("SwitchAccountThreadsDbCacher", "Cannot encrypt and save threads db! ", e);
                    }
                    c00i.get();
                    ThreadsDbCacherDEKConfigureSetter.A00();
                } catch (ThreadsDbCacherCryptoHelper.DEKNotAvailableException e2) {
                    0fH.A0s("SwitchAccountThreadsDbCacher", "Cannot get crypto key!", e2);
                    c00i.get();
                    ThreadsDbCacherDEKConfigureSetter.A00();
                }
                ((L2E) c5ck.A08.get()).A01();
            }
        }
    }
}
