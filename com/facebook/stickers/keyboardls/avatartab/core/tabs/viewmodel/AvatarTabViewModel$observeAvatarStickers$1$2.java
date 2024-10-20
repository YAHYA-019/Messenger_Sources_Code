package com.facebook.stickers.keyboardls.avatartab.core.tabs.viewmodel;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.0Je;
import X.1BK;
import X.8Lr;
import X.99B;
import X.9sD;
import X.AnonymousClass001;
import X.C0Bd;
import X.C0ty;
import X.C9mD;
import com.facebook.common.util.TriState;
import java.util.List;

/* loaded from: AvatarTabViewModel$observeAvatarStickers$1$2.class */
public final class AvatarTabViewModel$observeAvatarStickers$1$2 extends 0DO implements C0Bd {
    public final /* synthetic */ 0Je $validDataReceived;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ C9mD this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarTabViewModel$observeAvatarStickers$1$2(C9mD c9mD, 0DR r303, 0Je r304) {
        super(3, r303);
        this.$validDataReceived = r304;
        this.this$0 = c9mD;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1V = AnonymousClass001.A1V(obj);
        0Je r0 = this.$validDataReceived;
        AvatarTabViewModel$observeAvatarStickers$1$2 avatarTabViewModel$observeAvatarStickers$1$2 = new AvatarTabViewModel$observeAvatarStickers$1$2(this.this$0, (0DR) obj3, r0);
        avatarTabViewModel$observeAvatarStickers$1$2.Z$0 = A1V;
        avatarTabViewModel$observeAvatarStickers$1$2.L$0 = obj2;
        return avatarTabViewModel$observeAvatarStickers$1$2.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        9sD r308;
        TriState triState;
        List list;
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        boolean z = this.Z$0;
        8Lr r0 = (8Lr) this.L$0;
        if (!z || this.$validDataReceived.element) {
            if (r0 != null) {
                if (r0.A01) {
                    List list2 = (List) r0.A00;
                    if (list2 != null && 1BK.A1Y(list2)) {
                        this.$validDataReceived.element = true;
                        r308 = this.this$0.A0H;
                        triState = TriState.YES;
                        list = (List) r0.A00;
                    }
                } else {
                    this.$validDataReceived.element = true;
                    r308 = this.this$0.A0H;
                    triState = TriState.NO;
                    list = C0ty.A00;
                }
                r308.CNT(triState, (99B) null, list);
                return 04S.A00;
            }
            if (!z) {
                this.this$0.A0H.BZ2();
                return 04S.A00;
            }
        }
        this.this$0.A0H.Bud();
        return 04S.A00;
    }
}
