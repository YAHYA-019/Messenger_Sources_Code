package com.facebook.privacy.e2ee.genericimpl.backup.common;

import X.11T;
import X.C00t;
import kotlin.enums.EnumEntries;

/* loaded from: BackupException.class */
public final class BackupException extends Exception {
    public final BackupExceptionType exceptionType;
    public final Throwable failureReason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: BackupException$BackupExceptionType.class */
    public final class BackupExceptionType {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ BackupExceptionType[] $VALUES;
        public static final BackupExceptionType ALREADY_REGISTERED = new BackupExceptionType("ALREADY_REGISTERED", 0);
        public static final BackupExceptionType BACKUP_KEY_PAIR_SERIALIZATION_ERROR = new BackupExceptionType("BACKUP_KEY_PAIR_SERIALIZATION_ERROR", 1);
        public static final BackupExceptionType CLIENT_PARAMS_ERROR = new BackupExceptionType("CLIENT_PARAMS_ERROR", 2);
        public static final BackupExceptionType E2EE_CRYPTO_LIB_ERROR = new BackupExceptionType("E2EE_CRYPTO_LIB_ERROR", 3);
        public static final BackupExceptionType INVALID_USER_PASSWORD = new BackupExceptionType("INVALID_USER_PASSWORD", 4);
        public static final BackupExceptionType ISLAND_PUB_RSA_KEY_INVALID = new BackupExceptionType("ISLAND_PUB_RSA_KEY_INVALID", 5);
        public static final BackupExceptionType ISLAND_PUB_ED25519_KEY_INVALID = new BackupExceptionType("ISLAND_PUB_ED25519_KEY_INVALID", 6);
        public static final BackupExceptionType ISLAND_OPAQUE_PUB_KEY_INVALID = new BackupExceptionType("ISLAND_OPAQUE_PUB_KEY_INVALID", 7);
        public static final BackupExceptionType NETWORK_PROVIDER_ERROR = new BackupExceptionType("NETWORK_PROVIDER_ERROR", 8);
        public static final BackupExceptionType NOT_REGISTERED = new BackupExceptionType("NOT_REGISTERED", 9);
        public static final BackupExceptionType RESTORE_HISTORY_SIGNATURE_VERIFICATION_ERROR = new BackupExceptionType("RESTORE_HISTORY_SIGNATURE_VERIFICATION_ERROR", 10);
        public static final BackupExceptionType VESTA_CLIENT_ERROR = new BackupExceptionType("VESTA_CLIENT_ERROR", 11);
        public static final BackupExceptionType VESTA_SERVER_ERROR = new BackupExceptionType("VESTA_SERVER_ERROR", 12);
        public static final BackupExceptionType USER_PASSWORD_ATTEMPTS_EXHAUSTED = new BackupExceptionType("USER_PASSWORD_ATTEMPTS_EXHAUSTED", 13);

        public static final /* synthetic */ BackupExceptionType[] $values() {
            return new BackupExceptionType[]{ALREADY_REGISTERED, BACKUP_KEY_PAIR_SERIALIZATION_ERROR, CLIENT_PARAMS_ERROR, E2EE_CRYPTO_LIB_ERROR, INVALID_USER_PASSWORD, ISLAND_PUB_RSA_KEY_INVALID, ISLAND_PUB_ED25519_KEY_INVALID, ISLAND_OPAQUE_PUB_KEY_INVALID, NETWORK_PROVIDER_ERROR, NOT_REGISTERED, RESTORE_HISTORY_SIGNATURE_VERIFICATION_ERROR, VESTA_CLIENT_ERROR, VESTA_SERVER_ERROR, USER_PASSWORD_ATTEMPTS_EXHAUSTED};
        }

        static {
            BackupExceptionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C00t.A00($values);
        }

        public BackupExceptionType(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BackupExceptionType valueOf(String str) {
            return (BackupExceptionType) Enum.valueOf(BackupExceptionType.class, str);
        }

        public static BackupExceptionType[] values() {
            return (BackupExceptionType[]) $VALUES.clone();
        }
    }

    public BackupException(BackupExceptionType backupExceptionType, Throwable th) {
        11T.A0F(backupExceptionType, 1);
        this.exceptionType = backupExceptionType;
        this.failureReason = th;
    }

    public final BackupExceptionType getExceptionType() {
        return this.exceptionType;
    }

    public final Throwable getFailureReason() {
        return this.failureReason;
    }
}
