package X;

import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: G7g.class */
public final class G7g implements 0zU {
    public final int A00;
    public final Object A01;
    public final String A02;

    public G7g(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object emit(Object obj, 0DR r303) {
        switch (this.A00) {
            case 0:
                C9f7 c9f7 = (C9f7) obj;
                if (11T.A0O(c9f7.A00, this.A02)) {
                    7zL.A1T(this.A01, c9f7);
                    break;
                }
                break;
            case 1:
                03Y r0 = (03Y) obj;
                if (11T.A0O(r0.first, this.A02)) {
                    ((Function1) this.A01).invoke(r0.second);
                    break;
                }
                break;
            default:
                EzI ezI = (EzI) obj;
                List<EyJ> list = ezI.A05;
                F9m f9m = ezI.A00;
                if (1BK.A1Y(list)) {
                    WriteWithAICreationViewModel writeWithAICreationViewModel = (WriteWithAICreationViewModel) this.A01;
                    String str = this.A02;
                    ArrayList A0z = 1BL.A0z(list);
                    for (EyJ eyJ : list) {
                        A0z.add(new Fyp(eyJ.A01, eyJ.A00));
                    }
                    WriteWithAICreationViewModel.A06(writeWithAICreationViewModel, str, ezI.A02, ezI.A03, ezI.A04, ezI.A01, A0z, true, true);
                }
                WriteWithAICreationViewModel.A03((WriteWithAICreationViewModel) this.A01, f9m);
                break;
        }
        return 04S.A00;
    }
}
