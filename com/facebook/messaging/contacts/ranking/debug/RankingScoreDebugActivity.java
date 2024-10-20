package com.facebook.messaging.contacts.ranking.debug;

import X.1BK;
import X.1pK;
import X.7zU;
import X.AbK;
import X.AbL;
import X.AbM;
import X.AlA;
import X.RFH;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import java.io.Serializable;

/* loaded from: RankingScoreDebugActivity.class */
public class RankingScoreDebugActivity extends FbFragmentActivity {
    public final RFH A00 = new RFH(this);

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof AlA) {
            ((AlA) fragment).A04 = this.A00;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        AlA alA;
        Bundle A05;
        super.A2y(bundle);
        AbK.A1D(this, AbL.A08(this));
        setContentView(2132543215);
        if (BDe().A0b("RANKING_SCORE_DEBUG_FRAGMENT_TAG") == null) {
            String stringExtra = getIntent().getStringExtra("extra_start_fragment");
            if ("FullLocalScoresFragment".equals(stringExtra)) {
                Serializable serializableExtra = getIntent().getSerializableExtra("extra_score_type");
                alA = new AlA();
                A05 = 1BK.A05();
                A05.putSerializable("param_score_type", serializableExtra);
            } else {
                if (!"ScoreHistoryFragment".equals(stringExtra)) {
                    return;
                }
                Serializable serializableExtra2 = getIntent().getSerializableExtra("extra_score_type");
                String stringExtra2 = getIntent().getStringExtra("extra_fbid");
                String stringExtra3 = getIntent().getStringExtra("extra_username");
                alA = new 1pK();
                A05 = 1BK.A05();
                A05.putSerializable("param_score_type", serializableExtra2);
                A05.putString("param_fbid", stringExtra2);
                A05.putString("param_username", stringExtra3);
            }
            alA.setArguments(A05);
            AbM.A1D(7zU.A0D(this), alA, "RANKING_SCORE_DEBUG_FRAGMENT_TAG", 2131364264);
        }
    }
}
