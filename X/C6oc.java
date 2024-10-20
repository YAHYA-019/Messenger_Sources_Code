package X;

import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionDetailsModel;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionListModel;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionSettingModel;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseSuggestedQuestionListModel;

/* renamed from: X.6oc, reason: invalid class name */
/* loaded from: 6oc.class */
public final class C6oc {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C6oc(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 16428);
        this.A00 = 1Bu.A03(r0, 68325);
    }

    public AutomatedResponseCustomQuestionDetailsModel A00() {
        String str;
        C6od c6od = (C6od) this.A00.A00.get();
        AutomatedResponseCustomQuestionListModel automatedResponseCustomQuestionListModel = null;
        AutomatedResponseCustomQuestionSettingModel automatedResponseCustomQuestionSettingModel = null;
        C6od.A00(c6od);
        try {
            String BD0 = C6od.A00(c6od).BD0(c6od.A04);
            str = "";
            if (BD0 == null) {
                BD0 = str;
            }
            if (BD0.length() > 0) {
                automatedResponseCustomQuestionSettingModel = (AutomatedResponseCustomQuestionSettingModel) ((4yJ) c6od.A02.A00.get()).A02(BD0, AutomatedResponseCustomQuestionSettingModel.class);
            }
            String BD02 = C6od.A00(c6od).BD0(c6od.A03);
            str = BD02 != null ? BD02 : "";
            if (str.length() > 0) {
                automatedResponseCustomQuestionListModel = (AutomatedResponseCustomQuestionListModel) ((4yJ) c6od.A02.A00.get()).A02(str, AutomatedResponseCustomQuestionListModel.class);
            }
        } catch (C12137zd | ClassCastException e) {
            0fH.A0k("BusinessInboxFAQDetailsCacheHandler", AnonymousClass001.A0Z(e, "Failed to deserialize faq details: ", AnonymousClass001.A0k()));
        }
        return new AutomatedResponseCustomQuestionDetailsModel(automatedResponseCustomQuestionListModel, automatedResponseCustomQuestionSettingModel);
    }

    public AutomatedResponseSuggestedQuestionListModel A01() {
        StringBuilder A0k;
        String str;
        C6od c6od = (C6od) 1Br.A0B(this.A00);
        C6od.A00(c6od);
        try {
            String A0r = 4YV.A0r(C6od.A00(c6od), c6od.A05);
            if (A0r.length() > 0) {
                return (AutomatedResponseSuggestedQuestionListModel) ((4yJ) 1Br.A0B(c6od.A02)).A02(A0r, AutomatedResponseSuggestedQuestionListModel.class);
            }
            return null;
        } catch (C12137zd e) {
            e = e;
            A0k = AnonymousClass001.A0k();
            str = "Failed to deserialize faq suggested question: ";
            0fH.A0k("BusinessInboxFAQDetailsCacheHandler", AnonymousClass001.A0Z(e, str, A0k));
            return null;
        } catch (ClassCastException e2) {
            e = e2;
            A0k = AnonymousClass001.A0k();
            str = "Failed to deserialize faq faq suggested question: ";
            0fH.A0k("BusinessInboxFAQDetailsCacheHandler", AnonymousClass001.A0Z(e, str, A0k));
            return null;
        }
    }

    public String A02() {
        return ((C9cj) 4YU.A0n(1Br.A03(this.A01), this.A02, 68326)).A00;
    }

    public void A03(String str) {
        ((C9cj) 4YU.A0n(1Br.A03(this.A01), this.A02, 68326)).A02(str);
    }
}
