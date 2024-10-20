package com.meta.metaai.writewithai.creation.impl.viewmodel;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.AnonymousClass001;
import X.C0Bd;
import X.DKF;
import X.EKP;
import X.Fyp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: WriteWithAICreationViewModel$streamSuggestions$2.class */
public final class WriteWithAICreationViewModel$streamSuggestions$2 extends 0DO implements C0Bd {
    public final /* synthetic */ EKP $prevSuggestions;
    public final /* synthetic */ String $prompt;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ WriteWithAICreationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteWithAICreationViewModel$streamSuggestions$2(EKP ekp, WriteWithAICreationViewModel writeWithAICreationViewModel, String str, 0DR r305) {
        super(3, r305);
        this.this$0 = writeWithAICreationViewModel;
        this.$prompt = str;
        this.$prevSuggestions = ekp;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        WriteWithAICreationViewModel writeWithAICreationViewModel = this.this$0;
        String str = this.$prompt;
        WriteWithAICreationViewModel$streamSuggestions$2 writeWithAICreationViewModel$streamSuggestions$2 = new WriteWithAICreationViewModel$streamSuggestions$2(this.$prevSuggestions, writeWithAICreationViewModel, str, (0DR) obj3);
        writeWithAICreationViewModel$streamSuggestions$2.L$0 = obj2;
        return writeWithAICreationViewModel$streamSuggestions$2.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        Object obj2 = this.L$0;
        EKP ekp = DKF.A0k(this.this$0.A0A).A01;
        if (ekp instanceof EKP) {
            EKP ekp2 = ekp;
            if (ekp2.A03.isEmpty()) {
                boolean z = obj2 instanceof CancellationException;
                WriteWithAICreationViewModel writeWithAICreationViewModel = this.this$0;
                String str4 = this.$prompt;
                EKP ekp3 = this.$prevSuggestions;
                List list = null;
                if (ekp3 != null) {
                    list = ekp3.A03;
                    str = ekp3.A00;
                    str2 = ekp3.A01;
                    str3 = ekp3.A02;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                WriteWithAICreationViewModel.A04(writeWithAICreationViewModel, DKF.A0k(this.this$0.A0A).A03, str4, str, str2, str3, DKF.A0k(writeWithAICreationViewModel.A0A).A04, list, z);
            } else {
                WriteWithAICreationViewModel writeWithAICreationViewModel2 = this.this$0;
                String str5 = this.$prompt;
                List list2 = ekp2.A04;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj3 : list2) {
                    if (obj3 instanceof Fyp) {
                        A0s.add(obj3);
                    }
                }
                WriteWithAICreationViewModel.A06(writeWithAICreationViewModel2, str5, ekp2.A00, ekp2.A01, ekp2.A02, DKF.A0k(this.this$0.A0A).A04, A0s, false, false);
            }
        }
        return 04S.A00;
    }
}
