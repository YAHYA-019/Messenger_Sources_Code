package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* renamed from: X.1r4, reason: invalid class name */
/* loaded from: 1r4.class */
public enum C1r4 {
    A0H("USER", PublicKeyCredentialControllerUtility.JSON_KEY_USER),
    A0G("UNMATCHED", "unmatched"),
    A0B("PAGE", "page"),
    A0F("UNAVAILABLE_MESSAGING_ACTOR", "UnavailableMessagingActor"),
    A0E("REDUCED_MESSAGING_ACTOR", "ReducedMessagingActor"),
    A0C("PARENT_APPROVED_USER", "NeoApprovedUser"),
    A09("INSTAGRAM_USER", "InstagramMessagingUser"),
    A0D("PROXY_OCULUS_USER", "ProxyOculusUser"),
    A08("GENERATIVE_AI_BOT", "AiBot"),
    A0A("META_MANAGED_GENERATIVE_AI_BOT", "XFBMSGRMetaManagedGenerativeAIBot");

    public static final ImmutableList A00;
    public static final ImmutableList A01;
    public static final ImmutableList A02;
    public static final ImmutableList A03;
    public static final ImmutableList A04;
    public static final ImmutableList A05;
    public static final ImmutableList A06;
    public final int mDbValue;
    public final String mGraphQlParamValue;

    static {
        C1r4 c1r4 = A0H;
        C1r4 c1r42 = A0G;
        C1r4 c1r43 = A0B;
        C1r4 c1r44 = A0F;
        C1r4 c1r45 = A0E;
        C1r4 c1r46 = A0C;
        C1r4 c1r47 = A09;
        C1r4 c1r48 = A0D;
        C1r4 c1r49 = A08;
        A00 = ImmutableList.of((Object) c1r4, (Object) c1r42, (Object) c1r43, (Object) c1r44, (Object) c1r45, (Object) c1r46, (Object) c1r47, (Object) c1r49);
        A05 = ImmutableList.of((Object) c1r4, (Object) c1r42);
        A04 = ImmutableList.of((Object) c1r4, (Object) c1r42, (Object) c1r47, (Object) c1r49);
        A06 = ImmutableList.of((Object) c1r4, (Object) c1r42, (Object) c1r46, (Object) c1r47, (Object) c1r48);
        A03 = ImmutableList.of((Object) c1r4, (Object) c1r44, (Object) c1r45, (Object) c1r46);
        A02 = ImmutableList.of((Object) c1r4, (Object) c1r44, (Object) c1r45);
        A01 = ImmutableList.of((Object) c1r4, (Object) c1r44, (Object) c1r45, (Object) c1r46, (Object) c1r47);
    }

    C1r4(String str, String str2) {
        this.mGraphQlParamValue = str2;
        this.mDbValue = r303;
    }
}
