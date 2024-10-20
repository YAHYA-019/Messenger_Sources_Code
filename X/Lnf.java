package X;

import com.facebook.messaging.presence.plugins.core.communitythreadsubtitledata.CommunityPresenceThreadSubtitleData;

/* loaded from: Lnf.class */
public final class Lnf implements Runnable {
    public static final String __redex_internal_original_name = "CommunityPresenceThreadSubtitleData$getAggregatedActiveCountFromChannelTable$1$1";
    public final /* synthetic */ CommunityPresenceThreadSubtitleData A00;
    public final /* synthetic */ JuP A01;

    public Lnf(CommunityPresenceThreadSubtitleData communityPresenceThreadSubtitleData, JuP juP) {
        this.A00 = communityPresenceThreadSubtitleData;
        this.A01 = juP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CommunityPresenceThreadSubtitleData communityPresenceThreadSubtitleData = this.A00;
        JuP juP = this.A01;
        synchronized (communityPresenceThreadSubtitleData) {
            if (communityPresenceThreadSubtitleData.A00) {
                if (1Br.A00(communityPresenceThreadSubtitleData.A02) >= ((1qX) juP).mResultSet.getLong(0, 1)) {
                    communityPresenceThreadSubtitleData.A07.A03((Object) null, "communityPresence");
                } else {
                    communityPresenceThreadSubtitleData.A07.A03(Long.valueOf(((1qX) juP).mResultSet.getLong(0, 0)), "communityPresence");
                }
            }
        }
    }
}
