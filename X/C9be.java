package X;

import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionDetailsModel;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionListModel;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9be, reason: invalid class name */
/* loaded from: 9be.class */
public final class C9be {
    public final /* synthetic */ 1Iw A00;
    public final /* synthetic */ AutomatedResponseCustomQuestionDetailsModel A01;
    public final /* synthetic */ C8vB A02;
    public final /* synthetic */ ImmutableList A03;

    public C9be(1Iw r302, AutomatedResponseCustomQuestionDetailsModel automatedResponseCustomQuestionDetailsModel, C8vB c8vB, ImmutableList immutableList) {
        this.A02 = c8vB;
        this.A01 = automatedResponseCustomQuestionDetailsModel;
        this.A03 = immutableList;
        this.A00 = r302;
    }

    public void A00(int i) {
        ImmutableList immutableList;
        AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel;
        C8vB c8vB = this.A02;
        9lJ A0c = 7zP.A0c(c8vB.A02);
        1UG A08 = 1BK.A08(1Br.A02(A0c.A01), 1BJ.A00(1631));
        if (A08.isSampled()) {
            7zN.A16(A08);
            1UG.A01(new 0DA(), A08);
            1UG.A04(A08, A0c.A02);
        }
        AutomatedResponseCustomQuestionListModel automatedResponseCustomQuestionListModel = this.A01.A00;
        if (automatedResponseCustomQuestionListModel == null || (immutableList = automatedResponseCustomQuestionListModel.A00) == null || (automatedResponseCustomQuestionModel = (AutomatedResponseCustomQuestionModel) immutableList.get(i)) == null) {
            return;
        }
        c8vB.A1d(automatedResponseCustomQuestionModel, "edit");
    }

    public void A01(int i) {
        ImmutableList immutableList;
        C8vB c8vB = this.A02;
        9lJ A0c = 7zP.A0c(c8vB.A02);
        1UG A08 = 1BK.A08(1Br.A02(A0c.A01), 1BJ.A00(1634));
        if (A08.isSampled()) {
            7zN.A16(A08);
            1UG.A01(new 0DA(), A08);
            1UG.A04(A08, A0c.A02);
        }
        String str = (String) 0QD.A0J(this.A03, i);
        if (str == null) {
            str = "";
        }
        AutomatedResponseCustomQuestionListModel automatedResponseCustomQuestionListModel = this.A01.A00;
        c8vB.A1d(9Cs.A00(str, (automatedResponseCustomQuestionListModel == null || (immutableList = automatedResponseCustomQuestionListModel.A00) == null) ? 0 : immutableList.size()), "add");
    }
}
