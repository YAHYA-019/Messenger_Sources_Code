package com.facebook.rapidfeedback.survey;

import X.0fH;
import X.1BQ;
import X.C00i;
import X.C1oi;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: LandingPageSurveyActivity.class */
public class LandingPageSurveyActivity extends FbFragmentActivity {
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        C00i c00i;
        this.A02 = 1BQ.A02(65753);
        this.A00 = 1BQ.A02(65832);
        this.A05 = 1BQ.A02(65833);
        this.A03 = 1BQ.A02(148165);
        this.A01 = 1BQ.A02(66061);
        this.A04 = 1BQ.A02(67460);
        this.A06 = 1BQ.A02(66311);
        C1oi.A00(this, 7);
        if (getIntent().getBooleanExtra("no_transition_override", false)) {
            overridePendingTransition(0, 0);
        }
        String stringExtra = getIntent().getStringExtra("landing_page_survey_type");
        if (stringExtra == null) {
            0fH.A0o("LandingPageSurveyActivity", "The surveyType is null!");
            return;
        }
        switch (stringExtra.hashCode()) {
            case -678905080:
                if (stringExtra.equals("watch_player_survey")) {
                    c00i = this.A06;
                    c00i.getClass();
                    c00i.get();
                    break;
                }
                break;
            case -479849531:
                if (stringExtra.equals("user_pay_survey")) {
                    c00i = this.A04;
                    c00i.getClass();
                    c00i.get();
                    break;
                }
                break;
            case 5611422:
                if (stringExtra.equals("video_survey")) {
                    c00i = this.A05;
                    c00i.getClass();
                    c00i.get();
                    break;
                }
                break;
            case 775371510:
                if (stringExtra.equals("ad_survey")) {
                    c00i = this.A02;
                    c00i.getClass();
                    c00i.get();
                    break;
                }
                break;
            case 862048539:
                if (stringExtra.equals("feed_survey")) {
                    c00i = this.A00;
                    c00i.getClass();
                    c00i.get();
                    break;
                }
                break;
            case 1125641700:
                if (stringExtra.equals("surface_ad_survey")) {
                    c00i = this.A03;
                    c00i.getClass();
                    c00i.get();
                    break;
                }
                break;
            case 1331831009:
                if (stringExtra.equals("instant_article_survey")) {
                    c00i = this.A01;
                    c00i.getClass();
                    c00i.get();
                    break;
                }
                break;
        }
        0fH.A0o("LandingPageSurveyActivity", "Can't get architect!");
        finish();
    }
}
