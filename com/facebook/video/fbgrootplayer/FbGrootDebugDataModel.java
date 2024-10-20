package com.facebook.video.fbgrootplayer;

import X.03Y;
import X.11T;
import X.1Du;
import X.1Fj;
import X.6Tb;
import X.AnonymousClass001;
import X.GR4;
import X.GRD;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* loaded from: FbGrootDebugDataModel.class */
public final class FbGrootDebugDataModel {
    public final boolean isDeviceCasting;
    public final boolean isFromDialogOpen;
    public final boolean isInFullscreen = false;
    public final boolean isInGrootFullscreen = false;
    public String lastActivePlayerOrigin;
    public String lastActiveVideoId;
    public final ImmutableList transitionNodes;
    public final ImmutableList videoStates;

    /* loaded from: FbGrootDebugDataModel$Player.class */
    public final class Player {
        public final String eventBus;
        public final String grootPlayerId;
        public final String heroPlayerId;
        public final String playbackState;
        public final String playerContainer;
        public final List playerEvents;
        public final String playerForceTextureViewMatchParent;
        public final String playerFormat;
        public final String playerId;
        public final String playerOrigin;
        public final String playerReleased;
        public final String playerViewState;
        public final String surfaceId;
        public final String surfaceState;
        public final String videoId;

        public Player(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list) {
            this.playerId = str;
            this.playerOrigin = str2;
            this.playerFormat = str3;
            this.grootPlayerId = str4;
            this.heroPlayerId = str5;
            this.playbackState = str6;
            this.eventBus = str7;
            this.surfaceState = str8;
            this.playerViewState = str9;
            this.playerContainer = str10;
            this.surfaceId = str11;
            this.videoId = str12;
            this.playerReleased = str13;
            this.playerForceTextureViewMatchParent = str14;
            this.playerEvents = list;
        }
    }

    public FbGrootDebugDataModel(6Tb r302) {
        String str;
        ImmutableList of;
        this.isDeviceCasting = r302.A0G.get();
        GR4 gr4 = (GR4) r302.A0H.get();
        if (gr4 != null) {
            this.lastActiveVideoId = gr4.A01;
            str = gr4.A00.toString();
        } else {
            str = "";
            this.lastActiveVideoId = str;
        }
        this.lastActivePlayerOrigin = str;
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        1Du it = r302.A0A().iterator();
        while (it.hasNext()) {
            GRD grd = (GRD) it.next();
            11T.A0D(grd);
            builder.m11011add((Object) A00(grd));
        }
        LinkedList linkedList = r302.A0F;
        if (linkedList == null || linkedList.isEmpty()) {
            of = ImmutableList.of();
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj : linkedList) {
                if (obj instanceof 03Y) {
                    A0s.add(obj);
                }
            }
            of = ImmutableList.copyOf((Collection) A0s);
        }
        11T.A0D(of);
        1Du it2 = of.iterator();
        while (it2.hasNext()) {
            builder2.m11011add((Object) A00((GRD) ((03Y) it2.next()).second));
        }
        this.videoStates = 1Fj.A01(builder);
        this.transitionNodes = 1Fj.A01(builder2);
        this.isFromDialogOpen = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r306 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r308 == null) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.HEy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.video.fbgrootplayer.FbGrootDebugDataModel.State A00(X.GRD r301) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.fbgrootplayer.FbGrootDebugDataModel.A00(X.GRD):com.facebook.video.fbgrootplayer.FbGrootDebugDataModel$State");
    }
}
