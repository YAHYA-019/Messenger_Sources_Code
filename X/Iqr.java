package X;

import com.facebook.messaging.montage.forked.model.viewer.StoryFeedbackDiskCacheModel;
import com.google.common.collect.ImmutableList;

/* loaded from: Iqr.class */
public final class Iqr implements Runnable {
    public static final String __redex_internal_original_name = "StoryFeedbackStore$1";
    public final /* synthetic */ I2m A00;

    public Iqr(I2m i2m) {
        this.A00 = i2m;
    }

    @Override // java.lang.Runnable
    public void run() {
        I2m i2m = this.A00;
        synchronized (i2m) {
            if (i2m.A00) {
                i2m.A00 = false;
                try {
                    ImmutableList.of();
                    ImmutableList.of();
                    ImmutableList.of();
                    ImmutableList of = ImmutableList.of();
                    ImmutableList copyOf = ImmutableList.copyOf(i2m.A08.values());
                    C1pq.A08("viewerPollVoteInfoList", copyOf);
                    ImmutableList copyOf2 = ImmutableList.copyOf(i2m.A07.values());
                    C1pq.A08("pollVoteResultsList", copyOf2);
                    ImmutableList copyOf3 = ImmutableList.copyOf(i2m.A06.values());
                    C1pq.A08("lightWeightReactionModels", copyOf3);
                    byte[] A0b = ((AnonymousClass244) i2m.A04.get()).A0b(new StoryFeedbackDiskCacheModel(copyOf3, copyOf2, copyOf, of));
                    if (A0b.length != 0) {
                        1Ql A0V = 1BL.A0V(i2m.A03);
                        A0V.CaL(((HyP) i2m.A05.get()).A01, GOn.A1D(A0b));
                        A0V.commit();
                    }
                } catch (2LD e) {
                    1BK.A09(i2m.A02).D13("StoryFeedbackStore", e);
                }
            }
        }
    }
}
