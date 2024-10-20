package com.facebook.messaging.database.threads.switchaccountcacher;

import X.0fH;
import X.1BQ;
import X.1BV;
import X.1VU;
import X.5Xg;
import X.C00i;
import com.facebook.common.dextricks.Constants;
import com.facebook.messenger.securemessage.utils.CryptoProviderHelper;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: ThreadsDbCacherCryptoHelper.class */
public class ThreadsDbCacherCryptoHelper {
    public static final 1VU A02 = new 1VU("".getBytes(1VU.A01));
    public final C00i A01 = 1BQ.A02(65742);
    public final C00i A00 = 1BV.A00(909);

    /* loaded from: ThreadsDbCacherCryptoHelper$DEKNotAvailableException.class */
    public class DEKNotAvailableException extends RuntimeException {
    }

    /* loaded from: ThreadsDbCacherCryptoHelper$ThreadsDbCacherKeyNotAvailableException.class */
    public class ThreadsDbCacherKeyNotAvailableException extends RuntimeException {
    }

    public static void A00(InputStream inputStream, OutputStream outputStream) {
        synchronized (ThreadsDbCacherCryptoHelper.class) {
            byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                }
            }
        }
    }

    public static void A01(String str, String str2, byte[] bArr, byte[] bArr2) {
        synchronized (ThreadsDbCacherCryptoHelper.class) {
            bArr.getClass();
            byte[] createCbcHmacEncryptedDataHandler = CryptoProviderHelper.createCbcHmacEncryptedDataHandler(bArr, bArr2);
            if (createCbcHmacEncryptedDataHandler != null) {
                5Xg.A04(str, str2, createCbcHmacEncryptedDataHandler);
            } else {
                0fH.A17("ThreadsDbCacherCryptoHelper", "Skip writing encrypted data with key %s into sharedPrefs", new Object[]{str2});
            }
        }
    }

    public static byte[] A02(String str, String str2, byte[] bArr) {
        byte[] createCbcHmacDecryptedDataHandler;
        synchronized (ThreadsDbCacherCryptoHelper.class) {
            byte[] A06 = 5Xg.A06(str, str2);
            createCbcHmacDecryptedDataHandler = A06 != null ? CryptoProviderHelper.createCbcHmacDecryptedDataHandler(A06, bArr) : null;
        }
        return createCbcHmacDecryptedDataHandler;
    }

    public static void clearThreadsDbCacherKey(String str) {
        synchronized (ThreadsDbCacherCryptoHelper.class) {
            5Xg.A03(str, "threads_db_cacher_key");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v4 ??, still in use, count: 2, list:
          (r302v4 ??) from 0x002a: PHI (r302v3 ??) = (r302v2 ??), (r302v4 ??) binds: [B:12:0x001b, B:16:0x0027] A[DONT_GENERATE, DONT_INLINE]
          (r302v4 ?? I:com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter) from 0x0027: SPUT (r302v4 ?? I:com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter) A[Catch: all -> 0x0032] com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter.A00 com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void A03() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A01     // Catch: java.lang.Throwable -> L37 java.lang.Throwable -> L37
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L37
            r303 = r0
            r0 = r303
            com.facebook.crypto.module.LoggedInUserCrypto r0 = (com.facebook.crypto.module.LoggedInUserCrypto) r0     // Catch: java.lang.Throwable -> L37 java.lang.Throwable -> L37
            r303 = r0
            java.lang.Class<com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter> r0 = com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter.class
            r304 = r0
            r0 = r304
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Throwable -> L37
            com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter r0 = com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter.A00     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L37 java.lang.Throwable -> L37
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2a
            com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter r0 = new com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter     // Catch: java.lang.Throwable -> L32
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            r0 = r302
            com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherDEKConfigureSetter.A00 = r0     // Catch: java.lang.Throwable -> L32
        L2a:
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Throwable -> L37
            r0 = r303
            r1 = r302
            r0.A02(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Throwable -> L37
            return
        L32:
            r302 = move-exception
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Throwable -> L37
            r0 = r302
            throw r0     // Catch: java.lang.Throwable -> L37 java.lang.Throwable -> L37
        L37:
            r303 = move-exception
            java.lang.String r0 = "ThreadsDbCacherCryptoHelper"
            java.lang.String r1 = "Cannot configure DEK!"
            r2 = r303
            X.0fH.A0s(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherCryptoHelper.A03():void");
    }

    public byte[] generateAndSaveNewThreadsDbCacherKey(String str) {
        byte[] bArr;
        byte[] bArr2;
        synchronized (this) {
            synchronized (ThreadsDbCacherDEKConfigureSetter.class) {
                try {
                    bArr = ThreadsDbCacherDEKConfigureSetter.A01;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            if (bArr.length == 0) {
                new RuntimeException("Cannot get DEK");
                throw th;
            }
            bArr2 = new byte[32];
            CryptoProviderHelper.generateRandomBytes(bArr2);
            A01(str, "threads_db_cacher_key", bArr2, bArr);
        }
        return bArr2;
    }

    public byte[] getAndDecryptStoredThreadsDbCacherKey(String str) {
        byte[] bArr;
        byte[] A022;
        synchronized (this) {
            synchronized (ThreadsDbCacherDEKConfigureSetter.class) {
                try {
                    bArr = ThreadsDbCacherDEKConfigureSetter.A01;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            if (bArr.length != 0) {
                A022 = A02(str, "threads_db_cacher_key", bArr);
                if (A022 == null || A022.length != 32) {
                    new RuntimeException("Cannot get threads db cacher key");
                }
            } else {
                new RuntimeException("Cannot get DEK");
            }
            throw th;
        }
        return A022;
    }
}
