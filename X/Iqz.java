package X;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.ui.media.attachments.model.AnimatedMediaPreprocessData;

/* loaded from: Iqz.class */
public final class Iqz implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerPageFragment$16";
    public final /* synthetic */ C2397Gbz A00;

    public Iqz(C2397Gbz c2397Gbz) {
        this.A00 = c2397Gbz;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Gbz, androidx.fragment.app.Fragment] */
    @Override // java.lang.Runnable
    public void run() {
        String A0J;
        ContentAppAttribution contentAppAttribution;
        int length;
        MontageViewerFragment montageViewerFragment;
        String quantityString;
        TextView textView;
        int i;
        AnimatedMediaPreprocessData animatedMediaPreprocessData;
        ?? r0 = this.A00;
        GOn.A1T((C2397Gbz) r0);
        C2397Gbz.A0g(r0);
        MontageCard montageCard = r0.A0P;
        if (montageCard.A02 == 3) {
            r0.A09.setVisibility(8);
        } else {
            boolean A0q = C2397Gbz.A0q(montageCard, r0);
            MontageCard montageCard2 = r0.A0P;
            if (A0q) {
                if (montageCard2 == null || montageCard2.A02().isEmpty() || (animatedMediaPreprocessData = 4YU.A0a(montageCard2.A02(), 0).A0M) == null || !"animated_sticker".equals(animatedMediaPreprocessData.A04) || !09K.A00(r0.A0P.A02()) || !0S2.A01.equals(((5HO) 4YU.A0p(r0.A0E)).BCH(4YU.A0a(r0.A0P.A02(), 0)).A02)) {
                    textView = r0.A09;
                    i = 2131960789;
                } else {
                    textView = r0.A09;
                    i = 2131960754;
                }
                textView.setText(i);
                r0.A09.setVisibility(0);
            } else {
                long j = montageCard2.A05;
                boolean z = r0.A0r;
                5Ou r02 = (5Ou) r0.A1g.get();
                if (z) {
                    A0J = r02.A0J(0S2.A0I, r0.A0P.A05);
                } else {
                    A0J = r02.A0J(0S2.A0K, j);
                    if (1BL.A08(r0.A1K) - r0.A0P.A05 <= 60000) {
                        A0J = r0.getString(2131960767);
                    }
                    MontageCard montageCard3 = r0.A0P;
                    if (montageCard3 != null && (contentAppAttribution = montageCard3.A00) != null && contentAppAttribution.A08 != null && !1JF.A0B(contentAppAttribution.A06)) {
                        A0J = 0Pz.A0j(A0J, " · ", r0.A0P.A00.A06);
                    }
                }
                r0.A09.setText(A0J);
                if (A0J != null && (length = A0J.length()) != 0 && (montageViewerFragment = r0.A0Q) != null && !montageViewerFragment.A0e && !r0.mRemoving && !r0.mDetached) {
                    if (A0J.equalsIgnoreCase(r0.getString(2131960767))) {
                        r0.A09.setContentDescription(A0J);
                    } else {
                        try {
                            int parseInt = Integer.parseInt(A0J.replaceAll("\\D", ""));
                            int i2 = length - 1;
                            if (A0J.codePointAt(i2) == 109) {
                                quantityString = 7zO.A0D((Fragment) r0).getQuantityString(2131820665, parseInt, Integer.valueOf(parseInt));
                            } else if (A0J.codePointAt(i2) == 104) {
                                quantityString = 7zO.A0D((Fragment) r0).getQuantityString(2131820664, parseInt, Integer.valueOf(parseInt));
                            }
                            r0.A09.setContentDescription(quantityString);
                        } catch (NumberFormatException e) {
                            0fH.A0p(C2397Gbz.__redex_internal_original_name, "Exception in setTimePostedAndElapsedContentDescriptionString", e);
                        }
                    }
                }
            }
        }
        r0.A0A.setVisibility(0);
        r0.A09.setVisibility(0);
        if (r0.A1m()) {
            return;
        }
        MontageCard montageCard4 = r0.A0P;
        if (montageCard4 == null || C48H.A01(montageCard4.A0H)) {
            r0.A0A.setOnClickListener(new IJw((C2397Gbz) r0, 0S2.A00));
            r0.A0g.setOnClickListener(new IJw((C2397Gbz) r0, 0S2.A01));
            r0.A09.setOnClickListener(new IJw((C2397Gbz) r0, 0S2.A0C));
        }
    }
}
