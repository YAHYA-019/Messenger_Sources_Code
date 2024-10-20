package com.facebook.messaging.communitymessaging.categorycreation;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0NC;
import X.0zV;
import X.1Bi;
import X.2Zo;
import X.2aI;
import X.7zN;
import X.9YM;
import X.AI0;
import X.AnonymousClass001;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.jvm.functions.Function2;

/* loaded from: CreateOrRenameCategoryDialogFragment$logWhenCategoryActionSyncs$1.class */
public final class CreateOrRenameCategoryDialogFragment$logWhenCategoryActionSyncs$1 extends 0DO implements Function2 {
    public final /* synthetic */ String $categoryName;
    public final /* synthetic */ long $communityId;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ int $markerId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CreateOrRenameCategoryDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOrRenameCategoryDialogFragment$logWhenCategoryActionSyncs$1(FbUserSession fbUserSession, CreateOrRenameCategoryDialogFragment createOrRenameCategoryDialogFragment, String str, 0DR r305, int i, long j) {
        super(2, r305);
        this.$fbUserSession = fbUserSession;
        this.this$0 = createOrRenameCategoryDialogFragment;
        this.$communityId = j;
        this.$markerId = i;
        this.$categoryName = str;
    }

    public final 0DR create(Object obj, 0DR r303) {
        FbUserSession fbUserSession = this.$fbUserSession;
        CreateOrRenameCategoryDialogFragment createOrRenameCategoryDialogFragment = this.this$0;
        long j = this.$communityId;
        CreateOrRenameCategoryDialogFragment$logWhenCategoryActionSyncs$1 createOrRenameCategoryDialogFragment$logWhenCategoryActionSyncs$1 = new CreateOrRenameCategoryDialogFragment$logWhenCategoryActionSyncs$1(fbUserSession, createOrRenameCategoryDialogFragment, this.$categoryName, r303, this.$markerId, j);
        createOrRenameCategoryDialogFragment$logWhenCategoryActionSyncs$1.L$0 = obj;
        return createOrRenameCategoryDialogFragment$logWhenCategoryActionSyncs$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            2aI r02 = (2aI) this.L$0;
            9YM r03 = (9YM) 7zN.A0n(this.this$0, this.$fbUserSession, 68874);
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 1Bi.A03(16520);
            0zV A00 = 0NC.A00(2Zo.A00(), r03.A00(this.$communityId));
            AI0 ai0 = new AI0(quickPerformanceLogger, this.$categoryName, r02, this.$markerId);
            this.label = 1;
            if (A00.collect(ai0, this) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return 04S.A00;
    }
}
