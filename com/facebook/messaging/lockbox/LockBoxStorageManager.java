package com.facebook.messaging.lockbox;

import X.0BG;
import X.0BH;
import X.0BI;
import X.0BJ;
import X.0BK;
import X.0CL;
import X.0CU;
import X.0CW;
import X.0EI;
import X.0EJ;
import X.0Q8;
import X.0QD;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1xH;
import X.1xJ;
import X.28B;
import X.36N;
import X.3Ek;
import X.3Go;
import X.3JY;
import X.3Kh;
import X.3Ki;
import X.3lS;
import X.AnonymousClass001;
import X.AnonymousClass289;
import X.AnonymousClass290;
import X.AnonymousClass291;
import X.AnonymousClass293;
import X.AnonymousClass296;
import X.AnonymousClass297;
import X.AnonymousClass299;
import X.C00i;
import X.C03r;
import X.C19d;
import X.C19k;
import X.C1B7;
import X.C1B8;
import X.C1B9;
import X.C1BA;
import X.C1BB;
import X.C27u;
import X.C27w;
import X.C27y;
import X.C28z;
import X.C3Vn;
import X.C3Vr;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.messaging.lockbox.LockBoxStorageManager;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: LockBoxStorageManager.class */
public final class LockBoxStorageManager {
    public static final LockBoxStorageManager INSTANCE = new Object();
    public static C28z backupManager;
    public static volatile boolean blockStoreAvailable;
    public static AnonymousClass299 keyParser;
    public static AnonymousClass297 lockBoxEntryLogger;
    public static volatile boolean lockBoxInitializeCalled;
    public static 3lS logger;
    public static AnonymousClass293 shareKeyRetrieve;
    public static SharedPreferences sharedPreferences;

