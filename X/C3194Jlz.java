package X;

import android.content.ContentValues;
import android.util.Pair;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherCryptoHelper;
import com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.Jlz, reason: case insensitive filesystem */
/* loaded from: Jlz.class */
public final class C3194Jlz extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$14";
    public final /* synthetic */ AuthenticationResult A00;
    public final /* synthetic */ Ezc A01;
    public final /* synthetic */ EnC A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3194Jlz(AuthenticationResult authenticationResult, Ezc ezc, EnC enC, Class cls) {
        super(cls, "SwitchAccountThreadsDbCacher", "restoreThreadsDb");
        this.A01 = ezc;
        this.A00 = authenticationResult;
        this.A02 = enC;
    }

    public void A02() {
        Object obj;
        C5ck c5ck = (C5ck) this.A01.A0x.get();
        AuthenticationResult authenticationResult = this.A00;
        if (c5ck.A07.get() != C0et.A0U) {
            String str = ((AuthenticationResultImpl) authenticationResult).A03;
            if (1Oy.A00(C0f1.A00()).getBoolean("ShouldCacheThreadsDB".concat(str), false)) {
                String str2 = c5ck.A09;
                File file = new File(0Pz.A0v(str2, "-", str, ".enc"));
                if (file.exists()) {
                    C00i c00i = c5ck.A02;
                    ((ThreadsDbCacherCryptoHelper) c00i.get()).A03();
                    try {
                        byte[] andDecryptStoredThreadsDbCacherKey = ((ThreadsDbCacherCryptoHelper) c00i.get()).getAndDecryptStoredThreadsDbCacherKey(str);
                        try {
                            File file2 = new File(str2);
                            ThreadsDbCacherCryptoHelper threadsDbCacherCryptoHelper = (ThreadsDbCacherCryptoHelper) c00i.get();
                            synchronized (threadsDbCacherCryptoHelper) {
                                1aF r0 = new 1aF(((AbR) threadsDbCacherCryptoHelper.A00.get()).A0R(andDecryptStoredThreadsDbCacherKey), new 1UR(), 0S2.A01);
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
                                        try {
                                            H8r A00 = r0.A00(ThreadsDbCacherCryptoHelper.A02, fileInputStream);
                                            try {
                                                ThreadsDbCacherCryptoHelper.A00(A00, byteArrayOutputStream);
                                                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                                                A00.close();
                                                byteArrayOutputStream.close();
                                                fileOutputStream.close();
                                                fileInputStream.close();
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            if (file2.length() > 0) {
                                byte[] A02 = ThreadsDbCacherCryptoHelper.A02(str, 4YT.A00(180), andDecryptStoredThreadsDbCacherKey);
                                long j = -1;
                                long A002 = A02 != null ? C1uK.A00(A02) : -1;
                                byte[] A022 = ThreadsDbCacherCryptoHelper.A02(str, "sync_token", andDecryptStoredThreadsDbCacherKey);
                                if (A022 != null) {
                                    new String(A022);
                                } else {
                                    obj = null;
                                }
                                byte[] A023 = ThreadsDbCacherCryptoHelper.A02(str, "last_get_threads_time_client_ms", andDecryptStoredThreadsDbCacherKey);
                                long A003 = A023 != null ? C1uK.A00(A023) : -1;
                                byte[] A024 = ThreadsDbCacherCryptoHelper.A02(str, "is_threads_table_out_of_date", andDecryptStoredThreadsDbCacherKey);
                                boolean z = false;
                                if (A024 == null || A024.length != 1 || A024[0] == 1) {
                                    z = true;
                                }
                                if (A002 != j && obj != null && A003 != j) {
                                    ((6EC) c5ck.A05.get()).A01(A002);
                                    6E9 r02 = (6E9) c5ck.A03.get();
                                    Pair A0G = GOn.A0G(AbstractC11664x8.A08, obj);
                                    1F9 r03 = 1F9.A0I;
                                    Pair A0G2 = GOn.A0G(AbstractC11664x8.A01(r03), String.valueOf(A003));
                                    Pair A0G3 = GOn.A0G(AbstractC11664x8.A00(r03), String.valueOf(z));
                                    if (((C09794rj) c5ck.A06.get()).A00) {
                                        ImmutableList of = ImmutableList.of((Object) A0G, (Object) A0G2, (Object) A0G3);
                                        ContentValues[] contentValuesArr = new ContentValues[of.size()];
                                        int i = 0;
                                        while (true) {
                                            if (i >= of.size()) {
                                                break;
                                            }
                                            ContentValues contentValues = new ContentValues();
                                            contentValuesArr[i] = contentValues;
                                            contentValues.put("key", ((1G3) ((Pair) of.get(i)).first).A08());
                                            contentValuesArr[i].put("value", (String) ((Pair) of.get(i)).second);
                                            i++;
                                        }
                                        r02.A00.bulkInsert(r02.A01, contentValuesArr);
                                    } else {
                                        r02.A03((1G3) A0G.first, (String) A0G.second);
                                        r02.A03((1G3) A0G2.first, (String) A0G2.second);
                                        r02.A03((1G3) A0G3.first, (String) A0G3.second);
                                    }
                                }
                                ((1Uv) c5ck.A04.get()).A06();
                            }
                        } catch (IOException | 2LB e) {
                            0fH.A0s("SwitchAccountThreadsDbCacher", "Cannot decrypt and restore threads db! ", e);
                        }
                    } catch (ThreadsDbCacherCryptoHelper.DEKNotAvailableException | ThreadsDbCacherCryptoHelper.ThreadsDbCacherKeyNotAvailableException e2) {
                        0fH.A0s("SwitchAccountThreadsDbCacher", "Cannot get crypto key!", e2);
                        c00i.get();
                    }
                }
                file.delete();
                c5ck.A02.get();
                1VU r04 = ThreadsDbCacherCryptoHelper.A02;
                ThreadsDbCacherDEKConfigureSetter.A00();
            }
        }
    }
}
