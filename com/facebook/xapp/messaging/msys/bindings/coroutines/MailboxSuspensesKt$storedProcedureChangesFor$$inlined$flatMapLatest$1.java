package com.facebook.xapp.messaging.msys.bindings.coroutines;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0N0;
import X.0N2;
import X.0zU;
import X.AnonymousClass001;
import X.C0Bd;
import X.C82t;
import java.util.Set;

/* loaded from: MailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1.class */
public final class MailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1 extends 0DO implements C0Bd {
    public final /* synthetic */ Set $storedProcedureNames$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1(Set set, 0DR r303) {
        super(3, r303);
        this.$storedProcedureNames$inlined = set;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1 mailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1 = new MailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1(this.$storedProcedureNames$inlined, (0DR) obj3);
        mailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1.L$0 = obj;
        mailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1.L$1 = obj2;
        return mailboxSuspensesKt$storedProcedureChangesFor$$inlined$flatMapLatest$1.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            0zU r02 = (0zU) this.L$0;
            0N0 r03 = new 0N0(new C82t(this.L$1, this.$storedProcedureNames$inlined, null, 7));
            this.label = 1;
            if (0N2.A02(this, r03, r02) == r0) {
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
