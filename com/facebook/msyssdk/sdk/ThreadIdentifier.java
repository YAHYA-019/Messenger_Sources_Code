package com.facebook.msyssdk.sdk;

import X.11T;
import X.4YV;
import X.7zM;
import X.AnonymousClass001;
import X.C0il;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ThreadIdentifier.class */
public final class ThreadIdentifier {
    public static final Companion Companion = new Object();

    /* loaded from: ThreadIdentifier$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final InternalProperties getSDKThreadIdentifierObject(String str) {
            return ThreadIdentifier.getSDKThreadIdentifierObject(str);
        }

        public final String getSDKThreadIdentifierString(int i, int i2, String str) {
            return ThreadIdentifier.getSDKThreadIdentifierString(i, i2, str);
        }
    }

    /* loaded from: ThreadIdentifier$InternalProperties.class */
    public final class InternalProperties {
        public final int idType;
        public final String idValue;
        public final int mailboxType;

        public InternalProperties(int i, int i2, String str) {
            11T.A0F(str, 3);
            this.mailboxType = i;
            this.idType = i2;
            this.idValue = str;
        }

        public static /* synthetic */ InternalProperties copy$default(InternalProperties internalProperties, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = internalProperties.mailboxType;
            }
            if ((i3 & 2) != 0) {
                i2 = internalProperties.idType;
            }
            if ((i3 & 4) != 0) {
                str = internalProperties.idValue;
            }
            return internalProperties.copy(i, i2, str);
        }

        public final int component1() {
            return this.mailboxType;
        }

        public final int component2() {
            return this.idType;
        }

        public final String component3() {
            return this.idValue;
        }

        public final InternalProperties copy(int i, int i2, String str) {
            11T.A0F(str, 2);
            return new InternalProperties(i, i2, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof InternalProperties)) {
                    return false;
                }
                InternalProperties internalProperties = (InternalProperties) obj;
                if (this.mailboxType != internalProperties.mailboxType || this.idType != internalProperties.idType || !11T.A0O(this.idValue, internalProperties.idValue)) {
                    return false;
                }
            }
            return true;
        }

        public final int getIdType() {
            return this.idType;
        }

        public final String getIdValue() {
            return this.idValue;
        }

        public final int getMailboxType() {
            return this.mailboxType;
        }

        public int hashCode() {
            return 7zM.A05(this.idValue, ((this.mailboxType * 31) + this.idType) * 31);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("InternalProperties(mailboxType=");
            A0k.append(this.mailboxType);
            A0k.append(", idType=");
            A0k.append(this.idType);
            A0k.append(", idValue=");
            A0k.append(this.idValue);
            return 4YV.A0x(A0k);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.msyssdk.sdk.ThreadIdentifier$Companion] */
    static {
        C0il.A0B("sdkthreadidentifierjni");
    }

    public static final native InternalProperties getSDKThreadIdentifierObject(String str);

    public static final native String getSDKThreadIdentifierString(int i, int i2, String str);
}
