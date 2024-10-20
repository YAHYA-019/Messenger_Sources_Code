package X;

import com.facebook.inspiration.genai.aienhance.model.InspirationAiEnhanceData;
import com.facebook.inspiration.magicmontage.model.InspirationMagicMontageData;
import com.facebook.inspiration.model.InspirationAIBackdropData;
import com.facebook.inspiration.model.InspirationAIExpanderData;
import com.facebook.inspiration.model.InspirationAiImagineData;
import com.facebook.inspiration.model.InspirationEffectWithSource;
import com.facebook.inspiration.model.InspirationMagicModState;
import com.facebook.inspiration.model.InspirationVideoEditingData;
import com.facebook.inspiration.model.movableoverlay.InspirationDoodleParams;
import com.facebook.inspiration.model.movableoverlay.InspirationPollInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationTextState;
import com.facebook.inspiration.model.pagescta.InspirationPagesCtaParams;
import com.facebook.inspiration.smarteditor.api.model.SmartEditData;
import com.facebook.ipc.inspiration.model.InspirationBackupEditingData;
import com.facebook.ipc.inspiration.model.InspirationEditingData;
import com.facebook.ipc.inspiration.model.InspirationProcessedMediaData;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N3U.class */
public final class N3U {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public InspirationAiEnhanceData A05;
    public InspirationMagicMontageData A06;
    public InspirationAIBackdropData A07;
    public InspirationAIExpanderData A08;
    public InspirationAiImagineData A09;
    public QoX A0A;
    public InspirationEffectWithSource A0B;
    public InspirationEffectWithSource A0C;
    public InspirationEffectWithSource A0D;
    public InspirationMagicModState A0E;
    public InspirationVideoEditingData A0F;
    public InspirationDoodleParams A0G;
    public InspirationPollInfo A0H;
    public InspirationTextState A0I;
    public InspirationPagesCtaParams A0J;
    public SmartEditData A0K;
    public InspirationBackupEditingData A0L;
    public InspirationBackupEditingData A0M;
    public InspirationBackupEditingData A0N;
    public InspirationProcessedMediaData A0O;
    public InspirationProcessedMediaData A0P;
    public InspirationZoomCropParams A0Q;
    public EKy A0R;
    public MediaData A0S;
    public PersistableRect A0T;
    public ImmutableList A0U;
    public ImmutableList A0V;
    public ImmutableList A0W;
    public ImmutableList A0X;
    public ImmutableMap A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public Set A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;

    public N3U() {
        this.A0e = AnonymousClass001.A0v();
        this.A0U = ImmutableList.of();
        this.A0W = ImmutableList.of();
        this.A0X = ImmutableList.of();
    }