    public static final Integer A00(String str) {
        Integer num;
        Object obj;
        11T.A0F(str, 0);
        Integer[] A00 = 0S2.A00(5);
        int length = A00.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < length) {
                num = A00[i2];
                switch (num.intValue()) {
                    case 1:
                        obj = "com.facebook.katana";
                        break;
                    case 2:
                        obj = "com.facebook.wakizashi";
                        break;
                    case 3:
                        obj = "com.facebook.orca";
                        break;
                    case 4:
                        obj = "com.facebook.lite";
                        break;
                    default:
                        obj = "";
                        break;
                }
                if (!obj.equals(str)) {
                    i = i2 + 1;
                }
            } else {
                num = null;
            }
        }
        return num;
    }

    private final void checkIsRunningOnMainThread(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final 1xH getRecoveryCodeFromLegacyLocation(String str) {
        1xH r0 = new 1xH();
        C28z c28z = backupManager;
        if (c28z == null) {
            11T.A0L("backupManager");
            throw 0Q8.createAndThrow();
        }
        3Ek r02 = 3Ek.A03;
        11T.A0F(str, 0);
        0BK r03 = c28z.A00;
        new 1xH();
        r03.A00.A0A(r02, str).A03(new C3Vn(str, r0, 1));
        return r0;
    }

    private final String getValueFromSharedPreferences(String str) {
        synchronized (this) {
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                11T.A0L("sharedPreferences");
            } else {
                if (!sharedPreferences2.contains(str)) {
                    return null;
                }
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 != null) {
                    return sharedPreferences3.getString(str, "");
                }
                11T.A0L("sharedPreferences");
            }
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.27w, X.27y] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.0BH] */
    public static final void initialize(Context context) {
        synchronized (LockBoxStorageManager.class) {
            11T.A0F(context, 0);
            LockBoxStorageManager lockBoxStorageManager = INSTANCE;
            lockBoxInitializeCalled = true;
            if (backupManager == null) {
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                11T.A0A(googleApiAvailability);
                if (new 0BG(googleApiAvailability).A00(context)) {
                    C28z c28z = new C28z(new 0BK(new 0BJ(new 0BI((0BH) new Object()), (C27y) new C27w(context, (AnonymousClass289) AnonymousClass289.A00, C27u.A00, 28B.A02))));
                    Map map = AnonymousClass290.A00;
                    11T.A0F(map, 1);
                    AnonymousClass293 anonymousClass293 = new AnonymousClass293(context, map);
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("LockBoxStorageManager", 0);
                    11T.A0A(sharedPreferences2);
                    sharedPreferences = sharedPreferences2;
                    lockBoxStorageManager.initialize(c28z, anonymousClass293);
                }
            }
        }
    }

    public static final boolean lockBoxDeleteDeviceSecret(String str) {
        11T.A0F(str, 0);
        return lockBoxDeleteSecret("DU", str);
    }

    public static final boolean lockBoxDeleteSecret(String str, String str2) {
        11T.A0H(str, str2);
        1xH lockBoxDeleteSecretAsync = lockBoxDeleteSecretAsync(str, str2);
        try {
            lockBoxDeleteSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        Object obj = lockBoxDeleteSecretAsync.A00;
        11T.A0A(obj);
        return AnonymousClass001.A1V(obj);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.0CL] */
    public static final 1xH lockBoxDeleteSecretAsync(String str, String str2) {
        1BK.A1M(str, str2);
        1xH r0 = new 1xH();
        ?? obj = new Object();
        ((0CL) obj).element = str2;
        Object obj2 = AnonymousClass290.A02.get(str2);
        if (obj2 != null) {
            ((0CL) obj).element = obj2;
        }
        if (backupManager == null) {
            r0.A04(false);
            return r0;
        }
        3lS r02 = logger;
        if (r02 != null) {
            r02.ATN("LOCK_BOX_DELETE_SECRET_START");
        }
        INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A03(new C3Vr(r0, str, obj, 0));
        return r0;
    }

    public static final String lockBoxGetDeviceSecret(String str) {
        11T.A0F(str, 0);
        return lockBoxGetSecret("DU", str);
    }

    public static final String lockBoxGetLocalSecret(String str, String str2) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        1xH lockBoxGetLocalSecretAsync = lockBoxGetLocalSecretAsync(str, str2);
        try {
            lockBoxGetLocalSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        return (String) lockBoxGetLocalSecretAsync.A00;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.0CL] */
    public static final 1xH lockBoxGetLocalSecretAsync(final String str, final String str2) {
        int ordinal;
        String valueFromSharedPreferences;
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        final 1xH r0 = new 1xH();
        final ?? obj = new Object();
        ((0CL) obj).element = str2;
        Object obj2 = AnonymousClass290.A02.get(str2);
        if (obj2 != null) {
            ((0CL) obj).element = obj2;
        }
        if (!blockStoreAvailable && lockBoxInitializeCalled) {
            String str3 = (String) ((0CL) obj).element;
            11T.A0F(str3, 0);
            AnonymousClass291 A00 = 3Go.A00(str3);
            if (A00 != null && ((ordinal = A00.ordinal()) == 1 || ordinal == 2)) {
                String A0b = AnonymousClass001.A0b(3Go.A00((String) ((0CL) obj).element), AnonymousClass290.A01);
                if (A0b != null && (valueFromSharedPreferences = INSTANCE.getValueFromSharedPreferences(A0b)) != null) {
                    r0.A04(valueFromSharedPreferences);
                    return r0;
                }
                r0.A02();
                return r0;
            }
        }
        if (backupManager != null) {
            INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A03(new 1xJ() { // from class: X.3Vp
                public /* bridge */ /* synthetic */ void Cit(Object obj3) {
                    JSONObject jSONObject;
                    1xH recoveryCodeFromLegacyLocation;
                    3Ki r02 = (3Ki) obj3;
                    String str4 = null;
                    if (r02 != null && r02.A00 == null && (jSONObject = r02.A01) != null) {
                        str4 = jSONObject.optString((String) obj.element);
                        if ((str4 == null || str4.length() == 0) && 11T.A0O(str2, "rc")) {
                            recoveryCodeFromLegacyLocation = LockBoxStorageManager.INSTANCE.getRecoveryCodeFromLegacyLocation(str);
                            recoveryCodeFromLegacyLocation.A03(new C3Vk(r0, 2));
                            return;
                        }
                    }
                    LockBoxStorageManager.INSTANCE.nullableComplete(r0, str4);
                }
            });
            return r0;
        }
        0fH.A0j("LockBoxStorageManager", "Backup Manager Not Initialized - Get Secret");
        r0.A02();
        return r0;
    }

    public static final String lockBoxGetRemoteSecret(String str, String str2) {
        return INSTANCE.lockBoxGetRemoteSecret(str, str2, 1BL.A1W(str, str2));
    }

    private final String lockBoxGetRemoteSecret(String str, String str2, boolean z) {
        String A0b;
        if (z && (A0b = AnonymousClass001.A0b(str2, AnonymousClass290.A02)) != null) {
            str2 = A0b;
        }
        String str3 = null;
        if (3Go.A00(str2) != null) {
            3lS r0 = logger;
            if (r0 != null) {
                r0.ATN("LOCK_BOX_GET_REMOTE_SECRET_START");
            }
            AnonymousClass293 anonymousClass293 = shareKeyRetrieve;
            if (anonymousClass293 == null) {
                11T.A0L("shareKeyRetrieve");
                throw 0Q8.createAndThrow();
            }
            36N r02 = (36N) 0QD.A08(anonymousClass293.A00(str, str2));
            if (r02 != null) {
                str3 = r02.A01;
            }
            3lS r03 = logger;
            if (r03 != null) {
                r03.ATN("LOCK_BOX_GET_REMOTE_SECRET_END");
            }
            3lS r04 = logger;
            if (r04 != null) {
                r04.ATN("LOCK_BOX_GET_SECRET_END");
            }
        }
        return str3;
    }

    public static final 3Kh lockBoxGetRemoteSecretWithSource(String str, String str2) {
        return INSTANCE.lockBoxGetRemoteSecretWithSource(str, str2, 1BL.A1W(str, str2));
    }

    private final 3Kh lockBoxGetRemoteSecretWithSource(String str, String str2, boolean z) {
        Integer A00;
        String A0b;
        if (z && (A0b = AnonymousClass001.A0b(str2, AnonymousClass290.A02)) != null) {
            str2 = A0b;
        }
        if (3Go.A00(str2) == null) {
            return null;
        }
        3lS r0 = logger;
        if (r0 != null) {
            r0.ATN("LOCK_BOX_GET_REMOTE_SECRET_START");
        }
        AnonymousClass293 anonymousClass293 = shareKeyRetrieve;
        if (anonymousClass293 == null) {
            11T.A0L("shareKeyRetrieve");
            throw 0Q8.createAndThrow();
        }
        36N r02 = (36N) 0QD.A08(anonymousClass293.A00(str, str2));
        3lS r03 = logger;
        if (r03 != null) {
            r03.ATN("LOCK_BOX_GET_REMOTE_SECRET_END");
        }
        if (r02 == null) {
            return null;
        }
        String str3 = r02.A01;
        if (str3.length() <= 0 || (A00 = A00(r02.A00)) == null) {
            return null;
        }
        3lS r04 = logger;
        if (r04 != null) {
            r04.ATN("LOCK_BOX_GET_SECRET_END");
        }
        return new 3Kh(str3, A00);
    }

    public static final Set lockBoxGetRemoteSecretsWithSource(String str, String str2) {
        Set lockBoxGetRemoteSecretsWithSource;
        synchronized (LockBoxStorageManager.class) {
            lockBoxGetRemoteSecretsWithSource = INSTANCE.lockBoxGetRemoteSecretsWithSource(str, str2, 1BL.A1W(str, str2));
        }
        return lockBoxGetRemoteSecretsWithSource;
    }

    private final Set lockBoxGetRemoteSecretsWithSource(String str, String str2, boolean z) {
        Integer A00;
        String A0b;
        if (z && (A0b = AnonymousClass001.A0b(str2, AnonymousClass290.A02)) != null) {
            str2 = A0b;
        }
        if (3Go.A00(str2) == null) {
            return null;
        }
        3lS r0 = logger;
        if (r0 != null) {
            r0.ATN("LOCK_BOX_GET_REMOTE_SECRET_START");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AnonymousClass293 anonymousClass293 = shareKeyRetrieve;
        if (anonymousClass293 == null) {
            11T.A0L("shareKeyRetrieve");
            throw 0Q8.createAndThrow();
        }
        LinkedHashSet<36N> A002 = anonymousClass293.A00(str, str2);
        3lS r02 = logger;
        if (r02 != null) {
            r02.ATN("LOCK_BOX_GET_REMOTE_SECRET_END");
        }
        for (36N r03 : A002) {
            if (r03 != null) {
                String str3 = r03.A01;
                if (str3.length() > 0 && (A00 = A00(r03.A00)) != null) {
                    linkedHashSet.add(new 3Kh(str3, A00));
                }
            }
        }
        3lS r04 = logger;
        if (r04 != null) {
            r04.ATN("LOCK_BOX_GET_SECRET_END");
        }
        return linkedHashSet;
    }

    public static final String lockBoxGetSecret(String str, String str2) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        LockBoxStorageManager lockBoxStorageManager = INSTANCE;
        3lS r0 = logger;
        if (r0 != null) {
            r0.ATN("LOCK_BOX_GET_SECRET_START");
        }
        String str3 = (String) AnonymousClass290.A02.get(str2);
        if (str3 != null) {
            str2 = str3;
        }
        String lockBoxGetLocalSecret = lockBoxGetLocalSecret(str, str2);
        boolean z = true;
        if (lockBoxGetLocalSecret == null || lockBoxGetLocalSecret.length() <= 0) {
            z = false;
        }
        if (z) {
            3lS r02 = logger;
            if (r02 != null) {
                r02.ATN("LOCK_BOX_GET_SECRET_END");
            }
            return lockBoxGetLocalSecret;
        }
        if (3Go.A00(str2) != null) {
            return lockBoxStorageManager.lockBoxGetRemoteSecret(str, str2, false);
        }
        3lS r03 = logger;
        if (r03 == null) {
            return null;
        }
        r03.ATN("LOCK_BOX_GET_SECRET_END");
        return null;
    }

    public static final 3Kh lockBoxGetSecretWithSource(String str, String str2) {
        11T.A0H(str, str2);
        1xH lockBoxGetSecretWithSourceAsync = lockBoxGetSecretWithSourceAsync(str, str2);
        try {
            lockBoxGetSecretWithSourceAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        return (3Kh) lockBoxGetSecretWithSourceAsync.A00;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.0CL] */
    public static final 1xH lockBoxGetSecretWithSourceAsync(String str, String str2) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        1xH r0 = new 1xH();
        ?? obj = new Object();
        ((0CL) obj).element = str2;
        Object obj2 = AnonymousClass290.A02.get(str2);
        if (obj2 != null) {
            ((0CL) obj).element = obj2;
        }
        3lS r02 = logger;
        if (r02 != null) {
            r02.ATN("LOCK_BOX_GET_SECRET_START");
        }
        lockBoxGetLocalSecretAsync(str, (String) ((0CL) obj).element).A03(new C3Vr(r0, str, obj, 1));
        return r0;
    }

    private final 1xH lockBoxGetSecretsJsonForOwnerAsync(String str) {
        final 1xH r0 = new 1xH();
        3lS r02 = logger;
        if (r02 != null) {
            r02.ATN("LOCK_BOX_GET_JSON_SECRET_START");
        }
        C28z c28z = backupManager;
        if (c28z == null) {
            11T.A0L("backupManager");
            throw 0Q8.createAndThrow();
        }
        3Ek r03 = 3Ek.A02;
        11T.A0F(str, 0);
        0BK r04 = c28z.A00;
        new 1xH();
        r04.A00.A0A(r03, str).A03(new 1xJ() { // from class: X.3Vi
            public /* bridge */ /* synthetic */ void Cit(Object obj) {
                3Ki parseToJsonResult;
                parseToJsonResult = LockBoxStorageManager.INSTANCE.parseToJsonResult((C1BB) obj);
                3lS r05 = LockBoxStorageManager.logger;
                if (r05 != null) {
                    r05.ATN("LOCK_BOX_GET_JSON_SECRET_END");
                }
                r0.A04(parseToJsonResult);
            }
        });
        return r0;
    }

    public static final boolean lockBoxIsAvailable() {
        return blockStoreAvailable;
    }

    public static final int lockBoxSaveDeviceSecret(String str, String str2) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        return lockBoxSaveSecret("DU", str, str2);
    }

    public static final int lockBoxSaveSecret(String str, String str2, String str3) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        11T.A0F(str3, 2);
        1xH lockBoxSaveSecretAsync = lockBoxSaveSecretAsync(str, str2, str3);
        try {
            lockBoxSaveSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        Object obj = lockBoxSaveSecretAsync.A00;
        11T.A0A(obj);
        return ((Number) obj).intValue();
    }

    public static final 1xH lockBoxSaveSecretAsync(String str, String str2, String str3) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        11T.A0F(str3, 2);
        return lockBoxSaveSecretAsync(str, str2, str3, keyParser != null ? 0CW.A0e(str) != null ? new 3JY() { // from class: X.37h
        } : str.equals("DU") ? new 3JY() { // from class: X.37e
        } : new 3JY(str) : new 3JY() { // from class: X.37f
        });
    }

    public static final 1xH lockBoxSaveSecretAsync(final String str, final String str2, final String str3, 3JY r304) {
        int ordinal;
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        11T.A0F(str3, 2);
        11T.A0F(r304, 3);
        final 1xH r0 = new 1xH();
        if (backupManager != null) {
            AnonymousClass297 anonymousClass297 = lockBoxEntryLogger;
            if (anonymousClass297 != null) {
                AnonymousClass296 anonymousClass296 = (AnonymousClass296) anonymousClass297;
                C00i c00i = anonymousClass296.A01.A00;
                UserFlowLogger userFlowLogger = (UserFlowLogger) c00i.get();
                long j = anonymousClass296.A00;
                userFlowLogger.flowStart(j, new UserFlowConfig("lockbox", false));
                ((UserFlowLogger) c00i.get()).flowAnnotate(j, "KEY", r304.A00);
            }
            3lS r02 = logger;
            if (r02 != null) {
                r02.ATN("LOCK_BOX_SAVE_SECRET_START");
            }
            INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A03(new 1xJ() { // from class: X.3Vq
                /* JADX WARN: Type inference failed for: r0v37, types: [X.36U, X.1Az, java.lang.Object] */
                public /* bridge */ /* synthetic */ void Cit(Object obj) {
                    JSONObject jSONObject;
                    3Ki r03 = (3Ki) obj;
                    Integer num = null;
                    if (r03 == null || r03.A00 != null || (jSONObject = r03.A01) == null) {
                        LockBoxStorageManager lockBoxStorageManager = LockBoxStorageManager.INSTANCE;
                        lockBoxStorageManager.markEntrySaveFailed("failed to get secrets json");
                        1xH r04 = r0;
                        if (r03 != null) {
                            num = r03.A00;
                        }
                        lockBoxStorageManager.nullableComplete(r04, num);
                        return;
                    }
                    try {
                        String str4 = str2;
                        String A0b = AnonymousClass001.A0b(str4, AnonymousClass290.A02);
                        if (A0b != null) {
                            str4 = A0b;
                        }
                        jSONObject.putOpt(str4, str3);
                        String A02 = 11T.A02(jSONObject);
                        ?? obj2 = new Object();
                        ((36U) obj2).A00 = A02;
                        3lS r05 = LockBoxStorageManager.logger;
                        if (r05 != null) {
                            r05.ATN("LOCK_BOX_BACKUP_BLOCK_STORE_START");
                        }
                        C28z c28z = LockBoxStorageManager.backupManager;
                        if (c28z == null) {
                            11T.A0L("backupManager");
                            throw 0Q8.createAndThrow();
                        }
                        String str5 = str;
                        3Ek r06 = 3Ek.A02;
                        0fH.A0j("MessagingBackupManager", "backup data to cloud");
                        0BK.A00((C1Az) obj2, r06, c28z.A00.A00, str5).A03(new C3Vk(r0, 3));
                    } catch (JSONException e) {
                        LockBoxStorageManager.INSTANCE.markEntrySaveFailed("LockBoxCodeBlockStoreJSONError");
                        0fH.A0q("LockBoxStorageManager", "Error encountered while saving secret", e);
                        r0.A04(7);
                    }
                }
            });
            return r0;
        }
        0fH.A0j("LockBoxStorageManager", "Backup Manager Not Initialized - Save Secret");
        if (!lockBoxInitializeCalled || blockStoreAvailable) {
            r0.A04(5);
            return r0;
        }
        r0.A04(6);
        AnonymousClass291 A00 = 3Go.A00(str2);
        if (A00 != null && ((ordinal = A00.ordinal()) == 1 || ordinal == 2)) {
            String A0b = AnonymousClass001.A0b(3Go.A00(str2), AnonymousClass290.A01);
            if (A0b != null) {
                INSTANCE.storeEntryIntoSharedPreferences(A0b, str3);
                return r0;
            }
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markEntrySaveFailed(String str) {
        AnonymousClass297 anonymousClass297 = lockBoxEntryLogger;
        if (anonymousClass297 != null) {
            AnonymousClass296 anonymousClass296 = (AnonymousClass296) anonymousClass297;
            11T.A0F(str, 0);
            ((UserFlowLogger) 1Br.A0B(anonymousClass296.A01)).flowEndFail(anonymousClass296.A00, str, null);
        }
        3lS r0 = logger;
        if (r0 != null) {
            r0.ATN("LOCK_BOX_SAVE_SECRET_END");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markEntrySaveSuccess() {
        3lS r0 = logger;
        if (r0 != null) {
            r0.ATN("LOCK_BOX_SAVE_SECRET_END");
        }
        AnonymousClass297 anonymousClass297 = lockBoxEntryLogger;
        if (anonymousClass297 != null) {
            AnonymousClass296 anonymousClass296 = (AnonymousClass296) anonymousClass297;
            ((UserFlowLogger) anonymousClass296.A01.A00.get()).flowEndSuccess(anonymousClass296.A00);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveRecoveryCodeFromLegacyToLockBox(final String str, String str2) {
        lockBoxSaveSecretAsync(str, "rc", str2).A03(new 1xJ() { // from class: X.3Vj
            public /* bridge */ /* synthetic */ void Cit(Object obj) {
                Number number = (Number) obj;
                if (number == null || number.intValue() != 1) {
                    return;
                }
                C28z c28z = LockBoxStorageManager.backupManager;
                if (c28z == null) {
                    11T.A0L("backupManager");
                    throw 0Q8.createAndThrow();
                }
                String str3 = str;
                3Ek r0 = 3Ek.A03;
                11T.A0F(str3, 0);
                0BK r02 = c28z.A00;
                new 1xH();
                r02.A00.A09(r0, str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nullableComplete(1xH r302, Object obj) {
        if (obj == null) {
            r302.A02();
        } else {
            r302.A04(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int parseBackupManagerResultToLockboxResult(0EJ r302) {
        if (r302 instanceof 0EI) {
            return 1;
        }
        if (r302 instanceof C19d) {
            return parseBlockStoreError(((C19d) r302).A00);
        }
        return 0;
    }

    private final int parseBlockStoreError(Exception exc) {
        int i;
        if (exc instanceof C1B8) {
            i = 8;
        } else {
            if (exc instanceof C1B7) {
                return 10;
            }
            if (exc instanceof C1BA) {
                return 12;
            }
            i = 0;
            if (exc instanceof C1B9) {
                return 11;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final 3Ki parseToJsonResult(C1BB c1bb) {
        if (c1bb instanceof C19k) {
            byte[] bArr = ((C19k) c1bb).A00;
            11T.A0F(bArr, 0);
            List A0M = 0CU.A0M(new String(bArr, C03r.A05), new String[]{";"}, 0);
            if (A0M.size() == 2) {
                String str = (String) A0M.get(1);
                11T.A0F(str, 1);
                try {
                    return new 3Ki((Integer) null, new JSONObject(str));
                } catch (JSONException e) {
                    0fH.A0q("LockBoxStorageManager", "Error encountered while parsing lockbox secret", e);
                    return new 3Ki(7, (JSONObject) null);
                }
            }
        }
        3lS r0 = logger;
        if (r0 != null) {
            r0.ATN("LOCK_BOX_GET_JSON_SECRET_NONE");
        }
        return new 3Ki((Integer) null, new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final 3Kh parseToLockBoxResult(String str, String str2, String str3) {
        boolean z = true;
        if (str == null || str.length() <= 0) {
            z = false;
        }
        if (z) {
            3lS r0 = logger;
            if (r0 != null) {
                r0.ATN("LOCK_BOX_GET_SECRET_END");
            }
            return new 3Kh(str, 0S2.A00);
        }
        if (3Go.A00(str2) != null) {
            return lockBoxGetRemoteSecretWithSource(str3, str2, false);
        }
        3lS r02 = logger;
        if (r02 != null) {
            r02.ATN("LOCK_BOX_GET_SECRET_END");
        }
        0fH.A0j("LockBoxStorageManager", "can't find secret with the given key");
        return null;
    }

    public static final void setEntryLogger(AnonymousClass297 anonymousClass297, AnonymousClass299 anonymousClass299) {
        11T.A0F(anonymousClass297, 0);
        11T.A0F(anonymousClass299, 1);
        lockBoxEntryLogger = anonymousClass297;
        keyParser = anonymousClass299;
    }

    private final void storeEntryIntoSharedPreferences(String str, String str2) {
        synchronized (this) {
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                11T.A0L("sharedPreferences");
                throw 0Q8.createAndThrow();
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            11T.A0A(edit);
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public final void initialize(C28z c28z, AnonymousClass293 anonymousClass293) {
        11T.A0F(c28z, 0);
        11T.A0F(anonymousClass293, 1);
        backupManager = c28z;
        shareKeyRetrieve = anonymousClass293;
        blockStoreAvailable = true;
        lockBoxInitializeCalled = true;
    }

    public final void setLockBoxLogger(3lS r302) {
        logger = r302;
    }
}
