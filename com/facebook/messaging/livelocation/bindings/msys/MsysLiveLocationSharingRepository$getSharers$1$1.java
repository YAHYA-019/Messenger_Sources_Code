package com.facebook.messaging.livelocation.bindings.msys;

import X.04S;
import X.0DO;
import X.0DR;
import X.5fT;
import com.facebook.msys.mca.MailboxNullable;
import kotlin.jvm.functions.Function2;

/* loaded from: MsysLiveLocationSharingRepository$getSharers$1$1.class */
public final class MsysLiveLocationSharingRepository$getSharers$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ MailboxNullable $it;
    public final /* synthetic */ 5fT $listener;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ MsysLiveLocationSharingRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysLiveLocationSharingRepository$getSharers$1$1(5fT r302, MsysLiveLocationSharingRepository msysLiveLocationSharingRepository, MailboxNullable mailboxNullable, 0DR r305) {
        super(2, r305);
        this.$it = mailboxNullable;
        this.this$0 = msysLiveLocationSharingRepository;
        this.$listener = r302;
    }

    public final 0DR create(Object obj, 0DR r303) {
        MailboxNullable mailboxNullable = this.$it;
        return new MsysLiveLocationSharingRepository$getSharers$1$1(this.$listener, this.this$0, mailboxNullable, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x010c -> B:15:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.livelocation.bindings.msys.MsysLiveLocationSharingRepository$getSharers$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
