package com.facebook.messaging.aibot.botpicker.ugcbot.creation;

import X.04S;
import X.0Be;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.11T;
import X.7zL;
import X.8Cr;
import X.8Jt;
import X.8LF;
import X.8LT;
import X.9tL;
import X.AWi;
import X.AnonymousClass001;

/* loaded from: AiBotCreationViewModel$aiBotCreationDetailsViewState$1.class */
public final class AiBotCreationViewModel$aiBotCreationDetailsViewState$1 extends 0DO implements 0Be {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ 8Cr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotCreationViewModel$aiBotCreationDetailsViewState$1(8Cr r302, 0DR r303) {
        super(4, r303);
        this.this$0 = r302;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AiBotCreationViewModel$aiBotCreationDetailsViewState$1 aiBotCreationViewModel$aiBotCreationDetailsViewState$1 = new AiBotCreationViewModel$aiBotCreationDetailsViewState$1(this.this$0, (0DR) obj4);
        aiBotCreationViewModel$aiBotCreationDetailsViewState$1.L$0 = obj;
        aiBotCreationViewModel$aiBotCreationDetailsViewState$1.L$1 = obj2;
        aiBotCreationViewModel$aiBotCreationDetailsViewState$1.L$2 = obj3;
        return aiBotCreationViewModel$aiBotCreationDetailsViewState$1.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        8LF r0 = (8LF) this.L$0;
        8LT r02 = (8LT) this.L$1;
        AWi aWi = (AWi) this.L$2;
        String str5 = r0 != null ? r0.A01 : null;
        Integer num = this.this$0.A02;
        boolean z = false;
        if (11T.A0O(aWi, 9tL.A00) || (str5 != null && r0 != null && (str = r0.A02) != null && 7zL.A1V(str) && (str2 = r0.A00) != null && 7zL.A1V(str2) && (str3 = r0.A09) != null && 7zL.A1V(str3) && r02 != null && (str4 = r02.A06) != null && 7zL.A1V(str4))) {
            z = true;
        }
        return new 8Jt(r02, r0, aWi, Boolean.valueOf(z), num, str5);
    }
}
