package com.facebook.games.nativetos.kcomponents;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.1Iw;
import X.C2lh;
import X.ExP;
import X.GNr;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLInstantGameContextType;
import kotlin.jvm.functions.Function2;

/* loaded from: GamingLoginNativeToSComponent$onEditPermissionButtonClicked$1.class */
public final class GamingLoginNativeToSComponent$onEditPermissionButtonClicked$1 extends 0DO implements Function2 {
    public final /* synthetic */ 1Iw $componentContext;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ GraphQLInstantGameContextType $contextType;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ ExP $gamingLoginNativeToSContextController;
    public final /* synthetic */ C2lh $gamingUserAvatarURLState;
    public final /* synthetic */ C2lh $gamingUserNameState;
    public final /* synthetic */ GNr $nativeToSData;
    public final /* synthetic */ C2lh $permissionDescription;
    public final /* synthetic */ C2lh $selectedProfileType;
    public Object L$0;
    public int label;
    public final /* synthetic */ GamingLoginNativeToSComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamingLoginNativeToSComponent$onEditPermissionButtonClicked$1(Context context, FbUserSession fbUserSession, ExP exP, GNr gNr, GamingLoginNativeToSComponent gamingLoginNativeToSComponent, GraphQLInstantGameContextType graphQLInstantGameContextType, 1Iw r308, C2lh c2lh, C2lh c2lh2, C2lh c2lh3, C2lh c2lh4, 0DR r313) {
        super(2, r313);
        this.this$0 = gamingLoginNativeToSComponent;
        this.$fbUserSession = fbUserSession;
        this.$context = context;
        this.$nativeToSData = gNr;
        this.$gamingLoginNativeToSContextController = exP;
        this.$contextType = graphQLInstantGameContextType;
        this.$componentContext = r308;
        this.$permissionDescription = c2lh;
        this.$selectedProfileType = c2lh2;
        this.$gamingUserNameState = c2lh3;
        this.$gamingUserAvatarURLState = c2lh4;
    }

    public final 0DR create(Object obj, 0DR r303) {
        GamingLoginNativeToSComponent gamingLoginNativeToSComponent = this.this$0;
        FbUserSession fbUserSession = this.$fbUserSession;
        return new GamingLoginNativeToSComponent$onEditPermissionButtonClicked$1(this.$context, fbUserSession, this.$gamingLoginNativeToSContextController, this.$nativeToSData, gamingLoginNativeToSComponent, this.$contextType, this.$componentContext, this.$permissionDescription, this.$selectedProfileType, this.$gamingUserNameState, this.$gamingUserAvatarURLState, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0270, code lost:
    
        if (r305 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        if (r0.A07() != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.games.nativetos.kcomponents.GamingLoginNativeToSComponent$onEditPermissionButtonClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
