package com.facebook.fbavatar.artifacto;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.8KQ;
import X.AnonymousClass957;
import java.io.File;
import kotlin.jvm.functions.Function2;

/* loaded from: AvatarArtifactRepository$downloadAsset$2.class */
public final class AvatarArtifactRepository$downloadAsset$2 extends 0DO implements Function2 {
    public final /* synthetic */ AnonymousClass957 $downloadMode;
    public final /* synthetic */ 8KQ $model;
    public final /* synthetic */ File $rootPath;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarArtifactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarArtifactRepository$downloadAsset$2(AnonymousClass957 anonymousClass957, AvatarArtifactRepository avatarArtifactRepository, 8KQ r304, File file, 0DR r306) {
        super(2, r306);
        this.$downloadMode = anonymousClass957;
        this.this$0 = avatarArtifactRepository;
        this.$rootPath = file;
        this.$model = r304;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AvatarArtifactRepository$downloadAsset$2(this.$downloadMode, this.this$0, this.$model, this.$rootPath, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x019a, code lost:
    
        if (r303 != r0) goto L25;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x048a  */
    /* JADX WARN: Type inference failed for: r0v213 */
    /* JADX WARN: Type inference failed for: r0v238, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v241, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v309 */
    /* JADX WARN: Type inference failed for: r0v323, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v326, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.artifacto.AvatarArtifactRepository$downloadAsset$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
