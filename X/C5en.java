package X;

import android.graphics.RectF;
import android.net.Uri;
import com.facebook.messaging.audio.transcriptions.model.MessageTranscription;
import com.facebook.messaging.memories.share.MemoryShareMetadata;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.spherical.photo.metadata.SphericalPhotoMetadata;
import com.facebook.ui.media.attachments.model.AnimatedMediaPreprocessData;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.model.MediaUploadResult;
import com.facebook.ui.media.attachments.model.ProgressiveJpegResult;
import com.facebook.ui.media.attachments.model.music.MusicMetaData;
import com.facebook.ui.media.attachments.source.MediaResourceCameraPosition;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.facebook.xapp.messaging.threadview.model.audio.WaveformData;
import com.facebook.xapp.messaging.threadview.model.highlightstab.HighlightsTabMetadata;
import com.google.common.collect.ImmutableMap;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.5en, reason: invalid class name */
/* loaded from: 5en.class */
public final class C5en {
    public int A00;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public Uri A0B;
    public Uri A0C;
    public Uri A0D;
    public MessageTranscription A0G;
    public MemoryShareMetadata A0H;
    public ContentAppAttribution A0I;
    public ThreadKey A0J;
    public SphericalPhotoMetadata A0K;
    public AnimatedMediaPreprocessData A0L;
    public 5HP A0P;
    public MediaResource A0Q;
    public MediaUploadResult A0R;
    public ProgressiveJpegResult A0S;
    public MusicMetaData A0T;
    public WaveformData A0W;
    public HighlightsTabMetadata A0X;
    public Float A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public java.util.Map A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public Uri A0E = Uri.EMPTY;
    public C5ep A0N = C5ep.A0R;
    public C5eq A0M = C5eq.OTHER;
    public 0OO A0F = 0OO.A09;
    public RectF A0A = MediaResource.A18;
    public int A02 = -1;
    public int A01 = -2;
    public String A0g = "";
    public MediaResourceSendSource A0V = MediaResourceSendSource.A03;
    public MediaResourceCameraPosition A0U = MediaResourceCameraPosition.A01;
    public C5ew A0O = C5ew.DEFAULT;

    public C5en() {
        long j = -1;
        this.A06 = j;
        this.A05 = j;
    }

    public static C5en A00() {
        Comparator comparator = MediaResource.A19;
        return new C5en();
    }

    public void A01(MediaResource mediaResource) {
        this.A09 = mediaResource.A09;
        this.A0P = mediaResource.A0Q;
        this.A0E = mediaResource.A0E;
        this.A0Q = mediaResource.A0R;
        this.A08 = mediaResource.A08;
        this.A04 = mediaResource.A04;
        this.A00 = mediaResource.A00;
        this.A03 = mediaResource.A03;
        this.A0N = mediaResource.A0O;
        this.A0a = mediaResource.A0c;
        this.A0o = mediaResource.A0q;
        this.A0n = mediaResource.A0p;
        this.A0d = mediaResource.A0f;
        this.A0M = mediaResource.A0N;
        this.A0F = mediaResource.A0F;
        this.A0y = mediaResource.A0z;
        this.A0C = mediaResource.A0C;
        this.A0b = mediaResource.A0d;
        this.A0s = mediaResource.A0u;
        this.A0r = mediaResource.A0t;
        this.A0J = mediaResource.A0J;
        this.A0q = mediaResource.A0s;
        this.A07 = mediaResource.A07;
        this.A0l = mediaResource.A0n;
        this.A0D = mediaResource.A0D;
        this.A0S = mediaResource.A0T;
        this.A0A = mediaResource.A0A;
        this.A0z = mediaResource.A10;
        this.A16 = mediaResource.A17;
        this.A02 = mediaResource.A02;
        this.A01 = mediaResource.A01;
        this.A0R = mediaResource.A0S;
        this.A0w = mediaResource.A0x;
        ImmutableMap immutableMap = mediaResource.A0Z;
        java.util.Map map = this.A0v;
        if (map != null && !map.isEmpty()) {
            this.A0v.clear();
        }
        if (immutableMap != null && !immutableMap.isEmpty()) {
            java.util.Map map2 = this.A0v;
            if (map2 == null) {
                map2 = new HashMap();
                this.A0v = map2;
            }
            map2.putAll(immutableMap);
        }
        this.A0I = mediaResource.A0I;
        this.A0B = mediaResource.A0B;
        this.A11 = mediaResource.A12;
        this.A06 = mediaResource.A06;
        this.A05 = mediaResource.A05;
        this.A13 = mediaResource.A14;
        this.A12 = mediaResource.A13;
        this.A0g = mediaResource.A0i;
        this.A0j = mediaResource.A0l;
        this.A0V = mediaResource.A0W;
        this.A0U = mediaResource.A0V;
        this.A0h = mediaResource.A0j;
        this.A0O = mediaResource.A0P;
        this.A0K = mediaResource.A0L;
        this.A15 = mediaResource.A16;
        this.A0t = mediaResource.A0v;
        this.A0f = mediaResource.A0h;
        this.A0p = mediaResource.A0r;
        this.A0L = mediaResource.A0M;
        this.A0T = mediaResource.A0U;
        this.A0W = mediaResource.A0X;
        this.A0Z = mediaResource.A0b;
        this.A0u = mediaResource.A0w;
        this.A0G = mediaResource.A0G;
        this.A0c = mediaResource.A0e;
        this.A0m = mediaResource.A0o;
        this.A0x = mediaResource.A0y;
        this.A10 = mediaResource.A11;
        this.A14 = mediaResource.A15;
        this.A0H = mediaResource.A0H;
        this.A0i = mediaResource.A0k;
    }
}
