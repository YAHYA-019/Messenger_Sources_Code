package X;

import com.facebook.messaging.search.employeesurvey.CustomEmployeeSurveyBottomSheet;
import kotlin.jvm.functions.Function2;

/* loaded from: Cx2.class */
public final class Cx2 implements DGK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cx2(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void Bnv(boolean z) {
        switch (this.A00) {
            case 0:
                ((C1935Ax0) this.A02).A01.A00((C1768As2) this.A01);
                return;
            case 1:
                ((Function2) this.A02).invoke(this.A01, Boolean.valueOf(z));
                return;
            default:
                ((QAQ) this.A01).A00 = !r0.A00;
                CustomEmployeeSurveyBottomSheet customEmployeeSurveyBottomSheet = (CustomEmployeeSurveyBottomSheet) this.A02;
                customEmployeeSurveyBottomSheet.A1L().A0y(customEmployeeSurveyBottomSheet.A1K(AbF.A0U(customEmployeeSurveyBottomSheet.A1L())));
                return;
        }
    }
}
