package X;

import android.content.Intent;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionListModel;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionSettingModel;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.6od, reason: invalid class name */
/* loaded from: 6od.class */
public final class C6od {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1G2 A03;
    public final 1G2 A04;
    public final 1G2 A05;
    public final C01i A06;
    public final 1Br A07 = 1Bq.A00(33013);

    public C6od(1De r302) {
        this.A00 = r302;
        C01h A01 = C01g.A01(new C82y(this, 8));
        this.A06 = A01;
        this.A02 = 1Bq.A00(68336);
        this.A01 = 1Bq.A00(16688);
        String str = (String) A01.getValue();
        1G2 r0 = C2bv.A0I;
        1G2 A0D = r0.A0D(0Pz.A0W(str, "/")).A0D("faq_setting");
        11T.A0A(A0D);
        this.A04 = A0D;
        1G2 A0D2 = r0.A0D(0Pz.A0W((String) this.A06.getValue(), "/")).A0D("faq_list");
        11T.A0A(A0D2);
        this.A03 = A0D2;
        1G2 A0D3 = r0.A0D(0Pz.A0W((String) this.A06.getValue(), "/")).A0D("faq_suggested_questions_list");
        11T.A0A(A0D3);
        this.A05 = A0D3;
    }

    public static final FbSharedPreferences A00(C6od c6od) {
        return (FbSharedPreferences) c6od.A07.A00.get();
    }

    public static final void A01(AutomatedResponseCustomQuestionSettingModel automatedResponseCustomQuestionSettingModel, C6od c6od, boolean z) {
        1Ql edit;
        synchronized (c6od) {
            if (automatedResponseCustomQuestionSettingModel == null) {
                edit = A00(c6od).edit();
                edit.Cdj(c6od.A04);
            } else {
                String A03 = ((4yJ) 1Br.A0B(c6od.A02)).A03(automatedResponseCustomQuestionSettingModel);
                edit = A00(c6od).edit();
                edit.CaL(c6od.A04, A03);
            }
            edit.commit();
            if (z) {
                1Uv r0 = (1Uv) 1Br.A0B(c6od.A01);
                Intent intent = new Intent();
                intent.setAction("faq_details_cache_updated");
                1Uv.A02(intent, r0);
            }
        }
    }

    public final void A02(AutomatedResponseCustomQuestionListModel automatedResponseCustomQuestionListModel) {
        1Ql edit;
        synchronized (this) {
            if (automatedResponseCustomQuestionListModel == null) {
                edit = A00(this).edit();
                edit.Cdj(this.A03);
            } else {
                String A03 = ((4yJ) 1Br.A0B(this.A02)).A03(automatedResponseCustomQuestionListModel);
                edit = A00(this).edit();
                edit.CaL(this.A03, A03);
            }
            edit.commitImmediately();
            1Uv r0 = (1Uv) 1Br.A0B(this.A01);
            Intent intent = new Intent();
            intent.setAction("faq_details_cache_updated");
            1Uv.A02(intent, r0);
        }
    }
}