    public N3U(NAq nAq) {
        this.A0e = AnonymousClass001.A0v();
        nAq.getClass();
        if (nAq instanceof InspirationEditingData) {
            InspirationEditingData inspirationEditingData = (InspirationEditingData) nAq;
            this.A05 = inspirationEditingData.A05;
            this.A0B = inspirationEditingData.A0B;
            this.A0C = inspirationEditingData.A0C;
            this.A0U = inspirationEditingData.A0U;
            this.A0Z = inspirationEditingData.A0Z;
            this.A0L = inspirationEditingData.A0L;
            this.A0V = inspirationEditingData.A0V;
            this.A0A = inspirationEditingData.A0A;
            this.A0M = inspirationEditingData.A0M;
            this.A0a = inspirationEditingData.A0a;
            this.A00 = inspirationEditingData.A00;
            this.A01 = inspirationEditingData.A01;
            this.A07 = inspirationEditingData.A07;
            this.A08 = inspirationEditingData.A08;
            this.A0W = inspirationEditingData.A0W;
            this.A09 = inspirationEditingData.A09;
            this.A0G = inspirationEditingData.A0G;
            this.A0E = inspirationEditingData.A0E;
            this.A0X = inspirationEditingData.A0X;
            this.A0J = inspirationEditingData.A0J;
            this.A0H = inspirationEditingData.A0H;
            this.A0O = inspirationEditingData.A0O;
            this.A0Y = inspirationEditingData.A0Y;
            this.A0I = inspirationEditingData.A0I;
            this.A0F = inspirationEditingData.A0F;
            this.A0Q = inspirationEditingData.A0Q;
            this.A0f = inspirationEditingData.A0f;
            this.A0g = inspirationEditingData.A0g;
            this.A0h = inspirationEditingData.A0h;
            this.A0P = inspirationEditingData.A0P;
            this.A0N = inspirationEditingData.A0N;
            this.A06 = inspirationEditingData.A06;
            this.A0T = inspirationEditingData.A0T;
            this.A0R = inspirationEditingData.A0R;
            this.A0b = inspirationEditingData.A0b;
            this.A0S = inspirationEditingData.A0S;
            this.A0c = inspirationEditingData.A0c;
            this.A02 = inspirationEditingData.A02;
            this.A03 = inspirationEditingData.A03;
            this.A0d = inspirationEditingData.A0d;
            this.A04 = inspirationEditingData.A04;
            this.A0D = inspirationEditingData.A0D;
            this.A0K = inspirationEditingData.A0K;
            this.A0e = AbF.A1E(inspirationEditingData.A0e);
            return;
        }
        InspirationEditingData inspirationEditingData2 = (InspirationEditingData) nAq;
        this.A05 = inspirationEditingData2.A05;
        this.A0B = inspirationEditingData2.A0B;
        this.A0C = inspirationEditingData2.A0C;
        ImmutableList immutableList = inspirationEditingData2.A0U;
        this.A0U = immutableList;
        C1pq.A08("appliedPrecaptureInspirationModels", immutableList);
        this.A0Z = inspirationEditingData2.A0Z;
        this.A0L = inspirationEditingData2.A0L;
        this.A0V = inspirationEditingData2.A0V;
        QoX Af4 = nAq.Af4();
        this.A0A = Af4;
        C1pq.A08("cropMode", Af4);
        A00(this, "cropMode");
        this.A0M = inspirationEditingData2.A0M;
        this.A0a = inspirationEditingData2.A0a;
        this.A00 = inspirationEditingData2.A00;
        this.A01 = inspirationEditingData2.A01;
        this.A07 = inspirationEditingData2.A07;
        this.A08 = inspirationEditingData2.A08;
        ImmutableList immutableList2 = inspirationEditingData2.A0W;
        this.A0W = immutableList2;
        C1pq.A08("inspirationAddYoursTemplateOverlayParams", immutableList2);
        this.A09 = inspirationEditingData2.A09;
        A01(nAq.Ar6());
        this.A0E = inspirationEditingData2.A0E;
        A04(inspirationEditingData2.A0X);
        this.A0J = inspirationEditingData2.A0J;
        this.A0H = inspirationEditingData2.A0H;
        this.A0O = inspirationEditingData2.A0O;
        this.A0Y = inspirationEditingData2.A0Y;
        A02(nAq.ArM());
        this.A0F = inspirationEditingData2.A0F;
        this.A0Q = inspirationEditingData2.A0Q;
        this.A0f = inspirationEditingData2.A0f;
        this.A0g = inspirationEditingData2.A0g;
        this.A0h = inspirationEditingData2.A0h;
        this.A0P = inspirationEditingData2.A0P;
        this.A0N = inspirationEditingData2.A0N;
        this.A06 = inspirationEditingData2.A06;
        A03(nAq.Aw4());
        EKy AwR = nAq.AwR();
        this.A0R = AwR;
        C1pq.A08("mediaTypeGeneratedFromPhoto", AwR);
        A00(this, "mediaTypeGeneratedFromPhoto");
        this.A0b = inspirationEditingData2.A0b;
        this.A0S = inspirationEditingData2.A0S;
        this.A0c = inspirationEditingData2.A0c;
        this.A02 = inspirationEditingData2.A02;
        this.A03 = inspirationEditingData2.A03;
        this.A0d = inspirationEditingData2.A0d;
        this.A04 = inspirationEditingData2.A04;
        InspirationEffectWithSource B9g = nAq.B9g();
        this.A0D = B9g;
        C1pq.A08("selectedEffectCopyForUndo", B9g);
        A00(this, "selectedEffectCopyForUndo");
        this.A0K = inspirationEditingData2.A0K;
    }

    public static void A00(N3U n3u, String str) {
        if (n3u.A0e.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(n3u.A0e);
        n3u.A0e = A1E;
        A1E.add(str);
    }

    public void A01(InspirationDoodleParams inspirationDoodleParams) {
        this.A0G = inspirationDoodleParams;
        C1pq.A08("inspirationDoodleParams", inspirationDoodleParams);
        A00(this, "inspirationDoodleParams");
    }

    public void A02(InspirationTextState inspirationTextState) {
        this.A0I = inspirationTextState;
        C1pq.A08("inspirationTextState", inspirationTextState);
        A00(this, "inspirationTextState");
    }

    public void A03(PersistableRect persistableRect) {
        this.A0T = persistableRect;
        C1pq.A08("mediaCropBox", persistableRect);
        A00(this, "mediaCropBox");
    }

    public void A04(ImmutableList immutableList) {
        this.A0X = immutableList;
        C1pq.A08("inspirationMovableOverlayParams", immutableList);
    }
}
