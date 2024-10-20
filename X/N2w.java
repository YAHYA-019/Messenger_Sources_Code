package X;

import com.facebook.composer.camera.logging.InspirationLoggingInfo;
import com.facebook.composer.focuspoint.model.ComposerFocusPoint;
import com.facebook.composer.media.ComposerMedia;
import com.facebook.composer.media.ComposerMediaLinkedReelMetaData;
import com.facebook.composer.media.ComposerMediaOverlayData;
import com.facebook.composer.mediaeffect.model.CreativeFactoryEditingData;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.facebook.inspiration.analytics.mediaaccuracy.model.MediaAccuracyMediaTranscodeParams;
import com.facebook.inspiration.model.InspirationGenAIMediaUploadInfo;
import com.facebook.inspiration.model.InspirationMultiCaptureState;
import com.facebook.ipc.composer.model.ComposerVideoPollData;
import com.facebook.ipc.inspiration.model.InspirationEditingData;
import com.facebook.ipc.inspiration.model.InspirationMediaState;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.CreativeEditingData;
import com.facebook.video.creativeediting.model.VideoCreativeEditingData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N2w.class */
public final class N2w {
    public int A00;
    public InspirationLoggingInfo A01;
    public ComposerFocusPoint A02;
    public ComposerMediaLinkedReelMetaData A03;
    public ComposerMediaOverlayData A04;
    public CreativeFactoryEditingData A05;
    public GraphQLTextWithEntities A06;
    public MediaAccuracyMediaTranscodeParams A07;
    public InspirationGenAIMediaUploadInfo A08;
    public InspirationMultiCaptureState A09;
    public ComposerVideoPollData A0A;
    public InspirationEditingData A0B;
    public InspirationMediaState A0C;
    public MediaData A0D;
    public CreativeEditingData A0E;
    public MT5 A0F;
    public VideoCreativeEditingData A0G;
    public ImmutableList A0H;
    public ImmutableList A0I;
    public ImmutableList A0J;
    public ImmutableList A0K;
    public ImmutableList A0L;
    public ImmutableList A0M;
    public ImmutableList A0N;
    public ImmutableMap A0O;
    public Boolean A0P;
    public Boolean A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public Set A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;

    public N2w() {
        this.A0b = AnonymousClass001.A0v();
        this.A0H = ImmutableList.of();
        this.A0O = RegularImmutableMap.A03;
        this.A0I = ImmutableList.of();
        this.A0J = ImmutableList.of();
        this.A0K = ImmutableList.of();
        this.A0L = ImmutableList.of();
        this.A0M = ImmutableList.of();
        this.A0N = ImmutableList.of();
        this.A0a = "standard";
    }

    public N2w(ComposerMedia composerMedia) {
        this.A0b = AnonymousClass001.A0v();
        composerMedia.getClass();
        this.A0R = composerMedia.A0R;
        this.A0S = composerMedia.A0S;
        this.A0P = composerMedia.A0P;
        this.A0T = composerMedia.A0T;
        this.A06 = composerMedia.A06;
        this.A0Q = composerMedia.A0Q;
        this.A0H = composerMedia.A0H;
        this.A0E = composerMedia.A0E;
        this.A05 = composerMedia.A05;
        this.A0U = composerMedia.A0U;
        this.A0O = composerMedia.A0O;
        this.A0I = composerMedia.A0I;
        this.A0c = composerMedia.A0c;
        this.A0d = composerMedia.A0d;
        this.A02 = composerMedia.A02;
        this.A08 = composerMedia.A08;
        this.A0V = composerMedia.A0V;
        this.A00 = composerMedia.A00;
        this.A0B = composerMedia.A0B;
        this.A01 = composerMedia.A01;
        this.A0C = composerMedia.A0C;
        this.A09 = composerMedia.A09;
        this.A0e = composerMedia.A0e;
        this.A0f = composerMedia.A0f;
        this.A0g = composerMedia.A0g;
        this.A03 = composerMedia.A03;
        this.A0W = composerMedia.A0W;
        this.A07 = composerMedia.A07;
        this.A0D = composerMedia.A0D;
        this.A0X = composerMedia.A0X;
        this.A04 = composerMedia.A04;
        this.A0Y = composerMedia.A0Y;
        this.A0J = composerMedia.A0J;
        this.A0F = composerMedia.A0F;
        this.A0K = composerMedia.A0K;
        this.A0Z = composerMedia.A0Z;
        this.A0L = composerMedia.A0L;
        this.A0M = composerMedia.A0M;
        this.A0G = composerMedia.A0G;
        this.A0N = composerMedia.A0N;
        this.A0A = composerMedia.A0A;
        this.A0a = composerMedia.A0a;
        this.A0b = AbF.A1E(composerMedia.A0b);
    }

    public void A00(GraphQLTextWithEntities graphQLTextWithEntities) {
        this.A06 = graphQLTextWithEntities;
        C1pq.A08("caption", graphQLTextWithEntities);
        if (this.A0b.contains("caption")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0b);
        this.A0b = A1E;
        A1E.add("caption");
    }

    public void A01(MediaData mediaData) {
        this.A0D = mediaData;
        C1pq.A08("mediaData", mediaData);
        if (this.A0b.contains("mediaData")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0b);
        this.A0b = A1E;
        A1E.add("mediaData");
    }

    public void A02(ImmutableList immutableList) {
        this.A0J = immutableList;
        C1pq.A08("redoStack", immutableList);
    }

    public void A03(ImmutableList immutableList) {
        this.A0L = immutableList;
        C1pq.A08("undoStack", immutableList);
    }
}
