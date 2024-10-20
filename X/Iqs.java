package X;

import com.facebook.messaging.montage.forked.model.viewer.PollVoteResults;
import com.facebook.messaging.montage.forked.model.viewer.StoryFeedbackDiskCacheModel;
import com.facebook.messaging.montage.forked.model.viewer.ViewerPollVoteInfo;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: Iqs.class */
public final class Iqs implements Runnable {
    public static final String __redex_internal_original_name = "StoryFeedbackStore$2";
    public final /* synthetic */ I2m A00;

    public Iqs(I2m i2m) {
        this.A00 = i2m;
    }

    @Override // java.lang.Runnable
    public void run() {
        I2m i2m = this.A00;
        C00i c00i = i2m.A03;
        FbSharedPreferences A0R = 1BK.A0R(c00i);
        C00i c00i2 = i2m.A05;
        String BD0 = A0R.BD0(((HyP) c00i2.get()).A01);
        if (BD0 != null) {
            try {
                StoryFeedbackDiskCacheModel storyFeedbackDiskCacheModel = (StoryFeedbackDiskCacheModel) ((AnonymousClass244) i2m.A04.get()).A0U(StoryFeedbackDiskCacheModel.class, BD0.getBytes());
                if (storyFeedbackDiskCacheModel != null) {
                    HashMap A0u = AnonymousClass001.A0u();
                    HashMap A0u2 = AnonymousClass001.A0u();
                    HashMap A0u3 = AnonymousClass001.A0u();
                    HashMap A0u4 = AnonymousClass001.A0u();
                    1Du it = storyFeedbackDiskCacheModel.A03.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass001.A0Q("getQuizId");
                    }
                    1Du it2 = storyFeedbackDiskCacheModel.A02.iterator();
                    while (it2.hasNext()) {
                        ViewerPollVoteInfo viewerPollVoteInfo = (ViewerPollVoteInfo) it2.next();
                        if (((C0dp) i2m.A01.get()).now() <= viewerPollVoteInfo.A02 * 1000) {
                            A0u2.put(viewerPollVoteInfo.A03, viewerPollVoteInfo);
                        }
                    }
                    1Du it3 = storyFeedbackDiskCacheModel.A01.iterator();
                    while (it3.hasNext()) {
                        PollVoteResults pollVoteResults = (PollVoteResults) it3.next();
                        if (((C0dp) i2m.A01.get()).now() <= pollVoteResults.A00 * 1000) {
                            A0u3.put(pollVoteResults.A02, pollVoteResults);
                        }
                    }
                    1Du it4 = storyFeedbackDiskCacheModel.A00.iterator();
                    if (it4.hasNext()) {
                        it4.next();
                        i2m.A01.get();
                        throw AnonymousClass001.A0Q("getExpirationTime");
                    }
                    i2m.A09.putAll(A0u);
                    i2m.A08.putAll(A0u2);
                    i2m.A07.putAll(A0u3);
                    i2m.A06.putAll(A0u4);
                }
            } catch (IOException e) {
                1Ql A0V = 1BL.A0V(c00i);
                A0V.CaL(((HyP) c00i2.get()).A01, (String) null);
                A0V.commit();
                1BK.A09(i2m.A02).D13("StoryFeedbackStore", e);
            }
        }
    }
}
