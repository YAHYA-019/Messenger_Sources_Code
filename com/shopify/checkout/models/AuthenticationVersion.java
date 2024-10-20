package com.shopify.checkout.models;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M35;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: AuthenticationVersion.class */
public final class AuthenticationVersion {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ AuthenticationVersion[] A02;
    public static final AuthenticationVersion A03;
    public static final Companion Companion;
    public final String value;

    /* loaded from: AuthenticationVersion$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(AuthenticationVersion.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.shopify.checkout.models.AuthenticationVersion$Companion] */
    static {
        AuthenticationVersion authenticationVersion = new AuthenticationVersion("V1", 0, "v1");
        A03 = authenticationVersion;
        AuthenticationVersion[] authenticationVersionArr = {authenticationVersion, new AuthenticationVersion("V2", 1, "v2")};
        A02 = authenticationVersionArr;
        A01 = C00t.A00(authenticationVersionArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M35.A00);
    }

    public AuthenticationVersion(String str, int i, String str2) {
        this.value = str2;
    }

    public static AuthenticationVersion valueOf(String str) {
        return (AuthenticationVersion) Enum.valueOf(AuthenticationVersion.class, str);
    }

    public static AuthenticationVersion[] values() {
        return (AuthenticationVersion[]) A02.clone();
    }
}
